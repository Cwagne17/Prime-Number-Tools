import java.util.*;


public class SieveAlg {

	public static void main(String[] args) {
		System.out.println("Primes: "+sieveAlg(46500));

	}
	
	public static List<Integer> sieveAlg(int max){
		//Fill number list, optimizing with 2, and odds up to sqrt of max
		List<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(2);
		for(int i =3; i<=max; i++)
			numbers.add(i);
		
		List<Integer> primes = new LinkedList<Integer>();
		
		for( int i=0; i<=Math.sqrt(max); i++){
			//adds first element of numbers to prime
			int front_of_list = numbers.remove(0);
			primes.add(front_of_list);
			
			//removes any number with factor
			Iterator<Integer> iterate = numbers.iterator();
			while(iterate.hasNext()) {
				int value_at_index = iterate.next();
				if(value_at_index % front_of_list == 0)
					iterate.remove();
			}
		}
		primes.addAll(numbers);
		return primes;
	}
}
