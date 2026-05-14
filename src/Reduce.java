public class Reduce {
    public static int main(int n) {
        int count = 0;
        int i = 100;
        while(i > 0){
            if(i % 2 == 0){
                i/=2;
            }else{
                i -=1;
            }
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(main(100));
    }
}
