// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

public class Class8141
{
    private static String[] field33540;
    private final ThreadLocal<Class5103> field33541;
    private final Long2ObjectLinkedOpenHashMap<int[]> field33542;
    private final ReentrantReadWriteLock field33543;
    
    public Class8141() {
        this.field33541 = ThreadLocal.withInitial(() -> new Class5103(null));
        this.field33542 = (Long2ObjectLinkedOpenHashMap<int[]>)new Long2ObjectLinkedOpenHashMap(256, 0.25f);
        this.field33543 = new ReentrantReadWriteLock();
    }
    
    public int method26829(final BlockPos class354, final IntSupplier intSupplier) {
        final int field22037 = class354.getX() >> 4;
        final int field22038 = class354.getZ() >> 4;
        final Class5103 class355 = this.field33541.get();
        if (class355.field22037 != field22037 || class355.field22038 != field22038) {
            class355.field22037 = field22037;
            class355.field22038 = field22038;
            class355.field22039 = this.method26832(field22037, field22038);
        }
        final int n = (class354.getZ() & 0xF) << 4 | (class354.getX() & 0xF);
        final int n2 = class355.field22039[n];
        if (n2 == -1) {
            return class355.field22039[n] = intSupplier.getAsInt();
        }
        return n2;
    }
    
    public void method26830(final int n, final int n2) {
        try {
            this.field33543.writeLock().lock();
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    this.field33542.remove(ChunkPos.method25423(n + i, n2 + j));
                }
            }
        }
        finally {
            this.field33543.writeLock().unlock();
        }
    }
    
    public void method26831() {
        try {
            this.field33543.writeLock().lock();
            this.field33542.clear();
        }
        finally {
            this.field33543.writeLock().unlock();
        }
    }
    
    private int[] method26832(final int n, final int n2) {
        final long method25423 = ChunkPos.method25423(n, n2);
        this.field33543.readLock().lock();
        int[] array;
        try {
            array = (int[])this.field33542.get(method25423);
        }
        finally {
            this.field33543.readLock().unlock();
        }
        if (array != null) {
            return array;
        }
        final int[] a = new int[256];
        Arrays.fill(a, -1);
        try {
            this.field33543.writeLock().lock();
            if (this.field33542.size() >= 256) {
                this.field33542.removeFirst();
            }
            this.field33542.put(method25423, (Object)a);
        }
        finally {
            this.field33543.writeLock().unlock();
        }
        return a;
    }
}
