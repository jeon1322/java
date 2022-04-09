package jdbc;

import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.*;

/*
	emp 테이블의 데이터를 조회하는데
	
	dno 라는 문자열을 입력받으면 
		부서번호를 입력받아서 해당 부서의 부서원들의 
			사원번호, 사원이름, 직급, 입사일, 급여, 부서번호, 부서이름, 부서위치
		출력해주고
	job 이라는 문자열을 입력받으면
		해당 직급을 가진 사원들의
			사원번호, 사원이름, 직급, 입사일, 급여, 급여등급, 커미션
		을 조회하도록 하고
		
	all 을 입력받으면 모든 사원들의
			사원번호, 사원이름, 직급, 입사일
		을 조회하는 프로그램을 작성하세요.
		
	단, exit 라는 단어가 입력되면 프로그램이 즉시 종료되게 하세요.
 */

/*
	이 클래스는 사용자가 어떤것을 입력하던지
	결국 오라클을 사용할 준비가 되어있어야 한다.
	따라서 이 클래스가 new 되는 순간 
	드라이버 로딩이 완료되면 편할것 같다.
 */
public class JdbcTest01 {
	public final int SEL_ALL 		= 0;
	public final int SEL_DNOINFO 	= 1;
	public final int SEL_JOBINFO 	= 2;
	
	// 작업에 필요한 변수 선언
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	EmpSQL eSQL;
	
	public JdbcTest01() {
		// 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			eSQL = new EmpSQL();
			getInput();
		} catch(Exception e) {
			System.out.println("### 서버 로딩 실패 ###");
		}
		
/*
		
		System.out.println(getSQL(this.SEL_ALL));
		System.out.println(getSQL(this.SEL_DNOINFO));
		System.out.println(getSQL(this.SEL_JOBINFO));
		String sql1 = getSQL(SEL_ALL);
		System.out.println(sql1);
		
		String sql2 = getSQL(SEL_DNOINFO);
		System.out.println(sql2);
		
		String sql3 = getSQL(SEL_JOBINFO);
		System.out.println(sql3);
*/
		
	}

	
	// 코드(정수)를 입력받으면 그 코드에 해당하는 질의명령을 반환해주는 함수
/*	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_DNOINFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.deptno = ? ");
			break;
		case SEL_JOBINFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm ");
			buff.append("FROM ");
			buff.append("	emp, salgrade ");
			buff.append("WHERE ");
			buff.append("	sal BETWEEN losal AND hisal ");
			buff.append("	AND job = ? ");
			break;
		}
	
		// buff에 담긴 내용을 문자열로 변환해서 반환해준다.
		return buff.toString();
	}
	*/
	// 문자열 입력받는 함수
	public void getInput() {
		// Scanner 를 이용해서 문자열을 입력받고
		// 각 문자열들마다 입력받을 내용도 또 받아서 실행시켜주는 함수
		
		// 작업 순서
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고
	while(true) {
		System.out.println("==============================================================================");
		System.out.print("부서번호로 조회 : dno\n직급으로 조회 : job\n모든사원조회 : all\n직급 종류조회 : list\n프로그램 종료 : exit\n명령 입력 : ");
		String str = sc.nextLine();
		
		switch(str) {
		case "dno":
			getDnoInfo(sc);
			break;
		case "job":
			getJobInfo(sc);
			break;
		case "all":
			getAll();
			break;
		case "list":
			getJobList();
			break;
		case "exit":
			System.out.println("종료 되었습니다.");
			return;
		}
	}
	}
//==============================================================
	public void getJobList() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
			// 질의명령 가져오고
			String sql = eSQL.getSQL(eSQL.SEL_JOBLIST);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("==============================================================================");
			while(rs.next()) {
				String job = rs.getString("job");
				System.out.print(job+"\t");
			}
			System.out.println();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
	
//==============================================================
	public void getDnoInfo(Scanner sc) {
		System.out.print("부서번호를 입력하세요! 이전단계는 -1을 입력하세요.\n부서번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		if(no == -1) {
			// 이 경우는 이전단계로 이동하길 원하는 경우이므로
			// 이 함수의 실행을 즉시 종료한다.
			return;
		}
		// 이 경우는 부서번호를 입력받은 경우이므로
		// 부서번호에 소속된 사원들의 정보를 조회하면 된다.
		try {
			// 따라서 데이터베이스에 접속하고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
			// 질의명령 가져오고
			String sql = eSQL.getSQL(eSQL.SEL_DNOINFO);
			// 명령전달도구 만들고
			//	<== 위에서 가져온 질의명령에는 ? 로 되어있는 부분을 데이터로 채워야하는
			//		불안전한 질의명령이다.
			//		이때 사용하는 명령 전달 도구는 PreparedSatement를 사용한다.
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);// 받는 값이 int라서 setInt
			// 질의명령을 완성하고
			// 질의명령 보내고 결과(ResultSet)받고
			rs = pstmt.executeQuery();
			// 꺼내서 출력하고
			while(rs.next()) {
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int dno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String date = form1.format(hdate)+ form2.format(htime);
				System.out.printf("%5d | %10s | %10s | %24s | %6d | %2d | %10s | %8s\n", 
											eno, name, job, date, sal, dno, dname, loc);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
//====================================================================
	public void getJobInfo(Scanner sc) {
		
		System.out.println("직급 종류\n1.CLERK\t\t2.SALESMAN\t3.PRESIDENT\t4.MANAGER\t5.ANALYST");
		System.out.print("찾을 직급을 입력하세요. 이전 단계는 '이전'을 입력하세요.\n직급 : ");
		String jobs = sc.nextLine();
		
		if(jobs.equals("이전")) {
			return;
		}
		// 데이터베이스작업
		try {
		// 커넥션꺼내오고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
		// 질의명령 가져오고
			String sql = eSQL.getSQL(eSQL.SEL_JOBINFO);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, jobs);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int rnk = rs.getInt("grade");
				String comm = rs.getString("comm");
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String date = form1.format(hdate)+ form2.format(htime);
				System.out.printf("%5d | %10s | %10s | %24s | %4d | %1d | %10s\n", 
						eno, name, job, date, sal, rnk, comm);
			}
	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
//=====================================================================
	// 모든 사원의 정보를 출력해주는 기능의 함수
	public void getAll() {
		
		// 할일
		try {
			// 이 함수에서는 데이터베이스에 연결해서
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
			// 질의명령 준비하고
			String sql = eSQL.getSQL(eSQL.SEL_ALL); // 질의명령 가져오고... 
	//		String sql = getSQL(SEL_ALL);
			// 명령전달 도구 준비
			stmt = con.createStatement();
			
			// 질의명령을 보내고 결과를 받아서
			rs = stmt.executeQuery(sql);
			// 결과를 출력해줘야한다.
			// 몇행을 꺼내왔는지 알수 없으므로
			while(rs.next()) {
				// empno, ename, job, hiredate
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				/*
					참고 ]
						JDBC에서는 데이터베이스에서 날짜데이터를 꺼내올때
						날짜와 시간을 따로 꺼내오도록 함수를 분리해서 만들어 놨다.
				 */
				// 날짜데이터
				Date hdate = rs.getDate("hiredate"); // 날짜만 꺼내오는 함수
				Time htime = rs.getTime("hiredate"); // 시간만 꺼내오는 함수
				/*
					날짜 데이터를 원하는 문자열로 바꿔주는 형식화 클래스
						SimpleDateFormat form = new SimpleDateFormat(날짜형식문자열);
						String sdate = form.format(hdate);
				 */
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				
				String sdate = form1.format(hdate) + form2.format(htime);
				
				// 출력
				System.out.printf("%5d | %10s | %10s | %24s\n", eno, name, job, sdate);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원 반환해주고
				rs.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new JdbcTest01();
	}

}
