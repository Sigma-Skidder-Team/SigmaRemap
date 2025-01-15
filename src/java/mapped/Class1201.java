// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1201 implements Runnable
{
    private static String[] field6510;
    public final /* synthetic */ long field6511;
    public final /* synthetic */ long field6512;
    public final /* synthetic */ Class17 field6513;
    public final /* synthetic */ Class8788 field6514;
    
    public Class1201(final Class8788 field6514, final long field6515, final long field6516, final Class17 field6517) {
        this.field6514 = field6514;
        this.field6511 = field6515;
        this.field6512 = field6516;
        this.field6513 = field6517;
    }
    
    @Override
    public void run() {
        for (long field6511 = this.field6511; field6511 < this.field6512; ++field6511) {
            Class8788.method30611(this.field6514).method21389(this.field6513, field6511 * Class8788.method30614(this.field6514));
        }
    }
}
