// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.io.IOException;

public class Class6395 implements Class6394
{
    private static String[] field25511;
    public final /* synthetic */ Class4962 field25512;
    public final /* synthetic */ Class4962 field25513;
    
    public Class6395(final Class4962 field25513, final Class4962 field25514) {
        this.field25513 = field25513;
        this.field25512 = field25514;
    }
    
    @Override
    public void method19086(final Class2305 class2305, final IOException ex) {
        Class4962.method14992(this.field25512, ex);
    }
    
    @Override
    public void method19085(final Class2305 class2305, final Class1753 class2306) throws IOException {
        Class4962.method14993(this.field25512, class2306);
        Class4962.method14994(this.field25512, class2306.method6195().method21367());
        try {
            if (class2306.method6189()) {
                Class4962.method14995(this.field25512);
            }
            else {
                Class4962.method14992(this.field25512, new IOException(Integer.toString(class2306.method6188())));
            }
        }
        finally {
            class2306.close();
        }
    }
}
