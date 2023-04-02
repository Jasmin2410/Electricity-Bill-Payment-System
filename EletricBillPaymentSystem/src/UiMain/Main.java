package Uimain;

import java.util.List;
import java.util.Scanner;

import Dao.AdminDAO;
import Dao.AdminDAOImpl;
import Dao.ConsumerDAO;
import Dao.ConsumerDAOImpl;
import Dto.Admin;
import Dto.Bill;
import Dto.Consumer;
import Dto.Transaction;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class Main {

	
	public static void main(String[] args) throws NoRecordFoundException {

		ConsumerDAO user_dao = new ConsumerDAOImpl();

		AdminDAO admin_dao = new AdminDAOImpl();

		boolean run = true;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("                                           ❃ Welcome To Electricity Bill Payment System ❃");

			System.out.println();

			System.out.println("                                                      ❃ Please Enter Your Choice ❃");

			System.out.println("");

			System.out.println("                                                           1. Admin Login");
			System.out.println("                                                           2. User Login");
			System.out.println("                                                           3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("");

				System.out.println("                                                           ❃ Admin Login ❃");

				System.out.println("");

				scanner.nextLine();

				System.out.println("                                                       ❃ Enter Your Username ❃");
				String admin_username = scanner.nextLine();

				System.out.println("                                                       ❃ Enter Your Password ❃");
				String admin_password = scanner.nextLine();

				try {
					Admin admin = admin_dao.loginAdmin(admin_username, admin_password);

					if (admin != null) {

						Boolean admin_run = true;

						while (admin_run) {

							System.out.println("");

							System.out.println("                                                   ❃ Welcome to Admin Dashboard ❃");

							System.out.println("");

							System.out.println("                                                    ❃ Please Enter Your Choice ❃");

							System.out.println("");

							System.out.println("                                                      1. Display All Consumers");
							System.out.println("                                                      2. Display Bill of Consumer");
							System.out.println("                                                      3. Display All Bill ");
							System.out.println("                                                      4. Display Paid And Pending ");
							System.out.println("                                                      5. Delete Consumer");
							
							
							System.out.println("                                                      6. Exit Admin Dashboard");
							System.out.println("                                                      7. Exit Application");

							int admin_choice = scanner.nextInt();

							switch (admin_choice) {
							case 1:
								System.out.println("");

								System.out.println("                                                           ❈ Consumers Details ❈");

								System.out.println("");

								;

								try {
									List<Consumer> listOfCon = admin_dao.DisplayAllConsumers();

									listOfCon.forEach(b -> {
										System.out.println("   		                	❈---------------------------------------------------❈                                                      ");
										System.out.println("						❈ Id                 :" + b.getId());              
										System.out.println("						❈ First Name         :" + b.getfirst_name());
										System.out.println("						❈ Last Name          :" + b.getlast_name());
										System.out.println(" 						❈ Username           :" + b.getUsername());
										System.out.println("						❈ Password           :" + b.getPassword());
										System.out.println(" 						❈ Email              :" + b.getEmail());
										System.out.println("						❈ Address            :" + b.getAddress());
										System.out.println("						❈ Mobile Number      :" + b.getMobile_number());
										System.out.println("						❈ Connection Status  :" + b.getConnection_status());
										System.out.println("    		            		❈---------------------------------------------------❈                                                      ");
										System.out.println();
									});
								} catch (SomeThingWrongException e) {

									System.out.println(e.getMessage());
								}
								
								break;
							case 2:
								System.out.println();

								System.out.println("                                                 ❈ Please Enter consumer Id You Wish to Display : ");
								int cid = scanner.nextInt();

								
								
								try {
									List<Bill> listOfCon = admin_dao.displayBillofConsumer(cid);

									listOfCon.forEach(b -> {
										System.out.println("   		                	❈---------------------------------------------------❈                                                      ");
										System.out.println("						❈ Id                 	 :" + b.getId());              
										System.out.println("						❈ Bill Number         	 :" + b.getBill_number());
										System.out.println("						❈ Consumer Id         	 :" + b.getConsumer_id());
										System.out.println(" 						❈ Bill Cycle Start Date  :" + b.getBill_cycle_start_date());
										System.out.println("						❈ Bill Cycle End Date    :" + b.getBill_cycle_end_date());
										System.out.println(" 						❈ Total Units Consumed   :" + b.getTotal_units_consumed());
										System.out.println("						❈ Fixed Charge           :" + b.getFixed_charge());
										System.out.println("						❈ Taxes                  :" + b.getTaxes());
										System.out.println("						❈ Adjustment             :" + b.getAdjustment());
										System.out.println("						❈ Bill Status            :" + b.getBill_status());
										System.out.println("						❈ Is Deleted             :" + b.getIs_deleted());										
										System.out.println("    		            		❈---------------------------------------------------❈                                                      ");
										System.out.println();
									});
								} catch (SomeThingWrongException e) {

									System.out.println(e.getMessage());
								}
								
								
								break;
							case 3:
								System.out.println("");

								System.out.println("                                                           ❈ Consumers Details ❈");

								System.out.println("");

								;

								try {
									List<Bill> listOfCon = admin_dao.displayAllBill();

									listOfCon.forEach(b -> {
										System.out.println("   		                	❈---------------------------------------------------❈                                                      ");
										System.out.println("						❈ Id                 	 :" + b.getId());              
										System.out.println("						❈ Bill Number         	 :" + b.getBill_number());
										System.out.println("						❈ Consumer Id         	 :" + b.getConsumer_id());
										System.out.println(" 						❈ Bill Cycle Start Date  :" + b.getBill_cycle_start_date());
										System.out.println("						❈ Bill Cycle End Date    :" + b.getBill_cycle_end_date());
										System.out.println(" 						❈ Total Units Consumed   :" + b.getTotal_units_consumed());
										System.out.println("						❈ Fixed Charge           :" + b.getFixed_charge());
										System.out.println("						❈ Taxes                  :" + b.getTaxes());
										System.out.println("						❈ Adjustment             :" + b.getAdjustment());
										System.out.println("						❈ Bill Status            :" + b.getBill_status());
										System.out.println("						❈ Is Deleted             :" + b.getIs_deleted());										
										System.out.println("    		            		❈---------------------------------------------------❈                                                      ");
										System.out.println();
									});
								} catch (SomeThingWrongException e) {

									System.out.println(e.getMessage());
								}
								

								break;

							case 4:
								System.out.println("");

								System.out.println("                                                           ❈ Consumers Details ❈");

								System.out.println("");

								;

								try {
									List<Bill> listOfCon = admin_dao.displayPaidAndPending();

									listOfCon.forEach(b -> {
										System.out.println("   		                	❈---------------------------------------------------❈                                                      ");
										System.out.println("						❈ Id                 	 :" + b.getId());              
										System.out.println("						❈ Bill Number         	 :" + b.getBill_number());
										System.out.println("						❈ Consumer Id         	 :" + b.getConsumer_id());
										System.out.println(" 						❈ Bill Cycle Start Date  :" + b.getBill_cycle_start_date());
										System.out.println("						❈ Bill Cycle End Date    :" + b.getBill_cycle_end_date());
										System.out.println(" 						❈ Total Units Consumed   :" + b.getTotal_units_consumed());
										System.out.println("						❈ Fixed Charge           :" + b.getFixed_charge());
										System.out.println("						❈ Taxes                  :" + b.getTaxes());
										System.out.println("						❈ Adjustment             :" + b.getAdjustment());
										System.out.println("						❈ Bill Status            :" + b.getBill_status());
										System.out.println("						❈ Is Deleted             :" + b.getIs_deleted());										
										System.out.println("    		            		❈---------------------------------------------------❈                                                      ");
										System.out.println();
									});
								} catch (SomeThingWrongException e) {

									System.out.println(e.getMessage());
								}
								
								break;
							case 5:
								System.out.println("");

								System.out.println("						❈ Please Enter consumer Details You Wish To Delete (set Inactive)");

								System.out.println("");

								System.out.println("						❈ Please Enter Consumer Id :");
								int c = scanner.nextInt();

								String result_1 = admin_dao.deleteConsumer(c);

								System.out.println(result_1);

								System.out.println();
								
								
								break;
							case 6:
								admin_run = false;
								break;
							case 7:
								System.out.println("                                                  ❃ Thank You For Using The Appilcation ! ❃ ");
								admin_run = false;
								run = false;
								break;
							default:
								System.out.println("                                                  ❃ Please Enter A Valid Choice ! ❃");

							}
						}
					}

				} catch (SomeThingWrongException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 2:

				System.out.println("");

				System.out.println("                                                           User Login                    ");

				System.out.println("");

				scanner.nextLine();

				System.out.println("                                                        Enter Your User_Id                 ");
				String user_username = scanner.nextLine();

				System.out.println("                                                      Enter Your user_Password               ");
				String user_password = scanner.nextLine();

				try {
					Consumer user = user_dao.loginConsumer(user_username, user_password);

					if (user != null) {

						Boolean user_run = true;

						while (user_run) {

							System.out.println("");

							System.out.println("                                                        Welcome to User Dashboard");

							System.out.println("");

							System.out.println("                                                        Please Enter Your Choice");

							System.out.println("");

							
							System.out.println("                                                         1. Pay Bill");
							System.out.println("                                                         2. Transaction History");
							System.out.println("                                                         3. Exit User Dashboard");
							System.out.println("                                                         4. Exit Application");

							int user_choice = scanner.nextInt();

							switch (user_choice) {

							case 1:
								
								System.out.println("");

								System.out.println("						❈ Please Enter consumer Details You Wish To Delete (set Inactive)");

								System.out.println("");

								System.out.println("						❈ Please Enter Consumer Id :");
								int c = scanner.nextInt();

								String result_1 = user_dao.PayBill(c);

								System.out.println(result_1);

								System.out.println();
								
								
								
								break;

							case 2:
								
								System.out.println();

								System.out.println("                                                 ❈ Please Enter consumer Id You Wish to Display : ");
								int cid = scanner.nextInt();

								
								
								try {
									List<Transaction> listOfCon = user_dao.View_his_own_transaction_History(cid);

									listOfCon.forEach(b -> {
										System.out.println("   		                	❈---------------------------------------------------❈                                                      ");
										System.out.println("						❈ Id                 	 :" + b.getBill_number());              
										System.out.println("						❈ Bill Number         	 :" + b.getConsumer_id());
										System.out.println("						❈ Consumer Id         	 :" + b.getBill_cycle_start_date());
										System.out.println(" 						❈ Bill Cycle Start Date  :" + b.getBill_cycle_end_date());
										System.out.println("						❈ Bill Cycle End Date    :" + b.getTotal_units_consumed());
										System.out.println(" 						❈ Total Units Consumed   :" + b.getBill_status());
										System.out.println("						❈ Bill Status            :" + b.getPayment_date());
										System.out.println("						❈ Amount Paid            :" + b.getAmount_paid());

										System.out.println("    		            		❈---------------------------------------------------❈                                                      ");
										System.out.println();
									});
								} catch (SomeThingWrongException e) {

									System.out.println(e.getMessage());
								}
								
								
								break;
							case 3:
								user_run = false;
								break;

							case 4:
								System.out.println("                                           ❃ Thank You For Using The Appilcation ! ❃ ");
								run = false;
								break;
							}

						}

					}

				} catch (SomeThingWrongException e) {
					System.out.println(e.getMessage());
				}

				break;
				
				
			case 3:
				System.out.println("                                           ❃ Thank You For Using The Appilcation ! ❃ ");
				run = false;
				break;
			default:
				System.out.println("                                           ❃ Please Enter A Valid Choice ! ❃");
			}
		}

	}

}