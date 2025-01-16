// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import org.apache.logging.log4j.Logger;

public abstract class Class1732 implements Class1727
{
    private static final Logger field9678;
    public final File field9679;
    
    public Class1732(final File field9679) {
        this.field9679 = field9679;
    }
    
    private static String method6125(final Class346 class346, final ResourceLocation class347) {
        return String.format("%s/%s/%s", class346.method1028(), class347.method7798(), class347.method7797());
    }
    
    public static String method6126(final File file, final File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }
    
    @Override
    public InputStream method6097(final Class346 class346, final ResourceLocation class347) throws IOException {
        return this.method6127(method6125(class346, class347));
    }
    
    @Override
    public boolean method6099(final Class346 class346, final ResourceLocation class347) {
        return this.method6128(method6125(class346, class347));
    }
    
    public abstract InputStream method6127(final String p0) throws IOException;
    
    @Override
    public InputStream method6096(final String s) throws IOException {
        if (!s.contains("/") && !s.contains("\\")) {
            return this.method6127(s);
        }
        throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
    }
    
    public abstract boolean method6128(final String p0);
    
    public void method6129(final String s) {
        Class1732.field9678.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", (Object)s, (Object)this.field9679);
    }
    
    @Nullable
    @Override
    public <T> T method6101(final Class5092<T> class5092) throws IOException {
        T method6128;
        try (final InputStream method6127 = this.method6127("pack.mcmeta")) {
            method6128 = method6130(class5092, method6127);
        }
        return method6128;
    }
    
    @Nullable
    public static <T> T method6130(final Class5092<T> class5092, final InputStream in) {
        JsonObject method35933;
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            method35933 = Class9583.method35933(bufferedReader);
        }
        catch (final IOException | JsonParseException ex) {
            Class1732.field9678.error("Couldn't load {} metadata", (Object)class5092.method15968(), (Object)ex);
            return null;
        }
        if (!method35933.has(class5092.method15968())) {
            return null;
        }
        try {
            return (T)class5092.method15969(Class9583.method35914(method35933, class5092.method15968()));
        }
        catch (final JsonParseException ex2) {
            Class1732.field9678.error("Couldn't load {} metadata", (Object)class5092.method15968(), (Object)ex2);
            return null;
        }
    }
    
    @Override
    public String method6102() {
        return this.field9679.getName();
    }
    
    static {
        field9678 = LogManager.getLogger();
    }
}
