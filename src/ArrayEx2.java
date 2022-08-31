public class ArrayEx2 {

    public static void main(String args[]) {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.println("size of array " + (browsers.length-1));
        for(int i = 0; i<=(browsers.length-1); i++){
            System.out.println(browsers[i]);
        }

    }

}
