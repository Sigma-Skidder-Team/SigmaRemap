// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4715 extends Class4712<Class796, Class5869>
{
    public static final Class1932[] field20317;
    
    public Class4715(final Class8551 class8551) {
        super(class8551, new Class5869(), 0.3f);
    }
    
    public Class1932 method14019(final Class796 class796) {
        return Class4715.field20317[class796.method4502()];
    }
    
    public float method14020(final Class796 class796, final float n) {
        return (Class9546.method35638(Class9546.method35700(n, class796.field4255, class796.field4252)) + 1.0f) * Class9546.method35700(n, class796.field4254, class796.field4253);
    }
    
    static {
        field20317 = new Class1932[] { new Class1932("textures/entity/parrot/parrot_red_blue.png"), new Class1932("textures/entity/parrot/parrot_blue.png"), new Class1932("textures/entity/parrot/parrot_green.png"), new Class1932("textures/entity/parrot/parrot_yellow_blue.png"), new Class1932("textures/entity/parrot/parrot_grey.png") };
    }
}
