// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Sets;
import java.util.SortedSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1661 implements Class1657
{
    private static final Logger field9423;
    public static final Class8271 field9424;
    private String field9425;
    private final Map<String, Class1947> field9426;
    
    public Class1661(final String field9425) {
        this.field9426 = Maps.newHashMap();
        this.field9425 = field9425;
        Class8822.method30772(Class1661.field9424);
    }
    
    public void method5842(final List<Class1727> list) {
        this.field9426.clear();
        for (final Class1727 class1727 : list) {
            try {
                final Class8785 class1728 = class1727.method6101((Class5092<Class8785>)Class8785.field36934);
                if (class1728 == null) {
                    continue;
                }
                for (final Class1947 class1729 : class1728.method30572()) {
                    if (!this.field9426.containsKey(class1729.getCode())) {
                        this.field9426.put(class1729.getCode(), class1729);
                    }
                }
            }
            catch (final IOException | RuntimeException ex) {
                Class1661.field9423.warn("Unable to parse language metadata section of resourcepack: {}", (Object)class1727.method6102(), (Object)ex);
            }
        }
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { "en_us" });
        if (!"en_us".equals(this.field9425)) {
            arrayList.add(this.field9425);
        }
        Class1661.field9424.method27492(class6582, arrayList);
        Class8837.method30859(Class1661.field9424.field33964);
    }
    
    public boolean method5843() {
        return this.method5845() != null && this.method5845().method7903();
    }
    
    public void method5844(final Class1947 class1947) {
        this.field9425 = class1947.getCode();
    }
    
    public Class1947 method5845() {
        return this.field9426.get(this.field9426.containsKey(this.field9425) ? this.field9425 : "en_us");
    }
    
    public SortedSet<Class1947> method5846() {
        return Sets.newTreeSet((Iterable)this.field9426.values());
    }
    
    public Class1947 method5847(final String s) {
        return this.field9426.get(s);
    }
    
    static {
        field9423 = LogManager.getLogger();
        field9424 = new Class8271();
    }
}
