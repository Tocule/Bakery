import java.io.*;

class Bread
{
	private String breadType;
	private int caloriesPerSlice;

	Bread()
	{
		this.breadType="White";
		this.caloriesPerSlice=10;
	}


	Bread(String breadType,int caloriesPerSlice)
	{
		this.breadType=breadType;
		this.caloriesPerSlice=caloriesPerSlice;
	}

	public String getBreadType()
	{
		return this.breadType;
	}

	public void setBreadType(String breadType)
	{
		this.breadType=breadType;
	}

	public int getCaloriesPerSlice()
	{
		return this.caloriesPerSlice;
	}

	public void setCaloriesPerSlice(int calories)
	{
		this.caloriesPerSlice=calories;
	}

}

class Filling
{
	private String fillingType;
	private int caloriesPerServing;

	Filling()
	{
		this.fillingType="ASD";
                this.caloriesPerServing=20;
	}


	Filling(String fillingType,int caloriesPerServing)
	{
		this.fillingType=fillingType;
		this.caloriesPerServing=caloriesPerServing;
	}

	public String getFillingType()
	{
		return this.fillingType;
	}

	public void setFillingType(String fillingType)
	{
		this.fillingType=fillingType;
	}

	public int getCaloriesPerServing()
	{
		return this.caloriesPerServing;
	}

	public void setCaloriesPerServing(int calories)
	{
		this.caloriesPerServing=calories;
	}

}


class Sandwich
{
	private Bread bread=new Bread();

	private Filling filling=new Filling();

	Sandwich(String breadType,int caloriesPerSlice,String fillingType,int caloriesPerServing)
	{
		 bread.setBreadType(breadType);
                 bread.setCaloriesPerSlice(caloriesPerSlice);
		 filling.setFillingType(fillingType);
                 filling.setCaloriesPerServing(caloriesPerServing);
	}

	public Filling getFilling()
	{
		return filling;
	}

	public void setFilling(Filling filling1)
	{
		filling=filling1;
	}

	public Bread getBread()
	{
		return bread;
	}

	public void setBread(Bread bread1)
	{
		bread=bread1;
	}

	public int getTotalCalories()
	{
		int total=bread.getCaloriesPerSlice()+filling.getCaloriesPerServing();
		return total;
	}

}

public class Bakery
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String breadtype;
		int caloriesperslice;
		String fillingtype;
		int caloriesperserving;

		System.out.println("Enter the type of bread you want");
		breadtype=br.readLine();

		System.out.println("Enter the calories per slice");
		caloriesperslice=Integer.parseInt(br.readLine());

		System.out.println("Enter the type of filling you want");
		fillingtype=br.readLine();

		System.out.println("Enter the calories per serving");
		caloriesperserving=Integer.parseInt(br.readLine());

		Sandwich s=new Sandwich(breadtype,caloriesperslice,fillingtype,caloriesperserving);


		System.out.println("This Sandwich has two slices of "+s.getBread().getBreadType()+"( "+s.getBread().getCaloriesPerSlice()+" calories per slice) with "+s.getFilling().getFillingType()+" filling ( "+s.getFilling().getCaloriesPerServing()+" calories per serving ). The total number of calories for the sandwich is "+s.getTotalCalories());

	}

}

