// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import java.util.Iterator;
import javax.annotation.Nullable;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;

public class Class8691
{
    private final Predicate<Class7990>[][][] field36525;
    private final int field36526;
    private final int field36527;
    private final int field36528;
    
    public Class8691(final Predicate<Class7990>[][][] field36525) {
        this.field36525 = field36525;
        this.field36526 = field36525.length;
        if (this.field36526 <= 0) {
            this.field36527 = 0;
            this.field36528 = 0;
        }
        else {
            this.field36527 = field36525[0].length;
            if (this.field36527 <= 0) {
                this.field36528 = 0;
            }
            else {
                this.field36528 = field36525[0][0].length;
            }
        }
    }
    
    public int method29792() {
        return this.field36526;
    }
    
    public int method29793() {
        return this.field36527;
    }
    
    public int method29794() {
        return this.field36528;
    }
    
    @Nullable
    private Class7820 method29795(final Class354 class354, final Class179 class355, final Class179 class356, final LoadingCache<Class354, Class7990> loadingCache) {
        for (int i = 0; i < this.field36528; ++i) {
            for (int j = 0; j < this.field36527; ++j) {
                for (int k = 0; k < this.field36526; ++k) {
                    if (!this.field36525[k][j][i].test((Class7990)loadingCache.getUnchecked((Object)method29798(class354, class355, class356, i, j, k)))) {
                        return null;
                    }
                }
            }
        }
        return new Class7820(class354, class355, class356, loadingCache, this.field36528, this.field36527, this.field36526);
    }
    
    @Nullable
    public Class7820 method29796(final Class1852 class1852, final Class354 class1853) {
        final LoadingCache<Class354, Class7990> method29797 = method29797(class1852, false);
        final int max = Math.max(Math.max(this.field36528, this.field36527), this.field36526);
        for (final Class354 class1854 : Class354.method1154(class1853, class1853.method1134(max - 1, max - 1, max - 1))) {
            for (final Class179 class1855 : Class179.values()) {
                for (final Class179 class1856 : Class179.values()) {
                    if (class1856 != class1855) {
                        if (class1856 != class1855.method782()) {
                            final Class7820 method29798 = this.method29795(class1854, class1855, class1856, method29797);
                            if (method29798 != null) {
                                return method29798;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static LoadingCache<Class354, Class7990> method29797(final Class1852 class1852, final boolean b) {
        return (LoadingCache<Class354, Class7990>)CacheBuilder.newBuilder().build((CacheLoader)new Class6047(class1852, b));
    }
    
    public static Class354 method29798(final Class354 class354, final Class179 class355, final Class179 class356, final int n, final int n2, final int n3) {
        if (class355 != class356 && class355 != class356.method782()) {
            final Class352 class357 = new Class352(class355.method785(), class355.method786(), class355.method787());
            final Class352 class358 = new Class352(class356.method785(), class356.method786(), class356.method787());
            final Class352 method1080 = class357.method1080(class358);
            return class354.method1134(class358.method1074() * -n2 + method1080.method1074() * n + class357.method1074() * n3, class358.method1075() * -n2 + method1080.method1075() * n + class357.method1075() * n3, class358.method1076() * -n2 + method1080.method1076() * n + class357.method1076() * n3);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }
}
