
public class accountClass {
	double mbalance;
	public accountClass(){
		mbalance = 0;
	}
	public accountClass (double inbal){
		mbalance = inbal;
	}
	public void debit(double inamount){
		mbalance+= inamount;
	}
	public void credit(double inamount){
		mabalance-=inamount;
	}
	public double getBalance(){
		return mbalance;
		}
	}
//	int initial;
//	int credit;
//	int debit;
//	int result;
//	public accountClass(int initial, int credit, int debit){
//		setInitial(initial);
//		setCredit(credit);
//		setDebit(debit);
//		returnResult(initial, credit, debit);
//		
//	}
//	public int setInitial(int x){
//		return x;
//		
//	}
//	public int setCredit(int y){
//		return y;
//	}
//	public int setDebit(int z){
//		return z;
//	}
//	public int returnResult(int x, int y, int z){
//		int r = x + y - z;
//		System.out.print(r);
//		return 0;
//	}
//}
