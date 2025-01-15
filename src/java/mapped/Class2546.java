// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.io.IOException;

public class Class2546 extends Class2466
{
    public final /* synthetic */ Class3081 field14572;
    
    public Class2546(final Class3081 field14572) {
        this.field14572 = field14572;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        class8699.method29839();
        final Class6479 class8700 = Class8563.method28794().method33549().method29950(Class6479.class);
        if (!class8700.method19506()) {
            return;
        }
        for (final Class8699 next : class8700.method19504(class8699, class8699.method29841().method18207(Class6646.class))) {
            if (!(next instanceof Class8699)) {
                throw new IOException("transformMapChunkBulk returned the wrong object type");
            }
            final Class8699 class8701 = next;
            final ByteBuf buffer = class8699.method29841().method18220().alloc().buffer();
            try {
                class8701.method29847(-1);
                class8701.method29826(buffer);
                new Class8699(33, buffer, class8699.method29841()).method29831(Class5224.class, false, true);
            }
            finally {
                buffer.release();
            }
        }
    }
}
