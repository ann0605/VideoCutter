package midterm2Prep;

public class stopWatch {
	private long startTime; 
	private long endTime;

	public stopWatch(){//constructor always has to have the same name as the class
		startTime = System.currentTimeMillis();

	}
	//static?? -- want each instance to have its own version
	public long getStartTime(){
		return startTime;
	}
	public long getStopTime(){
		return endTime;
	}
	public  void start(){
		startTime = System.currentTimeMillis();
		
	}
	public  void stop(){
		endTime = System.currentTimeMillis();
		
	}
	public long  getElapsedTime(){
		long elapsedTime = endTime - startTime;
		return elapsedTime;
	}
	

}