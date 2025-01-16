// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1344 extends LongRunningTask
{
    private final long field7354;
    private final int field7355;
    private final RealmsConfirmResultListener field7356;
    private final int field7357;
    
    public Class1344(final long field7354, final int field7355, final RealmsConfirmResultListener field7356, final int field7357) {
        this.field7354 = field7354;
        this.field7355 = field7355;
        this.field7356 = field7356;
        this.field7357 = field7357;
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.minigame.world.slot.screen.title"));
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.func_224988_a()) {
                    return;
                }
                if (method35444.method35462(this.field7354, this.field7355)) {
                    this.field7356.confirmResult(true, this.field7357);
                    break;
                }
                continue;
            }
            catch (final RetryCallException class2331) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0084;
            }
            catch (final Exception ex) {
                if (this.func_224988_a()) {
                    return;
                }
            }
            RealmsTasks.getLogger().error("Couldn't switch world!");
            final Exception ex;
            this.func_224986_a(ex.toString());
        }
    }
}
