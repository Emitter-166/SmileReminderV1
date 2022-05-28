package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class eventEmbeds {

    public static EmbedBuilder wishTimerTask(MessageReceivedEvent ctx) {
        EmbedBuilder eb2 = new EmbedBuilder();
        Calendar calendar = new GregorianCalendar();
        eb2.setTitle("It's wish time!", "https://discord.com/channels/859736561830592522/969147973210607626");
        eb2.addField("", "It's time for wish! goto <#969147973210607626> and do .wish to set reminder do .wish here too!", false);
        eb2.addField("Reminder for:", ctx.getMember().getAsMention(), false);
        eb2.setThumbnail(ctx.getAuthor().getAvatarUrl());
        eb2.setColor(Color.green);
        eb2.setFooter(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));

        return eb2;
    }

    public static EmbedBuilder wishEmbed(MessageReceivedEvent ctx) {
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

        return eb1;
    }

    public static EmbedBuilder aboutEmbed(MessageReceivedEvent ctx) {
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

        return eb3;
    }

    public static EmbedBuilder helpEmbed(MessageReceivedEvent ctx) {
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
        eb2.addField("", ".drink command for reminding you to stay hydrated and drinking water", false);
        Calendar calendar2 = new GregorianCalendar();
        String cal2 = String.valueOf(calendar2.get(Calendar.DAY_OF_MONTH) + "/" + calendar2.get(Calendar.MONTH) + "/" + calendar2.get(Calendar.YEAR));
        eb2.setFooter(cal2);
        eb2.setColor(Color.white);

        return eb2;
    }

    public static EmbedBuilder workTask(MessageReceivedEvent ctx) {
        EmbedBuilder builder = new EmbedBuilder();
        Calendar calendar = new GregorianCalendar();

        builder.setTitle(".Work time! ", "https://discord.com/channels/859736561830592522/969147973210607626");
        builder.setColor(Color.YELLOW);
        String cal = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
        builder.setFooter(cal);
        builder.setThumbnail(ctx.getMessage().getAuthor().getAvatarUrl());
        builder.addField("Timer is up!!", "goto <#969147973210607626> and do .work (only available for smile clubs members). don't forget to set your timer back!!", false);
        builder.addField("Reminder for: ", "" + ctx.getMessage().getAuthor().getAsMention(), false);

        return builder;
    }

    public static EmbedBuilder workEmbed(MessageReceivedEvent ctx) {
        EmbedBuilder builder = new EmbedBuilder();
        Calendar calendar3 = new GregorianCalendar();
        String cal3 = String.valueOf(calendar3.get(Calendar.DAY_OF_MONTH) + "/" + calendar3.get(Calendar.MONTH) + "/" + calendar3.get(Calendar.YEAR));
        builder.setFooter(cal3);
        builder.setTitle(".Work reminder!", "https://discord.com/channels/859736561830592522/969147973210607626");
        builder.setColor(Color.white);
        builder.setThumbnail(ctx.getMessage().getAuthor().getAvatarUrl());
        builder.addField(".work reminder set!", "We will remind you after 60 mins!", false);

        return builder;
    }


    public static EmbedBuilder drinkReminder(MessageReceivedEvent e) {
        EmbedBuilder builder = new EmbedBuilder();
        Calendar calendar = new GregorianCalendar();
        builder.setTitle("Good job! we will remind you soon to drink water");
        builder.setColor(Color.CYAN);
        builder.addField("What's this?", "we will remind you to drink water once in a while and will make sure you stay hydrated!", false);
        builder.addField("stay hydrated!!", "", false);
        builder.setThumbnail("https://cdn1.sph.harvard.edu/wp-content/uploads/sites/30/2019/09/aqua-beverage-clean-1615011-1024x683.jpg");
        builder.setImage("https://cdn.discordapp.com/attachments/961677956399394867/980151439882059816/unknown.png");
        builder.setFooter(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));

        return builder;
    }

    public static EmbedBuilder drinkTask(MessageReceivedEvent e) {
        EmbedBuilder builder = new EmbedBuilder();
        Calendar calendar = new GregorianCalendar();
        builder.setTitle("Drinking reminder!");
        builder.setColor(Color.WHITE);
        builder.addField("Get Hydrated!", "time for you to get a break and drink some water :), don't forget to set back the reminder", false);
        builder.addField("stay hydrated!!", "", false);
        builder.setImage("https://cdn.discordapp.com/attachments/961677956399394867/980155169104887888/drink-water-poster-vector-34494253.jpg");
        builder.setThumbnail("https://cdn1.sph.harvard.edu/wp-content/uploads/sites/30/2019/09/aqua-beverage-clean-1615011-1024x683.jpg");
        builder.setFooter(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));

        return builder;
    }

}

