// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1241 implements Runnable
{
    public final /* synthetic */ Class4965 field6755;
    public final /* synthetic */ Class4965 field6756;
    
    public Class1241(final Class4965 field6756, final Class4965 field6757) {
        this.field6756 = field6756;
        this.field6755 = field6757;
    }
    
    @Override
    public void run() {
        this.field6755.field21318 = true;
        this.field6755.method14942("drain", new Object[0]);
    }
}
