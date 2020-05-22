import java.util.*;
public class block {
	public String hash;
	public String prevHash;
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	public int nonce=0;
	//Block Constructor.
	public String hashcalculate(){
		String calculatedhash = stringutil.applySha256( 
				prevHash +
				Long.toString(timeStamp) +
				data 
				);
		return calculatedhash;
	}
	public block(String data,String prevHash ) {
		this.data = data;
		this.prevHash = prevHash;
		this.timeStamp = new Date().getTime();
		this.hash = hashcalculate(); //Making sure we do this after we set the other values.
	}
	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = hashcalculate();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
}
