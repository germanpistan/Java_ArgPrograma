public class Main {
    public static void main(String[] args) {
        Ordenador ord=new Ordenador();
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        String orden=args[3];
        boolean v=false;
        if (orden.equals("a")){
            v=true;
        }else if (orden.equals("d")){
            v=false;
        }
        int[] numeros=ord.ordenar(a,b,c, v);
        for (int n : numeros){
            System.out.println(n);
        }

    }
}

