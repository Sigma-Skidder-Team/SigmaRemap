// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1339 extends LongRunningTask
{
    private final Class7437 field7334;
    private final RealmsConfigureWorldScreen field7335;
    
    public Class1339(final Class7437 field7334, final RealmsConfigureWorldScreen field7335) {
        this.field7334 = field7334;
        this.field7335 = field7335;
    }
    
    @Override
    public void run() {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.configure.world.closing"));
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        for (int i = 0; i < 25; ++i) {
            if (this.func_224988_a()) {
                return;
            }
            try {
                if (method35444.method35469(this.field7334.field28675)) {
                    this.field7335.method15707();
                    this.field7334.field28679 = Class2153.field12791;
                    Realms.setScreen(this.field7335);
                    break;
                }
                continue;
            }
            catch (final RetryCallException class2331) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0096;
            }
            catch (final Exception ex) {
                if (this.func_224988_a()) {
                    return;
                }
            }
            final Exception ex;
            RealmsTasks.getLogger().error("Failed to close server", (Throwable)ex);
            this.func_224986_a("Failed to close the server");
        }
    }
}
