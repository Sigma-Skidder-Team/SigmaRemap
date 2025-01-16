// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsTasks
{
    public static final Logger field_225184_a;
    
    private static void method29098(final int n) {
        try {
            Thread.sleep(n * 1000);
        }
        catch (final InterruptedException ex) {
            RealmsTasks.field_225184_a.error("", (Throwable)ex);
        }
    }

    public static /* synthetic */ void func_225182_b(int n) {
        RealmsTasks.method29098(n);
    }

    public static /* synthetic */ Logger getLogger() {
        return field_225184_a;
    }
    
    static {
        field_225184_a = LogManager.getLogger();
    }

    public static class SwitchMinigameTask extends LongRunningTask {
        private final long field_225024_b;
        private final Class7430 field_225025_c;
        private final RealmsConfigureWorldScreen field_225026_d;

        public SwitchMinigameTask(final long field7323, final Class7430 field7324, final RealmsConfigureWorldScreen field7325) {
            this.field_225024_b = field7323;
            this.field_225025_c = field7324;
            this.field_225026_d = field7325;
        }

        @Override
        public void run()
        {
            RealmsClient realmsclient = RealmsClient.func_224911_a();
            String s = RealmsScreen.getLocalizedString("mco.minigame.world.starting.screen.title");
            this.func_224989_b(s);

            for (int i = 0; i < 25; ++i)
            {
                try
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    if (realmsclient.func_224905_d(this.field_225024_b, this.field_225025_c.id))
                    {
                        Realms.setScreen(this.field_225026_d);
                        break;
                    }
                }
                catch (RetryCallException retrycallexception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    func_225182_b(retrycallexception.field_224985_e);
                }
                catch (Exception exception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    field_225184_a.error("Couldn't start mini game!");
                    this.func_224986_a(exception.toString());
                }
            }
        }
    }

    public static class DownloadTask extends LongRunningTask
    {
        private final long field_224996_b;
        private final int field_224997_c;
        private final RealmsScreen field_224998_d;
        private final String field_224999_e;

        public DownloadTask(final long field7326, final int field7327, final String field7328, final RealmsScreen field7329) {
            this.field_224996_b = field7326;
            this.field_224997_c = field7327;
            this.field_224998_d = field7329;
            this.field_224999_e = field7328;
        }

        @Override
        public void run()
        {
            this.func_224989_b(RealmsScreen.getLocalizedString("mco.download.preparing"));
            RealmsClient realmsclient = RealmsClient.func_224911_a();
            int i = 0;

            while (i < 25)
            {
                try
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    WorldDownload worlddownload = realmsclient.func_224917_b(this.field_224996_b, this.field_224997_c);
                    func_225182_b(1);

                    if (this.func_224988_a())
                    {
                        return;
                    }

                    Realms.setScreen(new RealmsDownloadLatestWorldScreen(this.field_224998_d, worlddownload, this.field_224999_e));
                    return;
                }
                catch (RetryCallException retrycallexception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    func_225182_b(retrycallexception.field_224985_e);
                    ++i;
                }
                catch (RealmsServiceException realmsserviceexception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    field_225184_a.error("Couldn't download world data");
                    Realms.setScreen(new RealmsGenericErrorScreen(realmsserviceexception, this.field_224998_d));
                    return;
                }
                catch (Exception exception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    field_225184_a.error("Couldn't download world data", (Throwable)exception);
                    this.func_224986_a(exception.getLocalizedMessage());
                    return;
                }
            }
        }
    }

    public static class CloseServerTask extends LongRunningTask
    {
        private final RealmsServer field_224994_b;
        private final RealmsConfigureWorldScreen field_224995_c;

        public CloseServerTask(final RealmsServer field7334, final RealmsConfigureWorldScreen field7335) {
            this.field_224994_b = field7334;
            this.field_224995_c = field7335;
        }

        @Override
        public void run()
        {
            this.func_224989_b(RealmsScreen.getLocalizedString("mco.configure.world.closing"));
            RealmsClient realmsclient = RealmsClient.func_224911_a();

            for (int i = 0; i < 25; ++i)
            {
                if (this.func_224988_a())
                {
                    return;
                }

                try
                {
                    boolean flag = realmsclient.func_224932_f(this.field_224994_b.id);

                    if (flag)
                    {
                        this.field_224995_c.func_224398_a();
                        this.field_224994_b.state = RealmsServer.Status.CLOSED;
                        Realms.setScreen(this.field_224995_c);
                        break;
                    }
                }
                catch (RetryCallException retrycallexception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    RealmsTasks.func_225182_b(retrycallexception.field_224985_e);
                }
                catch (Exception exception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    RealmsTasks.field_225184_a.error("Failed to close server", (Throwable)exception);
                    this.func_224986_a("Failed to close the server");
                }
            }
        }
    }

    public static class ResettingWorldTask extends LongRunningTask
    {
        private final String field_225013_b;
        private final Class7430 field_225014_c;
        private final int field_225015_d;
        private final boolean field_225016_e;
        private final long field_225017_f;
        private final RealmsScreen field_225018_g;
        private int field_225019_h = -1;
        private String field_225020_i = RealmsScreen.getLocalizedString("mco.reset.world.resetting.screen.title");

        public ResettingWorldTask(final long field7340, final RealmsScreen field7341, final Class7430 field7342) {
            this.field_225013_b = null;
            this.field_225014_c = field7342;
            this.field_225015_d = -1;
            this.field_225016_e = true;
            this.field_225017_f = field7340;
            this.field_225018_g = field7341;
        }

        public ResettingWorldTask(final long field7340, final RealmsScreen field7341, final String field7342, final int field7343, final boolean field7344) {
            this.field_225013_b = field7342;
            this.field_225014_c = null;
            this.field_225015_d = field7343;
            this.field_225016_e = field7344;
            this.field_225017_f = field7340;
            this.field_225018_g = field7341;
        }

        public void func_225011_a(final int field7342) {
            this.field_225019_h = field7342;
        }

        public void func_225012_c(final String field7343) {
            this.field_225020_i = field7343;
        }

        @Override
        public void run()
        {
            RealmsClient realmsclient = RealmsClient.func_224911_a();
            this.func_224989_b(this.field_225020_i);
            int i = 0;

            while (i < 25)
            {
                try
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    if (this.field_225014_c != null)
                    {
                        realmsclient.func_224924_g(this.field_225017_f, this.field_225014_c.id);
                    }
                    else
                    {
                        realmsclient.func_224943_a(this.field_225017_f, this.field_225013_b, this.field_225015_d, this.field_225016_e);
                    }

                    if (this.func_224988_a())
                    {
                        return;
                    }

                    if (this.field_225019_h == -1)
                    {
                        Realms.setScreen(this.field_225018_g);
                    }
                    else
                    {
                        this.field_225018_g.confirmResult(true, this.field_225019_h);
                    }

                    return;
                }
                catch (RetryCallException retrycallexception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    RealmsTasks.func_225182_b(retrycallexception.field_224985_e);
                    ++i;
                }
                catch (Exception exception)
                {
                    if (this.func_224988_a())
                    {
                        return;
                    }

                    RealmsTasks.field_225184_a.error("Couldn't reset world");
                    this.func_224986_a(exception.toString());
                    return;
                }
            }
        }
    }
}
