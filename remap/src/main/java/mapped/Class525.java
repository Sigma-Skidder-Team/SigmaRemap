// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;
import java.util.function.Predicate;
import java.util.Iterator;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.Map;
import java.util.List;

public class Class525 extends Class517<Class3434>
{
    private static final ResourceLocation field3122;
    private static final Class443 field3123;
    private static int field3124;
    private float field3125;
    private boolean field3126;
    private Class576 field3127;
    private List<Class6601> field3128;
    private Class6601 field3129;
    private Class752 field3130;
    private boolean field3131;
    private boolean field3132;
    private final Map<ResourceLocation, Class7909<Item>> field3133;
    
    public Class525(final PlayerEntity playerEntity) {
        super(new Class3434(playerEntity), playerEntity.inventory, new StringTextComponent(""));
        this.field3133 = Maps.newTreeMap();
        playerEntity.field3009 = this.field3077;
        this.passEvents = true;
        this.field3076 = 136;
        this.field3075 = 195;
    }
    
    @Override
    public void tick() {
        if (this.minecraft.playerController.method27332()) {
            if (this.field3127 != null) {
                this.field3127.method3376();
            }
        }
        else {
            this.minecraft.displayGuiScreen(new Class518(this.minecraft.player));
        }
    }
    
    @Override
    public void method2988(final Class6601 class6601, final int n, final int n2, Class2133 class6602) {
        if (this.method3006(class6601)) {
            this.field3127.method3393();
            this.field3127.method3407(0);
        }
        final boolean b = class6602 == Class2133.field12438;
        class6602 = ((n == -999 && class6602 == Class2133.field12437) ? Class2133.field12441 : class6602);
        if (class6601 == null) {
            if (Class525.field3124 != Class7207.field28005.method22108()) {
                if (class6602 != Class2133.field12442) {
                    final Class464 field3006 = this.minecraft.player.inventory;
                    if (!field3006.method2375().method27620()) {
                        if (this.field3132) {
                            if (n2 == 0) {
                                this.minecraft.player.method2822(field3006.method2375(), true);
                                this.minecraft.playerController.method27328(field3006.method2375());
                                field3006.method2374(ItemStack.EMPTY);
                            }
                            if (n2 == 1) {
                                final ItemStack method27621 = field3006.method2375().method27621(1);
                                this.minecraft.player.method2822(method27621, true);
                                this.minecraft.playerController.method27328(method27621);
                            }
                        }
                    }
                    return;
                }
            }
        }
        if (class6601 != null && !class6601.method20061(this.minecraft.player)) {
            return;
        }
        if (class6601 == this.field3129 && b) {
            for (int i = 0; i < this.minecraft.player.container.method10875().size(); ++i) {
                this.minecraft.playerController.method27327(ItemStack.EMPTY, i);
            }
        }
        else if (Class525.field3124 != Class7207.field28005.method22108()) {
            if (class6602 != Class2133.field12442 && class6601.field26173 == Class525.field3123) {
                final Class464 field3007 = this.minecraft.player.inventory;
                final ItemStack method27622 = field3007.method2375();
                final ItemStack method27623 = class6601.method20053();
                if (class6602 == Class2133.field12439) {
                    if (!method27623.method27620()) {
                        if (n2 >= 0) {
                            if (n2 < 9) {
                                final ItemStack method27624 = method27623.method27641();
                                method27624.method27691(method27624.method27628());
                                this.minecraft.player.inventory.method2160(n2, method27624);
                                this.minecraft.player.container.method10876();
                            }
                        }
                    }
                    return;
                }
                if (class6602 == Class2133.field12440) {
                    if (field3007.method2375().method27620()) {
                        if (class6601.method20054()) {
                            final ItemStack method27625 = class6601.method20053().method27641();
                            method27625.method27691(method27625.method27628());
                            field3007.method2374(method27625);
                        }
                    }
                    return;
                }
                if (class6602 == Class2133.field12441) {
                    if (!method27623.method27620()) {
                        final ItemStack method27626 = method27623.method27641();
                        method27626.method27691((n2 != 0) ? method27626.method27628() : 1);
                        this.minecraft.player.method2822(method27626, true);
                        this.minecraft.playerController.method27328(method27626);
                    }
                    return;
                }
                if (!method27622.method27620()) {
                    if (!method27623.method27620()) {
                        if (method27622.method27647(method27623)) {
                            if (ItemStack.method27642(method27622, method27623)) {
                                if (n2 != 0) {
                                    method27622.method27693(1);
                                    return;
                                }
                                if (b) {
                                    method27622.method27691(method27622.method27628());
                                    return;
                                }
                                if (method27622.method27690() >= method27622.method27628()) {
                                    return;
                                }
                                method27622.method27692(1);
                                return;
                            }
                        }
                    }
                }
                if (!method27623.method27620() && method27622.method27620()) {
                    field3007.method2374(method27623.method27641());
                    final ItemStack method27627 = field3007.method2375();
                    if (b) {
                        method27627.method27691(method27627.method27628());
                    }
                }
                else if (n2 != 0) {
                    field3007.method2375().method27693(1);
                }
                else {
                    field3007.method2374(ItemStack.EMPTY);
                }
            }
            else if (this.field3077 != null) {
                final ItemStack class6603 = (class6601 != null) ? this.field3077.getSlot(class6601.field26174).method20053() : ItemStack.EMPTY;
                this.field3077.method10879((class6601 != null) ? class6601.field26174 : n, n2, class6602, this.minecraft.player);
                if (Class3418.method10890(n2) != 2) {
                    if (class6601 != null) {
                        this.minecraft.playerController.method27327(this.field3077.getSlot(class6601.field26174).method20053(), class6601.field26174 - this.field3077.field16151.size() + 9 + 36);
                        final int n3 = 45 + n2;
                        if (class6602 != Class2133.field12439) {
                            if (class6602 == Class2133.field12441) {
                                if (!class6603.method27620()) {
                                    final ItemStack method27628 = class6603.method27641();
                                    method27628.method27691((n2 != 0) ? method27628.method27628() : 1);
                                    this.minecraft.player.method2822(method27628, true);
                                    this.minecraft.playerController.method27328(method27628);
                                }
                            }
                        }
                        else {
                            this.minecraft.playerController.method27327(class6603, n3 - this.field3077.field16151.size() + 9 + 36);
                        }
                        this.minecraft.player.container.method10876();
                    }
                }
                else {
                    for (int j = 0; j < 9; ++j) {
                        this.minecraft.playerController.method27327(this.field3077.getSlot(45 + j).method20053(), 36 + j);
                    }
                }
            }
        }
        else if (class6601 != this.field3129) {
            if (class6602 == Class2133.field12441) {
                if (class6601 != null) {
                    if (class6601.method20054()) {
                        final ItemStack method27629 = class6601.method20060((n2 != 0) ? class6601.method20053().method27628() : 1);
                        final ItemStack method27630 = class6601.method20053();
                        this.minecraft.player.method2822(method27629, true);
                        this.minecraft.playerController.method27328(method27629);
                        this.minecraft.playerController.method27327(method27630, Class6604.method20063((Class6604)class6601).field26174);
                        return;
                    }
                }
            }
            if (class6602 == Class2133.field12441 && !this.minecraft.player.inventory.method2375().method27620()) {
                this.minecraft.player.method2822(this.minecraft.player.inventory.method2375(), true);
                this.minecraft.playerController.method27328(this.minecraft.player.inventory.method2375());
                this.minecraft.player.inventory.method2374(ItemStack.EMPTY);
            }
            else {
                this.minecraft.player.container.method10879((class6601 != null) ? Class6604.method20063((Class6604)class6601).field26174 : n, n2, class6602, this.minecraft.player);
                this.minecraft.player.container.method10876();
            }
        }
        else {
            this.minecraft.player.inventory.method2374(ItemStack.EMPTY);
        }
    }
    
    private boolean method3006(final Class6601 class6601) {
        return class6601 != null && class6601.field26173 == Class525.field3123;
    }
    
    @Override
    public void method2994() {
        final int field3079 = this.field3079;
        super.method2994();
        if (this.field3127 != null) {
            if (this.field3079 != field3079) {
                this.field3127.method3413(this.field3079 + 82);
            }
        }
    }
    
    @Override
    public void init() {
        if (!this.minecraft.playerController.method27332()) {
            this.minecraft.displayGuiScreen(new Class518(this.minecraft.player));
        }
        else {
            super.init();
            this.minecraft.field4651.method22505(true);
            (this.field3127 = new Class576(this.font, this.field3079 + 82, this.field3080 + 6, 80, 9, Class8822.method30773("itemGroup.search"))).method3397(50);
            this.field3127.method3401(false);
            this.field3127.method3410(false);
            this.field3127.method3402(16777215);
            this.children.add(this.field3127);
            final int field3124 = Class525.field3124;
            Class525.field3124 = -1;
            this.method3011(Class7207.field27992[field3124]);
            this.minecraft.player.container.method10874(this.field3130);
            this.field3130 = new Class752(this.minecraft);
            this.minecraft.player.container.method10873(this.field3130);
        }
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3127.method3378();
        this.init(class869, n, n2);
        this.field3127.method3377(method3378);
        if (!this.field3127.method3378().isEmpty()) {
            this.method3008();
        }
    }
    
    @Override
    public void removed() {
        super.removed();
        if (this.minecraft.player != null) {
            if (this.minecraft.player.inventory != null) {
                this.minecraft.player.container.method10874(this.field3130);
            }
        }
        this.minecraft.field4651.method22505(false);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        if (this.field3131) {
            return false;
        }
        if (Class525.field3124 != Class7207.field27998.method22108()) {
            return false;
        }
        final String method3378 = this.field3127.method3378();
        if (!this.field3127.charTyped(c, n)) {
            return false;
        }
        if (!Objects.equals(method3378, this.field3127.method3378())) {
            this.method3008();
        }
        return true;
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        this.field3131 = false;
        if (Class525.field3124 == Class7207.field27998.method22108()) {
            if ((!this.method3006(this.field3081) || (this.field3081 != null && this.field3081.method20054())) && this.method2990(keyCode, n2)) {
                return this.field3131 = true;
            }
            final String method3378 = this.field3127.method3378();
            if (!this.field3127.keyPressed(keyCode, n2, n3)) {
                if (this.field3127.method3370()) {
                    if (this.field3127.method3409()) {
                        if (keyCode != 256) {
                            return true;
                        }
                    }
                }
                return super.keyPressed(keyCode, n2, n3);
            }
            if (!Objects.equals(method3378, this.field3127.method3378())) {
                this.method3008();
            }
            return true;
        }
        else {
            if (!this.minecraft.gameSettings.field23448.method1066(keyCode, n2)) {
                return super.keyPressed(keyCode, n2, n3);
            }
            this.field3131 = true;
            this.method3011(Class7207.field27998);
            return true;
        }
    }
    
    @Override
    public boolean keyReleased(final int n, final int n2, final int n3) {
        this.field3131 = false;
        return super.keyReleased(n, n2, n3);
    }
    
    private void method3008() {
        this.field3077.field16225.clear();
        this.field3133.clear();
        String s = this.field3127.method3378();
        if (!s.isEmpty()) {
            Class8924<ItemStack> class8924;
            if (!s.startsWith("#")) {
                class8924 = this.minecraft.method5309(Class1659.field9375);
            }
            else {
                s = s.substring(1);
                class8924 = this.minecraft.method5309(Class1659.field9376);
                this.method3009(s);
            }
            this.field3077.field16225.addAll((Collection<?>)class8924.method31456(s.toLowerCase(Locale.ROOT)));
        }
        else {
            final Iterator<Object> iterator = Registry.field211.iterator();
            while (iterator.hasNext()) {
                iterator.next().method11735(Class7207.field27998, this.field3077.field16225);
            }
        }
        this.field3125 = 0.0f;
        this.field3077.method10957(0.0f);
    }
    
    private void method3009(final String s3) {
        Predicate predicate;
        if (s3.indexOf(58) != -1) {
            predicate = (class1932 -> {
                final int endIndex;
                s3.substring(0, endIndex).trim();
                s3.substring(endIndex + 1).trim();
                return class1932.method7798().contains(s2) && class1932.method7797().contains(s4);
            });
        }
        else {
            predicate = (class1933 -> class1933.method7797().contains(s5));
        }
        Class7855.method25402().method18462().stream().filter(predicate).forEach(class1935 -> {
            final Class7909 class1936 = this.field3133.put(class1935, class1934.method18460(class1935));
        });
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        final Class7207 class7207 = Class7207.field27992[Class525.field3124];
        if (class7207.method22116()) {
            RenderSystem.disableBlend();
            this.font.method6610(Class8822.method30773(class7207.method22111()), 8.0f, 6.0f, 4210752);
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final double n4 = n - this.field3079;
            final double n5 = n2 - this.field3080;
            final Class7207[] field27992 = Class7207.field27992;
            for (int length = field27992.length, i = 0; i < length; ++i) {
                if (this.method3015(field27992[i], n4, n5)) {
                    return true;
                }
            }
            if (Class525.field3124 != Class7207.field28005.method22108()) {
                if (this.method3013(n, n2)) {
                    this.field3126 = this.method3010();
                    return true;
                }
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final double n4 = n - this.field3079;
            final double n5 = n2 - this.field3080;
            this.field3126 = false;
            for (final Class7207 class7207 : Class7207.field27992) {
                if (this.method3015(class7207, n4, n5)) {
                    this.method3011(class7207);
                    return true;
                }
            }
        }
        return super.mouseReleased(n, n2, n3);
    }
    
    private boolean method3010() {
        if (Class525.field3124 != Class7207.field28005.method22108()) {
            if (Class7207.field27992[Class525.field3124].method22118()) {
                return this.field3077.method10958();
            }
        }
        return false;
    }
    
    private void method3011(final Class7207 class7207) {
        final int field3124 = Class525.field3124;
        Class525.field3124 = class7207.method22108();
        this.field3092.clear();
        this.field3077.field16225.clear();
        if (class7207 != Class7207.field28004) {
            if (class7207 != Class7207.field27998) {
                class7207.method22126(this.field3077.field16225);
            }
        }
        else {
            final Class8653 method5321 = this.minecraft.method5321();
            for (int i = 0; i < 9; ++i) {
                final Class2262 method5322 = method5321.method29483(i);
                if (!method5322.isEmpty()) {
                    this.field3077.field16225.addAll((Collection<?>)method5322);
                }
                else {
                    for (int j = 0; j < 9; ++j) {
                        if (j != i) {
                            this.field3077.field16225.add(ItemStack.EMPTY);
                        }
                        else {
                            final ItemStack e = new ItemStack(Items.field31369);
                            e.method27659("CustomCreativeLock");
                            e.method27665(new Class2259("inventory.hotbarInfo", this.minecraft.gameSettings.field23458.method1068(), this.minecraft.gameSettings.field23457[i].method1068()));
                            this.field3077.field16225.add(e);
                        }
                    }
                }
            }
        }
        if (class7207 != Class7207.field28005) {
            if (field3124 == Class7207.field28005.method22108()) {
                this.field3077.field16151.clear();
                this.field3077.field16151.addAll(this.field3128);
                this.field3128 = null;
            }
        }
        else {
            final Class3427 field3125 = this.minecraft.player.container;
            if (this.field3128 == null) {
                this.field3128 = (List<Class6601>)ImmutableList.copyOf((Collection) this.field3077.field16151);
            }
            this.field3077.field16151.clear();
            for (int k = 0; k < field3125.field16151.size(); ++k) {
                int n4;
                int n5;
                if (k >= 5 && k < 9) {
                    final int n = k - 5;
                    final int n2 = n / 2;
                    final int n3 = n % 2;
                    n4 = 54 + n2 * 54;
                    n5 = 6 + n3 * 27;
                }
                else if (k >= 0 && k < 5) {
                    n4 = -2000;
                    n5 = -2000;
                }
                else if (k != 45) {
                    final int n6 = k - 9;
                    final int n7 = n6 % 9;
                    final int n8 = n6 / 9;
                    n4 = 9 + n7 * 18;
                    if (k < 36) {
                        n5 = 54 + n8 * 18;
                    }
                    else {
                        n5 = 112;
                    }
                }
                else {
                    n4 = 35;
                    n5 = 20;
                }
                this.field3077.field16151.add(new Class6604(field3125.field16151.get(k), k, n4, n5));
            }
            this.field3129 = new Class6601(Class525.field3123, 0, 173, 112);
            this.field3077.field16151.add(this.field3129);
        }
        if (this.field3127 != null) {
            if (class7207 != Class7207.field27998) {
                this.field3127.method3410(false);
                this.field3127.method3408(true);
                this.field3127.method3395(false);
                this.field3127.method3377("");
            }
            else {
                this.field3127.method3410(true);
                this.field3127.method3408(false);
                this.field3127.method3395(true);
                if (field3124 != class7207.method22108()) {
                    this.field3127.method3377("");
                }
                this.method3008();
            }
        }
        this.field3125 = 0.0f;
        this.field3077.method10957(0.0f);
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        if (this.method3010()) {
            this.field3125 -= (float)(n3 / ((this.field3077.field16225.size() + 9 - 1) / 9 - 5));
            this.field3125 = MathHelper.clamp(this.field3125, 0.0f, 1.0f);
            this.field3077.method10957(this.field3125);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        if (n >= n3) {
            if (n2 >= n4) {
                if (n < n3 + this.field3075) {
                    if (n2 < n4 + this.field3076) {
                        final boolean b = false;
                        return this.field3132 = (b && !this.method3015(Class7207.field27992[Class525.field3124], n, n2));
                    }
                }
            }
        }
        final boolean b = true;
        return this.field3132 = (b && !this.method3015(Class7207.field27992[Class525.field3124], n, n2));
    }
    
    public boolean method3013(final double n, final double n2) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        final int n3 = field3079 + 175;
        final int n4 = field3080 + 18;
        final int n5 = n3 + 14;
        final int n6 = n4 + 112;
        if (n >= n3) {
            if (n2 >= n4) {
                if (n < n5) {
                    return n2 < n6;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (!this.field3126) {
            return super.mouseDragged(n, n2, n3, n4, n5);
        }
        final int n6 = this.field3080 + 18;
        this.field3125 = ((float)n2 - n6 - 7.5f) / (n6 + 112 - n6 - 15.0f);
        this.field3125 = MathHelper.clamp(this.field3125, 0.0f, 1.0f);
        this.field3077.method10957(this.field3125);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        super.render(n, n2, n3);
        final Class7207[] field27992 = Class7207.field27992;
        for (int length = field27992.length, n4 = 0; n4 < length && !this.method3016(field27992[n4], n, n2); ++n4) {}
        if (this.field3129 != null) {
            if (Class525.field3124 == Class7207.field28005.method22108()) {
                if (this.method2987(this.field3129.field26175, this.field3129.field26176, 16, 16, n, n2)) {
                    this.renderTooltip(Class8822.method30773("inventory.binSlot"), n, n2);
                }
            }
        }
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.method2977(n, n2);
    }
    
    @Override
    public void renderTooltip(final ItemStack class8321, final int n, final int n2) {
        if (Class525.field3124 != Class7207.field27998.method22108()) {
            super.renderTooltip(class8321, n, n2);
        }
        else {
            final List<ITextComponent> method27668 = class8321.method27668(this.minecraft.player, this.minecraft.gameSettings.advancedItemTooltips ? TooltipFlags.ADVANCED : TooltipFlags.NORMAL);
            final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(method27668.size());
            final Iterator iterator = method27668.iterator();
            while (iterator.hasNext()) {
                arrayListWithCapacity.add(((ITextComponent)iterator.next()).getFormattedText());
            }
            final Item method27669 = class8321.getItem();
            Class7207 method27670 = method27669.method11737();
            if (method27670 == null) {
                if (method27669 == Items.field31534) {
                    final Map<Class6257, Integer> method27671 = Class8742.method30196(class8321);
                    if (method27671.size() == 1) {
                        final Class6257 class8322 = method27671.keySet().iterator().next();
                        for (final Class7207 class8323 : Class7207.field27992) {
                            if (class8323.method22125(class8322.field25118)) {
                                method27670 = class8323;
                                break;
                            }
                        }
                    }
                }
            }
            this.field3133.forEach((obj, class8325) -> {
                if (class8325.method25618(class8324)) {
                    list.add(1, "" + TextFormatting.BOLD + TextFormatting.DARK_PURPLE + "#" + obj);
                }
            });
            if (method27670 != null) {
                arrayListWithCapacity.add(1, "" + TextFormatting.BOLD + TextFormatting.BLUE + Class8822.method30773(method27670.method22111()));
            }
            for (int j = 0; j < arrayListWithCapacity.size(); ++j) {
                if (j != 0) {
                    arrayListWithCapacity.set(j, TextFormatting.GRAY + (String)arrayListWithCapacity.get(j));
                }
                else {
                    arrayListWithCapacity.set(j, class8321.method27672().field11190 + (String)arrayListWithCapacity.get(j));
                }
            }
            this.renderTooltip(arrayListWithCapacity, n, n2);
        }
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        final Class7207 class7207 = Class7207.field27992[Class525.field3124];
        for (final Class7207 class7208 : Class7207.field27992) {
            this.minecraft.method5290().method5849(Class525.field3122);
            if (class7208.method22108() != Class525.field3124) {
                this.method3017(class7208);
            }
        }
        this.minecraft.method5290().method5849(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + class7207.method22113()));
        this.blit(this.field3079, this.field3080, 0, 0, this.field3075, this.field3076);
        this.field3127.render(n2, n3, n);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        final int n4 = this.field3079 + 175;
        final int n5 = this.field3080 + 18;
        final int n6 = n5 + 112;
        this.minecraft.method5290().method5849(Class525.field3122);
        if (class7207.method22118()) {
            this.blit(n4, n5 + (int)((n6 - n5 - 17) * this.field3125), 232 + (this.method3010() ? 0 : 12), 0, 12, 15);
        }
        this.method3017(class7207);
        if (class7207 == Class7207.field28005) {
            Class518.method2999(this.field3079 + 88, this.field3080 + 45, 20, (float)(this.field3079 + 88 - n2), (float)(this.field3080 + 45 - 30 - n3), this.minecraft.player);
        }
    }
    
    public boolean method3015(final Class7207 class7207, final double n, final double n2) {
        final int method22120 = class7207.method22120();
        int n3 = 28 * method22120;
        final int n4 = 0;
        if (!class7207.method22122()) {
            if (method22120 > 0) {
                n3 += method22120;
            }
        }
        else {
            n3 = this.field3075 - 28 * (6 - method22120) + 2;
        }
        int n5;
        if (!class7207.method22121()) {
            n5 = n4 + this.field3076;
        }
        else {
            n5 = n4 - 32;
        }
        if (n >= n3) {
            if (n <= n3 + 28) {
                if (n2 >= n5) {
                    return n2 <= n5 + 32;
                }
            }
        }
        return false;
    }
    
    public boolean method3016(final Class7207 class7207, final int n, final int n2) {
        final int method22120 = class7207.method22120();
        int n3 = 28 * method22120;
        final int n4 = 0;
        if (!class7207.method22122()) {
            if (method22120 > 0) {
                n3 += method22120;
            }
        }
        else {
            n3 = this.field3075 - 28 * (6 - method22120) + 2;
        }
        int n5;
        if (!class7207.method22121()) {
            n5 = n4 + this.field3076;
        }
        else {
            n5 = n4 - 32;
        }
        if (!this.method2987(n3 + 3, n5 + 3, 23, 27, n, n2)) {
            return false;
        }
        this.renderTooltip(Class8822.method30773(class7207.method22111()), n, n2);
        return true;
    }
    
    public void method3017(final Class7207 class7207) {
        final boolean b = class7207.method22108() == Class525.field3124;
        final boolean method22121 = class7207.method22121();
        final int method22122 = class7207.method22120();
        final int n = method22122 * 28;
        int n2 = 0;
        int n3 = this.field3079 + 28 * method22122;
        final int field3080 = this.field3080;
        if (b) {
            n2 += 32;
        }
        if (!class7207.method22122()) {
            if (method22122 > 0) {
                n3 += method22122;
            }
        }
        else {
            n3 = this.field3079 + this.field3075 - 28 * (6 - method22122);
        }
        int n4;
        if (!method22121) {
            n2 += 64;
            n4 = field3080 + (this.field3076 - 4);
        }
        else {
            n4 = field3080 - 28;
        }
        this.blit(n3, n4, n, n2, 28, 32);
        this.setBlitOffset(100);
        this.itemRenderer.zLevel = 100.0f;
        final int n5 = n3 + 6;
        final int n6 = n4 + 8 + (method22121 ? 1 : -1);
        RenderSystem.enableRescaleNormal();
        final ItemStack method22123 = class7207.method22112();
        this.itemRenderer.method6540(method22123, n5, n6);
        this.itemRenderer.method6542(this.font, method22123, n5, n6);
        this.itemRenderer.zLevel = 0.0f;
        this.setBlitOffset(0);
    }
    
    public int method3018() {
        return Class525.field3124;
    }
    
    public static void method3019(final Minecraft class869, final int n, final boolean b, final boolean b2) {
        final ClientPlayerEntity field4684 = class869.player;
        final Class8653 method5321 = class869.method5321();
        final Class2262 method5322 = method5321.method29483(n);
        if (!b) {
            if (b2) {
                for (int i = 0; i < Class464.method2346(); ++i) {
                    method5322.set(i, field4684.inventory.getStackInSlot(i).method27641());
                }
                class869.field4647.method3805(new Class2259("inventory.hotbarSaved", class869.gameSettings.field23459.method1068(), class869.gameSettings.field23457[n].method1068()), false);
                method5321.method29482();
            }
        }
        else {
            for (int j = 0; j < Class464.method2346(); ++j) {
                final ItemStack method5323 = method5322.get(j).method27641();
                field4684.inventory.method2160(j, method5323);
                class869.playerController.method27327(method5323, 36 + j);
            }
            field4684.container.method10876();
        }
    }
    
    static {
        field3122 = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
        field3123 = new Class443(45);
        Class525.field3124 = Class7207.field27993.method22108();
    }
}
