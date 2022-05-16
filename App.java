public class App {
    public static void main(String[] args) throws Exception {
         Conta c1 = new Conta (); 
         c1.setNumConta(1111);
         c1.setDono("Cledson");
         c1.setTipo("CC");
         c1.setSaldo(12744.90f);
         c1.abrirConta("CC");
         c1.estadoAtual();
         
        
    }
}
