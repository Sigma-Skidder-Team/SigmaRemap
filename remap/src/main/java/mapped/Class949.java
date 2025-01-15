// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class949 implements Runnable
{
    private static String[] field5018;
    public final /* synthetic */ int field5019;
    public final /* synthetic */ int field5020;
    public final /* synthetic */ double[] field5021;
    public final /* synthetic */ double field5022;
    
    public Class949(final int field5019, final int field5020, final double[] field5021, final double field5022) {
        this.field5019 = field5019;
        this.field5020 = field5020;
        this.field5021 = field5021;
        this.field5022 = field5022;
    }
    
    @Override
    public void run() {
        for (int i = this.field5019; i < this.field5020; ++i) {
            final double[] field5021 = this.field5021;
            final int n = i;
            field5021[n] *= this.field5022;
        }
    }
}
