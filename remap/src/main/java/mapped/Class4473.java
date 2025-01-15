// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.Direction;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;
import java.util.Set;

public abstract class Class4473
{
    public static final Class7096 field19848;
    public Class6997 field19849;
    private Direction field19850;
    private Class2181 field19851;
    private Class2052 field19852;
    public int field19853;
    private final Class9520 field19854;
    private static final Set<Class3833> field19855;
    
    public Class4473(final Class9520 field19854, final int field19855) {
        this.field19854 = field19854;
        this.field19853 = field19855;
    }
    
    public Class4473(final Class9520 class9520, final Class51 class9521) {
        this(class9520, class9521.method319("GD"));
        if (class9521.method315("BB")) {
            this.field19849 = new Class6997(class9521.method325("BB"));
        }
        final int method319 = class9521.method319("O");
        this.method13456((method319 != -1) ? Direction.byHorizontalIndex(method319) : null);
    }
    
    public final Class51 method13430() {
        final Class51 class51 = new Class51();
        class51.method306("id", Class90.field231.method503(this.method13458()).toString());
        class51.method295("BB", this.field19849.method21421());
        final Direction method13455 = this.method13455();
        class51.method298("O", (method13455 != null) ? method13455.getHorizontalIndex() : -1);
        class51.method298("GD", this.field19853);
        this.method13415(class51);
        return class51;
    }
    
    public abstract void method13415(final Class51 p0);
    
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
    }
    
    public abstract boolean method13421(final Class1851 p0, final Class6346<?> p1, final Random p2, final Class6997 p3, final Class7859 p4);
    
    public Class6997 method13432() {
        return this.field19849;
    }
    
    public int method13433() {
        return this.field19853;
    }
    
    public boolean method13434(final Class7859 class7859, final int n) {
        final int n2 = class7859.field32290 << 4;
        final int n3 = class7859.field32291 << 4;
        return this.field19849.method21411(n2 - n, n3 - n, n2 + 15 + n, n3 + 15 + n);
    }
    
    public static Class4473 method13435(final List<Class4473> list, final Class6997 class6997) {
        for (final Class4473 class6998 : list) {
            if (class6998.method13432() != null && class6998.method13432().method21410(class6997)) {
                return class6998;
            }
        }
        return null;
    }
    
    public boolean method13436(final Class1855 class1855, final Class6997 class1856) {
        final int max = Math.max(this.field19849.field27293 - 1, class1856.field27293);
        final int max2 = Math.max(this.field19849.field27294 - 1, class1856.field27294);
        final int max3 = Math.max(this.field19849.field27295 - 1, class1856.field27295);
        final int min = Math.min(this.field19849.field27296 + 1, class1856.field27296);
        final int min2 = Math.min(this.field19849.field27297 + 1, class1856.field27297);
        final int min3 = Math.min(this.field19849.field27298 + 1, class1856.field27298);
        final Class385 class1857 = new Class385();
        for (int i = max; i <= min; ++i) {
            for (int j = max3; j <= min3; ++j) {
                if (class1855.method6701(class1857.method1284(i, max2, j)).method21697().method26438()) {
                    return true;
                }
                if (class1855.method6701(class1857.method1284(i, min2, j)).method21697().method26438()) {
                    return true;
                }
            }
        }
        for (int k = max; k <= min; ++k) {
            for (int l = max2; l <= min2; ++l) {
                if (class1855.method6701(class1857.method1284(k, l, max3)).method21697().method26438()) {
                    return true;
                }
                if (class1855.method6701(class1857.method1284(k, l, min3)).method21697().method26438()) {
                    return true;
                }
            }
        }
        for (int n = max3; n <= min3; ++n) {
            for (int n2 = max2; n2 <= min2; ++n2) {
                if (class1855.method6701(class1857.method1284(max, n2, n)).method21697().method26438()) {
                    return true;
                }
                if (class1855.method6701(class1857.method1284(min, n2, n)).method21697().method26438()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int method13437(final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 == null) {
            return n;
        }
        switch (Class8291.field34093[method13455.ordinal()]) {
            case 1:
            case 2: {
                return this.field19849.field27293 + n;
            }
            case 3: {
                return this.field19849.field27296 - n2;
            }
            case 4: {
                return this.field19849.field27293 + n2;
            }
            default: {
                return n;
            }
        }
    }
    
    public int method13438(final int n) {
        return (this.method13455() != null) ? (n + this.field19849.field27294) : n;
    }
    
    public int method13439(final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 == null) {
            return n2;
        }
        switch (Class8291.field34093[method13455.ordinal()]) {
            case 1: {
                return this.field19849.field27298 - n2;
            }
            case 2: {
                return this.field19849.field27295 + n2;
            }
            case 3:
            case 4: {
                return this.field19849.field27295 + n;
            }
            default: {
                return n2;
            }
        }
    }
    
    public void method13440(final Class1851 class1851, Class7096 class1852, final int n, final int n2, final int n3, final Class6997 class1853) {
        final BlockPos class1854 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        if (class1853.method21415(class1854)) {
            if (this.field19851 != Class2181.field12917) {
                class1852 = class1852.method21709(this.field19851);
            }
            if (this.field19852 != Class2052.field11707) {
                class1852 = class1852.method21708(this.field19852);
            }
            class1851.method6688(class1854, class1852, 2);
            final Class7099 method6702 = class1851.method6702(class1854);
            if (!method6702.method21781()) {
                class1851.method6834().method21345(class1854, method6702.method21779(), 0);
            }
            if (Class4473.field19855.contains(class1852.method21696())) {
                class1851.method6965(class1854).method7029(class1854);
            }
        }
    }
    
    public Class7096 method13441(final Class1855 class1855, final int n, final int n2, final int n3, final Class6997 class1856) {
        final BlockPos class1857 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        return class1856.method21415(class1857) ? class1855.method6701(class1857) : Class7521.field29147.method11878();
    }
    
    public boolean method13442(final Class1852 class1852, final int n, final int n2, final int n3, final Class6997 class1853) {
        final int method13437 = this.method13437(n, n3);
        final int method13438 = this.method13438(n2 + 1);
        final int method13439 = this.method13439(n, n3);
        return class1853.method21415(new BlockPos(method13437, method13438, method13439)) && method13438 < class1852.method6699(Class2020.field11523, method13437, method13439);
    }
    
    public void method13443(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.method13440(class1851, Class7521.field29147.method11878(), j, i, k, class1852);
                }
            }
        }
    }
    
    public void method13444(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class7096 class1853, final Class7096 class1854, final boolean b) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        if (i != n2) {
                            if (i != n5) {
                                if (j != n) {
                                    if (j != n4) {
                                        if (k != n3) {
                                            if (k != n6) {
                                                this.method13440(class1851, class1854, j, i, k, class1852);
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.method13440(class1851, class1853, j, i, k, class1852);
                    }
                }
            }
        }
    }
    
    public void method13445(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final Random random, final Class6863 class1853) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        final int n7 = j;
                        final int n8 = i;
                        final int n9 = k;
                        boolean b2 = false;
                        Label_0163: {
                            if (i != n2) {
                                if (i != n5) {
                                    if (j != n) {
                                        if (j != n4) {
                                            if (k != n3) {
                                                if (k != n6) {
                                                    b2 = false;
                                                    break Label_0163;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b2 = true;
                        }
                        class1853.method20976(random, n7, n8, n9, b2);
                        this.method13440(class1851, class1853.method20977(), j, i, k, class1852);
                    }
                }
            }
        }
    }
    
    public void method13446(final Class1851 class1851, final Class6997 class1852, final Random random, final float n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Class7096 class1853, final Class7096 class1854, final boolean b, final boolean b2) {
        for (int i = n3; i <= n6; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    if (random.nextFloat() <= n) {
                        if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                            if (!b2 || this.method13442(class1851, j, i, k, class1852)) {
                                if (i != n3) {
                                    if (i != n6) {
                                        if (j != n2) {
                                            if (j != n5) {
                                                if (k != n4) {
                                                    if (k != n7) {
                                                        this.method13440(class1851, class1854, j, i, k, class1852);
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                this.method13440(class1851, class1853, j, i, k, class1852);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method13447(final Class1851 class1851, final Class6997 class1852, final Random random, final float n, final int n2, final int n3, final int n4, final Class7096 class1853) {
        if (random.nextFloat() < n) {
            this.method13440(class1851, class1853, n2, n3, n4, class1852);
        }
    }
    
    public void method13448(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class7096 class1853, final boolean b) {
        final float n7 = (float)(n4 - n + 1);
        final float n8 = (float)(n5 - n2 + 1);
        final float n9 = (float)(n6 - n3 + 1);
        final float n10 = n + n7 / 2.0f;
        final float n11 = n3 + n9 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            final float n12 = (i - n2) / n8;
            for (int j = n; j <= n4; ++j) {
                final float n13 = (j - n10) / (n7 * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    final float n14 = (k - n11) / (n9 * 0.5f);
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        if (n13 * n13 + n12 * n12 + n14 * n14 <= 1.05f) {
                            this.method13440(class1851, class1853, j, i, k, class1852);
                        }
                    }
                }
            }
        }
    }
    
    public void method13449(final Class1851 class1851, final Class7096 class1852, final int n, final int n2, final int n3, final Class6997 class1853) {
        final int method13437 = this.method13437(n, n3);
        int method13438 = this.method13438(n2);
        final int method13439 = this.method13439(n, n3);
        if (class1853.method21415(new BlockPos(method13437, method13438, method13439))) {
            while (class1851.method6961(new BlockPos(method13437, method13438, method13439)) || class1851.method6701(new BlockPos(method13437, method13438, method13439)).method21697().method26438()) {
                if (method13438 <= 1) {
                    break;
                }
                class1851.method6688(new BlockPos(method13437, method13438, method13439), class1852, 2);
                --method13438;
            }
        }
    }
    
    public boolean method13450(final Class1851 class1851, final Class6997 class1852, final Random random, final int n, final int n2, final int n3, final Class1932 class1853) {
        return this.method13452(class1851, class1852, random, new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3)), class1853, null);
    }
    
    public static Class7096 method13451(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        Direction class1858 = null;
        for (final Direction class1859 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class1856.method1149(class1859);
            final Class7096 method1150 = class1855.method6701(method1149);
            if (method1150.method21696() == Class7521.field29292) {
                return class1857;
            }
            if (!method1150.method21722(class1855, method1149)) {
                continue;
            }
            if (class1858 != null) {
                class1858 = null;
                break;
            }
            class1858 = class1859;
        }
        if (class1858 == null) {
            Direction class1860 = class1857.method21772((Class7111<Direction>)Class3892.field17564);
            BlockPos class1861 = class1856.method1149(class1860);
            if (class1855.method6701(class1861).method21722(class1855, class1861)) {
                class1860 = class1860.getOpposite();
                class1861 = class1856.method1149(class1860);
            }
            if (class1855.method6701(class1861).method21722(class1855, class1861)) {
                class1860 = class1860.rotateY();
                class1861 = class1856.method1149(class1860);
            }
            if (class1855.method6701(class1861).method21722(class1855, class1861)) {
                class1860 = class1860.getOpposite();
                class1856.method1149(class1860);
            }
            return (Class7096)((Class7097<Object, Object>)class1857).method21773((Class7111<Comparable>)Class3892.field17564, class1860);
        }
        return (Class7096)((Class7097<Object, Object>)class1857).method21773((Class7111<Comparable>)Class3892.field17564, class1858.getOpposite());
    }
    
    public boolean method13452(final Class1851 class1851, final Class6997 class1852, final Random random, final BlockPos class1853, final Class1932 class1854, Class7096 method13451) {
        if (class1852.method21415(class1853) && class1851.method6701(class1853).method21696() != Class7521.field29292) {
            if (method13451 == null) {
                method13451 = method13451(class1851, class1853, Class7521.field29292.method11878());
            }
            class1851.method6688(class1853, method13451, 2);
            final Class436 method13452 = class1851.method6727(class1853);
            if (method13452 instanceof Class475) {
                ((Class475)method13452).method2327(class1854, random.nextLong());
            }
            return true;
        }
        return false;
    }
    
    public boolean method13453(final Class1851 class1851, final Class6997 class1852, final Random random, final int n, final int n2, final int n3, final Direction class1853, final Class1932 class1854) {
        final BlockPos class1855 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        if (class1852.method21415(class1855) && class1851.method6701(class1855).method21696() != Class7521.field29216) {
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29216.method11878()).method21773((Class7111<Comparable>)Class3955.field17859, class1853), n, n2, n3, class1852);
            final Class436 method6727 = class1851.method6727(class1855);
            if (method6727 instanceof Class458) {
                ((Class458)method6727).method2327(class1854, random.nextLong());
            }
            return true;
        }
        return false;
    }
    
    public void method13454(final int n, final int n2, final int n3) {
        this.field19849.method21413(n, n2, n3);
    }
    
    @Nullable
    public Direction method13455() {
        return this.field19850;
    }
    
    public void method13456(final Direction field19850) {
        this.field19850 = field19850;
        if (field19850 == null) {
            this.field19852 = Class2052.field11707;
            this.field19851 = Class2181.field12917;
        }
        else {
            switch (Class8291.field34093[field19850.ordinal()]) {
                case 2: {
                    this.field19851 = Class2181.field12918;
                    this.field19852 = Class2052.field11707;
                    break;
                }
                case 3: {
                    this.field19851 = Class2181.field12918;
                    this.field19852 = Class2052.field11708;
                    break;
                }
                case 4: {
                    this.field19851 = Class2181.field12917;
                    this.field19852 = Class2052.field11708;
                    break;
                }
                default: {
                    this.field19851 = Class2181.field12917;
                    this.field19852 = Class2052.field11707;
                    break;
                }
            }
        }
    }
    
    public Class2052 method13457() {
        return this.field19852;
    }
    
    public Class9520 method13458() {
        return this.field19854;
    }
    
    static {
        field19848 = Class7521.field29764.method11878();
        field19855 = (Set)ImmutableSet.builder().add((Object)Class7521.field29395).add((Object)Class7521.field29287).add((Object)Class7521.field29288).add((Object)Class7521.field29336).add((Object)Class7521.field29619).add((Object)Class7521.field29623).add((Object)Class7521.field29622).add((Object)Class7521.field29620).add((Object)Class7521.field29621).add((Object)Class7521.field29307).add((Object)Class7521.field29381).build();
    }
}
