package com.alexandreesl.handson;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		List<Client> clients = CollectionUtils.getData();

		// for each that doesn't use the stream
		clients.stream().filter(
				c -> c.getName().equals("Alexandre Eleuterio Santos Lourenco"));

		clients.forEach(c -> System.out.println(c.getName()));

		// for each using the stream

		System.out.println("FOR EACH WITH THE STREAM!");

		clients.stream()
				.filter(c -> c.getName().equals(
						"Alexandre Eleuterio Santos Lourenco"))
				.forEach(c -> System.out.println(c.getName()));

		// filtering the stream and retrieving

		System.out.println("FILTERING THE STREAM AND RETRIEVING!");

		List<Client> filteredList = clients
				.stream()
				.filter(c -> c.getName().equals(
						"Alexandre Eleuterio Santos Lourenco"))
				.collect(Collectors.toList());

		filteredList.forEach(c -> System.out.println(c.getName()));

		// stream filtering by a substream and maping only the names

		System.out.println("USING THE MAP METHOD!");

		clients.stream()
				.filter(c -> c.getOrders().stream()
						.filter(o -> o.getTotal() > 90)
						.collect(Collectors.toList()).isEmpty() != true)
				.map(Client::getName).forEach(System.out::println);

	}
}
