// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1404 implements Runnable
{
    private static String[] field7752;
    public final /* synthetic */ long field7753;
    public final /* synthetic */ long field7754;
    public final /* synthetic */ Class12 field7755;
    public final /* synthetic */ long field7756;
    public final /* synthetic */ short[] field7757;
    public final /* synthetic */ int field7758;
    
    public Class1404(final long field7753, final long field7754, final Class12 field7755, final long field7756, final short[] field7757, final int field7758) {
        this.field7753 = field7753;
        this.field7754 = field7754;
        this.field7755 = field7755;
        this.field7756 = field7756;
        this.field7757 = field7757;
        this.field7758 = field7758;
    }
    
    @Override
    public void run() {
        for (long field7753 = this.field7753; field7753 < this.field7754; ++field7753) {
            this.field7755.method161(this.field7756 + field7753, this.field7757[this.field7758 + (int)field7753]);
        }
    }
}
