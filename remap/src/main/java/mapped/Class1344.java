// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1344 extends Class1334
{
    private final long field7354;
    private final int field7355;
    private final Class5081 field7356;
    private final int field7357;
    
    public Class1344(final long field7354, final int field7355, final Class5081 field7356, final int field7357) {
        this.field7354 = field7354;
        this.field7355 = field7355;
        this.field7356 = field7356;
        this.field7357 = field7357;
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        this.method5621(Class5046.method15438("mco.minigame.world.slot.screen.title"));
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.method5622()) {
                    return;
                }
                if (method35444.method35462(this.field7354, this.field7355)) {
                    this.field7356.method15437(true, this.field7357);
                    break;
                }
                continue;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0084;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            Class8593.method29100().error("Couldn't switch world!");
            final Exception ex;
            this.method5620(ex.toString());
        }
    }
}
