// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import org.newdawn.slick.TrueTypeFont;

public class Class4875 extends Class4873
{
    private final String[] field20860;
    private int field20861;
    
    public Class4875(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String[] field20860, final int field20861, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, ClientAssets.skin, class4804, s2, class4805);
        this.field20860 = field20860;
        this.field20861 = field20861;
        this.method14609();
    }
    
    public Class4875(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String[] field20860, final int field20861, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, ClientAssets.skin, class4804, s2);
        this.field20860 = field20860;
        this.field20861 = field20861;
        this.method14609();
    }
    
    public Class4875(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String[] field20860, final int field20861, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, ClientAssets.skin, class4804);
        this.field20860 = field20860;
        this.field20861 = field20861;
        this.method14609();
    }
    
    public Class4875(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String[] field20860, final int field20861) {
        super(customGuiScreen, s, n, n2, n3, n4, ClientAssets.skin);
        this.field20860 = field20860;
        this.field20861 = field20861;
        this.method14609();
    }
    
    private void method14609() {
        if (this.field20861 >= 0 && this.field20861 < this.field20860.length) {
            this.setFont(ClientFonts.JelloLight20);
            this.setTypedText(this.field20860[this.field20861]);
            return;
        }
        throw new RuntimeException("Invalid index for TypeButton");
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14611(this.method14610() + 1);
        super.method14234(n, n2, n3);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float partialTicks) {
        super.draw(partialTicks);
    }
    
    public int method14610() {
        return this.field20861;
    }
    
    public void method14611(final int n) {
        this.method14612(n, true);
    }
    
    public void method14612(int field20861, final boolean b) {
        field20861 %= this.field20860.length;
        if (field20861 != this.field20861) {
            this.field20861 = field20861;
            this.setTypedText(this.field20860[field20861]);
            if (b) {
                this.method14517();
            }
        }
    }
    
    public String[] method14613() {
        return this.field20860;
    }
}
