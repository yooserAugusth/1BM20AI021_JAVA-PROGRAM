public interface Area {

	public double getArea();
}

interface Volume {

	public double getVolume();
}

class Circle extends Shape implements Area {
	private double RADIUS;

	public Circle(double r, String n) {
		super(n);
		this.RADIUS = r;
	}

	public double getRADIUS() {
		return RADIUS;
	}

	
	public double getArea() {
		return (Math.PI * this.RADIUS * this.RADIUS);
	}
}

class Cube extends Square implements Volume {
	public Cube(double s, String n) {
		super(s, n);
	}

	
	public double getVolume() {
		return (super.getSIDE() * super.getSIDE() * super.getSIDE());
	}
}

class Cylinder extends Circle implements Volume {
	private double HEIGHT;

	public Cylinder(double height, double r, String n) {
		super(r, n);
		this.HEIGHT = height;
	}

	public double getHEIGHT() {
		return HEIGHT;
	}

	public double getVolume() {
		return (super.getArea() * this.HEIGHT);
	}
}

class Glome extends Sphere implements Volume {
	public Glome(double r, String n) {
		super(r, n);
	}

	
	public double getVolume() {
		return (0.5 * super.getArea() * super.getArea());
	}
}

class Shape {
	private String NAME;

	public Shape(String s) {
		this.NAME = s;
	}

	public String getNAME() {
		return NAME;
	}
}

class Sphere extends Circle implements Volume {
	public Sphere(double r, String n) {
		super(r, n);
	}

	
	public double getVolume() {
		return (4 / 3 * super.getArea() * super.getRADIUS());
	}
}

class Square extends Shape implements Area {
	private double SIDE;

	public Square(double side, String n) {
		super(n);
		this.SIDE = side;
	}

	public double getSIDE() {
		return SIDE;
	}

	
	public double getArea() {
		return (this.getSIDE() * this.getSIDE());
	}
}

class test {
	public static void main(String[] args) {
		Circle C = new Circle(5, "Circle1");
		Cube Cu = new Cube(3, "Cube1");
		Cylinder Cy = new Cylinder(7, 6, "Cylinder1");
		Sphere S = new Sphere(8, "Sphere1");
		Square Sq = new Square(6, "Square1");
		Glome G = new Glome(9, "Glome1");

		System.out.println(C.getNAME() + " has Radius:" + C.getRADIUS() + ", Area:" + C.getArea());
		System.out.println(Cu.getNAME() + " has Radius:" + Cu.getSIDE() + ", Volume:" + Cu.getVolume());
		System.out.println(Cy.getNAME() + " has Height:" + Cy.getHEIGHT() + ",Radius:" + Cy.getRADIUS() + ", Volume:"
				+ Cy.getVolume());
		System.out.println(S.getNAME() + " has Radius:" + S.getRADIUS() + ", Volume:" + S.getVolume());
		System.out.println(Sq.getNAME() + " has Side:" + Sq.getSIDE() + ", Area:" + Sq.getArea());
		System.out.println(G.getNAME() + " has Radius:" + G.getRADIUS() + ", Volume:" + G.getVolume());
	}
}
