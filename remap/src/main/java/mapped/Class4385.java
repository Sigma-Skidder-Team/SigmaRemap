// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import com.google.common.collect.Sets;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class Class4385 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19646;
    private boolean field19647;
    private Map<Class1932, Class6056> field19648;
    private Set<Class1932> field19649;
    private Map<Class1932, Class348> field19650;
    
    public Class4385() {
    }
    
    public Class4385(final boolean field19647, final Collection<Class8863> collection, final Set<Class1932> field19648, final Map<Class1932, Class348> map) {
        this.field19647 = field19647;
        this.field19648 = Maps.newHashMap();
        for (final Class8863 class8863 : collection) {
            this.field19648.put(class8863.method31042(), class8863.method31034());
        }
        this.field19649 = field19648;
        this.field19650 = Maps.newHashMap((Map)map);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17322(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19647 = class8654.readBoolean();
        this.field19648 = Maps.newHashMap();
        this.field19649 = Sets.newLinkedHashSet();
        this.field19650 = Maps.newHashMap();
        for (int method29501 = class8654.readVarInt(), i = 0; i < method29501; ++i) {
            this.field19648.put(class8654.method29516(), Class6056.method18018(class8654));
        }
        for (int method29502 = class8654.readVarInt(), j = 0; j < method29502; ++j) {
            this.field19649.add(class8654.method29516());
        }
        for (int method29503 = class8654.readVarInt(), k = 0; k < method29503; ++k) {
            this.field19650.put(class8654.method29516(), Class348.method1036(class8654));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeBoolean(this.field19647);
        class8654.writeVarInt(this.field19648.size());
        for (final Map.Entry<Class1932, V> entry : this.field19648.entrySet()) {
            final Class1932 class8655 = entry.getKey();
            final Class6056 class8656 = (Class6056)entry.getValue();
            class8654.method29517(class8655);
            class8656.method18016(class8654);
        }
        class8654.writeVarInt(this.field19649.size());
        final Iterator<Class1932> iterator2 = this.field19649.iterator();
        while (iterator2.hasNext()) {
            class8654.method29517(iterator2.next());
        }
        class8654.writeVarInt(this.field19650.size());
        for (final Map.Entry<Class1932, V> entry2 : this.field19650.entrySet()) {
            class8654.method29517(entry2.getKey());
            ((Class348)entry2.getValue()).method1035(class8654);
        }
    }
    
    public Map<Class1932, Class6056> method13193() {
        return this.field19648;
    }
    
    public Set<Class1932> method13194() {
        return this.field19649;
    }
    
    public Map<Class1932, Class348> method13195() {
        return this.field19650;
    }
    
    public boolean method13196() {
        return this.field19647;
    }
}
