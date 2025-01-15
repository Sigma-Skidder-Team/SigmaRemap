// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import org.lwjgl.system.MemoryUtil;
import java.io.IOException;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.stb.STBTTFontinfo;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.Logger;

public class Class7825 implements Class7823
{
    private static final Logger field32043;
    private final Class1932 field32044;
    private final float field32045;
    private final float field32046;
    private final float field32047;
    private final float field32048;
    private final String field32049;
    
    public Class7825(final Class1932 field32044, final float field32045, final float field32046, final float field32047, final float field32048, final String field32049) {
        this.field32044 = field32044;
        this.field32045 = field32045;
        this.field32046 = field32046;
        this.field32047 = field32047;
        this.field32048 = field32048;
        this.field32049 = field32049;
    }
    
    public static Class7823 method25279(final JsonObject jsonObject) {
        float method35902 = 0.0f;
        float method35903 = 0.0f;
        if (jsonObject.has("shift")) {
            final JsonArray asJsonArray = jsonObject.getAsJsonArray("shift");
            if (asJsonArray.size() != 2) {
                throw new JsonParseException("Expected 2 elements in 'shift', found " + asJsonArray.size());
            }
            method35902 = Class9583.method35902(asJsonArray.get(0), "shift[0]");
            method35903 = Class9583.method35902(asJsonArray.get(1), "shift[1]");
        }
        final StringBuilder sb = new StringBuilder();
        if (jsonObject.has("skip")) {
            final JsonElement value = jsonObject.get("skip");
            if (!value.isJsonArray()) {
                sb.append(Class9583.method35894(value, "skip"));
            }
            else {
                final JsonArray method35904 = Class9583.method35916(value, "skip");
                for (int i = 0; i < method35904.size(); ++i) {
                    sb.append(Class9583.method35894(method35904.get(i), "skip[" + i + "]"));
                }
            }
        }
        return new Class7825(new Class1932(Class9583.method35895(jsonObject, "file")), Class9583.method35904(jsonObject, "size", 11.0f), Class9583.method35904(jsonObject, "oversample", 1.0f), method35902, method35903, sb.toString());
    }
    
    @Nullable
    @Override
    public Class1737 method25276(final Class6582 class6582) {
        STBTTFontinfo malloc = null;
        ByteBuffer method32108 = null;
        try (final Class1671 method32109 = class6582.method19933(new Class1932(this.field32044.method7798(), "font/" + this.field32044.method7797()))) {
            Class7825.field32043.debug("Loading font {}", (Object)this.field32044);
            malloc = STBTTFontinfo.malloc();
            method32108 = Class8995.method32108(method32109.method5887());
            method32108.flip();
            Class7825.field32043.debug("Reading font {}", (Object)this.field32044);
            if (!STBTruetype.stbtt_InitFont(malloc, method32108)) {
                throw new IOException("Invalid ttf");
            }
            return new Class1740(method32108, malloc, this.field32045, this.field32046, this.field32047, this.field32048, this.field32049);
        }
        catch (final Exception ex) {
            Class7825.field32043.error("Couldn't load truetype font {}", (Object)this.field32044, (Object)ex);
            if (malloc != null) {
                malloc.free();
            }
            MemoryUtil.memFree((Buffer)method32108);
            return null;
        }
    }
    
    static {
        field32043 = LogManager.getLogger();
    }
}
