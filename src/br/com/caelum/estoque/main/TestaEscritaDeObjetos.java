package br.com.caelum.estoque.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itens.bin"))) {
			
			ItemEstoque itemEstoque1 = new ItemEstoque("001", 2);
			ItemEstoque itemEstoque2 = new ItemEstoque("002", 5);
			ItemEstoque itemEstoque3 = new ItemEstoque("003", 6);
			
			List<ItemEstoque> itens = Arrays.asList(itemEstoque1, itemEstoque2, itemEstoque3);
			
			oos.writeObject(itens);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
