// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class6867 implements Class6866
{
    private final List<Class3662<?>> field26903;
    private long field26904;
    private boolean field26905;
    
    public Class6867(final Class3662<?> class3662) {
        (this.field26903 = Lists.newArrayList()).add(class3662);
    }
    
    @Override
    public Class2204 method20978(final Class690 class690, final long field26904) {
        if (this.field26905) {
            this.field26904 = field26904;
            this.field26905 = false;
        }
        if (!this.field26903.isEmpty()) {
            class690.method3853().method5290().method5849(Class6867.field26901);
            Class8726.method30069(1.0f, 1.0f, 1.0f);
            class690.method3186(0, 0, 0, 32, 160, 32);
            class690.method3853().field4643.method6610(Class8822.method30773("recipe.toast.title", new Object[0]), 30.0f, 7.0f, -11534256);
            class690.method3853().field4643.method6610(Class8822.method30773("recipe.toast.description", new Object[0]), 30.0f, 18.0f, -16777216);
            final Class3662 class691 = this.field26903.get((int)(field26904 / (5000L / this.field26903.size()) % this.field26903.size()));
            final ItemStack method11297 = class691.method11297();
            Class8726.method30059();
            Class8726.method30063(0.6f, 0.6f, 1.0f);
            class690.method3853().method5307().method6541(null, method11297, 3, 3);
            Class8726.method30060();
            class690.method3853().method5307().method6541(null, class691.method11292(), 8, 8);
            return (field26904 - this.field26904 < 5000L) ? Class2204.field13417 : Class2204.field13418;
        }
        return Class2204.field13418;
    }
    
    public void method20983(final Class3662<?> class3662) {
        if (this.field26903.add(class3662)) {
            this.field26905 = true;
        }
    }
    
    public static void method20984(final Class690 class690, final Class3662<?> class691) {
        final Class6867 class692 = class690.method3850((Class<? extends Class6867>)Class6867.class, Class6867.field26902);
        if (class692 != null) {
            class692.method20983(class691);
        }
        else {
            class690.method3852(new Class6867(class691));
        }
    }
}
