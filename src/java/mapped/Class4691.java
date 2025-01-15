// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4691 implements Class4659
{
    public final /* synthetic */ Class4965 field20248;
    public final /* synthetic */ Class4965 field20249;
    
    public Class4691(final Class4965 field20249, final Class4965 field20250) {
        this.field20249 = field20249;
        this.field20248 = field20250;
    }
    
    @Override
    public void method13945(final Object... array) {
        Class4965.method15024().fine("writing close packet");
        try {
            this.field20248.method15005(new Class8437[] { new Class8437("close") });
        }
        catch (final Class2354 cause) {
            throw new RuntimeException(cause);
        }
    }
}
