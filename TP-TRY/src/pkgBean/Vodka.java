package pkgBean;

import java.io.Serializable;

public class Vodka implements Serializable{
	
	int id;
	String titre;
	String idMarque;
	String marque;
	String description;
	String idCathegorie;
	String cathegorie;
	String quantite;
	int stock;
	String pays;
	double prix;
	String image_small;
	String image_big;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getImage_small() {
		return image_small;
	}
	public void setImage_small(String image_small) {
		this.image_small = image_small;
	}
	public String getImage_big() {
		return image_big;
	}
	public void setImage_big(String image_big) {
		this.image_big = image_big;
	}
	public String getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(String idMarque) {
		this.idMarque = idMarque;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIdCathegorie() {
		return idCathegorie;
	}
	public void setIdCathegorie(String idCathegorie) {
		this.idCathegorie = idCathegorie;
	}
	public String getCathegorie() {
		return cathegorie;
	}
	public void setCathegorie(String cathegorie) {
		this.cathegorie = cathegorie;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}
