// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.Runnables;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.Random;

public class MainMenu extends Screen
{
    public static final Class8065 field3300;
    private static final ResourceLocation field3301;
    private static final ResourceLocation field3302;
    private final boolean field3303;
    private String field3304;
    private Class654 field3305;
    private static final ResourceLocation field3306;
    private static final ResourceLocation field3307;
    private boolean field3308;
    private Screen field3309;
    private int field3310;
    private int field3311;
    private final Class9472 field3312;
    private final boolean field3313;
    private long field3314;
    private Screen field3315;
    
    public MainMenu() {
        this(false);
    }
    
    public MainMenu(final boolean field3313) {
        super(new Class2259("narrator.screen.title", new Object[0]));
        this.field3312 = new Class9472(MainMenu.field3300);
        this.field3313 = field3313;
        this.field3303 = (new Random().nextFloat() < 1.0E-4);
    }
    
    private boolean method3214() {
        return this.minecraft.gameSettings.field23424 && this.field3309 != null;
    }
    
    @Override
    public void tick() {
        if (this.method3214()) {
            this.field3309.tick();
        }
    }
    
    public static CompletableFuture<Void> method3215(final Class1663 class1663, final Executor executor) {
        return CompletableFuture.allOf(class1663.method5855(MainMenu.field3306, executor), class1663.method5855(MainMenu.field3307, executor), class1663.method5855(MainMenu.field3301, executor), MainMenu.field3300.method26462(class1663, executor));
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void init() {
        if (this.field3304 == null) {
            this.field3304 = this.minecraft.method5329().method6461();
        }
        this.field3310 = this.font.getStringWidth("Copyright Mojang AB. Do not distribute!");
        this.field3311 = this.width - this.field3310 - 2;
        final int n = this.height / 4 + 48;
        Class654 method24312 = null;
        if (!this.minecraft.method5268()) {
            this.method3216(n, 24);
            if (Class9570.field41399.method22619()) {
                method24312 = Class7667.method24312(this, n, 24);
                this.addButton(method24312);
            }
        }
        else {
            this.method3217(n, 24);
        }
        this.addButton(new Class679(this.width / 2 - 124, n + 72 + 12, 20, 20, 0, 106, 20, Class654.field3421, 256, 256, class654 -> this.minecraft.displayGuiScreen(new Class704(this, this.minecraft.gameSettings, this.minecraft.method5295())), Class8822.method30773("narrator.button.language", new Object[0])));
        this.addButton(new Class654(this.width / 2 - 100, n + 72 + 12, 98, 20, Class8822.method30773("menu.options", new Object[0]), class654 -> this.minecraft.displayGuiScreen(new Class550(this, this.minecraft.gameSettings))));
        this.addButton(new Class654(this.width / 2 + 2, n + 72 + 12, 98, 20, Class8822.method30773("menu.quit", new Object[0]), class654 -> this.minecraft.method5253()));
        this.addButton(new Class679(this.width / 2 + 104, n + 72 + 12, 20, 20, 0, 0, 20, MainMenu.field3302, 32, 64, class654 -> this.minecraft.displayGuiScreen(new Class710(this, this.minecraft.gameSettings)), Class8822.method30773("narrator.button.accessibility", new Object[0])));
        this.minecraft.method5312(false);
        if (this.minecraft.gameSettings.field23424) {
            if (!this.field3308) {
                this.field3309 = new Class5052().method15491(this);
                this.field3308 = true;
            }
        }
        if (this.method3214()) {
            this.field3309.init(this.minecraft, this.width, this.height);
        }
        if (Class9570.field41401.method22605()) {
            this.field3315 = (Screen)Class9570.method35818(Class9570.field41401, this, method24312);
        }
    }
    
    private void method3216(final int n, final int n2) {
        this.addButton(new Class654(this.width / 2 - 100, n, 200, 20, Class8822.method30773("menu.singleplayer", new Object[0]), class654 -> this.minecraft.displayGuiScreen(new Class544(this))));
        this.addButton(new Class654(this.width / 2 - 100, n + n2 * 1, 200, 20, Class8822.method30773("menu.multiplayer", new Object[0]), class654 -> {
            if (!this.minecraft.gameSettings.field23434) {
                this.minecraft.displayGuiScreen(new Class530(this));
            }
            else {
                this.minecraft.displayGuiScreen(new Class720(this));
            }
        }));
        this.addButton(new Class654(this.width / 2 - 100, n + n2 * 2, 200, 20, Class8822.method30773("menu.online", new Object[0]), class654 -> this.method3218()));
        if (Class9570.field41399.method22619()) {
            if (this.buttons.size() > 0) {
                final Widget class573 = this.buttons.get(this.buttons.size() - 1);
                class573.field3426 = this.width / 2 + 2;
                class573.method3365(98);
            }
        }
    }
    
    private void method3217(final int n, final int n2) {
        this.addButton(new Class654(this.width / 2 - 100, n, 200, 20, Class8822.method30773("menu.playdemo", new Object[0]), class654 -> this.minecraft.method5262("Demo_World", "Demo_World", MinecraftServer.field2295)));
        this.field3305 = this.addButton(new Class654(this.width / 2 - 100, n + n2 * 1, 200, 20, Class8822.method30773("menu.resetdemo", new Object[0]), class654 -> {
            final WorldInfo method25791 = this.minecraft.method5243().method25791("Demo_World");
            if (method25791 != null) {
                this.minecraft.displayGuiScreen(new Class546(this::method3219, new Class2259("selectWorld.deleteQuestion", new Object[0]), new Class2259("selectWorld.deleteWarning", new Object[] { method25791.method29549() }), Class8822.method30773("selectWorld.deleteButton", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
            }
        }));
        if (this.minecraft.method5243().method25791("Demo_World") == null) {
            this.field3305.field3431 = false;
        }
    }
    
    private void method3218() {
        new Class5052().method15490(this);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3314 == 0L) {
            if (this.field3313) {
                this.field3314 = Util.method27837();
            }
        }
        final float n4 = this.field3313 ? ((Util.method27837() - this.field3314) / 1000.0f) : 1.0f;
        Class8933.method31514();
        AbstractGui.fill(0, 0, this.width, this.height, -1);
        this.field3312.method35257(n3, MathHelper.clamp(n4, 0.0f, 1.0f));
        final int n5 = this.width / 2 - 137;
        this.minecraft.method5290().method5849(MainMenu.field3301);
        RenderSystem.enableBlend();
        RenderSystem.method30013(Class2050.field11693, Class2135.field12460);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, this.field3313 ? ((float) MathHelper.ceil(MathHelper.clamp(n4, 0.0f, 1.0f))) : 1.0f);
        AbstractGui.blit(0, 0, this.width, this.height, 0.0f, 0.0f, 16, 128, 16, 128);
        final float n6 = this.field3313 ? MathHelper.clamp(n4 - 1.0f, 0.0f, 1.0f) : 1.0f;
        final int n7 = MathHelper.ceil(n6 * 255.0f) << 24;
        if ((n7 & 0xFC000000) != 0x0) {
            this.minecraft.method5290().method5849(MainMenu.field3306);
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, n6);
            if (!this.field3303) {
                this.blit(n5 + 0, 30, 0, 0, 155, 44);
                this.blit(n5 + 155, 30, 0, 45, 155, 44);
            }
            else {
                this.blit(n5 + 0, 30, 0, 0, 99, 44);
                this.blit(n5 + 99, 30, 129, 0, 27, 44);
                this.blit(n5 + 99 + 26, 30, 126, 0, 3, 44);
                this.blit(n5 + 99 + 26 + 3, 30, 99, 0, 26, 44);
                this.blit(n5 + 155, 30, 0, 45, 155, 44);
            }
            this.minecraft.method5290().method5849(MainMenu.field3307);
            AbstractGui.blit(n5 + 88, 67, 0.0f, 0.0f, 98, 14, 128, 16);
            if (Class9570.field41309.method22605()) {
                this.field3304 = Class9570.method35817(Class9570.field41309, this, this.minecraft.fontRenderer, this.width, this.height);
            }
            if (this.field3304 != null) {
                RenderSystem.pushMatrix();
                RenderSystem.translatef((float)(this.width / 2 + 90), 70.0f, 0.0f);
                RenderSystem.method30062(-20.0f, 0.0f, 0.0f, 1.0f);
                final float n8 = (1.8f - MathHelper.method35647(MathHelper.sin(Util.method27837() % 1000L / 1000.0f * 6.2831855f) * 0.1f)) * 100.0f / (this.font.getStringWidth(this.field3304) + 32);
                RenderSystem.method30063(n8, n8, n8);
                this.drawCenteredString(this.font, this.field3304, 0, -8, 0xFFFF00 | n7);
                RenderSystem.popMatrix();
            }
            final String string = "Minecraft " + Class9528.method35579().getName();
            String str;
            if (!this.minecraft.method5268()) {
                str = string + ("release".equalsIgnoreCase(this.minecraft.method5236()) ? "" : ("/" + this.minecraft.method5236()));
            }
            else {
                str = string + " Demo";
            }
            if (this.minecraft.method5229()) {
                str += Class8822.method30773("menu.modded", new Object[0]);
            }
            if (!Class9570.field41179.method22623()) {
                this.drawString(this.font, str, 2, this.height - 10, 0xFFFFFF | n7);
            }
            else {
                if (Class9570.field41181.method22605()) {
                    Class9570.method35818(Class9570.field41181, true, true, (n10, s) -> this.drawString(this.font, s, 2, this.height - (10 + n10 * 10), 0xFFFFFF | n9));
                }
                if (Class9570.field41182.method22605()) {
                    Class9570.method35818(Class9570.field41182, (n12, s2) -> this.drawString(this.font, s2, this.width - this.font.getStringWidth(s2), this.height - (10 + (n12 + 1) * 10), 0xFFFFFF | n11));
                }
            }
            this.drawString(this.font, "Copyright Mojang AB. Do not distribute!", this.field3311, this.height - 10, 0xFFFFFF | n7);
            if (n > this.field3311) {
                if (n < this.field3311 + this.field3310) {
                    if (n2 > this.height - 10) {
                        if (n2 < this.height) {
                            AbstractGui.fill(this.field3311, this.height - 1, this.field3311 + this.field3310, this.height, 0xFFFFFF | n7);
                        }
                    }
                }
            }
            final Iterator<Widget> iterator = this.buttons.iterator();
            while (iterator.hasNext()) {
                iterator.next().method3366(n6);
            }
            super.render(n, n2, n3);
            if (this.method3214()) {
                if (n6 >= 1.0f) {
                    this.field3309.render(n, n2, n3);
                }
            }
        }
        if (this.field3315 != null) {
            this.field3315.render(n, n2, n3);
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (super.mouseClicked(n, n2, n3)) {
            return true;
        }
        if (this.method3214() && this.field3309.mouseClicked(n, n2, n3)) {
            return true;
        }
        if (n > this.field3311) {
            if (n < this.field3311 + this.field3310) {
                if (n2 > this.height - 10) {
                    if (n2 < this.height) {
                        this.minecraft.displayGuiScreen(new Class697(false, Runnables.doNothing()));
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void removed() {
        if (this.field3309 != null) {
            this.field3309.removed();
        }
    }
    
    private void method3219(final boolean b) {
        if (b) {
            this.minecraft.method5243().method25796("Demo_World");
        }
        this.minecraft.displayGuiScreen(this);
    }
    
    static {
        field3300 = new Class8065(new ResourceLocation("textures/gui/title/background/panorama"));
        field3301 = new ResourceLocation("textures/gui/title/background/panorama_overlay.png");
        field3302 = new ResourceLocation("textures/gui/accessibility.png");
        field3306 = new ResourceLocation("textures/gui/title/minecraft.png");
        field3307 = new ResourceLocation("textures/gui/title/edition.png");
    }
}
