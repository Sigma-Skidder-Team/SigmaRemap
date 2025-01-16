// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public enum Class338 implements Class328
{
    field2063("limb_swing"), 
    field2064("limb_speed"), 
    field2065("age"), 
    field2066("head_yaw"), 
    field2067("head_pitch"), 
    field2068("health"), 
    field2069("hurt_time"), 
    field2070("idle_time"), 
    field2071("max_health"), 
    field2072("move_forward"), 
    field2073("move_strafing"), 
    field2074("partial_ticks"), 
    field2075("pos_x"), 
    field2076("pos_Y"), 
    field2077("pos_Z"), 
    field2078("revenge_time"), 
    field2079("swing_progress");
    
    private String field2080;
    private Class8551 field2081;
    private static final Class338[] field2082;
    
    private Class338(final String field2080) {
        this.field2080 = field2080;
        this.field2081 = Minecraft.method5277().method5306();
    }
    
    public String method1015() {
        return this.field2080;
    }
    
    @Override
    public float method1009() {
        final Class4703 field35912 = this.field2081.field35912;
        if (field35912 == null) {
            return 0.0f;
        }
        Label_0277: {
            if (field35912 instanceof Class4710) {
                final Class4710 class4710 = (Class4710)field35912;
                switch (Class8145.field33550[this.ordinal()]) {
                    case 12: {
                        return class4710.field20304;
                    }
                    case 13: {
                        return class4710.field20305;
                    }
                    case 14: {
                        return class4710.field20306;
                    }
                    case 15: {
                        return class4710.field20307;
                    }
                    case 16: {
                        return class4710.field20308;
                    }
                    default: {
                        final LivingEntity field35913 = class4710.field20303;
                        if (field35913 == null) {
                            return 0.0f;
                        }
                        switch (Class8145.field33550[this.ordinal()]) {
                            case 1: {
                                return field35913.method2664();
                            }
                            case 2: {
                                return (float)field35913.field2938;
                            }
                            case 3: {
                                return (float)field35913.method2640();
                            }
                            case 4: {
                                return field35913.method2701();
                            }
                            case 5: {
                                return field35913.field2970;
                            }
                            case 6: {
                                return field35913.field2968;
                            }
                            case 7: {
                                return (float)field35913.getPosX();
                            }
                            case 8: {
                                return (float)field35913.getPosY();
                            }
                            case 9: {
                                return (float)field35913.getPosZ();
                            }
                            case 10: {
                                return (float)field35913.method2635();
                            }
                            case 11: {
                                return field35913.method2748(class4710.field20309);
                            }
                            default: {
                                break Label_0277;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return 0.0f;
    }
    
    public static Class338 method1016(final String anObject) {
        if (anObject != null) {
            for (int i = 0; i < Class338.field2082.length; ++i) {
                final Class338 class338 = Class338.field2082[i];
                if (class338.method1015().equals(anObject)) {
                    return class338;
                }
            }
            return null;
        }
        return null;
    }
    
    static {
        field2082 = values();
    }
}
