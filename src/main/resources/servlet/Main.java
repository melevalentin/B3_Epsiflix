package servlet;
import business.Media;
import business.Type;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = HibernateUtil.newSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Type type = new Type("Thriller");
            System.out.println(type);
            HibernateUtil.persist(session, type);



            /*
            Structure struct1 = (Structure) HBUtil.loadById(session, "structures.orm.annot.Structure",
                    new Integer(1));
            System.out.println("Structure avec identifiant 1 : " + struct1);
            Structure struct2 = (Structure) HBUtil.getById(session, "structures.orm.annot.Structure",
                    new Integer(10000));
            System.out.println("Structure avec identifiant 10000 : " + struct2);

            System.out.println("Liste secteurs avant insertions :");

            List<Secteur> secteurs = session.createQuery("from Secteur").list();
            for (Secteur s : secteurs) {
                System.out.println(s);
            }

            Secteur s3 = new Secteur("Sante");
            HBUtil.persist(session, s3);

            System.out.println("Liste secteurs apr�s insertions :");

            secteurs = session.createQuery("from Secteur").list();
            for (Secteur s : secteurs) {
                System.out.println(s);
            }

            Secteur secteur = (Secteur) session.createQuery("from Secteur s where s.libelle=:label")
                    .setParameter("label", "Sante").uniqueResult();
            System.out.println(secteur);

            secteur.setLibelle("Sant�");

            System.out.println("Apr�s renommage en sant� :");

            secteurs = session.createQuery("from Secteur").list();
            for (Secteur s : secteurs) {
                System.out.println(s);
            }

            HBUtil.delete(session, secteur);

            System.out.println("Apr�s suppression sant� :");

            secteurs = session.createQuery("from Secteur").list();
            for (Secteur s : secteurs) {
                System.out.println(s);
            }

            System.out.println("Liste des secteurs_structures avant insertion EADS :");

            List<SecteursStructures> secStructs = session.createQuery("from SecteursStructures").list();
            for (SecteursStructures secStruct : secStructs) {
                System.out.println("Secteur_structure : id=" + secStruct.getId() + ", structure=" + secStruct.getStructure()
                        + ", secteur=" + secStruct.getSecteur());
            }

            Structure eads = new Structure("EADS", "rue EADS", "31000", "Toulouse", false);
            Secteur s1 = new Secteur("A�ronautique");
            Secteur s2 = new Secteur("A�rospatial");
            SecteursStructures sectStruct1 = new SecteursStructures(s1, eads);
            SecteursStructures sectStruct2 = new SecteursStructures(s2, eads);

            HBUtil.persist(session, sectStruct1);
            HBUtil.persist(session, sectStruct2);

            System.out.println("Liste des secteurs_structures apr�s insertion EADS :");

            secStructs = session.createQuery("from SecteursStructures").list();
            for (SecteursStructures secStruct : secStructs) {
                System.out.println("Secteur_structure : id=" + secStruct.getId() + ", structure=" + secStruct.getStructure()
                        + ", secteur=" + secStruct.getSecteur());
            }

            Secteur medias = new Secteur("M�dias");
            Structure FR2 = new Structure("France2", "1 quai du point du jour",
                    "92100", "Boulogne-Billancourt", false);
            SecteursStructures medias_FR2 = new SecteursStructures(medias, FR2);
            HBUtil.persist(session, medias_FR2);

            HBUtil.delete(session, medias_FR2);

            tx.commit();*/

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

        sessionFactory.close();
    }
}