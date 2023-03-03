package Loops;

public class dowhile {
    public static void main(String[] args) {

        System.out.println("Even Numbers");
        int i=1;
        do {
            System.out.println(i+=1);
        i++;
        } while(i<=20);

        System.out.println("Odd Numbers");
        int a=0;
        do{
            System.out.println(a+=1);
            a++;
        } while(a<=20);

        System.out.println("Tables of 5");
         int j=1;
         do{
             System.out.println(j*5);
             j++;
         }while(j<=10);

    }
}
