package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Timer;
import java.util.TimerTask;


public class wish extends ListenerAdapter {


    public void onMessageReceived(MessageReceivedEvent ctx) {

        switch (ctx.getMessage().getContentRaw()) {
            case (".Wish"):
            case (".wish"):

                TimerTask task = new TimerTask() {
                    public void run() {

                        EmbedBuilder eb2 = eventEmbeds.wishTimerTask(ctx);
                        ctx.getMessage().replyEmbeds(eb2.build()).queue();
                    }
                };

                Timer timer = new Timer();

                EmbedBuilder eb1 = eventEmbeds.wishEmbed(ctx);
                ctx.getMessage().replyEmbeds(eb1.build()).queue();
                timer.schedule(task, 3600000);
                break;

            case (".work"):
            case (".Work"):

                TimerTask task2 = new TimerTask() {
                    @Override
                    public void run() {
                        EmbedBuilder builder = eventEmbeds.workTask(ctx);
                        ctx.getMessage().replyEmbeds(builder.build()).queue();
                    }
                };

                EmbedBuilder builder = eventEmbeds.workEmbed(ctx);
                ctx.getMessage().replyEmbeds(builder.build()).queue();

                Timer timer2 = new Timer();
                timer2.schedule(task2, 3600000);
                break;

            case (".about"):
            case (".About"):
                EmbedBuilder eb3 = eventEmbeds.aboutEmbed(ctx);

                ctx.getChannel().sendMessageEmbeds(eb3.build()).queue();
                break;

            case (".help"):
            case (".Help"):
                EmbedBuilder eb2 = eventEmbeds.helpEmbed(ctx);

                ctx.getChannel().sendMessageEmbeds(eb2.build()).queue();
                break;

            case ("Putin"):
            case ("putin"):

                ctx.getChannel().sendMessage("Pootin is a noob").queue();
                break;

            case ("Froggy"):
            case ("froggy"):

                ctx.getChannel().sendMessage("Froggy is **||gay!!!||**, proof: https://media.discordapp.net/attachments/932307672227807283/969294672637874276/unknown.png").queue();
                break;

            case (".secret"):
            case (".Secret"):

                ctx.getChannel().sendMessage("Super secret document: History of humanity = <https://youtube.com/shorts/b9x-4JxSxjQ?feature=share>").queue();
                break;

            case (".drink"):
            case (".Drink"):
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        EmbedBuilder builder = eventEmbeds.drinkTask(ctx);
                        ctx.getMessage().replyEmbeds(builder.build()).queue();
                    }
                };

                EmbedBuilder builder1 = eventEmbeds.drinkReminder(ctx);
                ctx.getMessage().replyEmbeds(builder1.build()).queue();

                Timer timerr = new Timer();
                timerr.schedule(timerTask, 7200000);
        }
    }

}
