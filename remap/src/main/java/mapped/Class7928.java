// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

public class Class7928 extends DamageSource
{
    public Class7928() {
        super("netherBed");
        this.method25721();
        this.method25708();
    }
    
    @Override
    public ITextComponent method25690(final LivingEntity class511) {
        return new Class2259("death.attack.netherBed.message", new Object[] { class511.getDisplayName(), Class9479.method35299(new Class2259("death.attack.netherBed.link", new Object[0])).applyTextStyle(class512 -> {
                class512.method30419(new Class9485(Class2075.field11971, "https://bugs.mojang.com/browse/MCPE-28723"));
                new Class9390(Class1961.field10697, new StringTextComponent("MCPE-28723"));
                final Class9390 class513;
                final Object o;
                ((Style)o).method30420(class513);
            }) });
    }
}
