class Calculator
  {
   public void calc()
    {
    int add, sub, mul, a, b;
    double div;
    a=Integer.parseInt(System.console().readLine("enter the first no.  :"));
    b=Integer.parseInt(System.console().readLine("enter the second no. :"));
    add=a+b;
    System.out.println("addition of two no.      ="+add);
    sub=a-b;
    System.out.println("substraction of two no.  ="+sub);
    mul=a*b;
    System.out.println("multiplecation of two no.="+mul);
    div=(double)a/b;
    System.out.println("division of two no.      ="+div);
   }
  }