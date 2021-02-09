package azi1012;

public class SoftwareProduct 
{
	public static void main (String[] args)
	{
		Computer c1 = new Computer();
		Software s1 = new Software();
		
		c1.setRam (16);
		c1.setCpu ("i7");
		s1.setName ("Windows");
		s1.setPlatform ("Windows 10");
		s1.setMinRam (4);
		s1.setMinCpu ("i3");
		
		System.out.println(c1 + "\n" + s1);
	}
}
