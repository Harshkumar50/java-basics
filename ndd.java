import java.util.*;
public class lec15bit {
public static void main(String[] args) {
int n = 5;
int pos = 2;
int bitmask = 1 << pos;
if ((bitmask & n) == 0) {
System.out.println("Bit is 0");
} else {
System.out.println("Bit is 1");
}
}
}
