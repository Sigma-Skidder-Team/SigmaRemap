// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashMap;

import com.mojang.datafixers.util.Either;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;

import java.util.function.Function;
import java.util.List;

public class Class8163
{
    public static final List<String> field33624;
    
    public Class7685 method26985(final Function<Class3687, TextureAtlasSprite> function, final Class7685 class7685) {
        final HashMap hashMap = Maps.newHashMap();
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < Class8163.field33624.size(); ++i) {
            final String s = Class8163.field33624.get(i);
            if (!class7685.method24394(s)) {
                break;
            }
            final Class3687 method24395 = class7685.method24395(s);
            hashMap.put(s, Either.left((Object)method24395));
            arrayList.addAll(this.method26986(i, s, function.apply(method24395)));
        }
        hashMap.put("particle", class7685.method24394("particle") ? Either.left((Object)class7685.method24395("particle")) : hashMap.get("layer0"));
        final Class7685 class7686 = new Class7685(null, arrayList, hashMap, false, class7685.method24389(), class7685.method24399(), class7685.method24390());
        class7686.field30523 = class7685.field30523;
        return class7686;
    }
    
    private List<Class9219> method26986(final int n, final String s, final TextureAtlasSprite class1912) {
        final HashMap hashMap = Maps.newHashMap();
        hashMap.put(Direction.SOUTH, new Class8111(null, n, s, new Class8435(new float[] { 0.0f, 0.0f, 16.0f, 16.0f }, 0)));
        hashMap.put(Direction.NORTH, new Class8111(null, n, s, new Class8435(new float[] { 16.0f, 0.0f, 0.0f, 16.0f }, 0)));
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class9219(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.method26987(class1912, s, n));
        return arrayList;
    }
    
    private List<Class9219> method26987(final TextureAtlasSprite class1912, final String s, final int n) {
        final float n2 = (float)class1912.method7495();
        final float n3 = (float)class1912.method7496();
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class9438 class1913 : this.method26988(class1912)) {
            float n4 = 0.0f;
            float n5 = 0.0f;
            float n6 = 0.0f;
            float n7 = 0.0f;
            float n8 = 0.0f;
            float n9 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            final float n12 = 16.0f / n2;
            final float n13 = 16.0f / n3;
            final float n14 = (float)class1913.method35074();
            final float n15 = (float)class1913.method35075();
            final float n16 = (float)class1913.method35076();
            final Class231 method35073 = class1913.method35073();
            switch (Class5505.field22803[method35073.ordinal()]) {
                case 1: {
                    n8 = n14;
                    n4 = n14;
                    n9 = (n6 = n15 + 1.0f);
                    n10 = n16;
                    n5 = n16;
                    n7 = n16;
                    n11 = n16 + 1.0f;
                    break;
                }
                case 2: {
                    n10 = n16;
                    n11 = n16 + 1.0f;
                    n8 = n14;
                    n4 = n14;
                    n9 = (n6 = n15 + 1.0f);
                    n5 = n16 + 1.0f;
                    n7 = n16 + 1.0f;
                    break;
                }
                case 3: {
                    n8 = n16;
                    n4 = n16;
                    n6 = n16;
                    n9 = n16 + 1.0f;
                    n11 = n14;
                    n5 = n14;
                    n10 = (n7 = n15 + 1.0f);
                    break;
                }
                case 4: {
                    n8 = n16;
                    n9 = n16 + 1.0f;
                    n4 = n16 + 1.0f;
                    n6 = n16 + 1.0f;
                    n11 = n14;
                    n5 = n14;
                    n10 = (n7 = n15 + 1.0f);
                    break;
                }
            }
            final float n17 = n4 * n12;
            final float n18 = n6 * n12;
            final float n19 = n5 * n13;
            final float n20 = n7 * n13;
            final float n21 = 16.0f - n19;
            final float n22 = 16.0f - n20;
            final float n23 = n8 * n12;
            final float n24 = n9 * n12;
            final float n25 = n10 * n13;
            final float n26 = n11 * n13;
            final HashMap hashMap = Maps.newHashMap();
            hashMap.put(method35073.method862(), new Class8111(null, n, s, new Class8435(new float[] { n23, n25, n24, n26 }, 0)));
            switch (Class5505.field22803[method35073.ordinal()]) {
                case 1: {
                    arrayList.add(new Class9219(new Vector3f(n17, n21, 7.5f), new Vector3f(n18, n21, 8.5f), hashMap, null, true));
                    continue;
                }
                case 2: {
                    arrayList.add(new Class9219(new Vector3f(n17, n22, 7.5f), new Vector3f(n18, n22, 8.5f), hashMap, null, true));
                    continue;
                }
                case 3: {
                    arrayList.add(new Class9219(new Vector3f(n17, n21, 7.5f), new Vector3f(n17, n22, 8.5f), hashMap, null, true));
                    continue;
                }
                case 4: {
                    arrayList.add(new Class9219(new Vector3f(n18, n21, 7.5f), new Vector3f(n18, n22, 8.5f), hashMap, null, true));
                    continue;
                }
            }
        }
        return arrayList;
    }
    
    private List<Class9438> method26988(final TextureAtlasSprite class1912) {
        final int method7495 = class1912.method7495();
        final int method7496 = class1912.method7496();
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class1912.method7505(); ++i) {
            for (int j = 0; j < method7496; ++j) {
                for (int k = 0; k < method7495; ++k) {
                    final boolean b = !this.method26991(class1912, i, k, j, method7495, method7496);
                    this.method26989(Class231.field859, arrayList, class1912, i, k, j, method7495, method7496, b);
                    this.method26989(Class231.field860, arrayList, class1912, i, k, j, method7495, method7496, b);
                    this.method26989(Class231.field861, arrayList, class1912, i, k, j, method7495, method7496, b);
                    this.method26989(Class231.field862, arrayList, class1912, i, k, j, method7495, method7496, b);
                }
            }
        }
        return arrayList;
    }
    
    private void method26989(final Class231 class231, final List<Class9438> list, final TextureAtlasSprite class232, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if (this.method26991(class232, n, n2 + class231.method863(), n3 + class231.method864(), n4, n5) && b) {
            this.method26990(list, class231, n2, n3);
        }
    }
    
    private void method26990(final List<Class9438> list, final Class231 class231, final int n, final int n2) {
        Class9438 class232 = null;
        for (final Class9438 class233 : list) {
            if (class233.method35073() == class231 && class233.method35076() == (Class231.method866(class231) ? n2 : n)) {
                class232 = class233;
                break;
            }
        }
        final int n3 = Class231.method866(class231) ? n2 : n;
        final int n4 = Class231.method866(class231) ? n : n2;
        if (class232 != null) {
            class232.method35072(n4);
        }
        else {
            list.add(new Class9438(class231, n4, n3));
        }
    }
    
    private boolean method26991(final TextureAtlasSprite class1912, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n2 >= 0) {
            if (n3 >= 0) {
                if (n2 < n4) {
                    if (n3 < n5) {
                        return class1912.method7506(n, n2, n3);
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field33624 = Lists.newArrayList((Object[])new String[] { Class8163.\uc854\u43e6\ud1d3\u74eb\u9bcc\u3fd9[1], "layer1", "layer2", "layer3", "layer4" })
    }
}
