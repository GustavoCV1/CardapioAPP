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
			cto.setNome(" Pão de queijo de batata doce");
			cto.setIngredientes("Pão de queijo, batata doce, polvilho, queijo, óleo e água");
			cto.setPeriodo("Manhã");
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
	


	
}