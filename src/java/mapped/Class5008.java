// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public class Class5008 extends Class5009
{
    @Override
    public String method15225() {
        return "dump";
    }
    
    @Override
    public String method15226() {
        return "Dump information about your server, this is helpful if you report bugs.";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        final Class8867 class7672 = new Class8867(System.getProperty("java.version"), System.getProperty("os.name"), Class8626.field36206, Class8626.method29276(), Class8563.method28793().method34743(), Class8563.method28793().method34744(), Class8563.method28793().method34745());
        Class8563.method28793().method34746(new Class1561(this, class7671, class7672, new Class7782(class7672, Class8563.method28793().method34757().method23325(), Class8563.method28793().method34759(), Class8563.method28794().method33560().method30254())));
        return true;
    }
    
    private String method15228(final String s) {
        return String.format("https://dump.viaversion.com/%s", s);
    }
}
