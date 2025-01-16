// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6505 implements Class6504
{
    private static String[] field25879;
    public Class5027 field25880;
    public final /* synthetic */ Class5029 field25881;
    
    private Class6505(final Class5029 field25881) {
        this.field25881 = field25881;
        this.field25880 = Class5026.field21549;
    }
    
    @Override
    public boolean method19593() {
        return this.field25880 != Class5026.field21549;
    }
    
    @Override
    public Class5756 method19594() {
        final Class5756 method15304 = this.field25880.method15304();
        this.field25880 = Class5026.field21549;
        return method15304;
    }
    
    @Override
    public Class5756 method19595() {
        return this.field25880.method15304();
    }
    
    @Override
    public void method19596() {
        if (this.field25880 == Class5026.field21549) {
            this.field25880 = new Class5030(Util.method27838(), Class5029.method15306(this.field25881), true);
        }
    }
}
