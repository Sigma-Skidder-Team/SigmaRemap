// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class5107 implements Class5106
{
    private final Map<String, Class327> field22048;
    
    public Class5107(final Map<String, Class327> map) {
        this.field22048 = new HashMap<String, Class327>();
        this.method16002();
        for (final String s : map.keySet()) {
            this.method16004(s, map.get(s));
        }
    }
    
    private void method16002() {
        final Class289[] values = Class289.values();
        for (int i = 0; i < values.length; ++i) {
            this.method16003(this.field22048, values[i]);
        }
        final Class325[] values2 = Class325.values();
        for (int j = 0; j < values2.length; ++j) {
            final Class325 class325 = values2[j];
            this.field22048.put(class325.method1005(), class325);
        }
        for (final Class3090 class326 : Registry.field217) {
            this.method16004("BIOME_" + Class7984.method26041(class326).method7797().trim().toUpperCase().replace(' ', '_'), new Class337((float) Registry.field217.getId(class326)));
        }
        final String[] array = { "NONE", "TAIGA", "EXTREME_HILLS", "JUNGLE", "MESA", "PLAINS", "SAVANNA", "ICY", "THEEND", "BEACH", "FOREST", "OCEAN", "DESERT", "RIVER", "SWAMP", "MUSHROOM", "NETHER" };
        for (int k = 0; k < array.length; ++k) {
            this.method16004("CAT_" + array[k], new Class337((float)k));
        }
        final String[] array2 = { "NONE", "RAIN", "SNOW" };
        for (int l = 0; l < array2.length; ++l) {
            this.method16004("PPT_" + array2[l], new Class337((float)l));
        }
    }
    
    private void method16003(final Map<String, Class327> map, final Class289 class289) {
        final String[] method939 = class289.method939();
        if (method939 != null) {
            for (int i = 0; i < method939.length; ++i) {
                final String s = method939[i];
                final String[] method940 = class289.method940();
                if (method940 != null) {
                    for (int j = 0; j < method940.length; ++j) {
                        map.put(class289.method937() + "." + s + "." + method940[j], new Class331(class289, i, j));
                    }
                }
                else {
                    map.put(class289.method937() + "." + s, new Class331(class289, i));
                }
            }
        }
        else {
            map.put(class289.method937(), new Class331(class289));
        }
    }
    
    public boolean method16004(final String str, final Class327 class327) {
        if (!this.field22048.containsKey(str)) {
            this.field22048.put(str, class327);
            return true;
        }
        Class8885.method31271("Expression already defined: " + str);
        return false;
    }
    
    @Override
    public Class327 method16001(final String s) {
        return this.field22048.get(s);
    }
    
    public boolean method16005(final String s) {
        return this.field22048.containsKey(s);
    }
}
