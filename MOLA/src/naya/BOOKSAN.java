
package naya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOOKSAN {
    public static void main(String[] args) {
	// 1. ��Ʈ�� ���� : �Է½�Ʈ���� �ʿ�...InputStreamReader, BufferedReader
	System.out.println("1. Stream ����.....");
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
		
	// 2. �о���δ�...readLine()
	try {
	    System.out.println("2. readLine() ���� �о�帳�ϴ�.....");
	    String line = br.readLine();
	    while(line!=null) { //�о���� �����Ͱ� �ִٸ�...
		//3. �ַܼ� ���...System.out.println()
		System.out.println("Reading Data : " + line);
		line=br.readLine(); //�� �κ��� �־�� �ݺ��Ѵ�.
	    }
	} catch (IOException e) {
		
	} finally {
	    try {
		br.close();
	    } catch (IOException e) {
	    }
	}
    }
}