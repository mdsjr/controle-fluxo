public class FormatarCep {
    public static void main(String[] args) {  
        try {
            String CepFormatado = formatarCep("093552");
            System.out.println(CepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Digitação incorreta!");
            e.printStackTrace();
        }
  
  }
  static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
      throw new CepInvalidoException();
    
      //simulando um cep formatado
      return "23.765-064";
} 
}
