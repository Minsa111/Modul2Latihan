import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>( Arrays.asList( "Sapi", "Kelinci", "Kambing", "Unta", "Domba" ) );
        System.out.println( "\nAnimals: " + animals );

        System.out.println( "Animals to delete:\n[Kelinci, Kambing, Unta]\n" );
        animals.removeAll( Arrays.asList( "Kelinci", "Kambing", "Unta" ) );

        System.out.println( "result: "+animals );
    }
}
