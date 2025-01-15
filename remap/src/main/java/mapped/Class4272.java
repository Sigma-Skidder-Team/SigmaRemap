// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.io.IOException;

public class Class4272 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19159;
    private int field19160;
    private int field19161;
    private ItemStack field19162;
    
    public Class4272() {
        this.field19162 = ItemStack.field34174;
    }
    
    public Class4272(final int field19160, final int field19161, final ItemStack class8321) {
        this.field19162 = ItemStack.field34174;
        this.field19160 = field19160;
        this.field19161 = field19161;
        this.field19162 = class8321.method27641();
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17309(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19160 = class8654.readByte();
        this.field19161 = class8654.readShort();
        this.field19162 = class8654.method29511();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19160);
        class8654.writeShort(this.field19161);
        class8654.method29509(this.field19162);
    }
    
    public int method12819() {
        return this.field19160;
    }
    
    public int method12820() {
        return this.field19161;
    }
    
    public ItemStack method12821() {
        return this.field19162;
    }
}
