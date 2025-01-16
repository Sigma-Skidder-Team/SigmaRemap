// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

public class Class5942 extends Class5936
{
    private static String[] field24441;
    
    public Class5942(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        final Class2052 class6349 = Class2052.values()[this.field24436.nextInt(Class2052.values().length)];
        int n3 = 5;
        int n4 = 5;
        if (class6349 != Class2052.field11708) {
            if (class6349 != Class2052.field11709) {
                if (class6349 == Class2052.field11710) {
                    n4 = -5;
                }
            }
            else {
                n3 = -5;
                n4 = -5;
            }
        }
        else {
            n3 = -5;
        }
        final int n5 = (n << 4) + 7;
        final int n6 = (n2 << 4) + 7;
        final int min = Math.min(Math.min(class6346.method18884(n5, n6, HeightmapType.field11521), class6346.method18884(n5, n6 + n4, HeightmapType.field11521)), Math.min(class6346.method18884(n5 + n3, n6, HeightmapType.field11521), class6346.method18884(n5 + n3, n6 + n4, HeightmapType.field11521)));
        if (min >= 60) {
            final BlockPos class6350 = new BlockPos(n * 16 + 8, min + 1, n2 * 16 + 8);
            final LinkedList linkedList = Lists.newLinkedList();
            Class6913.method21281(class6347, class6350, class6349, linkedList, this.field24436);
            this.field24431.addAll(linkedList);
            this.method17854();
        }
    }
    
    @Override
    public void method17853(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        super.method17853(class1851, class1852, random, class1853, class1854);
        final int field27294 = this.field24432.minY;
        for (int i = class1853.minX; i <= class1853.maxX; ++i) {
            for (int j = class1853.minZ; j <= class1853.maxZ; ++j) {
                final BlockPos class1855 = new BlockPos(i, field27294, j);
                if (!class1851.method6961(class1855)) {
                    if (this.field24432.isVecInside(class1855)) {
                        int n = 0;
                        final Iterator<Class4473> iterator = this.field24431.iterator();
                        while (iterator.hasNext()) {
                            if (!iterator.next().method13432().isVecInside(class1855)) {
                                continue;
                            }
                            n = 1;
                            break;
                        }
                        if (n != 0) {
                            for (int k = field27294 - 1; k > 1; --k) {
                                final BlockPos class1856 = new BlockPos(i, k, j);
                                if (!class1851.method6961(class1856) && !class1851.getBlockState(class1856).getMaterial().method26438()) {
                                    break;
                                }
                                class1851.setBlockState(class1856, Blocks.COBBLESTONE.getDefaultState(), 2);
                            }
                        }
                    }
                }
            }
        }
    }
}
