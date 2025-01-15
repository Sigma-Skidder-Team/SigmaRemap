// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4786 extends Class4785<Class405>
{
    public static final Class1932 field20418;
    public static final Class1932 field20419;
    
    public Class4786(final Class8551 class8551) {
        super(class8551);
    }
    
    public Class1932 method14154(final Class405 class405) {
        return (class405.method1997() <= 0) ? Class4786.field20418 : Class4786.field20419;
    }
    
    static {
        field20418 = new Class1932("textures/entity/projectiles/arrow.png");
        field20419 = new Class1932("textures/entity/projectiles/tipped_arrow.png");
    }
}
