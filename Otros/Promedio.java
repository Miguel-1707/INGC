import java.util.*;
class Promedio{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int promedio=0,suma=0;
		int cont = 0;
		while(cont < 5){
			System.out.println("Introduce el valor "+(cont+1)+": " );
            int num=0;
			try{
				num = sc.nextInt();
				suma += num;
				cont++;
			}catch(InputMismatchException e){
				System.out.println("Debias introducir un valor entero");
				sc.nextLine();
			}finally{
				sc.nextLine();
			}
		}
		promedio = suma / 5;
		System.out.println("Tu promedio es: "+promedio);
        sc.close();
	}
}