public class Hollow_Rectangle {
    public static void main(String[] args) {
        hollo_rectangle(4,5);
    }

    public static void hollo_rectangle(int r,int c){
        // outer loop for rows
        for(int i=1; i<=r; i++){
            // inner loop for columns
            for(int j=1; j<=c; j++){
                if( i == 1 || i==r || j==1 || j==c){
                    System.out.print("*");
                } else{
                    System.out.print(" ");                    
                }
            }
            System.out.println();
        }
    }
}
