public class fabricaTriangulo implements iFabrica {
    
    @Override
    public iForma criar(){
        return new triangulo();
    }
}
