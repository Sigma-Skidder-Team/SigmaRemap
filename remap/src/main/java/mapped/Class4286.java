// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;
import java.util.List;

public class Class4286 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19223;
    private int field19224;
    private int[] field19225;
    
    public Class4286() {
    }
    
    public Class4286(final Entity class399) {
        this.field19224 = class399.getEntityId();
        final List<Entity> method1908 = class399.method1908();
        this.field19225 = new int[method1908.size()];
        for (int i = 0; i < method1908.size(); ++i) {
            this.field19225[i] = ((Entity)method1908.get(i)).getEntityId();
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19224 = class8654.readVarInt();
        this.field19225 = class8654.method29489();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19224);
        class8654.method29488(this.field19225);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17299(this);
    }
    
    public int[] method12872() {
        return this.field19225;
    }
    
    public int method12873() {
        return this.field19224;
    }
}
