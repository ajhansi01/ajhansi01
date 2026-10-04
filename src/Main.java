//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

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