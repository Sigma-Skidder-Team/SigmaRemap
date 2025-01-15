// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public abstract class Class4598<T extends Class5129> extends Class4592<T>
{
    public Class4598(final Function<Dynamic<?>, ? extends T> function) {
        super(function);
    }
    
    public void method13645(final Class1875 class1875, final Random random, final int n, final Class354 class1876, final int n2, final Set<Class354> set, final Class6997 class1877, final Class5129 class1878) {
        for (int i = 0; i < n - n2; ++i) {
            this.method13618(class1875, random, class1876.method1138(i), set, class1877, class1878);
        }
    }
    
    public Optional<Class354> method13646(final Class1875 class1875, final int n, final int n2, final int n3, final Class354 class1876, final Class5129 class1877) {
        Class354 value;
        if (class1877.field22083) {
            value = class1876;
        }
        else {
            final int method1075 = class1875.method6958(Class2020.field11524, class1876).method1075();
            final int method1076 = class1875.method6958(Class2020.field11522, class1876).method1075();
            value = new Class354(class1876.method1074(), method1075, class1876.method1076());
            if (method1076 - method1075 > class1877.field22095) {
                return Optional.empty();
            }
        }
        if (value.method1075() >= 1 && value.method1075() + n + 1 <= 256) {
            for (int i = 0; i <= n + 1; ++i) {
                final int method1077 = class1877.field22086.method1264(n2, n, n3, i);
                final Class385 class1878 = new Class385();
                for (int j = -method1077; j <= method1077; ++j) {
                    for (int k = -method1077; k <= method1077; ++k) {
                        if (i + value.method1075() < 0 || i + value.method1075() >= 256) {
                            return Optional.empty();
                        }
                        class1878.method1284(j + value.method1074(), i + value.method1075(), k + value.method1076());
                        if (!Class4592.method13608(class1875, class1878) || (!class1877.field22096 && Class4592.method13611(class1875, class1878))) {
                            return Optional.empty();
                        }
                    }
                }
            }
            return (Class4592.method13615(class1875, value.method1139()) && value.method1075() < 256 - n - 1) ? Optional.of(value) : Optional.empty();
        }
        return Optional.empty();
    }
}
