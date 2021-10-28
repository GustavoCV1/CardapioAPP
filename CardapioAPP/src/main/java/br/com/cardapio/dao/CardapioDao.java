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
			cto.setNome(" P�o de queijo de batata doce");
			cto.setIngredientes("P�o de queijo, batata doce, polvilho, queijo, �leo e �gua");
			cto.setPeriodo("Manh�");
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