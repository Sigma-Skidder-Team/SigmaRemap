// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4786 extends Class4785<Class405>
{
    public static final ResourceLocation field20418;
    public static final ResourceLocation field20419;
    
    public Class4786(final Class8551 class8551) {
        super(class8551);
    }
    
    public ResourceLocation method14154(final Class405 class405) {
        return (class405.method1997() <= 0) ? Class4786.field20418 : Class4786.field20419;
    }
    
    static {
        field20418 = new ResourceLocation("textures/entity/projectiles/arrow.png");
        field20419 = new ResourceLocation("textures/entity/projectiles/tipped_arrow.png");
    }
}
