// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;

public class Class8208 implements Class8207
{
    private static String[] field33744;
    private final Class2370 field33745;
    private final CompletableFuture<Class315> field33746;
    
    public Class8208(final Class2370 class2370) {
        this.field33745 = class2370;
        (this.field33746 = new CompletableFuture<Class315>()).completeExceptionally(class2370);
    }
    
    @Override
    public CompletableFuture<Class315> method27188() {
        return this.field33746;
    }
    
    @Override
    public float method27189() {
        return 0.0f;
    }
    
    @Override
    public boolean method27190() {
        return false;
    }
    
    @Override
    public boolean method27191() {
        return true;
    }
    
    @Override
    public void method27192() {
        throw this.field33745;
    }
}
