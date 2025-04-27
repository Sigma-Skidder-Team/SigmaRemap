// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.IChunk;

import java.util.Iterator;
import java.util.Random;

public abstract class Class6343<T extends Class7065> extends Class6346<T>
{
    private static final float[] field25359;
    private static final BlockState field25360;
    private final int field25361;
    private final int field25362;
    private final int field25363;
    private final int field25364;
    private final int field25365;
    public final Class2317 field25366;
    private final Class8577 field25367;
    private final Class8577 field25368;
    private final Class8577 field25369;
    private final Class8576 field25370;
    public final BlockState field25371;
    public final BlockState field25372;
    
    public Class6343(final Class1851 class1851, final Class1868 class1852, final int field25362, final int field25363, final int n, final T t, final boolean b) {
        super(class1851, class1852, t);
        this.field25361 = field25363;
        this.field25362 = field25362;
        this.field25371 = t.method21582();
        this.field25372 = t.method21583();
        this.field25363 = 16 / this.field25362;
        this.field25364 = n / this.field25361;
        this.field25365 = 16 / this.field25362;
        this.field25366 = new Class2317(this.field25384);
        this.field25367 = new Class8577(this.field25366, 15, 0);
        this.field25368 = new Class8577(this.field25366, 15, 0);
        this.field25369 = new Class8577(this.field25366, 7, 0);
        this.field25370 = (b ? new Class8575(this.field25366, 3, 0) : new Class8577(this.field25366, 3, 0));
    }
    
    private double method18854(final int n, final int n2, final int n3, final double n4, final double n5, final double n6, final double n7) {
        double n8 = 0.0;
        double n9 = 0.0;
        double n10 = 0.0;
        double n11 = 1.0;
        for (int i = 0; i < 16; ++i) {
            final double method29032 = Class8577.method29032(n * n4 * n11);
            final double method29033 = Class8577.method29032(n2 * n5 * n11);
            final double method29034 = Class8577.method29032(n3 * n4 * n11);
            final double n12 = n5 * n11;
            final Class8488 method29035 = this.field25367.method29031(i);
            if (method29035 != null) {
                n8 += method29035.method28343(method29032, method29033, method29034, n12, n2 * n12) / n11;
            }
            final Class8488 method29036 = this.field25368.method29031(i);
            if (method29036 != null) {
                n9 += method29036.method28343(method29032, method29033, method29034, n12, n2 * n12) / n11;
            }
            if (i < 8) {
                final Class8488 method29037 = this.field25369.method29031(i);
                if (method29037 != null) {
                    n10 += method29037.method28343(Class8577.method29032(n * n6 * n11), Class8577.method29032(n2 * n7 * n11), Class8577.method29032(n3 * n6 * n11), n7 * n11, n2 * n7 * n11) / n11;
                }
            }
            n11 /= 2.0;
        }
        return MathHelper.method35655(n8 / 512.0, n9 / 512.0, (n10 / 10.0 + 1.0) / 2.0);
    }
    
    public double[] method18855(final int n, final int n2) {
        final double[] array = new double[this.field25364 + 1];
        this.method18847(array, n, n2);
        return array;
    }
    
    public void method18856(final double[] array, final int n, final int n2, final double n3, final double n4, final double n5, final double n6, final int n7, final int n8) {
        final double[] method18848 = this.method18848(n, n2);
        final double n9 = method18848[0];
        final double n10 = method18848[1];
        final double method18849 = this.method18850();
        final double method18850 = this.method18851();
        for (int i = 0; i < this.method18858(); ++i) {
            double n11 = this.method18854(n, i, n2, n3, n4, n5, n6) - this.method18849(n9, n10, i);
            if (i <= method18849) {
                if (i < method18850) {
                    n11 = MathHelper.method35655(n11, -30.0, (method18850 - i) / (method18850 - 1.0));
                }
            }
            else {
                n11 = MathHelper.method35655(n11, n8, (i - method18849) / n7);
            }
            array[i] = n11;
        }
    }
    
    public abstract double[] method18848(final int p0, final int p1);
    
    public abstract double method18849(final double p0, final double p1, final int p2);
    
    public double method18850() {
        return this.method18858() - 4;
    }
    
    public double method18851() {
        return 0.0;
    }
    
    @Override
    public int method18857(final int n, final int n2, final HeightmapType class2020) {
        final int floorDiv = Math.floorDiv(n, this.field25362);
        final int floorDiv2 = Math.floorDiv(n2, this.field25362);
        final int floorMod = Math.floorMod(n, this.field25362);
        final int floorMod2 = Math.floorMod(n2, this.field25362);
        final double n3 = floorMod / (double)this.field25362;
        final double n4 = floorMod2 / (double)this.field25362;
        final double[][] array = { this.method18855(floorDiv, floorDiv2), this.method18855(floorDiv, floorDiv2 + 1), this.method18855(floorDiv + 1, floorDiv2), this.method18855(floorDiv + 1, floorDiv2 + 1) };
        final int method18853 = this.method18853();
        for (int i = this.field25364 - 1; i >= 0; --i) {
            final double n5 = array[0][i];
            final double n6 = array[1][i];
            final double n7 = array[2][i];
            final double n8 = array[3][i];
            final double n9 = array[0][i + 1];
            final double n10 = array[1][i + 1];
            final double n11 = array[2][i + 1];
            final double n12 = array[3][i + 1];
            for (int j = this.field25361 - 1; j >= 0; --j) {
                final double method18854 = MathHelper.method35703(j / (double)this.field25361, n3, n4, n5, n9, n7, n11, n6, n10, n8, n12);
                final int n13 = i * this.field25361 + j;
                if (method18854 > 0.0 || n13 < method18853) {
                    BlockState class2021;
                    if (method18854 <= 0.0) {
                        class2021 = this.field25372;
                    }
                    else {
                        class2021 = this.field25371;
                    }
                    if (class2020.method8064().test(class2021)) {
                        return n13 + 1;
                    }
                }
            }
        }
        return 0;
    }
    
    public abstract void method18847(final double[] p0, final int p1, final int p2);
    
    public int method18858() {
        return this.field25364 + 1;
    }
    
    @Override
    public void method18859(final Class1878 class1878, final IChunk class1879) {
        final ChunkPos method7019 = class1879.method7019();
        final int field32290 = method7019.field32290;
        final int field32291 = method7019.field32291;
        final Class2317 class1880 = new Class2317();
        class1880.method9437(field32290, field32291);
        final ChunkPos method7020 = class1879.method7019();
        final int method7021 = method7020.method25426();
        final int method7022 = method7020.method25427();
        final Mutable class1881 = new Mutable();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = method7021 + i;
                final int n2 = method7022 + j;
                final int n3 = class1879.method7018(HeightmapType.field11521, i, j) + 1;
                class1878.method6959(class1881.setPos(method7021 + i, n3, method7022 + j)).method9860(class1880, class1879, n, n2, n3, this.field25370.method29028(n * 0.0625, n2 * 0.0625, 0.0625, i * 0.0625) * 15.0, this.method18876().method21582(), this.method18876().method21583(), this.method18853(), this.field25383.method6753());
            }
        }
        this.method18860(class1879, class1880);
    }
    
    public void method18860(final IChunk class1860, final Random random) {
        final Mutable class1861 = new Mutable();
        final int method25426 = class1860.method7019().method25426();
        final int method25427 = class1860.method7019().method25427();
        final Class7065 method25428 = this.method18876();
        final int method25429 = method25428.method21563();
        final int method25430 = method25428.method21564();
        for (final BlockPos class1862 : BlockPos.getAllInBoxMutable(method25426, 0, method25427, method25426 + 15, 0, method25427 + 15)) {
            if (method25430 > 0) {
                for (int i = method25430; i >= method25430 - 4; --i) {
                    if (i >= method25430 - random.nextInt(5)) {
                        class1860.method7008(class1861.setPos(class1862.getX(), i, class1862.getZ()), Blocks.field29172.getDefaultState(), false);
                    }
                }
            }
            if (method25429 >= 256) {
                continue;
            }
            for (int j = method25429 + 4; j >= method25429; --j) {
                if (j <= method25429 + random.nextInt(5)) {
                    class1860.method7008(class1861.setPos(class1862.getX(), j, class1862.getZ()), Blocks.field29172.getDefaultState(), false);
                }
            }
        }
    }
    
    @Override
    public void method18861(final Class1851 class1851, final IChunk class1852) {
        final int method18853 = this.method18853();
        final ObjectArrayList list = new ObjectArrayList(10);
        final ObjectArrayList list2 = new ObjectArrayList(32);
        final ChunkPos method18854 = class1852.method7019();
        final int field32290 = method18854.field32290;
        final int field32291 = method18854.field32291;
        final int n = field32290 << 4;
        final int n2 = field32291 << 4;
        final Iterator<Class4574<?>> iterator = Class4535.field20024.iterator();
        while (iterator.hasNext()) {
            final String method18855 = iterator.next().method13596();
            final LongIterator iterator2 = class1852.method7047(method18855).iterator();
            while (iterator2.hasNext()) {
                final ChunkPos class1853 = new ChunkPos(iterator2.nextLong());
                final Class5936 method18856 = class1851.method6798(class1853.field32290, class1853.field32291).method7045(method18855);
                if (method18856 == null) {
                    continue;
                }
                if (!method18856.method17858()) {
                    continue;
                }
                for (final Class4473 class1854 : method18856.method17852()) {
                    if (!class1854.method13434(method18854, 12)) {
                        continue;
                    }
                    if (!(class1854 instanceof Class4521)) {
                        continue;
                    }
                    final Class4521 class1855 = (Class4521)class1854;
                    if (class1855.method13518().method27263() == Class261.field1247) {
                        list.add(class1855);
                    }
                    for (final Class9330 class1856 : class1855.method13522()) {
                        final int method18857 = class1856.method34564();
                        final int method18858 = class1856.method34566();
                        if (method18857 <= n - 12) {
                            continue;
                        }
                        if (method18858 <= n2 - 12) {
                            continue;
                        }
                        if (method18857 >= n + 15 + 12) {
                            continue;
                        }
                        if (method18858 >= n2 + 15 + 12) {
                            continue;
                        }
                        list2.add(class1856);
                    }
                }
            }
        }
        final double[][][] array = new double[2][this.field25365 + 1][this.field25364 + 1];
        for (int i = 0; i < this.field25365 + 1; ++i) {
            this.method18847(array[0][i] = new double[this.field25364 + 1], field32290 * this.field25363, field32291 * this.field25365 + i);
            array[1][i] = new double[this.field25364 + 1];
        }
        final Class1865 class1857 = (Class1865)class1852;
        final Class9548 method18859 = class1857.method7017(HeightmapType.field11523);
        final Class9548 method18860 = class1857.method7017(HeightmapType.field11521);
        final Mutable class1858 = new Mutable();
        final ObjectListIterator iterator5 = list.iterator();
        final ObjectListIterator iterator6 = list2.iterator();
        for (int j = 0; j < this.field25363; ++j) {
            for (int k = 0; k < this.field25365 + 1; ++k) {
                this.method18847(array[1][k], field32290 * this.field25363 + j + 1, field32291 * this.field25365 + k);
            }
            for (int l = 0; l < this.field25365; ++l) {
                Class8199 class1859 = class1857.method7093(15);
                class1859.method27150();
                for (int n3 = this.field25364 - 1; n3 >= 0; --n3) {
                    final double n4 = array[0][l][n3];
                    final double n5 = array[0][l + 1][n3];
                    final double n6 = array[1][l][n3];
                    final double n7 = array[1][l + 1][n3];
                    final double n8 = array[0][l][n3 + 1];
                    final double n9 = array[0][l + 1][n3 + 1];
                    final double n10 = array[1][l][n3 + 1];
                    final double n11 = array[1][l + 1][n3 + 1];
                    for (int n12 = this.field25361 - 1; n12 >= 0; --n12) {
                        final int n13 = n3 * this.field25361 + n12;
                        final int n14 = n13 & 0xF;
                        final int n15 = n13 >> 4;
                        if (class1859.method27159() >> 4 != n15) {
                            class1859.method27151();
                            class1859 = class1857.method7093(n15);
                            class1859.method27150();
                        }
                        final double n16 = n12 / (double)this.field25361;
                        final double method18861 = MathHelper.lerp(n16, n4, n8);
                        final double method18862 = MathHelper.lerp(n16, n6, n10);
                        final double method18863 = MathHelper.lerp(n16, n5, n9);
                        final double method18864 = MathHelper.lerp(n16, n7, n11);
                        for (int n17 = 0; n17 < this.field25362; ++n17) {
                            final int n18 = n + j * this.field25362 + n17;
                            final int n19 = n18 & 0xF;
                            final double n20 = n17 / (double)this.field25362;
                            final double method18865 = MathHelper.lerp(n20, method18861, method18862);
                            final double method18866 = MathHelper.lerp(n20, method18863, method18864);
                            for (int n21 = 0; n21 < this.field25362; ++n21) {
                                final int n22 = n2 + l * this.field25362 + n21;
                                final int n23 = n22 & 0xF;
                                final double method18867 = MathHelper.clamp(MathHelper.lerp(n21 / (double)this.field25362, method18865, method18866) / 200.0, -1.0, 1.0);
                                double n24 = method18867 / 2.0 - method18867 * method18867 * method18867 / 24.0;
                                while (iterator5.hasNext()) {
                                    final Class4521 class1860 = (Class4521)iterator5.next();
                                    final MutableBoundingBox method18868 = class1860.method13432();
                                    n24 += method18862(Math.max(0, Math.max(method18868.minX - n18, n18 - method18868.maxX)), n13 - (method18868.minY + class1860.method13520()), Math.max(0, Math.max(method18868.minZ - n22, n22 - method18868.maxZ))) * 0.8;
                                }
                                iterator5.back(list.size());
                                while (iterator6.hasNext()) {
                                    final Class9330 class1861 = (Class9330)iterator6.next();
                                    n24 += method18862(n18 - class1861.method34564(), n13 - class1861.method34565(), n22 - class1861.method34566()) * 0.4;
                                }
                                iterator6.back(list2.size());
                                BlockState class1862;
                                if (n24 <= 0.0) {
                                    if (n13 >= method18853) {
                                        class1862 = Class6343.field25360;
                                    }
                                    else {
                                        class1862 = this.field25372;
                                    }
                                }
                                else {
                                    class1862 = this.field25371;
                                }
                                if (class1862 != Class6343.field25360) {
                                    if (class1862.getLightValue() != 0) {
                                        class1858.setPos(n18, n13, n22);
                                        class1857.method7092(class1858);
                                    }
                                    class1859.method27153(n19, n14, n23, class1862, false);
                                    method18859.method35712(n19, n13, n23, class1862);
                                    method18860.method35712(n19, n13, n23, class1862);
                                }
                            }
                        }
                    }
                }
                class1859.method27151();
            }
            final double[][] array2 = array[0];
            array[0] = array[1];
            array[1] = array2;
        }
    }
    
    private static double method18862(final int n, final int n2, final int n3) {
        final int n4 = n + 12;
        final int n5 = n2 + 12;
        final int n6 = n3 + 12;
        if (n4 < 0 || n4 >= 24) {
            return 0.0;
        }
        if (n5 >= 0 && n5 < 24) {
            return (n6 >= 0 && n6 < 24) ? Class6343.field25359[n6 * 24 * 24 + n4 * 24 + n5] : 0.0;
        }
        return 0.0;
    }
    
    private static double method18863(final int n, final int n2, final int n3) {
        final double n4 = n * n + n3 * n3;
        final double n5 = n2 + 0.5;
        final double n6 = n5 * n5;
        return -n5 * MathHelper.method35695(n6 / 2.0 + n4 / 2.0) / 2.0 * Math.pow(2.718281828459045, -(n6 / 16.0 + n4 / 16.0));
    }
    
    static {
        field25359 = Util.method27851(new float[13824], array -> {
            int i = 0;
            while (i < 24) {
                int j = 0;
                while (j < 24) {
                    int k = 0;
                    while (k < 24) {
                        array[i * 24 * 24 + j * 24 + k] = (float)method18863(j - 12, k - 12, i - 12);
                        ++k;
                    }
                    ++j;
                }
                ++i;
            }
        });
        field25360 = Blocks.AIR.getDefaultState();
    }
}
