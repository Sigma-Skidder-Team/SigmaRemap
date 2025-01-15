// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class2360 extends Class2359
{
    private final Class354 field14146;
    private final Class354 field14147;
    private final long field14148;
    
    private Class2360() {
        super("TestBlockPosException");
        this.field14146 = new Class354(0, 0, 0);
        this.field14147 = new Class354(0, 0, 0);
        this.field14148 = 0L;
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() + " at " + ("" + this.field14146.method1074() + "," + this.field14146.method1075() + "," + this.field14146.method1076() + " (relative: " + this.field14147.method1074() + "," + this.field14147.method1075() + "," + this.field14147.method1076() + ")") + " (t=" + this.field14148 + ")";
    }
    
    @Nullable
    public String method9496() {
        return super.getMessage() + " here";
    }
    
    @Nullable
    public Class354 method9497() {
        return this.field14146;
    }
}
