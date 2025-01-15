// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class3414 implements Class3413
{
    private static String[] field16141;
    private final int field16142;
    private final Set<Class9383> field16143;
    
    public Class3414(final int field16142) {
        this.field16143 = Sets.newIdentityHashSet();
        this.field16142 = field16142;
    }
    
    @Nullable
    @Override
    public Class9383 method10848() {
        if (this.field16143.size() < this.field16142) {
            final Class9383 method34867 = Class9383.method34867();
            if (method34867 != null) {
                this.field16143.add(method34867);
            }
            return method34867;
        }
        return null;
    }
    
    @Override
    public boolean method10849(final Class9383 class9383) {
        if (this.field16143.remove(class9383)) {
            class9383.method34868();
            return true;
        }
        return false;
    }
    
    @Override
    public void method10850() {
        this.field16143.forEach(Class9383::method34868);
        this.field16143.clear();
    }
    
    @Override
    public int method10851() {
        return this.field16142;
    }
    
    @Override
    public int method10852() {
        return this.field16143.size();
    }
}
