// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;

public class Class9352
{
    public static final Map<Class9334, Int2ObjectMap<Class7954[]>> field40128;
    public static final Int2ObjectMap<Class7954[]> field40129;
    
    private static Int2ObjectMap<Class7954[]> method34667(final ImmutableMap<Integer, Class7954[]> immutableMap) {
        return (Int2ObjectMap<Class7954[]>)new Int2ObjectOpenHashMap((Map)immutableMap);
    }
    
    static {
        field40128 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(Class9334.field40065, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31315, 20, 16, 2), new Class7955(Class7739.field31518, 26, 16, 2), new Class7955(Class7739.field31517, 22, 16, 2), new Class7955(Class7739.field31575, 15, 16, 2), new Class7961(Class7739.field31316, 1, 6, 16, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7521.field29337, 6, 12, 10), new Class7961(Class7739.field31531, 1, 4, 5), new Class7961(Class7739.field31278, 1, 4, 16, 5) }, (Object)3, (Object)new Class7954[] { new Class7961(Class7739.field31424, 3, 18, 10), new Class7955(Class7521.field29383, 4, 12, 20) }, (Object)4, (Object)new Class7954[] { new Class7961(Class7521.field29344, 1, 1, 12, 15), new Class7958(Class9439.field40489, 100, 15), new Class7958(Class9439.field40481, 160, 15), new Class7958(Class9439.field40491, 140, 15), new Class7958(Class9439.field40488, 120, 15), new Class7958(Class9439.field40492, 280, 15), new Class7958(Class9439.field40496, 7, 15) }, (Object)5, (Object)new Class7954[] { new Class7961(Class7739.field31522, 3, 3, 30), new Class7961(Class7739.field31450, 4, 3, 30) })));
            hashMap.put(Class9334.field40066, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31306, 20, 16, 2), new Class7955(Class7739.field31281, 10, 16, 2), new Class7960(Class7739.field31379, 6, Class7739.field31383, 6, 16, 1), new Class7961(Class7739.field31361, 3, 1, 16, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31379, 15, 16, 10), new Class7960(Class7739.field31380, 6, Class7739.field31384, 6, 16, 5), new Class7961(Class7739.field31631, 2, 1, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31380, 13, 16, 20), new Class7963(Class7739.field31376, 3, 3, 10, 0.2f) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31381, 6, 12, 30) }, (Object)5, (Object)new Class7954[] { new Class7955(Class7739.field31382, 4, 12, 30), new Class7959(1, 12, 30, (Map<Class7611, Class3820>)ImmutableMap.builder().put((Object)Class7611.field30165, (Object)Class7739.field31356).put((Object)Class7611.field30169, (Object)Class7739.field31585).put((Object)Class7611.field30167, (Object)Class7739.field31585).put((Object)Class7611.field30163, (Object)Class7739.field31587).put((Object)Class7611.field30164, (Object)Class7739.field31587).put((Object)Class7611.field30166, (Object)Class7739.field31588).put((Object)Class7611.field30168, (Object)Class7739.field31589).build()) })));
            hashMap.put(Class9334.field40072, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7521.field29248, 18, 16, 2), new Class7955(Class7521.field29260, 18, 16, 2), new Class7955(Class7521.field29263, 18, 16, 2), new Class7955(Class7521.field29255, 18, 16, 2), new Class7961(Class7739.field31426, 2, 1, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31404, 12, 16, 10), new Class7955(Class7739.field31393, 12, 16, 10), new Class7955(Class7739.field31403, 12, 16, 10), new Class7955(Class7739.field31397, 12, 16, 10), new Class7955(Class7739.field31395, 12, 16, 10), new Class7961(Class7521.field29248, 1, 1, 16, 5), new Class7961(Class7521.field29249, 1, 1, 16, 5), new Class7961(Class7521.field29250, 1, 1, 16, 5), new Class7961(Class7521.field29251, 1, 1, 16, 5), new Class7961(Class7521.field29252, 1, 1, 16, 5), new Class7961(Class7521.field29253, 1, 1, 16, 5), new Class7961(Class7521.field29254, 1, 1, 16, 5), new Class7961(Class7521.field29255, 1, 1, 16, 5), new Class7961(Class7521.field29256, 1, 1, 16, 5), new Class7961(Class7521.field29257, 1, 1, 16, 5), new Class7961(Class7521.field29258, 1, 1, 16, 5), new Class7961(Class7521.field29259, 1, 1, 16, 5), new Class7961(Class7521.field29260, 1, 1, 16, 5), new Class7961(Class7521.field29261, 1, 1, 16, 5), new Class7961(Class7521.field29262, 1, 1, 16, 5), new Class7961(Class7521.field29263, 1, 1, 16, 5), new Class7961(Class7521.field29530, 1, 4, 16, 5), new Class7961(Class7521.field29531, 1, 4, 16, 5), new Class7961(Class7521.field29532, 1, 4, 16, 5), new Class7961(Class7521.field29533, 1, 4, 16, 5), new Class7961(Class7521.field29534, 1, 4, 16, 5), new Class7961(Class7521.field29535, 1, 4, 16, 5), new Class7961(Class7521.field29536, 1, 4, 16, 5), new Class7961(Class7521.field29537, 1, 4, 16, 5), new Class7961(Class7521.field29538, 1, 4, 16, 5), new Class7961(Class7521.field29539, 1, 4, 16, 5), new Class7961(Class7521.field29540, 1, 4, 16, 5), new Class7961(Class7521.field29541, 1, 4, 16, 5), new Class7961(Class7521.field29542, 1, 4, 16, 5), new Class7961(Class7521.field29543, 1, 4, 16, 5), new Class7961(Class7521.field29544, 1, 4, 16, 5), new Class7961(Class7521.field29545, 1, 4, 16, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31396, 12, 16, 20), new Class7955(Class7739.field31392, 12, 16, 20), new Class7955(Class7739.field31399, 12, 16, 20), new Class7955(Class7739.field31386, 12, 16, 20), new Class7955(Class7739.field31394, 12, 16, 20), new Class7961(Class7521.field29221, 3, 1, 12, 10), new Class7961(Class7521.field29225, 3, 1, 12, 10), new Class7961(Class7521.field29235, 3, 1, 12, 10), new Class7961(Class7521.field29236, 3, 1, 12, 10), new Class7961(Class7521.field29232, 3, 1, 12, 10), new Class7961(Class7521.field29233, 3, 1, 12, 10), new Class7961(Class7521.field29230, 3, 1, 12, 10), new Class7961(Class7521.field29228, 3, 1, 12, 10), new Class7961(Class7521.field29234, 3, 1, 12, 10), new Class7961(Class7521.field29224, 3, 1, 12, 10), new Class7961(Class7521.field29229, 3, 1, 12, 10), new Class7961(Class7521.field29226, 3, 1, 12, 10), new Class7961(Class7521.field29223, 3, 1, 12, 10), new Class7961(Class7521.field29222, 3, 1, 12, 10), new Class7961(Class7521.field29227, 3, 1, 12, 10), new Class7961(Class7521.field29231, 3, 1, 12, 10) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31402, 12, 16, 30), new Class7955(Class7739.field31390, 12, 16, 30), new Class7955(Class7739.field31401, 12, 16, 30), new Class7955(Class7739.field31387, 12, 16, 30), new Class7955(Class7739.field31398, 12, 16, 30), new Class7955(Class7739.field31391, 12, 16, 30), new Class7961(Class7739.field31556, 3, 1, 12, 15), new Class7961(Class7739.field31567, 3, 1, 12, 15), new Class7961(Class7739.field31559, 3, 1, 12, 15), new Class7961(Class7739.field31570, 3, 1, 12, 15), new Class7961(Class7739.field31562, 3, 1, 12, 15), new Class7961(Class7739.field31569, 3, 1, 12, 15), new Class7961(Class7739.field31561, 3, 1, 12, 15), new Class7961(Class7739.field31563, 3, 1, 12, 15), new Class7961(Class7739.field31571, 3, 1, 12, 15), new Class7961(Class7739.field31566, 3, 1, 12, 15), new Class7961(Class7739.field31558, 3, 1, 12, 15), new Class7961(Class7739.field31565, 3, 1, 12, 15), new Class7961(Class7739.field31568, 3, 1, 12, 15), new Class7961(Class7739.field31560, 3, 1, 12, 15), new Class7961(Class7739.field31557, 3, 1, 12, 15), new Class7961(Class7739.field31564, 3, 1, 12, 15) }, (Object)5, (Object)new Class7954[] { new Class7961(Class7739.field31340, 2, 3, 30) })));
            hashMap.put(Class9334.field40067, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31299, 32, 16, 2), new Class7961(Class7739.field31280, 1, 16, 1), new Class7960(Class7521.field29177, 10, Class7739.field31337, 10, 12, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31337, 26, 12, 10), new Class7961(Class7739.field31279, 2, 1, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31306, 14, 16, 20), new Class7961(Class7739.field31611, 3, 1, 10) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31307, 24, 16, 30), new Class7963(Class7739.field31279, 2, 3, 15) }, (Object)5, (Object)new Class7954[] { new Class7955(Class7739.field30992, 8, 12, 30), new Class7963(Class7739.field31611, 3, 3, 15), new Class7953(Class7739.field31280, 5, Class7739.field31581, 5, 2, 12, 30) })));
            hashMap.put(Class9334.field40069, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.builder().put((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31369, 24, 16, 2), new Class7957(1), new Class7961(Class7521.field29284, 9, 1, 12, 1) }).put((Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31370, 4, 12, 10), new Class7957(5), new Class7961(Class7739.field31629, 1, 1, 5) }).put((Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31385, 5, 12, 20), new Class7957(10), new Class7961(Class7739.field30818, 1, 4, 10) }).put((Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31512, 2, 12, 30), new Class7957(15), new Class7961(Class7739.field31377, 5, 1, 15), new Class7961(Class7739.field31375, 4, 1, 15) }).put((Object)5, (Object)new Class7954[] { new Class7961(Class7739.field31552, 20, 1, 30) }).build()));
            hashMap.put(Class9334.field40063, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31369, 24, 16, 2), new Class7961(Class7739.field31521, 7, 1, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field30967, 11, 16, 10), new Class7962(13, "Monument", Class2095.field12120, 12, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31375, 1, 12, 20), new Class7962(14, "Mansion", Class2095.field12119, 12, 10) }, (Object)4, (Object)new Class7954[] { new Class7961(Class7739.field31515, 7, 1, 15), new Class7961(Class7739.field31556, 3, 1, 15), new Class7961(Class7739.field31567, 3, 1, 15), new Class7961(Class7739.field31559, 3, 1, 15), new Class7961(Class7739.field31570, 3, 1, 15), new Class7961(Class7739.field31562, 3, 1, 15), new Class7961(Class7739.field31569, 3, 1, 15), new Class7961(Class7739.field31561, 3, 1, 15), new Class7961(Class7739.field31563, 3, 1, 15), new Class7961(Class7739.field31571, 3, 1, 15), new Class7961(Class7739.field31566, 3, 1, 15), new Class7961(Class7739.field31558, 3, 1, 15), new Class7961(Class7739.field31565, 3, 1, 15), new Class7961(Class7739.field31568, 3, 1, 15), new Class7961(Class7739.field31560, 3, 1, 15), new Class7961(Class7739.field31557, 3, 1, 15), new Class7961(Class7739.field31564, 3, 1, 15) }, (Object)5, (Object)new Class7954[] { new Class7961(Class7739.field31618, 8, 1, 30) })));
            hashMap.put(Class9334.field40064, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31435, 32, 16, 2), new Class7961(Class7739.field31354, 1, 2, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31285, 3, 12, 10), new Class7961(Class7739.field31389, 1, 1, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31544, 2, 12, 20), new Class7961(Class7521.field29340, 4, 1, 12, 10) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31273, 4, 12, 30), new Class7955(Class7739.field31442, 9, 12, 30), new Class7961(Class7739.field31436, 5, 1, 15) }, (Object)5, (Object)new Class7954[] { new Class7955(Class7739.field31440, 22, 12, 30), new Class7961(Class7739.field31510, 3, 1, 30) })));
            final Class9334 field40130 = Class9334.field40061;
            1;
            final Class7954[] array = new Class7954[5];
            array[0] = new Class7955(Class7739.field31281, 15, 16, 2);
            new Class7961(new ItemStack(Class7739.field31327), 7, 1, 12, 1, 0.2f);
            final Class7961 class7961;
            final Object o;
            array[o] = class7961;
            new Class7961(new ItemStack(Class7739.field31328), 4, 1, 12, 1, 0.2f);
            final Class7961 class7962;
            final Object o2;
            array[o2] = class7962;
            new Class7961(new ItemStack(Class7739.field31325), 5, 1, 12, 1, 0.2f);
            final Class7961 class7963;
            final Object o3;
            array[o3] = class7963;
            new Class7961(new ItemStack(Class7739.field31326), 9, 1, 12, 1, 0.2f);
            final Class7961 class7964;
            final Object o4;
            array[o4] = class7964;
            2;
            final Class7954[] array2 = new Class7954[4];
            array2[0] = new Class7955(Class7739.field31284, 4, 12, 10);
            new Class7961(new ItemStack(Class7739.field31628), 36, 1, 12, 5, 0.2f);
            final Class7961 class7965;
            final Object o5;
            array2[o5] = class7965;
            new Class7961(new ItemStack(Class7739.field31324), 1, 1, 12, 5, 0.2f);
            final Class7961 class7966;
            final Object o6;
            array2[o6] = class7966;
            new Class7961(new ItemStack(Class7739.field31323), 3, 1, 12, 5, 0.2f);
            final Class7961 class7967;
            final Object o7;
            array2[o7] = class7967;
            3;
            final Class7954[] array3 = { new Class7955(Class7739.field31351, 1, 12, 20), new Class7955(Class7739.field31283, 1, 12, 20), null, null, null };
            new Class7961(new ItemStack(Class7739.field31321), 1, 1, 12, 10, 0.2f);
            final Class7961 class7968;
            final Object o8;
            array3[o8] = class7968;
            new Class7961(new ItemStack(Class7739.field31322), 4, 1, 12, 10, 0.2f);
            final Class7961 class7969;
            final Object o9;
            array3[o9] = class7969;
            new Class7961(new ItemStack(Class7739.field31583), 5, 1, 12, 10, 0.2f);
            final Class7961 class7970;
            final Object o10;
            array3[o10] = class7970;
            final Object o11;
            final Object o12;
            final Object o13;
            hashMap.put(field40130, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of(o11, (Object)array, o12, (Object)array2, o13, (Object)array3, (Object)4, (Object)new Class7954[] { new Class7963(Class7739.field31331, 14, 3, 15, 0.2f), new Class7963(Class7739.field31332, 8, 3, 15, 0.2f) }, (Object)5, (Object)new Class7954[] { new Class7963(Class7739.field31329, 8, 3, 30, 0.2f), new Class7963(Class7739.field31330, 16, 3, 30, 0.2f) })));
            final Class9334 field40131 = Class9334.field40074;
            1;
            final Class7954[] array4 = { new Class7955(Class7739.field31281, 15, 16, 2), null, null };
            new Class7961(new ItemStack(Class7739.field31276), 3, 1, 12, 1, 0.2f);
            final Class7961 class7971;
            final Object o14;
            array4[o14] = class7971;
            array4[2] = new Class7963(Class7739.field31286, 2, 3, 1);
            2;
            final Class7954[] array5 = { new Class7955(Class7739.field31284, 4, 12, 10), null };
            new Class7961(new ItemStack(Class7739.field31628), 36, 1, 12, 5, 0.2f);
            final Class7961 class7972;
            final Object o15;
            array5[o15] = class7972;
            final Object o16;
            final Object o17;
            hashMap.put(field40131, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of(o16, (Object)array4, o17, (Object)array5, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31337, 24, 12, 20) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31283, 1, 12, 30), new Class7963(Class7739.field31298, 12, 3, 15, 0.2f) }, (Object)5, (Object)new Class7954[] { new Class7963(Class7739.field31295, 8, 3, 30, 0.2f) })));
            final Class9334 field40132 = Class9334.field40073;
            1;
            final Class7954[] array6 = new Class7954[5];
            array6[0] = new Class7955(Class7739.field31281, 15, 16, 2);
            new Class7961(new ItemStack(Class7739.field31294), 1, 1, 12, 1, 0.2f);
            final Class7961 class7973;
            final Object o18;
            array6[o18] = class7973;
            new Class7961(new ItemStack(Class7739.field31292), 1, 1, 12, 1, 0.2f);
            final Class7961 class7974;
            final Object o19;
            array6[o19] = class7974;
            new Class7961(new ItemStack(Class7739.field31293), 1, 1, 12, 1, 0.2f);
            final Class7961 class7975;
            final Object o20;
            array6[o20] = class7975;
            new Class7961(new ItemStack(Class7739.field31310), 1, 1, 12, 1, 0.2f);
            final Class7961 class7976;
            final Object o21;
            array6[o21] = class7976;
            2;
            final Class7954[] array7 = { new Class7955(Class7739.field31284, 4, 12, 10), null };
            new Class7961(new ItemStack(Class7739.field31628), 36, 1, 12, 5, 0.2f);
            final Class7961 class7977;
            final Object o22;
            array7[o22] = class7977;
            3;
            final Class7954[] array8 = { new Class7955(Class7739.field31337, 30, 12, 20), new Class7963(Class7739.field31276, 1, 3, 10, 0.2f), new Class7963(Class7739.field31274, 2, 3, 10, 0.2f), new Class7963(Class7739.field31275, 3, 3, 10, 0.2f), null };
            new Class7961(new ItemStack(Class7739.field31312), 4, 1, 3, 10, 0.2f);
            final Class7961 class7978;
            final Object o23;
            array8[o23] = class7978;
            final Object o24;
            final Object o25;
            final Object o26;
            hashMap.put(field40132, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of(o24, (Object)array6, o25, (Object)array7, o26, (Object)array8, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31283, 1, 12, 30), new Class7963(Class7739.field31298, 12, 3, 15, 0.2f), new Class7963(Class7739.field31296, 5, 3, 15, 0.2f) }, (Object)5, (Object)new Class7954[] { new Class7963(Class7739.field31297, 13, 3, 30, 0.2f) })));
            hashMap.put(Class9334.field40062, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31433, 14, 16, 2), new Class7955(Class7739.field31338, 7, 16, 2), new Class7955(Class7739.field31541, 4, 16, 2), new Class7961(Class7739.field31543, 1, 1, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7739.field31281, 15, 16, 2), new Class7961(Class7739.field31339, 1, 5, 16, 5), new Class7961(Class7739.field31434, 1, 8, 16, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7739.field31554, 7, 16, 20), new Class7955(Class7739.field31431, 10, 16, 20) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31367, 10, 12, 30) }, (Object)5, (Object)new Class7954[] { new Class7955(Class7739.field31630, 10, 12, 30) })));
            final Class9334 field40133 = Class9334.field40068;
            1;
            final Class7954[] array9 = { new Class7955(Class7739.field31357, 6, 16, 2), new Class7956(Class7739.field31319, 3), new Class7956(Class7739.field31318, 7) };
            2;
            final Class7954[] array10 = { new Class7955(Class7739.field31337, 26, 12, 10), new Class7956(Class7739.field31317, 5, 12, 5), new Class7956(Class7739.field31320, 4, 12, 5) };
            3;
            final Class7954[] array11 = { new Class7955(Class7739.field31545, 9, 12, 20), new Class7956(Class7739.field31318, 7) };
            4;
            final Class7954[] array12 = { new Class7955(Class7739.field31273, 4, 12, 30), new Class7956(Class7739.field31550, 6, 12, 15) };
            5;
            final Class7954[] array13 = new Class7954[2];
            new Class7961(new ItemStack(Class7739.field31353), 6, 1, 12, 30, 0.2f);
            final Class7961 class7979;
            final Object o27;
            array13[o27] = class7979;
            array13[1] = new Class7956(Class7739.field31317, 5, 12, 30);
            final Object o28;
            final Object o29;
            final Object o30;
            final Object o31;
            final Object o32;
            hashMap.put(field40133, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of(o28, (Object)array9, o29, (Object)array10, o30, (Object)array11, o31, (Object)array12, o32, (Object)array13)));
            hashMap.put(Class9334.field40070, method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7955(Class7739.field31364, 10, 16, 2), new Class7961(Class7739.field31363, 1, 10, 16, 1) }, (Object)2, (Object)new Class7954[] { new Class7955(Class7521.field29148, 20, 16, 10), new Class7961(Class7521.field29371, 1, 4, 16, 5) }, (Object)3, (Object)new Class7954[] { new Class7955(Class7521.field29149, 16, 16, 20), new Class7955(Class7521.field29153, 16, 16, 20), new Class7955(Class7521.field29151, 16, 16, 20), new Class7961(Class7521.field29154, 1, 4, 16, 10), new Class7961(Class7521.field29152, 1, 4, 16, 10), new Class7961(Class7521.field29150, 1, 4, 16, 10) }, (Object)4, (Object)new Class7954[] { new Class7955(Class7739.field31536, 12, 12, 30), new Class7961(Class7521.field29483, 1, 1, 12, 15), new Class7961(Class7521.field29482, 1, 1, 12, 15), new Class7961(Class7521.field29493, 1, 1, 12, 15), new Class7961(Class7521.field29485, 1, 1, 12, 15), new Class7961(Class7521.field29489, 1, 1, 12, 15), new Class7961(Class7521.field29490, 1, 1, 12, 15), new Class7961(Class7521.field29497, 1, 1, 12, 15), new Class7961(Class7521.field29496, 1, 1, 12, 15), new Class7961(Class7521.field29488, 1, 1, 12, 15), new Class7961(Class7521.field29484, 1, 1, 12, 15), new Class7961(Class7521.field29487, 1, 1, 12, 15), new Class7961(Class7521.field29495, 1, 1, 12, 15), new Class7961(Class7521.field29491, 1, 1, 12, 15), new Class7961(Class7521.field29492, 1, 1, 12, 15), new Class7961(Class7521.field29486, 1, 1, 12, 15), new Class7961(Class7521.field29494, 1, 1, 12, 15), new Class7961(Class7521.field29666, 1, 1, 12, 15), new Class7961(Class7521.field29665, 1, 1, 12, 15), new Class7961(Class7521.field29676, 1, 1, 12, 15), new Class7961(Class7521.field29668, 1, 1, 12, 15), new Class7961(Class7521.field29672, 1, 1, 12, 15), new Class7961(Class7521.field29673, 1, 1, 12, 15), new Class7961(Class7521.field29680, 1, 1, 12, 15), new Class7961(Class7521.field29679, 1, 1, 12, 15), new Class7961(Class7521.field29671, 1, 1, 12, 15), new Class7961(Class7521.field29667, 1, 1, 12, 15), new Class7961(Class7521.field29670, 1, 1, 12, 15), new Class7961(Class7521.field29678, 1, 1, 12, 15), new Class7961(Class7521.field29674, 1, 1, 12, 15), new Class7961(Class7521.field29675, 1, 1, 12, 15), new Class7961(Class7521.field29669, 1, 1, 12, 15), new Class7961(Class7521.field29677, 1, 1, 12, 15) }, (Object)5, (Object)new Class7954[] { new Class7961(Class7521.field29478, 1, 1, 12, 30), new Class7961(Class7521.field29476, 1, 1, 12, 30) })));
            return;
        });
        field40129 = method34667((ImmutableMap<Integer, Class7954[]>)ImmutableMap.of((Object)1, (Object)new Class7954[] { new Class7961(Class7739.field30834, 2, 1, 5, 1), new Class7961(Class7739.field31371, 4, 1, 5, 1), new Class7961(Class7739.field30945, 2, 1, 5, 1), new Class7961(Class7739.field31609, 5, 1, 5, 1), new Class7961(Class7739.field30831, 1, 1, 12, 1), new Class7961(Class7739.field31365, 1, 1, 8, 1), new Class7961(Class7739.field30941, 1, 1, 4, 1), new Class7961(Class7739.field31366, 3, 1, 12, 1), new Class7961(Class7739.field30932, 3, 1, 8, 1), new Class7961(Class7739.field30852, 1, 1, 12, 1), new Class7961(Class7739.field30853, 1, 1, 12, 1), new Class7961(Class7739.field30854, 1, 1, 8, 1), new Class7961(Class7739.field30855, 1, 1, 12, 1), new Class7961(Class7739.field30856, 1, 1, 12, 1), new Class7961(Class7739.field30857, 1, 1, 12, 1), new Class7961(Class7739.field30858, 1, 1, 12, 1), new Class7961(Class7739.field30859, 1, 1, 12, 1), new Class7961(Class7739.field30860, 1, 1, 12, 1), new Class7961(Class7739.field30861, 1, 1, 12, 1), new Class7961(Class7739.field30862, 1, 1, 12, 1), new Class7961(Class7739.field30863, 1, 1, 7, 1), new Class7961(Class7739.field31314, 1, 1, 12, 1), new Class7961(Class7739.field31576, 1, 1, 12, 1), new Class7961(Class7739.field31429, 1, 1, 12, 1), new Class7961(Class7739.field31430, 1, 1, 12, 1), new Class7961(Class7739.field30777, 5, 1, 8, 1), new Class7961(Class7739.field30775, 5, 1, 8, 1), new Class7961(Class7739.field30778, 5, 1, 8, 1), new Class7961(Class7739.field30776, 5, 1, 8, 1), new Class7961(Class7739.field30773, 5, 1, 8, 1), new Class7961(Class7739.field30774, 5, 1, 8, 1), new Class7961(Class7739.field31386, 1, 3, 12, 1), new Class7961(Class7739.field31404, 1, 3, 12, 1), new Class7961(Class7739.field31401, 1, 3, 12, 1), new Class7961(Class7739.field31394, 1, 3, 12, 1), new Class7961(Class7739.field31403, 1, 3, 12, 1), new Class7961(Class7739.field31387, 1, 3, 12, 1), new Class7961(Class7739.field31392, 1, 3, 12, 1), new Class7961(Class7739.field31398, 1, 3, 12, 1), new Class7961(Class7739.field31396, 1, 3, 12, 1), new Class7961(Class7739.field31393, 1, 3, 12, 1), new Class7961(Class7739.field31390, 1, 3, 12, 1), new Class7961(Class7739.field31397, 1, 3, 12, 1), new Class7961(Class7739.field31395, 1, 3, 12, 1), new Class7961(Class7739.field31399, 1, 3, 12, 1), new Class7961(Class7739.field31402, 1, 3, 12, 1), new Class7961(Class7739.field31391, 1, 3, 12, 1), new Class7961(Class7739.field31206, 3, 1, 8, 1), new Class7961(Class7739.field31207, 3, 1, 8, 1), new Class7961(Class7739.field31208, 3, 1, 8, 1), new Class7961(Class7739.field31209, 3, 1, 8, 1), new Class7961(Class7739.field31205, 3, 1, 8, 1), new Class7961(Class7739.field30969, 1, 1, 12, 1), new Class7961(Class7739.field30865, 1, 1, 12, 1), new Class7961(Class7739.field30866, 1, 1, 12, 1), new Class7961(Class7739.field30979, 1, 2, 5, 1), new Class7961(Class7739.field30780, 1, 8, 8, 1), new Class7961(Class7739.field30781, 1, 4, 6, 1) }, (Object)2, (Object)new Class7954[] { new Class7961(Class7739.field31362, 5, 1, 4, 1), new Class7961(Class7739.field31359, 5, 1, 4, 1), new Class7961(Class7739.field31072, 3, 1, 6, 1), new Class7961(Class7739.field31230, 6, 1, 6, 1), new Class7961(Class7739.field31308, 1, 1, 8, 1), new Class7961(Class7739.field30765, 3, 3, 6, 1) }));
    }
}
