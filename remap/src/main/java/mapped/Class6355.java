// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class6355 extends Class6354
{
    private final Map<String, Class51> field25419;
    
    public Class6355(final String s) {
        super(s);
        this.field25419 = Maps.newHashMap();
    }
    
    @Override
    public void method18901(final Class51 class51) {
        final Class51 method327 = class51.method327("contents");
        for (final String s : method327.method293()) {
            this.field25419.put(s, method327.method327(s));
        }
    }
    
    @Override
    public Class51 method18902(final Class51 class51) {
        final Class51 class52 = new Class51();
        this.field25419.forEach((s, class54) -> class53.method295(s, class54.method333()));
        class51.method295("contents", class52);
        return class51;
    }
    
    public Class51 method18908(final String s) {
        final Class51 class51 = this.field25419.get(s);
        return (class51 == null) ? new Class51() : class51;
    }
    
    public void method18909(final String s, final Class51 class51) {
        if (!class51.method331()) {
            this.field25419.put(s, class51);
        }
        else {
            this.field25419.remove(s);
        }
        this.method18903();
    }
    
    public Stream<ResourceLocation> method18910(final String s) {
        return this.field25419.keySet().stream().map(s3 -> new ResourceLocation(s2, s3));
    }
}
