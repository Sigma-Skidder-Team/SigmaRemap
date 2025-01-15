// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8199
{
    private static String[] field33718;
    private static final Class6058<Class7096> field33719;
    private final int field33720;
    private short field33721;
    private short field33722;
    private short field33723;
    private final Class7875<Class7096> field33724;
    public static final ThreadLocal<Class9489> field33725;
    
    public Class8199(final int n) {
        this(n, (short)0, (short)0, (short)0);
    }
    
    public Class8199(final int field33720, final short field33721, final short field33722, final short field33723) {
        this.field33720 = field33720;
        this.field33721 = field33721;
        this.field33722 = field33722;
        this.field33723 = field33723;
        this.field33724 = new Class7875<Class7096>(Class8199.field33719, Class3833.field17391, Class9346::method34647, Class9346::method34649, Class7521.field29147.method11878());
    }
    
    public Class7096 method27148(final int n, final int n2, final int n3) {
        return this.field33724.method25507(n, n2, n3);
    }
    
    public Class7099 method27149(final int n, final int n2, final int n3) {
        return this.field33724.method25507(n, n2, n3).method21756();
    }
    
    public void method27150() {
        this.field33724.method25498();
    }
    
    public void method27151() {
        this.field33724.method25499();
    }
    
    public Class7096 method27152(final int n, final int n2, final int n3, final Class7096 class7096) {
        return this.method27153(n, n2, n3, class7096, true);
    }
    
    public Class7096 method27153(final int n, final int n2, final int n3, final Class7096 class7096, final boolean b) {
        Class7096 class7097;
        if (!b) {
            class7097 = this.field33724.method25504(n, n2, n3, class7096);
        }
        else {
            class7097 = this.field33724.method25503(n, n2, n3, class7096);
        }
        final Class7099 method21756 = class7097.method21756();
        final Class7099 method21757 = class7096.method21756();
        if (!class7097.method21706()) {
            --this.field33721;
            if (class7097.method21757()) {
                --this.field33722;
            }
        }
        if (!method21756.method21781()) {
            --this.field33723;
        }
        if (!class7096.method21706()) {
            ++this.field33721;
            if (class7096.method21757()) {
                ++this.field33722;
            }
        }
        if (!method21757.method21781()) {
            ++this.field33723;
        }
        return class7097;
    }
    
    public boolean method27154() {
        return this.field33721 == 0;
    }
    
    public static boolean method27155(final Class8199 class8199) {
        return class8199 == Class1862.field10141 || class8199.method27154();
    }
    
    public boolean method27156() {
        return this.method27157() || this.method27158();
    }
    
    public boolean method27157() {
        return this.field33722 > 0;
    }
    
    public boolean method27158() {
        return this.field33723 > 0;
    }
    
    public int method27159() {
        return this.field33720;
    }
    
    public void method27160() {
        final Class9489 class9489 = Class8199.field33725.get();
        if (class9489 != null) {
            final Class7383[] method35318 = class9489.method35318();
            if (method35318 != null) {
                final int n = this.field33720 >> 4;
                if (n >= 0) {
                    if (n < method35318.length) {
                        final Class7383 class9490 = method35318[n];
                        if (class9490 != null) {
                            this.field33721 = class9490.method22669();
                            this.field33722 = class9490.method22670();
                            this.field33723 = class9490.method22671();
                            method35318[n] = null;
                            return;
                        }
                    }
                }
            }
        }
        this.field33721 = 0;
        this.field33722 = 0;
        this.field33723 = 0;
        this.field33724.method25515((class7096, n) -> {
            final Class7099 method21756 = class7096.method21756();
            if (!class7096.method21706()) {
                this.field33721 += (short)n;
                if (class7096.method21757()) {
                    this.field33722 += (short)n;
                }
            }
            if (!method21756.method21781()) {
                this.field33721 += (short)n;
                if (method21756.method21788()) {
                    this.field33723 += (short)n;
                }
            }
        });
    }
    
    public Class7875<Class7096> method27161() {
        return this.field33724;
    }
    
    public void method27162(final PacketBuffer class8654) {
        this.field33721 = class8654.readShort();
        this.field33724.method25509(class8654);
    }
    
    public void method27163(final PacketBuffer class8654) {
        class8654.writeShort(this.field33721);
        this.field33724.method25510(class8654);
    }
    
    public int method27164() {
        return 2 + this.field33724.method25513();
    }
    
    public boolean method27165(final Class7096 class7096) {
        return this.field33724.method25514(class7096);
    }
    
    public short method27166() {
        return this.field33721;
    }
    
    public short method27167() {
        return this.field33722;
    }
    
    public short method27168() {
        return this.field33723;
    }
    
    static {
        field33719 = new Class6061<Class7096>(Class3833.field17391, Class7521.field29147.method11878());
        field33725 = new ThreadLocal<Class9489>();
    }
}
