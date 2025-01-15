// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3568 extends Class3555<Class512>
{
    private static String[] field16658;
    public final /* synthetic */ Class841 field16659;
    
    public Class3568(final Class841 field16659, final Class841 class841) {
        this.field16659 = field16659;
        super(class841, Class512.class, true);
    }
    
    @Override
    public boolean method11013() {
        return this.field16659.field2391.method6954() != Class2113.field12290 && super.method11013();
    }
    
    @Override
    public Class6221 method11103(final double n) {
        final Class179 method5018 = ((Class841)this.field16602).method5018();
        if (method5018.method790() != Class111.field351) {
            return (method5018.method790() != Class111.field353) ? this.field16602.method1886().method18495(n, 4.0, n) : this.field16602.method1886().method18495(n, n, 4.0);
        }
        return this.field16602.method1886().method18495(4.0, n, n);
    }
}
