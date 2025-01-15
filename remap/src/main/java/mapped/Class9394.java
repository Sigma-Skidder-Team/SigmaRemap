// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9394
{
    private static String[] field40300;
    
    public static Class9469 method34925(final Class2067 class2067) {
        switch (Class9428.field40437[class2067.ordinal()]) {
            case 1: {
                return new Class9469(0, -1);
            }
            case 2: {
                return new Class9469(0, 1);
            }
            case 3: {
                return new Class9469(-1, 0);
            }
            default: {
                return new Class9469(1, 0);
            }
        }
    }
}
