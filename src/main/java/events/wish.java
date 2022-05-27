package events;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;


public class wish extends ListenerAdapter {


    public void onMessageReceived(MessageReceivedEvent ctx) {

        switch (ctx.getMessage().getContentRaw()) {
            case (".Wish"):
            case (".wish"):


                TimerTask task = new TimerTask() {
                    public void run() {
                        Calendar calendar = new GregorianCalendar();
                        EmbedBuilder eb2 = new EmbedBuilder();
                        eb2.setTitle("It's wish time!", "https://discord.com/channels/859736561830592522/969147973210607626");
                        eb2.addField("", "It's time for wish! goto <#969147973210607626> and do .wish to set reminder do .wish here too!", false);
                        eb2.addField("Reminder for:", ctx.getMember().getAsMention(), false);
                        eb2.setThumbnail(ctx.getAuthor().getAvatarUrl());
                        eb2.setColor(Color.green);
                        eb2.setFooter(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
                        ctx.getMessage().replyEmbeds(eb2.build()).queue();
                    }
                };

                Timer timer = new Timer();

                EmbedBuilder eb1 = new EmbedBuilder();
                eb1.setTitle("Wish reminder", "https://discord.com/channels/859736561830592522/969147973210607626");
                eb1.addField("", "Get smiles more efficiently with smile reminder! :sparkles: :tada:", false);
                eb1.addField("Reminder set!", "We will remind you after 60 mins!", false);
                eb1.addField("", ctx.getMember().getAsMention(), true);
                eb1.setThumbnail(ctx.getAuthor().getAvatarUrl());
                eb1.setColor(Color.cyan);
                Calendar calendar = new GregorianCalendar();
                String cal = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
                eb1.setFooter(cal);

                ctx.getMessage().replyEmbeds(eb1.build()).queue();
                timer.schedule(task, 3600000);
                break;

                case (".about"):
                case (".About"):
                EmbedBuilder eb3 = new EmbedBuilder();
                eb3.setColor(Color.WHITE);
                eb3.setTitle("About smile reminder");
                eb3.addField("Version:", "release 2.0", false);
                eb3.addField("Developed by:", "Emitter", false);
                eb3.addField("Release date: ", "**may fourteenth, 2022**", false);
                eb3.setDescription("this bot is officially released, please contact developer if you encounter any issues");
                Calendar calendar1 = new GregorianCalendar(2022, 5, 14);
                String cal1 = String.valueOf(calendar1.get(Calendar.DAY_OF_MONTH) + "/" + calendar1.get(Calendar.MONTH) + "/" + calendar1.get(Calendar.YEAR));
                eb3.setFooter(cal1);

                ctx.getChannel().sendMessageEmbeds(eb3.build()).queue();
                break;

            case(".help"):
            case(".Help"):
                EmbedBuilder eb2 = new EmbedBuilder();
                eb2.setTitle("How to use Smile Reminder?");
                eb2.addField("Step one:", "Do .Wish/.Work here", false);
                eb2.addField("Step two:", "Do .Wish/.Work on Kai, on <#969147973210607626>.", false);
                eb2.addField("", "You are all set! just repeat the process everytime you wish on kai! ", false);
                eb2.addBlankField(false);
                eb2.addField("Commands: ", ".Help to see general details about this bot", false);
                eb2.addField("", ".wish to set a timer and use the bot, you have to do set it back everytime you get reminded because the timer resets after reminding you ", false);
                eb2.addField("", ".about to see general details about this bot", false); 
                eb2.addField("", ".secret to see super secret document of humanity", false);
                eb2.addField("", ".work to set reminder for .work command", false);
                Calendar calendar2 = new GregorianCalendar();
                String cal2 = String.valueOf(calendar2.get(Calendar.DAY_OF_MONTH) + "/" + calendar2.get(Calendar.MONTH) + "/" + calendar2.get(Calendar.YEAR));
                eb2.setFooter(cal2);
                eb2.setColor(Color.white);

                ctx.getChannel().sendMessageEmbeds(eb2.build()).queue();
                    break; 

            case("Putin"):
            case("putin"):
            
            ctx.getChannel().sendMessage("Pootin is a noob").queue();;
            break; 

            case("Froggy"):
            case("froggy"):
            
            ctx.getChannel().sendMessage("Froggy is **||gay!!!||**, proof: https://media.discordapp.net/attachments/932307672227807283/969294672637874276/unknown.png").queue();;
            break; 

            case(".secret"):
            case(".Secret"):
            
            ctx.getChannel().sendMessage("Super secret document: History of humanity = <https://youtube.com/shorts/b9x-4JxSxjQ?feature=share>").queue();
            break;

            case(".work") :
            case (".Work"):

                TimerTask task2 = new TimerTask() {
                    @Override
                    public void run() {
                        EmbedBuilder builder = new EmbedBuilder();
                        Calendar calendar = new GregorianCalendar();

                        builder.setTitle(".Work time! ", "https://discord.com/channels/859736561830592522/969147973210607626");
                        builder.setColor(Color.YELLOW);
                        String cal = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
                        builder.setFooter(cal);
                        builder.setThumbnail(ctx.getMessage().getAuthor().getAvatarUrl());
                        builder.addField("Timer is up!!", "goto <#969147973210607626> and do .work (only available for smile clubs members). don't forget to set your timer back!!", false);
                        builder.addField("Reminder for: ", "" + ctx.getMessage().getAuthor().getAsMention(), false);
                        ctx.getMessage().replyEmbeds(builder.build()).queue();
                    }
                };

                EmbedBuilder builder = new EmbedBuilder();
                Calendar calendar3 = new GregorianCalendar();
                String cal3 = String.valueOf(calendar3.get(Calendar.DAY_OF_MONTH) + "/" + calendar3.get(Calendar.MONTH) + "/" + calendar3.get(Calendar.YEAR));
                builder.setFooter(cal3);
                builder.setTitle(".Work reminder!", "https://discord.com/channels/859736561830592522/969147973210607626");
                builder.setColor(Color.white);
                builder.setThumbnail(ctx.getMessage().getAuthor().getAvatarUrl());
                builder.addField(".work reminder set!", "We will remind you after 60 mins!", false);

                ctx.getMessage().replyEmbeds(builder.build()).queue();

                Timer timer2 = new Timer();
                timer2.schedule(task2,3600000);
            
        }

    }
}