// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4731 extends Class4712<Class803, Class5927<Class803>>
{
    private static final Class1932 field20334;
    private static final Class1932 field20335;
    private static final Class1932 field20336;
    private static final Class1932 field20337;
    
    public Class4731(final Class8551 class8551) {
        super(class8551, new Class5927(), 0.4f);
        this.method13978(new Class1812(this));
    }
    
    public void method14046(final Class803 class803, final Class7351 class804, final float n, final float n2, final float n3) {
        super.method13985(class803, class804, n, n2, n3);
        if (class803.method4665() || class803.method4656()) {
            class804.method22566(Vector3f.XP.rotationDegrees(-MathHelper.method35700(n3, class803.field2402, class803.field2400)));
        }
    }
    
    public Class1932 method14047(final Class803 class803) {
        if (class803.method4650() != Class2074.field11963) {
            return class803.method2783() ? Class4731.field20337 : Class4731.field20336;
        }
        return class803.method2783() ? Class4731.field20335 : Class4731.field20334;
    }
    
    static {
        field20334 = new Class1932("textures/entity/fox/fox.png");
        field20335 = new Class1932("textures/entity/fox/fox_sleep.png");
        field20336 = new Class1932("textures/entity/fox/snow_fox.png");
        field20337 = new Class1932("textures/entity/fox/snow_fox_sleep.png");
    }
}
