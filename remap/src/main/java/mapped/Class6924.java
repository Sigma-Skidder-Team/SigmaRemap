// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.List;

public class Class6924
{
    private static String[] field27135;
    private static final Class7315[] field27136;
    private static List<Class7315> field27137;
    private static Class<? extends Class4500> field27138;
    private static int field27139;
    private static final Class6862 field27140;
    
    public static void method21291() {
        Class6924.field27137 = Lists.newArrayList();
        for (final Class7315 class7315 : Class6924.field27136) {
            class7315.field28301 = 0;
            Class6924.field27137.add(class7315);
        }
        Class6924.field27138 = null;
    }
    
    private static boolean method21292() {
        boolean b = false;
        Class6924.field27139 = 0;
        for (final Class7315 class7315 : Class6924.field27137) {
            if (class7315.field28302 > 0) {
                if (class7315.field28301 < class7315.field28302) {
                    b = true;
                }
            }
            Class6924.field27139 += class7315.field28300;
        }
        return b;
    }
    
    private static Class4500 method21293(final Class<? extends Class4500> clazz, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        Class4500 class180 = null;
        if (clazz != Class4513.class) {
            if (clazz != Class4502.class) {
                if (clazz != Class4504.class) {
                    if (clazz != Class4505.class) {
                        if (clazz != Class4509.class) {
                            if (clazz != Class4512.class) {
                                if (clazz != Class4506.class) {
                                    if (clazz != Class4511.class) {
                                        if (clazz != Class4510.class) {
                                            if (clazz != Class4501.class) {
                                                if (clazz == Class4508.class) {
                                                    class180 = Class4508.method13503(list, n, n2, n3, class179, n4);
                                                }
                                            }
                                            else {
                                                class180 = Class4501.method13498(list, random, n, n2, n3, class179, n4);
                                            }
                                        }
                                        else {
                                            class180 = Class4510.method13505(list, random, n, n2, n3, class179, n4);
                                        }
                                    }
                                    else {
                                        class180 = Class4511.method13506(list, random, n, n2, n3, class179, n4);
                                    }
                                }
                                else {
                                    class180 = Class4506.method13502(list, random, n, n2, n3, class179, n4);
                                }
                            }
                            else {
                                class180 = Class4512.method13507(list, random, n, n2, n3, class179, n4);
                            }
                        }
                        else {
                            class180 = Class4509.method13504(list, random, n, n2, n3, class179, n4);
                        }
                    }
                    else {
                        class180 = Class4505.method13501(list, random, n, n2, n3, class179, n4);
                    }
                }
                else {
                    class180 = Class4504.method13500(list, random, n, n2, n3, class179, n4);
                }
            }
            else {
                class180 = Class4502.method13499(list, random, n, n2, n3, class179, n4);
            }
        }
        else {
            class180 = Class4513.method13508(list, random, n, n2, n3, class179, n4);
        }
        return class180;
    }
    
    private static Class4500 method21294(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class4508, final int n4) {
        if (method21292()) {
            if (Class6924.field27138 != null) {
                final Class4500 method21293 = method21293(Class6924.field27138, list, random, n, n2, n3, class4508, n4);
                Class6924.field27138 = null;
                if (method21293 != null) {
                    return method21293;
                }
            }
            int i = 0;
            while (i < 5) {
                ++i;
                int nextInt = random.nextInt(Class6924.field27139);
                for (final Class7315 field19903 : Class6924.field27137) {
                    nextInt -= field19903.field28300;
                    if (nextInt >= 0) {
                        continue;
                    }
                    if (!field19903.method22432(n4)) {
                        break;
                    }
                    if (field19903 == class4507.field19903) {
                        break;
                    }
                    final Class4500 method21294 = method21293(field19903.field28299, list, random, n, n2, n3, class4508, n4);
                    if (method21294 == null) {
                        continue;
                    }
                    final Class7315 class4509 = field19903;
                    ++class4509.field28301;
                    class4507.field19903 = field19903;
                    if (!field19903.method22433()) {
                        Class6924.field27137.remove(field19903);
                    }
                    return method21294;
                }
            }
            final MutableBoundingBox method21295 = Class4514.method13509(list, random, n, n2, n3, class4508);
            return (method21295 != null && method21295.minY > 1) ? new Class4514(n4, method21295, class4508) : null;
        }
        return null;
    }
    
    private static Class4473 method21295(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class4508, final int n4) {
        if (n4 > 50) {
            return null;
        }
        if (Math.abs(n - class4507.method13432().minX) <= 112 && Math.abs(n3 - class4507.method13432().minZ) <= 112) {
            final Class4500 method21294 = method21294(class4507, list, random, n, n2, n3, class4508, n4 + 1);
            if (method21294 != null) {
                list.add(method21294);
                class4507.field19905.add(method21294);
            }
            return method21294;
        }
        return null;
    }
    
    static {
        field27136 = new Class7315[] { new Class7315(Class4513.class, 40, 0), new Class7315(Class4502.class, 5, 5), new Class7315(Class4504.class, 20, 0), new Class7315(Class4505.class, 20, 0), new Class7315(Class4509.class, 10, 6), new Class7315(Class4512.class, 5, 5), new Class7315(Class4506.class, 5, 5), new Class7315(Class4511.class, 5, 4), new Class7315(Class4510.class, 5, 4), new Class7314(Class4501.class, 10, 2), new Class7316(Class4508.class, 20, 1) };
        field27140 = new Class6862(null);
    }
}
