// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.HashMap;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Collection;
import java.util.Locale;
import com.google.gson.JsonElement;
import java.util.List;
import java.util.ArrayList;
import io.netty.buffer.ByteBuf;
import java.util.Set;
import java.util.Map;

public class Class8881
{
    public static Map<Integer, String> field37359;
    public static Map<String, Integer> field37360;
    public static Map<Integer, Class3643> field37361;
    public static Map<Integer, Class8614> field37362;
    public static Set<Integer> field37363;
    
    public static void method31250(final Class6108 class6108, final Class8322 class6109) {
        final Class6490 class6110 = Class8563.method28794().method33549().method29950(Class6490.class);
        for (final Class222 class6111 : Class222.values()) {
            final Class8322 class6112 = new Class8322(class6109.method27704() + class6111.method852(), class6109.method27705() + class6111.method853(), class6109.method27706() + class6111.method854());
            final int method19526 = class6110.method19526(class6108, class6112);
            final Class3643 class6113 = Class8881.field37361.get(method19526);
            if (class6113 != null) {
                final int method19527 = class6113.method11202(class6108, class6112, method19526);
                final Class8699 class6114 = new Class8699(11, null, class6108);
                class6114.method29823(Class5260.field22318, class6112);
                class6114.method29823(Class5260.field22312, method19527);
                try {
                    class6114.method29831(Class5215.class, true, true);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static void method31251(final Class6108 class6108, final int n, final int n2, final int n3) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (Math.abs(i) + Math.abs(j) != 0) {
                    final ArrayList list = new ArrayList<Class9119>();
                    if (Math.abs(i) + Math.abs(j) == 2) {
                        for (int k = n3 * 16; k < n3 * 16 + 16; ++k) {
                            method31252(class6108, new Class8322(((long) n + i << 4) + (long)((i == 1) ? 0 : 15), (long)k, ((long) n2 + j << 4) + (long)((j == 1) ? 0 : 15)), list);
                        }
                    }
                    else {
                        for (int l = n3 * 16; l < n3 * 16 + 16; ++l) {
                            int n4;
                            int n5;
                            int n6;
                            int n7;
                            if (i == 1) {
                                n4 = 0;
                                n5 = 2;
                                n6 = 0;
                                n7 = 16;
                            }
                            else if (i == -1) {
                                n4 = 14;
                                n5 = 16;
                                n6 = 0;
                                n7 = 16;
                            }
                            else if (j == 1) {
                                n4 = 0;
                                n5 = 16;
                                n6 = 0;
                                n7 = 2;
                            }
                            else {
                                n4 = 0;
                                n5 = 16;
                                n6 = 14;
                                n7 = 16;
                            }
                            for (int n8 = n4; n8 < n5; ++n8) {
                                for (int n9 = n6; n9 < n7; ++n9) {
                                    method31252(class6108, new Class8322(((long) n + i << 4) + (long)n8, (long)l, ((long) n2 + j << 4) + (long)n9), list);
                                }
                            }
                        }
                    }
                    if (!list.isEmpty()) {
                        final Class8699 class6109 = new Class8699(15, null, class6108);
                        class6109.method29823(Class5260.field22296, n + i);
                        class6109.method29823(Class5260.field22296, n2 + j);
                        class6109.method29823(Class5260.field22331, (Class9119[])list.toArray(new Class9119[0]));
                        try {
                            class6109.method29831(Class5215.class, true, true);
                        }
                        catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    
    public static void method31252(final Class6108 class6108, final Class8322 class6109, final List<Class9119> list) {
        final int method19526 = Class8563.method28794().method33549().method29950(Class6490.class).method19526(class6108, class6109);
        final Class3643 method19527 = method31262(method19526);
        if (method19527 != null) {
            list.add(new Class9119((short)((class6109.method27704() & 0xFL) << 4 | (class6109.method27706() & 0xFL)), class6109.method27705().shortValue(), method19527.method11202(class6108, class6109, method19526)));
        }
    }
    
    public static Class6490 method31253() {
        return Class8563.method28794().method33549().method29950(Class6490.class);
    }
    
    public static void method31254(final Class6108 class6108, final Class8322 class6109, final int n) {
        if (method31256()) {
            if (!method31259(n)) {
                method31253().method19529(class6108, class6109);
            }
            else {
                method31253().method19528(class6108, class6109, n);
            }
        }
    }
    
    public static void method31255(final Class6108 class6108) {
        if (method31256()) {
            method31253().method19531(class6108);
        }
    }
    
    public static boolean method31256() {
        return method31253().method19533();
    }
    
    public static void method31257(final Class6108 class6108, final Class6562 class6109) {
        final long n = (long) class6109.method19885() << 4;
        final long n2 = (long) class6109.method19886() << 4;
        for (int i = 0; i < class6109.method19889().length; ++i) {
            final Class7668 class6110 = class6109.method19889()[i];
            if (class6110 != null) {
                int n3 = 0;
                for (int j = 0; j < class6110.method24327(); ++j) {
                    if (method31260(class6110.method24328(j))) {
                        n3 = 1;
                        break;
                    }
                }
                if (n3 != 0) {
                    final long n4 = (long) i << 4;
                    for (int k = 0; k < 16; ++k) {
                        for (int l = 0; l < 16; ++l) {
                            for (int n5 = 0; n5 < 16; ++n5) {
                                final int method24322 = class6110.method24322(n5, k, l);
                                final Class3643 method24323 = method31262(method24322);
                                if (method24323 != null) {
                                    class6110.method24319(n5, k, l, method24323.method11202(class6108, new Class8322(n + n5, n4 + k, n2 + l), method24322));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void method31258() {
        if (Class8563.method28792().method23299()) {
            Class8563.method28793().method34742().info("Loading block connection mappings ...");
            for (final Map.Entry<String, V> entry : Class9526.method35560("mapping-1.13.json").getAsJsonObject("blocks").entrySet()) {
                final Integer value = Integer.parseInt(entry.getKey());
                final String asString = ((JsonElement)entry.getValue()).getAsString();
                Class8881.field37359.put(value, asString);
                Class8881.field37360.put(asString, value);
            }
            if (!Class8563.method28792().method23301()) {
                for (final Map.Entry<Object, V> entry2 : Class9526.method35560("blockConnections.json").entrySet()) {
                    final int intValue = Class8881.field37360.get(entry2.getKey());
                    final Class8614 class8614 = new Class8614();
                    for (final Map.Entry<String, V> entry3 : ((JsonElement)entry2.getValue()).getAsJsonObject().entrySet()) {
                        final String s = entry3.getKey();
                        final JsonObject asJsonObject = ((JsonElement)entry3.getValue()).getAsJsonObject();
                        final boolean[] array = new boolean[6];
                        for (final Class222 class8615 : Class222.values()) {
                            final String lowerCase = class8615.toString().toLowerCase(Locale.ROOT);
                            if (asJsonObject.has(lowerCase)) {
                                array[class8615.ordinal()] = asJsonObject.getAsJsonPrimitive(lowerCase).getAsBoolean();
                            }
                        }
                        class8614.method29215(s, array);
                    }
                    if (entry2.getKey().contains("stairs")) {
                        class8614.method29215("allFalseIfStairPre1_12", new boolean[6]);
                    }
                    Class8881.field37362.put(intValue, class8614);
                }
            }
            final Iterator iterator4 = Class9526.method35560("blockData.json").getAsJsonArray("occluding").iterator();
            while (iterator4.hasNext()) {
                Class8881.field37363.add(Class8881.field37360.get(((JsonElement)iterator4.next()).getAsString()));
            }
            final ArrayList list = new ArrayList();
            list.add(Class3648.method11223());
            list.addAll(Class3655.method11248());
            list.add(Class3652.method11244());
            list.addAll(Class3656.method11249());
            list.add(Class3647.method11222());
            list.addAll(Class3653.method11245());
            list.add(Class3659.method11263());
            list.add(Class3650.method11232());
            list.add(Class3645.method11209());
            list.add(Class3649.method11224());
            list.add(Class3644.method11207());
            list.addAll(Class3654.method11246());
            list.add(Class3657.method11253());
            list.add(Class3642.method11201());
            if (Class8563.method28792().method23313()) {
                list.add(Class3658.method11259());
            }
            final Iterator<String> iterator5 = Class8881.field37360.keySet().iterator();
            while (iterator5.hasNext()) {
                final Class9223 method34004 = Class9223.method34004(iterator5.next());
                final Iterator iterator6 = list.iterator();
                while (iterator6.hasNext()) {
                    ((Class7220)iterator6.next()).method22127(method34004);
                }
            }
            if (Class8563.method28792().method23300().equalsIgnoreCase("packet")) {
                Class8563.method28794().method33549().method29948((Class<Class6491>)Class6490.class, new Class6491());
            }
        }
    }
    
    public static boolean method31259(final int n) {
        return Class8881.field37362.containsKey(n) || Class8881.field37361.containsKey(n);
    }
    
    public static boolean method31260(final int i) {
        return Class8881.field37361.containsKey(i);
    }
    
    public static int method31261(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Class3643 class6110 = Class8881.field37361.get(i);
        return (class6110 == null) ? i : class6110.method11202(class6108, class6109, i);
    }
    
    public static Class3643 method31262(final int i) {
        return Class8881.field37361.get(i);
    }
    
    public static int method31263(final String s) {
        return Class8881.field37360.containsKey(s) ? Class8881.field37360.get(s) : -1;
    }
    
    public static String method31264(final int i) {
        return Class8881.field37359.get(i);
    }
    
    static {
        Class8881.field37359 = new HashMap<Integer, String>();
        Class8881.field37360 = new HashMap<String, Integer>();
        Class8881.field37361 = new HashMap<Integer, Class3643>();
        Class8881.field37362 = new HashMap<Integer, Class8614>();
        Class8881.field37363 = new HashSet<Integer>();
    }
}
