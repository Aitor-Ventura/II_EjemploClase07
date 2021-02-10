public class Excercise {
    public static int[] auxMet(int [] fila1, int [] fila2, int[] valores) {
        int[] res = new int[fila1.length];
        int c = 0;
        for (int i = 0; i < fila1.length; i++){
            for ( c = 0; c < valores.length; c++){
                if (fila1[i] + fila2[i] == valores[c]){
                    res[i] = fila1[i] + fila2[i];
                    break;
                } else {
                    res[i] = fila1[i] - fila2[i];
                }
            }
        }
        return res;
    }
    
    public static int [][] sumaResta(int [][] mat1, int [][] mat2, int[] valores) {
        int[][] res = new int[mat1.length][];
        for (int i = 0; i < mat1.length; i++){
            res[i] = auxMet(mat1[i], mat2[i], valores);
        }
        return res;
    }
}
