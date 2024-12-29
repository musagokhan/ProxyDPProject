package protectProxy;

import java.util.Random;

public class RealBoss implements IBoss {
	
	public String developVision() {
		return "Patron vizyon gelistiriyor";
	}

	@Override
	public String listen() {
		Random random = new Random();
		return listenDecision(random.nextBoolean());
	}

	private String listenDecision(boolean niceDecision) {
		if (niceDecision) {
			return "Karar : ceza alan yok.";
		} else {
			return "Karar : ceza verilecek";
		}
	}
	
}
