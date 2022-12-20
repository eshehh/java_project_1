package indian;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int coin;
	Deck d = new Deck();
	List<Integer> playerList = new ArrayList<>();

	public void getCard(Deck deck) {
		playerList.add(deck.deal());
	}

	public int getCoin() {
		return coin;
	}

	
	public void setCoin(int coin) {
		this.coin = coin;
	}

	public void plusCoin(int coin) {
		this.coin = this.coin + coin;
	}

	public void minusCoin() {
		this.coin = this.coin - 1;
	}
    
	public void minusCoin1(int coin) {
		this.coin = this.coin -7;
	}
	
	public int getCard() {
		return playerList.get(0);
	}

	public void pcCardShow() {
		getCard(d);
		if (getCard() < 10) {
			System.out.println("          ┌─┐");
			System.out.println(" PC의 카드 :│" + getCard() + "│");
			System.out.println("          └─┘");
			playerList.remove(0);
		} else if (getCard() >= 10) {
			System.out.println("          ┌──┐");
			System.out.println(" PC의 카드 :│" + getCard() + "│");
			System.out.println("          └──┘");
			playerList.remove(0);
		}
	}

	public void playerCardShow() {
		getCard(d);
		getCard();
		playerList.remove(0);
	}

}
