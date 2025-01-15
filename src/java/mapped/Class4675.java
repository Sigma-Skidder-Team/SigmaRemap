// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4675 implements Class4659
{
    private static String[] field20208;
    public final /* synthetic */ Class4967 field20209;
    
    public Class4675(final Class4967 field20209) {
        this.field20209 = field20209;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Object o = array[0];
        if (!(o instanceof String)) {
            if (o instanceof byte[]) {
                Class4967.method15084(this.field20209, (byte[])o);
            }
        }
        else {
            Class4967.method15083(this.field20209, (String)o);
        }
    }
}
