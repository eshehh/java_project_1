package indian;

public class RuleExplain {
	public static void explain() {
		System.out.println("┌==============================================================================┐");
		System.out.println("  룰 설명 :1. 카드는 1~10까지 숫자가 적힌 카드 2세트가 있습니다.");		
		System.out.println("         2. 한 라운드에 카드 하나 씩 PC와 플레이어에게 랜덤으로 나누어 줍니다.(총 20라운드)");
		System.out.println("         3. 플레이어는 PC의 카드만 보고 베팅을 해야합니다.");
		System.out.println("         4. 베팅은 1개부터 가지고 있는 코인-1개까지 가능합니다.");
		System.out.println("         5. 베팅을 포기하실 경우 코인 1개가 줄어듭니다.");
		System.out.println("         6. 플레이어의 카드가 더 높을 경우 베팅한 코인의 2배를 드리고, 낮을 경우 베팅한 코인은 사라집니다.");
		System.out.println("         7. 베팅을 포기했을때 플레이어의 카드가 10일 경우 페널티로 코인 7개가 차감됩니다.");
		System.out.println("         8. 코인이 100개가 되거나 20라운드까지 갔을 때 코인이 컴퓨터보다 많으면 플레이어의 승리입니다.");
		System.out.println("                        그 이외의 경우는 PC의 승리로 돌아갑니다. ");
		System.out.println("└==============================================================================┘");
	}
}
