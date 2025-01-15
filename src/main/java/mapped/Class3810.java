// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3810 extends Class3703
{
    private long field17328;
    private boolean field17329;
    private boolean field17330;
    private boolean field17331;
    private boolean field17332;
    private boolean field17333;
    private boolean field17334;
    private long field17335;
    private long field17336;
    private long field17337;
    private long field17338;
    private long field17339;
    
    public Class3810() {
        super("Track Fragment Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17328 = class9131.method33137(4);
        this.field17329 = ((this.field17027 & 0x1) == 0x1);
        this.field17335 = (this.field17329 ? class9131.method33137(8) : 0L);
        this.field17330 = ((this.field17027 & 0x2) == 0x2);
        this.field17336 = (this.field17330 ? class9131.method33137(4) : 0L);
        this.field17331 = ((this.field17027 & 0x8) == 0x8);
        this.field17337 = (this.field17331 ? class9131.method33137(4) : 0L);
        this.field17332 = ((this.field17027 & 0x10) == 0x10);
        this.field17338 = (this.field17332 ? class9131.method33137(4) : 0L);
        this.field17333 = ((this.field17027 & 0x20) == 0x20);
        this.field17339 = (this.field17333 ? class9131.method33137(4) : 0L);
        this.field17334 = ((this.field17027 & 0x10000) == 0x10000);
    }
    
    public long method11666() {
        return this.field17328;
    }
    
    public boolean method11667() {
        return this.field17329;
    }
    
    public long method11668() {
        return this.field17335;
    }
    
    public boolean method11669() {
        return this.field17330;
    }
    
    public long method11670() {
        return this.field17336;
    }
    
    public boolean method11671() {
        return this.field17331;
    }
    
    public long method11672() {
        return this.field17337;
    }
    
    public boolean method11673() {
        return this.field17332;
    }
    
    public long method11674() {
        return this.field17338;
    }
    
    public boolean method11675() {
        return this.field17333;
    }
    
    public long method11676() {
        return this.field17339;
    }
    
    public boolean method11677() {
        return this.field17334;
    }
}
