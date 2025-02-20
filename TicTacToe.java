//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
		for(int row=0; row<3;row++)
			for(int col=0; col<mat[row].length;col++)
				mat[row][col]='A';

	}

	public TicTacToe(String game)
	{
		int pos=0;
		for(int row=0; row<3;row++){
			for(int col=0; col<3;col++,pos++){
				mat[row][col] = game.charAt(pos);
			}
		}
	}

	public String getWinner()
	{
		if(mat[0][0]==mat[0][1]&&mat[0][1]==mat[0][2])
			if(mat[0][0]=='X')
				return("X wins horizontally");
			else
				return("O wins horizontally");
		else if(mat[1][0]==mat[1][1]&&mat[1][1]==mat[1][2])
			if(mat[1][0]=='X')
				return("X wins horizontally");
			else
				return("O wins horizontally");
		else if(mat[2][0]==mat[2][1]&&mat[2][1]==mat[2][2])
			if(mat[2][0]=='X')
				return("X wins horizontally");
			else
				return("O wins Horizontally");
		else if(mat[0][0]==mat[1][0]&&mat[1][0]==mat[2][0])
			if(mat[0][0]=='X')
				return("X wins Vertically");
			else
				return("O wins Vertically");
		else if(mat[0][1]==mat[1][1]&&mat[1][1]==mat[2][1])
			if(mat[0][1]=='X')
				return("X wins Vertically");
			else
				return("O wins Vertically");
		else if(mat[0][2]==mat[1][2]&&mat[1][2]==mat[2][2])
			if(mat[0][2]=='X')
				return("X wins Vertically");
			else	
				return("O wins Vertically");
		else if(mat[2][0]==mat[1][1]&&mat[1][1]==mat[0][2])
			if(mat[2][0]=='X')
				return("X wins Diagonally");
			else
				return("O wins diagonally");
		else if(mat[0][0]==mat[1][1]&&mat[1][1]==mat[2][2])
			if(mat[0][0]=='X')
				return("X wins Diagonally");
			else
				return("O wins Diagonally");
		else
			return "Cats game";
			
	}

	public String toString()
	{
		String output="";
			for(int row=0; row<3; row++) {
				for(int col=0; col<3; col++) {
					output+= mat[row][col]+" ";
				}
				output+="\n";
			}
		output+=getWinner();
		return output+"\n\n";
	}
}