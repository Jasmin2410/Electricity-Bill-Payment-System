package Uimain;

import java.util.List;
import java.util.Scanner;

import Dao.AdminDAO;
import Dao.AdminDAOImpl;
//import Dao.ConsumerDAO;
//import Dao.ConsumerDAOImpl;
import Dto.Admin;
import Dto.Bill;
import Dto.Consumer;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class Main {

	
	public static void main(String[] args) throws NoRecordFoundException {

//		ConsumerDAO user_dao = new ConsumerDAOImpl();

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

//				System.out.println("");
//
//				System.out.println("User Login");
//
//				System.out.println("");
//
//				scanner.nextLine();
//
//				System.out.println("Enter Your User_Id");
//				String user_username = scanner.nextLine();
//
//				System.out.println("Enter Your user_Password");
//				String user_password = scanner.nextLine();
//
//				try {
//					User user = user_dao.loginUser(user_username, user_password);
//
//					if (user != null) {
//
//						String active_User_Id = user.getUser_Id();
//
//						Boolean user_run = true;
//
//						while (user_run) {
//
//							System.out.println("");
//
//							System.out.println("Welcome to User Dashboard");
//
//							System.out.println("");
//
//							System.out.println("Please Enter Your Choice");
//
//							System.out.println("");
//
//							System.out.println("1. Book Reservation");
//							System.out.println("2. Cancel Reservation");
//							System.out.println("3. View Bus TimeTable");
//							System.out.println("4. Check Reservation Status");
//							System.out.println("5. Exit User Dashboard");
//							System.out.println("6. Exit Application");
//
//							int user_choice = scanner.nextInt();
//
//							switch (user_choice) {
//
//							case 1:
//								System.out.println();
//
//								System.out.println("Please Enter Booking Details From Bus Timetable: ");
//
//								System.out.println();
//
//								System.out.println("Please Enter Route Id : ");
//								int route_id = scanner.nextInt();
//
//								System.out.println("Please Enter Bus No : ");
//								int bus_no = scanner.nextInt();
//
//								System.out.println("Please Enter No. of Tickets : ");
//								int no_of_tickets = scanner.nextInt();
//								scanner.nextLine();
//
//								System.out.println("Please Enter Travel Date in YYYY-MM-DD Format : ");
//								String t_date = scanner.nextLine();
//
//								Date Travel_date = Date.valueOf(t_date);
//
//								Ticket_Booking Ticket = new Ticket_Booking(active_User_Id, route_id, bus_no,
//										no_of_tickets, Travel_date);
//
//								String result;
//								try {
//									result = user_dao.book_Ticket(Ticket, active_User_Id);
//
//									System.out.println(result);
//
//									System.out.println();
//								} catch (TicketException e1) {
//
//									System.out.println(e1.getMessage());
//								}
//
//								break;
//
//							case 2:
//								System.out.println();
//
//								System.out.println("Please Enter Booking No You Wish to Cancel: ");
//								int booking_no = scanner.nextInt();
//
//								String result_5 = user_dao.cancel_Ticket(booking_no);
//
//								System.out.println(result_5);
//
//								System.out.println();
//
//								break;
//
//							case 3:
//								System.out.println("");
//
//								System.out.println("Bus Timetable");
//
//								System.out.println("");
//
//								try {
//
//									List<Bus_Route> Timetable = admin_dao.bus_Timetable();
//
//									Timetable.forEach(t -> {
//
//										System.out.println("Bus Route No :" + t.getRoute_Id());
//										System.out.println("Bus No :" + t.getBus_No());
//										System.out.println("Bus Route Source :" + t.getSource());
//										System.out.println("Bus Route Destination :" + t.getDestination());
//										System.out.println("Bus Route Distance :" + t.getDistance());
//										System.out.println("Bus Route Fare per/Km :" + t.getFare_Per_Km());
//										System.out.println("Bus Route Date :" + t.getDay());
//										System.out.println("Bus Route Arrival Time :" + t.getArrival_Time());
//										System.out.println("Bus Route Departure Time :" + t.getDeparture_Time());
//
//										System.out.println();
//									});
//								} catch (Bus_Route_Exception e) {
//
//									System.out.println(e.getMessage());
//								}
//
//								break;
//
//							case 4:
//								System.out.println("Ticket Reservation Status ");
//
//								System.out.println();
//
//								try {
//									List<Ticket_Status> list_of_tickets = user_dao.show_Ticket_Status(active_User_Id);
//
//									list_of_tickets.forEach(t -> {
//
//										System.out.println("Ticket Booking No :" + t.getBooking_No());
//										System.out.println("Traveller's User Id :" + t.getUser_Id());
//										System.out.println("Traveller's User Name :" + t.getUser_Name());
//										System.out.println("Bus Route No :" + t.getRoute_Id());
//										System.out.println("Bus No :" + t.getBus_No());
//										System.out.println("Bus Type :" + t.getBus_No());
//										System.out.println("Bus Route Source :" + t.getRoute_Source());
//										System.out.println("Bus Route Destination :" + t.getRoute_Destination());
//										System.out.println("No. of Tickets :" + t.getNo_of_Tickets());
//										System.out.println("Bus Route Total Fare :" + t.getTotal_Fare());
//										System.out.println("Travel Date :" + t.getTravel_Date());
//										System.out.println("Bus Route Arrival Time :" + t.getArrival_Time());
//										System.out.println("Bus Route Departure Time :" + t.getDeparture_Time());
//
//										if (t.getStatus() == 1) {
//											System.out.println("Reservation Confirmation Status : Confirmed");
//										} else {
//											System.out.println("Reservation Confirmation Status : Pending");
//										}
//
//										System.out.println();
//									});
//
//								} catch (TicketException e) {
//
//									e.printStackTrace();
//
//								}
//								break;
//							case 5:
//								user_run = false;
//								break;
//
//							case 6:
//								user_run = false;
//								run = false;
//								break;
//							}
//
//						}
//
//					}
//
//				} catch (UserException e) {
//					System.out.println(e.getMessage());
//				}
//
//				break;
//				
//				case 3:
//					System.out.println("");
//
//					System.out.println("Please Enter User Details");
//
//					System.out.println("");
//					
//					scanner.nextLine();
//					
//					System.out.println("Please Enter User Name");
//					
//					String user_name = scanner.nextLine();
//					
//					System.out.println("Please Enter User Contact");
//					
//					String user_contact = scanner.nextLine();
//					
//					System.out.println("Please Enter User Email");
//					
//					String user_email = scanner.nextLine();
//					
//
//					System.out.println("Please Enter User Login Id");
//					
//					String user_login_id = scanner.nextLine();
//					
//
//					System.out.println("Please Enter User Login Password");
//					
//					String user_login_password = scanner.nextLine();
//					
//					User user = new User(user_name,user_contact,user_email,user_login_id,user_login_password);
//					
//					String result = user_dao.registerUser(user);
//					
//					System.out.println(result);
//					
//					break;
			case 4:
				System.out.println("                                           ❃ Thank You For Using The Appilcation ! ❃ ");
				run = false;
				break;
			default:
				System.out.println("                                           ❃ Please Enter A Valid Choice ! ❃");
			}
		}

	}

}