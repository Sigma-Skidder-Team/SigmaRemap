// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4001 extends Class4000
{
    private static String[] field18034;
    public static final Class7112 field18035;
    private final int field18036;
    
    public Class4001(final int field18036, final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4001.field18035, 0));
        this.field18036 = field18036;
    }
    
    @Override
    public int method12165(final Class1847 class1847, final Class354 class1848) {
        final int min = Math.min(class1847.method7128((Class<? extends Class399>)Class399.class, Class4001.field18033.method18500(class1848)).size(), this.field18036);
        if (min <= 0) {
            return 0;
        }
        return Class9546.method35649(Math.min(this.field18036, min) / (float)this.field18036 * 15.0f);
    }
    
    @Override
    public void method12162(final Class1851 class1851, final Class354 class1852) {
        class1851.method6705(null, class1852, Class8520.field35365, Class286.field1582, 0.3f, 0.90000004f);
    }
    
    @Override
    public void method12163(final Class1851 class1851, final Class354 class1852) {
        class1851.method6705(null, class1852, Class8520.field35364, Class286.field1582, 0.3f, 0.75f);
    }
    
    @Override
    public int method12166(final Class7096 class7096) {
        return class7096.method21772((Class7111<Integer>)Class4001.field18035);
    }
    
    @Override
    public Class7096 method12167(final Class7096 class7096, final int i) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4001.field18035, i);
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 10;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4001.field18035);
    }
    
    static {
        field18035 = Class8970.field37790;
    }
}
