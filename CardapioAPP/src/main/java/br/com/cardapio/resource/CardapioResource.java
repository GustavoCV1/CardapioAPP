package br.com.cardapio.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.cardapio.bo.CardapioBO;
import br.com.cardapio.to.CardapioTO;

@Path("/receita")
public class CardapioResource {

	private CardapioBO rb = new CardapioBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CardapioTO> buscar(){
		return rb.listar();
	}

}
