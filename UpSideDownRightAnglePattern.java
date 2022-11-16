
public class UpSideDownRightAnglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=0; i<row; i++)
		{
			for(int j=row-i; j>0; j--)
			{
				System.out.print("*"+j);
			}
			System.out.println();
		}

	}

}
