// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class7928 extends Class7929
{
    public Class7928() {
        super("netherBed");
        this.method25721();
        this.method25708();
    }
    
    @Override
    public ITextComponent method25690(final Class511 class511) {
        return new Class2259("death.attack.netherBed.message", new Object[] { class511.getDisplayName(), Class9479.method35299(new Class2259("death.attack.netherBed.link", new Object[0])).method8467(class512 -> {
                class512.method30419(new Class9485(Class2075.field11971, "https://bugs.mojang.com/browse/MCPE-28723"));
                new Class9390(Class1961.field10697, new Class2260("MCPE-28723"));
                final Class9390 class513;
                final Object o;
                ((Class8768)o).method30420(class513);
            }) });
    }
}
