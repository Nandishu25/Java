class FunAspWpSf
{
    static void add(int a, int b)
    {
        int sum = a+b;
        System.out.println(sum);

    }
    static void sqr(int a)
    {
        int sqr = a*a;
        System.out.println(sqr);
    }
    static void product(int a, int b,int c)
    {
        int product = a*b*c;
        System.out.println(product);
    }
    public static void main(String[] args) {
        {
            System.out.println("Main Started");
            add(10,20);
            sqr(5);
            product(5,8,7);
            System.out.println("Main Ended");
        }
    }    
}

