// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public enum Class340 implements Class326
{
    field2085("is_alive"), 
    field2086("is_burning"), 
    field2087("is_child"), 
    field2088("is_glowing"), 
    field2089("is_hurt"), 
    field2090("is_in_lava"), 
    field2091("is_in_water"), 
    field2092("is_invisible"), 
    field2093("is_on_ground"), 
    field2094("is_ridden"), 
    field2095("is_riding"), 
    field2096("is_sneaking"), 
    field2097("is_sprinting"), 
    field2098("is_wet");
    
    private final String field2099;
    private final Class8551 field2100;
    private static final Class340[] field2101;
    
    Class340(final String field2099) {
        this.field2099 = field2099;
        this.field2100 = Minecraft.getInstance().method5306();
    }
    
    public String method1017() {
        return this.field2099;
    }
    
    @Override
    public boolean method1006() {
        final Class4703 field35912 = this.field2100.field35912;
        if (field35912 == null) {
            return false;
        }
        if (field35912 instanceof Class4710) {
            final LivingEntity field35913 = ((Class4710)field35912).field20303;
            if (field35913 == null) {
                return false;
            }
            switch (Class8067.field33235[this.ordinal()]) {
                case 1: {
                    return field35913.isAlive();
                }
                case 2: {
                    return field35913.method1804();
                }
                case 3: {
                    return field35913.method2625();
                }
                case 4: {
                    return field35913.method1821();
                }
                case 5: {
                    return field35913.field2938 > 0;
                }
                case 6: {
                    return field35913.method1723();
                }
                case 7: {
                    return field35913.method1706();
                }
                case 8: {
                    return field35913.method1823();
                }
                case 9: {
                    return field35913.onGround;
                }
                case 10: {
                    return field35913.isBeingRidden();
                }
                case 11: {
                    return field35913.isPassenger();
                }
                case 12: {
                    return field35913.method1814();
                }
                case 13: {
                    return field35913.method1815();
                }
                case 14: {
                    return field35913.method1709();
                }
            }
        }
        return false;
    }
    
    public static Class340 method1018(final String anObject) {
        if (anObject != null) {
            for (int i = 0; i < Class340.field2101.length; ++i) {
                final Class340 class340 = Class340.field2101[i];
                if (class340.method1017().equals(anObject)) {
                    return class340;
                }
            }
            return null;
        }
        return null;
    }
    
    static {
        field2101 = values();
    }
}
