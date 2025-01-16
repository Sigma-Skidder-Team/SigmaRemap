// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1337 extends LongRunningTask
{
    private final long field7326;
    private final int field7327;
    private final RealmsScreen field7328;
    private final String field7329;
    
    public Class1337(final long field7326, final int field7327, final String field7328, final RealmsScreen field7329) {
        this.field7326 = field7326;
        this.field7327 = field7327;
        this.field7328 = field7329;
        this.field7329 = field7328;
    }
    
    @Override
    public void run() {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.download.preparing"));
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        if (0 < 25) {
            try {
                if (this.func_224988_a()) {
                    return;
                }
                final Class7431 method35445 = method35444.method35476(this.field7326, this.field7327);
                RealmsTasks.func_225182_b(1);
                if (this.func_224988_a()) {
                    return;
                }
                Realms.setScreen(new Class5047(this.field7328, method35445, this.field7329));
                return;
            }
            catch (final RetryCallException class2331) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0092;
            }
            catch (final RealmsServiceException class2332) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0118;
            }
            catch (final Exception ex) {
                if (this.func_224988_a()) {
                    return;
                }
            }
            final Exception ex;
            RealmsTasks.getLogger().error("Couldn't download world data", (Throwable)ex);
            this.func_224986_a(ex.getLocalizedMessage());
        }
    }
}
