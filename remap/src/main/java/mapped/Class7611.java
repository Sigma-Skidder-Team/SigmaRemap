// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.Map;

public interface Class7611
{
    public static final Class7611 field30163 = method23912("desert");
    public static final Class7611 field30164 = method23912("jungle");
    public static final Class7611 field30165 = method23912("plains");
    public static final Class7611 field30166 = method23912("savanna");
    public static final Class7611 field30167 = method23912("snow");
    public static final Class7611 field30168 = method23912("swamp");
    public static final Class7611 field30169 = method23912("taiga");
    public static final Map<Class3090, Class7611> field30170 = Util.method27851(Maps.newHashMap(), hashMap -> {
        hashMap.put(Class7102.field27669, Class7611.field30163);
        hashMap.put(Class7102.field27671, Class7611.field30163);
        hashMap.put(Class7102.field27634, Class7611.field30163);
        hashMap.put(Class7102.field27649, Class7611.field30163);
        hashMap.put(Class7102.field27685, Class7611.field30163);
        hashMap.put(Class7102.field27702, Class7611.field30163);
        hashMap.put(Class7102.field27704, Class7611.field30163);
        hashMap.put(Class7102.field27703, Class7611.field30163);
        hashMap.put(Class7102.field27670, Class7611.field30163);
        hashMap.put(Class7102.field27705, Class7611.field30164);
        hashMap.put(Class7102.field27706, Class7611.field30164);
        hashMap.put(Class7102.field27653, Class7611.field30164);
        hashMap.put(Class7102.field27655, Class7611.field30164);
        hashMap.put(Class7102.field27654, Class7611.field30164);
        hashMap.put(Class7102.field27691, Class7611.field30164);
        hashMap.put(Class7102.field27692, Class7611.field30164);
        hashMap.put(Class7102.field27668, Class7611.field30166);
        hashMap.put(Class7102.field27667, Class7611.field30166);
        hashMap.put(Class7102.field27700, Class7611.field30166);
        hashMap.put(Class7102.field27701, Class7611.field30166);
        hashMap.put(Class7102.field27682, Class7611.field30167);
        hashMap.put(Class7102.field27642, Class7611.field30167);
        hashMap.put(Class7102.field27643, Class7611.field30167);
        hashMap.put(Class7102.field27690, Class7611.field30167);
        hashMap.put(Class7102.field27658, Class7611.field30167);
        hashMap.put(Class7102.field27645, Class7611.field30167);
        hashMap.put(Class7102.field27662, Class7611.field30167);
        hashMap.put(Class7102.field27663, Class7611.field30167);
        hashMap.put(Class7102.field27696, Class7611.field30167);
        hashMap.put(Class7102.field27644, Class7611.field30167);
        hashMap.put(Class7102.field27638, Class7611.field30168);
        hashMap.put(Class7102.field27689, Class7611.field30168);
        hashMap.put(Class7102.field27697, Class7611.field30169);
        hashMap.put(Class7102.field27698, Class7611.field30169);
        hashMap.put(Class7102.field27664, Class7611.field30169);
        hashMap.put(Class7102.field27665, Class7611.field30169);
        hashMap.put(Class7102.field27686, Class7611.field30169);
        hashMap.put(Class7102.field27699, Class7611.field30169);
        hashMap.put(Class7102.field27652, Class7611.field30169);
        hashMap.put(Class7102.field27635, Class7611.field30169);
        hashMap.put(Class7102.field27637, Class7611.field30169);
        hashMap.put(Class7102.field27651, Class7611.field30169);
        hashMap.put(Class7102.field27688, Class7611.field30169);
        hashMap.put(Class7102.field27666, Class7611.field30169);
    });
    
    default Class7611 method23912(final String s) {
        return Registry.method512(Registry.field239, new ResourceLocation(s), new Class7612(s));
    }
    
    default Class7611 method23913(final Class3090 key) {
        return Class7611.field30170.getOrDefault(key, Class7611.field30165);
    }
}
