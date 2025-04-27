// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class TabGUI extends Module
{
    public static final Animation field15637;
    public Animation field15638;
    private final Animation field15639;
    private final List<Category> field15640;
    private int field15641;
    private static List<Class8221> field15642;
    
    public TabGUI() {
        super(Category.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
        this.field15638 = new Animation(500, 0, Direction.FORWARDS);
        this.field15639 = new Animation(300, 300, Direction.FORWARDS);
        this.field15640 = new ArrayList<Category>();
        this.field15641 = 0;
    }
    
    @Override
    public void initialize() {
        this.field15640.add(Category.COMBAT);
        this.field15640.add(Category.PLAYER);
        this.field15640.add(Category.MOVEMENT);
        this.field15640.add(Category.RENDER);
        this.field15640.add(Category.WORLD);
        this.field15640.add(Category.MISC);
        final ArrayList list = new ArrayList();
        final Iterator<Category> iterator = this.field15640.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getName());
        }
        TabGUI.field15642.add(0, new Class8222(list, 0));
    }
    
    @EventListener
    private void method10063(final Class5752 class5752) {
        if (!this.isEnabled()) {
            return;
        }
        final Class2164 method10069 = method10069(class5752.method17061());
        if (method10069 == null) {
            return;
        }
        TabGUI.field15637.changeDirection(Direction.BACKWARDS);
        this.field15641 = 80;
        final int method10070 = this.method10076();
        final Class8221 class5753 = TabGUI.field15642.get(method10070 - 1);
        if (method10069 != Class2164.field12876 && ((!this.method10078() && method10069 != Class2164.field12874) || method10070 != 3)) {
            this.field15638 = new Animation(500, 200, Direction.FORWARDS);
        }
        switch (Class8971.field37805[method10069.ordinal()]) {
            case 1: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10077(false);
                    break;
                }
                if (method10070 > 1) {
                    if (TabGUI.field15642.get(TabGUI.field15642.size() - 1).method27237()) {
                        TabGUI.field15642.remove(TabGUI.field15642.size() - 1);
                    }
                    class5753.method27236();
                    break;
                }
                break;
            }
            case 2: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10064(true);
                    break;
                }
                if (class5753 instanceof Class8222) {
                    ((Class8222)class5753).method27245();
                    break;
                }
                break;
            }
            case 3: {
                if (method10070 == 3 && this.method10078()) {
                    this.method10064(false);
                    break;
                }
                if (class5753 instanceof Class8222) {
                    ((Class8222)class5753).method27244();
                    break;
                }
                break;
            }
            case 4: {
                if (method10070 == 1) {
                    this.method10071(this.field15640.get(((Class8222)class5753).field33778));
                    break;
                }
                if (method10070 == 2 && class5753 instanceof Class8222) {
                    this.method10072(Client.getInstance().moduleManager().getModulesByCategory(this.field15640.get(TabGUI.field15642.get(0).field33778)).get(((Class8222)class5753).field33778));
                    break;
                }
                if (method10070 == 3) {
                    this.method10077(true);
                    break;
                }
                break;
            }
            case 5: {
                if (method10070 == 2 && class5753 instanceof Class8222) {
                    final Module class5754 = Client.getInstance().moduleManager().getModulesByCategory(this.field15640.get(TabGUI.field15642.get(0).field33778)).get(((Class8222)class5753).field33778);
                    class5754.method9909(!class5754.isEnabled());
                    break;
                }
                break;
            }
        }
    }
    
    private void method10064(final boolean b) {
        final Class8222 class8222 = TabGUI.field15642.get(0);
        final Class8222 class8223 = TabGUI.field15642.get(1);
        final Class8222 class8224 = TabGUI.field15642.get(2);
        final Module class8225 = Client.getInstance().moduleManager().getModulesByCategory(this.field15640.get(class8222.field33778)).get(class8223.field33778);
        final Setting class8226 = this.method10075(class8225).get(class8224.field33778);
        if (!(class8226 instanceof StringSetting)) {
            if (!(class8226 instanceof BooleanSetting)) {
                if (class8226 instanceof NumberSetting) {
                    final NumberSetting class8227 = (NumberSetting)class8226;
                    if (class8227.method15198() instanceof Float) {
                        final Float n = (Float)class8227.method15198();
                        Float n2;
                        if (b) {
                            n2 = n - class8227.method15191();
                        }
                        else {
                            n2 = n + class8227.method15191();
                        }
                        class8227.method15199(Math.min(Math.max(n2, class8227.method15187()), class8227.method15189()));
                    }
                }
            }
            else {
                final BooleanSetting class8228 = (BooleanSetting)class8226;
                class8228.method15199(!class8228.method15208());
            }
        }
        else {
            final StringSetting class8229 = (StringSetting)class8226;
            int method15213 = class8229.method15213();
            if (!b) {
                --method15213;
            }
            else {
                ++method15213;
            }
            if (method15213 > class8229.method15215().size() - 1) {
                method15213 = 0;
            }
            if (method15213 < 0) {
                method15213 = class8229.method15215().size() - 1;
            }
            class8229.method15214(method15213);
        }
        class8224.method27242(this.method10074(class8225));
    }
    
    @EventListener
    private void method10065(final EventPlayerTick eventPlayerTick) {
        if (this.isEnabled()) {
            if (this.field15641 <= 0) {
                TabGUI.field15637.changeDirection(Direction.FORWARDS);
                this.field15638.changeDirection(Direction.FORWARDS);
            }
            else {
                --this.field15641;
            }
        }
    }
    
    @EventListener
    @HighestPriority
    private void method10066(final Class5740 class5740) {
        if (!this.isEnabled() || TabGUI.mc.player == null) {
            return;
        }
        if (Minecraft.getInstance().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.getInstance().gameSettings.field23464) {
            this.method10067();
            final Iterator<Class8221> iterator = TabGUI.field15642.iterator();
            while (iterator.hasNext()) {
                iterator.next().method27240((float)(0.5 + TabGUI.field15637.calcPercent() * 0.5));
            }
            this.method10068((float)(0.5 + TabGUI.field15637.calcPercent() * 0.5));
            RenderUtil.method26874(12.0f, 30.0f, 90.0f, 1.0f, ClientColors.LIGHT_GREYISH_BLUE.color);
        }
    }
    
    private void method10067() {
        if (TabGUI.field15642.size() >= 2) {
            final Class8222 class8222 = TabGUI.field15642.get(1);
            final Category class8223 = this.field15640.get(TabGUI.field15642.get(0).field33778);
            int n = 0;
            for (final Module class8224 : Client.getInstance().moduleManager().getModulesByCategory(class8223)) {
                class8222.method27241(n++, (class8224.isEnabled() ? "" : "§7") + class8224.getFormattedName());
            }
        }
    }
    
    private void method10068(final float n) {
        final int method10076 = this.method10076();
        if (method10076 == 2 || method10076 == 3) {
            final Class8222 class8222 = TabGUI.field15642.get(0);
            final Class8222 class8223 = TabGUI.field15642.get(1);
            final Class8222 class8224 = (method10076 != 3) ? null : TabGUI.field15642.get(2);
            Class8222 class8225 = class8223;
            if (class8224 != null) {
                class8225 = class8224;
            }
            if (class8225.method27246()) {
                if (TabGUI.field15637.getDirection() == Direction.BACKWARDS) {
                    if (this.method10076() == TabGUI.field15642.size()) {
                        this.field15638.changeDirection(Direction.BACKWARDS);
                    }
                    else if (TabGUI.field15642.get(TabGUI.field15642.size() - 1).method27238()) {
                        this.field15638.changeDirection(Direction.BACKWARDS);
                    }
                }
            }
            final Module class8226 = Client.getInstance().moduleManager().getModulesByCategory(this.field15640.get(class8222.field33778)).get(class8223.field33778);
            String s = class8226.getDesc();
            if (method10076 == 3) {
                s = this.method10075(class8226).get(class8224.field33778).method15205();
            }
            float method10077 = Class8468.method28270(this.field15639.calcPercent(), 0.0f, 1.0f, 1.0f) * TabGUI.field15637.calcPercent();
            if (this.field15639.getDirection() == Direction.FORWARDS) {
                method10077 = Class8468.method28269(this.field15639.calcPercent(), 0.0f, 1.0f, 1.0f);
            }
            final float n2 = class8225.method27234() + (float)class8225.method27233() + 14.0f * method10077;
            final float n3 = class8225.method27235() + 16.0f;
            class8225.getClass();
            RenderUtil.method26885(n2, n3 + 25 * class8225.field33778, 24.0f * method10077, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n * 0.6f), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n * 0.6f));
            final int n4 = class8225.method27234() + class8225.method27233() + 4 + Math.round(method10077 * 28.0f);
            final int method10078 = class8225.method27235();
            class8225.getClass();
            final int n5 = method10078 + 25 * class8225.field33778 + 4;
            final int n6 = class8225.field33770.getWidth(s) + 8;
            final float method10079 = Class8468.method28270(this.field15638.calcPercent(), 0.0f, 1.0f, 1.0f);
            final float n7 = (float)n4;
            final float n8 = (float)n5;
            final float n9 = n6 * method10079;
            class8225.getClass();
            RenderUtil.method26874(n7, n8, n9, 25.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n * 0.6f));
            final float n10 = (float)n4;
            final float n11 = (float)n5;
            final float n12 = n6 * method10079;
            class8225.getClass();
            RenderUtil.startScissor(n10, n11, n12, 25.0f);
            RenderUtil.drawString(class8225.field33770, (float)(n4 + 4), (float)(n5 + 2), s, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, Math.min(1.0f, n * 1.7f)));
            RenderUtil.endScissor();
        }
    }
    
    public static Class2164 method10069(final int n) {
        switch (n) {
            case 264: {
                return Class2164.field12878;
            }
            case 265: {
                return Class2164.field12877;
            }
            case 257: {
                return Class2164.field12876;
            }
            case 263: {
                return Class2164.field12875;
            }
            case 262: {
                return Class2164.field12874;
            }
            default: {
                return null;
            }
        }
    }
    
    public static int method10070(final int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 += TabGUI.field15642.get(i).method27233();
        }
        return 4 + n2 + 5 * n;
    }
    
    public void method10071(final Category class8013) {
        final ArrayList list = new ArrayList();
        final Iterator<Module> iterator = Client.getInstance().moduleManager().getModulesByCategory(class8013).iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getFormattedName());
        }
        this.method10073(1);
        TabGUI.field15642.add(1, new Class8222(list, 1));
    }
    
    public void method10072(final Module class3167) {
        final List<String> method10074 = this.method10074(class3167);
        if (method10074.size() != 0) {
            this.method10073(2);
            TabGUI.field15642.add(2, new Class8222(method10074, 2));
        }
    }
    
    public void method10073(final int n) {
        final Iterator<Class8221> iterator = TabGUI.field15642.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().field33771 < n) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Override
    public void onDisable() {
        TabGUI.field15637.changeDirection(Direction.FORWARDS);
        this.field15641 = 0;
    }
    
    @Override
    public void onEnable() {
        TabGUI.field15637.changeDirection(Direction.BACKWARDS);
        this.field15641 = 40;
    }
    
    public List<String> method10074(final Module class3167) {
        final ArrayList list = new ArrayList();
        for (final Setting class3168 : this.method10075(class3167)) {
            list.add(class3168.method15204() + " " + class3168.method15198());
        }
        return list;
    }
    
    public List<Setting> method10075(final Module class3167) {
        final ArrayList list = new ArrayList(class3167.getSettingMap().values());
        if (class3167 instanceof ModuleWithSettings) {
            final ModuleWithSettings class3168 = (ModuleWithSettings)class3167;
            class3168.method10258();
            if (class3168.method10260() != null) {
                list.addAll(class3168.method10260().getSettingMap().values());
            }
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((Setting)iterator.next()).method15204().equals("Keybind")) {
                continue;
            }
            iterator.remove();
        }
        return list;
    }
    
    private int method10076() {
        final Class8221 class8221 = TabGUI.field15642.get(TabGUI.field15642.size() - 1);
        int size = TabGUI.field15642.size();
        if (class8221.method27237()) {
            --size;
        }
        return size;
    }
    
    private void method10077(final boolean b) {
        this.field15639.changeDirection(b ? Direction.BACKWARDS : Direction.FORWARDS);
    }
    
    private boolean method10078() {
        return this.field15639.getDirection() == Direction.BACKWARDS;
    }
    
    static {
        field15637 = new Animation(200, 200, Direction.FORWARDS);
        TabGUI.field15642 = new ArrayList<Class8221>();
    }
}
