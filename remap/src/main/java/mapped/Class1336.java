// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1336 extends LongRunningTask
{
    private final long field7323;
    private final Class7430 field7324;
    private final RealmsConfigureWorldScreen field7325;
    
    public Class1336(final long field7323, final Class7430 field7324, final RealmsConfigureWorldScreen field7325) {
        this.field7323 = field7323;
        this.field7324 = field7324;
        this.field7325 = field7325;
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.minigame.world.starting.screen.title"));
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.func_224988_a()) {
                    return;
                }
                if (method35444.method35465(this.field7323, this.field7324.field28649)) {
                    Realms.setScreen(this.field7325);
                    break;
                }
                continue;
            }
            catch (final RetryCallException class2331) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0083;
            }
            catch (final Exception ex) {
                if (this.func_224988_a()) {
                    return;
                }
            }
            RealmsTasks.getLogger().error("Couldn't start mini game!");
            final Exception ex;
            this.func_224986_a(ex.toString());
        }
    }
}
