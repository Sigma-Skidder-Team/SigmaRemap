// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class1807 extends Class1805<Class767, Class5872<Class767>>
{
    private static final ResourceLocation field9977;
    private final Class5872<Class767> field9978;
    
    public Class1807(final Class4778<Class767, Class5872<Class767>> class4778) {
        super(class4778);
        this.field9978 = new Class5872<Class767>(0.5f);
    }
    
    @Override
    public float method6565(final float n) {
        return MathHelper.cos(n * 0.02f) * 3.0f;
    }
    
    @Override
    public ResourceLocation method6566() {
        return Class1807.field9977;
    }
    
    @Override
    public Class5845<Class767> method6567() {
        return this.field9978;
    }
    
    static {
        field9977 = new ResourceLocation("textures/entity/wither/wither_armor.png");
    }
}
