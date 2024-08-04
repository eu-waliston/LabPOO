package Modulo_5;

public class ConfigManager {

    //Instancia privada estática da propria classe
    private static ConfigManager instance;

    //Variavel de configiração
    private String configValue;

    //Construtor privado para enviar instanciamento externo
    private ConfigManager() {
        //inicailização de config
        configValue = "Defaullt Config Value";
    }

    // Método público estático para obter a instância única
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    //Metodo para obter o valor da config
    public String getConfigValue() {
        return configValue;
    }

    //Metodo para definir o valor da config
    public void setConfigValue(String value) {
        this.configValue = value;
    }

}
