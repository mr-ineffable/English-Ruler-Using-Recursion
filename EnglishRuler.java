package Recursion;

public class EnglishRuler {

    public static void main(String[] args) {
        Marks(10, 2);
//        Pat(4);
    }

    public static void Marks(int len,int mt)
    {
        int count = 0;
        while(count < len) {
            for (int i = 0; i < mt; i++) {
                System.out.print("-");                 //first length
            }
            System.out.print(count);
            count++;


            Pat(mt);                                //First ka second ke beech me pat

            for (int i = 0; i < mt; i++) {
                System.out.print("-");                //second lenght
            }
            System.out.print(count);
            Pat(mt);
            count++;
        }
        for (int i = 0; i < mt; i++) {
            System.out.print("-");                //second lenght
        }
        System.out.print(count);

    }

    public static void Pat(int n)
    {
        if (n == 0)
            return;
        // BP: Pat(n)
        Pat(n-1);


        System.out.println();
        for (int i = 1; i <= n-1 ; i++) {
            System.out.print("-");
        }
        System.out.println();


        Pat(n-1);
        }
}
