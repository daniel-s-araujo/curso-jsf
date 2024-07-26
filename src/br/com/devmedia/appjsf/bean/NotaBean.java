package br.com.devmedia.appjsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class NotaBean {

	private ArrayList<Nota> notas = new ArrayList<Nota>() {
		{
			add(new Nota(1L, "Comprar leite", "11h, antes de ir trabalhar"));
			add(new Nota(2L, "Veterin�rio", "9h, levar o gato no veterin�rio"));
			add(new Nota(3L, "Prova", "3/5 11h, marcar prova"));
			add(new Nota(4L, "Comprar passagens", "11/5 8h30"));
		}
	};

	private Nota nota = new Nota();

	public Nota getNota() {
		return this.nota;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void salvar() {
		notas.add(nota);
		nota = new Nota();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Nota inclu�da com sucesso!"));
	}
}
