package trees;

import java.io.IOException;

public class TreeException extends Throwable
{
	public TreeException(String s) throws IOException
	{
		// Pass s into a superclass ctor.
		super(s);
	}
}
