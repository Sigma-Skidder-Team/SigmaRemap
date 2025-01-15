// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7289 implements Class7284
{
    public final /* synthetic */ Class4964 field28238;
    public final /* synthetic */ int[] field28239;
    public final /* synthetic */ Runnable field28240;
    public final /* synthetic */ Class4964 field28241;
    
    public Class7289(final Class4964 field28241, final Class4964 field28242, final int[] field28243, final Runnable field28244) {
        this.field28241 = field28241;
        this.field28238 = field28242;
        this.field28239 = field28243;
        this.field28240 = field28244;
    }
    
    @Override
    public void method22343(final Object o) {
        try {
            if (o instanceof String) {
                Class4964.method15014(this.field28238).method23126((String)o);
            }
            else if (o instanceof byte[]) {
                Class4964.method15014(this.field28238).method23127(Class1929.method7738((byte[])o));
            }
        }
        catch (final IllegalStateException ex) {
            Class4964.method15015().fine("websocket closed before we could write");
        }
        final boolean b = false;
        final int[] field28239 = this.field28239;
        final int n = 0;
        final int n2 = field28239[n] - 1;
        field28239[n] = n2;
        if ((b ? 1 : 0) == n2) {
            this.field28240.run();
        }
    }
}
