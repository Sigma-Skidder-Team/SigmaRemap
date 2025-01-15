// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.Iterator;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import org.apache.logging.log4j.Logger;

public class Class590<C extends Class446> implements Class587<Integer>
{
    public static final Logger field3490;
    public final Class5024 field3491;
    public Class464 field3492;
    public Class3426<C> field3493;
    
    public Class590(final Class3426<C> field3493) {
        this.field3491 = new Class5024();
        this.field3493 = field3493;
    }
    
    public void method3458(final Class513 class513, final Class3662<C> class514, final boolean b) {
        if (class514 != null) {
            if (class513.method2948().method19695(class514)) {
                this.field3492 = class513.field3006;
                if (this.method3464() || class513.method2889()) {
                    this.field3491.method15254();
                    class513.field3006.method2379(this.field3491);
                    this.field3493.method10934(this.field3491);
                    if (!this.field3491.method15249(class514, null)) {
                        this.method3459();
                        class513.field3039.method17469(new Class4257(class513.field3009.field16154, class514));
                    }
                    else {
                        this.method3461(class514, b);
                    }
                    class513.field3006.method2161();
                }
            }
        }
    }
    
    public void method3459() {
        for (int i = 0; i < this.field3493.method10938() * this.field3493.method10939() + 1; ++i) {
            if (i == this.field3493.method10937()) {
                if (this.field3493 instanceof Class3428) {
                    continue;
                }
                if (this.field3493 instanceof Class3427) {
                    continue;
                }
            }
            this.method3460(i);
        }
        this.field3493.method10935();
    }
    
    public void method3460(final int n) {
        final Class8321 method20053 = this.field3493.method10878(n).method20053();
        if (!method20053.method27620()) {
            while (method20053.method27690() > 0) {
                int n2 = this.field3492.method2360(method20053);
                if (n2 == -1) {
                    n2 = this.field3492.method2349();
                }
                final Class8321 method20054 = method20053.method27641();
                method20054.method27691(1);
                if (!this.field3492.method2363(n2, method20054)) {
                    Class590.field3490.error("Can't find any space for item in the inventory");
                }
                this.field3493.method10878(n).method20060(1);
            }
        }
    }
    
    public void method3461(final Class3662<C> class3662, final boolean b) {
        final boolean method10936 = this.field3493.method10936(class3662);
        final int method10937 = this.field3491.method15251(class3662, null);
        if (method10936) {
            for (int i = 0; i < this.field3493.method10939() * this.field3493.method10938() + 1; ++i) {
                if (i != this.field3493.method10937()) {
                    final Class8321 method10938 = this.field3493.method10878(i).method20053();
                    if (!method10938.method27620()) {
                        if (Math.min(method10937, method10938.method27628()) < method10938.method27690() + 1) {
                            return;
                        }
                    }
                }
            }
        }
        final int method10939 = this.method3462(b, method10937, method10936);
        final IntArrayList list = new IntArrayList();
        if (this.field3491.method15250(class3662, (IntList)list, method10939)) {
            int n = method10939;
            final IntListIterator iterator = ((IntList)list).iterator();
            while (((Iterator)iterator).hasNext()) {
                final int method10940 = Class5024.method15253((int)((Iterator)iterator).next()).method27628();
                if (method10940 >= n) {
                    continue;
                }
                n = method10940;
            }
            if (this.field3491.method15250(class3662, (IntList)list, n)) {
                this.method3459();
                this.method3455(this.field3493.method10938(), this.field3493.method10939(), this.field3493.method10937(), class3662, (Iterator<Integer>)((IntList)list).iterator(), n);
            }
        }
    }
    
    @Override
    public void method3440(final Iterator<Integer> iterator, final int n, final int n2, final int n3, final int n4) {
        final Class6601 method10878 = this.field3493.method10878(n);
        final Class8321 method10879 = Class5024.method15253(iterator.next());
        if (!method10879.method27620()) {
            for (int i = 0; i < n2; ++i) {
                this.method3463(method10878, method10879);
            }
        }
    }
    
    public int method3462(final boolean b, final int n, final boolean b2) {
        int method27690 = 1;
        if (!b) {
            if (b2) {
                method27690 = 64;
                for (int i = 0; i < this.field3493.method10938() * this.field3493.method10939() + 1; ++i) {
                    if (i != this.field3493.method10937()) {
                        final Class8321 method27691 = this.field3493.method10878(i).method20053();
                        if (!method27691.method27620()) {
                            if (method27690 > method27691.method27690()) {
                                method27690 = method27691.method27690();
                            }
                        }
                    }
                }
                if (method27690 < 64) {
                    ++method27690;
                }
            }
        }
        else {
            method27690 = n;
        }
        return method27690;
    }
    
    public void method3463(final Class6601 class6601, final Class8321 class6602) {
        final int method2354 = this.field3492.method2354(class6602);
        if (method2354 != -1) {
            final Class8321 method2355 = this.field3492.method2157(method2354).method27641();
            if (!method2355.method27620()) {
                if (method2355.method27690() <= 1) {
                    this.field3492.method2159(method2354);
                }
                else {
                    this.field3492.method2158(method2354, 1);
                }
                method2355.method27691(1);
                if (!class6601.method20053().method27620()) {
                    class6601.method20053().method27692(1);
                }
                else {
                    class6601.method20055(method2355);
                }
            }
        }
    }
    
    private boolean method3464() {
        final ArrayList arrayList = Lists.newArrayList();
        final int method3465 = this.method3465();
        for (int i = 0; i < this.field3493.method10938() * this.field3493.method10939() + 1; ++i) {
            if (i != this.field3493.method10937()) {
                final Class8321 method3466 = this.field3493.method10878(i).method20053().method27641();
                if (!method3466.method27620()) {
                    final int method3467 = this.field3492.method2360(method3466);
                    if (method3467 == -1 && arrayList.size() <= method3465) {
                        for (final Class8321 class8321 : arrayList) {
                            if (!class8321.method27647(method3466)) {
                                continue;
                            }
                            if (class8321.method27690() == class8321.method27628()) {
                                continue;
                            }
                            if (class8321.method27690() + method3466.method27690() > class8321.method27628()) {
                                continue;
                            }
                            class8321.method27692(method3466.method27690());
                            method3466.method27691(0);
                            break;
                        }
                        if (!method3466.method27620()) {
                            if (arrayList.size() >= method3465) {
                                return false;
                            }
                            arrayList.add(method3466);
                        }
                    }
                    else if (method3467 == -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private int method3465() {
        int n = 0;
        final Iterator<Object> iterator = this.field3492.field2739.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method27620()) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    static {
        field3490 = LogManager.getLogger();
    }
}
