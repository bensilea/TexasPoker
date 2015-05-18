package texasPoker;

public class Card{
	//point
	public static final int ONE=1;
	public static final int TWO=2;
	public static final int THREE=3;
	public static final int FOUR=4;
	public static final int FIVE=5;
	public static final int SIX=6;
	public static final int SEVEN=7;
	public static final int EIGHT=8;
	public static final int NINE=9;
	public static final int TEN=10;
	public static final int J=11;
	public static final int Q=12;
	public static final int K=13;
	//color
	public static final String SPADES="SPADES";
	public static final String HEARTS="HEARTS";
	public static final String CLUBS="CLUBS";
	public static final String DIAMONDS="DIAMONDS";
	//one card
	
	public Card(){
		CardInfo mCard=new CardInfo();
	}
}

class CardInfo{
	public int point;
	public int color;
	public int flag;
	
	CardInfo(){}

	CardInfo(int p,int c,int f)
	{
		point=p;
		color=c;
		flag=f;
	}
}
