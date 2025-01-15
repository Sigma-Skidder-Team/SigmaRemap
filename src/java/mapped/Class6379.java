// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.openal.AL10;

public class Class6379
{
    private static String[] field25489;
    private float field25490;
    
    public Class6379() {
        this.field25490 = 1.0f;
    }
    
    public void method19049(final Class5487 class5487) {
        AL10.alListener3f(4100, (float)class5487.field22770, (float)class5487.field22771, (float)class5487.field22772);
    }
    
    public void method19050(final Class9138 class9138, final Class9138 class9139) {
        AL10.alListenerfv(4111, new float[] { class9138.method33311(), class9138.method33312(), class9138.method33313(), class9139.method33311(), class9139.method33312(), class9139.method33313() });
    }
    
    public void method19051(final float field25490) {
        AL10.alListenerf(4106, field25490);
        this.field25490 = field25490;
    }
    
    public float method19052() {
        return this.field25490;
    }
    
    public void method19053() {
        this.method19049(Class5487.field22769);
        this.method19050(Class9138.field38719, Class9138.field38718);
    }
}
