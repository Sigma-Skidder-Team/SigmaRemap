// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class Class7931 extends Class7930
{
    private final Entity field32596;
    
    public Class7931(final String s, final Entity class399, final Entity field32596) {
        super(s, class399);
        this.field32596 = field32596;
    }
    
    @Nullable
    @Override
    public Entity method25713() {
        return this.field32594;
    }
    
    @Nullable
    @Override
    public Entity method25714() {
        return this.field32596;
    }
    
    @Override
    public ITextComponent method25690(final LivingEntity class511) {
        final ITextComponent class512 = (this.field32596 != null) ? this.field32596.getDisplayName() : this.field32594.getDisplayName();
        final ItemStack class513 = (this.field32596 instanceof LivingEntity) ? ((LivingEntity)this.field32596).getHeldItemMainhand() : ItemStack.EMPTY;
        final String string = "death.attack." + this.field32593;
        final String string2 = string + ".item";
        return (!class513.method27620() && class513.method27667()) ? new Class2259(string2, class511.getDisplayName(), class512, class513.method27684()) : new Class2259(string, class511.getDisplayName(), class512);
    }
}
