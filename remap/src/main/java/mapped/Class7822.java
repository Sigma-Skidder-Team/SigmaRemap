// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Properties;
import java.io.IOException;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import java.util.List;

public class Class7822 implements Class7823
{
    private ResourceLocation field32037;
    private final List<String> field32038;
    private final int field32039;
    private final int field32040;
    
    public Class7822(final ResourceLocation class1932, final int field32039, final int field32040, final List<String> field32041) {
        this.field32037 = new ResourceLocation(class1932.method7798(), "textures/" + class1932.method7797());
        this.field32037 = Class9265.method34179(this.field32037);
        this.field32038 = field32041;
        this.field32039 = field32039;
        this.field32040 = field32040;
    }
    
    public static Class7822 method25275(final JsonObject jsonObject) {
        final int method35910 = Class9583.method35910(jsonObject, "height", 8);
        final int method35911 = Class9583.method35909(jsonObject, "ascent");
        if (method35911 > method35910) {
            throw new JsonParseException("Ascent " + method35911 + " higher than height " + method35910);
        }
        final ArrayList arrayList = Lists.newArrayList();
        final JsonArray method35912 = Class9583.method35917(jsonObject, "chars");
        for (int i = 0; i < method35912.size(); ++i) {
            final String method35913 = Class9583.method35894(method35912.get(i), "chars[" + i + "]");
            if (i > 0) {
                final int length = method35913.length();
                final int length2 = ((String)arrayList.get(0)).length();
                if (length != length2) {
                    throw new JsonParseException("Elements of chars have to be the same length (found: " + length + ", expected: " + length2 + "), pad with space or \\u0000");
                }
            }
            arrayList.add(method35913);
        }
        if (!arrayList.isEmpty() && !((String)arrayList.get(0)).isEmpty()) {
            return new Class7822(new ResourceLocation(Class9583.method35895(jsonObject, "file")), method35910, method35911, arrayList);
        }
        throw new JsonParseException("Expected to find data in chars, found none.");
    }
    
    @Nullable
    @Override
    public Class1737 method25276(final Class6582 class6582) {
        try (final Class1671 method19933 = class6582.method19933(this.field32037)) {
            final Class1846 method19934 = Class1846.method6638(Class2235.field13729, method19933.method5887());
            final int method19935 = method19934.method6644();
            final int method19936 = method19934.method6645();
            final int n = method19935 / this.field32038.get(0).length();
            final int n2 = method19936 / this.field32038.size();
            final float n3 = this.field32039 / (float)n2;
            final Char2ObjectOpenHashMap char2ObjectOpenHashMap = new Char2ObjectOpenHashMap();
            final Properties method19937 = Class9265.method34175(this.field32037);
            final Char2ObjectMap<Float> method19938 = Class9265.method34176(method19937);
            final Float n4 = method19938.get(' ');
            final boolean method19939 = Class9265.method34178(method19937, "blend", false);
            float method19940 = Class9265.method34177(method19937, "offsetBold", -1.0f);
            if (method19940 < 0.0f) {
                method19940 = ((n > 8) ? 0.5f : 1.0f);
            }
            for (int i = 0; i < this.field32038.size(); ++i) {
                final String s = this.field32038.get(i);
                for (int j = 0; j < s.length(); ++j) {
                    final char char1 = s.charAt(j);
                    if (char1 != '\0' && char1 != ' ') {
                        float n5 = (float)this.method25277(method19934, n, n2, j, i);
                        final Float n6 = method19938.get(char1);
                        if (n6 != null) {
                            n5 = n6 * (n / 8.0f);
                        }
                        if (char2ObjectOpenHashMap.put(char1, new Class2027(n3, method19934, j * n, i * n2, n, n2, (int)(0.5 + n5 * n3) + 1, this.field32040, null)) != null) {
                            Class1738.method6153().warn("Codepoint '{}' declared multiple times in {}", (Object)Integer.toHexString(char1), (Object)this.field32037);
                        }
                        Class2027.method8085((Class2027) char2ObjectOpenHashMap.get(char1), method19940);
                    }
                }
            }
            final Class1738 class6583 = new Class1738(method19934, (Char2ObjectMap<Class2027>)char2ObjectOpenHashMap);
            Class1738.method6154(class6583, method19939);
            if (n4 != null) {
                Class1738.method6155(class6583, n4);
            }
            return class6583;
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
    
    private int method25277(final Class1846 class1846, final int n, final int n2, final int n3, final int n4) {
        int i;
        for (i = n - 1; i >= 0; --i) {
            final int n5 = n3 * n + i;
            for (int j = 0; j < n2; ++j) {
                if ((class1846.method6649(n5, n4 * n2 + j) & 0xFF) > 16) {
                    return i + 1;
                }
            }
        }
        return i + 1;
    }
}
