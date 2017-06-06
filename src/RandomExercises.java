
public class RandomExercises {
	
	
	static int randomBetween0AndN(int n){
		double x = Math.random();
		return (int)(x*n);
	}
	static int randomBetweenLowAndHigh(int low, int high){
		double x = Math.random();
		return (int)(x*(high-low)) +low;
	}
	static  int randomInt(int low, int high){
		double x = Math.random();
		return (int)(x*(high-low+1)) +low;
	}
	
	public static void main(String[] a){
		
		int x=10;
		for(int i=0; i<x; i++)
			System.out.println("randomBetween0AndN: "+randomBetween0AndN(4));
		for(int i=0; i<x; i++)
			System.out.println("randomBetweenLowAndHigh: "+randomBetweenLowAndHigh(1,6));
		for(int i=0; i<x; i++)
			System.out.println("randomInt: "+randomInt(1,6));
			
		
	}
}
