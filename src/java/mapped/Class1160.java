// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1160 implements Runnable
{
    private static String[] field6291;
    public final /* synthetic */ long field6292;
    public final /* synthetic */ long field6293;
    public final /* synthetic */ Class22 field6294;
    public final /* synthetic */ Class6874 field6295;
    
    public Class1160(final Class6874 field6295, final long field6296, final long field6297, final Class22 field6298) {
        this.field6295 = field6295;
        this.field6292 = field6296;
        this.field6293 = field6297;
        this.field6294 = field6298;
    }
    
    @Override
    public void run() {
        for (long field6292 = this.field6292; field6292 < this.field6293; ++field6292) {
            Class6874.method21034(this.field6295).method30448(this.field6294, field6292 * Class6874.method21037(this.field6295));
        }
    }
}
