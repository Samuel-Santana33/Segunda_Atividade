package classes.java.dois;

import java.io.IOException;
import java.util.List;


public class Dados_Alunos {
	
	public static void listaDeAlunosNaTela(List<Aluno> alunos) throws IOException{
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Dados do alunos:");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		System.out.println("Pressione ENTER para continuar");
		System.in.read();
	}
	
}
