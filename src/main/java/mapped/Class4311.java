// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4311 implements Class4252<Class5800>
{
    private static String[] field19325;
    private int field19326;
    private int field19327;
    private int field19328;
    
    public Class4311() {
    }
    
    public Class4311(final int field19326, final int field19327, final int field19328) {
        this.field19326 = field19326;
        this.field19327 = field19327;
        this.field19328 = field19328;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17314(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19326 = class8654.readUnsignedByte();
        this.field19327 = class8654.readShort();
        this.field19328 = class8654.readShort();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19326);
        class8654.writeShort(this.field19327);
        class8654.writeShort(this.field19328);
    }
    
    public int method12960() {
        return this.field19326;
    }
    
    public int method12961() {
        return this.field19327;
    }
    
    public int method12962() {
        return this.field19328;
    }
}
