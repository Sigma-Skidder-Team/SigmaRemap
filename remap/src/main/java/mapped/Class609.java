// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class609 extends Class608<Class644>
{
    private static String[] field3562;
    public final /* synthetic */ Class691 field3563;
    
    public Class609(final Class691 field3563, final Class869 class869) {
        this.field3563 = field3563;
        super(class869, field3563.field3152, field3563.field3153, 32, field3563.field3153 - 64, 36);
        for (final EntityType class870 : Registry.field210) {
            if (Class691.method3867(field3563).method23091(Class8276.field33985.method8449(class870)) <= 0 && Class691.method3867(field3563).method23091(Class8276.field33986.method8449(class870)) <= 0) {
                continue;
            }
            this.method3536(new Class644(class870));
        }
    }
    
    @Override
    public void method3545() {
        this.field3563.method3041();
    }
}
