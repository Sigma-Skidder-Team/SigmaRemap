// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1036 implements Runnable
{
    private static String[] field5554;
    public final /* synthetic */ Class4935 field5555;
    public final /* synthetic */ CustomGuiScreen field5556;
    public final /* synthetic */ Class4935 field5557;
    
    public Class1036(final Class4935 field5557, final Class4935 field5558, final CustomGuiScreen field5559) {
        this.field5557 = field5557;
        this.field5555 = field5558;
        this.field5556 = field5559;
    }
    
    @Override
    public void run() {
        this.field5555.method14245(this.field5556);
        this.field5555.field21164 = null;
    }
}
