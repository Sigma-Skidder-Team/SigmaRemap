// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public class Class2596 extends Class2466
{
    public final /* synthetic */ Class2993 field14663;
    
    public Class2596(final Class2993 field14663) {
        this.field14663 = field14663;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6489 class8700 = Class8563.method28794().method33549().method29950(Class6489.class);
        final String str = class8699.method29822(Class5260.field22308);
        final Optional<Integer> method19525 = class8700.method19525(str);
        if (!method19525.isPresent()) {
            if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("Could not find painting motive: " + str + " falling back to default (0)");
            }
        }
        class8699.method29823((Class5260<Object>)Class5260.field22312, method19525.or((Object)0));
    }
}
