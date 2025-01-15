// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.function.Function;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.Map;

public class Class6516
{
    private final Map<String, Class9290> field25930;
    private final Map<Class9456, List<Class9290>> field25931;
    private final Map<String, Map<Class9290, Class7628>> field25932;
    private final Class9290[] field25933;
    private final Map<String, Class6749> field25934;
    private final Map<String, Class6749> field25935;
    private static String[] field25936;
    
    public Class6516() {
        this.field25930 = Maps.newHashMap();
        this.field25931 = Maps.newHashMap();
        this.field25932 = Maps.newHashMap();
        this.field25933 = new Class9290[19];
        this.field25934 = Maps.newHashMap();
        this.field25935 = Maps.newHashMap();
    }
    
    public boolean method19630(final String s) {
        return this.field25930.containsKey(s);
    }
    
    public Class9290 method19631(final String s) {
        return this.field25930.get(s);
    }
    
    @Nullable
    public Class9290 method19632(final String s) {
        return this.field25930.get(s);
    }
    
    public Class9290 method19633(final String s, final Class9456 key, final ITextComponent class2250, final Class263 class2251) {
        if (s.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + s + "' is too long!");
        }
        if (!this.field25930.containsKey(s)) {
            final Class9290 class2252 = new Class9290(this, s, key, class2250, class2251);
            this.field25931.computeIfAbsent(key, p0 -> Lists.newArrayList()).add(class2252);
            this.field25930.put(s, class2252);
            this.method19617(class2252);
            return class2252;
        }
        throw new IllegalArgumentException("An objective with the name '" + s + "' already exists!");
    }
    
    public final void method19634(final Class9456 key, final String s, final Consumer<Class7628> consumer) {
        this.field25931.getOrDefault(key, Collections.emptyList()).forEach(class9290 -> consumer2.accept(this.method19636(s2, class9290)));
    }
    
    public boolean method19635(final String s, final Class9290 class9290) {
        final Map map = this.field25932.get(s);
        return map != null && map.get(class9290) != null;
    }
    
    public Class7628 method19636(final String s, final Class9290 key) {
        if (s.length() <= 40) {
            return this.field25932.computeIfAbsent(s, p0 -> Maps.newHashMap()).computeIfAbsent(key, class9290 -> {
                final Class7628 class9291 = new Class7628(this, class9290, s2);
                class9291.method23971(0);
                return class9291;
            });
        }
        throw new IllegalArgumentException("The player name '" + s + "' is too long!");
    }
    
    public Collection<Class7628> method19637(final Class9290 class9290) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Map<Class9290, Class7628>> iterator = this.field25932.values().iterator();
        while (iterator.hasNext()) {
            final Class7628 class9291 = ((Map<K, Class7628>)iterator.next()).get(class9290);
            if (class9291 == null) {
                continue;
            }
            arrayList.add(class9291);
        }
        arrayList.sort(Class7628.field30208);
        return arrayList;
    }
    
    public Collection<Class9290> method19638() {
        return this.field25930.values();
    }
    
    public Collection<String> method19639() {
        return this.field25930.keySet();
    }
    
    public Collection<String> method19640() {
        return Lists.newArrayList((Iterable)this.field25932.keySet());
    }
    
    public void method19641(final String s, final Class9290 class9290) {
        if (class9290 != null) {
            final Map map = this.field25932.get(s);
            if (map != null) {
                final Class7628 class9291 = (Class7628)map.remove(class9290);
                if (map.size() >= 1) {
                    if (class9291 != null) {
                        this.method19613(s, class9290);
                    }
                }
                else if (this.field25932.remove(s) != null) {
                    this.method19612(s);
                }
            }
        }
        else if (this.field25932.remove(s) != null) {
            this.method19612(s);
        }
    }
    
    public Map<Class9290, Class7628> method19642(final String s) {
        Map hashMap = this.field25932.get(s);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
        }
        return hashMap;
    }
    
    public void method19643(final Class9290 class9290) {
        this.field25930.remove(class9290.method34312());
        for (int i = 0; i < 19; ++i) {
            if (this.method19644(i) == class9290) {
                this.method19614(i, null);
            }
        }
        final List list = this.field25931.get(class9290.method34313());
        if (list != null) {
            list.remove(class9290);
        }
        final Iterator<Map<Class9290, Class7628>> iterator = this.field25932.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().remove(class9290);
        }
        this.method19619(class9290);
    }
    
    public void method19614(final int n, final Class9290 class9290) {
        this.field25933[n] = class9290;
    }
    
    @Nullable
    public Class9290 method19644(final int n) {
        return this.field25933[n];
    }
    
    public Class6749 method19645(final String s) {
        return this.field25934.get(s);
    }
    
    public Class6749 method19646(final String s) {
        if (s.length() > 16) {
            throw new IllegalArgumentException("The team name '" + s + "' is too long!");
        }
        if (this.method19645(s) == null) {
            final Class6749 class6749 = new Class6749(this, s);
            this.field25934.put(s, class6749);
            this.method19620(class6749);
            return class6749;
        }
        throw new IllegalArgumentException("A team with the name '" + s + "' already exists!");
    }
    
    public void method19647(final Class6749 class6749) {
        this.field25934.remove(class6749.method20539());
        final Iterator<String> iterator = class6749.method20547().iterator();
        while (iterator.hasNext()) {
            this.field25935.remove(iterator.next());
        }
        this.method19622(class6749);
    }
    
    public boolean method19615(final String str, final Class6749 class6749) {
        if (str.length() <= 40) {
            if (this.method19651(str) != null) {
                this.method19648(str);
            }
            this.field25935.put(str, class6749);
            return class6749.method20547().add(str);
        }
        throw new IllegalArgumentException("The player name '" + str + "' is too long!");
    }
    
    public boolean method19648(final String s) {
        final Class6749 method19651 = this.method19651(s);
        if (method19651 == null) {
            return false;
        }
        this.method19616(s, method19651);
        return true;
    }
    
    public void method19616(final String s, final Class6749 class6749) {
        if (this.method19651(s) == class6749) {
            this.field25935.remove(s);
            class6749.method20547().remove(s);
            return;
        }
        throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + class6749.method20539() + "'.");
    }
    
    public Collection<String> method19649() {
        return this.field25934.keySet();
    }
    
    public Collection<Class6749> method19650() {
        return this.field25934.values();
    }
    
    @Nullable
    public Class6749 method19651(final String s) {
        return this.field25935.get(s);
    }
    
    public void method19617(final Class9290 class9290) {
    }
    
    public void method19618(final Class9290 class9290) {
    }
    
    public void method19619(final Class9290 class9290) {
    }
    
    public void method19611(final Class7628 class7628) {
    }
    
    public void method19612(final String s) {
    }
    
    public void method19613(final String s, final Class9290 class9290) {
    }
    
    public void method19620(final Class6749 class6749) {
    }
    
    public void method19621(final Class6749 class6749) {
    }
    
    public void method19622(final Class6749 class6749) {
    }
    
    public static String method19652(final int n) {
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
            default: {
                if (n >= 3 && n <= 18) {
                    final Class2116 method8261 = Class2116.method8261(n - 3);
                    if (method8261 != null && method8261 != Class2116.field12330) {
                        return "sidebar.team." + method8261.method8258();
                    }
                }
                return null;
            }
        }
    }
    
    public static int method19653(final String anotherString) {
        if ("list".equalsIgnoreCase(anotherString)) {
            return 0;
        }
        if ("sidebar".equalsIgnoreCase(anotherString)) {
            return 1;
        }
        if (!"belowName".equalsIgnoreCase(anotherString)) {
            if (anotherString.startsWith("sidebar.team.")) {
                final Class2116 method8260 = Class2116.method8260(anotherString.substring("sidebar.team.".length()));
                if (method8260 != null) {
                    if (method8260.method8253() >= 0) {
                        return method8260.method8253() + 3;
                    }
                }
            }
            return -1;
        }
        return 2;
    }
    
    public static String[] method19654() {
        if (Class6516.field25936 == null) {
            Class6516.field25936 = new String[19];
            for (int i = 0; i < 19; ++i) {
                Class6516.field25936[i] = method19652(i);
            }
        }
        return Class6516.field25936;
    }
    
    public void method19655(final Entity class399) {
        if (class399 != null) {
            if (!(class399 instanceof Class512)) {
                if (!class399.method1768()) {
                    final String method1866 = class399.method1866();
                    this.method19641(method1866, null);
                    this.method19648(method1866);
                }
            }
        }
    }
    
    public Class52 method19656() {
        final Class52 class52 = new Class52();
        this.field25932.values().stream().map((Function<? super Map<Class9290, Class7628>, ?>)Map::values).forEach(collection -> collection.stream().filter(class53 -> class53.method23972() != null).forEach(class55 -> {
            final Class51 e = new Class51();
            e.method306("Name", class55.method23973());
            e.method306("Objective", class55.method23972().method34312());
            e.method298("Score", class55.method23969());
            e.method312("Locked", class55.method23975());
            ((AbstractList<Class51>)class54).add(e);
        }));
        return class52;
    }
    
    public void method19657(final Class52 class52) {
        for (int i = 0; i < class52.size(); ++i) {
            final Class51 method346 = class52.method346(i);
            final Class9290 method347 = this.method19631(method346.method323("Objective"));
            String s = method346.method323("Name");
            if (s.length() > 40) {
                s = s.substring(0, 40);
            }
            final Class7628 method348 = this.method19636(s, method347);
            method348.method23971(method346.method319("Score"));
            if (method346.method315("Locked")) {
                method348.method23976(method346.method329("Locked"));
            }
        }
    }
}
