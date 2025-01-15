// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedHashMap;
import java.util.Map;
import java.net.Proxy;

public class Class8153
{
    private static String[] field33565;
    private String field33566;
    private int field33567;
    private Proxy field33568;
    private String field33569;
    private String field33570;
    private String field33571;
    private Map<String, String> field33572;
    private byte[] field33573;
    private int field33574;
    public static final String field33575 = "GET";
    public static final String field33576 = "HEAD";
    public static final String field33577 = "POST";
    public static final String field33578 = "HTTP/1.0";
    public static final String field33579 = "HTTP/1.1";
    
    public Class8153(final String field33566, final int field33567, final Proxy field33568, final String field33569, final String field33570, final String field33571, final Map<String, String> field33572, final byte[] field33573) {
        this.field33566 = null;
        this.field33567 = 0;
        this.field33568 = Proxy.NO_PROXY;
        this.field33569 = null;
        this.field33570 = null;
        this.field33571 = null;
        this.field33572 = new LinkedHashMap<String, String>();
        this.field33573 = null;
        this.field33574 = 0;
        this.field33566 = field33566;
        this.field33567 = field33567;
        this.field33568 = field33568;
        this.field33569 = field33569;
        this.field33570 = field33570;
        this.field33571 = field33571;
        this.field33572 = field33572;
        this.field33573 = field33573;
    }
    
    public String method26851() {
        return this.field33566;
    }
    
    public int method26852() {
        return this.field33567;
    }
    
    public String method26853() {
        return this.field33569;
    }
    
    public String method26854() {
        return this.field33570;
    }
    
    public String method26855() {
        return this.field33571;
    }
    
    public Map<String, String> method26856() {
        return this.field33572;
    }
    
    public byte[] method26857() {
        return this.field33573;
    }
    
    public int method26858() {
        return this.field33574;
    }
    
    public void method26859(final int field33574) {
        this.field33574 = field33574;
    }
    
    public Proxy method26860() {
        return this.field33568;
    }
}
