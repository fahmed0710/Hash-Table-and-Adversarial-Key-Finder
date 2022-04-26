
public class AdversarialKeyFinder {
	HashTable h;
	String s;
	
	/*
	 * Constructor a new adversarial key finder
	 */
	public AdversarialKeyFinder(){
		s = "";
	}
	
	/*
	 * Returns the adversarial keys from the hash table's arraylist storing them in a string format
	 * 
	 * @param a an integer such that 1 <= a <= p - 1
	 * @param b an integer such that 0 <= b <= p - 1
	 * @param p the smallest prime number that's larger than mn-1
	 * @param m the size of the hash table
	 * @param n the number of keys
	 * @return the adversary keys
	 */
	public String adversaryKeys(int a, int b, int p, int m, int n) {
		this.h = new HashTable(a,b,p,m,n);
		
		String s = "(" + a + ", " + b + "): [";
		for(int i = 0; i < h.adversarialKeys.size(); i++) {
			int k = h.adversarialKeys.get(i).getKey();
			if(i == h.adversarialKeys.size() - 1)
				s += k + "]";
			else
				s += k + ", ";
		}
		return s;
	}
}
