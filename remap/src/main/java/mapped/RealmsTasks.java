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
}
