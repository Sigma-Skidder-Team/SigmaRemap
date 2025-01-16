// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class Class4281 implements IPacket<IClientPlayNetHandler>
{
    private List<IRecipe<?>> field19209;
    
    public Class4281() {
    }
    
    public Class4281(final Collection<IRecipe<?>> collection) {
        this.field19209 = Lists.newArrayList((Iterable)collection);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17327(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19209 = Lists.newArrayList();
        for (int method29501 = class8654.readVarInt(), i = 0; i < method29501; ++i) {
            this.field19209.add(method12860(class8654));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19209.size());
        final Iterator<IRecipe<?>> iterator = this.field19209.iterator();
        while (iterator.hasNext()) {
            method12861((IRecipe)iterator.next(), class8654);
        }
    }
    
    public List<IRecipe<?>> method12859() {
        return this.field19209;
    }
    
    public static IRecipe<?> method12860(final PacketBuffer class8654) {
        return Registry.field237.method506(class8654.method29516()).orElseThrow(() -> {
            new IllegalArgumentException("Unknown recipe serializer " + obj);
            return;
        }).method18180(class8654.method29516(), class8654);
    }
    
    public static <T extends IRecipe<?>> void method12861(final T t, final PacketBuffer class8654) {
        class8654.method29517(Registry.field237.getKey(t.getSerializer()));
        class8654.method29517(t.getId());
        t.getSerializer().method18181(class8654, t);
    }
}
