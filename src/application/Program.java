package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Produto;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		// DADOS DO CLIENTE
		System.out.println("<<ENTRE COM OS DADOS DO CLIENTE>>");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();		
		System.out.print("Email: ");
		String email = sc.nextLine();		
		System.out.print("Data Nascimento: ");
		Date aniversario = sdf.parse(sc.next());
		
		Client client = new Client(nome, email, aniversario);

		System.out.println("");
		sc.nextLine();
		/*-----------------------------------------------*/
		//DADOS DO PEDIDO
		System.out.print("Status do Pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("Digite a quantidade de Itens do Pedido: ");
		int N = sc.nextInt();
		
		//DADOS DOS ITENS DO PEDIDO

		for(int i = 0; i < N; i ++) {
		
		System.out.println("Digite os dados do item Nr° " + (i+1));
		System.out.print("Produto: ");
		sc.nextLine();
		String nameProduct = sc.nextLine();
		
		System.out.print("Preço: ");
		Double priceProduct = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		Integer quantdadeProduct = sc.nextInt();
		
		Produto produto = new Produto(nameProduct, priceProduct);
		OrderItem it = new OrderItem(quantdadeProduct, priceProduct, produto);
		
		order.addItem(it);
		
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		sc.close();
	}

}
