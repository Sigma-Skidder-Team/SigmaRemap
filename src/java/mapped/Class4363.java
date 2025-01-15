// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4363 implements Class4252<Class5800>
{
    private static String[] field19550;
    private Class354 field19551;
    private int field19552;
    private int field19553;
    private Class3833 field19554;
    
    public Class4363() {
    }
    
    public Class4363(final Class354 field19551, final Class3833 field19552, final int field19553, final int field19554) {
        this.field19551 = field19551;
        this.field19554 = field19552;
        this.field19552 = field19553;
        this.field19553 = field19554;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19551 = class8654.method29494();
        this.field19552 = class8654.readUnsignedByte();
        this.field19553 = class8654.readUnsignedByte();
        this.field19554 = Class90.field208.method499(class8654.method29501());
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19551);
        class8654.writeByte(this.field19552);
        class8654.writeByte(this.field19553);
        class8654.method29505(Class90.field208.method504(this.field19554));
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17317(this);
    }
    
    public Class354 method13123() {
        return this.field19551;
    }
    
    public int method13124() {
        return this.field19552;
    }
    
    public int method13125() {
        return this.field19553;
    }
    
    public Class3833 method13126() {
        return this.field19554;
    }
}
