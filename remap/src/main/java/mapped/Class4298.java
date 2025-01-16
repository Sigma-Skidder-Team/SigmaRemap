// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Iterator;
import java.util.HashMap;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

public class Class4298 implements IPacket<IClientPlayNetHandler>
{
    private int field19267;
    private int field19268;
    private int field19269;
    private CompoundNBT field19270;
    private Class1873 field19271;
    private byte[] field19272;
    public List<CompoundNBT> field19273;
    public boolean field19274;
    private Map<String, Object> field19275;
    
    public Class4298() {
    }
    
    public Class4298(final Class1862 class1862, final int n) {
        final Class7859 method7019 = class1862.method7019();
        this.field19267 = method7019.field32290;
        this.field19268 = method7019.field32291;
        this.field19274 = (n == 65535);
        this.field19270 = new CompoundNBT();
        for (final Map.Entry<Class2020, V> entry : class1862.method7015()) {
            if (!entry.getKey().method8061()) {
                continue;
            }
            this.field19270.put(entry.getKey().method8060(), new LongArrayNBT(((Class9548)entry.getValue()).method35717()));
        }
        if (this.field19274) {
            this.field19271 = class1862.method7024().clone();
        }
        this.field19272 = new byte[this.method12908(class1862, n)];
        this.field19269 = this.method12907(new PacketBuffer(this.method12906()), class1862, n);
        this.field19273 = Lists.newArrayList();
        for (final Map.Entry<BlockPos, V> entry2 : class1862.method7066().entrySet()) {
            final BlockPos class1863 = entry2.getKey();
            final TileEntity class1864 = (TileEntity)entry2.getValue();
            final int n2 = class1863.getY() >> 4;
            if (!this.method12912() && (n & 1 << n2) == 0x0) {
                continue;
            }
            this.field19273.add(class1864.method2196());
        }
        (this.field19275 = new HashMap<String, Object>()).put("ChunkDataOF", Class1863.method7088(class1862));
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19267 = class8654.readInt();
        this.field19268 = class8654.readInt();
        this.field19274 = class8654.readBoolean();
        this.field19269 = class8654.readVarInt();
        this.field19270 = class8654.method29508();
        if (this.field19274) {
            this.field19271 = new Class1873(class8654);
        }
        final int method29501 = class8654.readVarInt();
        if (method29501 <= 2097152) {
            class8654.readBytes(this.field19272 = new byte[method29501]);
            final int method29502 = class8654.readVarInt();
            this.field19273 = Lists.newArrayList();
            for (int i = 0; i < method29502; ++i) {
                this.field19273.add(class8654.method29508());
            }
            return;
        }
        throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19267);
        class8654.writeInt(this.field19268);
        class8654.writeBoolean(this.field19274);
        class8654.writeVarInt(this.field19269);
        class8654.method29507(this.field19270);
        if (this.field19271 != null) {
            this.field19271.method7126(class8654);
        }
        class8654.writeVarInt(this.field19272.length);
        class8654.writeBytes(this.field19272);
        class8654.writeVarInt(this.field19273.size());
        final Iterator<CompoundNBT> iterator = this.field19273.iterator();
        while (iterator.hasNext()) {
            class8654.method29507(iterator.next());
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17287(this);
    }
    
    public PacketBuffer method12905() {
        return new PacketBuffer(Unpooled.wrappedBuffer(this.field19272), this.field19275);
    }
    
    private ByteBuf method12906() {
        final ByteBuf wrappedBuffer = Unpooled.wrappedBuffer(this.field19272);
        wrappedBuffer.writerIndex(0);
        return wrappedBuffer;
    }
    
    public int method12907(final PacketBuffer class8654, final Class1862 class8655, final int n) {
        int n2 = 0;
        final Class8199[] method7014 = class8655.method7014();
        for (int i = 0; i < method7014.length; ++i) {
            final Class8199 class8656 = method7014[i];
            if (class8656 != Class1862.field10141) {
                if (!this.method12912() || !class8656.method27154()) {
                    if ((n & 1 << i) != 0x0) {
                        n2 |= 1 << i;
                        class8656.method27163(class8654);
                    }
                }
            }
        }
        return n2;
    }
    
    public int method12908(final Class1862 class1862, final int n) {
        int n2 = 0;
        final Class8199[] method7014 = class1862.method7014();
        for (int i = 0; i < method7014.length; ++i) {
            final Class8199 class1863 = method7014[i];
            if (class1863 != Class1862.field10141) {
                if (!this.method12912() || !class1863.method27154()) {
                    if ((n & 1 << i) != 0x0) {
                        n2 += class1863.method27164();
                    }
                }
            }
        }
        return n2;
    }
    
    public int method12909() {
        return this.field19267;
    }
    
    public int method12910() {
        return this.field19268;
    }
    
    public int method12911() {
        return this.field19269;
    }
    
    public boolean method12912() {
        return this.field19274;
    }
    
    public CompoundNBT method12913() {
        return this.field19270;
    }
    
    public List<CompoundNBT> method12914() {
        return this.field19273;
    }
    
    @Nullable
    public Class1873 method12915() {
        return (this.field19271 != null) ? this.field19271.clone() : null;
    }
}
