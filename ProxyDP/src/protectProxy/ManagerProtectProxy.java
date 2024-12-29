package protectProxy;

public class ManagerProtectProxy {
	
	public void standartWork() {
		
		ProxyBoss yesAuthorizedProxyBoss= new ProxyBoss(true); 
		ProxyBoss noAuthorizedProxyBoss= new ProxyBoss(false); 
		RealBoss realBoss = new RealBoss();
		
		System.out.println(yesAuthorizedProxyBoss.listen());
		System.out.println(noAuthorizedProxyBoss.listen());
		System.out.println(realBoss.listen());
		System.out.println(realBoss.developVision());	
	}
}
