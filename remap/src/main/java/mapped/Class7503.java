// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7503
{
    private static String[] field29078;
    public static final Class7503 field29079;
    public final Class6429 field29080;
    public final Class6429 field29081;
    public final Class6429 field29082;
    public final Class6429 field29083;
    public final Class6429 field29084;
    public final Class6429 field29085;
    public final Class6429 field29086;
    public final Class6429 field29087;
    
    private Class7503() {
        this(Class6429.field25537, Class6429.field25537, Class6429.field25537, Class6429.field25537, Class6429.field25537, Class6429.field25537, Class6429.field25537, Class6429.field25537);
    }
    
    public Class7503(final Class7503 class7503) {
        this.field29080 = class7503.field29080;
        this.field29081 = class7503.field29081;
        this.field29082 = class7503.field29082;
        this.field29083 = class7503.field29083;
        this.field29084 = class7503.field29084;
        this.field29085 = class7503.field29085;
        this.field29086 = class7503.field29086;
        this.field29087 = class7503.field29087;
    }
    
    public Class7503(final Class6429 field29080, final Class6429 field29081, final Class6429 field29082, final Class6429 field29083, final Class6429 field29084, final Class6429 field29085, final Class6429 field29086, final Class6429 field29087) {
        this.field29080 = field29080;
        this.field29081 = field29081;
        this.field29082 = field29082;
        this.field29083 = field29083;
        this.field29084 = field29084;
        this.field29085 = field29085;
        this.field29086 = field29086;
        this.field29087 = field29087;
    }
    
    public Class6429 method23402(final Class2016 class2016) {
        switch (Class6667.field26339[class2016.ordinal()]) {
            case 1: {
                return this.field29080;
            }
            case 2: {
                return this.field29081;
            }
            case 3: {
                return this.field29082;
            }
            case 4: {
                return this.field29083;
            }
            case 5: {
                return this.field29084;
            }
            case 6: {
                return this.field29085;
            }
            case 7: {
                return this.field29086;
            }
            case 8: {
                return this.field29087;
            }
            default: {
                return Class6429.field25537;
            }
        }
    }
    
    public boolean method23403(final Class2016 class2016) {
        return this.method23402(class2016) != Class6429.field25537;
    }
    
    static {
        field29079 = new Class7503();
    }
}
