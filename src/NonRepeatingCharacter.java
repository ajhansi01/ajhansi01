import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        char ch = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry :: getKey)
                .findFirst()
                .orElse(null);
        System.out.println(ch);

        String s2  = "jhansi";
        char cr = s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entyset -> entyset.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(cr);
    }
}
