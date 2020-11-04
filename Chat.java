// Dev By Gaëtan Seigneur //

public class Chat {

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
    public final static String result = "Le chat " + Mia.name + ", qui et de race " + Mia.race + ", et qui a " + Mia.age
            + " ans." + "\nLe chat " + Niou.name + ", qui et de race " + Niou.race + ", et qui a " + Niou.age + " ans."
            + "\nLe chat " + Miaou.name + ", qui et de race " + Miaou.race + ", et qui a " + Miaou.age + " ans."
            + "\nLe chat " + Chipsou.name + ", qui et de race " + Chipsou.race + ", et qui a " + Chipsou.age + " ans.";

    // Constructeur Chat
    public Chat(final String id, final String name, final String race, final int age) {

        super();
        this.id = id;
        this.name = name;
        this.race = race;
        this.age = age;

    }
    //

    public final static String resultLogs = "/-------------------/" + "\r\n" + "\r\n"
            + " -- Création du chat portant le nom : " + Chat.Mia.name + " - Race du chat - " + Chat.Mia.race + "\r\n"
            + " -- Création du chat portant le nom : " + Chat.Niou.name + " - Race du chat - " + Chat.Niou.race + "\r\n"
            + " -- Création du chat portant le nom : " + Chat.Miaou.name + " - Race du chat - " + Chat.Miaou.race
            + "\r\n" + " -- Création du chat portant le nom : " + Chat.Chipsou.name + " - Race du chat - "
            + Chat.Chipsou.race + "\r\n" + "\r\n" + " /-------------------/ " + "\r\n";

    public static void ChatsDebug() {

        System.out.print(" /-------------------/ " + "\r\n" + "\r\n");
        System.out.print(" -- Création du chat portant le nom : " + Chat.Mia.name + " - Race du chat - " + Chat.Mia.race
                + "\r\n");
        System.out.print(" -- Création du chat portant le nom : " + Chat.Niou.name + " - Race du chat - "
                + Chat.Niou.race + "\r\n");
        System.out.print(" -- Création du chat portant le nom : " + Chat.Miaou.name + " - Race du chat - "
                + Chat.Miaou.race + "\r\n");
        System.out.print(" -- Création du chat portant le nom : " + Chat.Chipsou.name + " - Race du chat - "
                + Chat.Chipsou.race + "\r\n");
        System.out.print("\r\n" + " /-------------------/ " + "\r\n");
        
    }
}
