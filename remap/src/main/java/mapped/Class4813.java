// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4813 extends Class4803
{
    public Class4813(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.method14311(false);
        final Class6523 method19739 = Class6523.field25964.method19739();
        method19739.method19730(ClientColors.LIGHT_GREYISH_BLUE.color);
        final Class4861 class4804;
        this.addVisualThing(class4804 = new Class4861(this, "openKeybinds", n3 / 2 - 300, n4 - 80, 300, 38, method19739, "Open Keybind Manager", ClientFonts.JelloLight24));
        final Class4861 class4805;
        this.addVisualThing(class4805 = new Class4861(this, "openGui", n3 / 2, n4 - 80, 300, 38, method19739, "Open Jello's Click GUI", ClientFonts.JelloLight24));
        final Class4861 class4806;
        this.addVisualThing(class4806 = new Class4861(this, "credits", n3 / 2 - 100, n4 - 280, 200, 38, method19739, "Credits", ClientFonts.JelloLight18));
        class4804.method14260((class4803, n) -> Class4941.method14887(new Class531(new StringTextComponent("Keybind Manager"))));
        class4805.method14260((class4803, n) -> Class4941.method14887(new Class722(new StringTextComponent("Click GUI"))));
        class4806.method14260((class4803, n) -> Class4941.method14887(new Class718(new StringTextComponent("GuiCredits"))));
        final Class4867 class4807;
        this.addVisualThing(class4807 = new Class4867(this, "guiBlurCheckBox", n3 / 2 - 70, n4 - 220, 25, 25));
        class4807.method14602(Client.getInstance().method35193().method32144(), false);
        class4807.method14516(class4868 -> Client.getInstance().method35193().method32143(class4807.method14600()));
        final Class4867 class4808;
        this.addVisualThing(class4808 = new Class4867(this, "guiBlurIngameCheckBox", n3 / 2 + 130, n4 - 220, 25, 25));
        class4808.method14602(Client.getInstance().method35193().method32146(), false);
        class4808.method14516(class4868 -> Client.getInstance().method35193().method32145(class4808.method14600()));
    }
    
    @Override
    public void draw(final float n) {
        this.method14366(this.field20478 + (this.method14276() - 202) / 2, this.field20479 + 10, n);
        final StringBuilder append = new StringBuilder().append("You're currently using Sigma ");
        Client.getInstance();
        final String string = append.append("5.0.0b6").toString();
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(this.field20478 + (this.method14276() - ClientFonts.JelloLight20.getWidth(string)) / 2), (float)(this.field20479 + 70), string, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4f * n));
        final String string2 = "Click GUI is currently bound to: " + ColorUtils.method19166(Client.getInstance().method35189().method21557().method21959(Class722.class)) + " Key";
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
