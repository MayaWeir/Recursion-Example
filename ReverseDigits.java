/**
 *
 * The ReverseDigits class will take an int and return it in the reverse order
 *
 * @author Maya Weir
 * @version 1 2019.04.12
 */

import java.awt.*;
import hsa.Console;

public class ReverseDigits
{
    static Console c;
    /**
     *  revDigits(int n) will take an int of any length and then display the number with the digits in the reverse order.
     *
     *  Variables
     * <b> n </b> int used to store the number to be reversed
     * */
    public static void revDigits (int n)
    {
	c.print (n % 10);
	if (n / 10 != 0)
	    revDigits (n / 10);
    }

    /**
    * The main method executes the program
    */

    public static void main (String[] args)
    {
	c = new Console ();
	ReverseDigits r = new ReverseDigits ();
	r.revDigits (774320);

    }
}
