// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1067 implements Runnable
{
    private static String[] field5742;
    public final /* synthetic */ long field5743;
    public final /* synthetic */ long field5744;
    public final /* synthetic */ Class22 field5745;
    public final /* synthetic */ long field5746;
    public final /* synthetic */ Class22 field5747;
    public final /* synthetic */ long field5748;
    
    public Class1067(final long field5743, final long field5744, final Class22 field5745, final long field5746, final Class22 field5747, final long field5748) {
        this.field5743 = field5743;
        this.field5744 = field5744;
        this.field5745 = field5745;
        this.field5746 = field5746;
        this.field5747 = field5747;
        this.field5748 = field5748;
    }
    
    @Override
    public void run() {
        for (long field5743 = this.field5743; field5743 < this.field5744; ++field5743) {
            this.field5745.method169(this.field5746 + field5743, this.field5747.method135(this.field5748 + field5743));
        }
    }
}
