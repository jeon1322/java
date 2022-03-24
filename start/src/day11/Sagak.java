package day11;

public class Sagak extends Figure {
	private int width, height;
	
	public Sagak() {
	}
	public Sagak(int widht, int height) {
		this.width = widht;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
