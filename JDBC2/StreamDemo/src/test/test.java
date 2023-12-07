package test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class test {
public static void main(String[] args) {
	List<Integer> number = Arrays.asList(2,3,4,5,3);
	Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
	square.forEach(s-> System.out.println(s));
}
}
