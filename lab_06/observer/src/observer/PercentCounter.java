//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : PercentCounter.java
//  @ Date : 19/10/2019
//  @ Author : 
//
//




public class PercentCounter extends Observable {
	private int percent;
	
	public void run() {
		for(percent = 0; percent <= 100; percent++)
			if(percent % 10 == 0)
				this.reportToObservers();
	}
	
	public String toString()
	{
		return percent + "%";
	}
}
