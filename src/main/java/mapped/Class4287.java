// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4287 implements Class4252<Class5813>
{
    private static String[] field19226;
    private int field19227;
    private Class8321 field19228;
    
    public Class4287() {
        this.field19228 = Class8321.field34174;
    }
    
    public Class4287(final int field19227, final Class8321 class8321) {
        this.field19228 = Class8321.field34174;
        this.field19227 = field19227;
        this.field19228 = class8321.method27641();
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17435(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19227 = class8654.readShort();
        this.field19228 = class8654.method29511();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeShort(this.field19227);
        class8654.method29509(this.field19228);
    }
    
    public int method12874() {
        return this.field19227;
    }
    
    public Class8321 method12875() {
        return this.field19228;
    }
}
