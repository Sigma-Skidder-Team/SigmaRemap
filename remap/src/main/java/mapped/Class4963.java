// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.utf8.UTF8Exception;
import java.util.Map;

public abstract class Class4963 extends Class4961
{
    public static final String field21311 = "open";
    public static final String field21312 = "close";
    public static final String field21313 = "packet";
    public static final String field21314 = "drain";
    public static final String field21315 = "error";
    public static final String field21316 = "requestHeaders";
    public static final String field21317 = "responseHeaders";
    public boolean field21318;
    public String field21319;
    public Map<String, String> field21320;
    public boolean field21321;
    public boolean field21322;
    public int field21323;
    public String field21324;
    public String field21325;
    public String field21326;
    public Class4968 field21327;
    public Class2086 field21328;
    public Class2311 field21329;
    public Class2310 field21330;
    
    public Class4963(final Class7662 class7662) {
        this.field21324 = class7662.field30428;
        this.field21325 = class7662.field30427;
        this.field21323 = class7662.field30432;
        this.field21321 = class7662.field30430;
        this.field21320 = class7662.field30434;
        this.field21326 = class7662.field30429;
        this.field21322 = class7662.field30431;
        this.field21327 = class7662.field30435;
        this.field21329 = class7662.field30436;
        this.field21330 = class7662.field30437;
    }
    
    public Class4963 method14996(final String s, final Exception ex) {
        this.method14942("error", new Class2347(s, ex));
        return this;
    }
    
    public Class4963 method14997() {
        Class934.method5435(new Class878(this));
        return this;
    }
    
    public Class4963 method14998() {
        Class934.method5435(new Class1289(this));
        return this;
    }
    
    public void method14999(final Class8437[] array) {
        Class934.method5435(new Class1088(this, array));
    }
    
    public void method15000() {
        this.field21328 = Class2086.field12061;
        this.field21318 = true;
        this.method14942("open", new Object[0]);
    }
    
    public void method15001(final String s) {
        this.method15003(Class8128.method26776(s));
    }
    
    public void method15002(final byte[] array) {
        this.method15003(Class8128.method26778(array));
    }
    
    public void method15003(final Class8437 class8437) {
        this.method14942("packet", class8437);
    }
    
    public void method15004() {
        this.field21328 = Class2086.field12062;
        this.method14942("close", new Object[0]);
    }
    
    public abstract void method15005(final Class8437[] p0) throws UTF8Exception;
    
    public abstract void method15006();
    
    public abstract void method15007();
}
