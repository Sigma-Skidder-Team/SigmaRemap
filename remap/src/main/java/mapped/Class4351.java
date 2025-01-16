// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import net.minecraft.entity.Entity;
import org.apache.commons.lang3.Validate;

public class Class4351 implements IPacket<IClientPlayNetHandler>
{
    private Class7795 field19487;
    private Class286 field19488;
    private int field19489;
    private float field19490;
    private float field19491;
    
    public Class4351() {
    }
    
    public Class4351(final Class7795 field19487, final Class286 field19488, final Entity class399, final float field19489, final float field19490) {
        Validate.notNull((Object)field19487, "sound", new Object[0]);
        this.field19487 = field19487;
        this.field19488 = field19488;
        this.field19489 = class399.getEntityId();
        this.field19490 = field19489;
        this.field19491 = field19490;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19487 = Registry.field205.method499(class8654.readVarInt());
        this.field19488 = class8654.method29499(Class286.class);
        this.field19489 = class8654.readVarInt();
        this.field19490 = class8654.readFloat();
        this.field19491 = class8654.readFloat();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(Registry.field205.getId(this.field19487));
        class8654.method29500(this.field19488);
        class8654.writeVarInt(this.field19489);
        class8654.writeFloat(this.field19490);
        class8654.writeFloat(this.field19491);
    }
    
    public Class7795 method13068() {
        return this.field19487;
    }
    
    public Class286 method13069() {
        return this.field19488;
    }
    
    public int method13070() {
        return this.field19489;
    }
    
    public float method13071() {
        return this.field19490;
    }
    
    public float method13072() {
        return this.field19491;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17345(this);
    }
}
