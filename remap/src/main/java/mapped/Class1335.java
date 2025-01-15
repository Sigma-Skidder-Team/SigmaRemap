// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1335 extends Class1334
{
    private final Class7426 field7320;
    private final long field7321;
    private final Class5076 field7322;
    
    public Class1335(final Class7426 field7320, final long field7321, final Class5076 field7322) {
        this.field7320 = field7320;
        this.field7321 = field7321;
        this.field7322 = field7322;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.backup.restoring"));
        final Class9513 method35444 = Class9513.method35444();
        if (0 < 25) {
            try {
                if (this.method5622()) {
                    return;
                }
                method35444.method35463(this.field7321, this.field7320.field28628);
                Class8593.method29099(1);
                if (this.method5622()) {
                    return;
                }
                Class7847.method25362(this.field7322.method15711());
                return;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0083;
            }
            catch (final Class2330 class2332) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0109;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            final Exception ex;
            Class8593.method29100().error("Couldn't restore backup", (Throwable)ex);
            this.method5620(ex.getLocalizedMessage());
        }
    }
}
