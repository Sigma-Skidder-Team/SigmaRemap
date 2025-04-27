// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.List;

public class Class2680 extends Class2466
{
    private static String[] field14818;
    public final /* synthetic */ Class2980 field14819;
    
    public Class2680(final Class2980 field14819) {
        this.field14819 = field14819;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Optional<Class2072> method20185 = class8699.method29841().method18207(Class6645.class).method20185(intValue);
        if (method20185.isPresent()) {
            Class7341.method22550(intValue, method20185.get(), class8699.method29818(Class8202.field33727, 0), class8699.method29841());
        }
    }
}
