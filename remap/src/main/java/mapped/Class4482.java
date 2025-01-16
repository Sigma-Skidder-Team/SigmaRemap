// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4482 extends Class4479
{
    private final List<MutableBoundingBox> field19875;
    
    public Class4482(final int n, final Random random, final int n2, final int n3, final Class1964 field19869) {
        super(Class9520.field40945, n, field19869);
        this.field19875 = Lists.newLinkedList();
        this.field19869 = field19869;
        this.field19849 = new MutableBoundingBox(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }
    
    public Class4482(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40945, class1796);
        this.field19875 = Lists.newLinkedList();
        final ListNBT method328 = class1796.getList("Entrances", 11);
        for (int i = 0; i < method328.size(); ++i) {
            this.field19875.add(new MutableBoundingBox(method328.method350(i)));
        }
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        int n = this.field19849.getYSize() - 3 - 1;
        if (n <= 0) {
            n = 1;
        }
        int n2;
        for (int i = 0; i < this.field19849.getXSize(); i = n2 + 4) {
            n2 = i + random.nextInt(this.field19849.getXSize());
            if (n2 + 3 > this.field19849.getXSize()) {
                break;
            }
            final Class4479 method13434 = Class9191.method33629(class4473, list, random, this.field19849.minX + n2, this.field19849.minY + random.nextInt(n) + 1, this.field19849.minZ - 1, Direction.NORTH, method13433);
            if (method13434 != null) {
                final MutableBoundingBox method13435 = method13434.method13432();
                this.field19875.add(new MutableBoundingBox(method13435.minX, method13435.minY, this.field19849.minZ, method13435.maxX, method13435.maxY, this.field19849.minZ + 1));
            }
        }
        int n3;
        for (int j = 0; j < this.field19849.getXSize(); j = n3 + 4) {
            n3 = j + random.nextInt(this.field19849.getXSize());
            if (n3 + 3 > this.field19849.getXSize()) {
                break;
            }
            final Class4479 method13436 = Class9191.method33629(class4473, list, random, this.field19849.minX + n3, this.field19849.minY + random.nextInt(n) + 1, this.field19849.maxZ + 1, Direction.SOUTH, method13433);
            if (method13436 != null) {
                final MutableBoundingBox method13437 = method13436.method13432();
                this.field19875.add(new MutableBoundingBox(method13437.minX, method13437.minY, this.field19849.maxZ - 1, method13437.maxX, method13437.maxY, this.field19849.maxZ));
            }
        }
        int n4;
        for (int k = 0; k < this.field19849.getZSize(); k = n4 + 4) {
            n4 = k + random.nextInt(this.field19849.getZSize());
            if (n4 + 3 > this.field19849.getZSize()) {
                break;
            }
            final Class4479 method13438 = Class9191.method33629(class4473, list, random, this.field19849.minX - 1, this.field19849.minY + random.nextInt(n) + 1, this.field19849.minZ + n4, Direction.WEST, method13433);
            if (method13438 != null) {
                final MutableBoundingBox method13439 = method13438.method13432();
                this.field19875.add(new MutableBoundingBox(this.field19849.minX, method13439.minY, method13439.minZ, this.field19849.minX + 1, method13439.maxY, method13439.maxZ));
            }
        }
        int n5;
        for (int l = 0; l < this.field19849.getZSize(); l = n5 + 4) {
            n5 = l + random.nextInt(this.field19849.getZSize());
            if (n5 + 3 > this.field19849.getZSize()) {
                break;
            }
            final Class4479 method13440 = Class9191.method33629(class4473, list, random, this.field19849.maxX + 1, this.field19849.minY + random.nextInt(n) + 1, this.field19849.minZ + n5, Direction.EAST, method13433);
            if (method13440 != null) {
                final MutableBoundingBox method13441 = method13440.method13432();
                this.field19875.add(new MutableBoundingBox(this.field19849.maxX - 1, method13441.minY, method13441.minZ, this.field19849.maxX, method13441.maxY, method13441.maxZ));
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        if (!this.method13436(class1851, class1853)) {
            this.method13444(class1851, class1853, this.field19849.minX, this.field19849.minY, this.field19849.minZ, this.field19849.maxX, this.field19849.minY, this.field19849.maxZ, Blocks.DIRT.getDefaultState(), Class4482.field19848, true);
            this.method13444(class1851, class1853, this.field19849.minX, this.field19849.minY + 1, this.field19849.minZ, this.field19849.maxX, Math.min(this.field19849.minY + 3, this.field19849.maxY), this.field19849.maxZ, Class4482.field19848, Class4482.field19848, false);
            for (final MutableBoundingBox class1855 : this.field19875) {
                this.method13444(class1851, class1853, class1855.minX, class1855.maxY - 2, class1855.minZ, class1855.maxX, class1855.maxY, class1855.maxZ, Class4482.field19848, Class4482.field19848, false);
            }
            this.method13448(class1851, class1853, this.field19849.minX, this.field19849.minY + 4, this.field19849.minZ, this.field19849.maxX, this.field19849.maxY, this.field19849.maxZ, Class4482.field19848, false);
            return true;
        }
        return false;
    }
    
    @Override
    public void method13454(final int n, final int n2, final int n3) {
        super.method13454(n, n2, n3);
        final Iterator<MutableBoundingBox> iterator = this.field19875.iterator();
        while (iterator.hasNext()) {
            iterator.next().offset(n, n2, n3);
        }
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        super.method13415(class51);
        final ListNBT class52 = new ListNBT();
        final Iterator<MutableBoundingBox> iterator = this.field19875.iterator();
        while (iterator.hasNext()) {
            ((AbstractList<IntArrayNBT>)class52).add(iterator.next().toNBTTagIntArray());
        }
        class51.put("Entrances", class52);
    }
}
