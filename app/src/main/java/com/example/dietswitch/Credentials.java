package com.example.dietswitch;

import java.util.HashMap;
import java.util.Map;

public class Credentials {

    HashMap<String,String> credentialsMapper = new HashMap<String,String>();

    public void addCredentials(String username, String password){
        credentialsMapper.put(username, password);
    }

    public boolean checkUsername(String username){
        return credentialsMapper.containsKey(username);
    }

    public boolean verifyCredentials(String username,String password){

        /* controllo se l'username esiste*/
        if(credentialsMapper.containsKey(username)){
            /* controllo che le password corrispondano */
            if(password.equals(credentialsMapper.get(username))){
                return true;
            }
        }

        return false;
    }

    public void loadCredentials(Map<String, ?> preferencesMap){
        for(Map.Entry<String,?> entries : preferencesMap.entrySet()){
            if(!entries.getKey().equals("RememberMeCheckBox") || !entries.getKey().equals("LastSavedUsername")|| !entries.getKey().equals("LastSavedPassword")){
                credentialsMapper.put(entries.getKey(),entries.getValue().toString());
            }
        }
    }

}
