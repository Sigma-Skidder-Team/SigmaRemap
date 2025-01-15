// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import java.lang.reflect.Type;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Maps;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class1784 extends Class1776<Class8875>
{
    public static final Class7832 field9895;
    private static final Logger field9896;
    private static final Gson field9897;
    private static final ParameterizedType field9898;
    private final Map<Class1932, Class7833> field9899;
    private final Class9382 field9900;
    
    public Class1784(final Class6582 class6582, final Class5760 class6583) {
        this.field9899 = Maps.newHashMap();
        this.field9900 = new Class9382(this, class6583, class6582);
    }
    
    public Class8875 method6415(final Class6582 class6582, final Class5028 class6583) {
        final Class8875 class6584 = new Class8875();
        class6583.method15295();
        for (final String s : class6582.method19932()) {
            class6583.method15297(s);
            try {
                for (final Class1671 class6585 : class6582.method19935(new Class1932(s, "sounds.json"))) {
                    class6583.method15297(class6585.method5889());
                    try {
                        class6583.method15297("parse");
                        final Map<String, Class8722> method6417 = method6417(class6585.method5887());
                        class6583.method15300("register");
                        for (final Map.Entry<String, V> entry : method6417.entrySet()) {
                            Class8875.method31204(class6584, new Class1932(s, entry.getKey()), (Class8722)entry.getValue(), class6582);
                        }
                        class6583.method15299();
                    }
                    catch (final RuntimeException ex) {
                        Class1784.field9896.warn("Invalid sounds.json in resourcepack: '{}'", (Object)class6585.method5889(), (Object)ex);
                    }
                    class6583.method15299();
                }
            }
            catch (final IOException ex2) {}
            class6583.method15299();
        }
        class6583.method15296();
        return class6584;
    }
    
    public void method6416(final Class8875 class8875, final Class6582 class8876, final Class5028 class8877) {
        class8875.method31203(this.field9899, this.field9900);
        for (final Class1932 class8878 : this.field9899.keySet()) {
            final Class7833 class8879 = this.field9899.get(class8878);
            if (!(class8879.method25313() instanceof Class2259)) {
                continue;
            }
            final String method8496 = ((Class2259)class8879.method25313()).method8496();
            if (Class8822.method30774(method8496)) {
                continue;
            }
            Class1784.field9896.debug("Missing subtitle {} for event: {}", (Object)method8496, (Object)class8878);
        }
        if (Class1784.field9896.isDebugEnabled()) {
            for (final Class1932 class8880 : this.field9899.keySet()) {
                if (Class90.field205.method510(class8880)) {
                    continue;
                }
                Class1784.field9896.debug("Not having sound event for: {}", (Object)class8880);
            }
        }
        this.field9900.method34832();
    }
    
    @Nullable
    public static Map<String, Class8722> method6417(final InputStream in) {
        Map map;
        try {
            map = Class9583.method35926(Class1784.field9897, new InputStreamReader(in, StandardCharsets.UTF_8), Class1784.field9898);
        }
        finally {
            IOUtils.closeQuietly(in);
        }
        return map;
    }
    
    private static boolean method6418(final Class7832 class7832, final Class1932 class7833, final Class6582 class7834) {
        final Class1932 method25305 = class7832.method25305();
        if (class7834.method19934(method25305)) {
            return true;
        }
        Class1784.field9896.warn("File {} does not exist, cannot add it to event {}", (Object)method25305, (Object)class7833);
        return false;
    }
    
    @Nullable
    public Class7833 method6419(final Class1932 class1932) {
        return this.field9899.get(class1932);
    }
    
    public Collection<Class1932> method6420() {
        return this.field9899.keySet();
    }
    
    public void method6421(final Class6833 class6833) {
        this.field9900.method34845(class6833);
    }
    
    public void method6422(final Class6834 class6834) {
        this.field9900.method34844(class6834);
    }
    
    public void method6423(final Class6834 class6834, final int n) {
        this.field9900.method34851(class6834, n);
    }
    
    public void method6424(final Class6092 class6092) {
        this.field9900.method34852(class6092);
    }
    
    public void method6425() {
        this.field9900.method34849();
    }
    
    public void method6426() {
        this.field9900.method34838();
    }
    
    public void method6427() {
        this.field9900.method34836();
    }
    
    public void method6428(final boolean b) {
        this.field9900.method34841(b);
    }
    
    public void method6429() {
        this.field9900.method34850();
    }
    
    public void method6430(final Class286 class286, final float n) {
        if (class286 == Class286.field1578) {
            if (n <= 0.0f) {
                this.method6426();
            }
        }
        this.field9900.method34835(class286, n);
    }
    
    public void method6431(final Class6834 class6834) {
        this.field9900.method34837(class6834);
    }
    
    public boolean method6432(final Class6834 class6834) {
        return this.field9900.method34843(class6834);
    }
    
    public void method6433(final Class687 class687) {
        this.field9900.method34839(class687);
    }
    
    public void method6434(final Class687 class687) {
        this.field9900.method34840(class687);
    }
    
    public void method6435(final Class1932 class1932, final Class286 class1933) {
        this.field9900.method34853(class1932, class1933);
    }
    
    public String method6436() {
        return this.field9900.method34854();
    }
    
    static {
        field9895 = new Class7832("meta:missing_sound", 1.0f, 1.0f, 1, Class2158.field12815, false, false, 16);
        field9896 = LogManager.getLogger();
        field9897 = new GsonBuilder().registerTypeHierarchyAdapter((Class)Class2250.class, (Object)new Class5953()).registerTypeAdapter((Type)Class8722.class, (Object)new Class5981()).create();
        field9898 = new Class8359();
    }
}
