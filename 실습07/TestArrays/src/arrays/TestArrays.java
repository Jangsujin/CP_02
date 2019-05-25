package arrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrays i = new IntArrays();
		int[] a = {1,2,3,4,5,6,7,8};
		i.print(a);
		System.out.println("IntArrays.isSorted : "+i.isSorted(a));
		a = i.randomInts(8,50);
		System.out.print("IntArrays.randomInts : ");
		i.print(a);
		a = i.resize(a, 10);
		System.out.print("IntArrays.resize : ");
		i.print(a);
		i.swap(a,2,4);
		System.out.print("IntArrays.swqp : ");
		i.print(a);
		
		a = i.reverse(a);
		System.out.print("IntArrays.reverse : ");
		i.print(a);

	}

}
