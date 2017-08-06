package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class EstoqueService extends UnicastRemoteObject implements EstoqueRmi {
	
	private Map<String, ItemEstoque> reposiorio = new HashMap<>(); 

	public EstoqueService() throws RemoteException {
		reposiorio.put("ARQ", new ItemEstoque("ARQ", 5));
		reposiorio.put("SOA", new ItemEstoque("SOA", 2));
		reposiorio.put("TDD", new ItemEstoque("TDD", 3));
		reposiorio.put("RES", new ItemEstoque("RES", 4));
		reposiorio.put("LOG", new ItemEstoque("LOG", 3));
		reposiorio.put("WEB", new ItemEstoque("WEB", 4));
	}

	@Override
	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException {
		System.out.println("Verificando estoque do produto " + codigoProduto);
		return this.reposiorio.get(codigoProduto);
	}

}
