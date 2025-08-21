public class fabricaRetangulo implements iFabrica {
    public iForma criar() {
        return new retangulo();
    }
}
