// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;

import javax.annotation.Nullable;
import com.google.common.cache.LoadingCache;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3i;

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
    private Class7820 method29795(final BlockPos class354, final Direction class355, final Direction class356, final LoadingCache<BlockPos, Class7990> loadingCache) {
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
    public Class7820 method29796(final Class1852 class1852, final BlockPos class1853) {
        final LoadingCache<BlockPos, Class7990> method29797 = method29797(class1852, false);
        final int max = Math.max(Math.max(this.field36528, this.field36527), this.field36526);
        for (final BlockPos class1854 : BlockPos.getAllInBoxMutable(class1853, class1853.add(max - 1, max - 1, max - 1))) {
            for (final Direction class1855 : Direction.values()) {
                for (final Direction class1856 : Direction.values()) {
                    if (class1856 != class1855) {
                        if (class1856 != class1855.getOpposite()) {
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
    
    public static LoadingCache<BlockPos, Class7990> method29797(final Class1852 class1852, final boolean b) {
        return (LoadingCache<BlockPos, Class7990>)CacheBuilder.newBuilder().build((CacheLoader)new Class6047(class1852, b));
    }
    
    public static BlockPos method29798(final BlockPos class354, final Direction class355, final Direction class356, final int n, final int n2, final int n3) {
        if (class355 != class356 && class355 != class356.getOpposite()) {
            final Vec3i class357 = new Vec3i(class355.getXOffset(), class355.getYOffset(), class355.getZOffset());
            final Vec3i class358 = new Vec3i(class356.getXOffset(), class356.getYOffset(), class356.getZOffset());
            final Vec3i method1080 = class357.crossProduct(class358);
            return class354.add(class358.getX() * -n2 + method1080.getX() * n + class357.getX() * n3, class358.getY() * -n2 + method1080.getY() * n + class357.getY() * n3, class358.getZ() * -n2 + method1080.getZ() * n + class357.getZ() * n3);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }
}
