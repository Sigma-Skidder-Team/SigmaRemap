// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataOutputStream;
import javax.annotation.Nullable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.File;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import net.minecraft.util.math.ChunkPos;

public final class Class1881 implements AutoCloseable
{
    private final Long2ObjectLinkedOpenHashMap<Class1924> field10239;
    private final File field10240;
    
    public Class1881(final File field10240) {
        this.field10239 = (Long2ObjectLinkedOpenHashMap<Class1924>)new Long2ObjectLinkedOpenHashMap();
        this.field10240 = field10240;
    }
    
    private Class1924 method7175(final ChunkPos class7859) throws IOException {
        final long method25423 = ChunkPos.method25423(class7859.method25430(), class7859.method25431());
        final Class1924 class7860 = this.field10239.getAndMoveToFirst(method25423);
        if (class7860 == null) {
            if (this.field10239.size() >= 256) {
                this.field10239.removeLast().close();
            }
            if (!this.field10240.exists()) {
                this.field10240.mkdirs();
            }
            final Class1924 class7861 = new Class1924(new File(this.field10240, "r." + class7859.method25430() + "." + class7859.method25431() + ".mca"), this.field10240);
            this.field10239.putAndMoveToFirst(method25423, class7861);
            return class7861;
        }
        return class7860;
    }
    
    @Nullable
    public CompoundNBT method7176(final ChunkPos class7859) throws IOException {
        CompoundNBT method7640;
        try (final DataInputStream method7639 = this.method7175(class7859).method7639(class7859)) {
            if (method7639 != null) {
                method7640 = Class8097.method26595(method7639);
                return method7640;
            }
            method7640 = null;
            return method7640;
        }
        return method7640;
    }
    
    public void method7177(final ChunkPos class7859, final CompoundNBT class7860) throws IOException {
        try (final DataOutputStream method7650 = this.method7175(class7859).method7650(class7859)) {
            Class8097.method26597(class7860, method7650);
        }
    }
    
    @Override
    public void close() throws IOException {
        final ObjectIterator iterator = this.field10239.values().iterator();
        while (iterator.hasNext()) {
            ((Class1924) iterator.next()).close();
        }
    }
}
