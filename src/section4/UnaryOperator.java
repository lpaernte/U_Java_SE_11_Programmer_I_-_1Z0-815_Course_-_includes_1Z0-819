package section4;

public class UnaryOperator {

  public static void main(String[] args) {
    System.out.println("----------Test 1 ----------");
    int a = 0;
    // If you do no assignment and the operator is not participating
    // in a more complex expression the following statements are the
    // same. the value in variable a gets incremented by 1
    a = 1;
    ++a; // a = a+1
    System.out.println("a after ++a = " + a);
    a = 1;
    a++; // a = a+1
    System.out.println("a after a++ = " + a);

    int b = 1;

    for (int i = 0; i < 5; i++) {
      System.out.println("after i++" + i);
    }

    for (int i = 0; i < 5; ++i) {
      System.out.println("after ++i" + i);
    }

    int i = 3;
    int a1 = i++; // a = 3, i = 4
    int b1 = ++a; // b = 4, a = 4

    System.out.println(a1);
    System.out.println(b1);

    boolean bBoolean = !true;
    System.out.println(bBoolean);

    int c = ~b;
    System.out.println(c);

    int d = -10;
    int d1 = ~d;
    System.out.println(d1);


  }

}
