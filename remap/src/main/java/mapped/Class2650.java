// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import io.netty.buffer.ByteBuf;

public class Class2650 extends Class2466
{
    private static String[] field14760;
    public final /* synthetic */ Class2976 field14761;
    
    public Class2650(final Class2976 field14761) {
        this.field14761 = field14761;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6482 class8700 = Class8563.method28794().method33549().method29950(Class6482.class);
        final Class8322 class8701 = class8699.method29818(Class5260.field22318, 0);
        final Optional<Class74> method19510 = class8700.method19510(class8699.method29841(), class8701);
        if (method19510.isPresent()) {
            final Class8699 class8702 = new Class8699(9, null, class8699.method29841());
            class8702.method29823(Class5260.field22318, class8701);
            class8702.method29823(Class5260.field22292, (Short)2);
            class8702.method29823((Class5260<Object>)Class5260.field22322, method19510.get());
            class8702.method29833(Class5224.class);
        }
    }
}
