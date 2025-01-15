// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3499 extends Class3446
{
    private static String[] field16456;
    private final Class3446 field16457;
    private final int field16458;
    private boolean field16459;
    
    public Class3499(final int field16458, final Class3446 field16459) {
        this.field16458 = field16458;
        this.field16457 = field16459;
    }
    
    public boolean method11061(final Class3499 class3499) {
        return this.method11014() && class3499.method11063() < this.method11063();
    }
    
    @Override
    public boolean method11013() {
        return this.field16457.method11013();
    }
    
    @Override
    public boolean method11017() {
        return this.field16457.method11017();
    }
    
    @Override
    public boolean method11014() {
        return this.field16457.method11014();
    }
    
    @Override
    public void method11015() {
        if (!this.field16459) {
            this.field16459 = true;
            this.field16457.method11015();
        }
    }
    
    @Override
    public void method11018() {
        if (this.field16459) {
            this.field16459 = false;
            this.field16457.method11018();
        }
    }
    
    @Override
    public void method11016() {
        this.field16457.method11016();
    }
    
    @Override
    public void method11019(final EnumSet<Class2139> set) {
        this.field16457.method11019(set);
    }
    
    @Override
    public EnumSet<Class2139> method11020() {
        return this.field16457.method11020();
    }
    
    public boolean method11062() {
        return this.field16459;
    }
    
    public int method11063() {
        return this.field16458;
    }
    
    public Class3446 method11064() {
        return this.field16457;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field16457.equals(((Class3499)o).field16457));
    }
    
    @Override
    public int hashCode() {
        return this.field16457.hashCode();
    }
}
