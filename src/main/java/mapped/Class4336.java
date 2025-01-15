// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4336 implements Class4252<Class5813>
{
    private static String[] field19414;
    private int field19415;
    private Class287 field19416;
    private int field19417;
    
    public Class4336() {
    }
    
    public Class4336(final Class399 class399, final Class287 class400) {
        this(class399, class400, 0);
    }
    
    public Class4336(final Class399 class399, final Class287 field19416, final int field19417) {
        this.field19415 = class399.method1643();
        this.field19416 = field19416;
        this.field19417 = field19417;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19415 = class8654.method29501();
        this.field19416 = class8654.method29499(Class287.class);
        this.field19417 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19415);
        class8654.method29500(this.field19416);
        class8654.method29505(this.field19417);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17432(this);
    }
    
    public Class287 method13018() {
        return this.field19416;
    }
    
    public int method13019() {
        return this.field19417;
    }
}
