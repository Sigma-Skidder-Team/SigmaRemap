// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;

public class Class3780 extends Class3703
{
    private static final String[] field17255;
    private Class2062 field17256;
    private byte[] field17257;
    
    public Class3780() {
        super("iTunes Metadata Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17256 = Class2062.method8151(this.field17027);
        class9131.method33144(4L);
        class9131.method33138(this.field17257 = new byte[(int)this.method11491(class9131)]);
    }
    
    public Class2062 method11588() {
        return this.field17256;
    }
    
    public byte[] method11589() {
        return Arrays.copyOf(this.field17257, this.field17257.length);
    }
    
    public String method11590() {
        return new String(this.field17257, StandardCharsets.UTF_8);
    }
    
    public long method11591() {
        long n = 0L;
        for (int i = 0; i < this.field17257.length; ++i) {
            n = (n << 8 | (long)(this.field17257[i] & 0xFF));
        }
        return n;
    }
    
    public int method11592() {
        return (int)this.method11591();
    }
    
    public boolean method11593() {
        return this.method11591() != 0L;
    }
    
    public Date method11594() {
        final int n = (int)Math.floor(this.field17257.length / 3) - 1;
        Date parse;
        if (n >= 0 && n < Class3780.field17255.length) {
            parse = new SimpleDateFormat(Class3780.field17255[n]).parse(new String(this.field17257), new ParsePosition(0));
        }
        else {
            parse = null;
        }
        return parse;
    }
    
    static {
        field17255 = new String[] { "yyyy", "yyyy-MM", "yyyy-MM-dd" };
    }
}
