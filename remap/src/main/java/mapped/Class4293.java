// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;

public class Class4293 implements Class4252<Class5800>
{
    private static String[] field19251;
    private int field19252;
    private UUID field19253;
    private Class354 field19254;
    private Class179 field19255;
    private int field19256;
    
    public Class4293() {
    }
    
    public Class4293(final Class861 class861) {
        this.field19252 = class861.method1643();
        this.field19253 = class861.method1865();
        this.field19254 = class861.method5194();
        this.field19255 = class861.method1882();
        this.field19256 = Class90.field227.method504(class861.field4601);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19252 = class8654.method29501();
        this.field19253 = class8654.method29504();
        this.field19256 = class8654.method29501();
        this.field19254 = class8654.method29494();
        this.field19255 = Class179.method793(class8654.readUnsignedByte());
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19252);
        class8654.method29503(this.field19253);
        class8654.method29505(this.field19256);
        class8654.method29495(this.field19254);
        class8654.writeByte(this.field19255.method780());
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17276(this);
    }
    
    public int method12894() {
        return this.field19252;
    }
    
    public UUID method12895() {
        return this.field19253;
    }
    
    public Class354 method12896() {
        return this.field19254;
    }
    
    public Class179 method12897() {
        return this.field19255;
    }
    
    public Class8539 method12898() {
        return Class90.field227.method499(this.field19256);
    }
}
