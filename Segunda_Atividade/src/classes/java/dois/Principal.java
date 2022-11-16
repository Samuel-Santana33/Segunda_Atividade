package classes.java.dois;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {
	
	
	public static void main(String[] args) throws IOException {
		MenuInicio menuInicio = new MenuInicio();
		
		List<Aluno> alunos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		menuInicio.menuPrincipal(alunos, sc);
	}
	
}
