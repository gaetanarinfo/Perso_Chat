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

        // Création de chats fictifs
        public final static Chat Mia = new Chat("id-100", "Mia", "Persan", 5);
        public final static Chat Niou = new Chat("id-101", "Niou", "Bengal", 9);
        public final static Chat Miaou = new Chat("id-102", "Miaou", "Abyssin", 12);
        public final static Chat Chipsou = new Chat("id-103", "Chipsou", "Siamois", 18);

        // Ajout ligne par ligne des différents chat
        public final static String result = "Le chat " + Mia.name + ", qui et de race " + Mia.race + ", et qui a "
                        + Mia.age + " ans." + "\nLe chat " + Niou.name + ", qui et de race " + Niou.race + ", et qui a "
                        + Niou.age + " ans." + "\nLe chat " + Miaou.name + ", qui et de race " + Miaou.race
                        + ", et qui a " + Miaou.age + " ans." + "\nLe chat " + Chipsou.name + ", qui et de race "
                        + Chipsou.race + ", et qui a " + Chipsou.age + " ans.";

        // Constructeur Chat
        public Chat(final String id, final String name, final String race, final int age) {

                super();
                this.id = id;
                this.name = name;
                this.race = race;
                this.age = age;

        }
        //

        public final static String resultLogs = datefl.format(DateDuJour)
                        + " -- Création du chat portant le nom : " + Chat.Mia.name + " - Race du chat - "
                        + Chat.Mia.race + "\r\n" + datefl.format(DateDuJour) + " -- Création du chat portant le nom : " + Chat.Niou.name
                        + " - Race du chat - " + Chat.Niou.race + "\r\n" + datefl.format(DateDuJour) + " -- Création du chat portant le nom : "
                        + Chat.Miaou.name + " - Race du chat - " + Chat.Miaou.race + "\r\n"
                        + datefl.format(DateDuJour) + " -- Création du chat portant le nom : " + Chat.Chipsou.name + " - Race du chat - "
                        + Chat.Chipsou.race + "\r\n";

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

                    if(file.length() == 0) {
                        System.out.println("Fichier Vide");
                    }else{
                        System.out.println("Fichier remplie");
                    }

                    return file;
        }

        public static File CheckEmptyFile() {

                File file = new File("ListeChat.txt");

                if(file.length() == 0) {
                    System.out.println("Fichier Vide");
                }else{
                    System.out.println("Fichier remplie");
                }

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