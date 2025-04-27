// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class RestoreTask extends LongRunningTask
{
    private final Backup field_225021_b;
    private final long field_225022_c;
    private final RealmsConfigureWorldScreen field_225023_d;
    
    public RestoreTask(final Backup field7320, final long field7321, final RealmsConfigureWorldScreen field7322) {
        this.field_225021_b = field7320;
        this.field_225022_c = field7321;
        this.field_225023_d = field7322;
    }
    
    @Override
    public void run()
    {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.backup.restoring"));
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

                realmsclient.func_224928_c(this.field_225022_c, this.field_225021_b.backupId);
                RealmsTasks.func_225182_b(1);

                if (this.func_224988_a())
                {
                    return;
                }

                Realms.setScreen(this.field_225023_d.func_224407_b());
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
            catch (RealmsServiceException realmsserviceexception)
            {
                if (this.func_224988_a())
                {
                    return;
                }

                RealmsTasks.field_225184_a.error("Couldn't restore backup", realmsserviceexception);
                Realms.setScreen(new RealmsGenericErrorScreen(realmsserviceexception, this.field_225023_d));
                return;
            }
            catch (Exception exception)
            {
                if (this.func_224988_a())
                {
                    return;
                }

                RealmsTasks.field_225184_a.error("Couldn't restore backup", exception);
                this.func_224986_a(exception.getLocalizedMessage());
                return;
            }
        }
    }
}
