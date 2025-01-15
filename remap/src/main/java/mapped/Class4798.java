// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4798 extends Class4703<Class509>
{
    private static final Class1932 field20451;
    private static final Class6332 field20452;
    private final Class5887<Class509> field20453;
    
    public Class4798(final Class8551 class8551) {
        super(class8551);
        this.field20453 = new Class5887<Class509>();
    }
    
    public int method14194(final Class509 class509, final float n) {
        return 15;
    }
    
    public void method14195(final Class509 class509, final float n, final float n2, final Class7351 class510, final Class7807 class511, final int n3) {
        class510.method22567();
        final float method35707 = MathHelper.method35707(class509.field2401, class509.field2399, n2);
        final float method35708 = MathHelper.method35700(n2, class509.field2402, class509.field2400);
        final float n4 = class509.field2424 + n2;
        class510.method22564(0.0, 0.15000000596046448, 0.0);
        class510.method22566(Vector3f.YP.rotationDegrees(MathHelper.sin(n4 * 0.1f) * 180.0f));
        class510.method22566(Vector3f.XP.rotationDegrees(MathHelper.cos(n4 * 0.1f) * 180.0f));
        class510.method22566(Vector3f.ZP.rotationDegrees(MathHelper.sin(n4 * 0.15f) * 360.0f));
        class510.method22565(-0.5f, -0.5f, 0.5f);
        this.field20453.method17557(class509, 0.0f, 0.0f, 0.0f, method35707, method35708);
        this.field20453.method17564(class510, class511.method25214(this.field20453.method17647(Class4798.field20451)), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class510.method22565(1.5f, 1.5f, 1.5f);
        this.field20453.method17564(class510, class511.method25214(Class4798.field20452), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 0.15f);
        class510.method22568();
        super.method13951(class509, n, n2, class510, class511, n3);
    }
    
    public Class1932 method14196(final Class509 class509) {
        return Class4798.field20451;
    }
    
    static {
        field20451 = new Class1932("textures/entity/shulker/spark.png");
        field20452 = Class6332.method18773(Class4798.field20451);
    }
}
