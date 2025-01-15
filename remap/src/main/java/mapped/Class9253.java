// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;

import java.util.List;

public class Class9253
{
    private final Class759 field39687;
    private final List<Entity> field39688;
    private final List<Entity> field39689;
    
    public Class9253(final Class759 field39687) {
        this.field39688 = Lists.newArrayList();
        this.field39689 = Lists.newArrayList();
        this.field39687 = field39687;
    }
    
    public void method34142() {
        this.field39688.clear();
        this.field39689.clear();
    }
    
    public boolean method34143(final Entity class399) {
        if (this.field39688.contains(class399)) {
            return true;
        }
        if (!this.field39689.contains(class399)) {
            this.field39687.world.method6796().method15297("canSee");
            final boolean method2747 = this.field39687.method2747(class399);
            this.field39687.world.method6796().method15299();
            if (!method2747) {
                this.field39689.add(class399);
            }
            else {
                this.field39688.add(class399);
            }
            return method2747;
        }
        return false;
    }
}
