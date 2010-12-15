package fileio;

import java.io.Serializable;

public class Collar implements Serializable {

	private int collarsize;
	public Collar(int size)
	{
		collarsize=size;
	}
	
	public int getcollarsize()
	{
		return collarsize;
	}
}
