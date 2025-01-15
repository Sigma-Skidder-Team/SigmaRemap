// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1064 implements Runnable
{
    private static String[] field5723;
    public final /* synthetic */ long field5724;
    public final /* synthetic */ long field5725;
    public final /* synthetic */ Class17 field5726;
    public final /* synthetic */ long field5727;
    public final /* synthetic */ Class8983 field5728;
    
    public Class1064(final Class8983 field5728, final long field5729, final long field5730, final Class17 field5731, final long field5732) {
        this.field5728 = field5728;
        this.field5724 = field5729;
        this.field5725 = field5730;
        this.field5726 = field5731;
        this.field5727 = field5732;
    }
    
    @Override
    public void run() {
        for (long field5724 = this.field5724; field5724 < this.field5725; ++field5724) {
            Class8983.method31975(this.field5728).method26075(this.field5726, field5724 * this.field5727);
        }
    }
}
