package Modulo_5;

public class Main {

    public static void main(String[] args) {
       //Obtendo a instancia unica do ConfigMananger
       ConfigManager configManager = ConfigManager.getInstance();

       //Exibindo o valor da config
       System.out.println("Config Value: " + configManager.getConfigValue());

       //Alterando o valor da config
       configManager.setConfigValue("Updated Config Value");

       //Obtendo a instancia novamente e verificando a alteração
       ConfigManager anothConfigManager = ConfigManager.getInstance();

       System.out.println("Updated Config Value: " + anothConfigManager.getConfigValue());
    }

}
