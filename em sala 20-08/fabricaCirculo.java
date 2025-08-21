public class fabricaCirculo implements iFabrica {
    public iForma criar() {
        return new circulo();
    }
}
