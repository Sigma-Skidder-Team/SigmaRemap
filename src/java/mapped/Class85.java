// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;

public final class Class85 implements Class83
{
    private static String[] field192;
    private final DoubleArrayList field193;
    private final IntArrayList field194;
    private final IntArrayList field195;
    
    public Class85(final DoubleList list, final DoubleList list2, final boolean b, final boolean b2) {
        int n = 0;
        int n2 = 0;
        double n3 = Double.NaN;
        final int size = list.size();
        final int size2 = list2.size();
        final int n4 = size + size2;
        this.field193 = new DoubleArrayList(n4);
        this.field194 = new IntArrayList(n4);
        this.field195 = new IntArrayList(n4);
        while (true) {
            final boolean b3 = n < size;
            final boolean b4 = n2 < size2;
            if (!b3 && !b4) {
                break;
            }
            final boolean b5 = b3 && (!b4 || list.getDouble(n) < list2.getDouble(n2) + 1.0E-7);
            final double n5 = b5 ? list.getDouble(n++) : list2.getDouble(n2++);
            if (n == 0 || !b3) {
                if (!b5) {
                    if (!b2) {
                        continue;
                    }
                }
            }
            if (n2 == 0 || !b4) {
                if (b5) {
                    if (!b) {
                        continue;
                    }
                }
            }
            if (n3 >= n5 - 1.0E-7) {
                if (this.field193.isEmpty()) {
                    continue;
                }
                this.field194.set(this.field194.size() - 1, n - 1);
                this.field195.set(this.field195.size() - 1, n2 - 1);
            }
            else {
                this.field194.add(n - 1);
                this.field195.add(n2 - 1);
                this.field193.add(n5);
                n3 = n5;
            }
        }
        if (this.field193.isEmpty()) {
            this.field193.add(Math.min(list.getDouble(size - 1), list2.getDouble(size2 - 1)));
        }
    }
    
    @Override
    public boolean method445(final Class9015 class9015) {
        for (int i = 0; i < this.field193.size() - 1; ++i) {
            if (!class9015.method32279(this.field194.getInt(i), this.field195.getInt(i), i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public DoubleList method447() {
        return (DoubleList)this.field193;
    }
}
