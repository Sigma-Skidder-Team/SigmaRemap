// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.Set;

public abstract class Class516<T extends Class3418> extends Screen implements Class725<T>
{
    public static final ResourceLocation field3074;
    public int field3075;
    public int field3076;
    public final T field3077;
    public final Class464 field3078;
    public int field3079;
    public int field3080;
    public Class6601 field3081;
    private Class6601 field3082;
    private boolean field3083;
    private ItemStack field3084;
    private int field3085;
    private int field3086;
    private Class6601 field3087;
    private long field3088;
    private ItemStack field3089;
    private Class6601 field3090;
    private long field3091;
    public final Set<Class6601> field3092;
    public boolean field3093;
    private int field3094;
    private int field3095;
    private boolean field3096;
    private int field3097;
    private long field3098;
    private Class6601 field3099;
    private int field3100;
    private boolean field3101;
    private ItemStack field3102;
    
    public Class516(final T field3077, final Class464 field3078, final ITextComponent class2250) {
        super(class2250);
        this.field3075 = 176;
        this.field3076 = 166;
        this.field3084 = ItemStack.EMPTY;
        this.field3089 = ItemStack.EMPTY;
        this.field3092 = Sets.newHashSet();
        this.field3102 = ItemStack.EMPTY;
        this.field3077 = field3077;
        this.field3078 = field3078;
        this.field3096 = true;
    }
    
    @Override
    public void init() {
        super.init();
        this.field3079 = (this.width - this.field3075) / 2;
        this.field3080 = (this.height - this.field3076) / 2;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.method2976(n3, n, n2);
        RenderSystem.disableRescaleNormal();
        RenderSystem.disableDepthTest();
        super.render(n, n2, n3);
        RenderSystem.method30059();
        RenderSystem.method30065((float)field3079, (float)field3080, 0.0f);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableRescaleNormal();
        this.field3081 = null;
        RenderSystem.method30084(33986, 240.0f, 240.0f);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < this.field3077.field16151.size(); ++i) {
            final Class6601 field3081 = this.field3077.field16151.get(i);
            if (field3081.method20062()) {
                this.method2979(field3081);
            }
            if (this.method2986(field3081, n, n2)) {
                if (field3081.method20062()) {
                    this.field3081 = field3081;
                    RenderSystem.disableDepthTest();
                    final int field3082 = field3081.field26175;
                    final int field3083 = field3081.field26176;
                    RenderSystem.method30049(true, true, true, false);
                    this.fillGradient(field3082, field3083, field3082 + 16, field3083 + 16, -2130706433, -2130706433);
                    RenderSystem.method30049(true, true, true, true);
                    RenderSystem.enableDepthTest();
                }
            }
        }
        this.method2973(n, n2);
        final Class464 field3084 = this.minecraft.player.inventory;
        ItemStack class8321 = this.field3084.method27620() ? field3084.method2375() : this.field3084;
        if (!class8321.method27620()) {
            final int n4 = this.field3084.method27620() ? 8 : 16;
            String string = null;
            if (!this.field3084.method27620() && this.field3083) {
                class8321 = class8321.method27641();
                class8321.method27691(MathHelper.ceil(class8321.method27690() / 2.0f));
            }
            else if (this.field3093) {
                if (this.field3092.size() > 1) {
                    class8321 = class8321.method27641();
                    class8321.method27691(this.field3097);
                    if (class8321.method27620()) {
                        string = "" + TextFormatting.YELLOW + "0";
                    }
                }
            }
            this.method2978(class8321, n - field3079 - 8, n2 - field3080 - n4, string);
        }
        if (!this.field3089.method27620()) {
            float n5 = (Util.method27837() - this.field3088) / 100.0f;
            if (n5 >= 1.0f) {
                n5 = 1.0f;
                this.field3089 = ItemStack.EMPTY;
            }
            this.method2978(this.field3089, this.field3085 + (int)((this.field3087.field26175 - this.field3085) * n5), this.field3086 + (int)((this.field3087.field26176 - this.field3086) * n5), null);
        }
        RenderSystem.method30060();
        RenderSystem.enableDepthTest();
    }
    
    public void method2977(final int n, final int n2) {
        if (this.minecraft.player.inventory.method2375().method27620()) {
            if (this.field3081 != null) {
                if (this.field3081.method20054()) {
                    this.renderTooltip(this.field3081.method20053(), n, n2);
                }
            }
        }
    }
    
    private void method2978(final ItemStack class8321, final int n, final int n2, final String s) {
        RenderSystem.method30065(0.0f, 0.0f, 32.0f);
        this.setBlitOffset(200);
        this.itemRenderer.zLevel = 200.0f;
        this.itemRenderer.method6540(class8321, n, n2);
        this.itemRenderer.method6543(this.font, class8321, n, n2 - (this.field3084.method27620() ? 0 : 8), s);
        this.setBlitOffset(0);
        this.itemRenderer.zLevel = 0.0f;
    }
    
    public void method2973(final int n, final int n2) {
    }
    
    public abstract void method2976(final float p0, final int p1, final int p2);
    
    private void method2979(final Class6601 class6601) {
        final int field26175 = class6601.field26175;
        final int field26176 = class6601.field26176;
        ItemStack class6602 = class6601.method20053();
        boolean b = false;
        int n = 0;
        Label_0060: {
            if (class6601 == this.field3082) {
                if (!this.field3084.method27620()) {
                    if (!this.field3083) {
                        n = 1;
                        break Label_0060;
                    }
                }
            }
            n = 0;
        }
        int n2 = n;
        final ItemStack method2375 = this.minecraft.player.inventory.method2375();
        String string = null;
        Label_0095: {
            if (class6601 == this.field3082) {
                if (!this.field3084.method27620()) {
                    if (this.field3083) {
                        if (!class6602.method27620()) {
                            class6602 = class6602.method27641();
                            class6602.method27691(class6602.method27690() / 2);
                            break Label_0095;
                        }
                    }
                }
            }
            if (this.field3093) {
                if (this.field3092.contains(class6601)) {
                    if (!method2375.method27620()) {
                        if (this.field3092.size() == 1) {
                            return;
                        }
                        if (Class3418.method10894(class6601, method2375, true) && this.field3077.method10896(class6601)) {
                            class6602 = method2375.method27641();
                            b = true;
                            Class3418.method10895(this.field3092, this.field3094, class6602, class6601.method20053().method27620() ? 0 : class6601.method20053().method27690());
                            final int min = Math.min(class6602.method27628(), class6601.method20058(class6602));
                            if (class6602.method27690() > min) {
                                string = TextFormatting.YELLOW.toString() + min;
                                class6602.method27691(min);
                            }
                        }
                        else {
                            this.field3092.remove(class6601);
                            this.method2980();
                        }
                    }
                }
            }
        }
        this.setBlitOffset(100);
        this.itemRenderer.zLevel = 100.0f;
        if (class6602.method27620()) {
            if (class6601.method20062()) {
                final Pair<ResourceLocation, ResourceLocation> method2376 = class6601.method20059();
                if (method2376 != null) {
                    final TextureAtlasSprite class6603 = this.minecraft.method5296((ResourceLocation)method2376.getFirst()).apply((ResourceLocation)method2376.getSecond());
                    this.minecraft.method5290().method5849(class6603.method7504().method6340());
                    AbstractGui.blit(field26175, field26176, this.getBlitOffset(), 16, 16, class6603);
                    n2 = 1;
                }
            }
        }
        if (n2 == 0) {
            if (b) {
                AbstractGui.fill(field26175, field26176, field26175 + 16, field26176 + 16, -2130706433);
            }
            RenderSystem.enableDepthTest();
            this.itemRenderer.method6541(this.minecraft.player, class6602, field26175, field26176);
            this.itemRenderer.method6543(this.font, class6602, field26175, field26176, string);
        }
        this.itemRenderer.zLevel = 0.0f;
        this.setBlitOffset(0);
    }
    
    private void method2980() {
        final ItemStack method2375 = this.minecraft.player.inventory.method2375();
        if (!method2375.method27620()) {
            if (this.field3093) {
                if (this.field3094 != 2) {
                    this.field3097 = method2375.method27690();
                    for (final Class6601 class6601 : this.field3092) {
                        final ItemStack method2376 = method2375.method27641();
                        final ItemStack method2377 = class6601.method20053();
                        final int n = method2377.method27620() ? 0 : method2377.method27690();
                        Class3418.method10895(this.field3092, this.field3094, method2376, n);
                        final int min = Math.min(method2376.method27628(), class6601.method20058(method2376));
                        if (method2376.method27690() > min) {
                            method2376.method27691(min);
                        }
                        this.field3097 -= method2376.method27690() - n;
                    }
                }
                else {
                    this.field3097 = method2375.method27628();
                }
            }
        }
    }
    
    private Class6601 method2981(final double n, final double n2) {
        for (int i = 0; i < this.field3077.field16151.size(); ++i) {
            final Class6601 class6601 = this.field3077.field16151.get(i);
            if (this.method2986(class6601, n, n2) && class6601.method20062()) {
                return class6601;
            }
        }
        return null;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (!super.mouseClicked(n, n2, n3)) {
            final boolean method1067 = this.minecraft.gameSettings.field23447.method1067(n3);
            final Class6601 method1068 = this.method2981(n, n2);
            final long method1069 = Util.method27837();
            boolean field3101 = false;
            Label_0091: {
                if (this.field3099 == method1068) {
                    if (method1069 - this.field3098 < 250L) {
                        if (this.field3100 == n3) {
                            field3101 = true;
                            break Label_0091;
                        }
                    }
                }
                field3101 = false;
            }
            this.field3101 = field3101;
            this.field3096 = false;
            Label_0162: {
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (!method1067) {
                            break Label_0162;
                        }
                    }
                }
                final boolean method1070 = this.method2983(n, n2, this.field3079, this.field3080, n3);
                int field3102 = -1;
                if (method1068 != null) {
                    field3102 = method1068.field26174;
                }
                if (method1070) {
                    field3102 = -999;
                }
                if (this.minecraft.gameSettings.field23429) {
                    if (method1070) {
                        if (this.minecraft.player.inventory.method2375().method27620()) {
                            this.minecraft.displayGuiScreen(null);
                            return true;
                        }
                    }
                }
                if (field3102 != -1) {
                    if (!this.minecraft.gameSettings.field23429) {
                        if (!this.field3093) {
                            if (!this.minecraft.player.inventory.method2375().method27620()) {
                                this.field3093 = true;
                                this.field3095 = n3;
                                this.field3092.clear();
                                if (n3 != 0) {
                                    if (n3 != 1) {
                                        if (this.minecraft.gameSettings.field23447.method1067(n3)) {
                                            this.field3094 = 2;
                                        }
                                    }
                                    else {
                                        this.field3094 = 1;
                                    }
                                }
                                else {
                                    this.field3094 = 0;
                                }
                            }
                            else {
                                if (!this.minecraft.gameSettings.field23447.method1067(n3)) {
                                    final boolean b = field3102 != -999 && (Class8341.method27798(Minecraft.method5277().method5332().method7690(), 340) || Class8341.method27798(Minecraft.method5277().method5332().method7690(), 344));
                                    Class2133 class2133 = Class2133.field12437;
                                    if (!b) {
                                        if (field3102 == -999) {
                                            class2133 = Class2133.field12441;
                                        }
                                    }
                                    else {
                                        this.field3102 = ((method1068 != null && method1068.method20054()) ? method1068.method20053().method27641() : ItemStack.EMPTY);
                                        class2133 = Class2133.field12438;
                                    }
                                    this.method2988(method1068, field3102, n3, class2133);
                                }
                                else {
                                    this.method2988(method1068, field3102, n3, Class2133.field12440);
                                }
                                this.field3096 = true;
                            }
                        }
                    }
                    else if (method1068 != null && method1068.method20054()) {
                        this.field3082 = method1068;
                        this.field3084 = ItemStack.EMPTY;
                        this.field3083 = (n3 == 1);
                    }
                    else {
                        this.field3082 = null;
                    }
                }
            }
            this.field3099 = method1068;
            this.field3098 = method1069;
            this.field3100 = n3;
            return true;
        }
        return true;
    }
    
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        if (n >= n3) {
            if (n2 >= n4) {
                if (n < n3 + this.field3075) {
                    if (n2 < n4 + this.field3076) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        final Class6601 method2981 = this.method2981(n, n2);
        final ItemStack method2982 = this.minecraft.player.inventory.method2375();
        if (this.field3082 != null && this.minecraft.gameSettings.field23429) {
            if (n3 == 0 || n3 == 1) {
                if (!this.field3084.method27620()) {
                    if (this.field3084.method27690() > 1) {
                        if (method2981 != null) {
                            if (Class3418.method10894(method2981, this.field3084, false)) {
                                final long method2983 = Util.method27837();
                                if (this.field3090 != method2981) {
                                    this.field3090 = method2981;
                                    this.field3091 = method2983;
                                }
                                else if (method2983 - this.field3091 > 500L) {
                                    this.method2988(this.field3082, this.field3082.field26174, 0, Class2133.field12437);
                                    this.method2988(method2981, method2981.field26174, 1, Class2133.field12437);
                                    this.method2988(this.field3082, this.field3082.field26174, 0, Class2133.field12437);
                                    this.field3091 = method2983 + 750L;
                                    this.field3084.method27693(1);
                                }
                            }
                        }
                    }
                }
                else if (method2981 != this.field3082) {
                    if (!this.field3082.method20053().method27620()) {
                        this.field3084 = this.field3082.method20053().method27641();
                    }
                }
            }
        }
        else if (this.field3093) {
            if (method2981 != null) {
                if (!method2982.method27620()) {
                    if (method2982.method27690() > this.field3092.size() || this.field3094 == 2) {
                        if (Class3418.method10894(method2981, method2982, true)) {
                            if (method2981.method20046(method2982)) {
                                if (this.field3077.method10896(method2981)) {
                                    this.field3092.add(method2981);
                                    this.method2980();
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        final Class6601 method2981 = this.method2981(n, n2);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        final boolean method2982 = this.method2983(n, n2, field3079, field3080, n3);
        int field3081 = -1;
        if (method2981 != null) {
            field3081 = method2981.field26174;
        }
        if (method2982) {
            field3081 = -999;
        }
        Label_0101: {
            if (this.field3101) {
                if (method2981 != null) {
                    if (n3 == 0) {
                        if (this.field3077.method10857(ItemStack.EMPTY, method2981)) {
                            if (!Screen.hasShiftDown()) {
                                this.method2988(method2981, field3081, n3, Class2133.field12443);
                            }
                            else if (!this.field3102.method27620()) {
                                for (final Class6601 class6601 : this.field3077.field16151) {
                                    if (class6601 == null) {
                                        continue;
                                    }
                                    if (!class6601.method20061(this.minecraft.player)) {
                                        continue;
                                    }
                                    if (!class6601.method20054()) {
                                        continue;
                                    }
                                    if (class6601.field26173 != method2981.field26173) {
                                        continue;
                                    }
                                    if (!Class3418.method10894(class6601, this.field3102, true)) {
                                        continue;
                                    }
                                    this.method2988(class6601, class6601.field26174, n3, Class2133.field12438);
                                }
                            }
                            this.field3101 = false;
                            this.field3098 = 0L;
                            break Label_0101;
                        }
                    }
                }
            }
            if (this.field3093 && this.field3095 != n3) {
                this.field3093 = false;
                this.field3092.clear();
                return this.field3096 = true;
            }
            if (this.field3096) {
                this.field3096 = false;
                return true;
            }
            if (this.field3082 != null && this.minecraft.gameSettings.field23429) {
                if (n3 == 0 || n3 == 1) {
                    if (this.field3084.method27620()) {
                        if (method2981 != this.field3082) {
                            this.field3084 = this.field3082.method20053();
                        }
                    }
                    final boolean method2983 = Class3418.method10894(method2981, this.field3084, false);
                    Label_0469: {
                        if (field3081 != -1) {
                            if (!this.field3084.method27620()) {
                                if (method2983) {
                                    this.method2988(this.field3082, this.field3082.field26174, n3, Class2133.field12437);
                                    this.method2988(method2981, field3081, 0, Class2133.field12437);
                                    if (!this.minecraft.player.inventory.method2375().method27620()) {
                                        this.method2988(this.field3082, this.field3082.field26174, n3, Class2133.field12437);
                                        this.field3085 = MathHelper.floor(n - field3079);
                                        this.field3086 = MathHelper.floor(n2 - field3080);
                                        this.field3087 = this.field3082;
                                        this.field3089 = this.field3084;
                                        this.field3088 = Util.method27837();
                                        break Label_0469;
                                    }
                                    this.field3089 = ItemStack.EMPTY;
                                    break Label_0469;
                                }
                            }
                        }
                        if (!this.field3084.method27620()) {
                            this.field3085 = MathHelper.floor(n - field3079);
                            this.field3086 = MathHelper.floor(n2 - field3080);
                            this.field3087 = this.field3082;
                            this.field3089 = this.field3084;
                            this.field3088 = Util.method27837();
                        }
                    }
                    this.field3084 = ItemStack.EMPTY;
                    this.field3082 = null;
                }
            }
            else if (this.field3093 && !this.field3092.isEmpty()) {
                this.method2988(null, -999, Class3418.method10891(0, this.field3094), Class2133.field12442);
                for (final Class6601 class6602 : this.field3092) {
                    this.method2988(class6602, class6602.field26174, Class3418.method10891(1, this.field3094), Class2133.field12442);
                }
                this.method2988(null, -999, Class3418.method10891(2, this.field3094), Class2133.field12442);
            }
            else if (!this.minecraft.player.inventory.method2375().method27620()) {
                if (!this.minecraft.gameSettings.field23447.method1067(n3)) {
                    final boolean b = field3081 != -999 && (Class8341.method27798(Minecraft.method5277().method5332().method7690(), 340) || Class8341.method27798(Minecraft.method5277().method5332().method7690(), 344));
                    if (b) {
                        this.field3102 = ((method2981 != null && method2981.method20054()) ? method2981.method20053().method27641() : ItemStack.EMPTY);
                    }
                    this.method2988(method2981, field3081, n3, b ? Class2133.field12438 : Class2133.field12437);
                }
                else {
                    this.method2988(method2981, field3081, n3, Class2133.field12440);
                }
            }
        }
        if (this.minecraft.player.inventory.method2375().method27620()) {
            this.field3098 = 0L;
        }
        this.field3093 = false;
        return true;
    }
    
    private boolean method2986(final Class6601 class6601, final double n, final double n2) {
        return this.method2987(class6601.field26175, class6601.field26176, 16, 16, n, n2);
    }
    
    public boolean method2987(final int n, final int n2, final int n3, final int n4, double n5, double n6) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        n5 -= field3079;
        n6 -= field3080;
        if (n5 >= n - 1) {
            if (n5 < n + n3 + 1) {
                if (n6 >= n2 - 1) {
                    if (n6 < n2 + n4 + 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method2988(final Class6601 class6601, int field26174, final int n, final Class2133 class6602) {
        if (class6601 != null) {
            field26174 = class6601.field26174;
        }
        this.minecraft.playerController.method27324(this.field3077.field16154, field26174, n, class6602, this.minecraft.player);
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (!super.keyPressed(keyCode, n2, n3)) {
            if (keyCode == 256 || this.minecraft.gameSettings.field23442.method1066(keyCode, n2)) {
                this.minecraft.player.method2814();
            }
            this.method2990(keyCode, n2);
            if (this.field3081 != null) {
                if (this.field3081.method20054()) {
                    if (!this.minecraft.gameSettings.field23447.method1066(keyCode, n2)) {
                        if (this.minecraft.gameSettings.field23444.method1066(keyCode, n2)) {
                            this.method2988(this.field3081, this.field3081.field26174, Screen.method3046() ? 1 : 0, Class2133.field12441);
                        }
                    }
                    else {
                        this.method2988(this.field3081, this.field3081.field26174, 0, Class2133.field12440);
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    public boolean method2990(final int n, final int n2) {
        if (this.minecraft.player.inventory.method2375().method27620()) {
            if (this.field3081 != null) {
                for (int i = 0; i < 9; ++i) {
                    if (this.minecraft.gameSettings.field23457[i].method1066(n, n2)) {
                        this.method2988(this.field3081, this.field3081.field26174, i, Class2133.field12439);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void removed() {
        if (this.minecraft.player != null) {
            this.field3077.method10859(this.minecraft.player);
        }
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    @Override
    public void tick() {
        super.tick();
        if (!this.minecraft.player.method1768() || this.minecraft.player.removed) {
            this.minecraft.player.method2814();
        }
    }
    
    @Override
    public T method2993() {
        return this.field3077;
    }
    
    static {
        field3074 = new ResourceLocation("textures/gui/container/inventory.png");
    }
}
