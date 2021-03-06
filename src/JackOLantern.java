public class JackOLantern{
    private String [][] faceFeatures;

    public JackOLantern (String [][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures [row][column] = replace;
    }

    public void fill(String str){
        for (int i = 0; i < faceFeatures.length ; i++){
            for (int n = 0; n < faceFeatures[i].length; n++){
                faceFeatures [i][n] = str;
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < faceFeatures.length ; i++){
            for (int n = 0; n < faceFeatures[i].length; n++){
                output = output + faceFeatures [i][n];
            }
            output = output + "\n";
        }
        return output;
    }

}
