package Test;

import java.util.HashSet;
import java.util.List;

public class Insiemi {

    public Insiemi(){
    }
    public boolean verificaInsieme(List<Integer> numeri) {
        HashSet<Integer> set = new HashSet<>(numeri);
        return set.size() >= numeri.size();
    }
}
