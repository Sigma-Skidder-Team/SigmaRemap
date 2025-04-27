// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.TrueTypeFont;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Class4894 extends Panel
{
    public static final ColorHelper field20919;
    public List<String> field20920;
    public int field20921;
    public boolean field20922;
    public boolean field20923;
    private final Animation field20924;
    private final Map<Integer, Class4845> field20925;
    
    public Class4894(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20920, final int field20921) {
        super(customGuiScreen, s, n, n2, n3, n4, Class4894.field20919, false);
        this.field20920 = new ArrayList<String>();
        this.field20921 = 0;
        this.field20924 = new Animation(220, 220);
        this.field20925 = new HashMap<Integer, Class4845>();
        this.field20920 = field20920;
        this.field20921 = field20921;
        this.method14684();
    }
    
    public Class4894(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20920, final int field20921, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, false);
        this.field20920 = new ArrayList<String>();
        this.field20921 = 0;
        this.field20924 = new Animation(220, 220);
        this.field20925 = new HashMap<Integer, Class4845>();
        this.field20920 = field20920;
        this.field20921 = field20921;
        this.method14684();
    }
    
    public Class4894(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20920, final int field20921, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20920 = new ArrayList<String>();
        this.field20921 = 0;
        this.field20924 = new Animation(220, 220);
        this.field20925 = new HashMap<Integer, Class4845>();
        this.field20920 = field20920;
        this.field20921 = field20921;
        this.method14684();
    }
    
    public Class4894(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20920, final int field20921, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20920 = new ArrayList<String>();
        this.field20921 = 0;
        this.field20924 = new Animation(220, 220);
        this.field20925 = new HashMap<Integer, Class4845>();
        this.field20920 = field20920;
        this.field20921 = field20921;
        this.method14684();
    }
    
    public void method14681(final List<String> list, final int n) {
        final Class4845 class4845 = new Class4845(this, "sub" + n, this.field20480 + 10, this.method14278() * (n + 1), 200, this.method14278(), list, 0);
        this.field20925.put(n, class4845);
        class4845.setEnabled(false);
        class4845.method14516(class4841 -> {
            this.method14694(n);
            this.method14696(false);
            this.method14517();
        });
        this.addToList(class4845);
    }
    
    public int method14682(final int n) {
        final Class4845 method14683 = this.method14683(n);
        if (method14683 == null) {
            return 0;
        }
        return method14683.field20759;
    }
    
    public Class4845 method14683(final int n) {
        for (final Map.Entry<Integer, V> entry : this.field20925.entrySet()) {
            if (entry.getKey() == n) {
                return (Class4845)entry.getValue();
            }
        }
        return null;
    }
    
    private void method14684() {
        this.method14250().clear();
        this.field20496 = ClientFonts.JelloLight18;
        final Class4868 class4868;
        this.addToList(class4868 = new Class4868(this, "dropdownButton", 0, 0, this.method14278(), this.method14278(), this.field20497));
        class4868.method14270((class4803, class4804) -> {
            class4803.method14273(0);
            class4803.method14275(0);
            class4803.method14277(this.method14276());
            class4803.method14279(this.method14278());
        });
        class4868.doThis((class4803, n) -> this.method14696(!this.method14695()));
        for (final String s : this.field20920) {
            final Class4868 class4869;
            this.addToList(class4869 = new Class4868(this, s, 0, this.method14278(), this.method14276(), this.method14278(), new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, -1381654, this.field20497.method19729(), this.field20497.method19729(), Class2056.field11734, Class2056.field11738), s, this.method14316()));
            class4869.method14603(10);
            class4869.doThis((class4803, n) -> {
                final int method14693 = this.method14693();
                this.method14694(this.field20920.indexOf(s));
                this.method14696(false);
                if (method14693 != this.method14693()) {
                    this.method14517();
                }
            });
        }
        this.field20924.changeDirection(Direction.FORWARDS);
        this.method14255(new Class6803(1));
    }
    
    private int method14685() {
        int a = this.method14686();
        for (final Map.Entry<K, Class4845> entry : this.field20925.entrySet()) {
            if (entry.getValue().method14296()) {
                a = Math.max(a, (entry.getValue().field20758.size() - 1) * entry.getValue().method14278() + entry.getValue().method14274());
            }
        }
        return a;
    }
    
    private int method14686() {
        float n = Class8468.method28270(this.field20924.calcPercent(), 0.0f, 1.0f, 1.0f);
        if (this.field20924.getDirection() != Direction.BACKWARDS) {
            n = Class7791.method25029(this.field20924.calcPercent(), 0.0f, 1.0f, 1.0f);
        }
        return (int)((this.method14278() * this.field20920.size() + 1) * n);
    }
    
    public int method14687() {
        return (int)(float)(this.method14278() * this.field20920.size() + 1);
    }
    
    private int method14688() {
        int max = 0;
        for (final Map.Entry<K, Class4845> entry : this.field20925.entrySet()) {
            if (entry.getValue().method14296()) {
                max = Math.max(max, entry.getValue().method14276() + entry.getValue().method14272() - this.method14276());
            }
        }
        return max;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (!this.method14236(n, n2)) {
            if (this.field20924.getDirection() == Direction.BACKWARDS) {
                this.method14696(false);
            }
        }
        final int n3 = (n2 - this.method14281()) / this.method14278() - 1;
        if (n3 >= 0) {
            if (n3 < this.field20920.size()) {
                if (this.field20924.getDirection() == Direction.BACKWARDS) {
                    if (this.field20924.calcPercent() == 1.0f) {
                        if (n - this.method14280() < this.method14276()) {
                            for (final Map.Entry<K, Class4845> entry : this.field20925.entrySet()) {
                                entry.getValue().setEnabled((int)entry.getKey() == n3);
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (!this.method14236(n, n2) || this.field20924.getDirection() == Direction.FORWARDS) {
            final Iterator<Map.Entry<Integer, Class4845>> iterator2 = this.field20925.entrySet().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().getValue().setEnabled(false);
            }
        }
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * this.field20924.calcPercent()));
        RenderUtil.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)(this.method14278() + this.method14686() - 1), 6.0f, n * 0.1f * this.field20924.calcPercent());
        RenderUtil.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)(this.method14278() + this.method14686() - 1), 20.0f, n * 0.2f * this.field20924.calcPercent());
        if (this.getTypedText() != null) {
            RenderUtil.method26865(this);
            String string = "";
            for (final Map.Entry<Integer, V> entry : this.field20925.entrySet()) {
                if (this.field20921 != entry.getKey()) {
                    continue;
                }
                string = " (" + ((Class4845)entry.getValue()).field20758.get(((Class4845)entry.getValue()).field20759) + ")";
            }
            RenderUtil.drawString(this.method14316(), (float)(this.method14272() + 10), (float)(this.method14274() + (this.method14278() - this.method14316().getHeight()) / 2 + 1), this.getTypedText() + string, ColorUtils.applyAlpha(this.field20497.method19729(), n * 0.7f));
            RenderUtil.endScissor();
        }
        final boolean b = this.field20924.calcPercent() < 1.0f;
        if (b) {
            RenderUtil.method26870(this.method14280(), this.method14281(), this.method14280() + this.method14276() + 140, this.method14281() + this.method14278() + this.method14685());
        }
        GL11.glPushMatrix();
        if (this.field20924.calcPercent() > 0.0f) {
            super.draw(n);
        }
        GL11.glPopMatrix();
        if (b) {
            RenderUtil.endScissor();
        }
        final int n2 = this.method14276() - (int)(this.method14278() / 2.0f + 0.5f);
        final int n3 = (int)(this.method14278() / 2.0f + 0.5f) + 1;
        final int n4 = (int)(this.method14278() / 6.0f + 0.5f);
        GL11.glTranslatef((float)(this.method14272() + n2), (float)(this.method14274() + n3), 0.0f);
        GL11.glRotatef(90.0f * this.field20924.calcPercent(), 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-this.method14272() - n2), (float)(-this.method14274() - n3), 0.0f);
        RenderUtil.drawString(this.field20496, (float)(this.method14272() + n2 - 6), (float)(this.method14274() + n3 - 14), ">", ColorUtils.applyAlpha(this.field20497.method19729(), n * 0.7f * (this.method14236(this.method14320(), this.method14321()) ? 1.0f : 0.5f)));
    }
    
    public List<String> method14689() {
        return this.field20920;
    }
    
    public void method14690(final String s, final int n) {
        this.method14689().add(n, s);
        this.method14684();
    }
    
    public void method14691(final String s) {
        this.method14690(s, this.field20920.size());
    }
    
    public <E extends Enum<E>> void method14692(final Class<E> clazz) {
        this.field20920.clear();
        for (final Enum<E> enum1 : clazz.getEnumConstants()) {
            this.method14690(enum1.toString().substring(0, 1).toUpperCase() + enum1.toString().substring(1).toLowerCase(), enum1.ordinal());
        }
    }
    
    public int method14693() {
        return this.field20921;
    }
    
    public void method14694(final int field20921) {
        this.field20921 = field20921;
    }
    
    public boolean method14695() {
        return this.field20922;
    }
    
    public void method14696(final boolean field20922) {
        this.field20922 = field20922;
        this.field20924.changeDirection(this.method14695() ? Direction.BACKWARDS : Direction.FORWARDS);
    }
    
    @Override
    public String getTypedText() {
        return (this.method14689().size() <= 0) ? null : this.method14689().get(this.method14693());
    }
    
    @Override
    public boolean method14236(int n, int n2) {
        for (final Map.Entry<K, Class4845> entry : this.field20925.entrySet()) {
            if (entry.getValue().method14296() && entry.getValue().method14236(n, n2)) {
                return true;
            }
        }
        n -= this.method14280();
        n2 -= this.method14281();
        if (n >= 0) {
            if (n <= this.method14276()) {
                if (n2 >= 0) {
                    return n2 <= this.method14278() + this.method14686();
                }
            }
        }
        return false;
    }
    
    static {
        field20919 = new ColorHelper(1250067, -15329770).method19734(ClientColors.DEEP_TEAL.color).method19738(Class2056.field11738);
    }
}
