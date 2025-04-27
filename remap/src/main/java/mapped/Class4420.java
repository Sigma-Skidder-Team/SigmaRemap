// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public final class Class4420 implements Class4410<ITextComponent>
{
    private static String[] field19751;
    
    public void method13367(final PacketBuffer class8654, final ITextComponent class8655) {
        class8654.writeTextComponent(class8655);
    }
    
    public ITextComponent method13368(final PacketBuffer class8654) {
        return class8654.readTextComponent();
    }
    
    public ITextComponent method13369(final ITextComponent class2250) {
        return class2250.deepCopy();
    }
}
