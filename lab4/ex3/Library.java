package lab4.ex3;

import java.util.Scanner;

public class Library {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

		Library l = new Library();
		
		while(true) {
			System.out.println("Enter the option:\n1.Book Details\n2.Journal Paper Detais\n3.Vedio Details\n4.CD Details\n5.Exit");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			  case 1: 
				  l.booksInfo(new Book());
			      
				  break;
			  case 2:
				  l.booksInfo(new JournalPaper());
			      break;
			  case 3:
				  l.mediaMethod(new Video());
			      break;
			  case 4:
				  l.mediaMethod(new CD());
			      break;
			  case 5:
				  System.exit(0);
			  
			}
				
		}
	}
	public void booksInfo(WrittenItem i) {
		
		System.out.println("The Book Number is");
		i.setIdNumber(sc.nextLine());
		System.out.println("The Book title is");
		i.setTitle(sc.nextLine());
		System.out.println("The Book Number of copies");
        i.setNumberOfCopies(Integer.parseInt(sc.nextLine()));
        System.out.println("The Author is");
        i.setAuthorName(sc.nextLine());
        if(i instanceof Book) {
        	i.print();
        }
		if(i instanceof JournalPaper) {
			System.out.println("The published year");
			((JournalPaper) i).setYearPublished(Integer.parseInt(sc.nextLine()));
			i.print();
		}
	}
	public void mediaMethod(MediaItem mi) {
		System.out.println("Enter the runtime");
		mi.setRunTime(sc.nextInt());
		if(mi instanceof Video) {
			System.out.println("The director is");
			((Video) mi).setDirectorName(sc.next());
			System.out.println("The genre is");
			((Video) mi).setGenre(sc.next());
			System.out.println("The year of release");
			((Video) mi).setYearReleased(sc.nextLine());
			((Video) mi).print();
		}
		if(mi instanceof CD) {
			System.out.println("Artist Name");
			((CD) mi).setArtist(sc.next());
			System.out.println("the genre is");
			((CD) mi).setGenre(sc.next());
			((CD) mi).print();
		}
	}

}
