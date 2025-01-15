// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class Class4282 implements IPacket<IClientPlayNetHandler>
{
    private Class7795 field19210;
    private Class286 field19211;
    private int field19212;
    private int field19213;
    private int field19214;
    private float field19215;
    private float field19216;
    
    public Class4282() {
    }
    
    public Class4282(final Class7795 field19210, final Class286 field19211, final double n, final double n2, final double n3, final float field19212, final float field19213) {
        Validate.notNull((Object)field19210, "sound", new Object[0]);
        this.field19210 = field19210;
        this.field19211 = field19211;
        this.field19212 = (int)(n * 8.0);
        this.field19213 = (int)(n2 * 8.0);
        this.field19214 = (int)(n3 * 8.0);
        this.field19215 = field19212;
        this.field19216 = field19213;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19210 = Class90.field205.method499(class8654.readVarInt());
        this.field19211 = class8654.method29499(Class286.class);
        this.field19212 = class8654.readInt();
        this.field19213 = class8654.readInt();
        this.field19214 = class8654.readInt();
        this.field19215 = class8654.readFloat();
        this.field19216 = class8654.readFloat();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(Class90.field205.method504(this.field19210));
        class8654.method29500(this.field19211);
        class8654.writeInt(this.field19212);
        class8654.writeInt(this.field19213);
        class8654.writeInt(this.field19214);
        class8654.writeFloat(this.field19215);
        class8654.writeFloat(this.field19216);
    }
    
    public Class7795 method12863() {
        return this.field19210;
    }
    
    public Class286 method12864() {
        return this.field19211;
    }
    
    public double method12865() {
        return this.field19212 / 8.0f;
    }
    
    public double method12866() {
        return this.field19213 / 8.0f;
    }
    
    public double method12867() {
        return this.field19214 / 8.0f;
    }
    
    public float method12868() {
        return this.field19215;
    }
    
    public float method12869() {
        return this.field19216;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17344(this);
    }
}
