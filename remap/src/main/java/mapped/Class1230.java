// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1230 implements Runnable
{
    public final /* synthetic */ Object[] field6688;
    public final /* synthetic */ Class4960 field6689;
    
    public Class1230(final Class4960 field6689, final Object[] field6690) {
        this.field6689 = field6689;
        this.field6688 = field6690;
    }
    
    @Override
    public void run() {
        this.field6689.method14942("message", this.field6688);
    }
}
