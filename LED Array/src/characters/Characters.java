package characters;
import array7.Array7x7;

/**
 * 	The Class Characters keeps track of the mapping of all characters 
 * 	we need for our LED-array
 * 
 * 	Note that the characters are not 7 pixels wide, 
 * 	the characters are centered for this reason
 * 
 * 	For the unknown symbol we're using the inverted question mark
 * 
 * 	Copy and Paste with great caution since Eclipse will break the formatting!
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-03 19:40
 */

public class Characters {
	
	/**
	 *	Returns the specified array for a character
	 *	passed as argument. If the char cannot be found the UNKNOWN
	 *	character will be returned.
	 *
	 *	@param chr specified character.
	 *	@return 7x7Array representation of character
	*/
	
	public static Array7x7 getChar(char chr){
		Array7x7 array;
		
		switch(chr){
			case '(':
				array = new Array7x7(BRACKET_ROUND_LEFT);
				break;
			case ')':
				array = new Array7x7(BRACKET_ROUND_RIGHT);
				break;
			case '!':
				array = new Array7x7(EXCLAMATION_MARK);
				break;
			case '"':
				array = new Array7x7(QUOTATION_MARK);
				break;
			case '#':
				array = new Array7x7(HASHTAG);
				break;
			case '$':
				array = new Array7x7(DOLLAR_SIGN);
				break;
			case '%':
				array = new Array7x7(PERCENTAGE_SIGN);
				break;
			case '&':
				array = new Array7x7(AMPERSAND);
				break;
			case '*':
				array = new Array7x7(OPERATOR_MULTIPLICATION);
				break;
			case '+':
				array = new Array7x7(OPERATOR_ADD);
				break;
			case '-':
				array = new Array7x7(OPERATOR_SUB);
				break;
			case '.':
				array = new Array7x7(DOT);
				break;
			case '/':
				array = new Array7x7(SLASH_FWD);
				break;
			case '\\': //Behövs en extra för att undvika escape
				array = new Array7x7(SLASH_BWD);
				break;
			case '\'':
				array = new Array7x7(APOSTROPHE);
				break;
			case ':':
				array = new Array7x7(COLON);
				break;
			case '<':
				array = new Array7x7(ARROW_L);
				break;
			case '>':
				array = new Array7x7(ARROW_R);
				break;
			case '=':
				array = new Array7x7(OPERATOR_EQUAL);
				break;
			case '?':
				array = new Array7x7(QUESTION_MARK);
				break;
			case '_':
				array = new Array7x7(UNDERSCORE);
				break;
			case ' ':
				array = new Array7x7(SPACE);
				break;
			case 'A':
				array = new Array7x7(upperA);
				break;
			case 'B':
				array = new Array7x7(upperB);
				break;
			case 'C':
				array = new Array7x7(upperC);
				break;
			case 'D':
				array = new Array7x7(upperD);
				break;
			case 'E':
				array = new Array7x7(upperE);
				break;
			case 'F':
				array = new Array7x7(upperF);
				break;
			case 'G':
				array = new Array7x7(upperG);
				break;
			case 'H':
				array = new Array7x7(upperH);
				break;
			case 'I':
				array = new Array7x7(upperI);
				break;
			case 'J':
				array = new Array7x7(upperJ);
				break;
			case 'K':
				array = new Array7x7(upperK);
				break;
			case 'L':
				array = new Array7x7(upperL);
				break;
			case 'M':
				array = new Array7x7(upperM);
				break;
			case 'N':
				array = new Array7x7(upperN);
				break;
			case 'O':
				array = new Array7x7(upperO);
				break;
			case 'P':
				array = new Array7x7(upperP);
				break;
			case 'Q':
				array = new Array7x7(upperQ);
				break;
			case 'R':
				array = new Array7x7(upperR);
				break;
			case 'S':
				array = new Array7x7(upperS);
				break;
			case 'T':
				array = new Array7x7(upperT);
				break;
			case 'U':
				array = new Array7x7(upperU);
				break;
			case 'V':
				array = new Array7x7(upperV);
				break;
			case 'W':
				array = new Array7x7(upperW);
				break;
			case 'X':
				array = new Array7x7(upperX);
				break;
			case 'Y':
				array = new Array7x7(upperY);
				break;
			case 'Z':
				array = new Array7x7(upperZ);
				break;
			case '0':
				array = new Array7x7(number0);
				break;
			case '1':
				array = new Array7x7(number1);
				break;
			case '2':
				array = new Array7x7(number2);
				break;
			case '3':
				array = new Array7x7(number3);
				break;
			case '4':
				array = new Array7x7(number4);
				break;
			case '5':
				array = new Array7x7(number5);
				break;
			case '6':
				array = new Array7x7(number6);
				break;
			case '7':
				array = new Array7x7(number7);
				break;
			case '8':
				array = new Array7x7(number8);
				break;
			case '9':
				array = new Array7x7(number9);
				break;
			case 'a':
				array = new Array7x7(lowerA);
				break;
			case 'b':
				array = new Array7x7(lowerB);
				break;
			case 'c':
				array = new Array7x7(lowerC);
				break;
			case 'd':
				array = new Array7x7(lowerD);
				break;
			case 'e':
				array = new Array7x7(lowerE);
				break;
			case 'f':
				array = new Array7x7(lowerF);
				break;
			case 'g':
				array = new Array7x7(lowerG);
				break;
			case 'h':
				array = new Array7x7(lowerH);
				break;
			case 'i':
				array = new Array7x7(lowerI);
				break;
			case 'j':
				array = new Array7x7(lowerJ);
				break;
			case 'k':
				array = new Array7x7(lowerK);
				break;
			case 'l':
				array = new Array7x7(lowerL);
				break;
			case 'm':
				array = new Array7x7(lowerM);
				break;
			case 'n':
				array = new Array7x7(lowerN);
				break;
			case 'o':
				array = new Array7x7(lowerO);
				break;
			case 'p':
				array = new Array7x7(lowerP);
				break;
			case 'q':
				array = new Array7x7(lowerQ);
				break;
			case 'r':
				array = new Array7x7(lowerR);
				break;
			case 's':
				array = new Array7x7(lowerS);
				break;
			case 't':
				array = new Array7x7(lowerT);
				break;
			case 'u':
				array = new Array7x7(lowerU);
				break;
			case 'v':
				array = new Array7x7(lowerV);
				break;
			case 'w':
				array = new Array7x7(lowerW);
				break;
			case 'x':
				array = new Array7x7(lowerX);
				break;
			case 'y':
				array = new Array7x7(lowerY);
				break;
			case 'z':
				array = new Array7x7(lowerZ);
				break;
			default:
				array = new Array7x7(UNKNOWN);
				break;
		}
		
		return array;
	}
	
/**
* 	All the characters we need. Use the outline 
* 	window to your right in eclipse to navigate efficiently.
*/
	
	public static int[][] UNKNOWN = {
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] BRACKET_ROUND_LEFT = {
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0}
	};
	
	private static int[][] BRACKET_ROUND_RIGHT = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] EXCLAMATION_MARK  = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] QUOTATION_MARK = {
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] HASHTAG = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 1, 0, 1, 0, 0}
	};
	
	private static int[][] DOLLAR_SIGN = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] PERCENTAGE_SIGN = {
		{0, 1, 0, 0, 0, 1, 0},
		{1, 0, 1, 0, 0, 1, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 1, 0},
		{0, 1, 0, 0, 1, 0, 1},
		{0, 1, 0, 0, 0, 1, 0}
	};

	private static int[][] AMPERSAND = {
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 1, 0}
	};
	
	private static int[][] OPERATOR_MULTIPLICATION = {
		{0, 0, 0, 1, 0, 0, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 0, 0, 1, 0, 0, 0}
	};
	
	private static int[][] OPERATOR_ADD = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] OPERATOR_SUB = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] DOT = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] SLASH_FWD = {
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] SLASH_BWD = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0}
	};
	
	private static int[][] APOSTROPHE = {
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] COLON = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] ARROW_L = {
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0}
	};
	
	private static int[][] ARROW_R = {
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0}
	};
	
	private static int[][] OPERATOR_EQUAL = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] QUESTION_MARK = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 1, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0}
	};
	
	private static int[][] UNDERSCORE = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{1, 1, 1, 1, 1, 1, 1}
	};
	
	private static int[][] SPACE = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0}
	};
	
	private static int[][] upperA = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
	
	private static int[][] upperB = {
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperC = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperD = {
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperE = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0}
	};
	
	private static int[][] upperF = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] upperG = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 1, 0}
	};
	
	private static int[][] upperH = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
	
	private static int[][] upperI = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperJ = {
		{0, 0, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperK = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 1, 0, 0, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
	
	private static int[][] upperL = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0}
	};
	
	private static int[][] upperM = {
		{0, 1, 1, 0, 1, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
	
	private static int[][] upperN = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 0, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 0, 1, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
		
	private static int[][] upperO = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
		
	private static int[][] upperP = {
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
		
	
	private static int[][] upperQ = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 1, 0}
	};
	
	
	private static int[][] upperR = {
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
		
	private static int[][] upperS = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] upperT = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0}
	};
		
	
	private static int[][] upperU = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
		
	
	private static int[][] upperV = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0}
	};
		
	private static int[][] upperW = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0}
	};
	
	private static int[][] upperX = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
		
	
	private static int[][] upperY = {
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0}
	};
		
	
	private static int[][] upperZ = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0}
	};
	
	private static int[][] number0 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
		
	private static int[][] number1 = {
		{0, 0, 0, 1, 0, 0, 0},
		{0, 1, 1, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0}
	};
	
	private static int[][] number2 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 1, 0}
	};
		
	
	private static int[][] number3 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
		
	
	private static int[][] number4 = {
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 1, 0},
		{0, 0, 0, 1, 0, 1, 0},
		{0, 0, 1, 0, 0, 1, 0},
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 0, 1, 0}
	};
		
	private static int[][] number5 = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] number6 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] number7 = {
		{0, 1, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0}
	};
	
	private static int[][] number8 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] number9 = {
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 1, 0},
		{0, 0, 0, 0, 0, 1, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0}
	};
	
	private static int[][] lowerA = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerB = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerC = {
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerD = {
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerE = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerF = {
		{0, 0, 0, 1, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0}
	};
	
	private static int[][] lowerG = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerH = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerI = {
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerJ = {
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 1, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerK = {
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 1, 0, 0, 0, 0},
		{0, 1, 0, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerL = {
		{0, 0, 1, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerM = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0}
	};
	
	private static int[][] lowerN = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerO = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerP = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0}
	};
	
	private static int[][] lowerQ = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0}
	};
	
	private static int[][] lowerR = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 1, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0}
	};
	
	private static int[][] lowerS = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerT = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 0, 0, 1, 1, 0, 0}
	};
	
	private static int[][] lowerU = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerV = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0}
	};
	
	private static int[][] lowerW = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 1, 0, 1, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0}
	};
	
	private static int[][] lowerX = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 1, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 1, 0, 0},
		{0, 1, 0, 0, 0, 1, 0}
	};
	
	private static int[][] lowerY = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 1, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 1, 1, 0, 0, 0}
	};
	
	private static int[][] lowerZ = {
		{0, 0, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0},
		{0, 0, 0, 0, 1, 0, 0},
		{0, 0, 0, 1, 0, 0, 0},
		{0, 0, 1, 0, 0, 0, 0},
		{0, 1, 0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1, 0, 0}
	};
}








































