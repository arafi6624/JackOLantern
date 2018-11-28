public class Runner {
    public static void main(String[] args){
        String[][] face = new String[11][11];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("x");
        face1.edit(" ",0,0);
        face1.edit(" ",0,10);
        face1.edit(" ",10,0);
        face1.edit(" ",10,10);
        face1.edit(" ",2,2);
        face1.edit(" ",2,8);
        face1.edit(" ",5,5);
        face1.edit(" ",7,7);

        face1.edit("-",1,1);
        face1.edit("-",1,2);
        face1.edit("-",1,3);
        face1.edit("|",2,1);
        face1.edit("|",2,3);
        face1.edit("-",3,1);
        face1.edit("-",3,2);
        face1.edit("-",3,3);

        face1.edit("-",1,7);
        face1.edit("-",1,8);
        face1.edit("-",1,9);
        face1.edit("|",2,7);
        face1.edit("|",2,9);
        face1.edit("-",3,7);
        face1.edit("-",3,8);
        face1.edit("-",3,9);

        face1.edit("-",5,4);
        face1.edit("-",5,5);
        face1.edit("-",5,6);
        face1.edit("|",6,4);
        face1.edit("|",6,6);
        face1.edit("-",7,4);
        face1.edit("-",7,5);
        face1.edit("-",7,6);

        System.out.println(face1);
    }
}
