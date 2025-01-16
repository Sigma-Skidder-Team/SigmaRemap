// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;
import java.util.List;

public class Class9191
{
    private static String[] field38960;
    
    private static Class4479 method33627(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4, final Class1964 class180) {
        final int nextInt = random.nextInt(100);
        if (nextInt < 80) {
            if (nextInt < 70) {
                final MutableBoundingBox method13466 = Class4481.method13466(list, random, n, n2, n3, class179);
                if (method13466 != null) {
                    return new Class4481(n4, random, method13466, class179, class180);
                }
            }
            else {
                final MutableBoundingBox method13467 = Class4480.method13465(list, random, n, n2, n3, class179);
                if (method13467 != null) {
                    return new Class4480(n4, method13467, class179, class180);
                }
            }
        }
        else {
            final MutableBoundingBox method13468 = Class4483.method13469(list, random, n, n2, n3, class179);
            if (method13468 != null) {
                return new Class4483(n4, method13468, class179, class180);
            }
        }
        return null;
    }
    
    private static Class4479 method33628(final Class4473 class4473, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class4474, final int n4) {
        if (n4 > 8) {
            return null;
        }
        if (Math.abs(n - class4473.method13432().minX) <= 80 && Math.abs(n3 - class4473.method13432().minZ) <= 80) {
            final Class4479 method33627 = method33627(list, random, n, n2, n3, class4474, n4 + 1, ((Class4479)class4473).field19869);
            if (method33627 != null) {
                list.add(method33627);
                method33627.method13431(class4473, list, random);
            }
            return method33627;
        }
        return null;
    }
}
