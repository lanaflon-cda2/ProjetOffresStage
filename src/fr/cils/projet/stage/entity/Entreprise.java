package fr.cils.projet.stage.entity;

import javafx.scene.control.RadioButton;

import java.util.ArrayList;

public class Entreprise
{
    public int id;
    public String raisonSociale;
    public String mail;
    public String ville;
    public String rue;
    public String codePostal;
    public String tel;
    public String secteurActivite;
    public Utilisateur createur;
    public ArrayList<OffreStage> offresStage;
    public RadioButton selecteur;


    @Override
    public boolean equals(Object obj)
    {
        boolean result;
        if((obj == null) || (getClass() != obj.getClass()))
        {
            result = false;
        }
        else
        {
            Entreprise e = (Entreprise) obj;
            result = id == e.id;
        }
        return result;
    }

    public Entreprise(String raisonSociale, String mail, String ville, String rue,
                      String codePostal, String tel, String secteurActivite)
    {
        this.raisonSociale = raisonSociale;
        this.mail = mail;
        this.ville = ville;
        this.rue = rue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.secteurActivite = secteurActivite;
        this.offresStage = new ArrayList<>();
        this.selecteur = new RadioButton();
        this.selecteur.setUserData(this.id);
    }

    public Entreprise(int id, String raisonSociale, String mail, String ville, String rue,
                      String codePostal, String tel, String secteurActivite, ArrayList<OffreStage> offresStage)
    {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.mail = mail;
        this.ville = ville;
        this.rue = rue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.secteurActivite = secteurActivite;
        this.offresStage = offresStage;
        this.selecteur = new RadioButton();
        this.selecteur.setUserData(this.id);
    }

    public Entreprise(int id, String raisonSociale, String mail, String ville, String rue,
                      String codePostal, String tel, String secteurActivite)
    {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.mail = mail;
        this.ville = ville;
        this.rue = rue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.secteurActivite = secteurActivite;
        this.offresStage = new ArrayList<>();
        this.selecteur = new RadioButton();
        this.selecteur.setUserData(this.id);
    }

    public String getRaisonSociale()
    {
        return this.raisonSociale;
    }

    public String getSecteurActivite()
    {
        return this.secteurActivite;
    }

    public RadioButton getSelecteur()
    {
        return this.selecteur;
    }

    public Entreprise(int id, String raisonSociale, String mail, String ville, String rue,
                      String codePostal, String tel, String secteurActivite, Utilisateur createur)
    {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.mail = mail;
        this.ville = ville;
        this.rue = rue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.secteurActivite = secteurActivite;
        this.createur = createur;
        this.offresStage = new ArrayList<>();
        this.selecteur = new RadioButton();
        this.selecteur.setUserData(this.id);
    }

    public Entreprise(String raisonSociale, String mail, String ville, String rue,
                      String codePostal, String tel, String secteurActivite, Utilisateur createur)
    {
        this.raisonSociale = raisonSociale;
        this.mail = mail;
        this.ville = ville;
        this.rue = rue;
        this.codePostal = codePostal;
        this.tel = tel;
        this.secteurActivite = secteurActivite;
        this.createur = createur;
        this.offresStage = new ArrayList<>();
        this.selecteur = new RadioButton();
        this.selecteur.setUserData(this.id);
    }
}
