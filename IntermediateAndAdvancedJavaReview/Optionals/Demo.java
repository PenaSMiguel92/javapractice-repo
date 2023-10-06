package Optionals;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.orElse("null"));
        
        
        
    }
}