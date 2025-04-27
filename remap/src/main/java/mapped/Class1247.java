// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1247 implements Runnable
{
    private static String[] field6784;
    public final /* synthetic */ String field6785;
    public final /* synthetic */ Object[] field6786;
    public final /* synthetic */ Class4960 field6787;
    
    public Class1247(final Class4960 field6787, final String field6788, final Object[] field6789) {
        this.field6787 = field6787;
        this.field6785 = field6788;
        this.field6786 = field6789;
    }
    
    @Override
    public void run() {
        if (!Class4960.field21283.containsKey(this.field6785)) {
            final int n = this.field6786.length - 1;
            Object[] field6786;
            Class7873 class7873;
            if (this.field6786.length > 0 && this.field6786[n] instanceof Class7873) {
                field6786 = new Object[n];
                System.arraycopy(this.field6786, 0, field6786, 0, n);
                class7873 = (Class7873)this.field6786[n];
            }
            else {
                field6786 = this.field6786;
                class7873 = null;
            }
            this.field6787.method14943(this.field6785, field6786, class7873);
            return;
        }
        Class4960.method14967(this.field6787, this.field6785, this.field6786);
    }
}
