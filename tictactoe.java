
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class tictactoe {
	static Scanner in =new Scanner(System.in);
	static String lin="---";
	static String user;
	static String[][] ar= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	static String computer;
	static boolean[][] points= {{true,true,true},{true,true,true},{true,true}};
	static int lastchance;
	static int lastchanceC;
	static String empt;
	
	public static void main(String[] args) throws InterruptedException {
		start();
		input();
		playFirstChance();
		for(int i=0;i<3;i++) {
			moveOn();
		}
		lastChance();
	}
	private static void lastChance() throws InterruptedException {
		if(Math.random()>0.4) {
			System.out.println("there's just one place left i'll fill it for you");
			fillempty();
		//			TimeUnit.MILLISECONDS.sleep(1500);
			printBoard();
			
		}
		else
		input();
		if(didwon(user)) {
			userwon();
			return;
		}
		System.out.println();
		boring();
		
	}
	private static void moveOn() throws InterruptedException {
		input();
		if(didwon(user)) {
			userwon();
			return;
		}
		if(isCwinning()) {
			mychance(true);
			printBoard();
			compwon();
			return;
		}
		cstrk();
		printBoard();
		
	}
	public static void playFirstChance() throws InterruptedException {
		mychance(false);
		if(lastchance==4)
		{
			ar[0][0]=computer;
			lastchanceC=0;
		}
		else {
			if(lastchance%2==0) {
				if(lastchance==0)
				{
					ar[0][2]=computer;
					lastchanceC=2;
				}
				else if(lastchance==2)
				{
					ar[2][0]=computer;
					lastchanceC=6;
				}
				else if(lastchance==6)
				{
					ar[0][2]=computer;
					lastchanceC=2;
				}
				else
				{
					ar[0][0]=computer;
					lastchanceC=0;
				}
			}
			else {
			ar[1][1]=computer;
			lastchanceC=4;
			}
		} 
		printBoard();
	}
	
	
	
	private static void boring() throws InterruptedException {
		System.out.println("WHAT");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("A");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("BORING");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("MATCH !!!");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("!!!!");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("REALLYY!!");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("BO-RING!!");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("NO");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("ONE");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("WON");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("THE");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("MATCH");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("IT'S");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("A");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("TIE");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("TIE MEANS NO ONE WON ,NO ONE LOST");
		TimeUnit.MILLISECONDS.sleep(500);
	}



	private static void fillempty() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(ar[i][j]==empt)
				{
					ar[i][j]=user;
					lastchance=i*3+j;
					return;
				}
			}
		}
	}



	private static void mychance(boolean b) throws InterruptedException {
		System.out.println("Now its my turn");
		TimeUnit.MILLISECONDS.sleep(500);
		if(b) {
			System.out.println("nice move");
			TimeUnit.SECONDS.sleep(1);
		}
		if(Math.random()>0.5) {
			if(Math.random()>0.67) {
				System.out.println("m m m m m m m m m!!!!!!!");
			}
			else if(Math.random()<0.33) {
				System.out.println("Let me think!!");
			}
			else
				System.out.println("!!!!!!!!!!!!!!!");

			TimeUnit.SECONDS.sleep(1);
		}
	}



	private static void compwon() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.print("yay i won  ");
			int l=(int)(Math.random()*100);
			System.out.println(l);
		for(int i=0;i<l;i++) {
			int k=(int)(Math.random()*50);
			for(int j=0;j<k;j++) {
				if(Math.random()>0.4) {
					System.out.println("You lost  ");
					TimeUnit.MILLISECONDS.sleep(10);
				}
				System.out.print("Yay i WON  ");
				TimeUnit.MILLISECONDS.sleep(10);
			}
				System.out.println();
		}
		System.exit(0);
	}



	private static void userwon() throws InterruptedException {
		
		if(Math.random()>0.67) {
			System.out.println("ha i don't wnna play play it yourself");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("congrats you won");
		}
		if(Math.random()>0.55555555) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println("by the way you won by cheating");
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println("you won");
		System.exit(0);
	}



	private static void cmptr() throws InterruptedException {
		mychance(false);
		int ii=0,jj=0;
		int maxtc=0;
		int lmax=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				maxtc++;
				if(ar[i][j].equals(empt)) {
					maxtc++;
				if(points[0][i])
					maxtc++;
				if(points[1][j])
					maxtc++;
				int in=i*3+j;
				if(in%4==0&&points[2][0])
					maxtc++;
				if(points[2][1]&&in%2==0&&i>1&&i<7)
					maxtc++;
				if(maxtc>lmax) {
					lmax=maxtc;
					ii=i;
					jj=j;
				}
			}
		}
			try{
				
			}
			finally{}
		}
		if(ar[ii][jj].equals(empt)) {
			ar[ii][jj]=computer;
			lastchanceC=ii*3+jj;
		}
		else
			System.out.println("what the fuckk(WTF)");
	}



	private static void cstrk() throws InterruptedException {
		int cr=0,cc=0,cd1=0,cd2=0;
		for(int i=0;i<3;i++) {
			if(ar[lastchance/3][i].equals(user))
				cr++;
			if(ar[i][lastchance%3].equals(user))
				cc++;
			if(ar[i][i].equals(user))
				cd1++;
			if(ar[i][2-i].equals(user))
				cd2++;
		}
		if(cd1==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][i].contentEquals(empt)) {
					ar[i][i]=computer;
					mychance(true);
					return ;
				}
			}
		}
		if(cd2==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][2-i].contentEquals(empt)) {
					ar[i][2-i]=computer;
					mychance(true);
					return;
				}
			}
		}
		if(cr==2) {
			for(int i=0;i<3;i++) {
				if(ar[lastchance/3][i].contentEquals(empt)) {
					ar[lastchance/3][i]=computer;
					mychance(true);
					return;
				}
			}
		}
		if(cc==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][lastchance%3].contentEquals(empt)) {
					ar[i][lastchance%3]=computer;
					mychance(true);
					return;
				}
			}
		}
		cmptr();
	}



	private static boolean isCwinning() {
		int cr=0,cc=0,cd1=0,cd2=0;
		for(int i=0;i<3;i++) {
			if(points[0][lastchanceC/3]&&ar[lastchanceC/3][i].equals(computer))
				cr++;
			if(points[1][lastchanceC%3]&&ar[i][lastchanceC%3].equals(computer))
				cc++;
			if(points[2][0]&&ar[i][i].equals(computer))
				cd1++;
			if(points[2][1]&&ar[i][2-i].equals(computer))
				cd2++;
		}
		if(cr==2) {
			for(int i=0;i<3;i++) {
				if(ar[lastchanceC/3][i].contentEquals(empt)) {
					ar[lastchanceC/3][i]=computer;
					return true;
				}
			}
		}
		if(cc==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][lastchanceC%3].contentEquals(empt)) {
					ar[i][lastchanceC%3]=computer;
					return true;
				}
			}
		}
		if(cd1==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][i].contentEquals(empt)) {
					ar[i][i]=computer;
					return true;
				}
			}
		}
		if(cd2==2) {
			for(int i=0;i<3;i++) {
				if(ar[i][2-i].contentEquals(empt)) {
					ar[i][2-i]=computer;
					return true;
				}
			}
		}
		return false;
	}



	private static void points(){
		int i=lastchance;
		
		points[0][i/3]=false;
		points[1][i%3]=false;
		if(i%2==0) {
			if(i%4==0) {
				points[2][0]=false;}
			if(i>1&&i<7)
				points[2][1]=false;
		}
	}
	private static void input() throws InterruptedException {
		System.out.println("Now its your turn");
		TimeUnit.MILLISECONDS.sleep(600);
		System.out.print("Enter your choice");
		System.out.println();
		String ch=in.nextLine();
			while(ch.isEmpty())
				ch=in.nextLine();
		if(ch.length()!=1||ch.charAt(0)-49<0||ch.charAt(0)-49>8) {
			System.out.println("You can not enter here");
			input();
			return;
		}
		byte i=(byte) (ch.charAt(0)-49);
		if(ar[i/3][i%3].equals(empt)) {
				ar[i/3][i%3]=user;
				lastchance=i;
			}
		else {
			System.out.println("You can not enter here");
			input();
			return;
		}
		printBoard();
		points();
	}
	
	private static boolean didwon(String userr) {
		boolean cwin = true;
		boolean rwin = true;
		for(int i=0;i<3;i++) {
			if(rwin&&!(ar[lastchance/3][i].equals(userr)))
				rwin=false;
			if(cwin&&!(ar[i][lastchance%3].equals(userr)))
				cwin=false;
		}
		if(cwin||rwin)
			return true;
		if(lastchance%2==0) {
			if(lastchance%4==0) {
				if(ar[0][0].equals(userr)&&ar[1][1].equals(userr)&&ar[2][2].equals(userr))
					return true;
			}
			if(lastchance>1&&lastchance<7) {
				if(ar[0][2].equals(userr)&&ar[1][1].equals(userr)&&ar[2][0].equals(userr))
					return true;
			}
		}
		return false;
	}
	private static void entr() {
		System.out.println("press enter to continue");
		in.nextLine();
	}
	
	private static void empty() {
		String s=" ";
		for(int i=1;i<user.length();i++) {
			s=s+" ";
			lin=lin+"-";
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				ar[i][j]=s;
		}
		empt=s;
	}
	
	private static void printBoard() {
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println(" "+ar[i][0]+" | "+ar[i][1]+" | "+ar[i][2]);
			if(i<2) {
				System.out.println(lin+"+"+lin+"+"+lin);
			}
		}

		System.out.println();
		System.out.println();
	}

	private static void start() throws InterruptedException {
		System.out.println("lets play the game");
		entr();
		System.out.println("enter what symbol you want to use");
		user=in.nextLine().trim();
		while(user.isEmpty())
			user=in.nextLine().trim();
		computer=findComp();
		System.out.println();
		System.out.println("& I WILL USE   "+computer);
		System.out.println();
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("and your Symbol is "+user);
		TimeUnit.MILLISECONDS.sleep(600);
		printBoard();
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("so this is the game board ");
		System.out.println();
		TimeUnit.MILLISECONDS.sleep(1399);
		System.out.println("in order to place your symbol you need to select the loction's number");
		empty();
		entr();
		TimeUnit.MILLISECONDS.sleep(3000);
		printBoard();
	}
	
	private static String findComp() {
		user=user.toUpperCase();
		if(user.equals("X"))
			return "O";
		if(user.equals("O"))
			return "X";
		if(user.length()==0) {
			user="@";
			return "$";}
		String comp="";
		{
			if(Math.random()>0.6) {
				String co="Computer";
				for(int i=8;i<user.length();i+=8) {
					comp+=co;
				}
				comp+=co.substring(0, user.length()%8);
				return comp;
			}
			else {

				String Alpha = "qwrtypsdfghjklmnbvcxz";
				int la=Alpha.length();
				String num="0123456789";
				int ln=num.length();
				String vowel="aeiouy";
				int vl=vowel.length();
				String spcl="!@#$%^&*()+=-~<>?/@#$%^&*(";
				int lsp=spcl.length();
				for(int i=0;i<user.length();i++) {
					char ch=user.charAt(i);
					if(Character.isLetter(ch)) {
						if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y') {
							comp+=vowel.charAt((int)(Math.random()*vl));
						}
						else {
							comp+=Alpha.charAt((int)(Math.random()*la));
						}
						if(i==0)
							comp.toUpperCase();
					}
					else if(Character.isDigit(ch)) {
						comp+=num.charAt((int)(Math.random()*ln));
					}
					else {
						comp+=spcl.charAt((int)(Math.random()*lsp));
					}
				}
				
			}
		}
		if(comp.equals(user))
			return findComp();
		return comp;
	}
}
