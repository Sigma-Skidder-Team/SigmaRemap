// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Objects;

public class Class731 extends Screen implements Class732
{
    private String field3985;
    private String field3986;
    private int field3987;
    private boolean field3988;
    private final Class9103 field3989;
    
    public Class731() {
        super(NarratorChatListener.EMPTY);
        this.field3985 = "";
        this.field3986 = "";
        this.field3989 = Class9203.method33675();
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void method4036(final ITextComponent class2250) {
        this.method4037(class2250);
    }
    
    @Override
    public void method4037(final ITextComponent class2250) {
        this.field3985 = class2250.getFormattedText();
        this.method4038(new Class2259("progress.working"));
    }
    
    @Override
    public void method4038(final ITextComponent class2250) {
        this.field3986 = class2250.getFormattedText();
        this.method4039(0);
    }
    
    @Override
    public void method4039(final int field3987) {
        this.field3987 = field3987;
    }
    
    @Override
    public void method4040() {
        this.field3988 = true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (!this.field3988) {
            if (this.field3989 != null && this.minecraft.world == null) {
                this.field3989.method32901(this.width, this.height);
            }
            else {
                this.renderBackground();
            }
            if (this.field3987 > 0) {
                this.drawCenteredString(this.font, this.field3985, this.width / 2, 70, 16777215);
                if (!Objects.equals(this.field3986, "")) {
                    if (this.field3987 != 0) {
                        this.drawCenteredString(this.font, this.field3986 + " " + this.field3987 + "%", this.width / 2, 90, 16777215);
                    }
                }
            }
            super.render(n, n2, n3);
        }
        else if (!this.minecraft.method5311()) {
            this.minecraft.displayGuiScreen(null);
        }
    }
}
