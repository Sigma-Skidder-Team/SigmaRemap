// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4736 extends Class4712<Class798, Class5924<Class798>>
{
    private static final Class1932 field20342;
    private static final Class1932 field20343;
    private static final Class1932 field20344;
    private static final Class1932 field20345;
    
    public Class4736(final Class8551 class8551) {
        super(class8551, new Class5924(), 0.4f);
    }
    
    public Class1932 method14057(final Class798 class798) {
        if (!class798.method4519()) {
            return class798.method4529() ? Class4736.field20345 : Class4736.field20344;
        }
        return class798.method4529() ? Class4736.field20343 : Class4736.field20342;
    }
    
    static {
        field20342 = new Class1932("textures/entity/bee/bee_angry.png");
        field20343 = new Class1932("textures/entity/bee/bee_angry_nectar.png");
        field20344 = new Class1932("textures/entity/bee/bee.png");
        field20345 = new Class1932("textures/entity/bee/bee_nectar.png");
    }
}
