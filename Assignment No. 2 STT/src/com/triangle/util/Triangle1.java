package com.triangle.util;
import java.security.PublicKey;
import java.util.*;


public class Triangle1 {


	private int s1, s2, s3;
	private Type kind;
	
	public Triangle1() {
		this.s1 = 0;
		this.s2 = 0;
		this.s3 = 0;
		
		this.kind = Type.BADSIDE;
	}

	public Triangle1(int s1, int s2, int s3) {
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
						if(s1 == s2 && s2 != s3 && s1 != s3) {
						return Type.SCALENE;
						}
						else {
							return Type.BADSIDE;
						}
					}
				}
			}

		}
	}

	

	public static void main(String[] args) {


	}

}
