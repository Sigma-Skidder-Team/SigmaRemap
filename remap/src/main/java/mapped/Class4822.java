// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.settings.impl.ButtonSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;
import slick2d.TrueTypeFont;

import java.util.Iterator;
import java.util.HashMap;

public class Class4822 extends Class4817
{
    private Module field20634;
    public TrueTypeFont field20496;
    public Animation field20635;
    public HashMap<Module, CustomGuiScreen> field20636;
    
    public Class4822(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Module field20634) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20496 = Class9493.field40807;
        this.field20635 = new Animation(150, 150);
        this.field20636 = new HashMap<Module, CustomGuiScreen>();
        this.field20634 = field20634;
        this.setListening(false);
        this.method14390();
    }
    
    private int method14434(final CustomGuiScreen customGuiScreen, final Setting class4804, final int n, int n2, final int n3) {
        final Class4834 class4805 = new Class4834(customGuiScreen, class4804.method15204() + "lbl", n, n2, 0, 0, Class4834.field20719, class4804.method15204(), this.field20496);
        final Class4852 class4806 = new Class4852(customGuiScreen, class4804.method15204() + "desc", n + 195, n2 + 4, 330, 18, class4804);
        customGuiScreen.addToList(class4805);
        customGuiScreen.addToList(class4806);
        switch (Class8559.field35939[class4804.method15197().ordinal()]) {
            case 1: {
                final Class4864 class4807 = new Class4864(customGuiScreen, class4804.method15204() + "checkbox", n + 135, n2 + 4, 40, 18);
                class4807.method14590((Boolean)(Object)class4804.method15198(), false);
                class4804.method15195(class4865 -> {
                    if (class4807.method14588() != class4865.method15198()) {
                        class4807.method14590(class4865.method15198(), false);
                    }
                });
                class4807.method14516(class4998 -> class4804.method15199(((Class4864)class4998).method14588()));
                customGuiScreen.addToList(class4807);
                n2 += 18 + n3;
                break;
            }
            case 2: {
                final NumberSetting class4808 = (NumberSetting)class4804;
                final Class4848 class4809 = new Class4848(customGuiScreen, class4804.method15204() + "slider", n, n2 + 31, 240, 4);
                class4809.setTypedText(Float.toString((float)class4804.method15198()));
                class4805.setTypedText(class4804.method15204() + ": " + Float.toString(class4804.method15198()));
                class4809.method14540(Class4892.method14671(class4808.method15187(), class4808.method15189(), (float)class4808.method15198()), false);
                final int method15185 = class4808.method15185();
                class4808.method15195(class4852 -> {
                    if (Class4848.method14535(class4809.method14538(), class4808.method15187(), class4808.method15189(), class4808.method15191(), method15185) != class4852.method15198()) {
                        class4809.setTypedText(Float.toString(class4852.method15198()));
                        class4809.method14540(Class4848.method14534(class4808.method15187(), class4808.method15189(), class4852.method15198()), false);
                        class4805.setTypedText(class4804.method15204() + ": " + Float.toString(class4804.method15198()));
                    }
                });
                class4809.method14516(class5000 -> {
                    final float method14535 = Class4848.method14535(((Class4848)class5000).method14538(), class4808.method15187(), class4808.method15189(), class4808.method15191(), method15185);
                    if (method14535 != class4804.method15198()) {
                        class4809.setTypedText(Float.toString(method14535));
                        class4804.method15199(method14535);
                    }
                    class4805.setTypedText(class4804.method15204() + ": " + Float.toString(class4804.method15198()));
                });
                customGuiScreen.addToList(class4809);
                n2 += 54;
                break;
            }
            case 3: {
                final int n4 = 114;
                final int n5 = 27;
                final Class4832 class4810;
                this.addToList(class4810 = new Class4832(customGuiScreen, class4804.method15204() + "txt", n, n2 + 27, n4, n5, TextField.field20670, (String)class4804.method15198(), class4804.method15204(), ClientFonts.Default));
                class4810.setFont(ClientFonts.JelloLight18);
                class4810.method14473(class4998 -> class4804.method15199(class4998.getTypedText()));
                class4804.method15195(class4833 -> {
                    if (class4810.getTypedText() != ((TextInputSetting)class4804).method15198()) {
                        class4810.setTypedText(((TextInputSetting)class4804).method15198());
                    }
                });
                n2 += n5 + n3;
                break;
            }
            case 4: {
                final Class4890 class4811 = new Class4890(customGuiScreen, class4804.method15204() + "btn", n, n2 + 27, 80, 20, ((StringSetting)class4804).method15215(), ((StringSetting)class4804).method15213());
                class4804.method15195(class4892 -> {
                    if (class4811.method14654() != ((StringSetting)class4804).method15213()) {
                        class4811.method14655(((StringSetting)class4804).method15213());
                    }
                });
                class4811.method14516(class4998 -> ((StringSetting)class4804).method15214(((Class4890)class4998).method14654()));
                customGuiScreen.addToList(class4811);
                n2 += 65;
                break;
            }
            case 5: {
                final Class4875 class4812 = new Class4875(customGuiScreen, class4804.method15204() + "btn", customGuiScreen.method14276() - n3, n2 + 6, 123, 27, ((ButtonSetting)class4804).method15223(), (Integer)(Object)class4804.method15198());
                class4804.method15195(class4876 -> {
                    if (class4812.method14610() != class4876.method15198()) {
                        class4812.method14612(class4876.method15198(), false);
                    }
                });
                class4812.method14516(class4998 -> class4804.method15199(((Class4875)class4998).method14610()));
                class4812.method14270((class4804, class4805) -> class4804.method14273(customGuiScreen.method14276() - 123 - n3));
                customGuiScreen.addToList(class4812);
                n2 += 27 + n3;
            }
            case 6: {}
        }
        return n2 - (n3 - 10);
    }
    
    private void method14390() {
        this.addToList(new Class4834(this, "settingsname", 12, 2, this.field20480, 20, Class4834.field20719, this.field20634.getFormattedName() + " Settings", this.field20496));
        int method14434 = 35;
        final Iterator<Setting> iterator = this.field20634.method9899().values().iterator();
        while (iterator.hasNext()) {
            method14434 = this.method14434(this, iterator.next(), 30, method14434, 20);
        }
        if (this.field20634 instanceof ModuleWithSettings) {
            final ModuleWithSettings class3247 = (ModuleWithSettings)this.field20634;
            for (final Module key : class3247.field15742) {
                int method14435 = 10;
                final CustomGuiScreen value = new CustomGuiScreen(this, key.getName() + "SubView", 0, method14434, this.field20480, this.field20481 - method14434);
                value.method14270((class4803, class4804) -> class4803.method14277(class4804.method14276()));
                final Iterator<Setting> iterator2 = key.method9899().values().iterator();
                while (iterator2.hasNext()) {
                    method14435 = this.method14434(value, iterator2.next(), 30, method14435, 20);
                }
                this.addToList(value);
                this.field20636.put(key, value);
            }
            class3247.method10261((class3247, key, b) -> this.field20636.get(key).setEnabled(b));
            class3247.method10258();
        }
        this.addToList(new Class4834(this, "lbl", 5, 200, 0, 33, Class4834.field20719, this.field20495));
    }
    
    public void method14435() {
        this.field20635.changeDirection(Direction.FORWARDS);
    }
    
    public boolean method14436() {
        return this.field20635.getDirection() == Direction.FORWARDS && this.field20635.calcPercent() == 0.0f;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        int n2 = Math.round(this.method14278() * Class8468.method28270(this.field20635.calcPercent(), 0.0f, 1.0f, 1.0f));
        if (this.field20635.getDirection() == Direction.FORWARDS) {
            n2 = Math.round(this.method14278() * Class8468.method28269(this.field20635.calcPercent(), 0.0f, 1.0f, 1.0f));
        }
        RenderUtil.startScissor((float)this.x, (float)(70 + this.method14278() - n2), (float)this.method14276(), (float)n2);
        RenderUtil.method26874((float)this.x, (float)(70 + this.method14278() - n2), (float)this.method14276(), (float)n2, -2631721);
        super.draw(n);
        RenderUtil.endScissor();
    }
}
