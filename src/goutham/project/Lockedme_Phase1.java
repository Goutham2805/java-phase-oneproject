package goutham.project;


import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lockedme_Phase1 {

	public static void main(String[] args) throws NoSuchElementException {
		System.out
				.println("::::::::::::::::::::::: Welcome to our Company \"LOCKERS PVT. LTD\" :::::::::::::::::::::: \n"
						+ "::::::::::::::::::::::: Our Project name is \"LOCKEDME.COM\" ::::::::::::::::::::::::::::: \n"
						+ "::::::::::::::::::::::: This Proj is developed by \"Goutham Reddy S \"::::::::::::::::::::::::::");
		File maindir = new File("files");
		boolean value = maindir.mkdir();

		int d = 0;
		do {
			try {
			System.out.println("\nPlease choose any one option: \n" + "1.To see the files in ascending order \n"
					+ "2.To perform operation on files \n" + "3.To close the Application");
			Scanner input = new Scanner(System.in);
			System.out.println("\nEnter the Option here: ");
			int name = input.nextInt();
			System.out.println("\nThe option choosen by you is: " + name);

			switch (name) {
			// case 1 start
			case (1): {

				File file = new File("files\\");
				if (file.isDirectory()) {

					String arr[] = file.list();

					if (arr.length > 0) {
						System.out.println("\nThe directory " + file.getPath()
								+ " is not Empty!\n The files in the directory in ascending order are as follows:\n");

						String[] fileList = file.list();
//	
						String arr1[] = file.list();
						String temp;
						int n = arr1.length;
						for (int j = 0; j < n - 1; j++) {
							for (int i = j + 1; i < n; i++) {
								if (arr1[j].compareTo(arr1[i]) > 0) {
									temp = arr1[j];
									arr1[j] = arr1[i];
									arr1[i] = temp;
								}
							}
						}
						for (int i = 0; i < n; i++) {
							System.out.println("File " + (i + 1) + " is " + arr[i]);
						}

//			

						System.out.println("\nYour request has been successfully processed");
					} else {
						System.out.println("\nThe directory " + file.getPath() + " is Empty!");

					}
				}
				break;
			}

			case (2): {
				do {
					System.out.println("\nWelcome to File Operations in a Directory");
					System.out.println(
							"1.Add a File\n" + "2.Delete a File\n" + "3.Search a file\n" + "4.Go to Main Menu");
					Scanner inp = new Scanner(System.in);
					System.out.println("Enter the Option here: ");
					int p = inp.nextInt();
					System.out.println("\nThe option choosen by you is: " + p);
					switch (p) {

					case (1): {
						System.out.println("Welcome to Adding a File Operation: ");
						Scanner inp1 = new Scanner(System.in);
						System.out.println("Please enter the name of the file you want to created: ");
						String p1 = inp1.nextLine();
						boolean f = false;

						File stockFile = new File("files\\" + p1);
						if (stockFile.exists()) {
							System.out.println("\nFile Already Exists");
						} else {
							try {
								f = stockFile.createNewFile();
							} catch (IOException ioe) {
								System.out.println("Error while Creating File in Java" + ioe);
							}
							System.out.println("\nThe file is created and its path is " + stockFile.getPath());
						}
						break;
					}
					case (2): {
						System.out.println("\nWelcome to \'Delete a File\' Operation: ");
						Scanner inp2 = new Scanner(System.in);
						System.out.println("\nPlease Enter the file name you want to delete: ");
						String p2 = inp2.nextLine();
						File file = new File("files\\" + p2);
						if (file.exists()) {
							if (file.delete()) {
								System.out.println("\nFile deleted successfully");
							} else {
								System.out.println("\nFailed to delete the file");
							}
						} else {
							System.out.println("\nFile Does not exist ");
						}
						break;
					}
					case (3): {
						System.out.println("\nWelcome to \'Search a file\' Operation: ");
						Scanner inp2 = new Scanner(System.in);
						System.out.println("\nPlease Enter the file name you want to search: ");
						String p2 = inp2.nextLine();
						File file = new File("files\\" + p2);
						if (file.exists()) {
							System.out.println("\nFile exists in the directory");
						} else {
							System.out.println("\nFile Does not exits");
						}

						break;
					}
					case (4): {
						System.out.println("\n------Welcome back to Main menu :-)--------");
						break;
					}
					default: {
						System.out.println("\nPlease Choose correct option: ");
						break;
					}
					}
					d = p;
				} while (d != 4);
				break;

			}

			case (3): {
				System.out.println("\nYou have successfully logged out of the Application");
				break;
			}

			default: {
				System.out.println("\nPlease Choose the Correct Option from below menu");
				break;
			}

			}
			d = name;
			}catch(Exception E) {
				System.out.println("\n please enter proper input");
			}
		} while (d != 3);
		
		}
	
		
	}


