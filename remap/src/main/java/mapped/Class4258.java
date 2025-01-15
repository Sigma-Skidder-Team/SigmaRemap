// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4258 implements Class4252<Class5800>
{
    private static String[] field19103;
    private int field19104;
    private double field19105;
    private double field19106;
    private double field19107;
    private byte field19108;
    private byte field19109;
    private boolean field19110;
    
    public Class4258() {
    }
    
    public Class4258(final Entity class399) {
        this.field19104 = class399.method1643();
        this.field19105 = class399.method1938();
        this.field19106 = class399.method1941();
        this.field19107 = class399.method1945();
        this.field19108 = (byte)(class399.field2399 * 256.0f / 360.0f);
        this.field19109 = (byte)(class399.field2400 * 256.0f / 360.0f);
        this.field19110 = class399.field2404;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19104 = class8654.method29501();
        this.field19105 = class8654.readDouble();
        this.field19106 = class8654.readDouble();
        this.field19107 = class8654.readDouble();
        this.field19108 = class8654.readByte();
        this.field19109 = class8654.readByte();
        this.field19110 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19104);
        class8654.writeDouble(this.field19105);
        class8654.writeDouble(this.field19106);
        class8654.writeDouble(this.field19107);
        class8654.writeByte(this.field19108);
        class8654.writeByte(this.field19109);
        class8654.writeBoolean(this.field19110);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17280(this);
    }
    
    public int method12781() {
        return this.field19104;
    }
    
    public double method12782() {
        return this.field19105;
    }
    
    public double method12783() {
        return this.field19106;
    }
    
    public double method12784() {
        return this.field19107;
    }
    
    public byte method12785() {
        return this.field19108;
    }
    
    public byte method12786() {
        return this.field19109;
    }
    
    public boolean method12787() {
        return this.field19110;
    }
}
