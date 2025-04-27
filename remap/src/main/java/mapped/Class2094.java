// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public enum Class2094
{
    field12105(0), 
    field12106(1), 
    field12107(2), 
    field12108(3);
    
    private final int field12109;
    
    public static Class2094 method8211(final int n) throws AACException {
        Class2094 class2094 = null;
        switch (n) {
            case 0: {
                class2094 = Class2094.field12105;
                break;
            }
            case 1: {
                class2094 = Class2094.field12106;
                break;
            }
            case 2: {
                class2094 = Class2094.field12107;
                break;
            }
            case 3: {
                class2094 = Class2094.field12108;
                break;
            }
            default: {
                throw new Class2348("unknown MS mask type");
            }
        }
        return class2094;
    }
    
    Class2094(final int field12109) {
        this.field12109 = field12109;
    }
}
