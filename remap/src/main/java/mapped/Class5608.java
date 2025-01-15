// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5608 extends Class5609
{
    public final /* synthetic */ Class5085 field22974;
    
    public Class5608(final Class5085 field22974, final int n, final int n2, final int n3, final int n4, final int n5, final float n6, final float n7) {
        this.field22974 = field22974;
        super(n, n2, n3, n4, n5, n6, n7);
    }
    
    @Override
    public void method16898() {
        if (Class5085.method15908(this.field22974).method16916()) {
            Class5085.method15909(this.field22974, (int)this.method16901(this.method16907()));
        }
    }
    
    @Override
    public String method16899() {
        return Class5046.method15438("mco.configure.world.spawnProtection") + ": " + ((Class5085.method15910(this.field22974) != 0) ? Class5085.method15910(this.field22974) : Class5046.method15438("mco.configure.world.off"));
    }
}
