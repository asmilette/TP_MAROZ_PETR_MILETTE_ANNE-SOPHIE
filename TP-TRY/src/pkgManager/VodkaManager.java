package pkgManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pkgBean.Vodka;
import pkgService.ConnectionBD;

public class VodkaManager {
private final static	String queryGetAll = "select * From imagesproduits  i INNER JOIN produits p ON i.idImagesProduits = p.idProduit"; //Liste produits	
private final static	String queryGetByCat = "select * From produitcathegorie pc INNER JOIN produits p ON pc.idProduit = p.idProduit INNER JOIN imagesproduits i ON p.idProduit=i.idImagesProduits where idCathegorie = ?" ; //Liste Cathegorie

public static ArrayList<Vodka> getAll(){
	
	ArrayList<Vodka> retour = null;
	PreparedStatement ps = ConnectionBD.getPS(queryGetAll);
	ResultSet result = null;
	try {			
		result = ps.executeQuery();		
		
		if(result.isBeforeFirst()){
			retour = new ArrayList<Vodka>();				
		}
		while (result.next()) {		
			Vodka uneVodka = new Vodka();
			
			/*SET POUR PRODUITS*/
			uneVodka.setId(result.getInt("idProduit")); //id
			uneVodka.setTitre(result.getString("titre")); //titre
			uneVodka.setImage_small(result.getString("parse_small")); //image
			uneVodka.setPrix(result.getDouble("prix")); //prix
			uneVodka.setDescription(result.getString("description"));//description
			
		//	uneVodka.setAttribute("id"i++);
			retour.add(uneVodka);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	pkgService.ConnectionBD.disconnect();
	return retour;
}


public static ArrayList<Vodka> getByCat(int cat){
	
	ArrayList<Vodka> retour = new ArrayList<Vodka>();
	PreparedStatement ps= ConnectionBD.getPS(queryGetByCat);
	ResultSet result = null;
	try {	

		
		ps.setInt(1, cat); 
		result = ps.executeQuery();			
		System.out.println("erreur if");

		while (result.next()) {		
			Vodka uneVodka = new Vodka();
			
			/*SET POUR PRODUITS*/
			uneVodka.setId(result.getInt("idProduit")); //id
			uneVodka.setTitre(result.getString("titre")); //titre
			uneVodka.setImage_small(result.getString("parse_small")); //image
			uneVodka.setPrix(result.getDouble("prix")); //prix
			uneVodka.setDescription(result.getString("description"));//description
			
		//	uneVodka.setAttribute("id"i++);
			retour.add(uneVodka);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	pkgService.ConnectionBD.disconnect();
	return retour;
}


}
