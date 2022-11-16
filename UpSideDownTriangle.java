
public class UpSideDownTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=0; i<row; i++)
		{
			for(int k=1; k<i+1; k++)
			{
				System.out.print(" ");
			}
			for(int j=row-i; j>0; j--)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
		}

	}

}
