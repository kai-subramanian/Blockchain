import java.util.*;
import com.google.gson.GsonBuilder;
public class blockchainproto {
	public static void main(String[] args) {
	
		block genesisBlock = new block("Hi im the first block", "0");
		System.out.println("First block created !\n");
		System.out.println("Hash for block 1 : " + genesisBlock.hash+"\n");
		
		block secondBlock = new block("Yo im the second block",genesisBlock.hash);
		System.out.println("Second block created !\n");
		System.out.println("Hash for block 2 : " + secondBlock.hash+"\n");
		
		block thirdBlock = new block("Hey im the third block",secondBlock.hash);
		System.out.println("Third block created !\n");
		System.out.println("Hash for block 3 : " + thirdBlock.hash+"\n");
		
	}
}
