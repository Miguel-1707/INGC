import java.util.*;


class Lectura{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int valor=0;
		System.out.println("Introduce un dato");
		try{
		   valor=sc.nextInt();
		}catch(InputMismatchException e){
		   valor=10;
		   System.out.println("Debias introducir un valor entero");
		}finally {}
		
		   System.out.println("Tu valor multiplicado por 5 es:"+valor*5);
		   sc.close();
	}
}