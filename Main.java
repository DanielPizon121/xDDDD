/*public class Main {
    public static void main(String[] args) {
        int height = 10; // Wysokość trójkąta

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int radius = 6; // Promień koła

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (Math.sqrt(i * i + j * j) <= radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    import java.util.Random;

class Main {
  public static void main(String[] args) {
int [][] array=new int[10][10];
    Random rand = new Random();
    for(int i=0;i<10;i++){
      for (int j = 0; j<10;j++){
        array[i][j]=rand.nextInt(101)-50;
        System.out.print(array[i][j]+ "\t");
      }
      System.out.println();
    }
  }
}
}




