import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		logininfo.put("Ryan","Password");
		logininfo.put("name2","Pizza");
		logininfo.put("Ella","abc123");
	}
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
