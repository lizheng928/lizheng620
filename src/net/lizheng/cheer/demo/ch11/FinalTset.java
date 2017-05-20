package net.lizheng.cheer.demo.ch11;

public class FinalTset 
{
	private static String value="abc";
	public static void main(String[] agrs)
	{
		//System.out.println(value);
		//value = "bcd";
		//System.out.println(value);
		FinalDemo finalDemo = new FinalDemo();
		finalDemo.setDemoValue("abcvvvv");
		System.out.println(finalDemo.getDemoValue());
		System.out.println(finalDemo);
		
		FinalDemoChild child = new FinalDemoChild();
		child.setDemoValue("def");
		System.out.println(child);
}
class FinalDemo
{
	private String demoValue;
	public void setDemoValue(String demoValue)
	{
		this.demoValue = demoValue;
	}
	public String getDemoValue()
	{
		return demoValue;
	}
}
class FinalDemoChild extends FinalDemo
{
	public String toString()
	{
       return getClass().getName + "extends net.lizheng.cheer.ch11.FinalDemo" + 
	}
	}
}
