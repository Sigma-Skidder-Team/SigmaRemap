// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4308 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19313;
    private int field19314;
    private int field19315;
    private ITextComponent field19316;
    
    public Class4308() {
    }
    
    public Class4308(final int field19314, final Class8471<?> class8471, final ITextComponent field19315) {
        this.field19314 = field19314;
        this.field19315 = Registry.field235.getId(class8471);
        this.field19316 = field19315;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19314 = class8654.readVarInt();
        this.field19315 = class8654.readVarInt();
        this.field19316 = class8654.readTextComponent();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19314);
        class8654.writeVarInt(this.field19315);
        class8654.writeTextComponent(this.field19316);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17308(this);
    }
    
    public int method12951() {
        return this.field19314;
    }
    
    @Nullable
    public Class8471<?> method12952() {
        return Registry.field235.method499(this.field19315);
    }
    
    public ITextComponent method12953() {
        return this.field19316;
    }
}
