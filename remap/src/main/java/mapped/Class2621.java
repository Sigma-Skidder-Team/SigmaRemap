// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.buffer.ByteBuf;

public class Class2621 extends Class2466
{
    private static String[] field14706;
    public final /* synthetic */ Class2988 field14707;
    
    public Class2621(final Class2988 field14707) {
        this.field14707 = field14707;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        if (Class8563.method28792().method23293().contains(class8699.method29841().method18207(Class6651.class).method20207())) {
            if (!class8699.method29841().method18220().isOpen()) {
                return;
            }
            final Class8699 class8700 = new Class8699(0, null, class8699.method29841());
            Class5224.field22245.method9789(class8700, Class300.method955('&', Class8563.method28792().method23294()));
            class8699.method29839();
            class8700.method29834(Class5218.class).addListener(new Class7935(this, class8699));
        }
    }
}
