// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class3662<C extends Class446>
{
    boolean method11289(final C p0, final Class1847 p1);
    
    Class8321 method11290(final C p0);
    
    boolean method11291(final int p0, final int p1);
    
    Class8321 method11292();
    
    default Class2265<Class8321> method11293(final C c) {
        final Class2265<Class8321> method8507 = Class2265.method8507(c.method2239(), Class8321.field34174);
        for (int i = 0; i < method8507.size(); ++i) {
            final Class3820 method8508 = c.method2157(i).method27622();
            if (method8508.method11721()) {
                method8507.set(i, new Class8321(method8508.method11720()));
            }
        }
        return method8507;
    }
    
    default Class2265<Class120> method11294() {
        return Class2265.method8506();
    }
    
    default boolean method11295() {
        return false;
    }
    
    default String method11296() {
        return "";
    }
    
    default Class8321 method11297() {
        return new Class8321(Class7521.field29296);
    }
    
    Class1932 method11298();
    
    Class6096<?> method11299();
    
    Class8976<?> method11300();
}
