package protectProxy;

public class ProxyBoss implements IBoss {
	
	private final RealBoss realBoss;
	private final boolean isAuthorized;
	
	public ProxyBoss(boolean isAuthorized) {
		this.realBoss = new RealBoss();
		this.isAuthorized = isAuthorized;
	}
	
	@Override
	public String listen() {
		if(isAuthorized) {
			return this.realBoss.listen();
		} else {
			return "Yetki YOK!!";
		}		
	}

}
