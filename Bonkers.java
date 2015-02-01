/*

Program Name: Bonkers
Programmer Name: Lance Bantoto
Date: April 25, 2014
Description: This program is based on the game Bonkers from The Price Is Right. It involves structures, Math.random() and graphics.


The "Bonkers" class.

*/

import java.awt.*;
import hsa.Console;

public class Bonkers
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Declare Variables
	char pressKey, user1, user2, user3, user4;
	int item, correctPrice, digit1, digit2, digit3, digit4, fake1, fake2, fake3, fake4;


	//COLORS
	Color DarkRed = new Color (189, 48, 33);
	Color charcoal = new Color (72, 72, 72);
	Color GC = new Color (78, 51, 155);
	Color neonBlue = new Color (87, 171, 234);
	Color darkYellow = new Color (255, 201, 14);

	//FONTS
	Font timesPlain150 = new Font ("Times New Roman", Font.PLAIN, 130);
	Font timesPlain25 = new Font ("Times New Roman", Font.PLAIN, 25);
	Font times15 = new Font ("Times New Roman", Font.PLAIN, 15);

	//Background
	c.setColor (darkYellow);
	c.fillRect (0, 0, 640, 500);

	//Print Title
	c.setColor (Color.red);
	c.setFont (timesPlain150);
	c.drawString ("BONKERS.", 0, 250);

	//Press Any Key
	c.setColor (DarkRed);
	c.setFont (timesPlain25);
	c.drawString ("Press any key to continue.", 300, 400);
	pressKey = c.getChar ();
	c.clear ();

	//Background
	c.setColor (darkYellow);
	c.fillRect (0, 0, 640, 500);

	//Your Prize is..
	c.setColor (Color.black);
	c.setFont (times15);
	c.drawString ("The prize you can win is..........", 0, 15);

	//Random number from 1-3 selected
	item = (int) (Math.random () * 3) + 1;

	//If Statements for Prize

	//Nintendo 64
	if (item == 1)
	{
	    //Graphics For N64
	    c.setColor (Color.black);
	    c.drawLine (190, 100, 410, 100);

	    //Outline
	    c.setColor (charcoal);
	    c.drawLine (190, 100, 410, 100);
	    c.drawLine (190, 100, 150, 240);
	    c.drawLine (410, 100, 450, 240);
	    c.drawLine (150, 240, 220, 240);
	    c.drawLine (450, 240, 380, 240);
	    c.drawLine (150, 240, 150, 300);
	    c.drawLine (450, 240, 450, 300);
	    c.drawLine (150, 300, 450, 300);

	    //Fill with charcoal colour
	    int[] x = {190, 150, 450, 410};
	    int[] y = {100, 240, 240, 100};
	    c.fillPolygon (x, y, 4);

	    c.fillRect (150, 240, 300, 60);

	    //For Controller Inputs and 'N64'
	    c.setColor (Color.white);
	    c.fillArc (220, 200, 160, 80, 0, 180);
	    c.fillArc (170, 260, 30, 40, 0, 180);
	    c.fillArc (220, 260, 30, 40, 0, 180);
	    c.fillArc (340, 260, 30, 40, 0, 180);
	    c.fillArc (400, 260, 30, 40, 0, 180);
	    c.setCursor (14, 36);
	    c.print ("N64");

	    //Sentence announcing prize
	    c.setColor (DarkRed);
	    c.setFont (timesPlain25);
	    c.drawString ("The first ever Nintendo 64!", 0, 400);

	    //Real and Fake Digits
	    digit1 = 3;
	    digit2 = 1;
	    digit3 = 6;
	    digit4 = 8;

	    fake1 = 2;
	    fake2 = 3;
	    fake3 = 1;
	    fake4 = 7;

	}

	//Game Cube
	else if (item == 2)
	{

	    //Graphics for Game Cube
	    c.drawRect (230, 160, 130, 130);
	    int[] x1 = {230, 290, 420, 360};
	    int[] y1 = {160, 100, 100, 160};
	    c.drawPolygon (x1, y1, 4);
	    int[] x2 = {360, 420, 420, 360};
	    int[] y2 = {160, 100, 240, 290};
	    c.drawPolygon (x2, y2, 4);

	    //Fill with Purple
	    c.setColor (GC);
	    c.fillRect (230, 160, 130, 130);
	    c.fillPolygon (x1, y1, 4);
	    c.fillPolygon (x2, y2, 4);

	    /*'Game Cube' labelled + Outline
	    of White Rectangle */
	    c.setColor (Color.white);
	    c.setFont (times15);
	    c.drawString ("GAME CUBE", 260, 180);
	    c.fillRect (240, 190, 110, 80);

	    /*Black outline of cube + little
	    black circles in White Rectangle */
	    c.setColor (Color.black);
	    c.drawRect (230, 160, 130, 130);
	    c.drawPolygon (x1, y1, 4);
	    c.drawPolygon (x2, y2, 4);
	    c.fillOval (250, 230, 15, 15);
	    c.fillOval (271, 230, 15, 15);
	    c.fillOval (293, 230, 15, 15);
	    c.fillOval (315, 230, 15, 15);
	    c.drawOval (255, 224, 4, 4);
	    c.drawOval (272, 224, 4, 4);
	    c.drawOval (279, 224, 4, 4);
	    c.drawOval (292, 224, 4, 4);
	    c.drawOval (298, 224, 4, 4);
	    c.drawOval (302, 224, 4, 4);
	    c.drawOval (312, 224, 4, 4);
	    c.drawOval (317, 224, 4, 4);
	    c.drawOval (322, 224, 4, 4);
	    c.drawOval (327, 224, 4, 4);

	    //Sentence announcing prize
	    c.setColor (DarkRed);
	    c.setFont (timesPlain25);
	    c.drawString ("The first ever Nintendo GameCube!", 0, 400);

	    //Real and Fake Digits
	    digit1 = 2;
	    digit2 = 1;
	    digit3 = 9;
	    digit4 = 9;

	    fake1 = 5;
	    fake2 = 2;
	    fake3 = 4;
	    fake4 = 1;


	}

	//Wii Deluxe
	else
	{

	    //Graphics for Wii Deluxe
	    c.setColor (Color.black);
	    int[] x3 = {200, 180, 220, 240};
	    int[] y3 = {100, 250, 250, 100};
	    c.fillPolygon (x3, y3, 4);

	    int[] x4 = {380, 380, 220, 240};
	    int[] y4 = {130, 250, 250, 100};
	    c.fillPolygon (x4, y4, 4);

	    //Prints base of console
	    c.setColor (Color.gray);
	    int[] x5 = {170, 160, 380, 380};
	    int[] y5 = {250, 300, 300, 250};
	    c.fillPolygon (x5, y5, 4);

	    //Prints neon blue light
	    c.setColor (neonBlue);
	    c.fillOval (225, 120, 5, 120);

	    //Prints 'Wii' on console
	    c.setColor (Color.white);
	    c.drawString ("Wii", 200, 240);

	    //Sentence announcing prize
	    c.setColor (DarkRed);
	    c.setFont (timesPlain25);
	    c.drawString ("The Nintendo Wii Deluxe!", 0, 400);

	    //Real and Fake Digits
	    digit1 = 3;
	    digit2 = 4;
	    digit3 = 2;
	    digit4 = 3;

	    fake1 = 6;
	    fake2 = 5;
	    fake3 = 1;
	    fake4 = 8;
	}

	//Prompt To Continue
	c.drawString ("Press any key to continue.", 0, 450);
	pressKey = c.getChar ();
	c.clear ();

	// Instructions Page //

	//Background
	c.setColor (darkYellow);
	c.fillRect (0, 0, 640, 500);

	//Instructions
	c.setColor (Color.black);
	c.setFont (times15);
	c.drawString ("For each digit, guess if the real digit is higher or lower than the digit shown (h/l)", 5, 20);

	//Prompt To Continue
	c.setColor (DarkRed);
	c.setFont (timesPlain25);
	c.drawString ("Press any key to continue.", 300, 400);
	pressKey = c.getChar ();
	c.clear ();


	//Border
	c.setColor (Color.red);
	c.drawLine (0, 0, 649, 0);
	c.drawLine (0, 300, 638, 300);
	c.drawLine (0, 0, 0, 300);
	c.drawLine (638, 0, 639, 300);

	//Inside Lines
	c.drawLine (160, 0, 160, 300);
	c.drawLine (320, 0, 320, 300);
	c.drawLine (480, 0, 480, 300);
	c.drawLine (0, 100, 640, 100);
	c.drawLine (0, 200, 640, 200);

	//Fake Numbers
	c.setColor (Color.black);
	c.drawString (fake1 + "", 70, 160);
	c.drawString (fake2 + "", 235, 160);
	c.drawString (fake3 + "", 385, 160);
	c.drawString (fake4 + "", 550, 160);

	//User Prompt
	c.drawString ("Higher or lower? (h/l)", 0, 350);
	c.setColor (darkYellow);

	//Switch Statement for Digit 1
	user1 = c.getChar ();

	switch (user1)
	{
	    case 'h':
	    case 'H':
		{
		    c.fillOval (10, 10, 140, 80);
		    break;
		}
	    case 'l':
	    case 'L':
		{
		    c.fillOval (10, 210, 140, 80);
		    break;
		}
	    default:
		{
		    c.println ("You entered an invalid character.");
		    break;
		}

	}

	//Switch Statement for Digit 2
	user2 = c.getChar ();

	switch (user2)
	{
	    case 'h':
	    case 'H':
		{
		    c.fillOval (170, 10, 140, 80);
		    break;
		}
	    case 'l':
	    case 'L':
		{
		    c.fillOval (170, 210, 140, 80);
		    break;
		}
	    default:
		{
		    c.println ("You entered an invalid character.");
		    break;
		}

	}

	//Switch Statement for Digit 3
	user3 = c.getChar ();

	switch (user3)
	{
	    case 'h':
	    case 'H':
		{
		    c.fillOval (330, 10, 140, 80);
		    break;
		}
	    case 'l':
	    case 'L':
		{
		    c.fillOval (330, 210, 140, 80);
		    break;
		}
	    default:
		{
		    c.println ("You entered an invalid character.");
		    break;
		}

	}

	//Switch Statement for Digit 3
	user4 = c.getChar ();

	switch (user4)
	{
	    case 'h':
	    case 'H':
		{
		    c.fillOval (490, 10, 140, 80);
		    break;
		}
	    case 'l':
	    case 'L':
		{
		    c.fillOval (490, 210, 140, 80);
		    break;
		}
	    default:
		{
		    c.println ("You entered an invalid character.");
		    break;
		}

	}

	c.setColor (DarkRed);
	c.drawString ("Press any key to continue.", 0, 450);
	pressKey = c.getChar ();
	c.clear ();

	//Calculate if user is correct or incorrect

	int answer = 0;

	if ((digit1 > fake1) && (user1 == 'h' || user1 == 'H'))
	{
	    answer = answer + 1;
	}

	if ((digit2 > fake2) && (user2 == 'h' || user2 == 'H'))
	{
	    answer = answer + 1;
	}

	if ((digit3 > fake3) && (user3 == 'h' || user3 == 'H'))
	{
	    answer = answer + 1;
	}

	if ((digit4 > fake4) && (user4 == 'h' || user4 == 'H'))
	{
	    answer = answer + 1;
	}

	if ((digit1 < fake1) && (user1 == 'l' || user1 == 'L'))
	{
	    answer = answer + 1;
	}

	if ((digit2 < fake2) && (user2 == 'l' || user2 == 'L'))
	{
	    answer = answer + 1;
	}

	if ((digit3 < fake3) && (user3 == 'l' || user3 == 'L'))
	{
	    answer = answer + 1;
	}

	if ((digit4 < fake4) && (user4 == 'l' || user4 == 'L'))
	{
	    answer = answer + 1;
	}


	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///// Announcing Result////////////////////////////////////////////////////////////////////////////////////////

	if (answer < 4)
	{
	    c.setColor (darkYellow);
	    c.fillRect (0, 0, 640, 500);

	    c.setColor (DarkRed);
	    c.drawString ("You lost! You have one more chance!", 5, 20);

	    c.drawString ("Press any key to continue.", 300, 400);
	    pressKey = c.getChar ();
	    c.clear ();

	    //Border
	    c.setColor (Color.red);
	    c.drawLine (0, 0, 649, 0);
	    c.drawLine (0, 300, 638, 300);
	    c.drawLine (0, 0, 0, 300);
	    c.drawLine (638, 0, 639, 300);

	    //Inside Lines
	    c.drawLine (160, 0, 160, 300);
	    c.drawLine (320, 0, 320, 300);
	    c.drawLine (480, 0, 480, 300);
	    c.drawLine (0, 100, 640, 100);
	    c.drawLine (0, 200, 640, 200);

	    //Fake Numbers
	    c.setColor (Color.black);
	    c.drawString (fake1 + "", 70, 160);
	    c.drawString (fake2 + "", 235, 160);
	    c.drawString (fake3 + "", 385, 160);
	    c.drawString (fake4 + "", 550, 160);

	    //User Prompt
	    c.drawString ("Higher or lower? (h/l)", 0, 350);
	    c.setColor (darkYellow);

	    //Switch Statement for Digit 1
	    user1 = c.getChar ();

	    switch (user1)
	    {
		case 'h':
		case 'H':
		    {
			c.fillOval (10, 10, 140, 80);
			break;
		    }
		case 'l':
		case 'L':
		    {
			c.fillOval (10, 210, 140, 80);
			break;
		    }
		default:
		    {
			c.println ("You entered an invalid character.");
			break;
		    }

	    }

	    //Switch Statement for Digit 2
	    user2 = c.getChar ();

	    switch (user2)
	    {
		case 'h':
		case 'H':
		    {
			c.fillOval (170, 10, 140, 80);
			break;
		    }
		case 'l':
		case 'L':
		    {
			c.fillOval (170, 210, 140, 80);
			break;
		    }
		default:
		    {
			c.println ("You entered an invalid character.");
			break;
		    }

	    }

	    //Switch Statement for Digit 3
	    user3 = c.getChar ();

	    switch (user3)
	    {
		case 'h':
		case 'H':
		    {
			c.fillOval (330, 10, 140, 80);
			break;
		    }
		case 'l':
		case 'L':
		    {
			c.fillOval (330, 210, 140, 80);
			break;
		    }
		default:
		    {
			c.println ("You entered an invalid character.");
			break;
		    }

	    }

	    //Switch Statement for Digit 3
	    user4 = c.getChar ();

	    switch (user4)
	    {
		case 'h':
		case 'H':
		    {
			c.fillOval (490, 10, 140, 80);
			break;
		    }
		case 'l':
		case 'L':
		    {
			c.fillOval (490, 210, 140, 80);
			break;
		    }
		default:
		    {
			c.println ("You entered an invalid character.");
			break;
		    }

	    }

	    c.setColor (DarkRed);
	    c.drawString ("Press any key to continue.", 0, 450);
	    pressKey = c.getChar ();
	    c.clear ();

	    //Calculate if user is correct or incorrect

	    answer = 0;
	    if ((digit1 > fake1) && (user1 == 'h' || user1 == 'H'))
	    {
		answer = answer + 1;
	    }

	    if ((digit2 > fake2) && (user2 == 'h' || user2 == 'H'))
	    {
		answer = answer + 1;
	    }

	    if ((digit3 > fake3) && (user3 == 'h' || user3 == 'H'))
	    {
		answer = answer + 1;
	    }

	    if ((digit4 > fake4) && (user4 == 'h' || user4 == 'H'))
	    {
		answer = answer + 1;
	    }

	    if ((digit1 < fake1) && (user1 == 'l' || user1 == 'L'))
	    {
		answer = answer + 1;
	    }

	    if ((digit2 < fake2) && (user2 == 'l' || user2 == 'L'))
	    {
		answer = answer + 1;
	    }

	    if ((digit3 < fake3) && (user3 == 'l' || user3 == 'L'))
	    {
		answer = answer + 1;
	    }

	    if ((digit4 < fake4) && (user4 == 'l' || user4 == 'L'))
	    {
		answer = answer + 1;
	    }

	    //if statement within an if statement (Inception)

	    if (answer < 4)
	    {
		c.setColor (darkYellow);
		c.fillRect (0, 0, 640, 500);

		c.setColor (DarkRed);
		c.drawString ("Darn. You lose.", 5, 20);
		c.drawString ("The real price was:", 5, 50);
		c.drawString ("$" + digit1 + "" + digit2 + "" + digit3 + "" + digit4, 5, 100);
	    }

	    else
	    {
		c.setColor (darkYellow);
		c.fillRect (0, 0, 640, 500);

		c.setColor (DarkRed);
		c.drawString ("YOU WON! CONGRATS. YOU HAVE WON YOUR PRIZE. THE REAL PRICE WAS $", 5, 20);
		c.drawString ("$" + digit1 + "" + digit2 + "" + digit3 + "" + digit4, 5, 20);
	    }
	}

	///////// Correct Answer
	else
	{
	    c.setColor (darkYellow);
	    c.fillRect (0, 0, 640, 500);

	    c.setColor (DarkRed);
	    c.drawString ("YOU WON! CONGRATS. YOU HAVE WON YOUR PRIZE. THE REAL PRICE WAS $", 5, 20);
	    c.drawString ("$" + digit1 + "" + digit2 + "" + digit3 + "" + digit4, 5, 40);
	}



    } // main method
} // Bonkers class




