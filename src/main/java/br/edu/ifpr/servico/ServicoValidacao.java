package br.edu.ifpr.servico;

public class ServicoValidacao {

    public boolean validarTamanho(String senha){
        if(senha.length() >= 8){ 
            return true;
        }
        else{ 
        return false;
        }
    }

    public boolean validarMaiusculo(String senha){
        
        for(int i =1; i < senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    public boolean validarMinusculo(String senha){

        for(int i = 0; i < senha.length(); i++){
            if(Character.isLowerCase(senha.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean validarNumero(String senha){
        for(int i = 0; i < senha.length(); i++){
            if(Character.isDigit(senha.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean validarCaractereEspecial(String senha){
        for(int i = 0; i < senha.length(); i++){
            if(!Character.isLetterOrDigit(senha.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
