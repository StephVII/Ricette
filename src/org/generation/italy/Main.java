package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		HashMap<String, Float> listaIngredienti = new HashMap<>();
		listaIngredienti.put("latte", 6.4f);
		listaIngredienti.put("acqua", 0f);
		listaIngredienti.put("zucchero", 4f);
		listaIngredienti.put("sale", 0f);
		listaIngredienti.put("uova", 155f);
		listaIngredienti.put("cannella", 2.47f);
		listaIngredienti.put("cioccolato fondente", 5.52f);
		listaIngredienti.put("pasta sfoglia", 5.58f);
		listaIngredienti.put("farina", 3.5f);
		listaIngredienti.put("burro", 7.5f);
		
		
		int i;
		String ricetta, ingrediente, risposta;
		Float quantità, calorie;
		calorie = 0f;
		
		System.out.println("Quale ricetta vuole cucinare?");
		ricetta = sc.nextLine();
		System.out.println("\nEcco gli ingredienti a disposizione:");
		
		for(String t:listaIngredienti.keySet())
		{
			System.out.println("- "+t);
		}
		
		do
		{
			
			System.out.print("Inserire l'ingrediente richiesto: ");
			ingrediente = sc.nextLine();
			ingrediente = ingrediente.toLowerCase();
			if(listaIngredienti.containsKey(ingrediente))
			{
				System.out.print("Inserire i grammi o milliletri dell'ingrediente scelto desiderati: ");
				quantità = Float.parseFloat(sc.nextLine());
				calorie = calorie+(quantità*listaIngredienti.get(ingrediente));
			}
			else
				System.out.println("Il prodotto inserito non è presente nella lista.");
			
			System.out.println("Vuoi inserire un altro ingrediente? (si/no)");
			risposta = sc.nextLine();
			risposta = risposta.toLowerCase(); 
		
		}
		while(risposta.equals("si"));
		
		System.out.println("\nLe calorie totali per la ricetta '"+ricetta+"' ammontano a: "+calorie);
	}

}
