// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public enum Class2065
{
    field11820("this", Class6683.field26362),
    field11821("killer", Class6683.field26365),
    field11822("direct_killer", Class6683.field26366),
    field11823("killer_player", Class6683.field26363);
    
    private final String field11824;
    private final Class7915<? extends Entity> field11825;
    
    Class2065(final String field11824, final Class7915<? extends Entity> field11825) {
        this.field11824 = field11824;
        this.field11825 = field11825;
    }
    
    public Class7915<? extends Entity> method8153() {
        return this.field11825;
    }
    
    public static Class2065 method8154(final String s) {
        for (final Class2065 class2065 : values()) {
            if (class2065.field11824.equals(s)) {
                return class2065;
            }
        }
        throw new IllegalArgumentException("Invalid entity target " + s);
    }
}
