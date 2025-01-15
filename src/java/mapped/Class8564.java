// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class Class8564
{
    private static String[] field35989;
    public static final Class8564 field35990;
    private final Collection<Class9083> field35991;
    
    public Class8564() {
        this.field35991 = Lists.newCopyOnWriteArrayList();
    }
    
    public void method28795(final Class9083 class9083) {
        this.field35991.add(class9083);
    }
    
    public void method28796() {
        this.field35991.clear();
    }
    
    public void method28797() {
        this.field35991.forEach(Class9083::method32752);
        this.field35991.removeIf(Class9083::method32762);
    }
    
    static {
        field35990 = new Class8564();
    }
}
