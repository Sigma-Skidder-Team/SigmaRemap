// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class8755 extends Class8754
{
    private static String[] field36774;
    
    public Class8755(final Class8754 class8754, final Class1912 class8755) {
        super(method30314(class8754.method30291(), class8754.method30295(), class8755), class8754.method30293(), Class6225.method18530(class8754.method30291()), class8755, class8754.method30313());
    }
    
    private static int[] method30314(final int[] original, final Class1912 class1912, final Class1912 class1913) {
        final int[] copy = Arrays.copyOf(original, original.length);
        for (int i = 0; i < 4; ++i) {
            final Class9272 field39607 = Class9237.field39607;
            final int n = field39607.method34193() * i;
            final int n2 = field39607.method34198(2) / 4;
            copy[n + n2] = Float.floatToRawIntBits(class1913.method7499(class1912.method7530(Float.intBitsToFloat(original[n + n2]))));
            copy[n + n2 + 1] = Float.floatToRawIntBits(class1913.method7502(class1912.method7531(Float.intBitsToFloat(original[n + n2 + 1]))));
        }
        return copy;
    }
}
