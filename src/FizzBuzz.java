import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public void getFizzBuzz () {
        String res = "";
        for (int i = 1; i <= 100; i++) {
            res += transform(i);
        }
        System.out.println(res);
    }


    public String transform (int num) {
        if(num%3==0) {
            if(num%5==0) {
                return "FizzBuzz";
            }else {
                return "Fizz";
            }
        }else if (num%5==0){
            return "Buzz";
        }else {
            return num+"";
        }
    }

    public List generate (int num) {
        if(num==1) return null;
        return IntStream.range(2,num).filter(i -> num%i==0).mapToObj(i->i).collect(Collectors.toList());
    }
}
