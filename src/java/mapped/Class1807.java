// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1807 extends Class1805<Class767, Class5872<Class767>>
{
    private static final Class1932 field9977;
    private final Class5872<Class767> field9978;
    
    public Class1807(final Class4778<Class767, Class5872<Class767>> class4778) {
        super(class4778);
        this.field9978 = new Class5872<Class767>(0.5f);
    }
    
    @Override
    public float method6565(final float n) {
        return Class9546.method35639(n * 0.02f) * 3.0f;
    }
    
    @Override
    public Class1932 method6566() {
        return Class1807.field9977;
    }
    
    @Override
    public Class5845<Class767> method6567() {
        return this.field9978;
    }
    
    static {
        field9977 = new Class1932("textures/entity/wither/wither_armor.png");
    }
}
