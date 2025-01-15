// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public interface Class462
{
    Class2250 method1841();
    
    default boolean method1874() {
        return this.method1873() != null;
    }
    
    default Class2250 method1871() {
        return this.method1841();
    }
    
    @Nullable
    default Class2250 method1873() {
        return null;
    }
}
