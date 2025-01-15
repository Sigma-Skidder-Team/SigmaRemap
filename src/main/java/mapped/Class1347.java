// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1347 implements Runnable
{
    private static String[] field7369;
    public final /* synthetic */ int field7370;
    public final /* synthetic */ long field7371;
    public final /* synthetic */ int field7372;
    public final /* synthetic */ Class22 field7373;
    public final /* synthetic */ boolean field7374;
    public final /* synthetic */ Class6874 field7375;
    
    public Class1347(final Class6874 field7375, final int field7376, final long field7377, final int field7378, final Class22 field7379, final boolean field7380) {
        this.field7375 = field7375;
        this.field7370 = field7376;
        this.field7371 = field7377;
        this.field7372 = field7378;
        this.field7373 = field7379;
        this.field7374 = field7380;
    }
    
    @Override
    public void run() {
        if (this.field7370 != -1) {
            for (long field7371 = this.field7371; field7371 < Class6874.method21038(this.field7375); field7371 += this.field7372) {
                Class6874.method21034(this.field7375).method30452(this.field7373, field7371 * Class6874.method21037(this.field7375), this.field7374);
            }
        }
        else {
            for (long field7372 = this.field7371; field7372 < Class6874.method21038(this.field7375); field7372 += this.field7372) {
                Class6874.method21034(this.field7375).method30448(this.field7373, field7372 * Class6874.method21037(this.field7375));
            }
        }
    }
}
