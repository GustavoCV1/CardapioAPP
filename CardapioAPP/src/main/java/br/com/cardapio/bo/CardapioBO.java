package br.com.cardapio.bo;

import java.util.List;

import br.com.cardapio.dao.CardapioDao;
import br.com.cardapio.to.CardapioTO;

public class CardapioBO {

	private CardapioDao rd = null;
	
	public List<CardapioTO> listar(){
		rd = new CardapioDao();
		return rd.select();
	}
	
	
	public CardapioTO listar(int codigo) {
		rd = new CardapioDao();
			return rd.select(codigo);
	} 
	
	
	public boolean cadastrar(CardapioTO rto) {
		rd = new CardapioDao();
		return rd.insert(rto);
	}
	
	public void atualiza(CardapioTO rto) {
		rd = new CardapioDao();
		rd.update(rto);
//		new CardapioDao().update(rto);
	}
	
	public void apagar(int codigo) {
		rd = new CardapioDao();
		rd.delete(codigo);
//		new CardapioDao().delete(codigo);

	}
}
