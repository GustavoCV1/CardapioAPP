package br.com.cardapio.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

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

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CardapioTO buscar(@PathParam("id") int id) {
		return rb.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(CardapioTO rto, @Context UriInfo uriInfo) {
	
		rb.cadastrar(rto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(rto.getCodigo()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{codigo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(CardapioTO receita, @PathParam("codigo") int codigo) {
		receita.setCodigo(codigo);
		rb.atualiza(receita);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") int codigo) {
		rb.apagar(codigo);
	}	 
}