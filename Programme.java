import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Programme {

  static MouseAdapter iconLogs;
  static MouseAdapter btnaddchats;
  static MouseAdapter btnremovechats;

  public static void main(String[] args) throws Exception {

    SwingUtilities.invokeLater(new Runnable() {

      public void run() {

        System.out.print("\r\n" + " -- Démarrage du programme -- " + "\r\n" + "\r\n");

        // Lancement du script java Chat
        Chat.ChatsDebug();

        // Création d'une instance Window
        JFrame window = new JFrame("Les Chats !");
        window.setSize(500, 700); // Taille de la fenêtre
        window.setVisible(true); // Permet de rendre la fenêtre visible
        window.setLocation(450, 75); // Permet de déplacer la fenêtre
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme tout les scripts java
        window.setResizable(false); // Supprime le redimensionnement de la fenêtre
        window.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR)); // Changement de curseur
        Container contentPane = window.getContentPane();

        // Groupe des boutons
        GroupLayout groupLayout = new GroupLayout(contentPane);
        contentPane.setLayout(groupLayout);

        // Panneau bouton chat
        Icon addChatsIcon = new ImageIcon("http://79.91.234.196:7081/Chat_App/images/chat-btn.png");
        JButton removeChats = new JButton("Supprimé un chat", addChatsIcon);
        JButton addChats = new JButton("Ajouté un chat", addChatsIcon);
        addChats.setHorizontalTextPosition(SwingConstants.CENTER);
        addChats.setForeground(Color.BLACK);
        removeChats.setHorizontalTextPosition(SwingConstants.CENTER);
        removeChats.setForeground(Color.BLACK);

        // Taille des boutons
        addChats.setSize(180, 35);
        removeChats.setSize(180, 35);

        // Position des boutons
        addChats.setLocation(50, 620);
        removeChats.setLocation(270, 620);

        // Ajout des boutons
        contentPane.add(addChats);
        contentPane.add(removeChats);

        // Ajout Label Chat
        JLabel label = new JLabel("Les différents chats dans notre base de donnée :");
        contentPane.add(label);

        label.setLocation(10, 10);
        label.setSize(400, 20);

        // Style de la pane
        JTextArea pane = new JTextArea();
        SimpleAttributeSet set = new SimpleAttributeSet();
        set = new SimpleAttributeSet();
        StyleConstants.setItalic(set, false);
        StyleConstants.setForeground(set, Color.black);
        StyleConstants.setBold(set, true);
        pane.setAutoscrolls(false);
        pane.setDocument(new JTextFieldLimit(640));
        pane.setLineWrap(true);

        // Ajout ligne par ligne des différents chat
        pane.setText("" + Chat.result);
        //

        // On ajout la pane au JFrame
        pane.setEditable(false);
        pane.setLocation(8, 40);
        pane.setSize(480, 180);
        pane.setOpaque(false);
        contentPane.add(pane);
        contentPane.setBackground(Color.LIGHT_GRAY);

        // Séparateur entre la pane et le formulaire
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        contentPane.add(separator);
        separator.setLocation(0, 230);
        separator.setSize(500, 25);
        //

        // Label Formulaire
        JLabel name = new JLabel("Nom du chat :");
        JLabel race = new JLabel("Race du chat :");
        JLabel age = new JLabel("Age du chat :");
        JLabel image = new JLabel("Image du chat : Lien HTML");

        name.setLocation(30, 240);
        name.setSize(200, 20);

        race.setLocation(270, 240);
        race.setSize(200, 20);

        age.setLocation(30, 310);
        age.setSize(200, 20);

        image.setLocation(270, 310);
        image.setSize(200, 20);
        //

        // Ajout des label formulaire au Pane
        contentPane.add(name);
        contentPane.add(race);
        contentPane.add(age);
        contentPane.add(image);
        //

        // Formulaire Texte pour l'ajout des chats
        JTextField Name = new JTextField("");
        JTextField Race = new JTextField("");
        JTextField LienImage = new JTextField("");

        // Age
        Vector<String> ListAge = new Vector<>(31);

        int b = 31;

        for (int j = 1; j < b; j++) {

          ListAge.add(j + " an(s)");

        }

        JComboBox<String> Age = new JComboBox<>(ListAge);
        //

        Name.setLocation(30, 270);
        Name.setSize(200, 30);
        Name.setFont(FontChat.fontchat1);
        Name.setDocument(new JTextFieldLimit(20));
        Name.setOpaque(false);
        Name.setBorder(new BordureSimpleChat());
        Name.setToolTipText("Nom du chat");

        Race.setLocation(270, 270);
        Race.setSize(200, 30);
        Race.setFont(FontChat.fontchat1);
        Race.setDocument(new JTextFieldLimit(20));
        Race.setOpaque(false);
        Race.setBorder(new BordureSimpleChat());
        Race.setToolTipText("Race du chat");

        Age.setLocation(30, 340);
        Age.setSize(200, 30);
        Age.setOpaque(false);
        Age.setBackground(Color.LIGHT_GRAY);
        Age.setFont(FontChat.fontchat1);
        Age.setBorder(new BordureSimpleChat());
        Age.setToolTipText("Age du chat");

        LienImage.setLocation(270, 340);
        LienImage.setSize(200, 30);
        LienImage.setOpaque(false);
        LienImage.setFont(FontChat.fontchat1);
        LienImage.setBorder(new BordureSimpleChat());
        LienImage.setToolTipText("Lien image du chat");

        contentPane.add(Name);
        contentPane.add(Race);
        contentPane.add(Age);
        contentPane.add(LienImage);
        //

        // Image de fond
        ImageIcon imageIcon;

        imageIcon = new ImageIcon("http://79.91.234.196:7081/Chat_App/images/CHARTREUX.png");
        Image Images = imageIcon.getImage();
        Image newimg = Images.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);

        JLabel Background = new JLabel(imageIcon);
        contentPane.add(Background);
        Background.setIcon(imageIcon);
        Background.setLocation(170, 420);
        Background.setSize(150, 150);
        //

        // Button Log
        ImageIcon imageIcon2;
        imageIcon2 = new ImageIcon("http://79.91.234.196:7081/Chat_App/images/logs.png");
        Image Images2 = imageIcon2.getImage();
        Image newimg2 = Images2.getScaledInstance(48, 48, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg2);

        JLabel Logs = new JLabel(imageIcon2);
        contentPane.add(Logs);
        Logs.setIcon(imageIcon2);
        Logs.setLocation(450, 5);
        Logs.setSize(40, 40);
        Logs.setToolTipText("Voir les logs");

        Logs.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseEntered(MouseEvent e) {
            window.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          }

          @Override
          public void mouseExited(MouseEvent e) {
            window.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
          }
        });

        iconLogs = new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent me) {
            super.mouseClicked(me);
            iconlogs();
          }

          public void iconlogs() {
            // Déclaration de l'action du button des logs
            // Création d'une instance LogsFrame
            JFrame LogsFrame = new JFrame("Logs");
            LogsFrame.setSize(500, 400); // Taille de la fenêtre
            LogsFrame.setVisible(true); // Permet de rendre la fenêtre visible
            LogsFrame.setLocation(450, 75); // Permet de déplacer la fenêtre
            LogsFrame.setResizable(false); // Supprime le redimensionnement de la fenêtre
            LogsFrame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); // Changement de curseur
            Container contentPaneLogs = LogsFrame.getContentPane();

            GroupLayout groupLayout2 = new GroupLayout(contentPaneLogs);
            contentPaneLogs.setLayout(groupLayout2);

            // Style de la pane
            JTextArea paneLogs = new JTextArea();
            SimpleAttributeSet set = new SimpleAttributeSet();
            set = new SimpleAttributeSet();
            StyleConstants.setItalic(set, false);
            StyleConstants.setForeground(set, Color.black);
            StyleConstants.setBold(set, true);
            paneLogs.setAutoscrolls(true);
            paneLogs.setDocument(new JTextFieldLimit(1600));
            paneLogs.setLineWrap(true);

            // Ajout ligne par ligne des différents chat
            paneLogs.setText("" + Chat.resultLogs);
            //

            // On ajout la pane au JFrame
            paneLogs.setEditable(true);
            paneLogs.setLocation(0, 0);
            paneLogs.setSize(500, 400);
            paneLogs.setOpaque(true);
            contentPaneLogs.add(paneLogs);
            contentPaneLogs.setBackground(Color.LIGHT_GRAY);
            //
          }
        };

        btnaddchats = new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent me) {
            super.mouseClicked(me);
            try {
              btnaddchats();
            } catch (IOException e) {
              
              e.printStackTrace();
            }
           
          }

          public void btnaddchats() throws IOException {

            System.out.print("Vous avez ajouté un chat\n");

            pane.setText(pane.getText() + "\nLe chat " + Name.getText() + ", qui et de race " + Race.getText()
                + ", et qui a " + Age.getSelectedItem() + " ans.");

              String fileContent = pane.getText();
     
              FileWriter fileWriter = new FileWriter("ListeChat.txt");
              fileWriter.write(fileContent);
              
              fileWriter.close();
              }

            }; 
            
            btnremovechats = new MouseAdapter() {
              @Override
              public void mouseClicked(MouseEvent me) {
                  super.mouseClicked(me);
                  btnremovechats();
              }
    
              public void btnremovechats() {

                  System.out.print("\nVous avez suprimée un chat\n");

              }
            };     
              
        Logs.addMouseListener(iconLogs);  
        addChats.addMouseListener(btnaddchats); 
        removeChats.addMouseListener(btnremovechats); 
        //

      }       
    });
  }
  

    // Class pour la personnalisation du texte
    public static class FontChat {
        static final Font fontchat1 = new Font("Serif", Font.BOLD, 11);
    }
    //

    // Class pour la Limitation du texte
    public static class JTextFieldLimit extends PlainDocument {

        private static final long serialVersionUID = 1L;

        private int limit;

        JTextFieldLimit(int limit) {
           super();
           this.limit = limit;
        }

        JTextFieldLimit(int limit, boolean upper) {
           super();
           this.limit = limit;
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
           if (str == null)
              return;
           if ((getLength() + str.length()) <= limit) {
              super.insertString(offset, str, attr);
           }
        }
     }

     // Bordure des formulaires
     public static class BordureSimpleChat implements Border {
        int top,left,bottom,right;
        Color color = null;
        public BordureSimpleChat() {
          this.top = 2;
          this.left = 2;
          this.bottom = 2;
          this.right = 2;
          this.color = Color.darkGray;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Insets insets = getBorderInsets(c);
            if (color != null)
              g.setColor(color);
        
            g.fill3DRect(0, 0, width - insets.right, insets.top, true);
        
            g.fill3DRect(0, insets.top, insets.left, height - insets.top, true);
            g.fill3DRect(insets.left, height - insets.bottom, width - insets.left, insets.bottom, true);
            g.fill3DRect(width - insets.right, 0, insets.right, height - insets.bottom, true);
          }
          public Insets getBorderInsets(Component c) {
            return new Insets(top, left, bottom, right);
          }
          public boolean isBorderOpaque() {
            return true;
          }
        }
        //
      
}
