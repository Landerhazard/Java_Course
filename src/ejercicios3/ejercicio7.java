package ejercicios3;

public class ejercicio7 {

    /** En este ejercicio utilizo un teorema aplicando la raiz cuadrada del numero del que se quiere estimar si es o no primo.
        Lo que se hace es que para evaluar si un numero n es primo, se va probando si alguno de los restos de dividir n entre los numero desde 1 hasta raiz (n) + 1 es igual a cero.
        En caso de que haya algún cociente cuyo resto sea igual a cero, el número n se descarta y se procede con el siguiente numero n + 1.
        
        De esta manera se reduce drásticamente la carga computacional.
        */

    public static void main(String[] args) {
        int maximo = 100;
        for (int i = 1; i <= maximo; i++){
            int raizDeI = (int) Math.sqrt(i);
            for (int j = 1; j <= raizDeI + 1; j++){
                if (i % j == 0 && j != 1 && j != i){
                    break;
                }
                if (j == raizDeI + 1){System.out.println(i);}
            }
        }   
    }
}