// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunk;

import java.util.Map;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.ListIterator;
import java.util.BitSet;

public abstract class Class6346<C extends Class7065>
{
    public final Class1851 field25383;
    public final long field25384;
    public final Class1868 field25385;
    public final C field25386;
    
    public Class6346(final Class1851 field25383, final Class1868 field25384, final C field25385) {
        this.field25383 = field25383;
        this.field25384 = field25383.method6753();
        this.field25385 = field25384;
        this.field25386 = field25385;
    }
    
    public void method18871(final IChunk class1860) {
        ((Class1865)class1860).method7097(new Class1873(class1860.method7019(), this.field25385));
    }
    
    public Class3090 method18872(final BiomeManager class5507, final BlockPos class5508) {
        return class5507.method16810(class5508);
    }
    
    public void method18873(final BiomeManager class5507, final IChunk class5508, final Class2126 class5509) {
        final Class2317 class5510 = new Class2317();
        final ChunkPos method7019 = class5508.method7019();
        final int field32290 = method7019.field32290;
        final int field32291 = method7019.field32291;
        final Class3090 method7020 = this.method18872(class5507, method7019.method25435());
        final BitSet method7021 = class5508.method7038(class5509);
        for (int i = field32290 - 8; i <= field32290 + 8; ++i) {
            for (int j = field32291 - 8; j <= field32291 + 8; ++j) {
                final ListIterator<Class8312<?>> listIterator = method7020.method9851(class5509).listIterator();
                while (listIterator.hasNext()) {
                    final int nextIndex = listIterator.nextIndex();
                    final Class8312 class5511 = listIterator.next();
                    class5510.method9440(this.field25384 + nextIndex, i, j);
                    if (!class5511.method27600(class5510, i, j)) {
                        continue;
                    }
                    class5511.method27601(class5508, class5513 -> this.method18872(class5512, class5513), class5510, this.method18853(), i, j, field32290, field32291, method7021);
                }
            }
        }
    }
    
    @Nullable
    public BlockPos method18874(final World class1847, final String s, final BlockPos class1848, final int n, final boolean b) {
        final Class4574 class1849 = Class4535.field20023.get(s.toLowerCase(Locale.ROOT));
        return (class1849 == null) ? null : class1849.method13591(class1847, this, class1848, n, b);
    }
    
    public void method18875(final Class1878 class1878) {
        final int method7150 = class1878.method7150();
        final int method7151 = class1878.method7151();
        final int n = method7150 * 16;
        final int n2 = method7151 * 16;
        final BlockPos class1879 = new BlockPos(n, 0, n2);
        final Class3090 method7152 = this.method18872(class1878.method6797(), class1879.add(8, 8, 8));
        final Class2317 class1880 = new Class2317();
        final long method7153 = class1880.method9438(class1878.method6753(), n, n2);
        for (final Class2108 class1881 : Class2108.values()) {
            try {
                method7152.method9857(class1881, this, class1878, method7153, class1880, class1879);
            }
            catch (final Exception ex) {
                final CrashReport method7154 = CrashReport.makeCrashReport(ex, "Biome decoration");
                method7154.makeCategory("Generation").addDetail("CenterX", method7150).addDetail("CenterZ", method7151).addDetail("Step", class1881).addDetail("Seed", method7153).addDetail("Biome", Registry.field217.getKey(method7152));
                throw new ReportedException(method7154);
            }
        }
    }
    
    public abstract void method18859(final Class1878 p0, final IChunk p1);
    
    public void method18868(final Class1878 class1878) {
    }
    
    public C method18876() {
        return this.field25386;
    }
    
    public abstract int method18852();
    
    public void method18870(final Class1849 class1849, final boolean b, final boolean b2) {
    }
    
    public boolean method18877(final Class3090 class3090, final Class4574<? extends Class5113> class3091) {
        return class3090.method9853(class3091);
    }
    
    @Nullable
    public <C extends Class5113> C method18878(final Class3090 class3090, final Class4574<C> class3091) {
        return class3090.method9854(class3091);
    }
    
    public Class1868 method18879() {
        return this.field25385;
    }
    
    public long method18880() {
        return this.field25384;
    }
    
    public int method18867() {
        return 256;
    }
    
    public List<Class6828> method18866(final Class1976 class1976, final BlockPos class1977) {
        return this.field25383.method6959(class1977).method9840(class1976);
    }
    
    public void method18881(final BiomeManager class5507, final IChunk class5508, final Class6346<?> class5509, final Class1795 class5510) {
        for (final Class4574 class5511 : Class4535.field20023.values()) {
            if (!class5509.method18879().method7121(class5511)) {
                continue;
            }
            final Class5936 method7045 = class5508.method7045(class5511.method13596());
            final int n = (method7045 == null) ? 0 : method7045.method17864();
            final Class2317 class5512 = new Class2317();
            final ChunkPos method7046 = class5508.method7019();
            Class5936 field24429 = Class5936.field24429;
            final Class3090 method7047 = class5507.method16810(new BlockPos(method7046.method25426() + 9, 0, method7046.method25427() + 9));
            if (class5511.method13594(class5507, class5509, class5512, method7046.field32290, method7046.field32291, method7047)) {
                final Class5936 method7048 = class5511.method13595().method19048(class5511, method7046.field32290, method7046.field32291, MutableBoundingBox.getNewBoundingBox(), n, class5509.method18880());
                method7048.method17850(this, class5510, method7046.field32290, method7046.field32291, method7047);
                field24429 = (method7048.method17858() ? method7048 : Class5936.field24429);
            }
            class5508.method7046(class5511.method13596(), field24429);
        }
    }
    
    public void method18882(final Class1851 class1851, final IChunk class1852) {
        final int field32290 = class1852.method7019().field32290;
        final int field32291 = class1852.method7019().field32291;
        final int n = field32290 << 4;
        final int n2 = field32291 << 4;
        for (int i = field32290 - 8; i <= field32290 + 8; ++i) {
            for (int j = field32291 - 8; j <= field32291 + 8; ++j) {
                final long method25423 = ChunkPos.method25423(i, j);
                for (final Map.Entry<K, Class5936> entry : class1851.method6798(i, j).method7021().entrySet()) {
                    final Class5936 class1853 = entry.getValue();
                    if (class1853 == Class5936.field24429) {
                        continue;
                    }
                    if (!class1853.method17851().intersectsWith(n, n2, n + 15, n2 + 15)) {
                        continue;
                    }
                    class1852.method7048((String)entry.getKey(), method25423);
                    Class9324.method34537(class1851, class1853);
                }
            }
        }
    }
    
    public abstract void method18861(final Class1851 p0, final IChunk p1);
    
    public int method18853() {
        return 63;
    }
    
    public abstract int method18857(final int p0, final int p1, final HeightmapType p2);
    
    public int method18883(final int n, final int n2, final HeightmapType class2020) {
        return this.method18857(n, n2, class2020);
    }
    
    public int method18884(final int n, final int n2, final HeightmapType class2020) {
        return this.method18857(n, n2, class2020) - 1;
    }
}
