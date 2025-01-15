// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3809 extends Class3805
{
    private int field17321;
    private double field17322;
    private double field17323;
    private double field17324;
    private String field17325;
    private String field17326;
    private String field17327;
    
    public Class3809() {
        super("3GPP Location Information Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.method11652(class9131);
        this.field17325 = class9131.method33141((int)this.method11491(class9131));
        this.field17321 = class9131.method33135();
        this.field17322 = class9131.method33143(16, 16);
        this.field17323 = class9131.method33143(16, 16);
        this.field17324 = class9131.method33143(16, 16);
        this.field17326 = class9131.method33141((int)this.method11491(class9131));
        this.field17327 = class9131.method33141((int)this.method11491(class9131));
    }
    
    public String method11659() {
        return this.field17325;
    }
    
    public int method11660() {
        return this.field17321;
    }
    
    public double method11661() {
        return this.field17322;
    }
    
    public double method11662() {
        return this.field17323;
    }
    
    public double method11663() {
        return this.field17324;
    }
    
    public String method11664() {
        return this.field17326;
    }
    
    public String method11665() {
        return this.field17327;
    }
}
