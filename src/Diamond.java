public class Diamond extends Triangle{

    public String printBlank (int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += " ";
        }
        return res;
    }

    public String printLine (int i,int n) {
        String res = "";
        return printBlank(n-i)+printHorizontalLine(1+(i-1)*2)+printBlank(n-i);
    }

    public String printIsoscelesTriangle(int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += printLine(i+1,n) + "\n";
        }
        return res;
    }

    public String printDiamond(int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += printLine(i+1,n) + "\n";
        }
        for (int i = n-1; i > 0; i--) {
            res += printLine(i,n) + "\n";
        }
        return res;
    }

    public String printName (int n) {
        String name = "Syndrome";
        if (name.length() >= (n-1)*2+1) {
            return name;
        }
        int len = (n-name.length())/2;
        return printBlank(len)+name;
    }

    public String printDiamondAndName(int n) {
        String res = "";
        for (int i = 0; i < n-1; i++) {
            res += printLine(i+1,n) + "\n";
        }
        res += printName(n)+"\n";
        for (int i = n-1; i > 0; i--) {
            res += printLine(i,n) + "\n";
        }
        return res;
    }
}
