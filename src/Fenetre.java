import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame implements ActionListener
{
    private JPanel accueil = new JPanel();
    private JButton adminBtn = new JButton("Administration des membres");
    private JButton collecteBtn = new JButton("Création d'une collecte");
    private JButton gestionBtn = new JButton("Gestion des animaux à adopter");
    private JButton histoAniBtn = new JButton("Historique des animaux adoptés");
    private JButton histoCollBtn = new JButton("Historique des collectes");
    private JButton exitBtn = new JButton("Quitter");
    private GridLayout gl = new GridLayout(3,2);

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

        accueil.add(gestionBtn);
        gestionBtn.addActionListener(this);

        accueil.add(histoAniBtn);
        histoAniBtn.addActionListener(this);

        accueil.add(histoCollBtn);
        histoCollBtn.addActionListener(this);

        accueil.add(exitBtn);
        exitBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == adminBtn){
            JFrame administration = new JFrame();
            administration.setTitle("Liste des membres");
            administration.setLayout(new GridBagLayout());
            administration.setSize(new Dimension(800,600));

            JLabel id = new JLabel("#");
            GridBagConstraints c =  new GridBagConstraints();
            c.fill = GridBagConstraints.HORIZONTAL;
            c.anchor = GridBagConstraints.PAGE_START;
            c.gridx = 0;
            c.gridy = 0;
            c.insets = new Insets(0,0,0,0);  //top padding
            administration.add(id, c);

            JLabel name = new JLabel("Prénom");
            GridBagConstraints p =  new GridBagConstraints();
            p.fill = GridBagConstraints.HORIZONTAL;
            p.anchor = GridBagConstraints.PAGE_START;
            p.gridx = 1;
            p.gridy = 0;
            p.insets = new Insets(0,50,0,0);  //top padding
            administration.add(name, p);

            JLabel surname = new JLabel("Nom");
            GridBagConstraints sn = new GridBagConstraints();
            sn.fill = GridBagConstraints.HORIZONTAL;
            sn.anchor = GridBagConstraints.PAGE_START;
            sn.gridx = 2;
            sn.gridy = 0;
            sn.insets = new Insets(0,50,0,0);  //top padding
            administration.add(surname, sn);

            JLabel estFA = new JLabel("est FA");
            GridBagConstraints fa = new GridBagConstraints();
            fa.fill = GridBagConstraints.HORIZONTAL;
            fa.anchor = GridBagConstraints.PAGE_START;
            fa.gridx = 3;
            fa.gridy = 0;
            fa.insets = new Insets(0,50,0,0);  //top padding
            administration.add(estFA, fa);

            JLabel nbAnimaux = new JLabel("Nombre d'animaux");
            GridBagConstraints nba = new GridBagConstraints();
            nba.fill = GridBagConstraints.HORIZONTAL;
            nba.anchor = GridBagConstraints.PAGE_START;
            nba.gridx = 4;
            nba.gridy = 0;
            nba.insets = new Insets(0, 50, 0, 0);
            administration.add(nbAnimaux, nba);

            JLabel delete = new JLabel("Supprimer le membre");
            GridBagConstraints del = new GridBagConstraints();
            del.fill = GridBagConstraints.HORIZONTAL;
            del.anchor = GridBagConstraints.PAGE_START;
            del.gridx = 5;
            del.gridy = 0;
            del.insets = new Insets(0,50,0,0);
            administration.add(delete,del);

            JButton registerBT = new JButton("Enregistrer");
            GridBagConstraints r =  new GridBagConstraints();
            r.fill = GridBagConstraints.HORIZONTAL;
            r.ipady = 0;       //reset to default
            r.weighty = 1.0;   //request any extra vertical space
            r.anchor = GridBagConstraints.PAGE_END; //bottom of space
            r.insets = new Insets(10,0,0,0);  //top padding
            r.gridx = 1;       //aligned with button 2
            r.gridwidth = 15;   //2 columns wide
            r.gridheight = 3;
            r.gridy = 5;       //third row
            administration.add(registerBT, r);

            administration.setVisible(true);
        }
        else if(e.getSource() == collecteBtn)
        {
            System.out.print("CREATION DE COLLECTE\n");
        }
        else if(e.getSource() == gestionBtn)
        {
            System.out.print("GESTION DES ANIMAUX\n");
        }
        else if(e.getSource() == histoAniBtn)
        {
            System.out.print("HISTORIQUE DES ANIMAUX ADOPTES\n");
        }
        else if(e.getSource() == histoCollBtn)
        {
            System.out.print("HISTORIQUE DES COLLECTES\n");
        }
        else if (e.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }
}

