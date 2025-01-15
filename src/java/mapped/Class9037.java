// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.MalformedURLException;
import java.util.UUID;
import com.google.common.collect.Maps;
import java.util.Timer;
import java.net.URL;
import java.util.Map;

public class Class9037
{
    private final Map<String, Object> field38239;
    private final Map<String, Object> field38240;
    private final String field38241;
    private final URL field38242;
    private final Class868 field38243;
    private final Timer field38244;
    private final Object field38245;
    private final long field38246;
    private boolean field38247;
    
    public Class9037(final String str, final Class868 field38243, final long field38244) {
        this.field38239 = Maps.newHashMap();
        this.field38240 = Maps.newHashMap();
        this.field38241 = UUID.randomUUID().toString();
        this.field38244 = new Timer("Snooper Timer", true);
        this.field38245 = new Object();
        try {
            this.field38242 = new URL("http://snoop.minecraft.net/" + str + "?version=" + 2);
        }
        catch (final MalformedURLException ex) {
            throw new IllegalArgumentException();
        }
        this.field38243 = field38243;
        this.field38246 = field38244;
    }
    
    public void method32484() {
        if (this.field38247) {}
    }
    
    public void method32485() {
        this.method32487("memory_total", Runtime.getRuntime().totalMemory());
        this.method32487("memory_max", Runtime.getRuntime().maxMemory());
        this.method32487("memory_free", Runtime.getRuntime().freeMemory());
        this.method32487("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.field38243.method1516(this);
    }
    
    public void method32486(final String s, final Object o) {
        synchronized (this.field38245) {
            this.field38240.put(s, o);
        }
    }
    
    public void method32487(final String s, final Object o) {
        synchronized (this.field38245) {
            this.field38239.put(s, o);
        }
    }
    
    public boolean method32488() {
        return this.field38247;
    }
    
    public void method32489() {
        this.field38244.cancel();
    }
    
    public String method32490() {
        return this.field38241;
    }
    
    public long method32491() {
        return this.field38246;
    }
}
