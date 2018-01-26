/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import controller.AbstractController;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author vince
 */
public class MaFenetre {

 
    
    private AbstractController controller;
    
    public MaFenetre(AbstractController controller) {
            JFrame fenetreP = new JFrame();
            fenetreP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenetreP.setSize(900, 600);
            fenetreP.setLocationRelativeTo(null);
            fenetreP.setVisible(true);
            
            final JDesktopPane desktop = new JDesktopPane();
            fenetreP.add(desktop, BorderLayout.CENTER);
            
              final JMenuBar menu = new JMenuBar();
  
                JMenu fichier = new JMenu("Utilisateurs");
                    JMenuItem nouveau = new JMenuItem("Nouveau");
                    fichier.add(nouveau);
                    JMenuItem profil = new JMenuItem("Profil");
                    fichier.add(profil);

                    
                JMenu fond = new JMenu("Fond Documentaire");
                    JMenuItem ajouter = new JMenuItem("Ajouter");
                    fond.add(ajouter);
                    JMenuItem consulter = new JMenuItem("Consulter & sélectionner");
                    fond.add(consulter);

                
                JMenu pret = new JMenu("Prêts");
                    JMenuItem retour = new JMenuItem("Retours");
                    pret.add(retour);
                    JMenuItem sortie = new JMenuItem("Sorties");
                    pret.add(sortie);
                    JMenuItem etat = new JMenuItem("Etats");
                    pret.add(etat);
                
                JMenu param = new JMenu("Paramètres");
                    JMenuItem categorie = new JMenuItem("Catégories");
                    param.add(categorie);
                    JMenuItem regle = new JMenuItem("Règles");
                    param.add(regle);
                
                fenetreP.add(menu, BorderLayout.NORTH);
                menu.add(fichier);
                menu.add(fond);
                menu.add(pret);
                menu.add(param);
                
                nouveau.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Nouvel utilisateur");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                
                profil.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Profil,contact et édition");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                ajouter.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Ajouter des références à la base documentaire");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                consulter.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Consulter la base documentaire");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                retour.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Retours");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                sortie.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Sorties");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                etat.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Etats des prêts");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                categorie.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Gestion des catégories");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
                regle.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                JInternalFrame jif = new JInternalFrame();
                jif.setTitle("Gestion des règles");
                jif.setClosable(true);
                jif.setResizable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.toFront();
                jif.setSize(400, 400);
                desktop.add(jif);
                jif.setVisible(true);
                int frameCountX = 0;
                int frameCountY = 0;
                jif.setLocation(new Point(15*frameCountY+100*frameCountX, 15*frameCountY));
                if(frameCountY++>8){
                frameCountY=1;
                if(frameCountX++>4){
                frameCountY=1;
                frameCountX=1;
                }
                }
                });
                
            
    }
    public static void main(String[] args){
    
    try{
     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }
    catch(Exception e){}
    
   
    

    
    }

  
}
