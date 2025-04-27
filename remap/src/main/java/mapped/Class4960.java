// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Map;
import java.util.logging.Logger;

public class Class4960 extends Class4961
{
    private static final Logger field21268;
    public static final String field21269 = "connect";
    public static final String field21270 = "connecting";
    public static final String field21271 = "disconnect";
    public static final String field21272 = "error";
    public static final String field21273 = "message";
    public static final String field21274 = "connect_error";
    public static final String field21275 = "connect_timeout";
    public static final String field21276 = "reconnect";
    public static final String field21277 = "reconnect_error";
    public static final String field21278 = "reconnect_failed";
    public static final String field21279 = "reconnect_attempt";
    public static final String field21280 = "reconnecting";
    public static final String field21281 = "ping";
    public static final String field21282 = "pong";
    public static Map<String, Integer> field21283;
    public String field21284;
    private volatile boolean field21285;
    private int field21286;
    private final String field21287;
    private final Class4967 field21288;
    private String field21289;
    private final Map<Integer, Class7873> field21290;
    private Queue<Class4248> field21291;
    private final Queue<List<Object>> field21292;
    private final Queue<Class9041<JSONArray>> field21293;
    
    public Class4960(final Class4967 field21288, final String field21289, final Class7660 class7660) {
        this.field21290 = new HashMap<Integer, Class7873>();
        this.field21292 = new LinkedList<List<Object>>();
        this.field21293 = new LinkedList<Class9041<JSONArray>>();
        this.field21288 = field21288;
        this.field21287 = field21289;
        if (class7660 != null) {
            this.field21289 = class7660.field30412;
        }
    }
    
    private void method14938() {
        if (this.field21291 == null) {
            this.field21291 = new Class37(this, this.field21288);
        }
    }
    
    public Class4960 method14939() {
        Class934.method5435(new Class1608(this));
        return this;
    }
    
    public Class4960 method14940() {
        return this.method14939();
    }
    
    public Class4960 method14941(final Object... array) {
        Class934.method5435(new Class1230(this, array));
        return this;
    }
    
    @Override
    public Class4961 method14942(final String s, final Object... array) {
        Class934.method5435(new Class1247(this, s, array));
        return this;
    }
    
    public Class4961 method14943(final String s, final Object[] array, final Class7873 class7873) {
        Class934.method5435(new Class952(this, s, array, class7873));
        return this;
    }
    
    private void method14944(final Class9041 class9041) {
        class9041.field38265 = this.field21287;
        this.field21288.method15066(class9041);
    }
    
    private void method14945() {
        Class4960.field21268.fine("transport is open - connecting");
        if (!"/".equals(this.field21287)) {
            if (this.field21289 != null && !this.field21289.isEmpty()) {
                final Class9041 class9041 = new Class9041(0);
                class9041.field38268 = this.field21289;
                this.method14944(class9041);
            }
            else {
                this.method14944(new Class9041(0));
            }
        }
    }
    
    private void method14946(final String s) {
        if (Class4960.field21268.isLoggable(Level.FINE)) {
            Class4960.field21268.fine(String.format("close (%s)", s));
        }
        this.field21285 = false;
        this.field21284 = null;
        this.method14942("disconnect", s);
    }
    
    private void method14947(final Class9041<?> class9041) {
        if (!this.field21287.equals(class9041.field38265)) {
            return;
        }
        switch (class9041.field38263) {
            case 0: {
                this.method14951();
                break;
            }
            case 2: {
                this.method14948((Class9041<JSONArray>)class9041);
                break;
            }
            case 5: {
                this.method14948((Class9041<JSONArray>)class9041);
                break;
            }
            case 3: {
                this.method14950((Class9041<JSONArray>)class9041);
                break;
            }
            case 6: {
                this.method14950((Class9041<JSONArray>)class9041);
                break;
            }
            case 1: {
                this.method14953();
                break;
            }
            case 4: {
                this.method14942("error", class9041.field38266);
                break;
            }
        }
    }
    
    private void method14948(final Class9041<JSONArray> class9041) {
        final ArrayList list = new ArrayList(Arrays.asList(method14960(class9041.field38266)));
        if (Class4960.field21268.isLoggable(Level.FINE)) {
            Class4960.field21268.fine(String.format("emitting event %s", list));
        }
        if (class9041.field38264 >= 0) {
            Class4960.field21268.fine("attaching ack callback to event");
            list.add(this.method14949(class9041.field38264));
        }
        if (!this.field21285) {
            this.field21292.add(list);
        }
        else {
            if (list.isEmpty()) {
                return;
            }
            super.method14942(list.remove(0).toString(), list.toArray());
        }
    }
    
    private Class7873 method14949(final int n) {
        return new Class7874(this, new boolean[] { false }, n, this);
    }
    
    private void method14950(final Class9041<JSONArray> class9041) {
        final Class7873 class9042 = this.field21290.remove(class9041.field38264);
        if (class9042 == null) {
            if (Class4960.field21268.isLoggable(Level.FINE)) {
                Class4960.field21268.fine(String.format("bad ack %s", class9041.field38264));
            }
        }
        else {
            if (Class4960.field21268.isLoggable(Level.FINE)) {
                Class4960.field21268.fine(String.format("calling ack %s with %s", class9041.field38264, class9041.field38266));
            }
            class9042.method25497(method14960(class9041.field38266));
        }
    }
    
    private void method14951() {
        this.field21285 = true;
        this.method14942("connect");
        this.method14952();
    }
    
    private void method14952() {
        List list;
        while ((list = this.field21292.poll()) != null) {
            super.method14942((String)list.get(0), list.toArray());
        }
        this.field21292.clear();
        Class9041 class9041;
        while ((class9041 = this.field21293.poll()) != null) {
            this.method14944(class9041);
        }
        this.field21293.clear();
    }
    
    private void method14953() {
        if (Class4960.field21268.isLoggable(Level.FINE)) {
            Class4960.field21268.fine(String.format("server disconnect (%s)", this.field21287));
        }
        this.method14954();
        this.method14946("io server disconnect");
    }
    
    private void method14954() {
        if (this.field21291 != null) {
            final Iterator<Object> iterator = this.field21291.iterator();
            while (iterator.hasNext()) {
                iterator.next().method12753();
            }
            this.field21291 = null;
        }
        this.field21288.method15065(this);
    }
    
    public Class4960 method14955() {
        Class934.method5435(new Class1144(this));
        return this;
    }
    
    public Class4960 method14956() {
        return this.method14955();
    }
    
    public Class4967 method14957() {
        return this.field21288;
    }
    
    public boolean method14958() {
        return this.field21285;
    }
    
    public String method14959() {
        return this.field21284;
    }
    
    private static Object[] method14960(final JSONArray JSONArray) {
        final int method462 = JSONArray.length();
        final Object[] array = new Object[method462];
        for (int i = 0; i < method462; ++i) {
            Object method463;
            try {
                method463 = JSONArray.get(i);
            }
            catch (final JSONException thrown) {
                Class4960.field21268.log(Level.WARNING, "An error occured while retrieving data from JSONArray", thrown);
                method463 = null;
            }
            array[i] = (JSONObject.NULL.equals(method463) ? null : method463);
        }
        return array;
    }
    
    static {
        field21268 = Logger.getLogger(Class4960.class.getName());
        Class4960.field21283 = new Class30();
    }
}
