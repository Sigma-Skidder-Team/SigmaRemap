// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3927 extends Class3926
{
    private static String[] field17790;
    private final Class3833 field17793;
    
    public Class3927(final Class3833 field17793, final Class9288 class9288) {
        super(class9288);
        this.field17793 = field17793;
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        this.method12037(class7096, class7097, class7098);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (!Class3922.method12038(class7096, class7097, class7098)) {
            class7097.method6688(class7098, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17793.method11878()).method21773((Class7111<Comparable>)Class3927.field17782, false)).method21773((Class7111<Comparable>)Class3927.field17791, (Comparable)class7096.method21772((Class7111<V>)Class3927.field17791)), 2);
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7097.method782() == class7096.method21772((Class7111<Class179>)Class3927.field17791) && !class7096.method21752(class7099, class7100)) {
            return Class7521.field29147.method11878();
        }
        if (class7096.method21772((Class7111<Boolean>)Class3927.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        this.method12037(class7096, class7099, class7100);
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
}
