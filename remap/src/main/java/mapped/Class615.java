// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public abstract class Class615 extends Class608<Class632>
{
    private static final ResourceLocation field3586;
    private static final ITextComponent field3587;
    private static final ITextComponent field3588;
    public final Minecraft field3589;
    private final ITextComponent field3590;
    
    public Class615(final Minecraft field3589, final int n, final int n2, final ITextComponent field3590) {
        super(field3589, n, n2, 32, n2 - 55 + 4, 36);
        this.field3589 = field3589;
        this.field3549 = false;
        this.method3528(true, 13);
        this.field3590 = field3590;
    }
    
    @Override
    public void method3544(final int n, final int b, final Class7392 class7392) {
        final ITextComponent method8468 = new StringTextComponent("").appendSibling(this.field3590).applyTextStyles(TextFormatting.UNDERLINE, TextFormatting.BOLD);
        this.field3589.fontRenderer.method6610(method8468.getFormattedText(), (float)(n + this.field3543 / 2 - this.field3589.fontRenderer.method6617(method8468.getFormattedText()) / 2), (float)Math.min(this.field3545 + 3, b), 16777215);
    }
    
    @Override
    public int method3529() {
        return this.field3543;
    }
    
    @Override
    public int method3555() {
        return this.field3547 - 6;
    }
    
    public void method3590(final Class632 class632) {
        this.method3536(class632);
        Class632.method3653(class632, this);
    }
    
    static {
        field3586 = new ResourceLocation("textures/gui/resource_packs.png");
        field3587 = new Class2259("resourcePack.incompatible", new Object[0]);
        field3588 = new Class2259("resourcePack.incompatible.confirm.title", new Object[0]);
    }
}
