package azi1012;

public class Computer 
{
	int noOfSP;
	
	int ram;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	
	String cpu;
	
	
	@Override
	public String toString()
	{
	String text = "";
	text = text + "Ram: " + ram + "\n";
	text = text + "Cpu: " + cpu + "\n";
	return text;
	}
}
