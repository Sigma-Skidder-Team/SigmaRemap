// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4379 implements Class4252<Class5800>
{
    private static String[] field19616;
    private int field19617;
    private int field19618;
    
    public Class4379() {
    }
    
    public Class4379(final int field19617, final int field19618) {
        this.field19617 = field19617;
        this.field19618 = field19618;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19617 = class8654.method29501();
        this.field19618 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19617);
        class8654.method29505(this.field19618);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17366(this);
    }
    
    public int method13167() {
        return this.field19617;
    }
    
    public int method13168() {
        return this.field19618;
    }
}
