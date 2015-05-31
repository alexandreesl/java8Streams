package com.alexandreesl.handson;

import java.util.List;

public class StreamsFirstSteps {

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

	}

}
