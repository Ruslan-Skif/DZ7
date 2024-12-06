public class Main {
    public static void main(String[] args) {
        int [] weight = {1, 2, 3};
        double [] weight1 = {1.57, 7.654, 9.986};
        char [] weight2 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(" ");
        System.out.println("Task 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < weight1.length; i++){
            System.out.print(weight1[i]);
            if (i < weight1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < weight2.length; i++){
            System.out.print(weight2[i]);
            if (i < weight2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Task 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = weight1.length - 1; i >= 0; i--){
            System.out.print(weight1[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = weight2.length - 1; i >= 0 ; i--){
            System.out.print(weight2[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Task 4");
        for (int i = 0; i < weight.length; i++){
            if(weight[i] % 2 != 0){
                weight[i] = weight[i] + 1;
            }
            System.out.print(weight[i]);
            if (i < weight.length - 1){
                System.out.print(", ");
            }
        }

    }
}