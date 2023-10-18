package edu.willsoft.tarefas.starter;


import edu.willsoft.tarefas.model.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaTarefa listTarefa = new ListaTarefa();
		
		listTarefa.addTarefa("Fazer projeto de Luan");
		System.out.println("Número total de tarefas: " + listTarefa.obterTotalLista());
		listTarefa.addTarefa("Fazer projeto de Luan");
		System.out.println("Número total de tarefas: " + listTarefa.obterTotalLista());
		listTarefa.addTarefa("Conseguir um novo emprego");
		System.out.println("Número total de tarefas: " + listTarefa.obterTotalLista());
			
		listTarefa.obterDescricoesTarefas();
		
		listTarefa.removeTarefa("Fazer projeto de Luan");
		System.out.println("Número total de tarefas: " + listTarefa.obterTotalLista());
	}

}
