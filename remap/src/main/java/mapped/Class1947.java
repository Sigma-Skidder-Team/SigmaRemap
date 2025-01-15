// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.bridge.game.Language;

public class Class1947 implements Language, Comparable<Class1947>
{
    private final String field10602;
    private final String field10603;
    private final String field10604;
    private final boolean field10605;
    
    public Class1947(final String field10602, final String field10603, final String field10604, final boolean field10605) {
        this.field10602 = field10602;
        this.field10603 = field10603;
        this.field10604 = field10604;
        this.field10605 = field10605;
    }
    
    public String getCode() {
        return this.field10602;
    }
    
    public String getName() {
        return this.field10604;
    }
    
    public String getRegion() {
        return this.field10603;
    }
    
    public boolean method7903() {
        return this.field10605;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", this.field10604, this.field10603);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class1947 && this.field10602.equals(((Class1947)o).field10602));
    }
    
    @Override
    public int hashCode() {
        return this.field10602.hashCode();
    }
    
    public int compareTo(final Class1947 class1947) {
        return this.field10602.compareTo(class1947.field10602);
    }
}
