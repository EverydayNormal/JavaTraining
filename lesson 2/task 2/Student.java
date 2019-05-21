
public class Student {
	
	public String name;
	public int mark;

	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String toString() {
		return name + " : " + mark;
	}

	public static void testStudent() {
		Student s1 = new Student("Alan", 5);
		Student s2 = new Student("Robb", 6);
		//System.out.println("\n***** Arithmetical Operators *****");
		// addition
		// c = s1 + s2;// is undefined for the argument type Student
		// c = s1 - s2;
		// c = s1 * s2;
		// c = s1 / s2;
		// c = s1 % s2;
		// c = s1 / 0;
		// c = s1 % 0;
		// unary minus
		// c = -s1; // is undefined for the argument type String
		// unary plus
		// c = +s1;// is undefined for the argument type String
		// prefix increment
		// System.out.printf("++%d = %d\n", s1, ++s1);
		// postfix increment
		// System.out.printf("%d++ = %d\n", s1, s1++);
		// prefix decrement
		// System.out.printf("--%d = %d\n", s1, --s1);
		// postfix decrement
		// System.out.printf("%d-- = %d\n", s1, s1--);
		// System.out.println("\n***** Bitwise Operators *****");
		// c = s1 & s2; //bitwise AND is undefined for the argument type String
		// c = s1 | s2; // bitwise OR
		// c = s1 ^ s2; // bitwise XOR
		// c = ~s1; // bitwise unary compliment
		// c = s1 << 1; // left shift
		// c = s1 >> 1; // right shift
		// c = s1 >> 1; // right shift
		// c = s1 >>> 1; // zero fill right shift
		// c = s1 >>> 1; // zero fill right shift System.out.printf("%d >>> 1 = %d\n",
		// s1, c);

		// System.out.println("\n***** Assignment Operators *****");
		// c = new Student("Mark", 4);
		// System.out.printf("%s += %s --> c = %s\n", c, s1, c += s1);
		// System.out.printf("%d -= %d --> c = %d\n", c, s1, c -= s1);
		// System.out.printf("%d *= %d --> c = %d\n", c, s1, c *= s1);
		// System.out.printf("%d /= %d --> c = %d\n", c, s1, c /= s1);
		// System.out.printf("%d %%= %d --> c = %d\n", c, s1, c %= s1);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		// System.out.printf("%d |= %d --> c = %d\n", c, s1, c |= s1);
		// System.out.printf("%d &= %d --> c = %d\n", c, s1, c &= s1);
		// System.out.printf("%d ^= %d --> c = %d\n", c, s1, c ^= s1);
		// System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		// System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		// System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
		System.out.println("\n***** Relational Operators *****");
		// greater than
		// System.out.printf("%d > %d --> %b\n", s1, s2, s1 > s2);
		// greater than or equal to
		// System.out.printf("%d >= %d --> %b\n", s1, s2, s1 >= s2);
		// less than
		// System.out.printf("%d < %d --> %b\n", s1, s2, s1 < s2);
		// less than or equal to
		// System.out.printf("%d <= %d --> %b\n", s1, s2, s1 <= s2);
		// equal to
		System.out.printf("%.4s == %.4s --> %b\n", s1, s2, s1 == s2);
		// not equal to
		System.out.printf("%.4s != %.4s --> %b\n", s1, s2, s1 != s2);
		System.out.println("\n***** Logical Operations *****");
		// logical AND
		System.out.printf("(%.4s == %.4s) && (%.4s != null) --> %b\n", s1, s2, s1, (s1 == s2) && (s1 != null));
		// bitwise logical AND
		// System.out.printf("(%d > %d) & (%d > 0) --> %b\n", s1, s2, s1, (s1 > s2) &
		// (s1 > 0));
		// logical OR
		System.out.printf("(%.4s == %.4s) || (%.4s != null) --> %b\n", s1, s2, s2, (s1 == s2) || (s1 != null));
		// || (s2 != 0));
		// bitwise logical OR
		// System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", s1, s2, s2, (s1 >= s2) |
		// (s2 != 0));
		// logical XOR
		// System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", s1, s2, s2, (s1 >= s2) ^
		// (s2 != 0));
		// logical NOT
		System.out.printf("!(%.4s == %.4s) --> %b\n", s1, s2, !(s1 == s2));
		System.out.println("\nCondition Operator:");
		System.out.printf("%.4s != %.4s ? %.4s : %.4s --> %.4s\n", s1, s2, s1, s2, (s1 != s2 ? s1 : s2));
		// System.out.println("\nType Cast Operator:");
		System.out.println("\nInstanceOf:");
		System.out.println("\nEqual to :");
		System.out.printf("%.4s equal to %.4s, equality --> %b\n", s1, s1, s1.equals(s1));
		System.out.println("\nNot qual to :");
		System.out.printf("%.4s not equal to %.4s, equality --> %b\n", s1, s2, s1.equals(s2));
	}

}
