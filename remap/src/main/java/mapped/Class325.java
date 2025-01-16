// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public enum Class325 implements Class326
{
    field2026("is_alive"), 
    field2027("is_burning"), 
    field2028("is_child"), 
    field2029("is_glowing"), 
    field2030("is_hurt"), 
    field2031("is_in_lava"), 
    field2032("is_in_water"), 
    field2033("is_invisible"), 
    field2034("is_on_ground"), 
    field2035("is_ridden"), 
    field2036("is_riding"), 
    field2037("is_sneaking"), 
    field2038("is_sprinting"), 
    field2039("is_wet");
    
    private String field2040;
    private Class8551 field2041;
    private static final Class325[] field2042;
    
    private Class325(final String field2040) {
        this.field2040 = field2040;
        this.field2041 = Minecraft.method5277().method5306();
    }
    
    public String method1005() {
        return this.field2040;
    }
    
    @Override
    public boolean method1006() {
        final Entity method5303 = Minecraft.method5277().method5303();
        if (method5303 instanceof LivingEntity) {
            final LivingEntity class511 = (LivingEntity)method5303;
            switch (Class7475.field28873[this.ordinal()]) {
                case 1: {
                    return class511.method1768();
                }
                case 2: {
                    return class511.method1804();
                }
                case 3: {
                    return class511.method2625();
                }
                case 4: {
                    return class511.method1821();
                }
                case 5: {
                    return class511.field2938 > 0;
                }
                case 6: {
                    return class511.method1723();
                }
                case 7: {
                    return class511.method1706();
                }
                case 8: {
                    return class511.method1823();
                }
                case 9: {
                    return class511.onGround;
                }
                case 10: {
                    return class511.isBeingRidden();
                }
                case 11: {
                    return class511.isPassenger();
                }
                case 12: {
                    return class511.method1814();
                }
                case 13: {
                    return class511.method1815();
                }
                case 14: {
                    return class511.method1709();
                }
            }
        }
        return false;
    }
    
    public static Class325 method1007(final String anObject) {
        if (anObject != null) {
            for (int i = 0; i < Class325.field2042.length; ++i) {
                final Class325 class325 = Class325.field2042[i];
                if (class325.method1005().equals(anObject)) {
                    return class325;
                }
            }
            return null;
        }
        return null;
    }
    
    static {
        field2042 = values();
    }
}
