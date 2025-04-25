// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4898 extends Class4841
{
    public Animation field20949;
    private final int field20950;
    private Class4817 field20951;
    public static Class8784 field20952;
    private LoadingIndicator field20953;
    
    public Class4898(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int field20950) {
        super(customGuiScreen, s, n, n2, n3, 0, ColorHelper.field25964, false);
        this.field20949 = new Animation(300, 200, Direction.FORWARDS);
        final UIButton class4804;
        this.addToList(class4804 = new UIButton(this, "blankButton", 25, 0, ClientFonts.JelloLight20.getWidth("Blank"), 30, ColorHelper.field25964, "Blank", ClientFonts.JelloLight20));
        class4804.doThis((class4803, n) -> ((Class4889)this.getParent()).method14637());
        final UIButton class4805;
        this.addToList(class4805 = new UIButton(this, "dupeButton", n3 - 25 - ClientFonts.JelloLight20.getWidth("Duplicate"), 0, ClientFonts.JelloLight20.getWidth("Duplicate"), 30, ColorHelper.field25964, "Duplicate", ClientFonts.JelloLight20));
        class4805.doThis((class4803, n) -> ((Class4889)this.getParent()).method14635());
        this.addToList(this.field20953 = new LoadingIndicator(this, "loading", (n3 - 30) / 2, 100, 30, 30));
        this.addToList(this.field20951 = new Class4817(this, "defaultProfiles", 0, 40, n3, field20950 - 40));
        Class4898.field20952 = new Class8784(list -> {
            this.field20953.setEnabled(false);
            final Class4889 class4889 = (Class4889)this.getParent();
            for (final String str : list) {
                final Class4868 class4890;
                this.field20951.addToList(class4890 = new Class4868(this.field20951, "p_" + str, 0, 0, n3, 30, new ColorHelper(-723724, -2039584, 0, -14671840), str, ClientFonts.JelloLight18));
                class4890.doThis((class4890, n) -> {
                    this.method14705(true);
                    new Thread(() -> {
                        Client.getInstance();
                        class4891.method14636(Class4898.field20952.method30570(Client.getInstance().moduleManager().getProfile().method32707(), s2));
                        this.method14705(false);
                    }).start();
                });
            }
            this.field20951.method14396().method14255(new Class6803(1));
        });
        this.field20950 = field20950;
    }
    
    public void method14705(final boolean b) {
        this.field20951.setEnabled(!b);
        this.field20953.setEnabled(b);
    }
    
    public void method14706(final boolean b) {
        this.field20949.changeDirection(b ? Direction.BACKWARDS : Direction.FORWARDS);
    }
    
    public boolean method14707() {
        return this.field20949.getDirection() == Direction.BACKWARDS;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        float n2 = MathUtils.lerp(this.field20949.calcPercent(), 0.1, 0.81, 0.14, 1.0);
        if (this.field20949.getDirection() == Direction.FORWARDS) {
            n2 = MathUtils.lerp(this.field20949.calcPercent(), 0.61, 0.01, 0.87, 0.16);
        }
        this.method14279((int)(this.field20950 * n2));
        if (this.field20949.calcPercent() != 0.0f) {
            RenderUtil.drawImage((float)this.x, (float)(this.y + this.field20481), (float)this.field20480, 50.0f, ClientAssets.shadow_bottom, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, this.field20949.calcPercent() * n * 0.3f));
            RenderUtil.method26865(this);
            RenderUtil.method26874((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, ColorUtils.applyAlpha(-723724, n));
            if (Class4898.field20952 != null) {
                final Class8784 field20952 = Class4898.field20952;
                if (Class8784.field36931 != null) {
                    final Class8784 field20953 = Class4898.field20952;
                    if (Class8784.field36931.isEmpty()) {
                        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.x + 40), (float)(this.y + 110), "No Default Profiles Available", ClientColors.MID_GREY.color);
                    }
                }
            }
            super.draw(n);
            RenderUtil.endScissor();
        }
    }
}
