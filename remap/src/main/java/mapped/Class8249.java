// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;

public final class Class8249
{
    private static String[] field33889;
    private final Object2BooleanMap<Class513> field33890;
    
    public Class8249() {
        this.field33890 = (Object2BooleanMap<Class513>)new Object2BooleanOpenHashMap();
    }
    
    public Stream<Class513> method27351(final long n) {
        return this.field33890.keySet().stream();
    }
    
    public void method27352(final long n, final Class513 class513, final boolean b) {
        this.field33890.put((Object)class513, b);
    }
    
    public void method27353(final long n, final Class513 class513) {
        this.field33890.removeBoolean(class513);
    }
    
    public void method27354(final Class513 class513) {
        this.field33890.replace((Object)class513, true);
    }
    
    public void method27355(final Class513 class513) {
        this.field33890.replace((Object)class513, false);
    }
    
    public boolean method27356(final Class513 class513) {
        return this.field33890.getOrDefault(class513, true);
    }
    
    public boolean method27357(final Class513 class513) {
        return this.field33890.getBoolean(class513);
    }
    
    public void method27358(final long n, final long n2, final Class513 class513) {
    }
}
