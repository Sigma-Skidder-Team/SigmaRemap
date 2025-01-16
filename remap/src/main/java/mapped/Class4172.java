// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4172 extends Class4171<Class488>
{
    private static final ResourceLocation field18588;
    
    public Class4172(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12495(final Class488 class488, final float n, final MatrixStack class489, final IRenderTypeBuffer class490, final int n2, final int n3) {
        if (class488.method2432() || class488.method2433()) {
            final float n4 = class488.method2432() ? class488.method2434(n) : class488.method2435(n);
            final double n5 = class488.method2432() ? 256.0 : 50.0;
            final float method35638 = MathHelper.sin(n4 * 3.1415927f);
            final int method35639 = MathHelper.floor(method35638 * n5);
            final float[] array = class488.method2432() ? Class181.field539.method815() : Class181.field547.method815();
            final long method35640 = class488.method2186().method6754();
            Class4168.method12478(class489, class490, Class4172.field18588, n, method35638, method35640, 0, method35639, array, 0.15f, 0.175f);
            Class4168.method12478(class489, class490, Class4172.field18588, n, method35638, method35640, 0, -method35639, array, 0.15f, 0.175f);
        }
        super.method12489(class488, n, class489, class490, n2, n3);
    }
    
    @Override
    public int method12492(final double n) {
        return super.method12492(n) + 1;
    }
    
    @Override
    public float method12493() {
        return 1.0f;
    }
    
    static {
        field18588 = new ResourceLocation("textures/entity/end_gateway_beam.png");
    }
}
