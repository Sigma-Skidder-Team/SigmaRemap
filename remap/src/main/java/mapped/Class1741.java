// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.io.IOException;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1741 implements Class1737
{
    private static final Logger field9707;
    private final Class6582 field9708;
    private final byte[] field9709;
    private final String field9710;
    private final Map<ResourceLocation, Class1846> field9711;
    
    public Class1741(final Class6582 field9708, final byte[] array, final String field9709) {
        this.field9711 = Maps.newHashMap();
        this.field9708 = field9708;
        this.field9709 = array;
        this.field9710 = field9709;
        for (int i = 0; i < 256; ++i) {
            final char fromIndex = (char)(i * 256);
            final ResourceLocation method6164 = this.method6164(fromIndex);
            try (final Class1671 method6165 = this.field9708.method19933(method6164);
                 final Class1846 method6166 = Class1846.method6638(Class2235.field13729, method6165.method5887())) {
                if (method6166.method6644() == 256 && method6166.method6645() == 256) {
                    for (char c = '\0'; c < '\u0100'; ++c) {
                        final byte b = array[fromIndex + c];
                        if (b != 0 && method6166(b) > method6167(b)) {
                            array[fromIndex + c] = 0;
                        }
                    }
                    continue;
                }
            }
            catch (final IOException ex) {}
            Arrays.fill(array, fromIndex, fromIndex + '\u0100', (byte)0);
        }
    }
    
    @Override
    public void close() {
        this.field9711.values().forEach(Class1846::close);
    }
    
    private ResourceLocation method6164(final char c) {
        final ResourceLocation class1932 = new ResourceLocation(String.format(this.field9710, String.format("%02x", c / '\u0100')));
        return new ResourceLocation(class1932.method7798(), "textures/" + class1932.method7797());
    }
    
    @Nullable
    @Override
    public Class2022 method6150(final char c) {
        final byte b = this.field9709[c];
        if (b != 0) {
            final Class1846 class1846 = this.field9711.computeIfAbsent(this.method6164(c), this::method6165);
            if (class1846 != null) {
                final int method6166 = method6166(b);
                return new Class2026(c % '\u0010' * 16 + method6166, (c & '\u00ff') / 16 * 16, method6167(b) - method6166, 16, class1846, null);
            }
        }
        return null;
    }
    
    @Nullable
    private Class1846 method6165(final ResourceLocation class1932) {
        try (final Class1671 method19933 = this.field9708.method19933(class1932)) {
            return Class1846.method6638(Class2235.field13729, method19933.method5887());
        }
        catch (final IOException ex) {
            Class1741.field9707.error("Couldn't load texture {}", (Object)class1932, (Object)ex);
            return null;
        }
    }
    
    private static int method6166(final byte b) {
        return b >> 4 & 0xF;
    }
    
    private static int method6167(final byte b) {
        return (b & 0xF) + 1;
    }
    
    static {
        field9707 = LogManager.getLogger();
    }
}
