
public class Main {
/**	
	public static void menu (Scanner sc, ArrayList list) {
		Integer choix = 0;
		final String SEPARATEUR = " ";
		String selection;
		 do {
			 System.out.println("Gestion de la liste de personnes");
			 System.out.println("\n** Entrez l'option souhait�e : **\n");
			 choix = sc.nextInt();
			 sc.nextLine();
			 
			 selection = sc.nextLine();
			 
			 if ((selection.substring(0, 1)) == "A" ) {
				 String mots[] = selection.split(SEPARATEUR);
				 ajouterPersonne(list, mots[1]);	 
			 }
			 
			 else if ((selection.substring(0, 1)) == "L") {
				 afficherListePersonne(list);
			 }
			 
			 else if ((selection.substring(0, 1)) == "Q") {
				 sc.close();
			 }
		 } while(!((selection.substring(0, 1)) == "Q"));
			 
			 
	}
	
	public static void ajouterPersonne(ArrayList list, String personne) {
		list.add(personne);
	}
	
	public static ArrayList<String> afficherListePersonne(ArrayList list) {
		return list;
	}
**/

	public static void main(String[] args) {
	System.out.println("Coucou");
	DBParams params = new DBParams(args[0], 4096, 4);

	}

}
