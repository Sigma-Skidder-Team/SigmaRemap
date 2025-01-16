// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class8965
{
    private final Map<String, Class6355> field37671;
    private final Class8213 field37672;
    
    public Class8965(final Class8213 field37672) {
        this.field37671 = Maps.newHashMap();
        this.field37672 = field37672;
    }
    
    private Class6355 method31804(final String s, final String s2) {
        final Class6355 class6355 = new Class6355(s2);
        this.field37671.put(s, class6355);
        return class6355;
    }
    
    public Class51 method31805(final ResourceLocation class1932) {
        final Class6355 class1933 = this.field37672.method27209(() -> this.method31804(s, s2), method31808(class1932.method7798()));
        return (class1933 == null) ? new Class51() : class1933.method18908(class1932.method7797());
    }
    
    public void method31806(final ResourceLocation class1932, final Class51 class1933) {
        this.field37672.method27208(() -> this.method31804(s, s2), method31808(class1932.method7798())).method18909(class1932.method7797(), class1933);
    }
    
    public Stream<ResourceLocation> method31807() {
        return this.field37671.entrySet().stream().flatMap(entry -> entry.getValue().method18910((String)entry.getKey()));
    }
    
    private static String method31808(final String str) {
        return "command_storage_" + str;
    }
}
