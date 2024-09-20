// Written by Zwe Htet Aung
// Wednesday, September 18, 2024
// Lab 9 
// This program compresses files by 80% of its size.
// It then stores those files in a storage media.

import java.util.Scanner;

public class Compress_files
{
	public static void main(String[] args)
	{
		int block, file;
		Scanner keyboard = new Scanner(System.in);
		System.out.println 
		("How many 512-byte blocks are available on the storage device?");
		block = keyboard.nextInt ();
		
		while (block > 0)
		{
			System.out.println ("How big is the file in bytes?");
			file = keyboard.nextInt ();
			int newFile = file * 80 / 100;
			int newBlock = newFile / 512;

			if (newBlock%512 >0)
			{
				newBlock += 1;
			}
			
			if (block > newBlock)
			{
				block -= newBlock;
				System.out.println 
					   ("The file will be compressed to " + 
					   newFile + " bytes. " + 
					   "That will take " + newBlock + 
					   " blocks. " + "You have " 
					   + block + " blocks available.");
			}
			else 
			{
				System.out.println 
					   ("The file will be compressed to " + 
					   newFile + " bytes. " + 
					   "That will take " + newBlock + 
					   " blocks. " + "You have only " 
					   + block + " blocks available.");
				block = -1;
			}			
		}
	}
}
		
		