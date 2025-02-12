
public class Fungsi02 {
    public static void main(String[] args) {

                int[][] stock = {
                    {10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}
                };
                
                int[] harga = {75000, 50000, 60000, 10000};
                
                int[] pengurangan = {1, 2, 0, 5};
                
                tampilkanPendapatan(stock, harga);
                
                tampilkanTotalStock(stock);
                
                kurangiStock(stock, pengurangan);
                
                System.out.println("\nStok setelah pengurangan bunga mati:");
                tampilkanTotalStock(stock);
            }
            
            public static void tampilkanPendapatan(int[][] stock, int[] harga) {
                System.out.println("Pendapatan tiap cabang jika semua bunga terjual:");
                for (int i = 0; i < stock.length; i++) {
                    int pendapatan = 0;
                    for (int j = 0; j < stock[i].length; j++) {
                        pendapatan += stock[i][j] * harga[j];
                    }
                    System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
                }
            }
            
            public static void tampilkanTotalStock(int[][] stock) {
                int[] totalStock = new int[stock[0].length];
                
                for (int i = 0; i < stock.length; i++) {
                    for (int j = 0; j < stock[i].length; j++) {
                        totalStock[j] += stock[i][j];
                    }
                }
                
                System.out.println("Total stok setiap jenis bunga:");
                System.out.println("Aglonema: " + totalStock[0]);
                System.out.println("Keladi: " + totalStock[1]);
                System.out.println("Alocasia: " + totalStock[2]);
                System.out.println("Mawar: " + totalStock[3]);
            }
            
            
            public static void kurangiStock(int[][] stock, int[] pengurangan) {
                for (int i = 0; i < stock.length; i++) {
                    for (int j = 0; j < stock[i].length; j++) {
                        stock[i][j] -= pengurangan[j];
                    }   
                
                }           
                    
            }
            
        }
        
    

