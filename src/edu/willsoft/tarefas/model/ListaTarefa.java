package edu.willsoft.tarefas.model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> listaTarefa;
	
	public ListaTarefa() {
		//New ArrayList<T> = t[]
		this.listaTarefa = new ArrayList<Tarefa>();
	}
	
	public void addTarefa(String descricao) {
		this.listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removeTarefa(String descrica) {
		List<Tarefa> itemsASerRemovidos = new ArrayList<Tarefa>();
		
		for (Tarefa t:listaTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descrica)) {
				itemsASerRemovidos.add(t);
			}
		}
		
		this.listaTarefa.removeAll(itemsASerRemovidos);
	}
	
	public int obterTotalLista() {
		//Retorna a quantidade de elementos da lista == length; 
		return this.listaTarefa.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaTarefa);
	}

}
