package com.alexandreesl.handson;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {

	public static List<Client> getData() {

		List<Client> list = new ArrayList<>();

		List<Order> orders;

		Order order;

		Client clientData = new Client();

		clientData.setName("Alexandre Eleuterio Santos Lourenco");
		clientData.setPhone(33455676l);
		clientData.setSex("M");

		list.add(clientData);

		orders = new ArrayList<>();

		order = new Order();

		order.setDescription("description 1");
		order.setId(1);
		order.setTotal(32.33);
		orders.add(order);

		order = new Order();

		order.setDescription("description 2");
		order.setId(2);
		order.setTotal(42.33);
		orders.add(order);

		order = new Order();

		order.setDescription("description 3");
		order.setId(3);
		order.setTotal(72.54);
		orders.add(order);

		clientData.setOrders(orders);

		clientData = new Client();

		clientData.setName("Lucebiane Santos Lourenco");
		clientData.setPhone(456782387l);
		clientData.setSex("F");

		list.add(clientData);

		orders = new ArrayList<>();

		order = new Order();

		order.setDescription("description 4");
		order.setId(4);
		order.setTotal(52.33);
		orders.add(order);

		order = new Order();

		order.setDescription("description 2");
		order.setId(5);
		order.setTotal(102.33);
		orders.add(order);

		order = new Order();

		order.setDescription("description 5");
		order.setId(6);
		order.setTotal(12.54);
		orders.add(order);

		clientData.setOrders(orders);

		clientData = new Client();

		clientData.setName("Ana Carolina Fernandes do Sim");
		clientData.setPhone(345622189l);
		clientData.setSex("F");

		list.add(clientData);

		orders = new ArrayList<>();

		order = new Order();

		order.setDescription("description 6");
		order.setId(7);
		order.setTotal(12.43);
		orders.add(order);

		order = new Order();

		order.setDescription("description 7");
		order.setId(8);
		order.setTotal(98.11);
		orders.add(order);

		order = new Order();

		order.setDescription("description 8");
		order.setId(9);
		order.setTotal(130.22);
		orders.add(order);

		clientData.setOrders(orders);

		return list;

	}

}
