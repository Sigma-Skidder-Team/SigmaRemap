// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import java.util.List;

public class Class8087
{
    private int field33311;
    private List<Class9348> field33312;
    
    public Class8087(final int field33311) {
        this.field33312 = new LinkedList<Class9348>();
        this.field33311 = field33311;
    }
    
    public int method26549() {
        return this.field33311;
    }
    
    public List<Class9348> method26550() {
        return this.field33312;
    }
    
    public void method26551(final int field33311) {
        this.field33311 = field33311;
    }
    
    public void method26552(final List<Class9348> field33312) {
        this.field33312 = field33312;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class8087)) {
            return false;
        }
        final Class8087 class8087 = (Class8087)o;
        if (!class8087.method26553(this)) {
            return false;
        }
        if (this.method26549() == class8087.method26549()) {
            final List<Class9348> method26550 = this.method26550();
            final List<Class9348> method26551 = class8087.method26550();
            if (method26550 != null) {
                return method26550.equals(method26551);
            }
            else return method26551 == null;
        }
        return false;
    }
    
    public boolean method26553(final Object o) {
        return o instanceof Class8087;
    }
    
    @Override
    public int hashCode() {
        final int n = 59 + this.method26549();
        final List<Class9348> method26550 = this.method26550();
        return n * 59 + ((method26550 != null) ? method26550.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "Particle(id=" + this.method26549() + ", arguments=" + this.method26550() + ")";
    }
}
