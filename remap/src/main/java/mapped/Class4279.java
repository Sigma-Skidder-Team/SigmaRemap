// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

import it.unimi.dsi.fastutil.objects.Object2IntMap$Entry;
import java.io.IOException;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class4279 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19199;
    private Object2IntMap<Class9455<?>> field19200;
    
    public Class4279() {
    }
    
    public Class4279(final Object2IntMap<Class9455<?>> field19200) {
        this.field19200 = field19200;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17330(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        final int method29501 = class8654.readVarInt();
        this.field19200 = (Object2IntMap<Class9455<?>>)new Object2IntOpenHashMap(method29501);
        for (int i = 0; i < method29501; ++i) {
            this.method12854(Registry.field238.method499(class8654.readVarInt()), class8654);
        }
    }
    
    private <T> void method12854(final Class2248<T> class2248, final PacketBuffer class2249) {
        this.field19200.put((Object)class2248.method8449(class2248.method8448().method499(class2249.readVarInt())), class2249.readVarInt());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19200.size());
        for (final Object2IntMap$Entry object2IntMap$Entry : this.field19200.object2IntEntrySet()) {
            final Class9455 class8655 = (Class9455)object2IntMap$Entry.getKey();
            class8654.writeVarInt(Registry.field238.getId(class8655.method35134()));
            class8654.writeVarInt(this.method12855((Class9455<Object>)class8655));
            class8654.writeVarInt(object2IntMap$Entry.getIntValue());
        }
    }
    
    private <T> int method12855(final Class9455<T> class9455) {
        return class9455.method35134().method8448().getId(class9455.method35135());
    }
    
    public Map<Class9455<?>, Integer> method12856() {
        return this.field19200;
    }
}
