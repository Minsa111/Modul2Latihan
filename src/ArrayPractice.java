import java.util.LinkedList;

public class ArrayPractice {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add( "Sapi" );
        animals.add("Kelinci");
        animals.add("Kambing");
        animals.add("Unta");
        animals.add("Domba");
        System.out.println( "\nAnimals: " + animals );

        LinkedList<String> animalstoDelete = new LinkedList<>();
        animalstoDelete.add( "Kelinci" );
        animalstoDelete.add("Kambing");
        animalstoDelete.add("Unta");

        System.out.println( "Animals to delete:\n" );
        System.out.println(animalstoDelete);
        for(String data: animalstoDelete){
            animals.remove(data);
        }
        System.out.println( "result: "+animals );
    }
}
