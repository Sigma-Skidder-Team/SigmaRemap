// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class Class8639
{
    private static String[] field36239;
    private static final Class869 field36240;
    
    public static boolean method29316(final int n) {
        final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(n).method20053();
        return method20053 == null || method20053.method27622() instanceof Class4099;
    }
    
    public static int method29317() {
        float n = 0.0f;
        int n2 = -1;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27695()) {
                    final float n3 = method20053.method27622().method11744().method32745() * method20053.field34176;
                    if (n3 > n) {
                        n2 = i;
                        n = n3;
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29318(final Class<? extends Class3820> clazz) {
        int n = 0;
        int n2 = -1;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (clazz.isInstance(method20053.method27622())) {
                    final int field34176 = method20053.field34176;
                    if (field34176 > n) {
                        n2 = i;
                        n = field34176;
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29319(final Class3820 class3820) {
        int n = 0;
        int n2 = -1;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27622() == class3820) {
                    final int field34176 = method20053.field34176;
                    if (field34176 > n) {
                        n2 = i;
                        n = field34176;
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29320(final Class3820... array) {
        int n = 0;
        int n2 = -1;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                for (int length = array.length, j = 0; j < length; ++j) {
                    if (method20053.method27622() == array[j]) {
                        final int field34176 = method20053.field34176;
                        if (field34176 > n) {
                            n2 = i;
                            n = field34176;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29321(final Class<? extends Class3820> clazz, final int... array) {
        int n = 0;
        int n2 = -1;
        final List<int[]> list = Arrays.asList(new int[][] { array });
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (clazz.isInstance(method20053.method27622())) {
                    if (!list.contains(Class3820.method11696(method20053.method27622()))) {
                        final int field34176 = method20053.field34176;
                        if (field34176 > n) {
                            n2 = i;
                            n = field34176;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29322(final int n) {
        int n2 = 0;
        int n3 = -1;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (Class3820.method11696(method20053.method27622()) == n) {
                    final int field34176 = method20053.field34176;
                    if (field34176 > n2) {
                        n3 = i;
                        n2 = field34176;
                    }
                }
            }
        }
        return n3;
    }
    
    public static void method29323(final int n, final int n2, final boolean b) {
        Class8639.field36240.field4682.method27324(Class8639.field36240.field4684.field3008.field16154, n, n2, b ? Class2133.field12438 : Class2133.field12441, Class8639.field36240.field4684);
    }
    
    public static void method29324(final int n) {
        Class8639.field36240.field4682.method27324(Class8639.field36240.field4684.field3008.field16154, n, 1, Class2133.field12439, Class8639.field36240.field4684);
    }
    
    public static boolean method29325(final Class4055 class4055, final byte b) {
        if (b != 5 || !method29326(class4055)) {
            if (b != 6 || !method29327(class4055)) {
                if (b != 7 || !method29328(class4055)) {
                    if (b != 8 || !method29329(class4055)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method29326(final Class4055 class4055) {
        return class4055.method12257() == Class2215.field13605;
    }
    
    public static boolean method29327(final Class4055 class4055) {
        return class4055.method12257() == Class2215.field13604;
    }
    
    public static boolean method29328(final Class4055 class4055) {
        return class4055.method12257() == Class2215.field13603;
    }
    
    public static boolean method29329(final Class4055 class4055) {
        return class4055.method12257() == Class2215.field13602;
    }
    
    public static int method29330() {
        int n = -1;
        float n2 = -1.0f;
        for (int i = 9; i <= 44; ++i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27622() instanceof Class4077) {
                    final float n3 = ((Class4077)method20053.method27622()).method12281() + Class8742.method30195(Class7882.field32358, method20053) + Class8742.method30195(Class7882.field32362, method20053);
                    if (n3 <= n2) {
                        if (n3 != n2) {
                            continue;
                        }
                        if (i != 36) {
                            continue;
                        }
                    }
                    n = i;
                    n2 = n3;
                }
            }
        }
        return n;
    }
    
    public static int method29331() {
        return method29334(Class3833.method11775(1));
    }
    
    public static int method29332() {
        return method29334(Class3833.method11775(5));
    }
    
    public static int method29333() {
        return method29334(Class3833.method11775(3));
    }
    
    public static int method29334(final Class7096 class7096) {
        int n = -1;
        float n2 = 1.0f;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (method20053 != null) {
                float n3;
                if (class7096 == null) {
                    if (!(method20053.method27622() instanceof Class4077)) {
                        continue;
                    }
                    n3 = ((Class4077)method20053.method27622()).method12281();
                }
                else {
                    n3 = method20053.method27624(class7096);
                }
                if (n3 > n2) {
                    n = i;
                    n2 = n3;
                }
            }
        }
        return n;
    }
    
    public static int method29335(final Class<? extends Class3820> clazz) {
        int n = 0;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (clazz.isInstance(method20053.method27622())) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    public static int method29336(final Class<? extends Class3820> clazz) {
        int field34176 = 64;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (clazz.isInstance(method20053.method27622())) {
                    if (method20053.field34176 < field34176) {
                        field34176 = method20053.field34176;
                    }
                }
            }
        }
        return field34176;
    }
    
    public static int method29337(final Class<? extends Class3820> clazz) {
        final HashSet set = new HashSet();
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (clazz.isInstance(method20053.method27622())) {
                    set.add(i);
                }
            }
        }
        return set.size();
    }
    
    public static int method29338() {
        int n = -1;
        float n2 = -1.0f;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27622() instanceof Class4087) {
                    final float n3 = (float)Class8742.method30195(Class7882.field32369, method20053);
                    if (n3 > n2) {
                        n = i;
                        n2 = n3;
                    }
                }
            }
        }
        return n;
    }
    
    public static int method29339(final Class<? extends Class3820> clazz) {
        int n = 0;
        int n2 = -1;
        for (int i = 0; i < 9; ++i) {
            final ItemStack method2157 = Class8639.field36240.field4684.field3006.method2157(i);
            if (method2157 != null) {
                if (clazz.isInstance(method2157.method27622())) {
                    final int field34176 = method2157.field34176;
                    if (field34176 > n) {
                        n2 = i;
                        n = field34176;
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29340(final Class3820... array) {
        int n = 0;
        int n2 = -1;
        for (int i = 0; i < 9; ++i) {
            final ItemStack method2157 = Class8639.field36240.field4684.field3006.method2157(i);
            if (method2157 != null) {
                for (int length = array.length, j = 0; j < length; ++j) {
                    if (method2157.method27622() == array[j]) {
                        final int field34176 = method2157.field34176;
                        if (field34176 > n) {
                            n2 = i;
                            n = field34176;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29341(final Class<? extends Class3820> clazz, final int... array) {
        int n = 0;
        int n2 = -1;
        final List<int[]> list = Arrays.asList(new int[][] { array });
        for (int i = 0; i < 9; ++i) {
            final ItemStack method2157 = Class8639.field36240.field4684.field3006.method2157(i);
            if (method2157 != null) {
                if (clazz.isInstance(method2157.method27622())) {
                    if (!list.contains(Class3820.method11696(method2157.method27622()))) {
                        final int field34176 = method2157.field34176;
                        if (field34176 > n) {
                            n2 = i;
                            n = field34176;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static int method29342(final int n) {
        int n2 = 0;
        int n3 = -1;
        for (int i = 0; i < 9; ++i) {
            final ItemStack method2157 = Class8639.field36240.field4684.field3006.method2157(i);
            if (method2157 != null) {
                if (Class3820.method11696(method2157.method27622()) == n) {
                    final int field34176 = method2157.field34176;
                    if (field34176 > n2) {
                        n3 = i;
                        n2 = field34176;
                    }
                }
            }
        }
        return n3;
    }
    
    public static int method29343() {
        for (int i = 0; i < 9; ++i) {
            if (Class8639.field36240.field4684.field3006.method2157(i) == null) {
                return i;
            }
        }
        return 0;
    }
    
    public static boolean method29344(final int n) {
        return method29345(Class8639.field36240.field4684.field3008.method10878(n).method20053());
    }
    
    public static boolean method29345(final ItemStack class8321) {
        if (!(class8321.method27622() instanceof Class4055)) {
            return false;
        }
        final Class4055 class8322 = (Class4055)class8321.method27622();
        final int method29347 = method29347(class8321);
        if (method29326(class8322)) {
            return method29347 > method29346(5);
        }
        if (method29327(class8322)) {
            return method29347 > method29346(6);
        }
        if (!method29328(class8322)) {
            return method29329(class8322) && method29347 > method29346(8);
        }
        return method29347 > method29346(7);
    }
    
    public static int method29346(final int n) {
        if (Class8639.field36240.field4684.field3008.method10878(n).method20053() == null) {
            return 0;
        }
        if (Class8639.field36240.field4684.field3008.method10878(n).method20053().method27622() instanceof Class4055) {
            return ((Class4055)Class8639.field36240.field4684.field3008.method10878(n).method20053().method27622()).field18149 + Class8742.method30195(Class6257.method18590(0), Class8639.field36240.field4684.field3008.method10878(n).method20053());
        }
        return 0;
    }
    
    public static int method29347(final ItemStack class8321) {
        if (class8321 == null) {
            return 0;
        }
        if (class8321.method27622() instanceof Class4055) {
            return ((Class4055)class8321.method27622()).field18149 + Class8742.method30195(Class7882.field32347, class8321);
        }
        return 0;
    }
    
    public static int method29348(final Class512 class512) {
        int n = 0;
        for (int i = 5; i <= 8; i = (byte)(i + 1)) {
            n += method29347(class512.field3006.method2157(i));
        }
        return n;
    }
    
    public static float method29349(final Class512 class512) {
        final float n = (float)method29348(class512);
        final float n2 = 0.0f;
        final float method29350 = method29350(class512.method2713());
        return method29350 * (1.0f - Math.min(20.0f, Math.max(n / 5.0f, n - method29350 / (n2 / 4.0f + 2.0f))) / 25.0f);
    }
    
    public static float method29350(final ItemStack class8321) {
        if (class8321 != null && class8321.method27622() instanceof Class4077) {
            return ((Class4077)class8321.method27622()).method12281() + Class8742.method30195(Class7882.field32358, class8321) + Class8742.method30195(Class7882.field32362, class8321);
        }
        return 1.0f;
    }
    
    public static float method29351(final ItemStack class8321) {
        if (class8321 == null) {
            return -1.0f;
        }
        final Class3820 method27622 = class8321.method27622();
        if (method27622 instanceof Class4077) {
            return 2.0f;
        }
        if (method27622 instanceof Class3821) {
            return 1.5f;
        }
        if (method27622 instanceof Class4101) {
            return 1.5f;
        }
        if (method27622 instanceof Class4072) {
            return 1.5f;
        }
        if (method27622 instanceof Class4087) {
            return 1.5f;
        }
        if (method27622 instanceof Class4089) {
            return 1.25f;
        }
        if (method27622 instanceof Class4036) {
            return 1.0f;
        }
        if (class8321.method27695() && class8321.method27622().method11744() == Class9582.field41767) {
            return 1.0f;
        }
        if (method27622 instanceof Class4097) {
            return 1.0f;
        }
        if (class8321.method27695()) {
            return 0.5f;
        }
        if (method27622 instanceof Class4033) {
            return 0.25f;
        }
        if (!(method27622 instanceof Class4048)) {
            return 0.0f;
        }
        return 0.25f;
    }
    
    public static HashMap<Integer, Float> method29352() {
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < 9; ++i) {
            hashMap.put(i, method29351(Class8639.field36240.field4684.field3006.method2157(i)) * ((Class8639.field36240.field4684.field3006.field2743 != i) ? 1 : 2));
        }
        return hashMap;
    }
    
    public static int method29353() {
        final HashMap<Integer, Float> method29352 = method29352();
        final TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        treeMap.putAll(method29352);
        Map.Entry<Integer, Float> entry = null;
        for (final Map.Entry<Integer, Float> entry2 : treeMap.entrySet()) {
            if (entry != null && entry.getValue() <= entry2.getValue()) {
                continue;
            }
            entry = entry2;
        }
        return entry.getKey();
    }
    
    public static int method29354(final int n) {
        final int method29353 = method29353();
        method29366(Class8639.field36240.field4684.field3008.field16154, n, method29353, Class2133.field12439, Class8639.field36240.field4684);
        return method29353;
    }
    
    public static List<Class1948> method29355(final ItemStack class8321) {
        if (class8321 == null) {
            return null;
        }
        if (class8321.method27622() instanceof Class4089) {
            return Class5333.method16465(class8321);
        }
        return null;
    }
    
    public static boolean method29356(final ItemStack class8321) {
        return class8321 != null && class8321.method27622() instanceof Class4091;
    }
    
    public static float method29357(final ItemStack class8321) {
        final List<Class1948> method29355 = method29355(class8321);
        if (method29355 != null) {
            float n = 0.0f;
            for (final Class1948 class8322 : method29355) {
                if (class8322.method7906() == Class9439.field40479) {
                    n = (float)(class8322.method7908() + 1);
                }
                if (class8322.method7906() != Class9439.field40483) {
                    if (class8322.method7906() != Class9439.field40480) {
                        continue;
                    }
                    n = (float)(-class8322.method7908() + 1);
                }
                else {
                    n = (class8322.method7908() + 1) / 2.0f;
                }
            }
            return n;
        }
        return 0.0f;
    }
    
    public static float method29358(final ItemStack class8321) {
        final List<Class1948> method29355 = method29355(class8321);
        if (method29355 != null) {
            float n = 0.0f;
            for (final Class1948 class8322 : method29355) {
                if (class8322.method7906() != Class9439.field40474) {
                    if (class8322.method7906() != Class9439.field40475) {
                        continue;
                    }
                    n = (float)(-class8322.method7908() + 1);
                }
                else {
                    n = (float)(class8322.method7908() + 1);
                }
            }
            return n;
        }
        return 0.0f;
    }
    
    public static HashMap<Integer, ItemStack> method29359() {
        final HashMap hashMap = new HashMap();
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27622() instanceof Class4089) {
                    hashMap.put(i, method20053);
                }
            }
        }
        return hashMap;
    }
    
    public static HashMap<Integer, ItemStack> method29360() {
        final HashMap hashMap = new HashMap();
        for (int i = 44; i >= 9; --i) {
            hashMap.put(i, Class8639.field36240.field4684.field3008.method10878(i).method20053());
        }
        return hashMap;
    }
    
    public static boolean method29361(final Class<? extends Class3820> clazz) {
        for (final Map.Entry<K, Object> entry : method29360().entrySet()) {
            if (entry != null) {
                if (!clazz.isInstance(entry.getValue())) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean method29362(final int n) {
        return n > 35;
    }
    
    public static ItemStack method29363(final int n) {
        return Class8639.field36240.field4684.field3008.method10878(n).method20053();
    }
    
    public static boolean method29364(final ItemStack class8321) {
        if (class8321 == null) {
            return false;
        }
        if (!class8321.method27695()) {
            return false;
        }
        final float n = class8321.method27622().method11744().method32745() * class8321.field34176;
        final int method29317 = method29317();
        if (method29317 != -1) {
            final ItemStack method29318 = method29363(method29317);
            return n > method29318.method27622().method11744().method32745() * method29318.field34176;
        }
        return true;
    }
    
    public static boolean method29365(final ItemStack class8321) {
        if (class8321 == null) {
            return false;
        }
        if (class8321.method27622() instanceof Class3824) {
            final int method29318 = method29318(Class3824.class);
            return method29318 == -1 || class8321.field34176 > method29363(method29318).field34176;
        }
        return false;
    }
    
    public static ItemStack method29366(final int n, final int n2, final int n3, final Class2133 class2133, final Class512 class2134) {
        return method29367(n, n2, n3, class2133, class2134, false);
    }
    
    public static ItemStack method29367(final int n, final int n2, final int n3, final Class2133 class2133, final Class512 class2134, final boolean b) {
        ItemStack method27641 = null;
        if (n2 >= 0) {
            method27641 = class2134.field3009.method10878(n2).method20053().method27641();
        }
        final short method27642 = class2134.field3009.method10885(Class8639.field36240.field4684.field3006);
        final ItemStack method27643 = class2134.field3009.method10879(n2, n3, class2133, class2134);
        Label_0097: {
            if (method27641 != null) {
                if (Class9367.field40167.method25613() <= Class7906.field32460.method25613() || b) {
                    if (class2133 != Class2133.field12439) {
                        break Label_0097;
                    }
                }
            }
            method27641 = method27643;
        }
        Class8639.field36240.method5269().method17292(new Class4256(n, n2, n3, class2133, method27641, method27642));
        return method27643;
    }
    
    public static void method29368(final int n) {
        Class8639.field36240.field4682.method27324(Class8639.field36240.field4684.field3008.field16154, n, 1, Class2133.field12441, Class8639.field36240.field4684);
    }
    
    public static boolean method29369(final ItemStack class8321) {
        if (class8321 != null && class8321.method27622() instanceof Class4055) {
            final float n = (float)method29347(class8321);
            for (int i = 5; i < 45; ++i) {
                if (Class8639.field36240.field4684.field3008.method10878(i).method20054()) {
                    final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
                    final Class3820 method20054 = method20053.method27622();
                    if (method20054 instanceof Class4055) {
                        final Class4055 class8322 = (Class4055)method20054;
                        if (method29347(method20053) > n) {
                            if (class8322.method12257() == ((Class4055)class8321.method27622()).method12257()) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static void method29370(final int n, final int n2) {
        Class8639.field36240.field4682.method27324(Class8639.field36240.field4684.field3008.field16154, n, n2, Class2133.field12439, Class8639.field36240.field4684);
    }
    
    public static boolean method29371(final ItemStack class8321) {
        if (class8321 != null) {
            if (class8321.method27622() instanceof Class4089) {
                for (final Class1948 class8322 : method29355(class8321)) {
                    if (class8322.method7906() != Class9439.field40492) {
                        if (class8322.method7906() != Class9439.field40480) {
                            if (class8322.method7906() != Class9439.field40475) {
                                if (class8322.method7906() != Class9439.field40491) {
                                    continue;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean method29372() {
        for (final Class6601 class6601 : Class8639.field36240.field4684.field3008.field16151) {
            if (class6601.method20054()) {
                continue;
            }
            if (class6601.field26174 <= 8) {
                continue;
            }
            if (class6601.field26174 >= 45) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public static boolean method29373(final ItemStack class8321) {
        return class8321 != null && !class8321.method27622().equals(Class7739.field30754);
    }
    
    public static List<ItemStack> method29374(final Class512 class512) {
        final ArrayList list = new ArrayList();
        for (final Class6601 class513 : class512.field3008.field16151) {
            if (!method29373(class513.method20053())) {
                continue;
            }
            list.add(class513.method20053());
        }
        return list;
    }
    
    public static int method29375(final Class3820 class3820) {
        int n = 0;
        for (int i = 44; i >= 9; --i) {
            final ItemStack method20053 = Class8639.field36240.field4684.field3008.method10878(i).method20053();
            if (!method29316(i)) {
                if (method20053.method27622() == class3820) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    static {
        field36240 = Class869.method5277();
    }
}
