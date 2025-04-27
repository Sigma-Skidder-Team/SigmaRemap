// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class InvManager extends PremiumModule
{
    public static int field16013;
    public static int field16014;
    public static int field16015;
    public static int field16016;
    private final TimerUtil field16017;
    private boolean field16018;
    private boolean field16019;
    public ArrayList<Integer> field16020;
    
    public InvManager() {
        super("InvManager", "Drops all useless items from your inventory", Category.ITEM);
        this.field16017 = new TimerUtil();
        this.field16020 = new ArrayList<Integer>();
        this.addSetting(new StringSetting("Mode", "Mode", 0, "Basic", "OpenInv", "FakeInv"));
        this.addSetting(new NumberSetting("Delay", "Inventory clicks delay", 0.3f, Float.class, 0.01f, 1.0f, 0.01f));
        this.addSetting(new NumberSetting("Block Cap", "Maximum blocks.", 150.0f, Float.class, 0.0f, 256.0f, 10.0f));
        this.addSetting(new StringSetting("Clean Type", "Clean type", 0, "Skywars", "All"));
        this.addSetting(new BooleanSetting("Fake Items", "Bypass for fake items (AAC).", false));
        this.addSetting(new BooleanSetting("Cleaner", "Cleans your inventory.", true));
        this.addSetting(new BooleanSetting("Sword", "Keeps only sword as weapon.", true));
        this.addSetting(new StringSetting("Tools", "How tools are handled.", 0, "Keep", "Organize", "Throw"));
        this.addSetting(new BooleanSetting("Archery", "Cleans bows and arrows.", true));
        this.addSetting(new BooleanSetting("Food", "Cleans food. Keeps Golden Apples.", false));
        this.addSetting(new BooleanSetting("Heads", "Cleans Heads.", false));
        this.addSetting(new BooleanSetting("Auto Shield", "Automatically equip shields for 1.9+.", false));
    }
    
    @Override
    public void onEnable() {
        this.field16018 = (InvManager.mc.currentScreen instanceof Class518);
        this.field16019 = false;
    }
    
    @EventListener
    public void method10666(final EventPlayerTickI eventPlayerTick) {
        if (!this.field16017.isRunning()) {
            this.field16017.start();
        }
        if (!this.isEnabled() || AutoArmor.field15966) {
            return;
        }
        final String method9887 = this.getStringSettingValueByName("Mode");
        if (this.getStringSettingValueByName("Mode").equals("OpenInv") && !(InvManager.mc.currentScreen instanceof Class518)) {
            return;
        }
        final long n = (long)(this.getNumberSettingValueByName("Delay") * 1000.0f);
        if (InvManager.mc.currentScreen instanceof Class518) {
            this.field16018 = false;
        }
        if (this.field16019 && this.field16017.getElapsedTime() >= n) {
            this.field16019 = !this.field16019;
            this.method10682(this.field16018);
            InvManagerUtil.method29367(InvManager.mc.player.container.field16154, 45, 0, Class2133.field12437, InvManager.mc.player, true);
            this.field16017.reset();
            return;
        }
        Label_0189: {
            if (InvManager.mc.currentScreen != null) {
                if (!(InvManager.mc.currentScreen instanceof Class518)) {
                    if (!(InvManager.mc.currentScreen instanceof ChatScreen)) {
                        break Label_0189;
                    }
                }
            }
            if (this.field16017.getElapsedTime() > n) {
                if (InvManager.field16013 >= 36) {
                    if (InvManager.mc.player.container.getSlot(InvManager.field16013).method20054()) {
                        if (!method10667(InvManager.mc.player.container.getSlot(InvManager.field16013).method20053())) {
                            this.method10668(InvManager.field16013, method9887.equals("FakeInv"));
                        }
                    }
                    else {
                        this.method10668(InvManager.field16013, method9887.equals("FakeInv"));
                    }
                }
            }
            final boolean equals = this.getStringSettingValueByName("Tools").equals("Organize");
            if (this.field16017.getElapsedTime() >= n) {
                if (InvManager.field16014 >= 36) {
                    if (equals) {
                        this.method10674(InvManager.field16014, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.getElapsedTime() >= n) {
                if (InvManager.field16016 >= 36) {
                    if (equals) {
                        this.method10675(InvManager.field16016, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.getElapsedTime() >= n) {
                if (InvManager.field16015 >= 36) {
                    if (equals) {
                        this.method10676(InvManager.field16015, method9887.equals("FakeInv"));
                    }
                }
            }
            if (this.field16017.getElapsedTime() >= n) {
                if (this.getBooleanValueFromSettingName("Auto Shield")) {
                    this.method10677(method9887.equals("FakeInv"));
                }
            }
            if (this.field16017.getElapsedTime() >= n) {
                if (this.getBooleanValueFromSettingName("Cleaner")) {
                    for (int i = 9; i < 45; ++i) {
                        if (InvManager.mc.player.container.getSlot(i).method20054()) {
                            if (this.method10670(InvManager.mc.player.container.getSlot(i).method20053(), i)) {
                                this.method10682(method9887.equals("FakeInv"));
                                InvManagerUtil.method29368(i);
                                this.field16017.reset();
                                if (n > 0L) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!this.field16018) {
            if (!(InvManager.mc.currentScreen instanceof Class518)) {
                if (this.field16017.getElapsedTime() > 0L) {
                    if (!this.field16019) {
                        this.field16018 = true;
                        InvManager.mc.method5269().method17292(new Class4389(-1));
                    }
                }
            }
        }
    }
    
    public static boolean method10667(final ItemStack class8321) {
        final float method10669 = method10669(class8321);
        final Module method10670 = Client.getInstance().moduleManager().getModuleByClass(InvManager.class);
        for (int i = 9; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method10671 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method10669(method10671) > method10669) {
                    if (method10671.getItem() instanceof SwordItem || !method10670.getBooleanValueFromSettingName("Sword")) {
                        return false;
                    }
                }
            }
        }
        return class8321.getItem() instanceof SwordItem || !method10670.getBooleanValueFromSettingName("Sword");
    }
    
    public void method10668(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method10667(method20053)) {
                    if (method10669(method20053) > 0.0f) {
                        if (method20053.getItem() instanceof SwordItem || !this.getBooleanValueFromSettingName("Sword")) {
                            this.method10682(b);
                            InvManagerUtil.method29370(i, n - 36);
                            this.field16017.reset();
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public static float method10669(final ItemStack class8321) {
        float n = 0.0f;
        final Item method27622 = class8321.getItem();
        if (method27622 instanceof Class4072) {
            n += method27622.method11709();
        }
        if (method27622 instanceof SwordItem) {
            n += ((SwordItem)method27622).method12281();
        }
        return n + (Class8742.method30195(Class7882.field32358, class8321) * 1.25f + Class8742.method30195(Class7882.field32362, class8321) * 0.01f);
    }
    
    public boolean method10670(final ItemStack class8321, final int n) {
        final Item method27622 = class8321.getItem();
        if (!class8321.method27664().getFormattedText().toLowerCase().contains("(right click)")) {
            if (!class8321.method27664().getFormattedText().toLowerCase().contains("(clique direito)")) {
                if (!class8321.method27664().getFormattedText().toLowerCase().contains("(click derecho)")) {
                    if (class8321.method27664().getFormattedText().toLowerCase().contains("§k||")) {
                        return false;
                    }
                    if (n == InvManager.field16013 && method10667(InvManager.mc.player.container.getSlot(n).method20053())) {
                        return false;
                    }
                    if (method27622 instanceof Class4100 && this.getBooleanValueFromSettingName("Auto Shield")) {
                        return false;
                    }
                    Label_0126: {
                        if (!this.getStringSettingValueByName("Tools").equals("Throw")) {
                            if (n == InvManager.field16014 || this.getStringSettingValueByName("Tools").equals("Keep")) {
                                if (method10678(InvManager.mc.player.container.getSlot(n).method20053())) {
                                    if (InvManager.field16014 >= 0) {
                                        return false;
                                    }
                                }
                            }
                            if (n == InvManager.field16015 || this.getStringSettingValueByName("Tools").equals("Keep")) {
                                if (method10680(InvManager.mc.player.container.getSlot(n).method20053())) {
                                    if (InvManager.field16015 >= 0) {
                                        return false;
                                    }
                                }
                            }
                            if (n != InvManager.field16016 && !this.getStringSettingValueByName("Tools").equals("Keep")) {
                                break Label_0126;
                            }
                            if (!method10679(InvManager.mc.player.container.getSlot(n).method20053())) {
                                break Label_0126;
                            }
                            if (InvManager.field16016 < 0) {
                                break Label_0126;
                            }
                            return false;
                        }
                    }
                    if (method27622 instanceof Class4055) {
                        if (InvManagerUtil.method29344(n)) {
                            return false;
                        }
                        for (final Class2215 class8322 : Class2215.values()) {
                            if (InvManager.mc.player.container.getSlot(8 - class8322.getIndex()).method20054()) {
                                if (!InvManagerUtil.method29369(InvManager.mc.player.container.getSlot(8 - class8322.getIndex()).method20053())) {}
                            }
                        }
                    }
                    if (method27622 instanceof Class4036 && (this.method10672() > (int)this.getNumberSettingValueByName("Block Cap") || BlockFly.field15749.contains(((Class4036)method27622).method12240()))) {
                        return true;
                    }
                    if (method27622 == Items.field31350 && Client.getInstance().moduleManager().getModuleByClass(AutoMLG.class).isEnabled()) {
                        return method10673(Items.field31350) > 1;
                    }
                    if (method27622 == Items.field31349 && Client.getInstance().moduleManager().getModuleByClass(AutoMLG.class).isEnabled()) {
                        return method10673(Items.field31349) > 1;
                    }
                    if (method27622 instanceof Class4089 && InvManagerUtil.method29371(class8321)) {
                        return true;
                    }
                    if (method27622 != Items.field31342) {
                        if (method27622.method11743()) {
                            if (this.getBooleanValueFromSettingName("Food")) {
                                if (method27622.method11744() != Class9582.field41767) {
                                    return true;
                                }
                            }
                        }
                        if (!(method27622 instanceof Class4076)) {
                            if (!(method27622 instanceof Class4072)) {
                                if (!(method27622 instanceof SwordItem)) {
                                    if (!(method27622 instanceof Class4055)) {
                                        if (method27622 instanceof Class4087 || method27622 instanceof Class3824) {
                                            if (this.getBooleanValueFromSettingName("Archery")) {
                                                return true;
                                            }
                                        }
                                        if (method27622 instanceof Class4046 && this.getBooleanValueFromSettingName("Heads")) {
                                            return true;
                                        }
                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("tnt")) {
                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("stick")) {
                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("egg")) {
                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("string")) {
                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("cake")) {
                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("mushroom")) {
                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("flint")) {
                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("dyePowder")) {
                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("feather")) {
                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("bucket")) {
                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("chest") || class8321.method27664().getFormattedText().toLowerCase().contains("collect")) {
                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("snow")) {
                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("fish")) {
                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("enchant")) {
                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("exp")) {
                                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("shears")) {
                                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("anvil")) {
                                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("torch")) {
                                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("seeds")) {
                                                                                                                    if (!method27622.method11715().getFormattedText().toLowerCase().contains("leather")) {
                                                                                                                        if (!method27622.method11715().getFormattedText().toLowerCase().contains("reeds")) {
                                                                                                                            if (!method27622.method11715().getFormattedText().toLowerCase().contains("record")) {
                                                                                                                                if (!method27622.method11715().getFormattedText().toLowerCase().contains("snowball")) {
                                                                                                                                    if (!(method27622 instanceof Class4064)) {
                                                                                                                                        if (method27622 != Items.field31371) {
                                                                                                                                            if (method27622 != Items.field31308) {
                                                                                                                                                return method27622.method11715().getFormattedText().toLowerCase().contains("piston");
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public ArrayList<Integer> method10671() {
        return this.field16020;
    }
    
    private int method10672() {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                final Item method20054 = method20053.getItem();
                if (method20053.getItem() instanceof Class4036) {
                    if (!BlockFly.field15749.contains(((Class4036)method20054).method12240())) {
                        n += method20053.field34176;
                    }
                }
            }
        }
        return n;
    }
    
    public static int method10673(final Item class3820) {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method20053.getItem() == class3820) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    private void method10674(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method10678(method20053)) {
                    if (InvManager.field16014 != i) {
                        if (!method10667(method20053)) {
                            if (InvManager.mc.player.container.getSlot(InvManager.field16014).method20054()) {
                                if (!method10678(InvManager.mc.player.container.getSlot(InvManager.field16014).method20053())) {
                                    this.method10682(b);
                                    InvManagerUtil.method29370(i, InvManager.field16014 - 36);
                                    this.field16017.reset();
                                    if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                InvManagerUtil.method29370(i, InvManager.field16014 - 36);
                                this.field16017.reset();
                                if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10675(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method10679(method20053)) {
                    if (InvManager.field16016 != i) {
                        if (!method10667(method20053)) {
                            if (InvManager.mc.player.container.getSlot(InvManager.field16016).method20054()) {
                                if (!method10679(InvManager.mc.player.container.getSlot(InvManager.field16016).method20053())) {
                                    this.method10682(b);
                                    InvManagerUtil.method29370(i, InvManager.field16016 - 36);
                                    this.field16017.reset();
                                    if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                InvManagerUtil.method29370(i, InvManager.field16016 - 36);
                                this.field16017.reset();
                                if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10676(final int n, final boolean b) {
        for (int i = 9; i < 45; ++i) {
            if (InvManager.mc.player.container.getSlot(i).method20054()) {
                final ItemStack method20053 = InvManager.mc.player.container.getSlot(i).method20053();
                if (method10680(method20053)) {
                    if (InvManager.field16015 != i) {
                        if (!method10667(method20053)) {
                            if (InvManager.mc.player.container.getSlot(InvManager.field16015).method20054()) {
                                if (!method10680(InvManager.mc.player.container.getSlot(InvManager.field16015).method20053())) {
                                    this.method10682(b);
                                    InvManagerUtil.method29370(i, InvManager.field16015 - 36);
                                    this.field16017.reset();
                                    if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.method10682(b);
                                InvManagerUtil.method29370(i, InvManager.field16015 - 36);
                                this.field16017.reset();
                                if (this.getNumberSettingValueByName("Delay") > 0.0f) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10677(final boolean b) {
        if (!InvManager.mc.player.container.getSlot(45).method20054()) {
            for (int i = 9; i < 45; ++i) {
                if (InvManager.mc.player.container.getSlot(i).method20053().getItem() instanceof Class4100) {
                    this.method10682(b);
                    this.field16017.reset();
                    InvManagerUtil.method29367(InvManager.mc.player.container.field16154, i, 0, Class2133.field12437, InvManager.mc.player, true);
                    this.field16019 = true;
                    return;
                }
            }
        }
    }
    
    public static boolean method10678(final ItemStack class8321) {
        if (class8321.getItem() instanceof Class4073) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (InvManager.mc.player.container.getSlot(i).method20054()) {
                    final ItemStack method10682 = InvManager.mc.player.container.getSlot(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.getItem() instanceof Class4073) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean method10679(final ItemStack class8321) {
        if (class8321.getItem() instanceof Class4074) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (InvManager.mc.player.container.getSlot(i).method20054()) {
                    final ItemStack method10682 = InvManager.mc.player.container.getSlot(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.getItem() instanceof Class4074) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean method10680(final ItemStack class8321) {
        if (class8321.getItem() instanceof Class4075) {
            final float method10681 = method10681(class8321);
            for (int i = 9; i < 45; ++i) {
                if (InvManager.mc.player.container.getSlot(i).method20054()) {
                    final ItemStack method10682 = InvManager.mc.player.container.getSlot(i).method20053();
                    if (method10681(method10682) > method10681) {
                        if (method10682.getItem() instanceof Class4075) {
                            if (!method10667(class8321)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static float method10681(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        if (method27622 instanceof Class4072) {
            final String lowerCase = method27622.method11715().getFormattedText().toLowerCase();
            final Class4072 class8322 = (Class4072)method27622;
            float n;
            if (!(method27622 instanceof Class4073)) {
                if (!(method27622 instanceof Class4074)) {
                    if (!(method27622 instanceof Class4075)) {
                        return 1.0f;
                    }
                    n = class8322.method11706(class8321, Blocks.field29181.getDefaultState());
                    if (lowerCase.toLowerCase().contains("gold")) {
                        n -= 5.0f;
                    }
                }
                else {
                    n = class8322.method11706(class8321, Blocks.DIRT.getDefaultState());
                    if (lowerCase.toLowerCase().contains("gold")) {
                        n -= 5.0f;
                    }
                }
            }
            else {
                n = class8322.method11706(class8321, Blocks.STONE.getDefaultState());
                if (lowerCase.toLowerCase().contains("gold")) {
                    n -= 5.0f;
                }
            }
            return (float)((float)(n + Class8742.method30195(Class7882.field32365, class8321) * 0.0075) + Class8742.method30195(Class7882.field32367, class8321) / 100.0);
        }
        return 0.0f;
    }
    
    private void method10682(final boolean b) {
        if (b) {
            if (this.field16018) {
                if (!(InvManager.mc.currentScreen instanceof Class518)) {
                    InvManager.mc.method5269().method17292(new Class4323(Class2218.field13623));
                    this.field16018 = false;
                }
            }
        }
    }
    
    static {
        InvManager.field16013 = 36;
        InvManager.field16014 = 37;
        InvManager.field16015 = 38;
        InvManager.field16016 = 39;
    }
}
