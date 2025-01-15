// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4699 implements Class4659
{
    public final /* synthetic */ Class4967 field20267;
    public final /* synthetic */ Class1040 field20268;
    
    public Class4699(final Class1040 field20268, final Class4967 field20269) {
        this.field20268 = field20268;
        this.field20267 = field20269;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Object o = (array.length <= 0) ? null : array[0];
        Class4967.method15073().fine("connect_error");
        Class4967.method15078(this.field20267);
        this.field20267.field21358 = Class1978.field10964;
        Class4967.method15079(this.field20267, "connect_error", new Object[] { o });
        if (this.field20268.field5574 == null) {
            Class4967.method15080(this.field20267);
        }
        else {
            this.field20268.field5574.method27770(new Class2346("Connection error", (o instanceof Exception) ? ((Exception)o) : null));
        }
    }
}
