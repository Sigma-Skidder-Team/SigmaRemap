// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Random;

public class Class4481 extends Class4479
{
    private final boolean field19871;
    private final boolean field19872;
    private boolean field19873;
    private final int field19874;
    
    public Class4481(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40943, class1796);
        this.field19871 = class1796.method329("hr");
        this.field19872 = class1796.method329("sc");
        this.field19873 = class1796.method329("hps");
        this.field19874 = class1796.method319("Num");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("hr", this.field19871);
        class51.method312("sc", this.field19872);
        class51.method312("hps", this.field19873);
        class51.method298("Num", this.field19874);
    }
    
    public Class4481(final int n, final Random random, final Class6997 field19849, final Class179 class179, final Class1964 class180) {
        super(Class9520.field40943, n, class180);
        this.method13456(class179);
        this.field19849 = field19849;
        this.field19871 = (random.nextInt(3) == 0);
        this.field19872 = (!this.field19871 && random.nextInt(23) == 0);
        if (this.method13455().method790() != Class111.field353) {
            this.field19874 = field19849.method21417() / 5;
        }
        else {
            this.field19874 = field19849.method21419() / 5;
        }
    }
    
    public static Class6997 method13466(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Class179 class179) {
        final Class6997 class180 = new Class6997(n, n2, n3, n, n2 + 3 - 1, n3);
        int i;
        for (i = random.nextInt(3) + 2; i > 0; --i) {
            final int n4 = i * 5;
            switch (Class8427.field34587[class179.ordinal()]) {
                default: {
                    class180.field27296 = n + 3 - 1;
                    class180.field27295 = n3 - (n4 - 1);
                    break;
                }
                case 2: {
                    class180.field27296 = n + 3 - 1;
                    class180.field27298 = n3 + n4 - 1;
                    break;
                }
                case 3: {
                    class180.field27293 = n - (n4 - 1);
                    class180.field27298 = n3 + 3 - 1;
                    break;
                }
                case 4: {
                    class180.field27296 = n + n4 - 1;
                    class180.field27298 = n3 + 3 - 1;
                    break;
                }
            }
            if (Class4473.method13435(list, class180) == null) {
                break;
            }
        }
        return (i > 0) ? class180 : null;
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        final int nextInt = random.nextInt(4);
        final Class179 method13434 = this.method13455();
        if (method13434 != null) {
            switch (Class8427.field34587[method13434.ordinal()]) {
                default: {
                    if (nextInt <= 1) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295 - 1, method13434, method13433);
                        break;
                    }
                    if (nextInt == 2) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295, Class179.field515, method13433);
                        break;
                    }
                    Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295, Class179.field516, method13433);
                    break;
                }
                case 2: {
                    if (nextInt <= 1) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27298 + 1, method13434, method13433);
                        break;
                    }
                    if (nextInt == 2) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27298 - 3, Class179.field515, method13433);
                        break;
                    }
                    Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27298 - 3, Class179.field516, method13433);
                    break;
                }
                case 3: {
                    if (nextInt <= 1) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295, method13434, method13433);
                        break;
                    }
                    if (nextInt == 2) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295 - 1, Class179.field513, method13433);
                        break;
                    }
                    Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27298 + 1, Class179.field514, method13433);
                    break;
                }
                case 4: {
                    if (nextInt <= 1) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295, method13434, method13433);
                        break;
                    }
                    if (nextInt == 2) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27296 - 3, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27295 - 1, Class179.field513, method13433);
                        break;
                    }
                    Class9191.method33629(class4473, list, random, this.field19849.field27296 - 3, this.field19849.field27294 - 1 + random.nextInt(3), this.field19849.field27298 + 1, Class179.field514, method13433);
                    break;
                }
            }
        }
        if (method13433 < 8) {
            if (method13434 != Class179.field513 && method13434 != Class179.field514) {
                for (int n = this.field19849.field27293 + 3; n + 3 <= this.field19849.field27296; n += 5) {
                    final int nextInt2 = random.nextInt(5);
                    if (nextInt2 == 0) {
                        Class9191.method33629(class4473, list, random, n, this.field19849.field27294, this.field19849.field27295 - 1, Class179.field513, method13433 + 1);
                    }
                    else if (nextInt2 == 1) {
                        Class9191.method33629(class4473, list, random, n, this.field19849.field27294, this.field19849.field27298 + 1, Class179.field514, method13433 + 1);
                    }
                }
            }
            else {
                for (int n2 = this.field19849.field27295 + 3; n2 + 3 <= this.field19849.field27298; n2 += 5) {
                    final int nextInt3 = random.nextInt(5);
                    if (nextInt3 == 0) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294, n2, Class179.field515, method13433 + 1);
                    }
                    else if (nextInt3 == 1) {
                        Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294, n2, Class179.field516, method13433 + 1);
                    }
                }
            }
        }
    }
    
    @Override
    public boolean method13450(final Class1851 class1851, final Class6997 class1852, final Random random, final int n, final int n2, final int n3, final Class1932 class1853) {
        final Class354 class1854 = new Class354(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        if (class1852.method21415(class1854)) {
            if (class1851.method6701(class1854).method21706()) {
                if (!class1851.method6701(class1854.method1139()).method21706()) {
                    this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29308.method11878()).method21773(Class4020.field18103, random.nextBoolean() ? Class104.field311 : Class104.field312), n, n2, n3, class1852);
                    final Class505 class1855 = new Class505(class1851.method6744(), class1854.method1074() + 0.5f, class1854.method1075() + 0.5f, class1854.method1076() + 0.5f);
                    class1855.method2165(class1853, random.nextLong());
                    class1851.method6886(class1855);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (!this.method13436(class1851, class1853)) {
            final int n = this.field19874 * 5 - 1;
            final Class7096 method13462 = this.method13462();
            this.method13444(class1851, class1853, 0, 0, 0, 2, 1, n, Class4481.field19848, Class4481.field19848, false);
            this.method13446(class1851, class1853, random, 0.8f, 0, 2, 0, 2, 2, n, Class4481.field19848, Class4481.field19848, false, false);
            if (this.field19872) {
                this.method13446(class1851, class1853, random, 0.6f, 0, 0, 0, 2, 1, n, Class7521.field29240.method11878(), Class4481.field19848, false, true);
            }
            for (int i = 0; i < this.field19874; ++i) {
                final int n2 = 2 + i * 5;
                this.method13467(class1851, class1853, 0, 0, n2, 2, 2, random);
                this.method13468(class1851, class1853, random, 0.1f, 0, 2, n2 - 1);
                this.method13468(class1851, class1853, random, 0.1f, 2, 2, n2 - 1);
                this.method13468(class1851, class1853, random, 0.1f, 0, 2, n2 + 1);
                this.method13468(class1851, class1853, random, 0.1f, 2, 2, n2 + 1);
                this.method13468(class1851, class1853, random, 0.05f, 0, 2, n2 - 2);
                this.method13468(class1851, class1853, random, 0.05f, 2, 2, n2 - 2);
                this.method13468(class1851, class1853, random, 0.05f, 0, 2, n2 + 2);
                this.method13468(class1851, class1853, random, 0.05f, 2, 2, n2 + 2);
                if (random.nextInt(100) == 0) {
                    this.method13450(class1851, class1853, random, 2, 0, n2 - 1, Class9020.field38083);
                }
                if (random.nextInt(100) == 0) {
                    this.method13450(class1851, class1853, random, 0, 0, n2 + 1, Class9020.field38083);
                }
                if (this.field19872) {
                    if (!this.field19873) {
                        final int method13463 = this.method13438(0);
                        final int n3 = n2 - 1 + random.nextInt(3);
                        final Class354 class1855 = new Class354(this.method13437(1, n3), method13463, this.method13439(1, n3));
                        if (class1853.method21415(class1855)) {
                            if (this.method13442(class1851, 1, 0, n3, class1853)) {
                                this.field19873 = true;
                                class1851.method6688(class1855, Class7521.field29290.method11878(), 2);
                                final Class436 method13464 = class1851.method6727(class1855);
                                if (method13464 instanceof Class494) {
                                    ((Class494)method13464).method2509().method13884(Class7499.field28965);
                                }
                            }
                        }
                    }
                }
            }
            for (int j = 0; j <= 2; ++j) {
                for (int k = 0; k <= n; ++k) {
                    if (this.method13441(class1851, j, -1, k, class1853).method21706()) {
                        if (this.method13442(class1851, j, -1, k, class1853)) {
                            this.method13440(class1851, method13462, j, -1, k, class1853);
                        }
                    }
                }
            }
            if (this.field19871) {
                final Class7096 class1856 = ((Class7097<O, Class7096>)Class7521.field29308.method11878()).method21773(Class4020.field18103, Class104.field311);
                for (int l = 0; l <= n; ++l) {
                    final Class7096 method13465 = this.method13441(class1851, 1, -1, l, class1853);
                    if (!method13465.method21706()) {
                        if (method13465.method21722(class1851, new Class354(this.method13437(1, l), this.method13438(-1), this.method13439(1, l)))) {
                            this.method13447(class1851, class1853, random, this.method13442(class1851, 1, 0, l, class1853) ? 0.7f : 0.9f, 1, 0, l, class1856);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void method13467(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final Random random) {
        if (this.method13464(class1851, class1852, n, n5, n4, n3)) {
            final Class7096 method13462 = this.method13462();
            final Class7096 method13463 = this.method13463();
            this.method13444(class1851, class1852, n, n2, n3, n, n4 - 1, n3, ((Class7097<Object, Class7096>)method13463).method21773((Class7111<Comparable>)Class3929.field17468, true), Class4481.field19848, false);
            this.method13444(class1851, class1852, n5, n2, n3, n5, n4 - 1, n3, ((Class7097<Object, Class7096>)method13463).method21773((Class7111<Comparable>)Class3929.field17466, true), Class4481.field19848, false);
            if (random.nextInt(4) != 0) {
                this.method13444(class1851, class1852, n, n4, n3, n5, n4, n3, method13462, Class4481.field19848, false);
                this.method13447(class1851, class1852, random, 0.05f, n + 1, n4, n3 - 1, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Class179.field513));
                this.method13447(class1851, class1852, random, 0.05f, n + 1, n4, n3 + 1, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Class179.field514));
            }
            else {
                this.method13444(class1851, class1852, n, n4, n3, n, n4, n3, method13462, Class4481.field19848, false);
                this.method13444(class1851, class1852, n5, n4, n3, n5, n4, n3, method13462, Class4481.field19848, false);
            }
        }
    }
    
    private void method13468(final Class1851 class1851, final Class6997 class1852, final Random random, final float n, final int n2, final int n3, final int n4) {
        if (this.method13442(class1851, n2, n3, n4, class1852)) {
            this.method13447(class1851, class1852, random, n, n2, n3, n4, Class7521.field29240.method11878());
        }
    }
}
