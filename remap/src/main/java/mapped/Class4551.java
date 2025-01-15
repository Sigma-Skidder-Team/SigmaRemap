// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;

public class Class4551 extends Class4535<Class5122>
{
    private static String[] field20030;
    public static final Class354 field20031;
    private final boolean field20032;
    
    public Class4551(final boolean field20032) {
        super(Class5122::method16027);
        this.field20032 = field20032;
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5122 class1854) {
        for (final Class354 class1855 : Class354.method1154(new Class354(class1853.method1074() - 4, class1853.method1075() - 1, class1853.method1076() - 4), new Class354(class1853.method1074() + 4, class1853.method1075() + 32, class1853.method1076() + 4))) {
            final boolean method1081 = class1855.method1081(class1853, 2.5);
            if (!method1081 && !class1855.method1081(class1853, 3.5)) {
                continue;
            }
            if (class1855.method1075() >= class1853.method1075()) {
                if (class1855.method1075() <= class1853.method1075()) {
                    if (method1081) {
                        if (!this.field20032) {
                            this.method13529(class1851, new Class354(class1855), Class7521.field29147.method11878());
                        }
                        else {
                            this.method13529(class1851, new Class354(class1855), Class7521.field29401.method11878());
                        }
                    }
                    else {
                        this.method13529(class1851, class1855, Class7521.field29172.method11878());
                    }
                }
                else {
                    this.method13529(class1851, class1855, Class7521.field29147.method11878());
                }
            }
            else if (!method1081) {
                if (class1855.method1075() >= class1853.method1075()) {
                    continue;
                }
                this.method13529(class1851, class1855, Class7521.field29403.method11878());
            }
            else {
                this.method13529(class1851, class1855, Class7521.field29172.method11878());
            }
        }
        for (int i = 0; i < 4; ++i) {
            this.method13529(class1851, class1853.method1138(i), Class7521.field29172.method11878());
        }
        final Class354 method1082 = class1853.method1138(2);
        for (final Class179 class1856 : Class98.field268) {
            this.method13529(class1851, method1082.method1149(class1856), (Class7096)((Class7097<Object, Object>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, class1856));
        }
        return true;
    }
    
    static {
        field20031 = Class354.field2173;
    }
}
