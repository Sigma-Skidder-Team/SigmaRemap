// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.chunk.IChunk;

import java.util.Set;
import java.util.function.Predicate;

public class Class9548
{
    private static String[] field41113;
    private static final Predicate<BlockState> field41114;
    private static final Predicate<BlockState> field41115;
    private final Class9217 field41116;
    private final Predicate<BlockState> field41117;
    private final IChunk field41118;
    
    public Class9548(final IChunk field41118, final HeightmapType class2020) {
        this.field41116 = new Class9217(9, 256);
        this.field41117 = class2020.method8064();
        this.field41118 = field41118;
    }
    
    public static void method35711(final IChunk class1860, final Set<HeightmapType> set) {
        final int size = set.size();
        final ObjectArrayList list = new ObjectArrayList(size);
        final ObjectListIterator iterator = ((ObjectList)list).iterator();
        final int n = class1860.method7012() + 16;
        try (final Class386 method1296 = Class386.method1296()) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    final Iterator iterator2 = set.iterator();
                    while (iterator2.hasNext()) {
                        ((ObjectList)list).add((Object)class1860.method7017((HeightmapType)iterator2.next()));
                    }
                    for (int k = n - 1; k >= 0; --k) {
                        method1296.method1300(i, k, j);
                        final BlockState method1297 = class1860.getBlockState(method1296);
                        if (method1297.getBlock() != Blocks.AIR) {
                            while (iterator.hasNext()) {
                                final Class9548 class1861 = (Class9548)iterator.next();
                                if (class1861.field41117.test(method1297)) {
                                    class1861.method35715(i, j, k + 1);
                                    iterator.remove();
                                }
                            }
                            if (((ObjectList)list).isEmpty()) {
                                break;
                            }
                            iterator.back(size);
                        }
                    }
                }
            }
        }
    }
    
    public boolean method35712(final int n, final int n2, final int n3, final BlockState class7096) {
        final int method35713 = this.method35713(n, n3);
        if (n2 > method35713 - 2) {
            if (!this.field41117.test(class7096)) {
                if (method35713 - 1 == n2) {
                    final Mutable class7097 = new Mutable();
                    for (int i = n2 - 1; i >= 0; --i) {
                        class7097.setPos(n, i, n3);
                        if (this.field41117.test(this.field41118.getBlockState(class7097))) {
                            this.method35715(n, n3, i + 1);
                            return true;
                        }
                    }
                    this.method35715(n, n3, 0);
                    return true;
                }
            }
            else if (n2 >= method35713) {
                this.method35715(n, n3, n2 + 1);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public int method35713(final int n, final int n2) {
        return this.method35714(method35718(n, n2));
    }
    
    private int method35714(final int n) {
        return this.field41116.method33927(n);
    }
    
    private void method35715(final int n, final int n2, final int n3) {
        this.field41116.method33926(method35718(n, n2), n3);
    }
    
    public void method35716(final long[] array) {
        System.arraycopy(array, 0, this.field41116.method33928(), 0, array.length);
    }
    
    public long[] method35717() {
        return this.field41116.method33928();
    }
    
    private static int method35718(final int n, final int n2) {
        return n + n2 * 16;
    }
    
    static {
        field41114 = (class7096 -> !class7096.method21706());
        field41115 = (class7097 -> class7097.getMaterial().method26440());
    }
}
