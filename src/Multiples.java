public class Multiples {
    public static int main(int bound, int a, int b) {
        int count = 0;
        for(int i = 1; i < bound; i++){
            if (i % b == 0 || i % a == 0){
                count ++;
            }
        }
        return count;
    }

    public static int main() {
        return main(1000, 5, 3);

    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}
