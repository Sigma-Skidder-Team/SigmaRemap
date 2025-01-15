// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.apache.commons.lang3.RandomUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Class4609
{
    private static String[] field20074;
    private static final Class869 field20075;
    
    public static boolean method13665(final Class512 class512, final Class354 class513) {
        return method13680(class512, class513) < method13690();
    }
    
    public static final Class3833 method13666(final Class354 class354) {
        return Class4609.field20075.field4683.method6701(class354).method21696();
    }
    
    public static final Class3833 method13667(final double n, final double n2, final double n3) {
        return method13666(new Class354(n, n2, n3));
    }
    
    public static boolean method13668(final Class3833 class3833, final Class354 class3834) {
        final Class7702 method21727 = class3833.method11878().method21727(Class4609.field20075.field4683, class3834);
        if (!method13708(class3834)) {
            if (Class4609.field20075.field4683.method6957(Class4609.field20075.field4684, method21727)) {
                if (class3834.method1075() <= Class4609.field20075.field4684.method1894().method1075()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void method13669(final Class354 class354) {
        final double x = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395;
        final double y = class354.method1075() + 0.5 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892());
        final double y2 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397;
        final double x2 = Class9546.method35641(x * x + y2 * y2);
        final float n = (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f;
        final float n2 = (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793));
        Class869.method5277().field4684.field2399 += Class9546.method35668(n - Class869.method5277().field4684.field2399);
        Class869.method5277().field4684.field2400 += Class9546.method35668(n2 - Class869.method5277().field4684.field2400);
    }
    
    public static void method13670(final Class354 class354) {
        final double x = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395;
        final double y = class354.method1075() + 0.5 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892());
        final double y2 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397;
        Class869.method5277().method5269().method17292(new Class4356(Class869.method5277().field4684.field2399 + Class9546.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.field2399), Class869.method5277().field4684.field2400 + Class9546.method35668((float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.field2400), Class869.method5277().field4684.field2404));
    }
    
    public static float[] method13671(final Class354 class354) {
        final double x = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395;
        final double y = class354.method1075() - 0.25 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892());
        final double y2 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397;
        return new float[] { Class869.method5277().field4684.field2399 + Class9546.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.field2399), Class869.method5277().field4684.field2400 + Class9546.method35668((float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.field2400) };
    }
    
    public static float[] method13672(final Class354 class354, final Class179 class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
            case 5: {
                n3 += 0.0f;
            }
            case 6: {
                ++n3;
                break;
            }
        }
        final double x = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395 + n;
        final double y = class354.method1075() - 0.02 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892()) + n3;
        final double y2 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397 + n2;
        return new float[] { Class869.method5277().field4684.field2399 + Class9546.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.field2399), Class869.method5277().field4684.field2400 + Class9546.method35668((float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.field2400) };
    }
    
    public static float[] method13673(final Class354 class354, final Class179 class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = (float)(0.4000000059604645 + Math.random() * 0.10000000149011612);
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
            case 5: {
                final float n4 = 0.26f - (float)(Math.random() * 0.20000000298023224);
                final float n5 = 0.26f - (float)(Math.random() * 0.20000000298023224);
            }
            case 6: {
                n3 = 1.0f;
                n = 0.26f - (float)(Math.random() * 0.20000000298023224);
                n2 = 0.26f - (float)(Math.random() * 0.20000000298023224);
                break;
            }
        }
        if (n == 0.0f) {
            n = (float)(0.10000000149011612 - Math.sin((System.currentTimeMillis() - 500L) / 1200.0) * 0.2);
        }
        if (n2 == 0.0f) {
            n2 = (float)(0.10000000149011612 - Math.sin((System.currentTimeMillis() - 500L) / 1000.0) * 0.2);
        }
        if (n3 == 0.0f) {
            n3 = (float)(0.6000000238418579 - Math.sin((System.currentTimeMillis() - 500L) / 1600.0) * 0.2);
        }
        final double x = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395 + n;
        final double y = class354.method1075() - 0.02 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892()) + n3;
        final double y2 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397 + n2;
        return new float[] { Class869.method5277().field4684.field2399 + Class9546.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.field2399), Class869.method5277().field4684.field2400 + Class9546.method35668((float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.field2400) };
    }
    
    public static float method13674(final Class354 class354, final Class179 class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
        }
        final double n3 = class354.method1074() + 0.5 - Class869.method5277().field4684.field2395 + n;
        final double n4 = class354.method1076() + 0.5 - Class869.method5277().field4684.field2397 + n2;
        final double y = class354.method1075() - 0.02 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892()) + 1.0;
        final double y2 = class354.method1075() - 0.02 - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892());
        final double n5 = Class9546.method35641(n3 * n3 + n4 * n4);
        return (float)(-(Math.atan2(y2, n5) * 180.0 / 3.141592653589793)) - (float)(-(Math.atan2(y, n5) * 180.0 / 3.141592653589793));
    }
    
    public static List<Class354> method13675(final List<Class354> list) {
        list.sort((class354, class355) -> {
            method13680(Class4609.field20075.field4684, class354);
            method13680(Class4609.field20075.field4684, class355);
            final float n;
            final float n2;
            if (n <= n2) {
                if (n != n2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            else {
                return 1;
            }
        });
        return list;
    }
    
    public static List<Class354> method13676(final List<Class354> list, final Class5487 class5487) {
        list.sort((class5489, class5490) -> {
            method13681(class5488, class5489);
            method13681(class5488, class5490);
            final float n;
            final float n2;
            if (n <= n2) {
                if (n != n2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            else {
                return 1;
            }
        });
        return list;
    }
    
    public static List<Class354> method13677(final List<Class354> list, final Class5487 class5487, final boolean b) {
        if (!b) {
            method13676(list, class5487);
        }
        else {
            list.sort((class5489, class5490) -> (method13682(class5488, class5489) < method13682(class5488, class5490)) ? -1 : 1);
        }
        return list;
    }
    
    public static List<Class399> method13678(final List<Class399> list) {
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4447());
        return list;
    }
    
    public static List<Class512> method13679(final List<Class512> list) {
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4453());
        return list;
    }
    
    public static float method13680(final Class399 class399, final Class354 class400) {
        return method13683(class399, class400.method1074(), class400.method1075(), class400.method1076());
    }
    
    public static float method13681(final Class5487 class5487, final Class354 class5488) {
        return method13684(class5487, class5488.method1074(), class5488.method1075(), class5488.method1076());
    }
    
    public static float method13682(final Class5487 class5487, final Class354 class5488) {
        return method13685(class5487, class5488.method1074(), class5488.method1076());
    }
    
    public static float method13683(final Class399 class399, final double n, final double n2, final double n3) {
        return method13688((float)(class399.field2395 - n), (float)(class399.field2396 - n2), (float)(class399.field2397 - n3));
    }
    
    public static float method13684(final Class5487 class5487, final double n, final double n2, final double n3) {
        return method13688((float)(class5487.method16760() - n), (float)(class5487.method16761() - n2), (float)(class5487.method16762() - n3));
    }
    
    public static float method13685(final Class5487 class5487, final double n, final double n2) {
        return method13687((float)(class5487.method16760() - n), (float)(class5487.method16762() - n2));
    }
    
    public static float method13686(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return method13688((float)(n - n4), (float)(n2 - n5), (float)(n3 - n6));
    }
    
    private static float method13687(final float n, final float n2) {
        return Class9546.method35640((n - 0.5f) * (n - 0.5f) + (n2 - 0.5f) * (n2 - 0.5f));
    }
    
    private static float method13688(final float n, final float n2, final float n3) {
        return Class9546.method35640((n - 0.5f) * (n - 0.5f) + (n2 - 0.5f) * (n2 - 0.5f) + (n3 - 0.5f) * (n3 - 0.5f));
    }
    
    public static Class3833 method13689(final Class512 class512) {
        return method13666(class512.method1894().method1139());
    }
    
    public static float method13690() {
        return Class4609.field20075.field4682.method27315();
    }
    
    public static List<Class354> method13691(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = -n; n2 <= n; ++n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    list.add(new Class354(Class4609.field20075.field4684.field2395 + n3, Class4609.field20075.field4684.field2396 + n2, Class4609.field20075.field4684.field2397 + n4));
                }
            }
        }
        return list;
    }
    
    public static List<Class354> method13692(final double n, final double n2, final double n3) {
        final ArrayList list = new ArrayList();
        for (float n4 = -method13690(); n4 <= method13690(); ++n4) {
            for (float n5 = -method13690(); n5 <= method13690(); ++n5) {
                for (float n6 = -method13690(); n6 <= method13690(); ++n6) {
                    list.add(new Class354(n + n5, n2 + n4, n3 + n6));
                }
            }
        }
        return list;
    }
    
    public static List<Class354> method13693() {
        final ArrayList list = new ArrayList();
        final int n = 90;
        final int n2 = 10;
        for (float n3 = (float)(-n); n3 <= n; ++n3) {
            for (float n4 = (float)(-n2); n4 <= n2; ++n4) {
                for (float n5 = (float)(-n2); n5 <= n2; ++n5) {
                    final Class354 class354 = new Class354(Class4609.field20075.field4684.field2395 + n4, Class4609.field20075.field4684.field2396 + n3, Class4609.field20075.field4684.field2397 + n5);
                    if (Class4609.field20075.field4683.method6701(class354).method21696() instanceof Class3992) {
                        list.add(class354);
                    }
                }
            }
        }
        return list;
    }
    
    public static Class354 method13694(final float n, final float n2, final float n3) {
        final Class7005 method13697 = method13697(n, n2, n3);
        if (method13697 != null) {
            return method13697.method21447();
        }
        return null;
    }
    
    public static float[] method13695() {
        final Class7005 method13696 = method13696(Class7482.method23147() - 270.0f);
        if (method13696.method21449() != Class2165.field12880) {
            final double n = method13696.method21451().field22770 - method13696.method21447().method1074();
            final double n2 = method13696.method21451().field22772 - method13696.method21447().method1076();
            final double n3 = method13696.method21451().field22771 - method13696.method21447().method1075();
            final double x = method13696.method21447().method1074() - Class869.method5277().field4684.field2395 + n;
            final double y = method13696.method21447().method1075() - (Class869.method5277().field4684.field2396 + Class869.method5277().field4684.method1892()) + n3;
            final double y2 = method13696.method21447().method1076() - Class869.method5277().field4684.field2397 + n2;
            return new float[] { Class869.method5277().field4684.field2399 + Class9546.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.field2399), Class869.method5277().field4684.field2400 + Class9546.method35668((float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.field2400) };
        }
        return null;
    }
    
    public static Class7005 method13696(float n) {
        final Class5487 class5487 = new Class5487(Class4609.field20075.field4684.field4074, Class4609.field20075.field4684.field4075 - 0.800000011920929, Class4609.field20075.field4684.field4076);
        n = (float)Math.toRadians(n);
        final float n2 = 0.0f;
        final float n3 = -Class9546.method35638(n) * Class9546.method35639(n2);
        final float n4 = Class9546.method35639(n) * Class9546.method35639(n2);
        final float n5 = 2.3f;
        return Class4609.field20075.field4683.method6987(new Class8478(class5487, new Class5487(Class4609.field20075.field4684.field4074 + n3 * n5, Class4609.field20075.field4684.field4075 - 0.800000011920929 - (Class4609.field20075.field4684.field2967 ? 0.6f : 0.0f), Class4609.field20075.field4684.field4076 + n4 * n5), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7005 method13697(float n, float n2, float method27315) {
        final Class5487 class5487 = new Class5487(Class4609.field20075.field4684.field4074, Class4609.field20075.field4684.field4075 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -Class9546.method35638(n) * Class9546.method35639(n2);
        final float n4 = -Class9546.method35638(n2);
        final float n5 = Class9546.method35639(n) * Class9546.method35639(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.method6987(new Class8478(class5487, new Class5487(Class4609.field20075.field4684.field4074 + n3 * method27315, Class4609.field20075.field4684.field4075 + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n5 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7005 method13698(float n, float n2, float method27315, final Class5744 class5744) {
        final Class5487 class5745 = new Class5487(class5744.method17034(), Class4609.field20075.field4684.method1892() + class5744.method17036(), class5744.method17038());
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -Class9546.method35638(n) * Class9546.method35639(n2);
        final float n4 = -Class9546.method35638(n2);
        final float n5 = Class9546.method35639(n) * Class9546.method35639(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.method6987(new Class8478(class5745, new Class5487(Class4609.field20075.field4684.field4074 + n3 * method27315, Class4609.field20075.field4684.field4075 + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n5 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7006 method13699(float n, float n2, float method27315, final float n3) {
        final Class5487 class5487 = new Class5487(Class4609.field20075.field4684.field2395 + Math.cos(Class7482.method23147() * 3.141592653589793 / 180.0) * n3, Class4609.field20075.field4684.field2396 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field2397 + Math.sin(Class7482.method23147() * 3.141592653589793 / 180.0) * n3);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n4 = -Class9546.method35638(n) * Class9546.method35639(n2);
        final float n5 = -Class9546.method35638(n2);
        final float n6 = Class9546.method35639(n) * Class9546.method35639(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.method6987(new Class8478(class5487, new Class5487(Class4609.field20075.field4684.field4074 + n4 * method27315, Class4609.field20075.field4684.field4075 + n5 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n6 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7006 method13700(final Class354 class354) {
        return Class4609.field20075.field4683.method6987(new Class8478(new Class5487(Class4609.field20075.field4684.field2395, Class4609.field20075.field4684.field2396 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field2397), new Class5487(class354.method1074() + 0.5 + RandomUtils.nextDouble(0.01, 0.04), class354.method1075(), class354.method1076() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    private boolean method13701(final Class9052 class9052, float n, float n2) {
        final Class5487 class9053 = new Class5487(Class4609.field20075.field4684.field2395, Class4609.field20075.field4684.field2396 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field2397);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -Class9546.method35638(n) * Class9546.method35639(n2);
        final float n4 = -Class9546.method35638(n2);
        final float n5 = Class9546.method35639(n) * Class9546.method35639(n2);
        final float method27315 = Class4609.field20075.field4682.method27315();
        final Class7005 method27316 = Class4609.field20075.field4683.method6987(new Class8478(class9053, new Class5487(Class4609.field20075.field4684.field2395 + n3 * method27315, Class4609.field20075.field4684.field2396 + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field2397 + n5 * method27315), Class2040.field11633, Class2191.field13327, Class4609.field20075.method5303()));
        return method27316 != null && method27316.method21447().equals(class9052.field38320) && method27316.method21448() == class9052.field38321;
    }
    
    public static Class5487 method13702(final Class179 class179, final Class354 class180) {
        return new Class5487(class180.method1074() + (float)Math.max(0, class179.method785()) + ((class179.method785() != 0) ? 0.0f : ((float)Math.random())), class180.method1075() + ((class179.method786() != 0) ? 0.0f : ((class179.method786() != 1) ? ((float)Math.random()) : 1.0f)), class180.method1076() + (float)Math.max(0, class179.method787()) + ((class179.method787() != 0) ? 0.0f : ((float)Math.random())));
    }
    
    public static int method13703(final Class7096 class7096) {
        return ((List)class7096.method21696().method11876().method32902()).indexOf(class7096);
    }
    
    public static int method13704(final Class3833 class3833) {
        return Class90.field208.method504(class3833);
    }
    
    public static Class9301 method13705(final Class354 class354, final boolean b) {
        final Class352[] array = { new Class352(0, 0, 0), new Class352(-1, 0, 0), new Class352(1, 0, 0), new Class352(0, 0, 1), new Class352(0, 0, -1) };
        for (final Class9370 class355 : new Class9370[] { new Class9370(1, 1, 1, false), new Class9370(2, 1, 2, false), new Class9370(3, 1, 3, false), new Class9370(4, 1, 4, false), new Class9370(0, -1, 0, true) }) {
            for (final Class352 class356 : array) {
                final Class352 class357 = class355.field40185 ? new Class352(class356.method1074() + class355.field40182, class356.method1075() + class355.field40183, class356.method1076() + class355.field40184) : new Class352(class356.method1074() * class355.field40182, class356.method1075() * class355.field40183, class356.method1076() * class355.field40184);
                for (final Class179 class358 : Class179.values()) {
                    if (class358 != Class179.field511 || !b) {
                        if (method13708(class354.method1135(class357).method1150(class358, -1))) {
                            return new Class9301(class354.method1135(class357).method1150(class358, -1), class358);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static List<Class354> method13706(final Class354 class354) {
        final ArrayList list = new ArrayList();
        final float n = method13690() - 3.0f;
        for (float n2 = -n; n2 < 1.0f; ++n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final Class354 method1133 = class354.method1133(n3, n2, n4);
                    if (Class4609.field20075.field4684.method1941() >= method1133.method1075()) {
                        list.add(method1133);
                    }
                }
            }
        }
        return list;
    }
    
    public static Class9301 method13707(final Class354 class354, final boolean b, final boolean b2) {
        method13690();
        for (final Class354 class355 : method13677(method13706(class354), new Class5487(Class4609.field20075.field4684.field2395, Class4609.field20075.field4684.field2396, Class4609.field20075.field4684.field2397), b2)) {
            for (final Class179 class356 : Class179.values()) {
                if (class356 != Class179.field511 || !b) {
                    if (!method13708(class355)) {
                        if (method13708(class355.method1150(class356, -1))) {
                            return new Class9301(class355.method1150(class356, -1), class356);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static boolean method13708(final Class354 class354) {
        if (class354 != null) {
            final Class3833 method21696 = Class4609.field20075.field4683.method6701(class354).method21696();
            return (method21696.method11806(method21696.method11878()) || !method21696.method11782(method21696.method11878()).method26442()) && (!(method21696 instanceof Class4030) || method13703(Class4609.field20075.field4683.method6701(class354)) != 0);
        }
        return false;
    }
    
    public static float[] method13709(final float n, final float n2, final Class9301 class9301) {
        final Class7005 method13697 = method13697(n, n2, Class4609.field20075.field4682.method27315());
        if (method13697 != null && method13697.method21447().equals(class9301.field39906)) {
            return new float[] { n, n2 };
        }
        final float n3 = method13671(class9301.field39906)[0];
        final Class5487 class9302 = new Class5487(class9301.field39906.method1074() + 0.5, class9301.field39906.method1075() + 0.5, class9301.field39906.method1076() + 0.5);
        final float n4 = (n3 + 90.0f) * 0.017453292f;
        final Class5487 method13698 = class9302.method16744(-Class9546.method35638(n4) / 2.1, 0.0, Class9546.method35639(n4) / 2.1);
        final float[] method13699 = Class8845.method30919(method13698.field22770, method13698.field22772, method13698.field22771);
        final float n5 = method13699[0];
        final float n6 = method13699[1];
        final float n7 = (n3 - 90.0f) * 0.017453292f;
        final Class5487 method13700 = new Class5487(class9301.field39906.method1074() + 0.5, class9301.field39906.method1075() + 0.5, class9301.field39906.method1076() + 0.5).method16744(-Class9546.method35638(n7) / 2.1, 0.0, Class9546.method35639(n7) / 2.1);
        final float[] method13701 = Class8845.method30919(method13700.field22770, method13700.field22772, method13700.field22771);
        final float n8 = method13701[0];
        final float n9 = method13701[1];
        if (Math.abs(Class8845.method30917(Class9546.method35668(n), Class9546.method35668(n5))) >= Math.abs(Class8845.method30917(Class9546.method35668(n), Class9546.method35668(n8)))) {
            return new float[] { n8, n9 };
        }
        return new float[] { n5, n6 };
    }
    
    public static Class179 method13710(final Class354 class354) {
        Class179 class355 = Class179.field512;
        final float method35668 = Class9546.method35668(method13711(class354, Class179.field512)[0]);
        Label_0072: {
            if (method35668 >= 45.0f && method35668 <= 135.0f) {
                class355 = Class179.field516;
            }
            else if ((method35668 < 135.0f || method35668 > 180.0f) && (method35668 > -135.0f || method35668 < -180.0f)) {
                if (method35668 <= -45.0f && method35668 >= -135.0f) {
                    class355 = Class179.field515;
                }
                else {
                    if (method35668 < -45.0f || method35668 > 0.0f) {
                        if (method35668 > 45.0f) {
                            break Label_0072;
                        }
                        if (method35668 < 0.0f) {
                            break Label_0072;
                        }
                    }
                    class355 = Class179.field513;
                }
            }
            else {
                class355 = Class179.field514;
            }
        }
        if (Class9546.method35668(method13711(class354, Class179.field512)[1]) > 75.0f || Class9546.method35668(method13711(class354, Class179.field512)[1]) < -75.0f) {
            class355 = Class179.field512;
        }
        return class355;
    }
    
    public static float[] method13711(final Class354 class354, final Class179 class355) {
        final double x = class354.method1074() + 0.5 - Class4609.field20075.field4684.field2395 + class355.method785() / 2.0;
        final double y = class354.method1076() + 0.5 - Class4609.field20075.field4684.field2397 + class355.method787() / 2.0;
        final double y2 = Class4609.field20075.field4684.field2396 + Class4609.field20075.field4684.method1892() - (class354.method1075() + 0.5);
        final double x2 = Class9546.method35641(x * x + y * y);
        float n = (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f;
        final float n2 = (float)(Math.atan2(y2, x2) * 180.0 / 3.141592653589793);
        if (n < 0.0f) {
            n += 360.0f;
        }
        return new float[] { n, n2 };
    }
    
    private float method13712(final Class399 class399, final Class354 class400) {
        final float n = 6.0f;
        final float n2 = class400.method1074() + 0.5f;
        final float n3 = class400.method1075() + 1.0f;
        final float n4 = class400.method1076() + 0.5f;
        final float n5 = n * 2.0f;
        final Class5487 class401 = new Class5487(n2, n3, n4);
        if (!class399.method1899()) {
            final double n6 = Class9546.method35641(class399.method1735(class401)) / n5;
            if (n6 <= 1.0) {
                final double n7 = class399.method1938() - n2;
                final double n8 = class399.method1944() - n3;
                final double n9 = class399.method1945() - n4;
                if (Class9546.method35641(n7 * n7 + n8 * n8 + n9 * n9) != 0.0) {
                    final double n10 = (1.0 - n6) * Class6154.method18407(class401, class399);
                    return (float)(int)((n10 * n10 + n10) / 2.0 * 7.0 * n5 + 1.0);
                }
            }
        }
        return 0.0f;
    }
    
    static {
        field20075 = Class869.method5277();
    }
}
