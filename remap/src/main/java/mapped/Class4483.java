// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;

import java.util.Random;
import java.util.List;

public class Class4483 extends Class4479
{
    private final Direction field19876;
    private final boolean field19877;
    
    public Class4483(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40944, class1796);
        this.field19877 = class1796.getBoolean("tf");
        this.field19876 = Direction.byHorizontalIndex(class1796.getInt("D"));
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        super.method13415(class51);
        class51.putBoolean("tf", this.field19877);
        class51.putInt("D", this.field19876.getHorizontalIndex());
    }
    
    public Class4483(final int n, final MutableBoundingBox field19849, final Direction field19850, final Class1964 class1964) {
        super(Class9520.field40944, n, class1964);
        this.field19876 = field19850;
        this.field19849 = field19849;
        this.field19877 = (field19849.getYSize() > 3);
    }
    
    public static MutableBoundingBox method13469(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179) {
        final MutableBoundingBox class180 = new MutableBoundingBox(n, n2, n3, n, n2 + 3 - 1, n3);
        if (random.nextInt(4) == 0) {
            final MutableBoundingBox class181 = class180;
            class181.maxY += 4;
        }
        switch (Class8427.field34587[class179.ordinal()]) {
            default: {
                class180.minX = n - 1;
                class180.maxX = n + 3;
                class180.minZ = n3 - 4;
                break;
            }
            case 2: {
                class180.minX = n - 1;
                class180.maxX = n + 3;
                class180.maxZ = n3 + 3 + 1;
                break;
            }
            case 3: {
                class180.minX = n - 4;
                class180.minZ = n3 - 1;
                class180.maxZ = n3 + 3;
                break;
            }
            case 4: {
                class180.maxX = n + 3 + 1;
                class180.minZ = n3 - 1;
                class180.maxZ = n3 + 3;
                break;
            }
        }
        return (Class4473.method13435(list, class180) != null) ? null : class180;
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        switch (Class8427.field34587[this.field19876.ordinal()]) {
            default: {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ - 1, Direction.NORTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.minX - 1, this.field19849.minY, this.field19849.minZ + 1, Direction.WEST, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.maxX + 1, this.field19849.minY, this.field19849.minZ + 1, Direction.EAST, method13433);
                break;
            }
            case 2: {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.maxZ + 1, Direction.SOUTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.minX - 1, this.field19849.minY, this.field19849.minZ + 1, Direction.WEST, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.maxX + 1, this.field19849.minY, this.field19849.minZ + 1, Direction.EAST, method13433);
                break;
            }
            case 3: {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ - 1, Direction.NORTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.maxZ + 1, Direction.SOUTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.minX - 1, this.field19849.minY, this.field19849.minZ + 1, Direction.WEST, method13433);
                break;
            }
            case 4: {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ - 1, Direction.NORTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY, this.field19849.maxZ + 1, Direction.SOUTH, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.maxX + 1, this.field19849.minY, this.field19849.minZ + 1, Direction.EAST, method13433);
                break;
            }
        }
        if (this.field19877) {
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY + 3 + 1, this.field19849.minZ - 1, Direction.NORTH, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.minX - 1, this.field19849.minY + 3 + 1, this.field19849.minZ + 1, Direction.WEST, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.maxX + 1, this.field19849.minY + 3 + 1, this.field19849.minZ + 1, Direction.EAST, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.minX + 1, this.field19849.minY + 3 + 1, this.field19849.maxZ + 1, Direction.SOUTH, method13433);
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        if (!this.method13436(class1851, class1853)) {
            final Class7096 method13462 = this.method13462();
            if (!this.field19877) {
                this.method13444(class1851, class1853, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ, this.field19849.maxX - 1, this.field19849.maxY, this.field19849.maxZ, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.minX, this.field19849.minY, this.field19849.minZ + 1, this.field19849.maxX, this.field19849.maxY, this.field19849.maxZ - 1, Class4483.field19848, Class4483.field19848, false);
            }
            else {
                this.method13444(class1851, class1853, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ, this.field19849.maxX - 1, this.field19849.minY + 3 - 1, this.field19849.maxZ, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.minX, this.field19849.minY, this.field19849.minZ + 1, this.field19849.maxX, this.field19849.minY + 3 - 1, this.field19849.maxZ - 1, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.minX + 1, this.field19849.maxY - 2, this.field19849.minZ, this.field19849.maxX - 1, this.field19849.maxY, this.field19849.maxZ, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.minX, this.field19849.maxY - 2, this.field19849.minZ + 1, this.field19849.maxX, this.field19849.maxY, this.field19849.maxZ - 1, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.minX + 1, this.field19849.minY + 3, this.field19849.minZ + 1, this.field19849.maxX - 1, this.field19849.minY + 3, this.field19849.maxZ - 1, Class4483.field19848, Class4483.field19848, false);
            }
            this.method13470(class1851, class1853, this.field19849.minX + 1, this.field19849.minY, this.field19849.minZ + 1, this.field19849.maxY);
            this.method13470(class1851, class1853, this.field19849.minX + 1, this.field19849.minY, this.field19849.maxZ - 1, this.field19849.maxY);
            this.method13470(class1851, class1853, this.field19849.maxX - 1, this.field19849.minY, this.field19849.minZ + 1, this.field19849.maxY);
            this.method13470(class1851, class1853, this.field19849.maxX - 1, this.field19849.minY, this.field19849.maxZ - 1, this.field19849.maxY);
            for (int i = this.field19849.minX; i <= this.field19849.maxX; ++i) {
                for (int j = this.field19849.minZ; j <= this.field19849.maxZ; ++j) {
                    if (this.method13441(class1851, i, this.field19849.minY - 1, j, class1853).method21706()) {
                        if (this.method13442(class1851, i, this.field19849.minY - 1, j, class1853)) {
                            this.method13440(class1851, method13462, i, this.field19849.minY - 1, j, class1853);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void method13470(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4) {
        if (!this.method13441(class1851, n, n4 + 1, n3, class1852).method21706()) {
            this.method13444(class1851, class1852, n, n2, n3, n, n4, n3, this.method13462(), Class4483.field19848, false);
        }
    }
}
