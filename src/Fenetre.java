import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame implements ActionListener
{
    private JPanel accueil = new JPanel();
    private JButton adminBtn = new JButton("Administration des membres");
    private JButton collecteBtn = new JButton("Création d'une collecte");
    private JButton btn3 = new JButton("Gestion des animaux à adopter");
    private JButton btn4 = new JButton("Historique des animaux adoptés");
    private JButton btn5 = new JButton("Historique des collectes");
    private JButton exitBtn = new JButton("Quitter");
    private GridLayout gl = new GridLayout(3,2);
    private GridLayout gl2 = new GridLayout(1,6);
    public Fenetre()
    {
        this.setTitle("Refuge du Languedoc");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(accueil);
        accueil.setLayout(gl);
        accueil.add(adminBtn);
        adminBtn.addActionListener(this);

        accueil.add(collecteBtn);
        collecteBtn.addActionListener(this);

        accueil.add(btn3);
        btn3.addActionListener(this);

        accueil.add(btn4);
        btn4.addActionListener(this);

        accueil.add(btn5);
        btn5.addActionListener(this);

        accueil.add(exitBtn);
        exitBtn.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == adminBtn){
            //TODO FAIRE LISTE AVEC BOUCLES POUR SORTIR UN TABLEAU PAR LIGNE POUR CHAQUE MEMBRE
            JFrame administration = new JFrame();
            administration.setTitle("Liste des membres");
            administration.setLayout(gl2);
            administration.setSize(new Dimension(800,600));
            JLabel id = new JLabel("#");
            JLabel name = new JLabel("Prénom");
            JLabel surname = new JLabel("Nom");
            JLabel estFA = new JLabel("est FA");
            JLabel nbAnimaux = new JLabel("Nombre d'animaux");
            JLabel delete = new JLabel("Supprimer le membre");
            JButton registerBT = new JButton("Enregistrer");

            administration.add(id);
            administration.add(name);
            administration.add(surname);
            administration.add(estFA);
            administration.add(nbAnimaux);
            administration.add(delete);
            administration.add(registerBT);
            administration.setVisible(true);
        }
        else if(e.getSource() == collecteBtn){

            System.out.print("CREATION DE COLLECTE");
        }

        else if (e.getSource() == exitBtn){
            System.exit(0);
        }
    }
}

