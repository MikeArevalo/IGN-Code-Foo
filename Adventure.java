import java.io.*;
public class Adventure {
	static String option1 = "blah";
	static String option2 = "blah";
	static String option3 = "blah";
	static String GFoption1="blah";
	static String PUoption="blah";
	static String PBoption="blah";
	static String PBoption2="blah";
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int  i = 0;
	
	
	
public static void main(String argsp[]) throws IOException{
	String[] wake=new String[10];
	wake[0]="the day after finals";
	wake[1]="strangely craving peanut butter and jelly";
	wake[2]="still feeling tired despite being asleep for 10 hours";
	wake[3]="back in his bed scared as hell, he looks around and realizes his Pokemon swag is missing";
	wake[4]="depressed";
	wake[5]="so happy he could dress in a big red suit while wearing a white beard shouting Happy Non denominational holidays everyone!";
	wake[6]="and watches the Microsoft E3 press conference at 9:30 AM, he predicts that Forza 4 will be shown (duh)";
System.out.println("Note: this choose your own adventure is based on true events (sort of)\n");
	
	

	while(!(option1.equals("0"))){

	System.out.print("Mike wakes up "+ wake[i] + ", he decides to \n1. Sleep more \n2. Listen to an IGN podcast\n3. DANCE PARTY!\n\tchoose an option:");

	option1 = br.readLine();
	
	if (option1.equals("1")){
		System.out.println("\nMike falls asleep.\n");
		i=2;
		continue;
	}
	if (option1.equals("2")){
		tree2();
		continue;
	}
	if (option1.equals("3")){
		System.out.println("\nIT'S PEANUT BUTTER JELLY TIME! PEANUT BUTTER JELLY TIME!\nMike passes out from all the peanut butter dancing.\n");
		i=1;
		continue;
	}
	
	}
	
}

public static void tree2() throws IOException{
	System.out.print("\nMike turns on his Zune. he scrolls past his Weezer and Video Games Live entries to listen to the IGN podcast: \n1. GirlFight\n2. Podcast Beyond\n\tchoose an option: ");
	option2 = br.readLine();
	
	if (option2.equals("1")){
		System.out.println("\nNicole Tanner introduces Audrey Drake, Kristine Steimer, Dana Jungleward and Mega Sullivan.\nLots of BioWare love goes around the room. You then decide to \n1. Make fun of Audrey, as reccomended by the Nintendo Voice chat crew. \n2. Take note of the Code Foo challenge. \n3. What's that smell?\n\tchoose an option: ");
		
		tree3(option2);
		return;
	}
	
	
	if (option2.equals("2")){
		System.out.println("\nEr we eh eh eh brndzt come come come get some, podcast beyond turns on");
		Beyond();
	}
}

public static void tree3(String answer) throws IOException{	//girlfight
	GFoption1 = br.readLine();
	
	if (GFoption1.equals("1")){
		System.out.println("A crowd of Audrey FanBoys break down his front door, chasing after him with pitch forks.\nas Mike runs away he jumps off the second story of his house, landing in another dimension where DEMON Hatefield says\nMike, you must work at IGN, or I will devour your Yorkie, Einstein!");
		i=3;
		return;
	}
	
	if (GFoption1.equals("2")){
		System.out.println("\nMike contemplates ways of being creative and decides to write a song about IGN");
		madLib();
	
	conclusion();
		
	}
	
	if (GFoption1.equals("3")){
		System.out.println("\nSomehow, Jessica Chobot, who is in LA, sets fire to the IGN offices AGAIN by leaving one of her beautification products on\nGREAT SCOTT! A time paradox throws him back in time");
		return;	
	}
}

public static void Beyond() throws IOException{
	System.out.print("Greg Miller joke about being at the airport with the use of nearby fan.\nThe PSN is live once again\nColin talks about Singularity\nSuddenly, the Undertaker bursts through his Zune and demands him to choose one of the three:\n1. Submit Mike's band The Haven to be played at the end of the podcast\n2. Mute the podcast since the hilarity has caused you to laugh in the public library.\n3. Apply to that Code Foo thing they were talking about\n\tchoose an option:");
	PBoption = br.readLine();
	
	if (PBoption.equals("1")){
		System.out.println("After being named the official Beyond University band ions ago, Mike's band The Haven is finally played at the end of Podcast Beyond!\n");
		i = 5;
		return;
	}

	
	if (PBoption.equals("2")){
		System.out.println("\nMike turns off his Zune. Suddenly, he is transported to E3 where he wishes he were RIGHT NOW as he is coding this!");	
		i = 6;
		return;
	}
	
	if (PBoption.equals("3")){
		System.out.println("\nMike answers questions 1 and 2 without much difficulty and wrote a program for the 3rd question that allowed the knight to traverse the chessboard in just 21 moves because he's awesome! \nMike then starts contemplating what to do about the 4th question.. Do something creative.. \nhmmmm.. Does Mike:\n1. Write a song about IGN\n2. Write a rap about IGN\n3. Make a Text adventure about thinking of something to make\n");
		PBoption2 = br.readLine();
		
		if(PBoption2.equals("1")){
		System.out.println("Mike spends 3 days writing a song about how awesome IGN is then begins to record it.\nMike's computer then crashes and somehow corrupts the studio data leaving him to start from scratch.\nMike cries himself back to sleep\n");
		i=4;
		return;
		}
		if(PBoption2.equals("2")){
		System.out.println("Mike doesn't rap. With the help of Turn 10, he rewinds this program, almost like he was cheating\n");
		return;
		}
		
		if (PBoption2.equals("3")){
		
		madLib();
		conclusion();
		}		
}
}

public static void madLib(){
	System.out.println("With having spent 3 days writing and recording a song, and now running out of time (and parents asleep), \nMike had no choice but to write a text adventure.\nhe quickly thinks of story branches.\nYou become impressed with Michael Arevalo's entry (not necessarily with the 4th question) and decide to call him for a phone interview :).");
}

public static void conclusion(){
	System.out.println("\nBut seriously, thank you for giving me the oppurtunity. I have been a fan of IGN for a long, long time and have met with some of the editors the past \nfew Comic Cons. Having met some of the staff and listening to all the podcasts, I feel like a friend to many of you. This is something I feel is unique with IGN, \nthe personality that shines through each article, podcast, and review. I would love the chance to become part of this, even if for just 6 weeks.");
	System.exit(0);
}

}//end of class


