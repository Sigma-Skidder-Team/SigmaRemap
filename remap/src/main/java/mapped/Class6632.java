// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import net.minecraft.util.math.ChunkPos;

public final class Class6632 implements Class6631
{
    private static String[] field26216;
    private final Class8610 field26217;
    private final Long2IntLinkedOpenHashMap field26218;
    private final int field26219;
    
    public Class6632(final Long2IntLinkedOpenHashMap field26218, final int field26219, final Class8610 field26220) {
        this.field26218 = field26218;
        this.field26219 = field26219;
        this.field26217 = field26220;
    }
    
    @Override
    public int method20074(final int n, final int n2) {
        final long method25423 = ChunkPos.method25423(n, n2);
        synchronized (this.field26218) {
            final int value = this.field26218.get(method25423);
            if (value != Integer.MIN_VALUE) {
                return value;
            }
            final int method25424 = this.field26217.method29201(n, n2);
            this.field26218.put(method25423, method25424);
            if (this.field26218.size() > this.field26219) {
                for (int i = 0; i < this.field26219 / 16; ++i) {
                    this.field26218.removeFirstInt();
                }
            }
            return method25424;
        }
    }
    
    public int method20075() {
        return this.field26219;
    }
}
