package com.harshit1108.Flyweight.good;
/**
 * Implementation : We implement the creation of Terrorists and Counter Terrorists In the game of Counter Strike.
 * So we have 2 classes one for Terrorist(T) and other for Counter Terrorist(CT).
 * Whenever a player asks for a weapon we assign him the asked weapon.
 * In the mission, terrorist’s task is to plant a bomb while the counter terrorists have to diffuse the bomb.
 *
 * Why to use Flyweight Design Pattern in this example?
 * Here we use the Fly Weight design pattern, since here we need to reduce the object count for players.
 * Now we have n number of players playing CS 1.6, if we do not follow the Fly Weight Design Pattern then we will have to create n number of objects,
 * one for each player. But now we will only have to create 2 objects one for terrorists and other for counter terrorists,
 * we will reuse then again and again whenever required.
 *
 * Intrinsic State : Here ‘task’ is an intrinsic state for both types of players, since this is always same for T’s/CT’s.
 * We can have some other states like their color or any other properties which are similar for all the Terrorists/Counter Terrorists in their respective Terrorists/Counter Terrorists class.
 * Extrinsic State :
 * Weapon is an extrinsic state since each player can carry any weapon of his/her choice. Weapon need to be passed as a parameter by the client itself.
 */

import java.util.Random;

// Driver class
public class CounterStrike
{
    // All player types and weapon (used by getRandPlayerType()
    // and getRandWeapon()
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};


    // Driver code
    public static void main(String args[])
    {
        /* Assume that we have a total of 10 players in the game. */
        for (int i = 0; i < 10; i++)
        {
            /* getPlayer() is called simply using the class name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            /* Assign a weapon chosen randomly uniformly from the weapon array  */
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }

    // Utility methods to get a random player type and weapon
    public static String getRandPlayerType()
    {
        Random r = new Random();
        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);
        // return the player stored at index 'randInt'
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();
        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);
        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }
}
