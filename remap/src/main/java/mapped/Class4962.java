// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.Call;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Class4962 extends Class4961
{
    public static final String field21296 = "success";
    public static final String field21297 = "data";
    public static final String field21298 = "error";
    public static final String field21299 = "requestHeaders";
    public static final String field21300 = "responseHeaders";
    private static final String field21301 = "application/octet-stream";
    private static final String field21302 = "text/plain;charset=UTF-8";
    private static final Class8991 field21303;
    private static final Class8991 field21304;
    private String field21305;
    private String field21306;
    private Object field21307;
    private Class2310 field21308;
    private Response field21309;
    private Call field21310;
    
    public Class4962(final Class9266 class9266) {
        this.field21305 = ((class9266.field39738 == null) ? "GET" : class9266.field39738);
        this.field21306 = class9266.field39737;
        this.field21307 = class9266.field39739;
        this.field21308 = ((class9266.field39740 == null) ? new OkHttpClient() : class9266.field39740);
    }
    
    public void method14984() {
        if (Class4966.method15036()) {
            Class4966.method15037().fine(String.format("xhr open %s: %s", this.field21305, this.field21306));
        }
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        if ("POST".equals(this.field21305)) {
            if (!(this.field21307 instanceof byte[])) {
                treeMap.put("Content-type", new LinkedList(Collections.singletonList("text/plain;charset=UTF-8")));
            }
            else {
                treeMap.put("Content-type", new LinkedList(Collections.singletonList("application/octet-stream")));
            }
        }
        treeMap.put("Accept", new LinkedList(Collections.singletonList("*/*")));
        this.method14989(treeMap);
        if (Class4966.method15036()) {
            Class4966.method15037().fine(String.format("sending xhr with url %s | data %s", this.field21306, (this.field21307 instanceof byte[]) ? Arrays.toString((byte[])this.field21307) : this.field21307));
        }
        final Class8896 class8896 = new Class8896();
        for (final Map.Entry<K, List> entry : treeMap.entrySet()) {
            final Iterator iterator2 = entry.getValue().iterator();
            while (iterator2.hasNext()) {
                class8896.method31313((String)entry.getKey(), (String)iterator2.next());
            }
        }
        Class7173 class8897 = null;
        if (!(this.field21307 instanceof byte[])) {
            if (this.field21307 instanceof String) {
                class8897 = Class7173.method21943(Class4962.field21304, (String)this.field21307);
            }
        }
        else {
            class8897 = Class7173.method21945(Class4962.field21303, (byte[])this.field21307);
        }
        (this.field21310 = this.field21308.method9415(class8896.method31309(Class8846.method30960(this.field21306)).method31324(this.field21305, class8897).method31326())).enqueue(new Class6395(this, this));
    }
    
    private void method14985() {
        this.method14942("success", new Object[0]);
    }
    
    private void method14986(final String s) {
        this.method14942("data", s);
        this.method14985();
    }
    
    private void method14987(final byte[] array) {
        this.method14942("data", array);
        this.method14985();
    }
    
    private void method14988(final Exception ex) {
        this.method14942("error", ex);
    }
    
    private void method14989(final Map<String, List<String>> map) {
        this.method14942("requestHeaders", map);
    }
    
    private void method14990(final Map<String, List<String>> map) {
        this.method14942("responseHeaders", map);
    }
    
    private void method14991() {
        final Class1760 method6197 = this.field21309.method6197();
        final String string = method6197.method6282().toString();
        try {
            if ("application/octet-stream".equalsIgnoreCase(string)) {
                this.method14987(method6197.method6286());
            }
            else {
                this.method14986(method6197.method6288());
            }
        }
        catch (final IOException ex) {
            this.method14988(ex);
        }
    }
    
    static {
        field21303 = Class8991.method32077(Class4962.\u5660\u9e69\u7270\u3ff0\ud02e\u7074[4]);
        field21304 = Class8991.method32077(Class4962.\u5660\u9e69\u7270\u3ff0\ud02e\u7074[5]);
    }
}
