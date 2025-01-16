// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Locale;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class Class5083 extends RealmsScreen
{
    private static final Logger field21886;
    private final RealmsScreen field21887;
    private final RealmsServer field21888;
    private final RealmsScreen field21889;
    private final int field21890 = 0;
    private final int field21891 = 1;
    private final int field21892 = 2;
    private final String field21893;
    private final String field21894;
    private final String field21895;
    private final String field21896;
    private int field21897;
    private String field21898;
    private Class2224 field21899;
    private final String field21900 = "https://aka.ms/ExtendJavaRealms";
    
    public Class5083(final RealmsScreen field21887, final RealmsServer field21888, final RealmsScreen field21889) {
        this.field21887 = field21887;
        this.field21888 = field21888;
        this.field21889 = field21889;
        this.field21893 = RealmsScreen.getLocalizedString("mco.configure.world.subscription.title");
        this.field21894 = RealmsScreen.getLocalizedString("mco.configure.world.subscription.start");
        this.field21895 = RealmsScreen.getLocalizedString("mco.configure.world.subscription.timeleft");
        this.field21896 = RealmsScreen.getLocalizedString("mco.configure.world.subscription.recurring.daysleft");
    }
    
    @Override
    public void init() {
        this.method15863(this.field21888.id);
        Realms.method25383(this.field21893, this.field21894, this.field21898, this.field21895, this.method15865(this.field21897));
        this.method15444(true);
        this.buttonsAdd(new Class5672(this, 2, this.width() / 2 - 100, Class7869.method25488(6), RealmsScreen.getLocalizedString("mco.configure.world.subscription.extend")));
        this.buttonsAdd(new Class5619(this, 0, this.width() / 2 - 100, Class7869.method25488(12), RealmsScreen.getLocalizedString("gui.back")));
        if (this.field21888.field28684) {
            this.buttonsAdd(new Class5641(this, 1, this.width() / 2 - 100, Class7869.method25488(10), RealmsScreen.getLocalizedString("mco.configure.world.delete.button")));
        }
    }
    
    private void method15863(final long n) {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            final Class7432 method35445 = method35444.method35472(n);
            this.field21897 = method35445.field28664;
            this.field21898 = this.method15864(method35445.field28663);
            this.field21899 = method35445.field28665;
        }
        catch (final RealmsServiceException class2330) {
            Class5083.field21886.error("Couldn't get subscription");
            Realms.setScreen(new RealmsGenericErrorScreen(class2330, this.field21887));
        }
        catch (final IOException ex) {
            Class5083.field21886.error("Couldn't parse response subscribing");
        }
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
        if (n == 1) {
            if (b) {
                new Class922(this, "Realms-delete-realm").start();
            }
        }
        Realms.setScreen(this);
    }
    
    private String method15864(final long timeInMillis) {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(timeInMillis);
        return DateFormat.getDateTimeInstance().format(gregorianCalendar.getTime());
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21887);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        final int n4 = this.width() / 2 - 100;
        this.drawCenteredString(this.field21893, this.width() / 2, 17, 16777215);
        this.method15407(this.field21894, n4, Class7869.method25488(0), 10526880);
        this.method15407(this.field21898, n4, Class7869.method25488(1), 16777215);
        if (this.field21899 != Class2224.field13691) {
            if (this.field21899 == Class2224.field13692) {
                this.method15407(this.field21896, n4, Class7869.method25488(3), 10526880);
            }
        }
        else {
            this.method15407(this.field21895, n4, Class7869.method25488(3), 10526880);
        }
        this.method15407(this.method15865(this.field21897), n4, Class7869.method25488(4), 16777215);
        super.render(n, n2, n3);
    }
    
    private String method15865(final int n) {
        if (n == -1 && this.field21888.field28684) {
            return RealmsScreen.getLocalizedString("mco.configure.world.subscription.expired");
        }
        if (n > 1) {
            final int i = n / 30;
            final int j = n % 30;
            final StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append(i).append(" ");
                if (i != 1) {
                    sb.append(RealmsScreen.getLocalizedString("mco.configure.world.subscription.months").toLowerCase(Locale.ROOT));
                }
                else {
                    sb.append(RealmsScreen.getLocalizedString("mco.configure.world.subscription.month").toLowerCase(Locale.ROOT));
                }
            }
            if (j > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(j).append(" ");
                if (j != 1) {
                    sb.append(RealmsScreen.getLocalizedString("mco.configure.world.subscription.days").toLowerCase(Locale.ROOT));
                }
                else {
                    sb.append(RealmsScreen.getLocalizedString("mco.configure.world.subscription.day").toLowerCase(Locale.ROOT));
                }
            }
            return sb.toString();
        }
        return RealmsScreen.getLocalizedString("mco.configure.world.subscription.less_than_a_day");
    }
    
    static {
        field21886 = LogManager.getLogger();
    }
}
