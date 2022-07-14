package stampede;

import java.util.Arrays;

public class AsciiElement {
private int x;
private int y;
private char[] chars = new char[8];
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public char[] getChars() {
	return chars;
}
public void setChars(char[] chars) {
	this.chars = chars;
}
@Override
public String toString() {
	String str = new String();
	for(int i=0;i<8;i++) {
		str = str+chars[i];
	}
	return str;
}

}
