// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public class Class8604
{
    private static String[] field36118;
    private final Int2ObjectMap<Class9591> field36119;
    private final List<Class9591> field36120;
    private boolean field36121;
    
    public Class8604() {
        this.field36119 = (Int2ObjectMap<Class9591>)new Int2ObjectOpenHashMap();
        this.field36120 = new ArrayList<Class9591>();
        this.field36121 = false;
    }
    
    public Class9591 method29173(final int n, final Class9591 class9591) {
        final Class9591 class9592 = this.field36119.put(n, (Object)class9591);
        this.method29178();
        return class9592;
    }
    
    public Class9591 method29174(final int n) {
        return this.field36119.get(n);
    }
    
    public int method29175() {
        return this.field36119.size();
    }
    
    public Class9591 method29176(final int n) {
        final Class9591 class9591 = this.field36119.remove(n);
        if (class9591 != null) {
            this.method29178();
        }
        return class9591;
    }
    
    public void method29177() {
        this.field36119.clear();
        this.field36120.clear();
        this.method29178();
    }
    
    private void method29178() {
        this.field36121 = true;
    }
    
    public List<Class9591> method29179() {
        if (this.field36121) {
            this.field36120.clear();
            this.field36120.addAll(this.field36119.values());
            this.field36121 = false;
        }
        return this.field36120;
    }
}
