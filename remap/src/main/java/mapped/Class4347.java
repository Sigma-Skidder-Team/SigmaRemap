// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

public class Class4347 implements IPacket<IClientPlayNetHandler>
{
    private int field19472;
    private final List<Class8494> field19473;
    
    public Class4347() {
        this.field19473 = Lists.newArrayList();
    }
    
    public Class4347(final int field19472, final Collection<Class7619> collection) {
        this.field19473 = Lists.newArrayList();
        this.field19472 = field19472;
        for (final Class7619 class7619 : collection) {
            this.field19473.add(new Class8494(class7619.method23939().method29978(), class7619.method23940(), class7619.method23943()));
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19472 = class8654.readVarInt();
        for (int int1 = class8654.readInt(), i = 0; i < int1; ++i) {
            final String method29513 = class8654.method29513(64);
            final double double1 = class8654.readDouble();
            final ArrayList arrayList = Lists.newArrayList();
            for (int method29514 = class8654.readVarInt(), j = 0; j < method29514; ++j) {
                arrayList.add(new Class7919(class8654.method29504(), "Unknown synced attribute modifier", class8654.readDouble(), Class2157.method8323(class8654.readByte())));
            }
            this.field19473.add(new Class8494(method29513, double1, arrayList));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19472);
        class8654.writeInt(this.field19473.size());
        for (final Class8494 class8655 : this.field19473) {
            class8654.method29514(class8655.method28383());
            class8654.writeDouble(class8655.method28384());
            class8654.writeVarInt(class8655.method28385().size());
            for (final Class7919 class8656 : class8655.method28385()) {
                class8654.method29503(class8656.method25635());
                class8654.writeDouble(class8656.method25638());
                class8654.writeByte(class8656.method25637().method8322());
            }
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17361(this);
    }
    
    public int method13056() {
        return this.field19472;
    }
    
    public List<Class8494> method13057() {
        return this.field19473;
    }
}
