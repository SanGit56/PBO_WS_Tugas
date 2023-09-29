package shape;

public class Polymorph {
	public static void main(String[] args) {
		Circle lingkaran = new Circle(6, 6);
		Square kotak = new Square(5, 5);
		Triangle segitiga = new Triangle(4, 6);
		Sphere sfera = new Sphere(6, 6, 6);
		Cube kubus = new Cube(5, 5, 5);
		Tetrahedron limas = new Tetrahedron(6, 6, 6);
		
		Shape[] bentuk = new Shape[6];
		bentuk[0] = lingkaran;
		bentuk[1] = kotak;
		bentuk[2] = segitiga;
		bentuk[3] = sfera;
		bentuk[4] = kubus;
		bentuk[5] = limas;
		
		for (int i=0;i<6;i++) {
			System.out.println(bentuk[i]);
		}
	}
}