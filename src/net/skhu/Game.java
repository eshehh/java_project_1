
package net.skhu;

public class Game {
	private User user;
	private Ai ai;
	private int drawCoin;
	static public int round;

	public Game(){
		user = new User();
		ai = new Ai();
		round = 1;
	}
	public Ai getAi(){ //ai 불러오기
		return ai;
	}
	public int getRound(){
		return round;
	}
	public void userDie(){
		ai.setUserCard((int)user.userCardDeck().get(round-1));
	}
	public User getUser(){ //user불러오기
		return user;
	}
	public void setRound(){
		round=round+1;
	}
	public int getDrawCoin() {
		return drawCoin;
	}
	//비겼을때 코인저장
	public void setDrawCoin(int drawCoin) {
		this.drawCoin=drawCoin;
	}

	public String winner()
	{
		return user.getUserCoin() >ai.getAiCoin() ? "user가 승리하고 ai가 졌습니다" : "ai가  승리하고  user가 졌습니다";
	}

	public boolean exhaustion()
	{
		if(user.getUserCoin()<=0 || user.getUserCoin()<=0)
			return true;
		else
			return false;
	}

	public String coinExhaustion()
	{
		if(user.getUserCoin()<=0)
			return "ai가 승리하고 user가 졌습니다";
		else
			return "user가 승리하고 ai가 졌습니다";
		
		
	}
	

}