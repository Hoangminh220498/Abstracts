package advance.dev;

import java.util.Scanner;

public class MainApp {
	static Shape[] input() {
		Shape[] shape = new Shape[10];
		for (int i = 0; i < 3; i++) {
			System.out.printf("Nhap hinh tron thu %d\n",i);
			Scanner sc = new Scanner(System.in);
			System.out.println("Ten: ");
			String name = sc.next();
			System.out.println("Ban kinh:");
			double banKinh = sc.nextDouble();
			Circle cir = new Circle(name, banKinh);
			shape[i] = cir;
		}
		for (int i = 3; i < 6; i++) {
			System.out.printf("Nhap hinh chu nhat thu %d\n",i);
			Scanner sc = new Scanner(System.in);
			System.out.println("Ten: ");
			String name = sc.next();
			System.out.println("canhA:");
			double canhA = sc.nextDouble();
			System.out.println("canhB:");
			double canhB = sc.nextDouble();
			Rectangle rec = new Rectangle(name, canhA, canhB);
			shape[i] = rec;
		}
		for (int i = 6; i < 10; i++) {
			System.out.printf("Nhap hinh tam giac thu %d\n",i);
			Scanner sc = new Scanner(System.in);
			System.out.println("Ten: ");
			String name = sc.next();
			System.out.println("canhA:");
			double canhA = sc.nextDouble();
			System.out.println("canhB:");
			double canhB = sc.nextDouble();
			System.out.println("canhC:");
			double canhC = sc.nextDouble();
			Triangle tri = new Triangle(name, canhA, canhB, canhC);
			shape[i] = tri;
		}
		return shape;
	}
		static void print(Shape[] sha) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("Hinh tron %d: ",i);
				System.out.println(sha[i].toString());
			}
			for (int i = 3; i < 6; i++) {
				System.out.printf("Hinh chu nhat %d: ",i);
				System.out.println(sha[i].toString());		
			}
			for (int i = 6; i < 10; i++) {
				System.out.printf("Hinh tam giac %d: ",i);
				System.out.println(sha[i].toString());		
			}
		}
		// hình có diện tích lớn nhất
		static float finddienTich(Shape[] shape) {
			float maxShape = (float) shape[0].dienTich();
			for (int i = 0; i < 10; i++) {
				if(shape[i].dienTich() > maxShape) {
					maxShape = (float) shape[i].dienTich();
				}
			}
			return maxShape;
		}
		//hình tròn có diện tích lớn nhất
		static float findmaxCir(Shape[] cir) {
			float maxCir = (float) cir[0].dienTich();
			for (int i = 0; i < 3; i++) {
				if (cir[i].dienTich() > maxCir) {
					maxCir = (float) cir[i].dienTich();
				}
			}
			return maxCir;
		}
		//hình chu nhat có diện tích lớn nhất
		static float findmaxRec(Shape[] rec) {
			float maxRec = (float) rec[0].dienTich();
			for (int i = 3; i < 6; i++) {
				if (rec[i].dienTich() > maxRec) {
					maxRec = (float) rec[i].dienTich();
				}
			}
			return maxRec;
		}
		//hình tam giac có diện tích lớn nhất
		static float findmaxTri(Shape[] tri) {
			float maxTri = (float) tri[0].dienTich();
			for (int i = 6; i < 10; i++) {
				if (tri[i].dienTich() > maxTri) {
					maxTri = (float) tri[i].dienTich();
				}
			}
			return maxTri;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shape[] shape = new Shape[10];
			shape = input();
			print(shape);
			float maxShape = finddienTich(shape);
			System.out.printf("Hinh co dien tich lon nhat la: %f",maxShape);
			System.out.println();
			float maxCir = findmaxCir(shape);
			System.out.printf("Hinh tron co dien tich lon nhat la: %f",maxCir);
			System.out.println();
			float maxRec = findmaxCir(shape);
			System.out.printf("Hinh chu nhat co dien tich lon nhat la: %f",maxRec);
			System.out.println();
			float maxTri = findmaxCir(shape);
			System.out.printf("Hinh tam giac co dien tich lon nhat la: %f",maxTri);
		}

}
