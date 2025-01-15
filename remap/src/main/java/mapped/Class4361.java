// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;

public class Class4361 implements Class4252<Class5800>
{
    private static String[] field19540;
    private int field19541;
    private UUID field19542;
    private double field19543;
    private double field19544;
    private double field19545;
    private byte field19546;
    private byte field19547;
    
    public Class4361() {
    }
    
    public Class4361(final Class512 class512) {
        this.field19541 = class512.method1643();
        this.field19542 = class512.method2844().getId();
        this.field19543 = class512.getPosX();
        this.field19544 = class512.getPosY();
        this.field19545 = class512.getPosZ();
        this.field19546 = (byte)(class512.field2399 * 256.0f / 360.0f);
        this.field19547 = (byte)(class512.field2400 * 256.0f / 360.0f);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19541 = class8654.method29501();
        this.field19542 = class8654.method29504();
        this.field19543 = class8654.readDouble();
        this.field19544 = class8654.readDouble();
        this.field19545 = class8654.readDouble();
        this.field19546 = class8654.readByte();
        this.field19547 = class8654.readByte();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19541);
        class8654.method29503(this.field19542);
        class8654.writeDouble(this.field19543);
        class8654.writeDouble(this.field19544);
        class8654.writeDouble(this.field19545);
        class8654.writeByte(this.field19546);
        class8654.writeByte(this.field19547);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17279(this);
    }
    
    public int method13115() {
        return this.field19541;
    }
    
    public UUID method13116() {
        return this.field19542;
    }
    
    public double method13117() {
        return this.field19543;
    }
    
    public double method13118() {
        return this.field19544;
    }
    
    public double method13119() {
        return this.field19545;
    }
    
    public byte method13120() {
        return this.field19546;
    }
    
    public byte method13121() {
        return this.field19547;
    }
}
