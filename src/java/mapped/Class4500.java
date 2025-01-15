// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public abstract class Class4500 extends Class4473
{
    public Class1982 field19896;
    
    public Class4500(final Class9520 class9520, final int n) {
        super(class9520, n);
        this.field19896 = Class1982.field10976;
    }
    
    public Class4500(final Class9520 class9520, final Class51 class9521) {
        super(class9520, class9521);
        this.field19896 = Class1982.field10976;
        this.field19896 = Class1982.valueOf(class9521.method323("EntryDoor"));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        class51.method306("EntryDoor", this.field19896.name());
    }
    
    public void method13492(final Class1851 class1851, final Random random, final Class6997 class1852, final Class1982 class1853, final int n, final int n2, final int n3) {
        switch (Class6870.field26918[class1853.ordinal()]) {
            case 1: {
                this.method13444(class1851, class1852, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, Class4500.field19848, Class4500.field19848, false);
                break;
            }
            case 2: {
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2 + 1, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2, n3, class1852);
                this.method13440(class1851, Class7521.field29306.method11878(), n + 1, n2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29306.method11878()).method21773(Class3969.field17935, Class182.field564), n + 1, n2 + 1, n3, class1852);
                break;
            }
            case 3: {
                this.method13440(class1851, Class7521.field29764.method11878(), n + 1, n2, n3, class1852);
                this.method13440(class1851, Class7521.field29764.method11878(), n + 1, n2 + 1, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17468, true), n, n2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17468, true), n, n2 + 1, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17466, true)).method21773((Class7111<Comparable>)Class3853.field17468, true), n, n2 + 2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17466, true)).method21773((Class7111<Comparable>)Class3853.field17468, true), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17466, true)).method21773((Class7111<Comparable>)Class3853.field17468, true), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17466, true), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29381.method11878()).method21773((Class7111<Comparable>)Class3853.field17466, true), n + 2, n2, n3, class1852);
                break;
            }
            case 4: {
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2 + 1, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, Class7521.field29368.method11878(), n + 2, n2, n3, class1852);
                this.method13440(class1851, Class7521.field29318.method11878(), n + 1, n2, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29318.method11878()).method21773(Class3969.field17935, Class182.field564), n + 1, n2 + 1, n3, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29328.method11878()).method21773((Class7111<Comparable>)Class3905.field17564, Class179.field513), n + 2, n2 + 1, n3 + 1, class1852);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29328.method11878()).method21773((Class7111<Comparable>)Class3905.field17564, Class179.field514), n + 2, n2 + 1, n3 - 1, class1852);
                break;
            }
        }
    }
    
    public Class1982 method13493(final Random random) {
        switch (random.nextInt(5)) {
            default: {
                return Class1982.field10976;
            }
            case 2: {
                return Class1982.field10977;
            }
            case 3: {
                return Class1982.field10978;
            }
            case 4: {
                return Class1982.field10979;
            }
        }
    }
    
    @Nullable
    public Class4473 method13494(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Class179 method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n, this.field19849.field27294 + n2, this.field19849.field27295 - 1, method13455, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n, this.field19849.field27294 + n2, this.field19849.field27298 + 1, method13455, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 - 1, this.field19849.field27294 + n2, this.field19849.field27295 + n, method13455, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27296 + 1, this.field19849.field27294 + n2, this.field19849.field27295 + n, method13455, this.method13433());
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13495(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Class179 method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 - 1, this.field19849.field27294 + n, this.field19849.field27295 + n2, Class179.field515, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 - 1, this.field19849.field27294 + n, this.field19849.field27295 + n2, Class179.field515, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n2, this.field19849.field27294 + n, this.field19849.field27295 - 1, Class179.field513, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n2, this.field19849.field27294 + n, this.field19849.field27295 - 1, Class179.field513, this.method13433());
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13496(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Class179 method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27296 + 1, this.field19849.field27294 + n, this.field19849.field27295 + n2, Class179.field516, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27296 + 1, this.field19849.field27294 + n, this.field19849.field27295 + n2, Class179.field516, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n2, this.field19849.field27294 + n, this.field19849.field27298 + 1, Class179.field514, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.field27293 + n2, this.field19849.field27294 + n, this.field19849.field27298 + 1, Class179.field514, this.method13433());
                }
            }
        }
        return null;
    }
    
    public static boolean method13497(final Class6997 class6997) {
        return class6997 != null && class6997.field27294 > 10;
    }
}
