package com.triangle.util;
import java.security.PublicKey;
import java.util.*;




public class Triangle {


	private int s1, s2, s3;
	private Type kind;
	
	public Triangle() {
		this.s1 = 0;
		this.s2 = 0;
		this.s3 = 0;
		
		this.kind = Type.BADSIDE;
	}

	public Triangle(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;

	}

	public static Type TriangleTest(int s1, int s2, int s3) {

		if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
			return Type.BADSIDE;
		} else {
			if ((s1 + s2 <= s3) || (s2 + s3 <= s1) || (s1 + s3 <= s2)) {
				return Type.NOTRIANGLE;
			} else {
				if (s1 == s2 && s2 == s3) {
					return Type.EQUILATERAL;
				} else {
					if (s1 == s2 || s2 == s3 || s1 == s3) {
						return Type.ISOSCELES;
					} else {
						return Type.SCALENE;
					}
				}
			}

		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Input the 3 sides of your Triangle");
//		System.out.println("-----------------------------------");
//		Scanner sc = new Scanner(System.in);
//
		
		int s1 = 0, s2 = 0, s3 = 0;
		Triangle triangle = new Triangle(s1,s2,s3);
		Triangle triangle2 = new Triangle();
		
		
		
		
		
		
		
		
		s1 = 3; s2 = 2; s3 = 4;
		System.out.println();
		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 1; s3 = 3;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 3; s3 = 1;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 3; s2 = 2; s3 = 1;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = -2; s2 = 1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = -2; s2 = 1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = -1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = -1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//	
		
//		if ((s1 + s2 <= s3) || (s2 + s3 <= s1) || (s1 + s3 <= s2)) {

//		s1 = 2; s2 = 1; s3 = -1;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		
//		s1 = -2; s2 = -1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = -2; s2 = 1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = -2; s2 = 1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = -1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = -1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 1; s3 = -5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 2; s2 = 1; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
////	
//		
//		
//		s1 = 3; s2 = 2; s3 = 1;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 6; s2 = 5; s3 = 4;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		
//		
//		s1 = 3; s2 = 5; s3 = 3;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		
//		s1 = 1; s2 = 6; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 4; s2 = 4; s3 = 4;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 3; s2 = 3; s3 = 5;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 5; s2 = 3; s3 = 3;
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
//		s1 = 5; s2 = 10; s3 = 7;
//
//		
//		System.out.println("Enter Side 1: ");
//		s1 = sc.nextInt();
//		System.out.println();
//		System.out.println("Enter Side 2: ");
//		s2 = sc.nextInt();
//
//		System.out.println("Enter Side 3: ");
//		s3 = sc.nextInt();
//
//		System.out.println("Side 1: " + s1);
//		System.out.println("Side 2: " + s2);
//		System.out.println("Side 3: " + s3);
		
		
		
//		System.out.println();
//		System.out.println("Triangle Type: " + TriangleTest(s1, s2, s3));
		

	}

}
