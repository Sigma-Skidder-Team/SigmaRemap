// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

public class Class2124 implements Class2123
{
    private final Class1932 field12393;
    private final Class9294 field12394;
    private final boolean field12395;
    private final int field12396;
    
    public Class2124(final Class1932 field12393, final Class9294 field12394, final boolean field12395, final int field12396) {
        this.field12393 = field12393;
        this.field12394 = field12394;
        this.field12395 = field12395;
        this.field12396 = field12396;
    }
    
    public Class1932 method8279() {
        return this.field12393;
    }
    
    @Override
    public Class9294 method8274() {
        return this.field12394;
    }
    
    @Override
    public boolean method8278() {
        return this.field12395;
    }
    
    public int method8280() {
        return this.field12396;
    }
    
    @Override
    public String toString() {
        return "Variant{modelLocation=" + this.field12393 + ", rotation=" + this.field12394 + ", uvLock=" + this.field12395 + ", weight=" + this.field12396 + '}';
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2124) {
            final Class2124 class2124 = (Class2124)o;
            if (this.field12393.equals(class2124.field12393)) {
                if (Objects.equals(this.field12394, class2124.field12394)) {
                    if (this.field12395 == class2124.field12395) {
                        if (this.field12396 == class2124.field12396) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * this.field12393.hashCode() + this.field12394.hashCode()) + Boolean.valueOf(this.field12395).hashCode()) + this.field12396;
    }
}
