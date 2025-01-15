// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5806 implements Class5804
{
    private static String[] field23835;
    private final Class394 field23836;
    private final Class3641 field23837;
    
    public Class5806(final Class394 field23836, final Class3641 field23837) {
        this.field23836 = field23836;
        this.field23837 = field23837;
    }
    
    @Override
    public void method17403(final Class4398 class4398) {
        this.field23837.method11171(class4398.method13235());
        this.field23837.method11173(new Class5803(this.field23836, this.field23837));
    }
    
    @Override
    public void method17291(final Class2250 class2250) {
    }
    
    @Override
    public Class3641 method17369() {
        return this.field23837;
    }
}
