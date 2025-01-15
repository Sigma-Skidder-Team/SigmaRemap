// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3759 extends Class3753
{
    private static String[] field17188;
    private int field17189;
    private int field17190;
    private double field17191;
    private double field17192;
    private int field17193;
    private int field17194;
    private String field17195;
    
    public Class3759(final String s) {
        super(s);
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        class9131.method33144(2L);
        class9131.method33144(2L);
        class9131.method33144(4L);
        class9131.method33144(4L);
        class9131.method33144(4L);
        this.field17189 = (int)class9131.method33137(2);
        this.field17190 = (int)class9131.method33137(2);
        this.field17191 = class9131.method33143(16, 16);
        this.field17192 = class9131.method33143(16, 16);
        class9131.method33144(4L);
        this.field17193 = (int)class9131.method33137(2);
        final int method33135 = class9131.method33135();
        this.field17195 = class9131.method33139(method33135);
        class9131.method33144(31 - method33135);
        this.field17194 = (int)class9131.method33137(2);
        class9131.method33144(2L);
        this.method11502(class9131);
    }
    
    public int method11548() {
        return this.field17189;
    }
    
    public int method11549() {
        return this.field17190;
    }
    
    public double method11550() {
        return this.field17191;
    }
    
    public double method11551() {
        return this.field17192;
    }
    
    public int method11552() {
        return this.field17193;
    }
    
    public String method11553() {
        return this.field17195;
    }
    
    public int method11554() {
        return this.field17194;
    }
}
