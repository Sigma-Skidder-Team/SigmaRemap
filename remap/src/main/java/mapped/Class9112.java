// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class Class9112
{
    private static String[] field38604;
    public final Class1656 field38605;
    public final World field38606;
    public int field38607;
    public int field38608;
    public int field38609;
    public Class8974[] field38610;
    private Map<ChunkPos, Class8871[]> field38611;
    
    public Class9112(final Class7520 class7520, final World field38606, final int n, final Class1656 field38607) {
        this.field38611 = new HashMap<ChunkPos, Class8871[]>();
        this.field38605 = field38607;
        this.field38606 = field38606;
        this.method32960(n);
        this.method32957(class7520);
    }
    
    public void method32957(final Class7520 class7520) {
        this.field38610 = new Class8974[this.field38608 * this.field38607 * this.field38609];
        for (int i = 0; i < this.field38608; ++i) {
            for (int j = 0; j < this.field38607; ++j) {
                for (int k = 0; k < this.field38609; ++k) {
                    final int method32959 = this.method32959(i, j, k);
                    final Class8974[] field38610 = this.field38610;
                    final int n = method32959;
                    class7520.getClass();
                    field38610[n] = new Class8974(class7520);
                    this.field38610[method32959].method31867(i * 16, j * 16, k * 16);
                    if (Config.method29010()) {
                        if (Config.method29009()) {
                            this.method32964(this.field38610[method32959]);
                        }
                    }
                }
            }
        }
        for (int l = 0; l < this.field38610.length; ++l) {
            final Class8974 class7521 = this.field38610[l];
            for (int n2 = 0; n2 < Direction.VALUES.length; ++n2) {
                final Direction class7522 = Direction.VALUES[n2];
                class7521.method31899(class7522, this.method32963(class7521.method31878(class7522)));
            }
        }
    }
    
    public void method32958() {
        final Class8974[] field38610 = this.field38610;
        for (int length = field38610.length, i = 0; i < length; ++i) {
            field38610[i].method31872();
        }
        this.method32965();
    }
    
    private int method32959(final int n, final int n2, final int n3) {
        return (n3 * this.field38607 + n2) * this.field38608 + n;
    }
    
    public void method32960(final int n) {
        final int n2 = n * 2 + 1;
        this.field38608 = n2;
        this.field38607 = 16;
        this.field38609 = n2;
    }
    
    public void method32961(final double n, final double n2) {
        final int method35644 = MathHelper.floor(n);
        final int method35645 = MathHelper.floor(n2);
        for (int i = 0; i < this.field38608; ++i) {
            final int y = this.field38608 * 16;
            final int n3 = method35644 - 8 - y / 2;
            final int n4 = n3 + Math.floorMod(i * 16 - n3, y);
            for (int j = 0; j < this.field38609; ++j) {
                final int y2 = this.field38609 * 16;
                final int n5 = method35645 - 8 - y2 / 2;
                final int n6 = n5 + Math.floorMod(j * 16 - n5, y2);
                for (int k = 0; k < this.field38607; ++k) {
                    this.field38610[this.method32959(i, k, j)].method31867(n4, k * 16, n6);
                }
            }
        }
    }
    
    public void method32962(final int x, final int x2, final int x3, final boolean b) {
        this.field38610[this.method32959(Math.floorMod(x, this.field38608), Math.floorMod(x2, this.field38607), Math.floorMod(x3, this.field38609))].method31874(b);
    }
    
    @Nullable
    public Class8974 method32963(final BlockPos class354) {
        final int n = class354.getX() >> 4;
        final int n2 = class354.getY() >> 4;
        final int n3 = class354.getZ() >> 4;
        if (n2 >= 0 && n2 < this.field38607) {
            return this.field38610[this.method32959(MathHelper.method35664(n, this.field38608), n2, MathHelper.method35664(n3, this.field38609))];
        }
        return null;
    }
    
    private void method32964(final Class8974 class8974) {
        final BlockPos method31873 = class8974.method31873();
        final ChunkPos class8975 = new ChunkPos(method31873.getX() >> 8 << 8, method31873.getZ() >> 8 << 8);
        final Class6332[] field25344 = Class6332.field25344;
        Class8871[] array = this.field38611.get(class8975);
        if (array == null) {
            array = new Class8871[field25344.length];
            for (int i = 0; i < field25344.length; ++i) {
                array[i] = new Class8871(field25344[i]);
            }
            this.field38611.put(class8975, array);
        }
        for (int j = 0; j < field25344.length; ++j) {
            final Class6332 class8976 = field25344[j];
            final Class8871 class8977 = array[j];
            if (class8977 != null) {
                class8974.method31866(class8976).method7593(class8977);
            }
        }
    }
    
    public void method32965() {
        final Iterator<ChunkPos> iterator = this.field38611.keySet().iterator();
        while (iterator.hasNext()) {
            final Class8871[] array = this.field38611.get(iterator.next());
            for (int i = 0; i < array.length; ++i) {
                final Class8871 class8871 = array[i];
                if (class8871 != null) {
                    class8871.method31176();
                }
                array[i] = null;
            }
        }
        this.field38611.clear();
    }
}
