import java.util.Scanner;

public class MainPorConsola {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Ordenador ord=new Ordenador();
        System.out.println("Ingrese el primer numero: ");
        int a=Integer.parseInt(scn.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int b=Integer.parseInt(scn.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        int c=Integer.parseInt(scn.nextLine());
        System.out.println("Ingrese el orden [a/b]: ");
        String orden=scn.nextLine();
        boolean v=false;
        if (orden.equals("a")){
            v=true;
        }
        int[] numeros=ord.ordenar(a,b,c, v);
        for (int n : numeros){
            System.out.println(n);
        }
    }

}

