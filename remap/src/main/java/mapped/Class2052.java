// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public enum Class2052
{
    field11707, 
    field11708, 
    field11709, 
    field11710;
    
    public Class2052 method8141(final Class2052 class2052) {
        Label_0157: {
            switch (Class8513.field34925[class2052.ordinal()]) {
                case 3: {
                    switch (Class8513.field34925[this.ordinal()]) {
                        case 1: {
                            return Class2052.field11709;
                        }
                        case 2: {
                            return Class2052.field11710;
                        }
                        case 3: {
                            return Class2052.field11707;
                        }
                        case 4: {
                            return Class2052.field11708;
                        }
                        default: {
                            break Label_0157;
                        }
                    }
                    break;
                }
                case 4: {
                    switch (Class8513.field34925[this.ordinal()]) {
                        case 1: {
                            return Class2052.field11710;
                        }
                        case 2: {
                            return Class2052.field11707;
                        }
                        case 3: {
                            return Class2052.field11708;
                        }
                        case 4: {
                            return Class2052.field11709;
                        }
                        default: {
                            break Label_0157;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (Class8513.field34925[this.ordinal()]) {
                        case 1: {
                            return Class2052.field11708;
                        }
                        case 2: {
                            return Class2052.field11709;
                        }
                        case 3: {
                            return Class2052.field11710;
                        }
                        case 4: {
                            return Class2052.field11707;
                        }
                        default: {
                            break Label_0157;
                        }
                    }
                    break;
                }
            }
        }
        return this;
    }
    
    public Direction method8142(final Direction class179) {
        if (class179.getAxis() == Axis.Y) {
            return class179;
        }
        switch (Class8513.field34925[this.ordinal()]) {
            case 2: {
                return class179.rotateY();
            }
            case 3: {
                return class179.getOpposite();
            }
            case 4: {
                return class179.method784();
            }
            default: {
                return class179;
            }
        }
    }
    
    public int method8143(final int n, final int n2) {
        switch (Class8513.field34925[this.ordinal()]) {
            case 2: {
                return (n + n2 / 4) % n2;
            }
            case 3: {
                return (n + n2 / 2) % n2;
            }
            case 4: {
                return (n + n2 * 3 / 4) % n2;
            }
            default: {
                return n;
            }
        }
    }
    
    public static Class2052 method8144(final Random random) {
        final Class2052[] values = values();
        return values[random.nextInt(values.length)];
    }
    
    public static List<Class2052> method8145(final Random rnd) {
        final ArrayList arrayList = Lists.newArrayList((Object[])values());
        Collections.shuffle(arrayList, rnd);
        return arrayList;
    }
}