// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.stream.Stream;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class7189
{
    private static final Logger field27935;
    private static final Class3499 field27936;
    private final Map<Class2139, Class3499> field27937;
    private final Set<Class3499> field27938;
    private final IProfiler field27939;
    private final EnumSet<Class2139> field27940;
    private int field27941;
    
    public Class7189(final IProfiler field27939) {
        this.field27937 = new EnumMap<Class2139, Class3499>(Class2139.class);
        this.field27938 = Sets.newLinkedHashSet();
        this.field27940 = EnumSet.noneOf(Class2139.class);
        this.field27941 = 3;
        this.field27939 = field27939;
    }
    
    public void method22062(final int n, final Class3446 class3446) {
        this.field27938.add(new Class3499(n, class3446));
    }
    
    public void method22063(final Class3446 class3446) {
        this.field27938.stream().filter(class3448 -> class3448.method11064() == class3447).filter(Class3499::method11062).forEach(Class3499::method11018);
        this.field27938.removeIf(class3450 -> class3450.method11064() == class3449);
    }
    
    public void method22064() {
        this.field27939.method15297("goalCleanup");
        if (this.field27938.size() > 0) {
            for (final Class3499 class3499 : this.field27938) {
                if (!class3499.method11062()) {
                    continue;
                }
                if (class3499.method11062()) {
                    if (!Class9279.method34253(class3499.method11020(), this.field27940)) {
                        if (class3499.method11017()) {
                            continue;
                        }
                    }
                }
                class3499.method11018();
            }
        }
        if (this.field27937.size() > 0) {
            this.field27937.forEach((class3502, class3503) -> {
                if (!class3503.method11062()) {
                    this.field27937.remove(class3502);
                }
                return;
            });
        }
        this.field27939.method15299();
        this.field27939.method15297("goalUpdate");
        if (this.field27938.size() > 0) {
            for (final Class3499 class3500 : this.field27938) {
                if (class3500.method11062()) {
                    continue;
                }
                if (!Class9279.method34252(class3500.method11020(), this.field27940)) {
                    continue;
                }
                if (!method22065(class3500, class3500.method11020(), this.field27937)) {
                    continue;
                }
                if (!class3500.method11013()) {
                    continue;
                }
                method22066(class3500, class3500.method11020(), this.field27937);
                class3500.method11015();
            }
        }
        this.field27939.method15299();
        this.field27939.method15297("goalTick");
        if (this.field27938.size() > 0) {
            for (final Class3499 class3501 : this.field27938) {
                if (!class3501.method11062()) {
                    continue;
                }
                class3501.method11016();
            }
        }
        this.field27939.method15299();
    }
    
    private static boolean method22065(final Class3499 class3499, final EnumSet<Class2139> set, final Map<Class2139, Class3499> map) {
        if (!set.isEmpty()) {
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                if (map.getOrDefault(iterator.next(), Class7189.field27936).method11061(class3499)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return true;
    }
    
    private static void method22066(final Class3499 class3499, final EnumSet<Class2139> set, final Map<Class2139, Class3499> map) {
        if (!set.isEmpty()) {
            for (final Class2139 key : set) {
                map.getOrDefault(key, Class7189.field27936).method11018();
                map.put(key, class3499);
            }
        }
    }
    
    public Stream<Class3499> method22067() {
        return this.field27938.stream().filter(Class3499::method11062);
    }
    
    public void method22068(final Class2139 e) {
        this.field27940.add(e);
    }
    
    public void method22069(final Class2139 o) {
        this.field27940.remove(o);
    }
    
    public void method22070(final Class2139 class2139, final boolean b) {
        if (!b) {
            this.method22068(class2139);
        }
        else {
            this.method22069(class2139);
        }
    }
    
    static {
        field27935 = LogManager.getLogger();
        field27936 = new Class3500(Integer.MAX_VALUE, new Class3537());
    }
}
