package by.bsu.fpmi.Z;

public interface UnaryPredicate <T>{
	public boolean test(T object);
	
	public static <T>int countIf(T[]array,UnaryPredicate<T>predicate){
		int counter=0;
		for(T i:array) {
			if(predicate.test(i))
				counter++;
		}
		return counter;
	}	
}
