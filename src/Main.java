public class Main {

    public static void Ver(double matriz[][]){
        String salida = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                salida+= matriz[i][j]+" ";
            }
            salida+="\n";
        }
        System.out.println(salida);
    }

    public static void main (String[] args){
        /*
        *  3x + 4 = 5
        *  2x - y = 7
        *
        * */
        int i, j;

        double matriz[][] = {
                {3 , 4 , 5},
                {2 , -1, 7}
        };

        // Matriz identidad
        Ver(matriz);

        // Queremos un cero en 0, 1
        i = 0;
        for (j = 0; j < matriz[0].length; j++){
            matriz[i][j] = (matriz[i+1][j] * 4) + (matriz[i][j]);
        }
        Ver(matriz);

        //Queeremos un 1 en 0,0
        i = 0;
        for (j = 0; j < matriz[0].length; j++){
            matriz[i][j] = (matriz[i][j]) / 11 ;
        }
        Ver(matriz);
        // Queremos un 0 en 1,0
        i = 1;
        for (j = 0; j < matriz[0].length; j++){
            matriz[i][j] = (matriz[i][j]) + (-2 * matriz[0][j])  ;
        }
        Ver(matriz);

        // Queremos un 0 en 1,1
        i = 1;
        for (j = 0; j < matriz[0].length; j++){
            matriz[i][j] = (matriz[i][j]) * -1  ;
        }
        Ver(matriz);


        System.out.println("la Respuesta es: \nx: "+matriz[0][2]+"\ny: "+matriz[1][2]);


        // determinantes
        double x, detX, y, detY, det;
        double matriz2[][] = {
                {3 , 4 , 5},
                {2 , -1, 7}
        };

        det = (matriz2[0][0] * matriz2[1][1]) - (matriz2[1][0] * matriz2[0][1]);
        detX = (matriz2[0][2] * matriz2[1][1]) - (matriz2[1][2] * matriz2[0][1]);
        detY = (matriz2[0][0] * matriz2[1][2]) - (matriz2[1][0] * matriz2[0][2]);

        x = detX/det; y = detY/det;

        System.out.println("*******************\nRespuesta\nx: "+x+"\ny: "+y);



    }
}
