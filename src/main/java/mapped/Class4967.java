// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Queue;
import java.util.List;
import java.net.URI;
import java.util.Date;
import java.util.Set;
import java.util.logging.Logger;

public class Class4967 extends Class4961
{
    private static final Logger field21341;
    public static final String field21342 = "open";
    public static final String field21343 = "close";
    public static final String field21344 = "packet";
    public static final String field21345 = "error";
    public static final String field21346 = "connect_error";
    public static final String field21347 = "connect_timeout";
    public static final String field21348 = "reconnect";
    public static final String field21349 = "reconnect_error";
    public static final String field21350 = "reconnect_failed";
    public static final String field21351 = "reconnect_attempt";
    public static final String field21352 = "reconnecting";
    public static final String field21353 = "ping";
    public static final String field21354 = "pong";
    public static final String field21355 = "transport";
    public static Class2311 field21356;
    public static Class2310 field21357;
    public Class1978 field21358;
    private boolean field21359;
    private boolean field21360;
    private boolean field21361;
    private boolean field21362;
    private int field21363;
    private long field21364;
    private long field21365;
    private double field21366;
    private Class8035 field21367;
    private long field21368;
    private Set<Class4960> field21369;
    private Date field21370;
    private URI field21371;
    private List<Class9041> field21372;
    private Queue<Class4248> field21373;
    private Class7660 field21374;
    public Class4968 field21375;
    private Class7616 field21376;
    private Class6747 field21377;
    public ConcurrentHashMap<String, Class4960> field21378;
    
    public Class4967() {
        this(null, null);
    }
    
    public Class4967(final URI uri) {
        this(uri, null);
    }
    
    public Class4967(final Class7660 class7660) {
        this(null, class7660);
    }
    
    public Class4967(final URI field21371, Class7660 field21372) {
        this.field21369 = new HashSet<Class4960>();
        if (field21372 == null) {
            field21372 = new Class7660();
        }
        if (field21372.field30428 == null) {
            field21372.field30428 = "/socket.io";
        }
        if (field21372.field30436 == null) {
            field21372.field30436 = Class4967.field21356;
        }
        if (field21372.field30437 == null) {
            field21372.field30437 = Class4967.field21357;
        }
        this.field21374 = field21372;
        this.field21378 = new ConcurrentHashMap<String, Class4960>();
        this.field21373 = new LinkedList<Class4248>();
        this.method15042(field21372.field30415);
        this.method15044((field21372.field30416 == 0) ? Integer.MAX_VALUE : field21372.field30416);
        this.method15046((field21372.field30417 == 0L) ? 1000L : field21372.field30417);
        this.method15050((field21372.field30418 == 0L) ? 5000L : field21372.field30418);
        this.method15048((field21372.field30419 == 0.0) ? 0.5 : field21372.field30419);
        this.field21367 = new Class8035().method26360(this.method15045()).method26361(this.method15049()).method26363(this.method15047());
        this.method15052(field21372.field30422);
        this.field21358 = Class1978.field10964;
        this.field21371 = field21371;
        this.field21362 = false;
        this.field21372 = new ArrayList<Class9041>();
        this.field21376 = ((field21372.field30420 == null) ? new Class7615() : field21372.field30420);
        this.field21377 = ((field21372.field30421 == null) ? new Class6746() : field21372.field30421);
    }
    
    private void method15038(final String s, final Object... array) {
        this.method14942(s, array);
        final Iterator<Class4960> iterator = this.field21378.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method14942(s, array);
        }
    }
    
    private void method15039() {
        for (final Map.Entry entry : this.field21378.entrySet()) {
            ((Class4960)entry.getValue()).field21284 = this.method15040((String)entry.getKey());
        }
    }
    
    private String method15040(final String s) {
        return ("/".equals(s) ? "" : (s + "#")) + this.field21375.method15130();
    }
    
    public boolean method15041() {
        return this.field21359;
    }
    
    public Class4967 method15042(final boolean field21359) {
        this.field21359 = field21359;
        return this;
    }
    
    public int method15043() {
        return this.field21363;
    }
    
    public Class4967 method15044(final int field21363) {
        this.field21363 = field21363;
        return this;
    }
    
    public final long method15045() {
        return this.field21364;
    }
    
    public Class4967 method15046(final long field21364) {
        this.field21364 = field21364;
        if (this.field21367 != null) {
            this.field21367.method26360(field21364);
        }
        return this;
    }
    
    public final double method15047() {
        return this.field21366;
    }
    
    public Class4967 method15048(final double field21366) {
        this.field21366 = field21366;
        if (this.field21367 != null) {
            this.field21367.method26363(field21366);
        }
        return this;
    }
    
    public final long method15049() {
        return this.field21365;
    }
    
    public Class4967 method15050(final long field21365) {
        this.field21365 = field21365;
        if (this.field21367 != null) {
            this.field21367.method26361(field21365);
        }
        return this;
    }
    
    public long method15051() {
        return this.field21368;
    }
    
    public Class4967 method15052(final long field21368) {
        this.field21368 = field21368;
        return this;
    }
    
    private void method15053() {
        if (!this.field21361) {
            if (this.field21359) {
                if (this.field21367.method26364() == 0) {
                    this.method15071();
                }
            }
        }
    }
    
    public Class4967 method15054() {
        return this.method15055(null);
    }
    
    public Class4967 method15055(final Class8332 class8332) {
        Class934.method5435(new Class1040(this, class8332));
        return this;
    }
    
    private void method15056() {
        Class4967.field21341.fine("open");
        this.method15068();
        this.field21358 = Class1978.field10966;
        this.method14942("open", new Object[0]);
        final Class4968 field21375 = this.field21375;
        this.field21373.add(Class8415.method28106(field21375, "data", new Class4675(this)));
        this.field21373.add(Class8415.method28106(field21375, "ping", new Class4692(this)));
        this.field21373.add(Class8415.method28106(field21375, "pong", new Class4678(this)));
        this.field21373.add(Class8415.method28106(field21375, "error", new Class4668(this)));
        this.field21373.add(Class8415.method28106(field21375, "close", new Class4694(this)));
        this.field21377.method20538(new Class7551(this));
    }
    
    private void method15057() {
        this.field21370 = new Date();
        this.method15038("ping", new Object[0]);
    }
    
    private void method15058() {
        this.method15038("pong", (null == this.field21370) ? 0L : (new Date().getTime() - this.field21370.getTime()));
    }
    
    private void method15059(final String s) {
        this.field21377.method20534(s);
    }
    
    private void method15060(final byte[] array) {
        this.field21377.method20535(array);
    }
    
    private void method15061(final Class9041 class9041) {
        this.method14942("packet", class9041);
    }
    
    private void method15062(final Exception thrown) {
        Class4967.field21341.log(Level.FINE, "error", thrown);
        this.method15038("error", thrown);
    }
    
    public Class4960 method15063(final String s, final Class7660 class7660) {
        Class4960 value = this.field21378.get(s);
        if (value == null) {
            value = new Class4960(this, s, class7660);
            final Class4960 class7661 = this.field21378.putIfAbsent(s, value);
            if (class7661 == null) {
                final Class4960 class7662 = value;
                value.method14976("connecting", new Class4658(this, this, class7662));
                value.method14976("connect", new Class4661(this, class7662, this, s));
            }
            else {
                value = class7661;
            }
        }
        return value;
    }
    
    public Class4960 method15064(final String s) {
        return this.method15063(s, null);
    }
    
    public void method15065(final Class4960 class4960) {
        this.field21369.remove(class4960);
        if (this.field21369.isEmpty()) {
            this.method15069();
        }
    }
    
    public void method15066(final Class9041 class9041) {
        if (Class4967.field21341.isLoggable(Level.FINE)) {
            Class4967.field21341.fine(String.format("writing packet %s", class9041));
        }
        if (class9041.field38268 != null) {
            if (!class9041.field38268.isEmpty()) {
                if (class9041.field38263 == 0) {
                    class9041.field38265 = class9041.field38265 + "?" + class9041.field38268;
                }
            }
        }
        if (this.field21362) {
            this.field21372.add(class9041);
        }
        else {
            this.field21362 = true;
            this.field21376.method23929(class9041, new Class7087(this, this));
        }
    }
    
    private void method15067() {
        if (!this.field21372.isEmpty()) {
            if (!this.field21362) {
                this.method15066(this.field21372.remove(0));
            }
        }
    }
    
    private void method15068() {
        Class4967.field21341.fine("cleanup");
        Class4248 class4248;
        while ((class4248 = this.field21373.poll()) != null) {
            class4248.method12753();
        }
        this.field21377.method20538(null);
        this.field21372.clear();
        this.field21362 = false;
        this.field21370 = null;
        this.field21377.method20537();
    }
    
    public void method15069() {
        Class4967.field21341.fine("disconnect");
        this.field21360 = true;
        this.field21361 = false;
        if (this.field21358 != Class1978.field10966) {
            this.method15068();
        }
        this.field21367.method26359();
        this.field21358 = Class1978.field10964;
        if (this.field21375 != null) {
            this.field21375.method15125();
        }
    }
    
    private void method15070(final String s) {
        Class4967.field21341.fine("onclose");
        this.method15068();
        this.field21367.method26359();
        this.field21358 = Class1978.field10964;
        this.method14942("close", s);
        if (this.field21359) {
            if (!this.field21360) {
                this.method15071();
            }
        }
    }
    
    private void method15071() {
        if (!this.field21361 && !this.field21360) {
            if (this.field21367.method26364() < this.field21363) {
                final long method26358 = this.field21367.method26358();
                Class4967.field21341.fine(String.format("will wait %dms before reconnect attempt", method26358));
                this.field21361 = true;
                final Timer timer = new Timer();
                timer.schedule(new Class1620(this, this), method26358);
                this.field21373.add(new Class4250(this, timer));
            }
            else {
                Class4967.field21341.fine("reconnect failed");
                this.field21367.method26359();
                this.method15038("reconnect_failed", new Object[0]);
                this.field21361 = false;
            }
        }
    }
    
    private void method15072() {
        final int method26364 = this.field21367.method26364();
        this.field21361 = false;
        this.field21367.method26359();
        this.method15039();
        this.method15038("reconnect", method26364);
    }
    
    static {
        field21341 = Logger.getLogger(Class4967.class.getName());
    }
}
