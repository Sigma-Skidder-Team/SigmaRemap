// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5418 extends Class5419<Class511>
{
    private static String[] field22589;
    private final float field22590;
    
    public Class5418(final float field22590) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22590 = field22590;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final Class511 class1850, final long n) {
        final Optional<Class5487> ofNullable = Optional.ofNullable(this.method16540(class1849, class1850));
        if (ofNullable.isPresent()) {
            class1850.method2618().method1197(Class8233.field33809, (Optional<Class6949>)ofNullable.map(class1851 -> new Class6949(class1851, this.field22590, 0)));
        }
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final Class511 class1850) {
        return !class1849.method6994(new Class354(class1850));
    }
    
    @Nullable
    private Class5487 method16540(final Class1849 class1849, final Class511 class1850) {
        final Random method2633 = class1850.method2633();
        final Class354 class1851 = new Class354(class1850);
        for (int i = 0; i < 10; ++i) {
            final Class354 method2634 = class1851.method1134(method2633.nextInt(20) - 10, method2633.nextInt(6) - 3, method2633.nextInt(20) - 10);
            if (method16541(class1849, class1850, method2634)) {
                return new Class5487(method2634);
            }
        }
        return null;
    }
    
    public static boolean method16541(final Class1849 class1849, final Class511 class1850, final Class354 class1851) {
        return class1849.method6994(class1851) && class1849.method6958(Class2020.field11525, class1851).method1075() <= class1850.method1941();
    }
}
