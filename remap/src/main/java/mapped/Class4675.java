// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4675 implements Class4659
{
    private static String[] field20208;
    public final /* synthetic */ Manager field20209;
    
    public Class4675(final Manager field20209) {
        this.field20209 = field20209;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Object o = array[0];
        if (!(o instanceof String)) {
            if (o instanceof byte[]) {
                Manager.method15084(this.field20209, (byte[])o);
            }
        }
        else {
            Manager.method15083(this.field20209, (String)o);
        }
    }
}
