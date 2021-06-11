import java.util.Scanner;

public class pog {

	public static void main(String[] args) {
		Scanner keyBd = new Scanner(System.in);
        System.out.print("Enter the coefficient of the quadratic term -> ");
        double a = keyBd.nextDouble();
    System.out.print("Enter the coefficient of the linear term -> ");
        double b = keyBd.nextDouble();
    System.out.print("Enter the constant term -> ");
        double c = keyBd.nextDouble();   
    System.out.println("");
    if (b == 0 && c!=0)
    {
        if(a == 1)
        {
            System.out.printf("For the quadratic equation x^2%+.5f=0:%n",c);
        }
        else if(a == -1)
        {
            System.out.printf("For the quadratic equation -x^2%+.5f=0:%n",c);
        }
        System.out.printf("For the quadratic equation %.5fx^2%+.5f=0:%n",a,c);
    }
    else if(b !=0 && c == 0)
    {
        if(a == 1)
        {
            System.out.printf("For the quadratic equation x^2%+.5fx=0%n",b);
        }
        else if(a == -1)
        {
            System.out.printf("For the quadratic equation -x^2%+.5fx=0%n",b);
        }
        System.out.printf("For the quadratic equation %.5fx^2%+.5fx=0%n",a,b);
    }
    else if(a == 1)
    {
        System.out.printf("For the quadratic equation x^2%+.5fx%+.5f=0:%n",b,c);
    }
    else if(a == -1)
    {
        System.out.printf("For the quadratic equation -x^2%+.5fx%+.5f=0:%n",b,c);
    }
    else
    {
    System.out.printf("For the quadratic equation %.5fx^2%+.5fx%+.5f=0:%n", 
        a,b,c);
    }
        double d = Math.pow(b,2)-(4*a*c), //finds discriminant
        root1 = (-b - Math.sqrt(d))/(2*a), //finds roots
        root2 = (-b + Math.sqrt(d))/(2*a),
        axisSym = -b/(2*a), //finds axis of sym
        vertX = -Math.pow(b,2)/(4*a)+c, //finds vertex
        numInt = 0, //constant
        ratPart = -b/(2*a),
        radPart = Math.sqrt(Math.abs(d))/Math.abs(2*a);
    System.out.println("");
    System.out.printf("Discriminant: %.5f%n",d);
    if (d == 0)
    {
        System.out.printf("Roots: x = {%.5f}%n",ratPart);
    }
    else if(d >=0)
    {
        System.out.printf("Roots: x = {%.5f, %.5f}%n",root2,root1);
    }
    else if (d <=0 && ratPart !=0)
    {
        System.out.printf("Roots: x = {%.5f+%.5fi, %.5f-%.5fi}%n",ratPart
            ,radPart,ratPart,radPart); //imaginary# i=sqrt(-1)
    }
    else
    {
        System.out.printf("Roots: x = {%.5fi, -%.5fi}%n",radPart,radPart);
    }
    System.out.printf("Axis of Symmetry: x = %.5f%n",axisSym);
    System.out.printf("Vertex: (%.5f, %.5f)%n",axisSym,vertX);
    if (root1 == root2)
    {
        System.out.printf("x-intercepts: (%.5f, %.5f)%n",root1,numInt); 
    }
    else if (Double.isNaN(root1) || Double.isNaN(root2))
    {
        System.out.printf("x-intercepts: none%n");
    }
    else 
    {
        System.out.printf("x-intercepts: (%.5f, %.5f) and (%.5f, %.5f)%n",root1,numInt,root2,numInt);
    }
    System.out.printf("y-intercept: (%.5f, %.5f)%n",numInt,c);
    if (a >= 0)
    {  
        System.out.println("Shape: Concave upward");
    }
    else
    {
        System.out.println("Shape: Concave downward");
    }

	}

}
