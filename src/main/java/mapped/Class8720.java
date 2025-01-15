// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class8720
{
    private final Map<Class<? extends Class6477>, Class6477> field36635;
    private final List<Class<? extends Class6477>> field36636;
    
    public Class8720() {
        this.field36635 = new HashMap<Class<? extends Class6477>, Class6477>();
        this.field36636 = new ArrayList<Class<? extends Class6477>>();
    }
    
    public void method29947(final Class<? extends Class6477> clazz) {
        this.field36636.add(clazz);
    }
    
    public <T extends Class6477> void method29948(final Class<T> clazz, final T t) {
        this.field36635.put(clazz, t);
    }
    
    public <T extends Class6477> void method29949(final Class<T> clazz, final T t) {
        this.field36636.remove(clazz);
        this.field36635.put(clazz, t);
    }
    
    public <T extends Class6477> T method29950(final Class<T> obj) {
        final Class6477 class6477 = this.field36635.get(obj);
        if (class6477 != null) {
            return (T)class6477;
        }
        if (!this.field36636.contains(obj)) {
            return null;
        }
        throw new IllegalStateException("There was no provider for " + obj + ", one is required!");
    }
}
