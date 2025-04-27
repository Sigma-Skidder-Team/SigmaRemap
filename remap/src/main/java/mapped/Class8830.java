// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.Iterator;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.util.NonNullList;

import java.util.BitSet;
import java.util.List;

public class Class8830
{
    private static String[] field37119;
    private final IRecipe<?> field37120;
    private final List<Ingredient> field37121;
    private final int field37122;
    private final int[] field37123;
    private final int field37124;
    private final BitSet field37125;
    private final IntList field37126;
    public final /* synthetic */ Class5024 field37127;
    
    public Class8830(final Class5024 field37127, final IRecipe<?> field37128) {
        this.field37127 = field37127;
        this.field37121 = Lists.newArrayList();
        this.field37126 = new IntArrayList();
        this.field37120 = field37128;
        this.field37121.addAll(field37128.getIngredients());
        this.field37121.removeIf(Ingredient::method616);
        this.field37122 = this.field37121.size();
        this.field37123 = this.method30824();
        this.field37124 = this.field37123.length;
        this.field37125 = new BitSet(this.field37122 + this.field37124 + this.field37122 + this.field37122 * this.field37124);
        for (int i = 0; i < this.field37121.size(); ++i) {
            final IntList method613 = this.field37121.get(i).method613();
            for (int j = 0; j < this.field37124; ++j) {
                if (method613.contains(this.field37123[j])) {
                    this.field37125.set(this.method30832(true, j, i));
                }
            }
        }
    }
    
    public boolean method30823(final int n, final IntList list) {
        if (n > 0) {
            int n2 = 0;
            while (this.method30825(n)) {
                Class5024.method15255(this.field37127, this.field37123[this.field37126.getInt(0)], n);
                final int n3 = this.field37126.size() - 1;
                this.method30827(this.field37126.getInt(n3));
                for (int i = 0; i < n3; ++i) {
                    this.method30831((i & 0x1) == 0x0, this.field37126.get(i), this.field37126.get(i + 1));
                }
                this.field37126.clear();
                this.field37125.clear(0, this.field37122 + this.field37124);
                ++n2;
            }
            final boolean b = n2 == this.field37122;
            final boolean b2 = b && list != null;
            if (b2) {
                list.clear();
            }
            this.field37125.clear(0, this.field37122 + this.field37124 + this.field37122);
            int n4 = 0;
            final NonNullList<Ingredient> method11294 = this.field37120.getIngredients();
            for (int j = 0; j < method11294.size(); ++j) {
                if (b2 && method11294.get(j).method616()) {
                    list.add(0);
                }
                else {
                    for (int k = 0; k < this.field37124; ++k) {
                        if (this.method30830(false, n4, k)) {
                            this.method30831(true, k, n4);
                            Class5024.method15256(this.field37127, this.field37123[k], n);
                            if (b2) {
                                list.add(this.field37123[k]);
                            }
                        }
                    }
                    ++n4;
                }
            }
            return b;
        }
        return true;
    }
    
    private int[] method30824() {
        final IntAVLTreeSet set = new IntAVLTreeSet();
        final Iterator<Ingredient> iterator = this.field37121.iterator();
        while (iterator.hasNext()) {
            set.addAll(iterator.next().method613());
        }
        final IntIterator iterator2 = ((IntCollection)set).iterator();
        while (iterator2.hasNext()) {
            if (Class5024.method15257(this.field37127, iterator2.nextInt())) {
                continue;
            }
            iterator2.remove();
        }
        return set.toIntArray();
    }
    
    private boolean method30825(final int n) {
        for (int field37124 = this.field37124, i = 0; i < field37124; ++i) {
            if (this.field37127.field21533.get(this.field37123[i]) >= n) {
                this.method30833(false, i);
                while (!this.field37126.isEmpty()) {
                    final int size = this.field37126.size();
                    final boolean b = (size & 0x1) == 0x1;
                    final int int1 = this.field37126.getInt(size - 1);
                    if (!b && !this.method30826(int1)) {
                        break;
                    }
                    for (int n2 = b ? this.field37122 : field37124, j = 0; j < n2; ++j) {
                        if (!this.method30834(b, j)) {
                            if (this.method30829(b, int1, j)) {
                                if (this.method30830(b, int1, j)) {
                                    this.method30833(b, j);
                                    break;
                                }
                            }
                        }
                    }
                    final int size2 = this.field37126.size();
                    if (size2 != size) {
                        continue;
                    }
                    this.field37126.removeInt(size2 - 1);
                }
                if (!this.field37126.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method30826(final int n) {
        return this.field37125.get(this.method30828(n));
    }
    
    private void method30827(final int n) {
        this.field37125.set(this.method30828(n));
    }
    
    private int method30828(final int n) {
        return this.field37122 + this.field37124 + n;
    }
    
    private boolean method30829(final boolean b, final int n, final int n2) {
        return this.field37125.get(this.method30832(b, n, n2));
    }
    
    private boolean method30830(final boolean b, final int n, final int n2) {
        return b != this.field37125.get(1 + this.method30832(b, n, n2));
    }
    
    private void method30831(final boolean b, final int n, final int n2) {
        this.field37125.flip(1 + this.method30832(b, n, n2));
    }
    
    private int method30832(final boolean b, final int n, final int n2) {
        return this.field37122 + this.field37124 + this.field37122 + 2 * (b ? (n * this.field37122 + n2) : (n2 * this.field37122 + n));
    }
    
    private void method30833(final boolean b, final int n) {
        this.field37125.set(this.method30835(b, n));
        this.field37126.add(n);
    }
    
    private boolean method30834(final boolean b, final int n) {
        return this.field37125.get(this.method30835(b, n));
    }
    
    private int method30835(final boolean b, final int n) {
        return (b ? 0 : this.field37122) + n;
    }
    
    public int method30836(final int a, final IntList list) {
        int n = 0;
        int n2 = Math.min(a, this.method30837()) + 1;
        int n3;
        while (true) {
            n3 = (n + n2) / 2;
            if (!this.method30823(n3, null)) {
                n2 = n3;
            }
            else {
                if (n2 - n <= 1) {
                    break;
                }
                n = n3;
            }
        }
        if (n3 > 0) {
            this.method30823(n3, list);
        }
        return n3;
    }
    
    private int method30837() {
        int min = Integer.MAX_VALUE;
        for (final Ingredient class120 : this.field37121) {
            int max = 0;
            final IntListIterator iterator2 = class120.method613().iterator();
            while (iterator2.hasNext()) {
                max = Math.max(max, this.field37127.field21533.get((int)((Iterator)iterator2).next()));
            }
            if (min <= 0) {
                continue;
            }
            min = Math.min(min, max);
        }
        return min;
    }
}
