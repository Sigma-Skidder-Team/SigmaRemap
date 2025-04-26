// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Future;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.logging.Logger;

public class Class4968 extends Class4961
{
    private static final Logger field21379;
    private static final String field21380 = "probe error";
    public static final String field21381 = "open";
    public static final String field21382 = "close";
    public static final String field21383 = "message";
    public static final String field21384 = "error";
    public static final String field21385 = "upgradeError";
    public static final String field21386 = "flush";
    public static final String field21387 = "drain";
    public static final String field21388 = "handshake";
    public static final String field21389 = "upgrading";
    public static final String field21390 = "upgrade";
    public static final String field21391 = "packet";
    public static final String field21392 = "packetCreate";
    public static final String field21393 = "heartbeat";
    public static final String field21394 = "data";
    public static final String field21395 = "ping";
    public static final String field21396 = "pong";
    public static final String field21397 = "transport";
    public static final int field21398 = 3;
    private static boolean field21399;
    private static Class2311 field21400;
    private static Class2310 field21401;
    private static OkHttpClient field21402;
    private boolean field21403;
    private boolean field21404;
    private boolean field21405;
    private boolean field21406;
    private boolean field21407;
    public int field21408;
    private int field21409;
    private int field21410;
    private long field21411;
    private long field21412;
    private String field21413;
    public String field21414;
    private String field21415;
    private String field21416;
    private List<String> field21417;
    private Map<String, Class7662> field21418;
    private List<String> field21419;
    private Map<String, String> field21420;
    public LinkedList<Class8437> field21421;
    public Class4963 field21422;
    private Future field21423;
    private Future field21424;
    private Class2311 field21425;
    private Class2310 field21426;
    private Class224 field21427;
    private ScheduledExecutorService field21428;
    private final Class4659 field21429;
    
    public Class4968() {
        this(new Class7659());
    }
    
    public Class4968(final String s) throws URISyntaxException {
        this(s, null);
    }
    
    public Class4968(final URI uri) {
        this(uri, null);
    }
    
    public Class4968(final String str, final Class7659 class7659) throws URISyntaxException {
        this((str != null) ? new URI(str) : null, class7659);
    }
    
    public Class4968(final URI uri, final Class7659 class7659) {
        this((uri != null) ? Class7659.method24282(uri, class7659) : class7659);
    }
    
    public Class4968(final Class7659 class7659) {
        this.field21421 = new LinkedList<Class8437>();
        this.field21429 = new Class4681(this);
        if (class7659.field30411 != null) {
            String field30427 = class7659.field30411;
            if (field30427.split(":").length > 2) {
                final int index = field30427.indexOf(91);
                if (index != -1) {
                    field30427 = field30427.substring(index + 1);
                }
                final int lastIndex = field30427.lastIndexOf(93);
                if (lastIndex != -1) {
                    field30427 = field30427.substring(0, lastIndex);
                }
            }
            class7659.field30427 = field30427;
        }
        this.field21403 = class7659.field30430;
        if (class7659.field30432 == -1) {
            class7659.field30432 = (this.field21403 ? 443 : 80);
        }
        this.field21414 = ((class7659.field30427 == null) ? "localhost" : class7659.field30427);
        this.field21408 = class7659.field30432;
        this.field21420 = ((class7659.field30412 == null) ? new HashMap<String, String>() : Class9510.method35437(class7659.field30412));
        this.field21404 = class7659.field30409;
        this.field21415 = ((class7659.field30428 == null) ? "/engine.io" : class7659.field30428).replaceAll("/$", "") + "/";
        this.field21416 = ((class7659.field30429 == null) ? "t" : class7659.field30429);
        this.field21405 = class7659.field30431;
        this.field21417 = new ArrayList<String>(Arrays.asList((class7659.field30408 == null) ? new String[] { "polling", "websocket" } : class7659.field30408));
        this.field21418 = ((class7659.field30413 == null) ? new HashMap<String, Class7662>() : class7659.field30413);
        this.field21409 = ((class7659.field30433 == 0) ? 843 : class7659.field30433);
        this.field21407 = class7659.field30410;
        this.field21426 = ((class7659.field30437 == null) ? Class4968.field21401 : class7659.field30437);
        this.field21425 = ((class7659.field30436 == null) ? Class4968.field21400 : class7659.field30436);
        if (this.field21426 == null) {
            if (Class4968.field21402 == null) {
                Class4968.field21402 = new OkHttpClient();
            }
            this.field21426 = Class4968.field21402;
        }
        if (this.field21425 == null) {
            if (Class4968.field21402 == null) {
                Class4968.field21402 = new OkHttpClient();
            }
            this.field21425 = Class4968.field21402;
        }
    }
    
    public static void method15099(final Class2311 field21400) {
        Class4968.field21400 = field21400;
    }
    
    public static void method15100(final Class2310 field21401) {
        Class4968.field21401 = field21401;
    }
    
    public Class4968 method15101() {
        Class934.method5435(new Class893(this));
        return this;
    }
    
    private Class4963 method15102(final String s) {
        if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("creating transport '%s'", s));
        }
        final HashMap field30434 = new HashMap((Map<? extends K, ? extends V>)this.field21420);
        field30434.put("EIO", String.valueOf(3));
        field30434.put("transport", s);
        if (this.field21413 != null) {
            field30434.put("sid", this.field21413);
        }
        final Class7662 class7662 = this.field21418.get(s);
        final Class7662 class7663 = new Class7662();
        class7663.field30434 = field30434;
        class7663.field30435 = this;
        class7663.field30427 = ((class7662 == null) ? this.field21414 : class7662.field30427);
        class7663.field30432 = ((class7662 == null) ? this.field21408 : class7662.field30432);
        class7663.field30430 = ((class7662 == null) ? this.field21403 : class7662.field30430);
        class7663.field30428 = ((class7662 == null) ? this.field21415 : class7662.field30428);
        class7663.field30431 = ((class7662 == null) ? this.field21405 : class7662.field30431);
        class7663.field30429 = ((class7662 == null) ? this.field21416 : class7662.field30429);
        class7663.field30433 = ((class7662 == null) ? this.field21409 : class7662.field30433);
        class7663.field30437 = ((class7662 == null) ? this.field21426 : class7662.field30437);
        class7663.field30436 = ((class7662 == null) ? this.field21425 : class7662.field30436);
        Class4963 class7664;
        if (!"websocket".equals(s)) {
            if (!"polling".equals(s)) {
                throw new RuntimeException();
            }
            class7664 = new Class4966(class7663);
        }
        else {
            class7664 = new Class4964(class7663);
        }
        this.method14942("transport", class7664);
        return class7664;
    }
    
    private void method15103(final Class4963 field21422) {
        if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("setting transport %s", field21422.field21319));
        }
        if (this.field21422 != null) {
            if (Class4968.field21379.isLoggable(Level.FINE)) {
                Class4968.field21379.fine(String.format("clearing existing transport %s", this.field21422.field21319));
            }
            this.field21422.method14978();
        }
        this.field21422 = field21422;
        field21422.method14976("drain", new Class4693(this, this)).method14976("packet", new Class4672(this, this)).method14976("error", new Class4697(this, this)).method14976("close", new Class4664(this, this));
    }
    
    private void method15104(final String s) {
        if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("probing transport '%s'", s));
        }
        final Class4963[] array = { this.method15102(s) };
        final boolean[] array2 = { false };
        Class4968.field21399 = false;
        final Runnable[] array3 = { null };
        final Class4666 class4666 = new Class4666(this, array2, s, array, this, array3);
        final Class4700 class4667 = new Class4700(this, array2, array3, array);
        final Class4685 class4668 = new Class4685(this, array, class4667, s, this);
        final Class4683 class4669 = new Class4683(this, class4668);
        final Class4695 class4670 = new Class4695(this, class4668);
        final Class4688 class4671 = new Class4688(this, array, class4667);
        array3[0] = new Class888(this, array, class4666, class4668, class4669, this, class4670, class4671);
        array[0].method14977("open", class4666);
        array[0].method14977("error", class4668);
        array[0].method14977("close", class4669);
        this.method14977("close", class4670);
        this.method14977("upgrading", class4671);
        array[0].method14997();
    }
    
    private void method15105() {
        Class4968.field21379.fine("socket open");
        this.field21427 = Class224.field787;
        Class4968.field21399 = "websocket".equals(this.field21422.field21319);
        this.method14942("open", new Object[0]);
        this.method15112();
        if (this.field21427 == Class224.field787) {
            if (this.field21404) {
                if (this.field21422 instanceof Class4965) {
                    Class4968.field21379.fine("starting upgrade probes");
                    final Iterator<String> iterator = this.field21419.iterator();
                    while (iterator.hasNext()) {
                        this.method15104(iterator.next());
                    }
                }
            }
        }
    }
    
    private void method15106(final Class8437 class8437) {
        if (this.field21427 == Class224.field786 || this.field21427 == Class224.field787 || this.field21427 == Class224.field788) {
            if (Class4968.field21379.isLoggable(Level.FINE)) {
                Class4968.field21379.fine(String.format("socket received: type '%s', data '%s'", class8437.field34678, class8437.field34679));
            }
            this.method14942("packet", class8437);
            this.method14942("heartbeat", new Object[0]);
            if ("open".equals(class8437.field34678)) {
                try {
                    this.method15107(new Class7987((String)class8437.field34679));
                }
                catch (final JSONException class8438) {
                    this.method14942("error", new Class2347(class8438));
                }
            }
            else if ("pong".equals(class8437.field34678)) {
                this.method15109();
                this.method14942("pong", new Object[0]);
            }
            else if ("error".equals(class8437.field34678)) {
                final Class2347 class8439 = new Class2347("server error");
                class8439.field14131 = class8437.field34679;
                this.method15126(class8439);
            }
            else if ("message".equals(class8437.field34678)) {
                this.method14942("data", class8437.field34679);
                this.method14942("message", class8437.field34679);
            }
        }
        else if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("packet received with socket readyState '%s'", this.field21427));
        }
    }
    
    private void method15107(final Class7987 class7987) {
        this.method14942("handshake", class7987);
        this.field21413 = class7987.field32879;
        this.field21422.field21320.put("sid", class7987.field32879);
        this.field21419 = this.method15129(Arrays.asList(class7987.field32880));
        this.field21411 = class7987.field32881;
        this.field21412 = class7987.field32882;
        this.method15105();
        if (Class224.field789 != this.field21427) {
            this.method15109();
            this.method14980("heartbeat", this.field21429);
            this.method14976("heartbeat", this.field21429);
        }
    }
    
    private void method15108(long n) {
        if (this.field21423 != null) {
            this.field21423.cancel(false);
        }
        if (n <= 0L) {
            n = this.field21411 + this.field21412;
        }
        this.field21423 = this.method15131().schedule(new Class1565(this, this), n, TimeUnit.MILLISECONDS);
    }
    
    private void method15109() {
        if (this.field21424 != null) {
            this.field21424.cancel(false);
        }
        this.field21424 = this.method15131().schedule(new Class939(this, this), this.field21411, TimeUnit.MILLISECONDS);
    }
    
    private void method15110() {
        Class934.method5435(new Class1543(this));
    }
    
    private void method15111() {
        for (int i = 0; i < this.field21410; ++i) {
            this.field21421.poll();
        }
        this.field21410 = 0;
        if (0 != this.field21421.size()) {
            this.method15112();
        }
        else {
            this.method14942("drain", new Object[0]);
        }
    }
    
    private void method15112() {
        if (this.field21427 != Class224.field789) {
            if (this.field21422.field21318) {
                if (!this.field21406) {
                    if (this.field21421.size() != 0) {
                        if (Class4968.field21379.isLoggable(Level.FINE)) {
                            Class4968.field21379.fine(String.format("flushing %d packets in socket", this.field21421.size()));
                        }
                        this.field21410 = this.field21421.size();
                        this.field21422.method14999(this.field21421.toArray(new Class8437[this.field21421.size()]));
                        this.method14942("flush", new Object[0]);
                    }
                }
            }
        }
    }
    
    public void method15113(final String s) {
        this.method15114(s, null);
    }
    
    public void method15114(final String s, final Runnable runnable) {
        this.method15119(s, runnable);
    }
    
    public void method15115(final byte[] array) {
        this.method15116(array, null);
    }
    
    public void method15116(final byte[] array, final Runnable runnable) {
        this.method15120(array, runnable);
    }
    
    public void method15117(final String s) {
        this.method15119(s, null);
    }
    
    public void method15118(final byte[] array) {
        this.method15120(array, null);
    }
    
    public void method15119(final String s, final Runnable runnable) {
        Class934.method5435(new Class1371(this, s, runnable));
    }
    
    public void method15120(final byte[] array, final Runnable runnable) {
        Class934.method5435(new Class896(this, array, runnable));
    }
    
    private void method15121(final String s, final Runnable runnable) {
        this.method15124(new Class8437(s), runnable);
    }
    
    private void method15122(final String s, final String s2, final Runnable runnable) {
        this.method15124(new Class8437(s, (T)s2), runnable);
    }
    
    private void method15123(final String s, final byte[] array, final Runnable runnable) {
        this.method15124(new Class8437(s, (T)(Object)array), runnable);
    }
    
    private void method15124(final Class8437 e, final Runnable runnable) {
        if (Class224.field788 != this.field21427 && Class224.field789 != this.field21427) {
            this.method14942("packetCreate", e);
            this.field21421.offer(e);
            if (null != runnable) {
                this.method14977("flush", new Class4682(this, runnable));
            }
            this.method15112();
        }
    }
    
    public Class4968 method15125() {
        Class934.method5435(new Class1001(this));
        return this;
    }
    
    private void method15126(final Exception ex) {
        if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("socket error %s", ex));
        }
        Class4968.field21399 = false;
        this.method14942("error", ex);
        this.method15128("transport error", ex);
    }
    
    private void method15127(final String s) {
        this.method15128(s, null);
    }
    
    private void method15128(final String s, final Exception ex) {
        if (Class224.field786 != this.field21427) {
            if (Class224.field787 != this.field21427) {
                if (Class224.field788 != this.field21427) {
                    return;
                }
            }
        }
        if (Class4968.field21379.isLoggable(Level.FINE)) {
            Class4968.field21379.fine(String.format("socket close with reason: %s", s));
        }
        if (this.field21424 != null) {
            this.field21424.cancel(false);
        }
        if (this.field21423 != null) {
            this.field21423.cancel(false);
        }
        if (this.field21428 != null) {
            this.field21428.shutdown();
        }
        this.field21422.method14979("close");
        this.field21422.method14998();
        this.field21422.method14978();
        this.field21427 = Class224.field789;
        this.field21413 = null;
        this.method14942("close", s, ex);
        this.field21421.clear();
        this.field21410 = 0;
    }
    
    public List<String> method15129(final List<String> list) {
        final ArrayList list2 = new ArrayList();
        for (final String s : list) {
            if (!this.field21417.contains(s)) {
                continue;
            }
            list2.add(s);
        }
        return list2;
    }
    
    public String method15130() {
        return this.field21413;
    }
    
    private ScheduledExecutorService method15131() {
        if (this.field21428 == null || this.field21428.isShutdown()) {
            this.field21428 = Executors.newSingleThreadScheduledExecutor();
        }
        return this.field21428;
    }
    
    static {
        field21379 = Logger.getLogger(Class4968.class.getName());
        Class4968.field21399 = false;
    }
}
