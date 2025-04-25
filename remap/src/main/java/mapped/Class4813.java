// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4813 extends CustomGuiScreen
{
    public Class4813(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.setListening(false);
        final ColorHelper method19739 = ColorHelper.field25964.method19739();
        method19739.method19730(ClientColors.LIGHT_GREYISH_BLUE.color);
        final UIButton class4804;
        this.addToList(class4804 = new UIButton(this, "openKeybinds", n3 / 2 - 300, n4 - 80, 300, 38, method19739, "Open Keybind Manager", ClientFonts.JelloLight24));
        final UIButton class4805;
        this.addToList(class4805 = new UIButton(this, "openGui", n3 / 2, n4 - 80, 300, 38, method19739, "Open Jello's Click GUI", ClientFonts.JelloLight24));
        final UIButton class4806;
        this.addToList(class4806 = new UIButton(this, "credits", n3 / 2 - 100, n4 - 280, 200, 38, method19739, "Credits", ClientFonts.JelloLight18));
        class4804.doThis((class4803, n) -> Class4941.method14887(new Class531(new StringTextComponent("Keybind Manager"))));
        class4805.doThis((class4803, n) -> Class4941.method14887(new ClickGuiHolder(new StringTextComponent("Click GUI"))));
        class4806.doThis((class4803, n) -> Class4941.method14887(new Class718(new StringTextComponent("GuiCredits"))));
        final Class4867 class4807;
        this.addToList(class4807 = new Class4867(this, "guiBlurCheckBox", n3 / 2 - 70, n4 - 220, 25, 25));
        class4807.method14602(Client.getInstance().getScreenManager().method32144(), false);
        class4807.method14516(class4868 -> Client.getInstance().getScreenManager().method32143(class4807.method14600()));
        final Class4867 class4808;
        this.addToList(class4808 = new Class4867(this, "guiBlurIngameCheckBox", n3 / 2 + 130, n4 - 220, 25, 25));
        class4808.method14602(Client.getInstance().getScreenManager().method32146(), false);
        class4808.method14516(class4868 -> Client.getInstance().getScreenManager().method32145(class4808.method14600()));
    }
    
    @Override
    public void draw(final float n) {
        this.method14366(this.x + (this.method14276() - 202) / 2, this.y + 10, n);
        final StringBuilder append = new StringBuilder().append("You're currently using Sigma ");
        Client.getInstance();
        final String string = append.append("5.0.0b6").toString();
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.x + (this.method14276() - ClientFonts.JelloLight20.getWidth(string)) / 2), (float)(this.y + 70), string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4f * n));
        final String string2 = "Click GUI is currently bound to: " + ColorUtils.method19166(Client.getInstance().moduleManager().getJelloTouch().method21959(ClickGuiHolder.class)) + " Key";
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.method14272() + (this.method14276() - ClientFonts.JelloLight20.getWidth(string2)) / 2), (float)(this.method14274() + this.method14278() - 180), string2, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * n));
        final String s = "Configure all your keybinds in the keybind manager!";
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + (this.method14276() - ClientFonts.JelloLight14.getWidth(s)) / 2), (float)(this.method14274() + this.method14278() - 150), s, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4f * n));
        final String s2 = "GUI Blur: ";
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.method14272() + (this.method14276() - ClientFonts.JelloLight20.getWidth(s2)) / 2 - 114), (float)(this.method14274() + this.method14278() - 221), s2, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f * n));
        final String s3 = "GPU Accelerated: ";
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.method14272() + (this.method14276() - ClientFonts.JelloLight20.getWidth(s3)) / 2 + 52), (float)(this.method14274() + this.method14278() - 221), s3, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f * n));
        super.draw(n);
    }
    
    private void method14366(final int n, final int n2, final float n3) {
        RenderUtil.drawString(ClientFonts.JelloMedium40, (float)n, (float)(n2 + 1), "Jello", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n3));
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)(n + 95), (float)(n2 + 14), "for Sigma", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.86f * n3));
    }
}
