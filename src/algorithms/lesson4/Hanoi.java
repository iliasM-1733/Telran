package algorithms.lesson4;

public class Hanoi {

    static void hanoi(int n,char start,char mid,char end) {
        if(n==1) {
            System.out.println(n +" Из "+start + " K " + end);
            return;
        }
        hanoi(n-1,start,end,mid);
        System.out.println(n +" Из "+start + " K " + end);
        hanoi(n-1,mid,start,end);

    }
    public static void main(String[] args) {
        int n = 5;
        hanoi(n,'A','B','C');
    }
}
