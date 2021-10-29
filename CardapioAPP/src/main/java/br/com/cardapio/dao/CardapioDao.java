package br.com.cardapio.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.cardapio.to.CardapioTO;

public class CardapioDao {

	public static List<CardapioTO> receita;

	public CardapioDao() {

		if (receita == null) {

			receita = new ArrayList<CardapioTO>();

			CardapioTO cto = new CardapioTO();
			cto.setCodigo(1);
			cto.setNome("Pão de queijo de batata doce");
			cto.setIngredientes("Pão de queijo, batata doce, polvilho, queijo, óleo e água");
			cto.setPeriodo("Manhã");
			receita.add(cto);
			
			cto = new CardapioTO();
			cto.setCodigo(2);
			cto.setNome("Nhoque de batata doce");
			cto.setIngredientes("Nhoque, batata doce e molho ao sugo");
			cto.setPeriodo("Tarde");
			receita.add(cto);
		}
	}


	public List<CardapioTO> select() {
		return receita;
	}

	public CardapioTO select(int codigo) {

		for (CardapioTO r : receita) {
			if (r.getCodigo() == codigo) {
				return r;
			}
		}

		return null;
	}

	public boolean insert(CardapioTO rto) {
		rto.setCodigo(receita.size() + 1);
		return receita.add(rto);
	}

	public void update(CardapioTO rto) {
		CardapioTO r = select(rto.getCodigo());
		r.setNome(rto.getNome());
		r.setIngredientes(rto.getIngredientes());
		r.setPeriodo(rto.getPeriodo());

		for (int x = 0; x < receita.size(); x++) {
			if (receita.get(x) == r) {
				receita.set(x, r);
			}
		}
	}
	
	public void delete(int codigo) {
		receita.remove(select(codigo));
	}

}