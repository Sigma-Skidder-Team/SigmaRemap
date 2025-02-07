// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.settings.impl.*;
import com.mentalfrostbyte.jello.settings.Setting;
import org.lwjgl.opengl.GL11;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

public class Class4819 extends Class4817 implements Class4820
{
    private Module field20620;
    private boolean field20621;
    private boolean field20622;
    public int field20623;
    private HashMap<Class4834, Setting> field20624;
    public HashMap<Module, CustomGuiScreen> field20625;
    public Animation field20626;
    private String field20627;
    private String field20628;
    
    public Class4819(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Module field20620) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20623 = 200;
        this.field20624 = new HashMap<Class4834, Setting>();
        this.field20625 = new HashMap<Module, CustomGuiScreen>();
        this.field20626 = new Animation(114, 114);
        this.field20627 = "";
        this.field20628 = "";
        this.field20620 = field20620;
        this.setListening(false);
        this.method14390();
    }
    
    private int method14402(final CustomGuiScreen customGuiScreen, final Setting class4804, final int n, int n2, final int n3) {
        switch (Class9155.field38793[class4804.method15197().ordinal()]) {
            case 1: {
                final Class4834 key = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 24, Class4834.field20719, class4804.method15204());
                final Class4867 class4805 = new Class4867(customGuiScreen, class4804.method15204() + "checkbox", customGuiScreen.method14276() - 24 - n3, n2 + 6, 24, 24);
                this.field20624.put(key, class4804);
                class4805.method14602(class4804.method15198(), false);
                class4804.method15195(class4868 -> {
                    if (class4805.method14600() != class4868.method15198()) {
                        class4805.method14602(class4868.method15198(), false);
                    }
                });
                class4805.method14516(class4998 -> class4804.method15199(((Class4867)class4998).method14600()));
                class4805.method14270((class4803, class4804) -> class4803.method14273(class4804.method14276() - 24 - n3));
                customGuiScreen.addToList(key);
                customGuiScreen.addToList(class4805);
                n2 += 24 + n3;
                break;
            }
            case 2: {
                final Class4834 key2 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 24, Class4834.field20719, class4804.method15204());
                this.field20624.put(key2, class4804);
                final NumberSetting class4806 = (NumberSetting)class4804;
                final Class4892 class4807 = new Class4892(customGuiScreen, class4804.method15204() + "slider", customGuiScreen.method14276() - 126 - n3, n2 + 6, 126, 24);
                class4807.method14674().setFont(ClientFonts.JelloLight14);
                class4807.method14315(Float.toString((float)class4804.method15198()));
                class4807.method14677(Class4892.method14671(class4806.method15187(), class4806.method15189(), (float)class4806.method15198()), false);
                class4807.method14680(-1.0f);
                final int method15185 = class4806.method15185();
                class4806.method15195(class4894 -> {
                    if (Class4892.method14672(class4807.method14675(), class4806.method15187(), class4806.method15189(), class4806.method15191(), method15185) != class4894.method15198()) {
                        class4807.method14315(Float.toString(class4894.method15198()));
                        class4807.method14677(Class4892.method14671(class4806.method15187(), class4806.method15189(), class4894.method15198()), false);
                    }
                });
                class4807.method14516(class4999 -> {
                    final float method14672 = Class4892.method14672(((Class4892)class4999).method14675(), class4806.method15187(), class4806.method15189(), class4806.method15191(), method15185);
                    if (method14672 != class4804.method15198()) {
                        class4807.method14315(Float.toString(method14672));
                        class4804.method15199(method14672);
                    }
                });
                class4807.method14270((class4803, class4804) -> class4803.method14273(class4804.method14276() - 126 - n3));
                customGuiScreen.addToList(key2);
                customGuiScreen.addToList(class4807);
                n2 += 24 + n3;
                break;
            }
            case 3: {
                final int n4 = 114;
                final int n5 = 27;
                final Class4834 key3;
                this.addToList(key3 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, n5, Class4834.field20719, class4804.method15204()));
                this.field20624.put(key3, class4804);
                final TextField class4808;
                this.addToList(class4808 = new TextField(customGuiScreen, class4804.method15204() + "txt", customGuiScreen.method14276() - n3 - n4, n2 + n5 / 4 - 1, n4, n5, TextField.field20670, (String)class4804.method15198()));
                class4808.setFont(ClientFonts.JelloLight18);
                class4808.method14473(class4998 -> class4804.method15199(class4998.getTypedText()));
                class4804.method15195(class4833 -> {
                    if (class4808.getTypedText() != ((TextInputSetting)class4804).method15198()) {
                        class4808.method14315(((TextInputSetting)class4804).method15198());
                    }
                });
                n2 += n5 + n3;
                break;
            }
            case 4: {
                final Class4834 key4 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2 + 2, this.field20623, 27, Class4834.field20719, class4804.method15204());
                final Class4894 class4809 = new Class4894(customGuiScreen, class4804.method15204() + "btn", customGuiScreen.method14276() - n3, n2 + 6 - 1, 123, 27, ((StringSetting)class4804).method15215(), ((StringSetting)class4804).method15213());
                this.field20624.put(key4, class4804);
                class4804.method15195(class4896 -> {
                    if (class4809.method14693() != ((StringSetting)class4804).method15213()) {
                        class4809.method14694(((StringSetting)class4804).method15213());
                    }
                });
                class4809.method14516(class4999 -> {
                    ((StringSetting)class4804).method15214(((Class4894)class4999).method14693());
                    class4809.method14694(((StringSetting)class4804).method15213());
                });
                class4809.method14270((class4804, class4805) -> class4804.method14273(customGuiScreen.method14276() - 123 - n3));
                customGuiScreen.addToList(key4);
                customGuiScreen.addToList(class4809);
                n2 += 27 + n3;
            }
            case 6: {
                final CustomGuiScreen class4810 = new CustomGuiScreen(customGuiScreen, class4804.method15204() + "view", n, n2, customGuiScreen.method14276(), 0);
                int method15186 = 0;
                final Iterator<Setting> iterator = (Iterator<Setting>)((SubOptionSettingExtender)class4804).method15224().iterator();
                while (iterator.hasNext()) {
                    method15186 = this.method14402(class4810, iterator.next(), 0, method15186, n3);
                }
                new Class6509().method19597(class4810, customGuiScreen);
                class4810.method14270((class4803, class4804) -> class4803.method14277(class4804.method14276() - n3));
                customGuiScreen.addToList(class4810);
                n2 += class4810.method14278() + n3;
                break;
            }
            case 7: {
                final Class4834 key5 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 27, Class4834.field20719, class4804.method15204());
                final Class4875 class4811 = new Class4875(customGuiScreen, class4804.method15204() + "btn", customGuiScreen.method14276() - n3, n2 + 6, 123, 27, ((ButtonSetting)class4804).method15223(), class4804.method15198());
                this.field20624.put(key5, class4804);
                class4804.method15195(class4876 -> {
                    if (class4811.method14610() != class4876.method15198()) {
                        class4811.method14612(class4876.method15198(), false);
                    }
                });
                class4811.method14516(class4998 -> class4804.method15199(((Class4875)class4998).method14610()));
                class4811.method14270((class4804, class4805) -> class4804.method14273(customGuiScreen.method14276() - 123 - n3));
                customGuiScreen.addToList(key5);
                customGuiScreen.addToList(class4811);
                n2 += 27 + n3;
                break;
            }
            case 8: {
                final Class4834 key6 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 200, Class4834.field20719, class4804.method15204());
                final Class4854 class4812 = new Class4854(customGuiScreen, class4804.method15204() + "picker", customGuiScreen.method14276() - n3, n2 + 5, 175, 200, ((StringListSetting)class4804).method15209(), (String[])((Setting<List>)class4804).method15198().toArray(new String[0]));
                this.field20624.put(key6, class4804);
                class4812.method14516(class4999 -> class4804.method15199(class4812.method14563()));
                class4812.method14270((class4804, class4805) -> class4804.method14273(customGuiScreen.method14276() - 175 - n3));
                customGuiScreen.addToList(key6);
                customGuiScreen.addToList(class4812);
                n2 += 200 + n3;
                break;
            }
            case 9: {
                final ColorSetting class4813 = (ColorSetting)class4804;
                final Class4834 key7 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 24, Class4834.field20719, class4804.method15204());
                final Class4885 class4814 = new Class4885(customGuiScreen, class4804.method15204() + "color", customGuiScreen.method14276() - 160 - n3 + 10, n2, 160, 114, class4804.method15198(), class4813.method15219());
                this.field20624.put(key7, class4804);
                class4804.method15195(class4888 -> {
                    class4814.method14622(class4804.method15198());
                    class4814.method14620(class4813.method15219());
                });
                class4814.method14516(class4999 -> {
                    class4804.method15200(((Class4885)class4999).method14623(), false);
                    class4813.method15220(((Class4885)class4999).method14621());
                });
                customGuiScreen.addToList(key7);
                customGuiScreen.addToList(class4814);
                n2 += 114 + n3 - 10;
                break;
            }
            case 10: {
                final Class8531 class4815 = class4804.method15198();
                final Class4834 key8 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, this.field20623, 24, Class4834.field20719, class4804.method15204());
                final Class4855 class4816 = new Class4855(customGuiScreen, class4804.method15204() + "color", customGuiScreen.method14276() - 150 - n3 + 10, n2, 150, 150, 20, class4815.field35807, class4815.field35808, class4815.field35809, class4815.field35810);
                this.field20624.put(key8, class4804);
                class4804.method15195(class4999 -> {
                    final Class8531 class5000 = class4804.method15198();
                    class4816.method14568(class5000.field35807, class5000.field35808, class5000.field35809, class5000.field35810);
                });
                class4816.method14516(class4999 -> ((BezierSetting)class4804).method15216(class4816.method14567()[0], class4816.method14567()[1], class4816.method14567()[2], class4816.method14567()[3]));
                customGuiScreen.addToList(key8);
                customGuiScreen.addToList(class4816);
                n2 += 150 + n3 - 10;
                break;
            }
        }
        return n2 - (n3 - 10);
    }
    
    private void method14390() {
        int b = 20;
        final Iterator<Setting> iterator = this.field20620.method9899().values().iterator();
        while (iterator.hasNext()) {
            b = this.method14402(this, iterator.next(), 20, b, 20);
        }
        final int n = b;
        if (this.field20620 instanceof ModuleWithSettings) {
            final ModuleWithSettings class3247 = (ModuleWithSettings)this.field20620;
            for (final Module key : class3247.field15742) {
                int a = 0;
                final CustomGuiScreen value = new CustomGuiScreen(this, key.getName() + "SubView", 0, n, this.field20480, this.field20481 - b);
                value.method14270((class4803, class4804) -> class4803.method14277(class4804.method14276()));
                final Iterator<Setting> iterator2 = key.method9899().values().iterator();
                while (iterator2.hasNext()) {
                    a = this.method14402(value, iterator2.next(), 20, a, 20);
                }
                b = Math.max(b + a, b);
                for (final CustomGuiScreen class3248 : value.method14250()) {
                    if (!(class3248 instanceof Class4894)) {
                        continue;
                    }
                    final Class4894 class3249 = (Class4894)class3248;
                    a = Math.max(a, class3249.method14687() + class3249.method14274() + class3249.method14278() + 14);
                }
                value.method14279(a);
                this.addToList(value);
                this.field20625.put(key, value);
            }
            class3247.method10261((class3247, key, b) -> this.field20625.get(key).setEnabled(b));
            class3247.method10258();
        }
        this.addToList(new CustomGuiScreen(this, "extentionhack", 0, b, 0, 20));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        boolean b = false;
        for (final Map.Entry<Class4834, V> entry : this.field20624.entrySet()) {
            final Class4834 class4834 = entry.getKey();
            final Setting class4835 = (Setting)entry.getValue();
            if (class4834.method14308() && class4834.method14298()) {
                b = true;
                this.field20627 = class4835.method15205();
                this.field20628 = class4835.method15204();
                break;
            }
        }
        GL11.glPushMatrix();
        super.draw(n);
        GL11.glPopMatrix();
        this.field20626.changeDirection((!b) ? Direction.FORWARDS : Direction.BACKWARDS);
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + 10), (float)(this.method14274() + this.method14278() + 24), this.field20628, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f * this.field20626.calcPercent()));
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + 11), (float)(this.method14274() + this.method14278() + 24), this.field20628, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f * this.field20626.calcPercent()));
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + 14 + ClientFonts.JelloLight14.getWidth(this.field20628) + 2), (float)(this.method14274() + this.method14278() + 24), this.field20627, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f * this.field20626.calcPercent()));
    }
    
    @Override
    public boolean method14403() {
        return this.field20621;
    }
    
    @Override
    public void method14404() {
        this.field20621 = true;
    }
    
    @Override
    public boolean method14405() {
        return this.field20622;
    }
    
    @Override
    public void method14406(final boolean b) {
        if (b != this.method14405()) {
            this.method14404();
        }
    }
}
