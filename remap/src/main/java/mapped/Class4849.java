// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Module;
import org.newdawn.slick.Texture;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Class4849 extends Panel
{
    public Animation field20774;
    public int field20775;
    public int field20776;
    public int field20777;
    public int field20778;
    public String field20779;
    public Class4817 field20780;
    public Class8799 field20781;
    public Texture field20782;
    public boolean field20783;
    private final List<Class7390> field20784;
    
    public Class4849(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20783 = false;
        this.field20784 = new ArrayList<Class7390>();
        this.field20777 = 500;
        this.field20778 = 600;
        this.field20776 = (n3 - this.field20777) / 2;
        this.field20775 = (n4 - this.field20778) / 2;
        final int n5 = 30;
        final TextField class4804;
        this.addToList(class4804 = new TextField(this, "search", this.field20776 + n5, this.field20775 + n5 + 50, this.field20777 - n5 * 2, 60, TextField.field20670, "", "Search..."));
        class4804.method14473(class4832 -> {
            this.field20779 = class4804.getTypedText();
            this.field20780.method14391(0);
        });
        class4804.method14251();
        this.addToList(this.field20780 = new Class4817(this, "mods", this.field20776 + n5, this.field20775 + n5 + 120, this.field20777 - n5 * 2, this.field20778 - n5 * 2 - 120));
        int n6 = 10;
        final Iterator<Map.Entry<Class<? extends Screen>, String>> iterator = ScreenManager.field37983.entrySet().iterator();
        while (iterator.hasNext()) {
            final Class8799 class4805 = new Class8799(iterator.next().getKey());
            final Class4868 class4806;
            this.field20780.addToList(class4806 = new Class4868(this.field20780, class4805.method30702(), 0, n6++ * 55, this.field20780.method14276(), 55, new ColorHelper(ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.02f), -986896).method19734(ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f)).method19736(Class2056.field11738), class4805.method30702()));
            class4806.doThis((class4869, n) -> {
                final Iterator<Map.Entry<Class<? extends Screen>, String>> iterator = ScreenManager.field37983.entrySet().iterator();
                while (iterator.hasNext()) {
                    final Class8799 field20781 = new Class8799(iterator.next().getKey());
                    if (field20781.method30702().equals(class4806.method14266()) && !this.field20783) {
                        this.field20781 = field20781;
                        this.field20783 = true;
                        break;
                    }
                }
            });
        }
        n6 += 50;
        for (final Module class4807 : Client.getInstance().moduleManager().getModuleMap().values()) {
            final Class4868 class4808;
            this.field20780.addToList(class4808 = new Class4868(this.field20780, class4807.getName(), 0, n6++ * 40, this.field20780.method14276(), 40, new ColorHelper(16777215, -986896).method19734(ClientColors.DEEP_TEAL.color).method19736(Class2056.field11734), new Class8799(class4807).method30702()));
            class4808.method14603(10);
            class4808.doThis((class4869, n) -> {
                for (final Module class4870 : Client.getInstance().moduleManager().getModuleMap().values()) {
                    if (class4870.getName().equals(class4808.getTypedText()) && !this.field20783) {
                        this.field20781 = new Class8799(class4870);
                        this.field20783 = true;
                        break;
                    }
                }
            });
        }
        this.field20774 = new Animation(200, 120);
        this.setListening(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        Label_0007: {
            if (this.method14309()) {
                if (n >= this.field20776) {
                    if (n2 >= this.field20775) {
                        if (n <= this.field20776 + this.field20777) {
                            if (n2 <= this.field20775 + this.field20778) {
                                break Label_0007;
                            }
                        }
                    }
                }
                this.field20783 = true;
            }
        }
        this.field20774.changeDirection(this.field20783 ? Direction.FORWARDS : Direction.BACKWARDS);
        final TreeMap treeMap = new TreeMap();
        final TreeMap treeMap2 = new TreeMap();
        final TreeMap treeMap3 = new TreeMap();
        final ArrayList list = new ArrayList();
        for (final CustomGuiScreen customGuiScreen : this.field20780.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    if (!(class4804 instanceof Class4868)) {
                        continue;
                    }
                    final Class4868 class4805 = (Class4868)class4804;
                    final boolean b = class4805.method14278() != 40;
                    Label_0279: {
                        if (b) {
                            if (this.field20779 != null) {
                                if (this.field20779 == null) {
                                    break Label_0279;
                                }
                                if (this.field20779.length() != 0) {
                                    break Label_0279;
                                }
                            }
                            treeMap.put(class4805.getTypedText(), class4805);
                            continue;
                        }
                    }
                    if (!b && this.method14542(this.field20779, class4805.getTypedText())) {
                        treeMap2.put(class4805.getTypedText(), class4805);
                    }
                    else if (!b && this.method14541(this.field20779, class4805.getTypedText())) {
                        treeMap3.put(class4805.getTypedText(), class4805);
                    }
                    else {
                        list.add(class4805);
                    }
                }
            }
        }
        int n3 = (treeMap.size() <= 0) ? 0 : 10;
        for (final Class4868 class4806 : treeMap.values()) {
            class4806.setEnabled(true);
            class4806.method14275(n3);
            n3 += class4806.method14278();
        }
        if (treeMap.size() > 0) {
            n3 += 10;
        }
        for (final Class4868 class4807 : treeMap2.values()) {
            class4807.setEnabled(true);
            class4807.method14275(n3);
            n3 += class4807.method14278();
        }
        for (final Class4868 class4808 : treeMap3.values()) {
            class4808.setEnabled(true);
            class4808.method14275(n3);
            n3 += class4808.method14278();
        }
        final Iterator iterator6 = list.iterator();
        while (iterator6.hasNext()) {
            ((Class4868)iterator6.next()).setEnabled(false);
        }
        super.method14200(n, n2);
    }
    
    private boolean method14541(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().contains(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    private boolean method14542(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().startsWith(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    @Override
    public void draw(float method35858) {
        method35858 = this.field20774.calcPercent();
        float n = Class7707.method24584(method35858, 0.0f, 1.0f, 1.0f);
        if (this.field20783) {
            n = Class7791.method25030(method35858, 0.0f, 1.0f, 1.0f);
        }
        this.method14288(0.8f + n * 0.2f, 0.8f + n * 0.2f);
        if (method35858 == 0.0f) {
            if (this.field20783) {
                this.method14544(this.field20781);
            }
        }
        RenderUtil.method26876((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f * method35858));
        super.method14227();
        RenderUtil.method26925((float)this.field20776, (float)this.field20775, (float)this.field20777, (float)this.field20778, 10.0f, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method35858));
        final int n2 = 30;
        RenderUtil.drawString(ClientFonts.JelloLight36, (float)(n2 + this.field20776), (float)(n2 + this.field20775), "Select mod to bind", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, method35858 * 0.7f));
        super.draw(method35858);
    }
    
    public final void method14543(final Class7390 class7390) {
        this.field20784.add(class7390);
    }
    
    public final void method14544(final Class8799 class8799) {
        final Iterator<Class7390> iterator = this.field20784.iterator();
        while (iterator.hasNext()) {
            iterator.next().method22693(this, class8799);
        }
    }
}
