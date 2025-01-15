// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4278 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19188;
    private double field19189;
    private double field19190;
    private double field19191;
    private float field19192;
    private float field19193;
    private float field19194;
    private float field19195;
    private int field19196;
    private boolean field19197;
    private Class6909 field19198;
    
    public Class4278() {
    }
    
    public <T extends Class6909> Class4278(final T field19198, final boolean field19199, final double field19200, final double field19201, final double field19202, final float field19203, final float field19204, final float field19205, final float field19206, final int field19207) {
        this.field19198 = field19198;
        this.field19197 = field19199;
        this.field19189 = field19200;
        this.field19190 = field19201;
        this.field19191 = field19202;
        this.field19192 = field19203;
        this.field19193 = field19204;
        this.field19194 = field19205;
        this.field19195 = field19206;
        this.field19196 = field19207;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        Class6907 field34599 = Class90.field222.method499(class8654.readInt());
        if (field34599 == null) {
            field34599 = Class8432.field34599;
        }
        this.field19197 = class8654.readBoolean();
        this.field19189 = class8654.readDouble();
        this.field19190 = class8654.readDouble();
        this.field19191 = class8654.readDouble();
        this.field19192 = class8654.readFloat();
        this.field19193 = class8654.readFloat();
        this.field19194 = class8654.readFloat();
        this.field19195 = class8654.readFloat();
        this.field19196 = class8654.readInt();
        this.field19198 = this.method12843(class8654, (Class6907<Class6909>)field34599);
    }
    
    private <T extends Class6909> T method12843(final PacketBuffer class8654, final Class6907<T> class8655) {
        return class8655.method21271().method19056(class8655, class8654);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(Class90.field222.method504((Class6907<? extends Class6909>)this.field19198.method21272()));
        class8654.writeBoolean(this.field19197);
        class8654.writeDouble(this.field19189);
        class8654.writeDouble(this.field19190);
        class8654.writeDouble(this.field19191);
        class8654.writeFloat(this.field19192);
        class8654.writeFloat(this.field19193);
        class8654.writeFloat(this.field19194);
        class8654.writeFloat(this.field19195);
        class8654.writeInt(this.field19196);
        this.field19198.method21273(class8654);
    }
    
    public boolean method12844() {
        return this.field19197;
    }
    
    public double method12845() {
        return this.field19189;
    }
    
    public double method12846() {
        return this.field19190;
    }
    
    public double method12847() {
        return this.field19191;
    }
    
    public float method12848() {
        return this.field19192;
    }
    
    public float method12849() {
        return this.field19193;
    }
    
    public float method12850() {
        return this.field19194;
    }
    
    public float method12851() {
        return this.field19195;
    }
    
    public int method12852() {
        return this.field19196;
    }
    
    public Class6909 method12853() {
        return this.field19198;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17360(this);
    }
}
