// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1670 extends Class1669 {
    private static String[] field9456;
    public final /* synthetic */ StreamAllocation field9457;
    public final /* synthetic */ Class5040 field9458;

    public Class1670(final Class5040 field9458, final boolean b, final Class1681 class1681, final Class1679 class1682, final StreamAllocation field9459) {
        super(b, class1681, class1682);
        this.field9458 = field9458;
        this.field9457 = field9459;
    }

    @Override
    public void close() throws IOException {
        this.field9457.method31368(true, this.field9457.method31369());
    }
}
