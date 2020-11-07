// Petit programme crée par Gaëtan Seigneur
// Je me réserve le droit de supprimer, modifier, ou de le rendre privé

import java.util.Calendar;
import java.util.Date;

public class DayImg {


    // Class permettant de récupérer la date du jour et qui permet aussi de switcher entre les mois de l'année
    // Switch calendar.get(Calendar.MONTH) == 10 / Switch sur 10 etc...
    // Et donc le return permet d'afficher le résultat sur la Page Programme
    // Les mois ici commençant par 0
    
    public static String DayByImg(){

        Date DateDuJour = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateDuJour);

            String resultmonth;

            switch (calendar.get(Calendar.MONTH)) {
                case 0:  resultmonth = "0"; // Janvier
                         break;
                case 1:  resultmonth = "1"; // Février
                         break;
                case 2:  resultmonth = "2"; // Mars
                         break;
                case 3:  resultmonth = "3"; // Avril
                         break;
                case 4:  resultmonth = "4"; // Mai
                         break;
                case 5:  resultmonth = "5"; // Juin
                         break;
                case 6:  resultmonth = "6"; // Juillet
                         break;
                case 7:  resultmonth = "7"; // Août
                         break;
                case 8:  resultmonth = "8"; // Septembre
                         break;
                case 9: resultmonth = "9"; // Octobre
                         break;
                case 10: resultmonth = "10"; // Novembre
                         break;
                case 11: resultmonth = "11"; // Décembre
                         break;
                default: resultmonth = "0"; // Valeur par défault
                         break;
            }

    return resultmonth;
    }
}
