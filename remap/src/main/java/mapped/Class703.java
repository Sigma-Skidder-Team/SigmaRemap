// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class703 extends Class698
{
    private static String[] field3867;
    public final Screen field3868;
    public final Class5760 field3869;
    
    public Class703(final Screen field3868, final ITextComponent class2250) {
        super(class2250);
        this.field3868 = field3868;
        this.field3869 = Minecraft.getInstance().gameSettings;
    }
    
    public Class703(final Screen field3868, final Class5760 field3869, final ITextComponent class2250) {
        super(class2250);
        this.field3868 = field3868;
        this.field3869 = field3869;
    }
    
    @Override
    public void removed() {
        this.minecraft.gameSettings.method17121();
    }
    
    @Override
    public void onClose() {
        this.minecraft.displayGuiScreen(this.field3868);
    }
}
