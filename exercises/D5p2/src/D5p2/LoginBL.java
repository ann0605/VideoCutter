package D5p2;

public class LoginBL {
	private LoginBean loginBean;
	private LoginBL(LoginBean userBean){
		this.loginBean= userBean;
	}
	
	public boolean isAuth(){
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();
		if(username!=null){
			return username.equals(loginBean.getPassword());
		}else{
			return false;
		}
	}
	

}
