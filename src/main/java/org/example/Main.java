package org.example;
import events.wish;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;



public class Main  {
    public static void main(String[] args) throws LoginException{
        JDABuilder builder;
        builder = JDABuilder.createDefault("OTcxMTk0ODk0NTMyMTEyNDA0.YnG9ug.VCPVW4dH7z9WsX36LHl_fuaartI");
        builder.addEventListeners(new wish());
        builder.setActivity(Activity.streaming("Listening to .help", ""));
        builder.build();
    }
}