// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1337 extends Class1334
{
    private final long field7326;
    private final int field7327;
    private final Class5046 field7328;
    private final String field7329;
    
    public Class1337(final long field7326, final int field7327, final String field7328, final Class5046 field7329) {
        this.field7326 = field7326;
        this.field7327 = field7327;
        this.field7328 = field7329;
        this.field7329 = field7328;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.download.preparing"));
        final Class9513 method35444 = Class9513.method35444();
        if (0 < 25) {
            try {
                if (this.method5622()) {
                    return;
                }
                final Class7431 method35445 = method35444.method35476(this.field7326, this.field7327);
                Class8593.method29099(1);
                if (this.method5622()) {
                    return;
                }
                Class7847.method25362(new Class5047(this.field7328, method35445, this.field7329));
                return;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0092;
            }
            catch (final Class2330 class2332) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0118;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            final Exception ex;
            Class8593.method29100().error("Couldn't download world data", (Throwable)ex);
            this.method5620(ex.getLocalizedMessage());
        }
    }
}
