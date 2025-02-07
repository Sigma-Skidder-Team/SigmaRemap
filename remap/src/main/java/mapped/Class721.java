// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class721 extends Class720
{
    private Class654 field3942;
    public static int field3943;
    private Widget field3944;
    
    public Class721() {
        super(new Class548());
    }
    
    public Class721(final Screen class527) {
        super(class527);
    }
    
    @Override
    public void init() {
        super.init();
        this.field3944 = this.addButton(new Class6470("jello.portaloption", 0.0, (double)(this.method3963().size() - 1), 1.0f, p0 -> Double.valueOf(this.method3962()), (p0, n) -> Class9367.field40167 = this.method3964(n.intValue()), (class5762, class5764) -> this.method3964((int)class5764.method19476(class5762)).method25614()).method19362(this.minecraft.gameSettings, this.width / 2 + 40, 7, 114));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        super.render(n, n2, n3);
        RenderUtil.method26870(0, 0, Minecraft.method5277().window.method7694(), (int)(30.0 * Minecraft.method5277().window.getGuiScaleFactor() / Class9000.field37993));
        this.renderBackground();
        RenderUtil.endScissor();
        this.field3944.render(n, n2, n3);
        this.drawString(this.font, this.title.getFormattedText(), this.width / 2 - 146, 13, 16777215);
        this.drawString(this.font, "Jello Portal:", this.width / 2 - 30, 13, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f));
    }
    
    private int method3962() {
        Class721.field3943 = 0;
        for (final Class7906 class7906 : this.method3963()) {
            if (this.method3964(Class721.field3943).equals(Class9367.field40167)) {
                break;
            }
            ++Class721.field3943;
        }
        return Class721.field3943;
    }
    
    private List<Class7906> method3963() {
        final ArrayList list = new ArrayList();
        for (final Class7906 class7906 : Class7906.field32451) {
            if (class7906.method25613() < 47) {
                continue;
            }
            list.add(class7906);
        }
        return list;
    }
    
    private Class7906 method3964(final int n) {
        return this.method3963().get(n);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    static {
        Class721.field3943 = 0;
    }
}
