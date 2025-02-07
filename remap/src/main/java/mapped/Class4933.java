// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4933 extends Class4800
{
    public Class4832 field21128;
    public Class4832 field21129;
    public Class4909 field21130;
    public Class4909 field21131;
    public Class7861 field21132;
    private String field21133;
    
    public Class4933(final Class7971 class7971) {
        super("Alt Manager");
        this.field21132 = Client.getInstance().method35198();
        this.field21133 = "§7Waiting...";
        this.setListening(false);
        final int n = 400;
        int n2 = 114;
        final int n3 = (this.method14276() - n) / 2;
        this.addToList(this.field21128 = new Class4832(this, "username", n3, n2, n, 45, Class4832.field20670, "", "New name", ClientFonts.Default));
        n2 += 80;
        this.addToList(this.field21129 = new Class4832(this, "password", n3, n2, n, 45, Class4832.field20670, "", "New password", ClientFonts.Default));
        n2 += 190;
        this.addToList(this.field21130 = new Class4909(this, "edit", n3, n2, n, 40, "Edit", ClientColors.MID_GREY.color));
        n2 += 50;
        this.addToList(this.field21131 = new Class4909(this, "back", n3, n2, n, 40, "Cancel", ClientColors.MID_GREY.color));
        this.field21129.method14477(true);
        this.field21129.method14470("*");
        this.field21130.doThis((class7972, n) -> {
            if (this.field21128.getTypedText().length() > 0) {
                if (!this.field21128.getTypedText().equals(class7971.method25888())) {
                    class7971.method25897(this.field21128.getTypedText());
                }
                class7971.method25894(this.field21128.getTypedText());
            }
            class7971.method25893(this.field21129.getTypedText());
            this.field21133 = "Edited!";
        });
        this.field21131.doThis((class4803, n) -> Client.getInstance().getGuimanager().method32156(new Class4936()));
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26905(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class9493.field40801);
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.PALE_RED.color, 0.1f));
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.95f));
        RenderUtil.method26890(ClientFonts.Default, (float)(this.method14276() / 2), 20.0f, "Edit Alt", ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734);
        RenderUtil.method26891(ClientFonts.Default, (float)(this.method14276() / 2), 40.0f, this.field21133, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734, true);
        super.draw(n);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Client.getInstance().getGuimanager().method32156(new Class4936());
        }
    }
}
