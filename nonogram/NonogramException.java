package nonogram;

import java.io.Serializable;

/**
 * A problem-specific run time exception for a Nonogram puzzle.
 * 
 * @author Dr Mark C. Sinclair
 * @version June 2022
 */
@SuppressWarnings("serial")
public class NonogramException extends RuntimeException implements Serializable {
	/**
	 * Constructor with explanatory message
	 * 
	 * @param message the explanatory message
	 */
	public NonogramException(String msg) {
		super(msg);
	}
}
