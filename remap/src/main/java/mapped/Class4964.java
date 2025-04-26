// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import io.socket.utf8.UTF8Exception;
import okhttp3.OkHttpClient;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.logging.Logger;

public class Class4964 extends Class4963
{
    public static final String field21331 = "websocket";
    private static final Logger field21332;
    private Class7481 field21333;
    
    public Class4964(final Class7662 class7662) {
        super(class7662);
        this.field21319 = "websocket";
    }
    
    @Override
    public void method15006() {
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        this.method14942("requestHeaders", treeMap);
        final Class2311 class2311 = (this.field21329 == null) ? new OkHttpClient() : this.field21329;
        final Class8896 method31310 = new Class8896().method31310(this.method15008());
        for (final Map.Entry<K, List> entry : treeMap.entrySet()) {
            final Iterator iterator2 = entry.getValue().iterator();
            while (iterator2.hasNext()) {
                method31310.method31313((String)entry.getKey(), (String)iterator2.next());
            }
        }
        this.field21333 = class2311.method9416(method31310.method31326(), new Class9344(this, this));
    }
    
    @Override
    public void method15005(final Class8437[] array) throws UTF8Exception {
        this.field21318 = false;
        final Class1179 class1179 = new Class1179(this, this);
        final int[] array2 = { array.length };
        for (final Class8437 class1180 : array) {
            if (this.field21328 != Class2086.field12060 && this.field21328 != Class2086.field12061) {
                break;
            }
            Class8128.method26773(class1180, new Class7289(this, this, array2, class1179));
        }
    }
    
    @Override
    public void method15007() {
        if (this.field21333 != null) {
            this.field21333.method23130(1000, "");
            this.field21333 = null;
        }
    }
    
    public String method15008() {
        Map<String, String> field21320 = this.field21320;
        if (field21320 == null) {
            field21320 = new HashMap<String, String>();
        }
        final String str = this.field21321 ? "wss" : "ws";
        String string = "";
        Label_0049: {
            if (this.field21323 > 0) {
                if (!"wss".equals(str) || this.field21323 == 443) {
                    if (!"ws".equals(str)) {
                        break Label_0049;
                    }
                    if (this.field21323 == 80) {
                        break Label_0049;
                    }
                }
                string = ":" + this.field21323;
            }
        }
        if (this.field21322) {
            field21320.put(this.field21326, Class8509.method28429());
        }
        String s = Class9510.method35436(field21320);
        if (s.length() > 0) {
            s = "?" + s;
        }
        return str + "://" + (this.field21325.contains(":") ? ("[" + this.field21325 + "]") : this.field21325) + string + this.field21324 + s;
    }
    
    static {
        field21332 = Logger.getLogger(Class4966.class.getName());
    }
}
