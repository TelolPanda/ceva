package azi1012;

public class Software 
{
	String name;
	String platform;
	int minRam;
	String minCpu;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public int getMinRam() {
		return minRam;
	}
	public void setMinRam(int minRam) {
		this.minRam = minRam;
	}
	public String getMinCpu() {
		return minCpu;
	}
	public void setMinCpu(String minCpu) {
		this.minCpu = minCpu;
	}
	@Override
	public String toString()
	{
	String text = "";
	text = text + "Name: " + name + "\n";
	text = text + "platform: " + platform + "\n";
	text = text + "minRam: " + minRam + "\n";
	text = text + "minCpu: " + minCpu + "\n";
	return text;
	}
}
