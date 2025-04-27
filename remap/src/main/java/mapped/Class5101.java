// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class Class5101 extends Class5100
{
    private static String[] field22029;
    private List<Class367> field22030;
    private int field22031;
    private int field22032;
    private int field22033;
    
    public Class5101(final Class357 class357, final Class357 class358) {
        super(class357, class358);
        this.field22030 = ImmutableList.of();
    }
    
    public Class5101 method15992(final List<Class367> field22030) {
        this.field22030 = field22030;
        return this;
    }
    
    public Class5101 method15993(final int field22031) {
        this.field22031 = field22031;
        return this;
    }
    
    public Class5101 method15994(final int field22032) {
        this.field22032 = field22032;
        return this;
    }
    
    public Class5101 method15995(final int field22033) {
        this.field22033 = field22033;
        return this;
    }
    
    public Class5128 method15996() {
        return new Class5128(this.field22025, this.field22026, this.field22030, this.field22031, this.field22032, this.field22033);
    }
}
