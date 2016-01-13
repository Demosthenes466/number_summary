import  java.io.* ;

class NearlyZero
{
	public static void main ( String[] args )
	{
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

		//declare and initialize variables
		int closest = 0;
		int largest = 50;
		//find the element nearest to zero
		for(index = 0; index < data.length; index ++ )
		{
			if (Math.abs(0 - data[index]) >= Math.abs(largest - data[index])) {
				closest = data[index];
				largest = data[index];
			}
		}

		//write out the element nearest to zero
		System.out.println(closest);

	}



}