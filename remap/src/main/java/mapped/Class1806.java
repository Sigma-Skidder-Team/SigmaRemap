// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1806 extends Class1805<Class765, Class5881<Class765>>
{
    private static final Class1932 field9975;
    private final Class5881<Class765> field9976;
    
    public Class1806(final Class4778<Class765, Class5881<Class765>> class4778) {
        super(class4778);
        this.field9976 = new Class5881<Class765>(2.0f);
    }
    
    @Override
    public float method6565(final float n) {
        return n * 0.01f;
    }
    
    @Override
    public Class1932 method6566() {
        return Class1806.field9975;
    }
    
    @Override
    public Class5845<Class765> method6567() {
        return this.field9976;
    }
    
    static {
        field9975 = new Class1932("textures/entity/creeper/creeper_armor.png");
    }
}
