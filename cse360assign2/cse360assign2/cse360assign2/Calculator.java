/**
 * Adel Karabegovic
 * Last Edited: 2/18/2019
 * Description: Calculator program will be using tool versions from
 * github and applying basic math operations through methods.
 * <p>
 * @param value
 * @return total
 */
package cse360assign2;

public class Calculator {

	/*variables*/
	private int total;
	private String history;
	
	/*constructors*/
	public Calculator () 
	{
		// not needed - included for clarity
		total = 0;  
		history = "0";
	}
	
	/*getTotal - returns total*/
	public int getTotal () 
	{
		return total;
	}
	
	/*add - add to total*/
	public void add (int value) 
	{
		history = history + " " + "+" + " " + value;
		total = total + value;
	}
	
	/*subtract - subtract from total*/
	public void subtract (int value) 
	{
		history = history + " " + "-" + " " + value;
		total = total - value;
	}
	
	/*multiply - multiply to total*/
	public void multiply (int value) 
	{
		history = history + " " + "*" + " " + value;
		total = total * value;
	}
	
	/*divide - divide from total*/
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
		total = total / value;
		}
		history = history + " " + "/" + " " + value;
	}
	
	/*getHistory - returns a string of operation history*/
	public String getHistory () 
	{
		return history;
	}
}
