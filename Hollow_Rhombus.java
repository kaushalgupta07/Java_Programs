public class Hollow_Rhombus {
    public static void main(String[] args) {
        Hollow_Rectangle(5);
    }
    public static void Hollow_Rectangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }               
            }
            System.err.println();
        }
    }
}
