import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class Chat {

        static Date DateDuJour = new Date();
        static DateFormat datefl = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);


        public final String id;
        public final String name;
        public final String race;
        public final int age;
        public final String sexe;

        // Création de chats fictifs
        public final static Chat Mia = new Chat("id-100", "Mia", "Persan", 5, "Femelle");
        public final static Chat Niou = new Chat("id-101", "Niou", "Bengal", 9, "Femelle");
        public final static Chat Miaou = new Chat("id-102", "Miaou", "Abyssin", 12, "Femelle");
        public final static Chat Chipsou = new Chat("id-103", "Chipsou", "Siamois", 18, "Mâle");
        

        // Ajout ligne par ligne des différents chat
        public final static String result = "Le chat " + Mia.name + ", qui et de race " + Mia.race + ", et qui a "
                        + Mia.age + " ans." + " Sexe " + Mia.sexe + "\nLe chat " + Niou.name + ", qui et de race " + Niou.race + ", et qui a "
                        + Niou.age + " ans." + " Sexe " + Niou.sexe + "\nLe chat " + Miaou.name + ", qui et de race " + Miaou.race
                        + ", et qui a " + Miaou.age + " ans." + " Sexe " + Miaou.sexe + "\nLe chat " + Chipsou.name + ", qui et de race "
                        + Chipsou.race + ", et qui a " + Chipsou.age + " ans." + " Sexe " + Chipsou.sexe;

        // Constructeur Chat
        public Chat(final String id, final String name, final String race, final int age, final String sexe) {

                super();
                this.id = id;
                this.name = name;
                this.race = race;
                this.age = age;
                this.sexe = sexe;

        }
        //

        public final static String resultLogs = 
        
                        datefl.format(DateDuJour) + " -- Création du chat portant le nom : " + Chat.Mia.name + " - Race du chat - " + Chat.Mia.race + " Sexe : " + Chat.Chipsou.sexe + "\r\n" +    
                        
                        datefl.format(DateDuJour) + " -- Création du chat portant le nom : " + Chat.Niou.name
                        + " - Race du chat - " + Chat.Niou.race + " Sexe : " + Chat.Chipsou.sexe + "\r\n" + 
                        
                        datefl.format(DateDuJour) + " -- Création du chat portant le nom : "
                        + Chat.Miaou.name + " - Race du chat - " + Chat.Miaou.race + " Sexe : " + Chat.Chipsou.sexe + "\r\n" +                    
                        
                        datefl.format(DateDuJour) + " -- Création du chat portant le nom : " + Chat.Chipsou.name + " - Race du chat - "
                        + Chat.Chipsou.race + " Sexe : " + Chat.Chipsou.sexe + "\r\n";

        public static void ChatsDebug(String ContentTextLogs) throws IOException {

                        if (CheckEmptyFile().length() == 0) {
                                SaveText(result.toString());
                        }

                        if (CheckEmptyFileLogs().length() == 0) {
                                SaveTextLogs(resultLogs.toString());
                        }
        }

        // Class permettant de sauvegarder les logs
        public static String SaveTextLogs(String ContentText) throws IOException {
                FileWriter fileWriter = new FileWriter("Logs.txt");
                fileWriter.write(ContentText);

                fileWriter.close();

                return ContentText;
        }

        public static File CheckEmptyFileLogs() {

                    File file = new File("Logs.txt");

                    return file;
        }

        public static File CheckEmptyFile() {

                File file = new File("ListeChat.txt");
                return file;
    }

        // Class permettant de sauvegarder le texte
        public static String SaveText(String ContentText) throws IOException
        {
        FileWriter fileWriter = new FileWriter("ListeChat.txt");
        fileWriter.write(ContentText);
        
        fileWriter.close();

        return ContentText;
        }
   
}