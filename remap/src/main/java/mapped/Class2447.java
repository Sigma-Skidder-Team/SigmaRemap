// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;

public class Class2447 extends Class2437
{
    private static String[] field14402;
    public final /* synthetic */ int field14403;
    public final /* synthetic */ int field14404;
    public final /* synthetic */ Class2697 field14405;
    
    public Class2447(final Class2697 field14405, final int field14406, final int field14407) {
        this.field14405 = field14405;
        this.field14403 = field14406;
        this.field14404 = field14407;
    }
    
    @Override
    public void method9788(final Class8699 class8699) throws Exception {
        class8699.method29823(Class5260.field22312, this.field14403);
        final ArrayList list = new ArrayList();
        final Class7562 class8700 = new Class7562((short)373, (byte)1, (short)this.field14404, null);
        Class8458.method28227(class8700);
        list.add(new Class7276(5, Class1968.field10763, class8700));
        class8699.method29823(Class8794.field36974, list);
    }
}
