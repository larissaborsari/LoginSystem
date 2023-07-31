package LoginSystem;

import java.util.HashMap;

public class IdAndPassword {
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	IdAndPassword(){
		
		loginInfo.put("user1", "iluvpizza");	
		loginInfo.put("user2", "iluvfries");
		loginInfo.put("user3", "iluvchicken");
	}

}
