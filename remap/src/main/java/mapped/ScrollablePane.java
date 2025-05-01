// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.TrueTypeFont;

import java.util.Iterator;

public class ScrollablePane extends Class4815
{
    private boolean field20607;
    private boolean field20608;
    private boolean field20609;
    public CustomGuiScreen field20610;
    public Class4827 field20611;
    private boolean field20612;
    public int field20613;
    public boolean field20614;
    
    public ScrollablePane(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public ScrollablePane(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public ScrollablePane(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public ScrollablePane(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    private final void method14390() {
        this.method14250().add(this.field20610 = new CustomGuiScreen(this, "content", 0, 0, this.field20480, this.field20481));
        this.field20610.method14270(new Class6509());
        this.method14250().add(this.field20611 = new Class4827(this, 11));
        this.field20611.method14301(true);
    }
    
    public void method14391(final int field20650) {
        this.field20611.field20650 = field20650;
    }
    
    public int method14392() {
        if (this.field20611 != null) {
            return this.field20611.field20650;
        }
        return 0;
    }
    
    public void method14393(final boolean field20609) {
        this.field20609 = field20609;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (this.field20609 && !this.method14296()) {
            return;
        }
        super.method14200(n, n2);
        this.field20610.method14275(-1 * this.field20611.method14456());
        for (final CustomGuiScreen customGuiScreen : this.method14396().method14250()) {
            final Iterator<Class6507> iterator2 = customGuiScreen.method14269().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().method19597(customGuiScreen, this);
            }
        }
    }
    
    public void method14394(final boolean field20612) {
        this.field20612 = field20612;
    }
    
    public boolean method14395() {
        return this.field20612;
    }
    
    @Override
    public void draw(final float partialTicks) {
        this.method14227();
        if (this.field20609 && !this.method14296()) {
            return;
        }
        if (this.field20612) {
            RenderUtil.method26865(this);
        }
        super.draw(partialTicks);
        if (this.field20612) {
            RenderUtil.endScissor();
        }
    }
    
    @Override
    public void addToList(final CustomGuiScreen customGuiScreen) {
        this.field20610.addToList(customGuiScreen);
    }
    
    @Override
    public boolean method14248(final CustomGuiScreen customGuiScreen) {
        return this.field20610.method14248(customGuiScreen);
    }
    
    @Override
    public boolean method14240(final String s) {
        return this.field20610.method14240(s);
    }
    
    public CustomGuiScreen method14396() {
        return this.field20610;
    }
    
    public void method14397(final boolean field20614) {
        this.field20614 = field20614;
    }
}
