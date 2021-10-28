package tp;

public class Surface {
    public static int multiplier (int a, int d) {
            int res;
            res = a * d;
            return res;
    }
    public static void main(String[]  argv) {
            int longueur = 5;//10
            int largeur = 6;
            int surface = multiplier(longueur, largeur);
            System.out.println ("La surface est : " + surface);
    }
}
