public class Actividad3c{
    public static void main(String[]args){
        String palabra= "Hola";
        String nombre= "Jossie";
        int edad= 18;
        String x="Primero";
        String y="Segundo";
        String z="Tercero";
        int a= 3;
        int b=2;
        double c=1.5;


        //Imprimimos "Hola"
        System.out.printf("%s \n", palabra); 
        //Imprimimos Hola +  nombre
        System.out.printf("Hola %s \n", nombre);
        //Imprimimos Hola, me llamo <tu nombre> y tengo <tu edad> años
        System.out.printf("Hola, me llamo %s y tengo %d años\n", nombre, edad);
        //Imprimimo Nomre:<> / Edad:<> 
        System.out.printf("Nombre %s \nEdad  %d años\n", nombre, edad);
        //Imprimimos Primero\Segundo\Tercero:
        System.out.printf("\"%s \\ %s \\ %s\"\n", x, y,z);
        //Imprimimos 3/2= 1.5
        System.out.printf("%d / %d = %.1f" , a, b,c);
        
    } 
}
