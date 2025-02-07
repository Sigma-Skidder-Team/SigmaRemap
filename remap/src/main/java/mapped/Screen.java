// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.io.File;
import java.util.Locale;
import java.net.URISyntaxException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.net.URI;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Screen extends FocusableGui implements IRenderable
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Set<String> ALLOWED_PROTOCOLS = Sets.newHashSet("http", "https");
    public final ITextComponent title;
    public final List<IGuiEventListener> children;
    public Minecraft minecraft;
    public ItemRenderer itemRenderer;
    public int width;
    public int height;
    public final List<Widget> buttons;
    public boolean passEvents;
    public FontRenderer font;
    private URI clickedLink;
    
    public Screen(final ITextComponent field3148) {
        this.children = Lists.newArrayList();
        this.buttons = Lists.newArrayList();
        this.title = field3148;
    }
    
    public ITextComponent getTitle() {
        return this.title;
    }
    
    public String getNarrationMessage() {
        return this.getTitle().getString();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.buttons.size(); ++i) {
            this.buttons.get(i).render(n, n2, n3);
        }
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode == 256 && this.shouldCloseOnEsc()) {
            this.onClose();
            return true;
        }
        if (keyCode != 258) {
            return super.keyPressed(keyCode, n2, n3);
        }
        final boolean b = !hasShiftDown();
        if (!this.changeFocus(b)) {
            this.changeFocus(b);
        }
        return true;
    }
    
    public boolean shouldCloseOnEsc() {
        return true;
    }
    
    public void onClose() {
        this.minecraft.displayGuiScreen(null);
    }
    
    public <T extends Widget> T addButton(final T t) {
        this.buttons.add(t);
        this.children.add(t);
        return t;
    }
    
    public void renderTooltip(final ItemStack class8321, final int n, final int n2) {
        this.renderTooltip(this.getTooltipFromItem(class8321), n, n2);
    }
    
    public List<String> getTooltipFromItem(final ItemStack p_getTooltipFromItem_1_) {
        final List<ITextComponent> list = p_getTooltipFromItem_1_.method27668(this.minecraft.player, this.minecraft.gameSettings.advancedItemTooltips ? TooltipFlags.ADVANCED : TooltipFlags.NORMAL);
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<ITextComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().getFormattedText());
        }
        return arrayList;
    }
    
    public void renderTooltip(final String s, final int n, final int n2) {
        this.renderTooltip(Arrays.asList(s), n, n2);
    }
    
    public void renderTooltip(final List<String> list, final int n, final int n2) {
        if (!list.isEmpty()) {
            RenderSystem.disableRescaleNormal();
            RenderSystem.disableDepthTest();
            int n3 = 0;
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final int method6617 = this.font.getStringWidth((String)iterator.next());
                if (method6617 <= n3) {
                    continue;
                }
                n3 = method6617;
            }
            int n4 = n + 12;
            int n5 = n2 - 12;
            int n6 = 8;
            if (list.size() > 1) {
                n6 += 2 + (list.size() - 1) * 10;
            }
            if (n4 + n3 > this.width) {
                n4 -= 28 + n3;
            }
            if (n5 + n6 + 6 > this.height) {
                n5 = this.height - n6 - 6;
            }
            this.setBlitOffset(300);
            this.itemRenderer.zLevel = 300.0f;
            this.fillGradient(n4 - 3, n5 - 4, n4 + n3 + 3, n5 - 3, -267386864, -267386864);
            this.fillGradient(n4 - 3, n5 + n6 + 3, n4 + n3 + 3, n5 + n6 + 4, -267386864, -267386864);
            this.fillGradient(n4 - 3, n5 - 3, n4 + n3 + 3, n5 + n6 + 3, -267386864, -267386864);
            this.fillGradient(n4 - 4, n5 - 3, n4 - 3, n5 + n6 + 3, -267386864, -267386864);
            this.fillGradient(n4 + n3 + 3, n5 - 3, n4 + n3 + 4, n5 + n6 + 3, -267386864, -267386864);
            this.fillGradient(n4 - 3, n5 - 3 + 1, n4 - 3 + 1, n5 + n6 + 3 - 1, 1347420415, 1344798847);
            this.fillGradient(n4 + n3 + 2, n5 - 3 + 1, n4 + n3 + 3, n5 + n6 + 3 - 1, 1347420415, 1344798847);
            this.fillGradient(n4 - 3, n5 - 3, n4 + n3 + 3, n5 - 3 + 1, 1347420415, 1347420415);
            this.fillGradient(n4 - 3, n5 + n6 + 2, n4 + n3 + 3, n5 + n6 + 3, 1344798847, 1344798847);
            final MatrixStack class7351 = new MatrixStack();
            final IRenderTypeBuffer.Impl method6618 = IRenderTypeBuffer.getImpl(Tessellator.getInstance().getBuffer());
            class7351.method22564(0.0, 0.0, this.itemRenderer.zLevel);
            final Matrix4f method6619 = class7351.getLast().getMatrix();
            for (int i = 0; i < list.size(); ++i) {
                final String s = list.get(i);
                if (s != null) {
                    this.font.renderString(s, (float)n4, (float)n5, -1, true, method6619, method6618, false, 0, 15728880);
                }
                if (i == 0) {
                    n5 += 2;
                }
                n5 += 10;
            }
            method6618.finish();
            this.setBlitOffset(0);
            this.itemRenderer.zLevel = 0.0f;
            RenderSystem.enableDepthTest();
            RenderSystem.enableRescaleNormal();
        }
    }
    
    public void renderComponentHoverEffect(final ITextComponent class2250, final int n, final int n2) {
        if (class2250 != null && class2250.getStyle().getHoverEvent() != null) {
            final HoverEvent method30411 = class2250.getStyle().getHoverEvent();
            if (method30411.method34911() == HoverEvent.Action.SHOW_ITEM) {
                ItemStack class2251 = ItemStack.EMPTY;
                try {
                    final CompoundNBT method30412 = Class5704.method16938(method30411.method34912().getString());
                    if (method30412 instanceof CompoundNBT) {
                        class2251 = ItemStack.method27619(method30412);
                    }
                }
                catch (final CommandSyntaxException ex) {}
                if (class2251.method27620()) {
                    this.renderTooltip(TextFormatting.RED + "Invalid Item!", n, n2);
                }
                else {
                    this.renderTooltip(class2251, n, n2);
                }
            }
            else if (method30411.method34911() == HoverEvent.Action.field10699) {
                if (this.minecraft.gameSettings.advancedItemTooltips) {
                    try {
                        final CompoundNBT method30413 = Class5704.method16938(method30411.method34912().getString());
                        final ArrayList arrayList = Lists.newArrayList();
                        final ITextComponent method30414 = Class5953.method17871(method30413.getString("name"));
                        if (method30414 != null) {
                            arrayList.add(method30414.getFormattedText());
                        }
                        if (method30413.contains("type", 8)) {
                            arrayList.add("Type: " + method30413.getString("type"));
                        }
                        arrayList.add(method30413.getString("id"));
                        this.renderTooltip(arrayList, n, n2);
                    }
                    catch (final CommandSyntaxException | JsonSyntaxException ex2) {
                        this.renderTooltip(TextFormatting.RED + "Invalid Entity!", n, n2);
                    }
                }
            }
            else if (method30411.method34911() == HoverEvent.Action.field10697) {
                this.renderTooltip(this.minecraft.fontRenderer.method6626(method30411.method34912().getFormattedText(), Math.max(this.width / 2, 200)), n, n2);
            }
        }
    }
    
    public void method3034(final String s, final boolean b) {
    }
    
    public boolean method3035(final ITextComponent class2250) {
        if (class2250 == null) {
            return false;
        }
        final Class9485 method30410 = class2250.getStyle().method30410();
        if (hasShiftDown()) {
            if (class2250.getStyle().method30412() != null) {
                this.method3034(class2250.getStyle().method30412(), false);
            }
        }
        else if (method30410 != null) {
            if (method30410.method35309() == Class2075.field11971) {
                if (!this.minecraft.gameSettings.field23417) {
                    return false;
                }
                try {
                    final URI field3157 = new URI(method30410.method35310());
                    final String scheme = field3157.getScheme();
                    if (scheme == null) {
                        throw new URISyntaxException(method30410.method35310(), "Missing protocol");
                    }
                    if (!Screen.ALLOWED_PROTOCOLS.contains(scheme.toLowerCase(Locale.ROOT))) {
                        throw new URISyntaxException(method30410.method35310(), "Unsupported protocol: " + scheme.toLowerCase(Locale.ROOT));
                    }
                    if (this.minecraft.gameSettings.field23418) {
                        this.clickedLink = field3157;
                        this.minecraft.displayGuiScreen(new Class547(this::method3044, method30410.method35310(), false));
                    }
                    else {
                        this.method3045(field3157);
                    }
                }
                catch (final URISyntaxException ex) {
                    Screen.LOGGER.error("Can't open url for {}", (Object)method30410, (Object)ex);
                }
            }
            else if (method30410.method35309() == Class2075.field11972) {
                this.method3045(new File(method30410.method35310()).toURI());
            }
            else if (method30410.method35309() == Class2075.field11974) {
                this.method3034(method30410.method35310(), true);
            }
            else if (method30410.method35309() == Class2075.field11973) {
                this.method3037(method30410.method35310(), false);
            }
            else if (method30410.method35309() == Class2075.field11976) {
                this.minecraft.field4651.method22508(method30410.method35310());
            }
            else {
                Screen.LOGGER.error("Don't know how to handle {}", (Object)method30410);
            }
            return true;
        }
        return false;
    }
    
    public void method3036(final String s) {
        this.method3037(s, true);
    }
    
    public void method3037(final String s, final boolean b) {
        if (b) {
            this.minecraft.field4647.method3807().method3766(s);
        }
        this.minecraft.player.method4114(s);
    }
    
    public void init(final Minecraft field3150, final int field3151, final int field3152) {
        this.minecraft = field3150;
        this.itemRenderer = field3150.getItemRenderer();
        this.font = field3150.fontRenderer;
        this.width = field3151;
        this.height = field3152;
        this.buttons.clear();
        this.children.clear();
        this.setFocused(null);
        this.init();
    }
    
    public void setSize(final int field3152, final int field3153) {
        this.width = field3152;
        this.height = field3153;
    }
    
    @Override
    public List<? extends IGuiEventListener> children() {
        return this.children;
    }
    
    public void init() {
    }
    
    public void tick() {
    }
    
    public void removed() {
    }
    
    public void renderBackground() {
        this.renderBackground(0);
    }
    
    public void renderBackground(final int n) {
        if (this.minecraft.world == null) {
            this.renderDirtBackground(n);
        }
        else {
            this.fillGradient(0, 0, this.width, this.height, -1072689136, -804253680);
        }
    }
    
    public void renderDirtBackground(final int n) {
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        this.minecraft.method5290().method5849(Screen.BACKGROUND_LOCATION);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        method22695.begin(7, DefaultVertexFormats.field39619);
        method22695.pos(0.0, this.height, 0.0).tex(0.0f, this.height / 32.0f + n).method12399(64, 64, 64, 255).endVertex();
        method22695.pos(this.width, this.height, 0.0).tex(this.width / 32.0f, this.height / 32.0f + n).method12399(64, 64, 64, 255).endVertex();
        method22695.pos(this.width, 0.0, 0.0).tex(this.width / 32.0f, (float)n).method12399(64, 64, 64, 255).endVertex();
        method22695.pos(0.0, 0.0, 0.0).tex(0.0f, (float)n).method12399(64, 64, 64, 255).endVertex();
        method22694.draw();
    }
    
    public boolean method2991() {
        return true;
    }
    
    private void method3044(final boolean b) {
        if (b) {
            this.method3045(this.clickedLink);
        }
        this.clickedLink = null;
        this.minecraft.displayGuiScreen(this);
    }
    
    private void method3045(final URI uri) {
        Util.method27845().method977(uri);
    }
    
    public static boolean method3046() {
        if (!Minecraft.field4623) {
            return Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 341) || Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 345);
        }
        return Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 343) || Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 347);
    }
    
    public static boolean hasShiftDown() {
        return Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 340) || Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 344);
    }
    
    public static boolean method3048() {
        return Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 342) || Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 346);
    }
    
    public static boolean method3049(final int n) {
        if (n == 88) {
            if (method3046()) {
                if (!hasShiftDown()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3050(final int n) {
        if (n == 86) {
            if (method3046()) {
                if (!hasShiftDown()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3051(final int n) {
        if (n == 67) {
            if (method3046()) {
                if (!hasShiftDown()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method3052(final int n) {
        if (n == 65) {
            if (method3046()) {
                if (!hasShiftDown()) {
                    if (!method3048()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method2970(final Minecraft class869, final int n, final int n2) {
        this.init(class869, n, n2);
    }
    
    public static void method3053(final Runnable runnable, final String s, final String s2) {
        try {
            runnable.run();
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, s);
            method24421.makeCategory("Affected screen").addDetail("Screen name", () -> s2);
            throw new ReportedException(method24421);
        }
    }
    
    public boolean method3054(final String s, final char c, final int n) {
        final int index = s.indexOf(58);
        final int index2 = s.indexOf(47);
        if (c == ':') {
            if (index2 == -1 || n <= index2) {
                if (index == -1) {
                    return true;
                }
            }
            return false;
        }
        if (c != '/') {
            if (c != '_') {
                if (c != '-') {
                    if (c < 'a' || c > 'z') {
                        if (c < '0' || c > '9') {
                            if (c != '.') {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return n > index;
    }
    
    @Override
    public boolean isMouseOver(final double n, final double n2) {
        return true;
    }
}
