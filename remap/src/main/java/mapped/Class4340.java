// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4340 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19436;
    private Class2217 field19437;
    private int field19438;
    private double field19439;
    private double field19440;
    private double field19441;
    private double field19442;
    private long field19443;
    private int field19444;
    private int field19445;
    
    public Class4340() {
    }
    
    public Class4340(final WorldBorder class9375, final Class2217 field19437) {
        this.field19437 = field19437;
        this.field19439 = class9375.method34777();
        this.field19440 = class9375.method34778();
        this.field19442 = class9375.method34791();
        this.field19441 = class9375.method34793();
        this.field19443 = class9375.method34792();
        this.field19438 = class9375.method34799();
        this.field19445 = class9375.method34807();
        this.field19444 = class9375.method34805();
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19437 = class8654.method29499(Class2217.class);
        switch (Class5102.field22035[this.field19437.ordinal()]) {
            case 1: {
                this.field19441 = class8654.readDouble();
                break;
            }
            case 2: {
                this.field19442 = class8654.readDouble();
                this.field19441 = class8654.readDouble();
                this.field19443 = class8654.method29502();
                break;
            }
            case 3: {
                this.field19439 = class8654.readDouble();
                this.field19440 = class8654.readDouble();
                break;
            }
            case 4: {
                this.field19445 = class8654.readVarInt();
                break;
            }
            case 5: {
                this.field19444 = class8654.readVarInt();
                break;
            }
            case 6: {
                this.field19439 = class8654.readDouble();
                this.field19440 = class8654.readDouble();
                this.field19442 = class8654.readDouble();
                this.field19441 = class8654.readDouble();
                this.field19443 = class8654.method29502();
                this.field19438 = class8654.readVarInt();
                this.field19445 = class8654.readVarInt();
                this.field19444 = class8654.readVarInt();
                break;
            }
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19437);
        switch (Class5102.field22035[this.field19437.ordinal()]) {
            case 1: {
                class8654.writeDouble(this.field19441);
                break;
            }
            case 2: {
                class8654.writeDouble(this.field19442);
                class8654.writeDouble(this.field19441);
                class8654.method29506(this.field19443);
                break;
            }
            case 3: {
                class8654.writeDouble(this.field19439);
                class8654.writeDouble(this.field19440);
                break;
            }
            case 4: {
                class8654.writeVarInt(this.field19445);
                break;
            }
            case 5: {
                class8654.writeVarInt(this.field19444);
                break;
            }
            case 6: {
                class8654.writeDouble(this.field19439);
                class8654.writeDouble(this.field19440);
                class8654.writeDouble(this.field19442);
                class8654.writeDouble(this.field19441);
                class8654.method29506(this.field19443);
                class8654.writeVarInt(this.field19438);
                class8654.writeVarInt(this.field19445);
                class8654.writeVarInt(this.field19444);
                break;
            }
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17337(this);
    }
    
    public void method13035(final WorldBorder class9375) {
        switch (Class5102.field22035[this.field19437.ordinal()]) {
            case 1: {
                class9375.method34794(this.field19441);
                break;
            }
            case 2: {
                class9375.method34795(this.field19442, this.field19441, this.field19443);
                break;
            }
            case 3: {
                class9375.method34790(this.field19439, this.field19440);
                break;
            }
            case 4: {
                class9375.method34808(this.field19445);
                break;
            }
            case 5: {
                class9375.method34806(this.field19444);
                break;
            }
            case 6: {
                class9375.method34790(this.field19439, this.field19440);
                if (this.field19443 > 0L) {
                    class9375.method34795(this.field19442, this.field19441, this.field19443);
                }
                else {
                    class9375.method34794(this.field19441);
                }
                class9375.method34798(this.field19438);
                class9375.method34808(this.field19445);
                class9375.method34806(this.field19444);
                break;
            }
        }
    }
}
