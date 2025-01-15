// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1305 implements Runnable
{
    private static String[] field7147;
    public final /* synthetic */ long field7148;
    public final /* synthetic */ long field7149;
    public final /* synthetic */ Class23 field7150;
    public final /* synthetic */ Class23 field7151;
    public final /* synthetic */ Class23 field7152;
    
    public Class1305(final Class23 field7152, final long field7153, final long field7154, final Class23 field7155, final Class23 field7156) {
        this.field7152 = field7152;
        this.field7148 = field7153;
        this.field7149 = field7154;
        this.field7150 = field7155;
        this.field7151 = field7156;
    }
    
    @Override
    public void run() {
        for (long field7148 = this.field7148; field7148 < this.field7149; ++field7148) {
            this.field7150.method159(field7148, (byte)(this.field7152.method125(field7148) ^ this.field7151.method125(field7148)));
        }
    }
}
