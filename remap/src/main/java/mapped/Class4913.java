// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.newdawn.slick.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class Class4913 extends Class4825
{
    public static ColorHelper field21015;
    private int field21016;
    private int field21017;
    private int field21018;
    
    public Class4913(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, Class4913.field21015, s2, false);
        this.field21016 = this.field20495.length();
    }
    
    @Override
    public void draw(final float n) {
        if (this.field20495 != null) {
            RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)this.field20480, (float)this.field20481, -14144460);
            RenderUtil.method26914((float)this.method14272(), (float)this.method14274(), (float)this.field20480, (float)(this.field20481 - this.method14274()), 114.0f, n);
            final int n2 = 30;
            final TrueTypeFont field40312 = ClientFonts.JelloLight18;
            final String property = System.getProperty("line.separator");
            final String[] split = this.field20495.split("(?<=" + property + ")");
            int field40313 = this.field21016;
            int n3 = -1;
            float n4 = (float)field40312.getWidth(this.field20495.substring(0, this.field21016));
            int i = 0;
        Label_0295_Outer:
            while (i < split.length) {
                final List<String> method14753 = this.method14753(split[i]);
                int n5 = 0;
                for (final String s : method14753) {
                    RenderUtil.drawString(field40312, (float)(this.method14272() + n5 + n2), (float)(this.method14274() + n2 + i * field40312.getHeight()), s, ColorUtils.applyAlpha(this.method14754(s), n));
                    n5 += field40312.getWidth(s);
                    field40313 -= s.length();
                }
                while (true) {
                    Label_0405: {
                        if (field40313 < 0 && n3 == -1) {
                            break Label_0405;
                        }
                        if (this.field21016 == this.field20495.length()) {
                            if (field40313 == 0) {
                                if (!this.field20495.endsWith(property)) {
                                    break Label_0405;
                                }
                            }
                        }
                        if (n3 == -1) {
                            n4 -= n5;
                        }
                        if (this.field21016 == this.field20495.length()) {
                            if (field40313 == 0) {
                                if (this.field20495.endsWith(property)) {
                                    n3 = i + 1;
                                }
                            }
                        }
                        ++i;
                        continue Label_0295_Outer;
                    }
                    n3 = i;
                    continue;
                }
            }
            RenderUtil.method26876(n2 + n4, (float)(this.method14274() + n2 + n3 * field40312.getHeight()), n2 + n4 + 1.0f, (float)(this.method14274() + n2 + field40312.getHeight(this.field20495) + n3 * field40312.getHeight()), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
            super.draw(n);
        }
    }
    
    public List<String> method14753(final String s) {
        System.getProperty("line.separator");
        final String[] split = s.split("(?<=[^a-zA-Z0-9'])");
        final ArrayList list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (final String str : split) {
            if (this.method14754(str) == ClientColors.LIGHT_GREYISH_BLUE.color) {
                sb.append(str);
            }
            else {
                list.add(sb.toString());
                list.add(str);
                sb = new StringBuilder();
            }
        }
        list.add(sb.toString());
        return list;
    }
    
    public int method14754(final String s) {
        if (s.startsWith("var") && s.endsWith(" ")) {
            return -4363603;
        }
        if (s.startsWith("function") && s.endsWith(" ")) {
            return -4363603;
        }
        if (s.endsWith(".")) {
            return -10442018;
        }
        if (s.startsWith("if")) {
            return ClientColors.LIGHT_GREYISH_BLUE.color;
        }
        if (s.endsWith("(")) {
            return -2774170;
        }
        if (!s.startsWith(")")) {
            return ClientColors.LIGHT_GREYISH_BLUE.color;
        }
        return -2774170;
    }
    
    @Override
    public void method14232(final char c) {
        super.method14232(c);
        if (this.method14306()) {
            if (Class9274.method34208(c)) {
                if (ClientFonts.JelloLight18.getWidth(Character.toString(c)) > 1) {
                    this.field20495 = Class9274.method34214(this.field20495, Character.toString(c), this.field21016);
                    ++this.field21016;
                }
            }
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        System.getProperty("line.separator");
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            final String property = System.getProperty("line.separator");
            final String[] split = this.field20495.split("(?<=" + property + ")");
            int n3 = (n2 - this.method14281() - ClientFonts.JelloLight18.getHeight() / 2) / ClientFonts.JelloLight18.getHeight() - 1;
            if (n3 > split.length - 1) {
                n3 = split.length - 1;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            int n4 = 0;
            for (int i = 0; i < n3; ++i) {
                n4 += split[i].length();
            }
            this.field21016 = n4 + Class9274.method34216(split[n3], ClientFonts.JelloLight18, (float)this.method14280(), n, 30.0f);
            if (this.field20495.substring(0, this.field21016).endsWith(property)) {
                if (this.field21016 != this.field20495.length()) {
                    --this.field21016;
                }
            }
            this.field21016 = Math.min(Math.max(0, this.field21016), this.field20495.length());
            this.field21018 = this.field21016;
        }
    }
    
    public boolean method14755() {
        return false;
    }
    
    static {
        Class4913.field21015 = new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, Class2056.field11734, Class2056.field11738);
    }
}
