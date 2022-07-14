package stampede;

public class AsciiLine {
private int lineNumber;
private char[] line = new char[600];
private boolean[] used = new boolean[600];
public int getLineNumber() {
	return lineNumber;
}
public void setLineNumber(int lineNumber) {
	this.lineNumber = lineNumber;
}
public char[] getLine() {
	return line;
}
public void setLine(char[] line) {
	this.line = line;
}
public boolean[] getUsed() {
	return used;
}
public void setUsed(boolean[] used) {
	this.used = used;
}
public AsciiLine() {
	super();
	for(int i=0;i<600;i++) {
		used[i] = false;
		line[i] = ' ';
	}
}
@Override
public String toString() {
	String str = new String();
	for(int i=0;i<600;i++) {
		str = str+line[i];
	}
	return str;
}

public void addArt(int col, char[] art) throws Exception {
	for(int i = col;i<col+art.length;i++) {
		if(used[i]== true && (line[i] != ' ' || line[col] == art[i-col])) {
			throw new Exception("ERROR: Already used location trying to overwrite!!!"+col);
		}
		used[i] = true;
		line[i] = art[i-col];
	}
}

}
