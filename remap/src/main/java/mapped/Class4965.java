// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.HashMap;
import io.socket.utf8.UTF8Exception;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Class4965 extends Class4963
{
    private static final Logger field21334;
    public static final String field21335 = "polling";
    public static final String field21336 = "poll";
    public static final String field21337 = "pollComplete";
    private boolean field21338;
    
    public Class4965(final Class7662 class7662) {
        super(class7662);
        this.field21319 = "polling";
    }
    
    @Override
    public void method15006() {
        this.method15017();
    }
    
    public void method15016(final Runnable runnable) {
        Class934.method5435(new Class1189(this, runnable));
    }
    
    private void method15017() {
        Class4965.field21334.fine("polling");
        this.field21338 = true;
        this.method15022();
        this.method14942("poll", new Object[0]);
    }
    
    @Override
    public void method15001(final String s) {
        this.method15018(s);
    }
    
    @Override
    public void method15002(final byte[] array) {
        this.method15018(array);
    }
    
    private void method15018(final Object o) {
        if (Class4965.field21334.isLoggable(Level.FINE)) {
            Class4965.field21334.fine(String.format("polling got data %s", o));
        }
        final Class8137 class8137 = new Class8137(this, this);
        if (!(o instanceof String)) {
            if (o instanceof byte[]) {
                Class8128.method26784((byte[])o, class8137);
            }
        }
        else {
            Class8128.method26783((String)o, class8137);
        }
        if (this.field21328 != Class2086.field12062) {
            this.field21338 = false;
            this.method14942("pollComplete", new Object[0]);
            if (this.field21328 != Class2086.field12061) {
                if (Class4965.field21334.isLoggable(Level.FINE)) {
                    Class4965.field21334.fine(String.format("ignoring poll - transport state '%s'", this.field21328));
                }
            }
            else {
                this.method15017();
            }
        }
    }
    
    @Override
    public void method15007() {
        final Class4691 class4691 = new Class4691(this, this);
        if (this.field21328 != Class2086.field12061) {
            Class4965.field21334.fine("transport not open - deferring close");
            this.method14977("open", class4691);
        }
        else {
            Class4965.field21334.fine("transport open - closing");
            class4691.method13945();
        }
    }
    
    @Override
    public void method15005(final Class8437[] array) throws UTF8Exception {
        this.field21318 = false;
        Class8128.method26779(array, new Class7285(this, this, new Class1241(this, this)));
    }
    
    public String method15019() {
        Map<String, String> field21320 = this.field21320;
        if (field21320 == null) {
            field21320 = new HashMap<String, String>();
        }
        final String str = this.field21321 ? "https" : "http";
        String string = "";
        if (this.field21322) {
            field21320.put(this.field21326, Class8509.method28429());
        }
        String s = Class9510.method35436(field21320);
        Label_0062: {
            if (this.field21323 > 0) {
                if (!"https".equals(str) || this.field21323 == 443) {
                    if (!"http".equals(str)) {
                        break Label_0062;
                    }
                    if (this.field21323 == 80) {
                        break Label_0062;
                    }
                }
                string = ":" + this.field21323;
            }
        }
        if (s.length() > 0) {
            s = "?" + s;
        }
        return str + "://" + (this.field21325.contains(":") ? ("[" + this.field21325 + "]") : this.field21325) + string + this.field21324 + s;
    }
    
    public abstract void method15020(final byte[] p0, final Runnable p1);
    
    public abstract void method15021(final String p0, final Runnable p1);
    
    public abstract void method15022();
    
    static {
        field21334 = Logger.getLogger(Class4965.class.getName());
    }
}
