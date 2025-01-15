// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4482 extends Class4479
{
    private final List<Class6997> field19875;
    
    public Class4482(final int n, final Random random, final int n2, final int n3, final Class1964 field19869) {
        super(Class9520.field40945, n, field19869);
        this.field19875 = Lists.newLinkedList();
        this.field19869 = field19869;
        this.field19849 = new Class6997(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }
    
    public Class4482(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40945, class1796);
        this.field19875 = Lists.newLinkedList();
        final Class52 method328 = class1796.method328("Entrances", 11);
        for (int i = 0; i < method328.size(); ++i) {
            this.field19875.add(new Class6997(method328.method350(i)));
        }
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        int n = this.field19849.method21418() - 3 - 1;
        if (n <= 0) {
            n = 1;
        }
        int n2;
        for (int i = 0; i < this.field19849.method21417(); i = n2 + 4) {
            n2 = i + random.nextInt(this.field19849.method21417());
            if (n2 + 3 > this.field19849.method21417()) {
                break;
            }
            final Class4479 method13434 = Class9191.method33629(class4473, list, random, this.field19849.field27293 + n2, this.field19849.field27294 + random.nextInt(n) + 1, this.field19849.field27295 - 1, Direction.NORTH, method13433);
            if (method13434 != null) {
                final Class6997 method13435 = method13434.method13432();
                this.field19875.add(new Class6997(method13435.field27293, method13435.field27294, this.field19849.field27295, method13435.field27296, method13435.field27297, this.field19849.field27295 + 1));
            }
        }
        int n3;
        for (int j = 0; j < this.field19849.method21417(); j = n3 + 4) {
            n3 = j + random.nextInt(this.field19849.method21417());
            if (n3 + 3 > this.field19849.method21417()) {
                break;
            }
            final Class4479 method13436 = Class9191.method33629(class4473, list, random, this.field19849.field27293 + n3, this.field19849.field27294 + random.nextInt(n) + 1, this.field19849.field27298 + 1, Direction.SOUTH, method13433);
            if (method13436 != null) {
                final Class6997 method13437 = method13436.method13432();
                this.field19875.add(new Class6997(method13437.field27293, method13437.field27294, this.field19849.field27298 - 1, method13437.field27296, method13437.field27297, this.field19849.field27298));
            }
        }
        int n4;
        for (int k = 0; k < this.field19849.method21419(); k = n4 + 4) {
            n4 = k + random.nextInt(this.field19849.method21419());
            if (n4 + 3 > this.field19849.method21419()) {
                break;
            }
            final Class4479 method13438 = Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294 + random.nextInt(n) + 1, this.field19849.field27295 + n4, Direction.WEST, method13433);
            if (method13438 != null) {
                final Class6997 method13439 = method13438.method13432();
                this.field19875.add(new Class6997(this.field19849.field27293, method13439.field27294, method13439.field27295, this.field19849.field27293 + 1, method13439.field27297, method13439.field27298));
            }
        }
        int n5;
        for (int l = 0; l < this.field19849.method21419(); l = n5 + 4) {
            n5 = l + random.nextInt(this.field19849.method21419());
            if (n5 + 3 > this.field19849.method21419()) {
                break;
            }
            final Class4479 method13440 = Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294 + random.nextInt(n) + 1, this.field19849.field27295 + n5, Direction.EAST, method13433);
            if (method13440 != null) {
                final Class6997 method13441 = method13440.method13432();
                this.field19875.add(new Class6997(this.field19849.field27296 - 1, method13441.field27294, method13441.field27295, this.field19849.field27296, method13441.field27297, method13441.field27298));
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (!this.method13436(class1851, class1853)) {
            this.method13444(class1851, class1853, this.field19849.field27293, this.field19849.field27294, this.field19849.field27295, this.field19849.field27296, this.field19849.field27294, this.field19849.field27298, Class7521.field29156.method11878(), Class4482.field19848, true);
            this.method13444(class1851, class1853, this.field19849.field27293, this.field19849.field27294 + 1, this.field19849.field27295, this.field19849.field27296, Math.min(this.field19849.field27294 + 3, this.field19849.field27297), this.field19849.field27298, Class4482.field19848, Class4482.field19848, false);
            for (final Class6997 class1855 : this.field19875) {
                this.method13444(class1851, class1853, class1855.field27293, class1855.field27297 - 2, class1855.field27295, class1855.field27296, class1855.field27297, class1855.field27298, Class4482.field19848, Class4482.field19848, false);
            }
            this.method13448(class1851, class1853, this.field19849.field27293, this.field19849.field27294 + 4, this.field19849.field27295, this.field19849.field27296, this.field19849.field27297, this.field19849.field27298, Class4482.field19848, false);
            return true;
        }
        return false;
    }
    
    @Override
    public void method13454(final int n, final int n2, final int n3) {
        super.method13454(n, n2, n3);
        final Iterator<Class6997> iterator = this.field19875.iterator();
        while (iterator.hasNext()) {
            iterator.next().method21413(n, n2, n3);
        }
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        final Class52 class52 = new Class52();
        final Iterator<Class6997> iterator = this.field19875.iterator();
        while (iterator.hasNext()) {
            ((AbstractList<Class53>)class52).add(iterator.next().method21421());
        }
        class51.method295("Entrances", class52);
    }
}
