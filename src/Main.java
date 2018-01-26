import controller.*;
import model.*;
import view.MaFenetre;

public class Main {
    
    public static void main(String[] args) {
        
//Création du contrôleur
        AbstractController controller = new AccueilController();
        
 //Création de notre fenêtre principale (parent) avec le contrôleur en paramètre
        //new FramePpl(controller);
        new MaFenetre(controller);
    }
    
}
