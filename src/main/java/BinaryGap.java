import java.util.ArrayList;
import java.util.List;

public class BinaryGap {


    public int binaryGapMaxSize(Integer n) {
        if(n <= 0) return 0;

        String binaryNumber = Integer.toBinaryString(n);
        List<Integer> oneIndexes = new ArrayList<>();
        int longestBinaryGap = 0;

        for(int i=0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '0') continue;
            oneIndexes.add(i);
        }

        //itero o tamanho menos 1 pois verifico sempre a posicao atual e a proxima (evitar index out of bounds)
        for(int i=0; i<oneIndexes.size()- 1; i++){
            //SUBTRAI 1 PARA NAO CONTAR QUANDO TIVER 1 DO LADO DE OUTRO 1 (NAO EXISTE GAP)
            int indicesDiff = oneIndexes.get(i+1) - oneIndexes.get(i) -1;
            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
        }

        return longestBinaryGap;
    }

}
