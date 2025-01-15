// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.EnumSet;

public abstract class Class3446
{
    private final EnumSet<Class2139> field16271;
    
    public Class3446() {
        this.field16271 = EnumSet.noneOf(Class2139.class);
    }
    
    public abstract boolean method11013();
    
    public boolean method11017() {
        return this.method11013();
    }
    
    public boolean method11014() {
        return true;
    }
    
    public void method11015() {
    }
    
    public void method11018() {
    }
    
    public void method11016() {
    }
    
    public void method11019(final EnumSet<Class2139> c) {
        this.field16271.clear();
        this.field16271.addAll((Collection<?>)c);
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public EnumSet<Class2139> method11020() {
        return this.field16271;
    }
}
