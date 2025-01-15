// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public enum Class303
{
    field1764, 
    field1765, 
    field1766, 
    field1767;
    
    public static Class303 method961(final int n) throws AACException {
        Class303 class303 = null;
        switch (n) {
            case 0: {
                class303 = Class303.field1764;
                break;
            }
            case 1: {
                class303 = Class303.field1765;
                break;
            }
            case 2: {
                class303 = Class303.field1766;
                break;
            }
            case 3: {
                class303 = Class303.field1767;
                break;
            }
            default: {
                throw new Class2348("unknown window sequence type");
            }
        }
        return class303;
    }
}
