// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4376 implements IPacket<IClientPlayNetHandler>
{
    public static final Class1932 field19590;
    public static final Class1932 field19591;
    public static final Class1932 field19592;
    public static final Class1932 field19593;
    public static final Class1932 field19594;
    public static final Class1932 field19595;
    public static final Class1932 field19596;
    public static final Class1932 field19597;
    public static final Class1932 field19598;
    public static final Class1932 field19599;
    public static final Class1932 field19600;
    public static final Class1932 field19601;
    public static final Class1932 field19602;
    public static final Class1932 field19603;
    public static final Class1932 field19604;
    public static final Class1932 field19605;
    public static final Class1932 field19606;
    private Class1932 field19607;
    private PacketBuffer field19608;
    
    public Class4376() {
    }
    
    public Class4376(final Class1932 field19607, final PacketBuffer field19608) {
        this.field19607 = field19607;
        this.field19608 = field19608;
        if (field19608.writerIndex() <= 1048576) {
            return;
        }
        throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19607 = class8654.method29516();
        final int readableBytes = class8654.readableBytes();
        if (readableBytes >= 0 && readableBytes <= 1048576) {
            this.field19608 = new PacketBuffer(class8654.readBytes(readableBytes));
            return;
        }
        throw new IOException("Payload may not be larger than 1048576 bytes");
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29517(this.field19607);
        class8654.writeBytes(this.field19608.copy());
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17355(this);
    }
    
    public Class1932 method13158() {
        return this.field19607;
    }
    
    public PacketBuffer method13159() {
        return new PacketBuffer(this.field19608.copy());
    }
    
    static {
        field19590 = new Class1932("brand");
        field19591 = new Class1932("debug/path");
        field19592 = new Class1932("debug/neighbors_update");
        field19593 = new Class1932("debug/caves");
        field19594 = new Class1932("debug/structures");
        field19595 = new Class1932("debug/worldgen_attempt");
        field19596 = new Class1932("debug/poi_ticket_count");
        field19597 = new Class1932("debug/poi_added");
        field19598 = new Class1932("debug/poi_removed");
        field19599 = new Class1932("debug/village_sections");
        field19600 = new Class1932("debug/goal_selector");
        field19601 = new Class1932("debug/brain");
        field19602 = new Class1932("debug/bee");
        field19603 = new Class1932("debug/hive");
        field19604 = new Class1932("debug/game_test_add_marker");
        field19605 = new Class1932("debug/game_test_clear");
        field19606 = new Class1932("debug/raids");
    }
}
