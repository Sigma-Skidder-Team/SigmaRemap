// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3728 extends Class3703
{
    private int field17110;
    private int field17111;
    private String field17112;
    private String field17113;
    private String field17114;
    private long field17115;
    private Class6540 field17116;
    
    public Class3728() {
        super("Item Information Entry");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        if (this.field17026 == 0 || this.field17026 == 1) {
            this.field17110 = (int)class9131.method33137(2);
            this.field17111 = (int)class9131.method33137(2);
            this.field17112 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
            this.field17113 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
            this.field17114 = class9131.method33140((int)this.method11491(class9131), "UTF-8");
        }
        if (this.field17026 == 1) {
            if (this.method11491(class9131) > 0L) {
                this.field17115 = class9131.method33137(4);
                if (this.method11491(class9131) > 0L) {
                    this.field17116 = Class6540.method19776((int)this.field17115);
                    if (this.field17116 != null) {
                        this.field17116.method19777(class9131);
                    }
                }
            }
        }
    }
    
    public int method11464() {
        return this.field17110;
    }
    
    public int method11465() {
        return this.field17111;
    }
    
    public String method11466() {
        return this.field17112;
    }
    
    public String method11467() {
        return this.field17113;
    }
    
    public String method11468() {
        return this.field17114;
    }
    
    public long method11469() {
        return this.field17115;
    }
    
    public Class6540 method11470() {
        return this.field17116;
    }
}
