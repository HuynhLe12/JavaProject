import java.util.Scanner;

public class menu {
	public menu() {

		Vert vA = new Vert("A");
		Vert vB = new Vert("B");
		Vert vC = new Vert("C");
		Vert vD = new Vert("D");
		Vert vE = new Vert("E");

		vA.addNeighbour(new Edge(5, vA, vB));
		vB.addNeighbour(new Edge(5, vB, vA));
		vB.addNeighbour(new Edge(6, vB, vC));
		vB.addNeighbour(new Edge(4, vB, vD));
		vC.addNeighbour(new Edge(6, vC, vB));
		vC.addNeighbour(new Edge(5, vC, vD));
		vC.addNeighbour(new Edge(3, vC, vE));
		vD.addNeighbour(new Edge(4, vD, vB));
		vD.addNeighbour(new Edge(5, vD, vC));
		vD.addNeighbour(new Edge(2, vD, vE));
		vE.addNeighbour(new Edge(3, vE, vC));
		vE.addNeighbour(new Edge(2, vE, vD));

		InformationManagement PhoneA = new InformationManagement();
		PhoneA.enQueueVertA("Can you tell me about services of your company?");
		PhoneA.enQueueVertA("I can not recieve messages from my friends.");
		PhoneA.enQueueVertA("I want to subscribe to a messaging service.");
		InformationManagement PhoneB = new InformationManagement();
		PhoneB.enQueueVertB("I can not send the message.");
		PhoneB.enQueueVertB("I ran into troubles. Can you help me?");
		PhoneB.enQueueVertB("Hell, who are you?");
		InformationManagement PhoneC = new InformationManagement();
		PhoneC.enQueueVertC("Can you help me explain somthing?");
		PhoneC.enQueueVertC("I want to subscribe to some services.");
		PhoneC.enQueueVertC("Can you help me?");
		InformationManagement PhoneD = new InformationManagement();
		PhoneD.enQueueVertD("My phone number is not working");
		PhoneD.enQueueVertD("I have some problem.");
		PhoneD.enQueueVertD("I need you help.");
		InformationManagement PhoneE = new InformationManagement();
		PhoneE.enQueueVertE("I want to send a message to my friend");
		PhoneE.enQueueVertE("How to send a message?");
		PhoneE.enQueueVertE("How to rrecieve a message?");

		InformationManagement StoreALLIM = new InformationManagement();
		InformationManagement StoreALLWay = new InformationManagement();
		InformationManagement StoreALL_Latency = new InformationManagement();
		InformationManagement StoreAll_Station = new InformationManagement();
		InformationManagement StoreAll_Phone = new InformationManagement();
		InformationManagement StoreAllRe_Phone = new InformationManagement();

		int n = 0;
		int m = 0;
		int l = 0;

		int TA = 0;
		int TB = 0;
		int TC = 0;
		int TD = 0;
		int TE = 0;
		
		String phoneNumberA = "099900123";
		String phoneNumberB = "091234232";
		String phoneNumberC = "098767784";
		String phoneNumberD = "097876999";
		String phoneNumberE = "092323522";
		// Menu
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("1. Send message");
			System.out.println("2. View message history");
			System.out.println("3. View operation of each station.");
			System.out.println("4. Export all information to a File");
			System.out.println("5. Exit");
			System.out.println("Please enter your choosing: [1- 5]");
			int choose = input.nextInt();
			switch (choose) {
				case 1:
					for (int i = 1; i <= 12; i++) {
						double dk1 = i % 2;
						double dk2 = i % 3;
						double dk3 = i % 4;
						if (dk1 == 0 && n <= 3) {
							n = n + 1;

							switch (n) {
								case 1:
									// Show Point A
									System.out.print("The message wait to send is: ");
									PhoneA.TraverseQueueVertA();
									System.out.println();
									String deqA1 = (String) PhoneA.dequeueVertA();
									System.out.println("Send Message: " + deqA1);
									// Push into history of station A
									PhoneA.pushVert(deqA1);
									PhoneB.enQueueVertB(deqA1);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack A: ");
									PhoneA.TraverseVert();
									System.out.println();
									int TA1 = 2;
									TA = TA + TA1;
									System.out.print("Time from A To B: " + TA1);
									System.out.println();
									// Store Latency
									PhoneA.pushVertLatency(TA1);
									// Way of message
									PhoneA.Direction = "[" + vA + " - " + vB + "]";
									PhoneA.pushVertw(PhoneA.Direction);
									// Show station when send message
									PhoneA.Ts = i;
									PhoneA.pushVertstation(PhoneA.Ts);
									// Store phone number send into stack
									PhoneA.Phoneall = phoneNumberA + "1";
									PhoneA.pushVertpNum(PhoneA.Phoneall);
									// Store phone number receiver into stack
									PhoneA.PhonenumReAll = phoneNumberB + "1";
									PhoneA.pushVertpNumRe(PhoneA.PhonenumReAll);
									break;
								case 2:
									// Show Point A
									String deqA2 = (String) PhoneA.dequeueVertA();
									System.out.println("Send Message: " + deqA2);
									PhoneA.pushVert(deqA2);
									PhoneC.enQueueVertC(deqA2);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack A: ");
									PhoneA.TraverseVert();
									System.out.println();
									int TA2 = 4;
									TA = TA + TA2;
									System.out.print("Time from A To C: " + TA2);
									System.out.println();
									// Store Latency
									PhoneA.pushVertLatency(TA2);
									// Way of message
									PhoneA.Direction = "[" + vA + " - " + vC + "]";
									PhoneA.pushVertw(PhoneA.Direction);
									// Show station when send message
									PhoneA.Ts = i;
									PhoneA.pushVertstation(PhoneA.Ts);
									// Store phone number into stack
									PhoneA.Phoneall = phoneNumberA + "2";
									PhoneA.pushVertpNum(PhoneA.Phoneall);
									// Store phone number receiver into stack
									PhoneA.PhonenumReAll = phoneNumberC + "1";
									PhoneA.pushVertpNumRe(PhoneA.PhonenumReAll);
									break;
								case 3:
									// Show Point A
									String deqA3 = (String) PhoneA.dequeueVertA();
									System.out.println("Send Message: " + deqA3);
									PhoneA.pushVert(deqA3);
									PhoneD.enQueueVertD(deqA3);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack A: ");
									PhoneA.TraverseVert();
									System.out.println();
									int TA3 = 4;
									TA = TA + TA3;
									System.out.print("Time from A To D: " + TA3);
									System.out.println();
									// Store Latency
									PhoneA.pushVertLatency(TA3);
									// Way of message
									PhoneA.Direction = "[" + vA + " - " + vD + "]";
									PhoneA.pushVertw(PhoneA.Direction);
									// Show station when send message
									PhoneA.Ts = i;
									PhoneA.pushVertstation(PhoneA.Ts);
									// Store phone number into stack
									PhoneA.Phoneall = phoneNumberA + "3";
									PhoneA.pushVertpNum(PhoneA.Phoneall);
									// Store phone number receiver into stack
									PhoneA.PhonenumReAll = phoneNumberD + "1";
									PhoneA.pushVertpNumRe(PhoneA.PhonenumReAll);
									break;
							}

							switch (n) {
								case 1:
									// Show Point B
									System.out.print("The message wait to send is: ");
									PhoneB.TraverseQueueVertB();
									System.out.println();
									String deqB1 = (String) PhoneB.dequeueVertB();
									System.out.println("Send Message: " + deqB1);
									PhoneB.pushVert(deqB1);
									PhoneA.enQueueVertA(deqB1);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack B: ");
									PhoneB.TraverseVert();
									System.out.println();
									int TB1 = 2;
									TB = TB + TB1;
									System.out.print("Time from B To A: " + TB1);
									System.out.println();
									// Store Latency
									PhoneB.pushVertLatency(TB1);
									// Way of message
									PhoneB.Direction = "[" + vB + " - " + vA + "]";
									PhoneB.pushVertw(PhoneB.Direction);
									// Show station when send message
									PhoneB.Ts = i;
									PhoneB.pushVertstation(PhoneB.Ts);
									// Store phone number into stack
									PhoneB.Phoneall = phoneNumberB + "1";
									PhoneB.pushVertpNum(PhoneB.Phoneall);
									// Store phone number receiver into stack
									PhoneB.PhonenumReAll = phoneNumberA + "1";
									PhoneB.pushVertpNumRe(PhoneB.PhonenumReAll);
									break;
								case 2:
									// Show Point B
									String deqB2 = (String) PhoneB.dequeueVertB();
									System.out.println("Send Message: " + deqB2);
									PhoneB.pushVert(deqB2);
									PhoneD.enQueueVertD(deqB2);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack B: ");
									PhoneB.TraverseVert();
									System.out.println();
									int TB2 = 2;
									TB = TB + TB2;
									System.out.print("Time from B To D: " + TB2);
									System.out.println();
									// Store Latency
									PhoneB.pushVertLatency(TB2);
									// Way of message
									PhoneB.Direction = "[" + vB + " - " + vD + "]";
									PhoneB.pushVertw(PhoneB.Direction);
									// Show station when send message
									PhoneB.Ts = i;
									PhoneB.pushVertstation(PhoneB.Ts);
									// Store phone number into stack
									PhoneB.Phoneall = phoneNumberB + "2";
									PhoneB.pushVertpNum(PhoneB.Phoneall);
									// Store phone number receiver into stack
									PhoneB.PhonenumReAll = phoneNumberD + "2";
									PhoneB.pushVertpNumRe(PhoneB.PhonenumReAll);
									break;
								case 3:
									// Show Point B
									String deqB3 = (String) PhoneB.dequeueVertB();
									System.out.println("Send Message: " + deqB3);
									PhoneB.pushVert(deqB3);
									PhoneE.enQueueVertE(deqB3);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack B: ");
									PhoneB.TraverseVert();
									System.out.println();
									int TB3 = 4;
									TB = TB + TB3;
									System.out.print("Time from B To E: " + TB3);
									System.out.println();
									// Store Latency
									PhoneB.pushVertLatency(TB3);
									// Way of message
									PhoneB.Direction = "[" + vB + " - " + vE + "]";
									PhoneB.pushVertw("[B - E]");
									// Show station when send message
									PhoneB.Ts = i;
									PhoneB.pushVertstation(PhoneB.Ts);
									// Store phone number into stack
									PhoneB.Phoneall = phoneNumberB + "3";
									PhoneB.pushVertpNum(PhoneB.Phoneall);
									// Store phone number receiver into stack
									PhoneB.PhonenumReAll = phoneNumberE + "1";
									PhoneB.pushVertpNumRe(PhoneB.PhonenumReAll);
									break;
							}

						}

						if (dk2 == 0 && m <= 3) {
							m = m + 1;
							switch (m) {
								case 1:
									// Show Point C
									System.out.print("The message wait to send is: ");
									PhoneC.TraverseQueueVertC();
									System.out.println();
									String deqC1 = (String) PhoneC.dequeueVertC();
									System.out.println("Send Message: " + deqC1);
									PhoneC.pushVert(deqC1);
									PhoneA.enQueueVertA(deqC1);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack C: ");
									PhoneC.TraverseVert();
									System.out.println();
									int TC1 = 6;
									TC = TC + TC1;
									System.out.print("Time from C To A: " + TC1);
									System.out.println();
									// Store Latency
									PhoneC.pushVertLatency(TC1);
									// Way of message
									PhoneC.Direction = "[" + vC + " - " + vA + "]";
									PhoneC.pushVertw(PhoneC.Direction);
									// Show station when send message	
									PhoneC.Ts = i;
									PhoneC.pushVertstation(PhoneC.Ts);
									// Store phone number into stack
									PhoneC.Phoneall = phoneNumberC + "1";
									PhoneC.pushVertpNum(PhoneC.Phoneall);
									// Store phone number receiver into stack
									PhoneC.PhonenumReAll = phoneNumberA + "2";
									PhoneC.pushVertpNumRe(PhoneC.PhonenumReAll);
									break;
								case 2:
									// Show Point C
									String deqC2 = (String) PhoneC.dequeueVertC();
									System.out.println("Send Message: " + deqC2);
									PhoneC.pushVert(deqC2);
									PhoneB.enQueueVertB(deqC2);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack C: ");
									PhoneC.TraverseVert();
									System.out.println();
									int TC2 = 3;
									TC = TC + TC2;
									System.out.print("Time from C To B: " + TC2);
									System.out.println();
									// Store Latency
									PhoneC.pushVertLatency(TC2);
									// Way of message
									PhoneC.Direction = "[" + vC + " - " + vB + "]";
									PhoneC.pushVertw(PhoneC.Direction);							
									// Show station when send message								
									PhoneC.Ts = i;
									PhoneC.pushVertstation(PhoneC.Ts);
									// Store phone number into stack
									PhoneC.Phoneall = phoneNumberC + "2";
									PhoneC.pushVertpNum(PhoneC.Phoneall);
									// Store phone number receiver into stack
									PhoneC.PhonenumReAll = phoneNumberB + "2";
									PhoneC.pushVertpNumRe(PhoneC.PhonenumReAll);
									break;
								case 3:
									// Show Point C
									String deqC3 = (String) PhoneC.dequeueVertC();
									System.out.println("Send Message: " + deqC3);
									PhoneC.pushVert(deqC3);
									PhoneE.enQueueVertE(deqC3);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack C: ");
									PhoneC.TraverseVert();
									System.out.println();
									int TC3 = 3;
									TC = TC + TC3;
									System.out.print("Time from C To E: " + TC3);
									System.out.println();
									// Store Latency
									PhoneC.pushVertLatency(TC3);
									// Way of message
									PhoneC.Direction = "[" + vC + " - " + vE + "]";
									PhoneC.pushVertw(PhoneC.Direction);				
									// Show station when send message						
									PhoneC.Ts = i;
									PhoneC.pushVertstation(PhoneC.Ts);
									// Store phone number into stack
									PhoneC.Phoneall = phoneNumberC + "3";
									PhoneC.pushVertpNum(PhoneC.Phoneall);
									// Store phone number receiver into stack
									PhoneC.PhonenumReAll = phoneNumberE + "2";
									PhoneC.pushVertpNumRe(PhoneC.PhonenumReAll);
									break;
							}

							switch (m) {
								case 1:
									// Show Point D
									System.out.print("The message wait to send is: ");
									PhoneD.TraverseQueueVertD();
									System.out.println();
									String deqD1 = (String) PhoneD.dequeueVertD();
									System.out.println("Send Message: " + deqD1);
									PhoneD.pushVert(deqD1);
									PhoneC.enQueueVertC(deqD1);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack D: ");
									PhoneD.TraverseVert();
									System.out.println();
									int TD1 = 3;
									TD = TD + TD1;
									System.out.print("Time from D To C: " + TD1);
									System.out.println();
									// Store Latency
									PhoneD.pushVertLatency(TD1);
									// Way of message
									PhoneD.Direction = "[" + vD + " - " + vC + "]";
									PhoneD.pushVertw(PhoneD.Direction);
									
									// Show station when send message
									
									PhoneD.Ts = i;
									PhoneD.pushVertstation(PhoneD.Ts);
									// Store phone number into stack
									PhoneD.Phoneall = phoneNumberD + "1";
									PhoneD.pushVertpNum(PhoneD.Phoneall);
									// Store phone number receiver into stack
									PhoneD.PhonenumReAll = phoneNumberC + "2";
									PhoneD.pushVertpNumRe(PhoneD.PhonenumReAll);
									break;
								case 2:
									// Show Point D
									String deqD2 = (String) PhoneD.dequeueVertD();
									System.out.println("Send Message: " + deqD2);
									PhoneD.pushVert(deqD2);
									PhoneE.enQueueVertE(deqD2);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack D: ");
									PhoneD.TraverseVert();
									System.out.println();
									int TD2 = 3;
									TD = TD + TD2;
									System.out.print("Time from D To E: " + TD2);
									System.out.println();
									// Store Latency
									PhoneD.pushVertLatency(TD2);
									// Way of message
									PhoneD.Direction = "[" + vD + " - " + vE + "]";
									PhoneD.pushVertw(PhoneD.Direction);
									
									// Show station when send message
									
									PhoneD.Ts = i;
									PhoneD.pushVertstation(PhoneD.Ts);
									// Store phone number into stack
									PhoneD.Phoneall = phoneNumberD + "2";
									PhoneD.pushVertpNum(PhoneD.Phoneall);
									// Store phone number receiver into stack
									PhoneD.PhonenumReAll = phoneNumberE + "3";
									PhoneD.pushVertpNumRe(PhoneD.PhonenumReAll);
									break;
								case 3:
									// Show Point D
									String deqD3 = (String) PhoneD.dequeueVertD();
									System.out.println("Send Message: " + deqD3);
									PhoneD.pushVert(deqD3);
									PhoneA.enQueueVertA(deqD3);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack D: ");
									PhoneD.TraverseVert();
									System.out.println();
									int TD3 = 6;
									TD = TD + TD3;
									System.out.print("Time from D To A: " + TD3);
									System.out.println();
									// Store Latency
									PhoneD.pushVertLatency(TD3);
									// Way of message
									PhoneD.Direction = "[" + vD + " - " + vA + "]";
									PhoneD.pushVertw(PhoneD.Direction);
									
									// Show station when send message
									
									PhoneD.Ts = i;
									PhoneD.pushVertstation(PhoneD.Ts);
									// Store phone number into stack
									PhoneD.Phoneall = phoneNumberD + "3";
									PhoneD.pushVertpNum(PhoneD.Phoneall);
									// Store phone number receiver into stack
									PhoneD.PhonenumReAll = phoneNumberA + "3";
									PhoneD.pushVertpNumRe(PhoneD.PhonenumReAll);
									break;
							}
						}

						if (dk3 == 0 && l <= 3) {
							l = l + 1;
							switch (l) {
								case 1:
									// Show Point E
									System.out.print("The message wait to send is: ");
									PhoneE.TraverseQueueVertE();
									System.out.println();
									String deqE1 = (String) PhoneE.dequeueVertE();
									System.out.println("Send Message: " + deqE1);
									PhoneE.pushVert(deqE1);
									PhoneD.enQueueVertD(deqE1);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack E: ");
									PhoneE.TraverseVert();
									System.out.println();
									int TE1 = 4;
									TE = TE + TE1;
									System.out.print("Time from E To D: " + TE1);
									System.out.println();
									// Store Latency
									PhoneE.pushVertLatency(TE1);
									// Way of message
									PhoneE.Direction = "[" + vE + " - " + vD + "]";
									PhoneE.pushVertw(PhoneE.Direction);
									
									// Show station when send message
									
									PhoneE.Ts = i;
									PhoneE.pushVertstation(PhoneE.Ts);
									// Store phone number into stack
									PhoneE.Phoneall = phoneNumberE + "1";
									PhoneE.pushVertpNum(PhoneE.Phoneall);
									// Store phone number receiver into stack
									PhoneE.PhonenumReAll = phoneNumberD + "3";
									PhoneE.pushVertpNumRe(PhoneE.PhonenumReAll);
									break;
								case 2:
									// Show Point E
									String deqE2 = (String) PhoneE.dequeueVertE();
									System.out.println("Send Message: " + deqE2);
									PhoneE.pushVert(deqE2);
									PhoneC.enQueueVertC(deqE2);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack E: ");
									PhoneE.TraverseVert();
									System.out.println();
									int TE2 = 4;
									TE = TE + TE2;
									System.out.print("Time from E To C: " + TE2);
									System.out.println();
									// Store Latency
									PhoneE.pushVertLatency(TE2);
									// Way of message
									PhoneE.Direction = "[" + vE + " - " + vC + "]";
									PhoneE.pushVertw(PhoneE.Direction);
									
									// Show station when send message
									
									PhoneE.Ts = i;
									PhoneE.pushVertstation(PhoneE.Ts);
									// Store phone number into stack
									PhoneE.Phoneall = phoneNumberE + "2";
									PhoneE.pushVertpNum(PhoneE.Phoneall);
									// Store phone number receiver into stack
									PhoneE.PhonenumReAll = phoneNumberC + "3";
									PhoneE.pushVertpNumRe(PhoneE.PhonenumReAll);
									break;
								case 3:
									// Show Point E
									String deqE3 = (String) PhoneE.dequeueVertE();
									System.out.println("Send Message: " + deqE3);
									PhoneE.pushVert(deqE3);
									PhoneA.enQueueVertA(deqE3);
									System.out.println();
									// Show Stack
									System.out.println();
									System.out.print("Stack E: ");
									PhoneE.TraverseVert();
									System.out.println();
									int TE3 = 12;
									TE = TE + TE3;
									System.out.print("Time from E To A: " + TE3);
									System.out.println();
									// Store Latency
									PhoneE.pushVertLatency(TE3);
									// Way of message
									PhoneE.Direction = "[" + vE + " - " + vA + "]";
									PhoneE.pushVertw(PhoneE.Direction);
									
									// Show station when send message
									
									PhoneE.Ts = i;
									PhoneE.pushVertstation(PhoneE.Ts);
									// Store phone number into stack
									PhoneE.Phoneall = phoneNumberE + "3";
									PhoneE.pushVertpNum(PhoneE.Phoneall);
									// Store phone number receiver into stack
									PhoneE.PhonenumReAll = phoneNumberA + "1";
									PhoneE.pushVertpNumRe(PhoneE.PhonenumReAll);
									break;
							}
						}
					}
					//
					break;
				case 2:
					
				
					// Store path to history
					for (Object mangW : PhoneA.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneB.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneC.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneD.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneE.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					// // Store message to history

					for (Object mang : PhoneA.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneB.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneC.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneD.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneE.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}

					for (Object mangsta : PhoneA.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneB.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneC.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneD.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneE.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					// Store phone to history
					for (Object mangphone : PhoneA.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneB.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneC.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneD.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneE.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					
					for (Object mangRphone : PhoneA.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneB.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneC.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneD.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneE.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					// View history
					int lengthIM = StoreALLIM.aAll.length;
					System.out.println("Direction\t" + "Time\t \t " + "Phone Send\t \t" + "Phone Receive\t \t" + "Message");
					for (int i = 0; i < lengthIM; i++) {
						System.out.println(StoreALLWay.wAll[i] + "\t \t" + StoreAll_Station.sta_all[i] + "\t \t "
								+ StoreAll_Phone.phonenumAll[i] + "\t \t" + StoreAllRe_Phone.phonenumRAll[i] + "\t \t"
								 + StoreALLIM.aAll[i]);
					}
					break;
				case 3:
					
					PhoneA.growA();
					PhoneB.growB();
					PhoneC.growC();
					PhoneD.growD();
					PhoneE.growE();
					// Show Point A
					System.out.print("Queue A: ");
					PhoneA.TraverseQueueVertA();
					System.out.println();
					// Show Point B
					System.out.print("Queue B: ");
					PhoneB.TraverseQueueVertB();
					System.out.println();
					// Show Point C
					System.out.print("Queue C: ");
					PhoneC.TraverseQueueVertC();
					System.out.println();
					// Show Point D
					System.out.print("Queue D: ");
					PhoneD.TraverseQueueVertD();
					System.out.println();
					// Show Point E
					System.out.print("Queue E: ");
					PhoneE.TraverseQueueVertE();
					System.out.println();
					break;
				case 4:
					
					for (Object mangla : PhoneA.la) {
						if (mangla != null) {
							StoreALL_Latency.pushVertLatencyAll(mangla);
						}
					}
					for (Object mangla : PhoneB.la) {
						if (mangla != null) {
							StoreALL_Latency.pushVertLatencyAll(mangla);
						}
					}
					for (Object mangla : PhoneC.la) {
						if (mangla != null) {
							StoreALL_Latency.pushVertLatencyAll(mangla);
						}
					}
					for (Object mangla : PhoneD.la) {
						if (mangla != null) {
							StoreALL_Latency.pushVertLatencyAll(mangla);
						}
					}
					for (Object mangla : PhoneE.la) {
						if (mangla != null) {
							StoreALL_Latency.pushVertLatencyAll(mangla);
						}
					}
					// Store path to history
					for (Object mangW : PhoneA.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneB.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneC.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneD.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					for (Object mangW : PhoneE.w) {
						if (mangW != null) {
							StoreALLWay.pushVertwAll(mangW);
						}
					}
					// Store message to history

					for (Object mang : PhoneA.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneB.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneC.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneD.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}
					for (Object mang : PhoneE.a) {
						if (mang != null) {
							StoreALLIM.pushVertSAT(mang);
						}
					}

					for (Object mangsta : PhoneA.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneB.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneC.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneD.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					for (Object mangsta : PhoneE.sta) {
						if (mangsta != null) {
							StoreAll_Station.pushVertstationall(mangsta);
						}
					}
					// Store phone to history
					for (Object mangphone : PhoneA.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneB.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneC.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneD.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					for (Object mangphone : PhoneE.phonenum) {
						if (mangphone != null) {
							StoreAll_Phone.pushVertpNumAll(mangphone);
						}
					}
					
					for (Object mangRphone : PhoneA.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneB.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneC.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneD.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					for (Object mangRphone : PhoneE.phonenumR) {
						if (mangRphone != null) {
							StoreAllRe_Phone.pushVertpNumReAll(mangRphone);
						}
					}
					// Export to file
					int lengthIMf = StoreALLIM.aAll.length;
					FileManagement fl = new FileManagement();
					fl.creatFile();
					fl.WriteFile(StoreALLWay.wAll, StoreAll_Station.sta_all, StoreAll_Phone.phonenumAll,
							StoreAllRe_Phone.phonenumRAll,  StoreALLIM.aAll,
							lengthIMf);
					break;
				default:
					cont = false;
					break;
			}
		} while (cont);
	}
}
