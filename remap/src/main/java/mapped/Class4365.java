// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Iterator;
import java.io.IOException;
import java.util.List;

public class Class4365 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19558;
    private int field19559;
    private List<ItemStack> field19560;
    
    public Class4365() {
    }
    
    public Class4365(final int field19559, final NonNullList<ItemStack> class2265) {
        this.field19559 = field19559;
        this.field19560 = NonNullList.withSize(class2265.size(), ItemStack.EMPTY);
        for (int i = 0; i < this.field19560.size(); ++i) {
            this.field19560.set(i, class2265.get(i).method27641());
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19559 = class8654.readUnsignedByte();
        final short short1 = class8654.readShort();
        this.field19560 = NonNullList.withSize(short1, ItemStack.EMPTY);
        for (short n = 0; n < short1; ++n) {
            this.field19560.set(n, class8654.method29511());
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19559);
        class8654.writeShort(this.field19560.size());
        final Iterator<ItemStack> iterator = this.field19560.iterator();
        while (iterator.hasNext()) {
            class8654.method29509(iterator.next());
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17311(this);
    }
    
    public int method13129() {
        return this.field19559;
    }
    
    public List<ItemStack> method13130() {
        return this.field19560;
    }
}
