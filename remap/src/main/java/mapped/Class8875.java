// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class8875
{
    private final Map<ResourceLocation, Class7833> field37311;
    
    public Class8875() {
        this.field37311 = Maps.newHashMap();
    }
    
    private void method31202(final ResourceLocation class1932, final Class8722 class1933, final Class6582 class1934) {
        Class7833 class1935 = this.field37311.get(class1932);
        final boolean b = class1935 == null;
        if (b || class1933.method29973()) {
            if (!b) {
                Class1784.method6437().debug("Replaced sound event location {}", (Object)class1932);
            }
            class1935 = new Class7833(class1932, class1933.method29974());
            this.field37311.put(class1932, class1935);
        }
        for (final Class7832 class1936 : class1933.method29972()) {
            final ResourceLocation method25304 = class1936.method25304();
            Class7831<Class7832> class1937 = null;
            switch (Class8270.field33960[class1936.method25308().ordinal()]) {
                case 1: {
                    if (!Class1784.method6438(class1936, class1932, class1934)) {
                        continue;
                    }
                    class1937 = class1936;
                    break;
                }
                case 2: {
                    class1937 = new Class7830(this, method25304, class1936);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown SoundEventRegistration type: " + class1936.method25308());
                }
            }
            class1935.method25312(class1937);
        }
    }
    
    public void method31203(final Map<ResourceLocation, Class7833> map, final Class9382 class9382) {
        map.clear();
        for (final Map.Entry<ResourceLocation, V> entry : this.field37311.entrySet()) {
            map.put(entry.getKey(), (Class7833)entry.getValue());
            ((Class7833)entry.getValue()).method25302(class9382);
        }
    }
}
