// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3775 extends Class3703
{
    public static final int field17235 = 1986618469;
    public static final int field17236 = 1936684398;
    public static final int field17237 = 1751740020;
    public static final int field17238 = 1835365473;
    public static final int field17239 = 1853189228;
    public static final int field17240 = 1868854125;
    public static final int field17241 = 1668445037;
    public static final int field17242 = 1935962989;
    public static final int field17243 = 1832350573;
    public static final int field17244 = 1868788589;
    public static final int field17245 = 1768977261;
    public static final int field17246 = 1835692909;
    private long field17247;
    private String field17248;
    
    public Class3775() {
        super("Handler Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33144(4L);
        this.field17247 = class9131.method33137(4);
        class9131.method33137(4);
        class9131.method33137(4);
        class9131.method33137(4);
        this.field17248 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
    }
    
    public long method11580() {
        return this.field17247;
    }
    
    public String method11581() {
        return this.field17248;
    }
}
