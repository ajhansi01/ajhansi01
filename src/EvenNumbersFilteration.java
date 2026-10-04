import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilteration {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            l1.add(i);
        }
        List<Integer> l2 = l1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
