// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class1659 implements Class1657
{
    private static String[] field9374;
    public static final Class9201<ItemStack> field9375;
    public static final Class9201<ItemStack> field9376;
    public static final Class9201<Class9586> field9377;
    private final Map<Class9201<?>, Class8924<?>> field9378;
    
    public Class1659() {
        this.field9378 = Maps.newHashMap();
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        final Iterator<Class8924<?>> iterator = this.field9378.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method31454();
        }
    }
    
    public <T> void method5798(final Class9201<T> class9201, final Class8924<T> class9202) {
        this.field9378.put(class9201, class9202);
    }
    
    public <T> Class8924<T> method5799(final Class9201<T> class9201) {
        return (Class8924)this.field9378.get(class9201);
    }
    
    static {
        field9375 = new Class9201<ItemStack>();
        field9376 = new Class9201<ItemStack>();
        field9377 = new Class9201<Class9586>();
    }
}
