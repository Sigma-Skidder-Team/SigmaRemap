// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3766 extends Class3736
{
    public static final String field17211 = "isom";
    public static final String field17212 = "iso2";
    public static final String field17213 = "iso3";
    public static final String field17214 = "mp41";
    public static final String field17215 = "mp42";
    public static final String field17216 = "mmp4";
    public static final String field17217 = "qm  ";
    public static final String field17218 = "avc1";
    public static final String field17219 = "M4A ";
    public static final String field17220 = "M4B ";
    public static final String field17221 = "M4P ";
    public static final String field17222 = "mp71";
    public String field17223;
    public String field17224;
    public String[] field17225;
    
    public Class3766() {
        super("File Type Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        this.field17223 = class9131.method33139(4);
        this.field17224 = class9131.method33139(4);
        this.field17225 = new String[(int)this.method11491(class9131) / 4];
        for (int i = 0; i < this.field17225.length; ++i) {
            this.field17225[i] = class9131.method33139(4);
        }
    }
    
    public String method11569() {
        return this.field17223;
    }
    
    public String method11570() {
        return this.field17224;
    }
    
    public String[] method11571() {
        return this.field17225;
    }
}
