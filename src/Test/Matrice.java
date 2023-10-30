package Test;

public class Matrice {

    public Matrice(){

    }
    public boolean verificaDiagonali(int[][] array) {
        int length = array.length-1;
        boolean isEqual = true;
        for( int i = 0 ; (i <= length) && (isEqual == true) ; i++ ){
            isEqual = array[i][i] == array[i][length-i];
            System.out.println(array[i][i] + " =? " + array[i][length-i] + " : " + isEqual);
        }
        return isEqual;
    }
}
