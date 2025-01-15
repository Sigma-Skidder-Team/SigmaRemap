// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4304 implements Class4252<Class5800>
{
    private static String[] field19301;
    private int field19302;
    private int field19303;
    private int field19304;
    
    public Class4304() {
    }
    
    public Class4304(final int field19302, final int field19303, final int field19304) {
        this.field19302 = field19302;
        this.field19303 = field19303;
        this.field19304 = field19304;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19302 = class8654.method29501();
        this.field19303 = class8654.method29501();
        this.field19304 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19302);
        class8654.method29505(this.field19303);
        class8654.method29505(this.field19304);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17293(this);
    }
    
    public int method12943() {
        return this.field19302;
    }
    
    public int method12944() {
        return this.field19303;
    }
    
    public int method12945() {
        return this.field19304;
    }
}
