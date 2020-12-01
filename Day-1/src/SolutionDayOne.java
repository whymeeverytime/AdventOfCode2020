import java.nio.file.*;

public class SolutionDayOne {
    public static int algoPart1( int requiredSum, int... numbers ) {
        for ( int a : numbers ) {
            for ( int b : numbers ) {
                if ( a + b == requiredSum ) {
                    return a * b;
                }
            }
        }
        return 0;
    }
    public static int algoPart2( int requiredSum, int... numbers ) {
        for ( int a : numbers ) {
            for ( int b : numbers ) {
                for ( int c : numbers ) {
                    if ( a + b + c == requiredSum ) {
                        return a * b * c;
                    }
                }
            }
        }
        return 0;
    }

    public static void main( String[] args ) throws Exception {
        int[] inputNumbers = Files.lines( Paths.get( "input.txt" ) )
                                    .mapToInt( Integer::parseInt )
                                    .toArray();
        if ( !( algoPart1( 2020 , inputNumbers ) == 0 || algoPart2( 2020, inputNumbers ) == 0 ) ) {
            System.out.println();
            System.out.println( "Solution of first part: " + algoPart1( 2020, inputNumbers ) );
            System.out.println();
            System.out.println( "Solution of second part: " + algoPart2( 2020, inputNumbers ) );
        }
        else {
            System.exit(0);
        }  
    }
}