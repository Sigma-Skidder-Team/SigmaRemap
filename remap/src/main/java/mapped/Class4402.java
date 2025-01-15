// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.io.IOException;

public class Class4402 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19721;
    private int field19722;
    private Class2215 field19723;
    private ItemStack field19724;
    
    public Class4402() {
        this.field19724 = ItemStack.field34174;
    }
    
    public Class4402(final int field19722, final Class2215 field19723, final ItemStack class8321) {
        this.field19724 = ItemStack.field34174;
        this.field19722 = field19722;
        this.field19723 = field19723;
        this.field19724 = class8321.method27641();
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19722 = class8654.readVarInt();
        this.field19723 = class8654.method29499(Class2215.class);
        this.field19724 = class8654.method29511();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19722);
        class8654.method29500(this.field19723);
        class8654.method29509(this.field19724);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17315(this);
    }
    
    public ItemStack method13247() {
        return this.field19724;
    }
    
    public int method13248() {
        return this.field19722;
    }
    
    public Class2215 method13249() {
        return this.field19723;
    }
}
