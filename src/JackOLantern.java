public class JackOLantern extends Object{
    private String [][] faceFeatures;

    public JackOLantern (String [][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures [row][column] = replace;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void fill(String str){
        for (i = 0; i < faceFeatures.length ; i++){
            for (n = 0; n < faceFeatures[i].length; n++){
                faceFeatures [i][n] = str;
            }
        }
    }
}
