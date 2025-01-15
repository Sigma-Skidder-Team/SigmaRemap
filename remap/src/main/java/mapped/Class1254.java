// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1254 implements Runnable
{
    private static String[] field6824;
    public final /* synthetic */ long field6825;
    public final /* synthetic */ long field6826;
    public final /* synthetic */ long field6827;
    public final /* synthetic */ Class17 field6828;
    public final /* synthetic */ Class17 field6829;
    public final /* synthetic */ Class6062 field6830;
    
    public Class1254(final Class6062 field6830, final long field6831, final long field6832, final long field6833, final Class17 field6834, final Class17 field6835) {
        this.field6830 = field6830;
        this.field6825 = field6831;
        this.field6826 = field6832;
        this.field6827 = field6833;
        this.field6828 = field6834;
        this.field6829 = field6835;
    }
    
    @Override
    public void run() {
        for (long field6825 = this.field6825; field6825 < this.field6826; ++field6825) {
            final long n = 2L * field6825;
            this.field6828.method171(this.field6827 + field6825, Class6062.method18051(this.field6830).method137(n) * this.field6829.method137(n) - Class6062.method18051(this.field6830).method137(n + 1L) * this.field6829.method137(n + 1L));
        }
    }
}
