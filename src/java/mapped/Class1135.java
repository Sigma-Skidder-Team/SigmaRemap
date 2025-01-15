// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1135 implements Runnable
{
    private static String[] field6136;
    public final /* synthetic */ Object[] field6137;
    public final /* synthetic */ Class4698 field6138;
    
    public Class1135(final Class4698 field6138, final Object[] field6139) {
        this.field6138 = field6138;
        this.field6137 = field6139;
    }
    
    @Override
    public void run() {
        final Object o = (this.field6137.length <= 0) ? null : this.field6137[0];
        if (!(o instanceof String)) {
            if (o instanceof byte[]) {
                this.field6138.field20265.method15002((byte[])o);
            }
        }
        else {
            this.field6138.field20265.method15001((String)o);
        }
    }
}
