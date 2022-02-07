import typeOfUsers.Admin;
import typeOfUsers.RGM;
import typeOfUsers.RM;
import typeOfUsers.Worker;

public class DataBase {

    protected DataBase(String log,String pass){

        switch (checkLgAndPass(log,pass)){
            case ("admin"): giveAdmin();break;
            case ("worker"): giveWorker();break;
            case ("RGM"): giveRGM();break;
            case ("recruitsM"):giveRM();break;
            case ("nothing"):giveNothing();break;
        }
    }
   static String checkLgAndPass(String lg, String pas){
        // Тут проверка по базе данных и определение к какой роли относится юзер (админ, работник, директор, рекрутМенеджер)
       String user = null;
       return  user;
   }

    static void giveAdmin(){
        Admin admin = new Admin();
    } static void giveWorker(){
        Worker worker = new Worker();
    } static void giveRGM(){
        RGM rgm = new RGM();
    } static void giveRM(){
        RM rm = new RM();
    } static void giveNothing(){
        System.out.println("Юзер с таким логином и паролем отсутствует. Пожалуйста, попробуйте ввести данные ещё раз!");
        mMenu menu = new mMenu();
    }
}
