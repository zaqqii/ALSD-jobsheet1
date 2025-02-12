import java.util.Scanner;
public interface Perulangan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

         System.out.print("Masukkan NIM: ");
         String nim = scanner.next();
         String duadigitakhir = nim.substring(nim.length() - 2);
         int n = Integer.parseInt (duadigitakhir);
         
         if (n < 10) {
             n += 10;
         }
         
         System.out.println("n: " + n);
         
         for (int i = 1; i <= n; i++) {
             if (i == 6 || i == 10) {
                 continue; 
             }
             if (i % 2 == 1) {
                 System.out.print("* ");
             } else {
                 System.out.print(i + " ");
             }
         }
         
         scanner.close();
     }
 }
 

        
    

