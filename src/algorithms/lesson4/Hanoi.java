package algorithms.lesson4;

public class Hanoi {

    static void hanoi(int n,String start,String mid,String end) {
        if(n==1) {
            System.out.println(n +" Из "+start + " переложили в " + end);
            return;
        }

        hanoi(n-1,start,end,mid);
        System.out.println(n +" Из "+start + " переложили в " + end);
        hanoi(n-1,mid,start,end);

    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,"A","B","C");
    }
}
