// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4845 extends Class4841
{
    private static String[] field20591;
    public static final ColorHelper field20757;
    public List<String> field20758;
    public int field20759;
    
    public Class4845(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20758, final int field20759) {
        super(customGuiScreen, s, n, n2, n3, n4, Class4845.field20757, false);
        this.field20758 = new ArrayList<String>();
        this.field20759 = 0;
        this.field20758 = field20758;
        this.field20759 = field20759;
        this.method14524();
    }
    
    private void method14524() {
        this.method14250().clear();
        this.field20496 = ClientFonts.JelloLight18;
        for (final String s : this.field20758) {
            final Class4868 class4868;
            this.addToList(class4868 = new Class4868(this, s, 0, 0, this.method14276(), this.method14278(), new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, -1381654, this.field20497.method19729(), this.field20497.method19729(), Class2056.field11734, Class2056.field11738), s, this.method14316()));
            class4868.method14603(10);
            class4868.doThis((class4803, n) -> {
                this.method14531(this.field20758.indexOf(s));
                this.method14517();
            });
        }
        this.method14255(new Class6803(1));
    }
    
    private int method14525() {
        return this.method14278() * (this.field20758.size() - 1);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() + this.method14525()), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        RenderUtil.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)(this.method14278() + this.method14525() - 1), 6.0f, n * 0.1f);
        RenderUtil.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)(this.method14278() + this.method14525() - 1), 20.0f, n * 0.2f);
        GL11.glPushMatrix();
        super.draw(n);
        GL11.glPopMatrix();
    }
    
    public List<String> method14526() {
        return this.field20758;
    }
    
    public void method14527(final String s, final int n) {
        this.method14526().add(n, s);
        this.method14524();
    }
    
    public void method14528(final String s) {
        this.method14527(s, this.field20758.size());
    }
    
    public <E extends Enum<E>> void method14529(final Class<E> clazz) {
        this.field20758.clear();
        for (final Enum<E> enum1 : clazz.getEnumConstants()) {
            this.method14527(enum1.toString().substring(0, 1).toUpperCase() + enum1.toString().substring(1).toLowerCase(), enum1.ordinal());
        }
    }
    
    public int method14530() {
        return this.field20759;
    }
    
    public void method14531(final int field20759) {
        this.field20759 = field20759;
    }
    
    @Override
    public String getTypedText() {
        return (this.method14526().size() <= 0) ? null : this.method14526().get(this.method14530());
    }
    
    @Override
    public boolean method14236(int n, int n2) {
        n -= this.method14280();
        n2 -= this.method14281();
        if (n >= -10) {
            if (n <= this.method14276()) {
                if (n2 >= 0) {
                    return n2 <= this.method14278() + this.method14525();
                }
            }
        }
        return false;
    }
    
    static {
        field20757 = new ColorHelper(1250067, -15329770).method19734(ClientColors.DEEP_TEAL.color).method19738(Class2056.field11738);
    }
}
