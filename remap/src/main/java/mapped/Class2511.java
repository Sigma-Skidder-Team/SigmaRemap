// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.List;

public class Class2511 extends Class2466
{
    private static String[] field14506;
    public final /* synthetic */ Class2991 field14507;
    
    public Class2511(final Class2991 field14507) {
        this.field14507 = field14507;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Optional<Class2137> method20168 = class8699.method29841().method18207(Class6642.class).method20168(intValue);
        if (method20168.isPresent()) {
            Class9140.method33332(intValue, (Class2137)method20168.get(), class8699.method29818(Class8794.field36974, 0), class8699.method29841());
        }
    }
}
