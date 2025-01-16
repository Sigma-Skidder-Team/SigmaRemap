// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Class8327
{
    public Minecraft field34199;
    
    public Class8327() {
        this.field34199 = Minecraft.method5277();
    }
    
    @EventListener
    private void method27711(final Class5723 class5723) {
        if (this.field34199.method5282() != null) {
            if (class5723.method16998() instanceof Class4378) {
                if (new ArrayList(Arrays.asList("§cYou are permanently banned from MinemenClub. §r", "§cYour connection to the server §r§c§leu-practice§r§c has been prevented due to you being associated to a blacklisted player.§r", "§cYou are blacklisted from MinemenClub. §r")).contains(((Class4378)class5723.method16998()).method13164().getFormattedText())) {
                    final Class7971 method25462 = Client.method35173().method35198().method25462();
                    if (method25462 != null) {
                        method25462.method25895(new Class8848(this.field34199.method5282().field41613, new Date(Long.MAX_VALUE)));
                        Client.method35173().method35198().method25459(method25462);
                        Client.method35173().method35198().method25467();
                    }
                }
            }
            if (!(class5723.method16998() instanceof Class4277)) {
                if (!(class5723.method16998() instanceof Class4262)) {
                    if (class5723.method16998() instanceof Class4367) {
                        final long currentTimeMillis = System.currentTimeMillis();
                        if (this.field34199.method5282() == null) {
                            return;
                        }
                        final Class8848 class5724 = new Class8848(this.field34199.method5282().field41613, new Date(currentTimeMillis));
                        final Class7971 method25463 = Client.method35173().method35198().method25462();
                        if (method25463 != null) {
                            method25463.method25895(class5724);
                            Client.method35173().method35198().method25459(method25463);
                            Client.method35173().method35198().method25467();
                        }
                    }
                }
                else {
                    final long method25464 = this.method27712(((Class4262)class5723.method16998()).method12793().getFormattedText());
                    if (method25464 == 0L) {
                        return;
                    }
                    final Class8848 class5725 = new Class8848(this.field34199.method5282().field41613, new Date(method25464));
                    final Class7971 method25465 = Client.method35173().method35198().method25462();
                    if (method25465 != null) {
                        method25465.method25895(class5725);
                        Client.method35173().method35198().method25459(method25465);
                        Client.method35173().method35198().method25467();
                    }
                }
            }
            else {
                final long method25466 = this.method27712(((Class4277)class5723.method16998()).method12842().getFormattedText());
                if (method25466 == 0L) {
                    return;
                }
                final Class8848 class5726 = new Class8848(this.field34199.method5282().field41613, new Date(method25466));
                final Class7971 method25467 = Client.method35173().method35198().method25462();
                if (method25467 != null) {
                    method25467.method25895(class5726);
                    Client.method35173().method35198().method25459(method25467);
                    Client.method35173().method35198().method25467();
                }
            }
        }
    }
    
    private long method27712(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.contains("security") && lowerCase.contains("alert")) {
            return 9223372036854775806L;
        }
        if (lowerCase.contains("permanent")) {
            return Long.MAX_VALUE;
        }
        if (lowerCase.contains("your account has been suspended from")) {
            return Long.MAX_VALUE;
        }
        if (lowerCase.contains("tu cuenta ha sido suspendida. al reconectarte, tendr")) {
            return Long.MAX_VALUE;
        }
        if (lowerCase.contains("compromised")) {
            return 9223372036854775806L;
        }
        if (!lowerCase.contains("gebannt")) {
            final long millis = TimeUnit.DAYS.toMillis(this.method27713(lowerCase));
            final long millis2 = TimeUnit.HOURS.toMillis(this.method27714(lowerCase));
            final long millis3 = TimeUnit.MINUTES.toMillis(this.method27715(lowerCase));
            final long millis4 = TimeUnit.SECONDS.toMillis(this.method27716(lowerCase));
            if (lowerCase.contains("§6 sentinel caught you cheating! (anticheat)")) {
                if (millis == 0L) {
                    if (millis2 == 0L) {
                        if (millis3 == 0L) {
                            if (millis4 != 0L) {}
                        }
                    }
                }
            }
            if (lowerCase.contains("vous avez \u00e9t\u00e9 banni")) {
                if (millis == 0L) {
                    if (millis2 == 0L) {
                        if (millis3 == 0L) {
                            if (millis4 == 0L) {
                                return Long.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            return System.currentTimeMillis() + millis + millis2 + millis3 + millis4;
        }
        return Long.MAX_VALUE;
    }
    
    private int method27713(final String input) {
        for (final String s : new String[] { "day", "jour", "tage", "d\u00eda", "dia" }) {
            final Matcher matcher = Pattern.compile("([0-9]+)(?:d| " + s + "s|" + s + "s| " + s + "|" + s + ")[ |\\n]").matcher(input);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        }
        return 0;
    }
    
    private int method27714(final String input) {
        for (final String s : new String[] { "hour", "heure", "uhr", "Hora" }) {
            final Matcher matcher = Pattern.compile("([0-9]+)(?:h| " + s + "s|" + s + "s| " + s + "|" + s + ")[ |\\n]").matcher(input);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        }
        return 0;
    }
    
    private int method27715(final String input) {
        for (final String s : new String[] { "minute", "min", "minuto", "m\u00ednuto" }) {
            final Matcher matcher = Pattern.compile("([0-9]+)(?:m| " + s + "s|" + s + "s| " + s + "|" + s + ")[ |\\n]").matcher(input);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        }
        return 0;
    }
    
    private int method27716(final String input) {
        for (final String s : new String[] { "second", "sec", "seconde", "sekunde", "segundo" }) {
            final Matcher matcher = Pattern.compile("([0-9]+)(?:s| " + s + "s|" + s + "s| " + s + "|" + s + ")[ |\\n]").matcher(input);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        }
        return 0;
    }
}
