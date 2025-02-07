// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.Random;

public class Class526 extends Class516<Class3433>
{
    private static final ResourceLocation field3134;
    private static final ResourceLocation field3135;
    private static final Class5917 field3136;
    private final Random field3137;
    public int field3138;
    public float field3139;
    public float field3140;
    public float field3141;
    public float field3142;
    public float field3143;
    public float field3144;
    private ItemStack field3145;
    
    public Class526(final Class3433 class3433, final Class464 class3434, final ITextComponent class3435) {
        super(class3433, class3434, class3435);
        this.field3137 = new Random();
        this.field3145 = ItemStack.EMPTY;
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.title.getFormattedText(), 12.0f, 5.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void tick() {
        super.tick();
        this.method3025();
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        final int n4 = (this.width - this.field3075) / 2;
        final int n5 = (this.height - this.field3076) / 2;
        for (int i = 0; i < 3; ++i) {
            final double n6 = n - (n4 + 60);
            final double n7 = n2 - (n5 + 14 + 19 * i);
            if (n6 >= 0.0) {
                if (n7 >= 0.0) {
                    if (n6 < 108.0) {
                        if (n7 < 19.0) {
                            if (((Class3433)this.field3077).method10877(this.minecraft.player, i)) {
                                this.minecraft.playerController.method27326(((Class3433)this.field3077).field16154, i);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8317.method27611();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class526.field3134);
        final int n4 = (this.width - this.field3075) / 2;
        final int n5 = (this.height - this.field3076) / 2;
        this.blit(n4, n5, 0, 0, this.field3075, this.field3076);
        RenderSystem.method30057(5889);
        RenderSystem.pushMatrix();
        RenderSystem.method30058();
        final int n6 = (int)this.minecraft.method5332().getGuiScaleFactor();
        RenderSystem.method30048((this.width - 320) / 2 * n6, (this.height - 240) / 2 * n6, 320 * n6, 240 * n6);
        RenderSystem.translatef(-0.34f, 0.23f, 0.0f);
        RenderSystem.method30067(Matrix4f.method20755(90.0, 1.3333334f, 9.0f, 80.0f));
        RenderSystem.method30057(5888);
        final MatrixStack class7351 = new MatrixStack();
        class7351.method22567();
        final Class8996 method22569 = class7351.getLast();
        method22569.getMatrix().method20748();
        method22569.method32112().setIdentity();
        class7351.method22564(0.0, 3.299999952316284, 1984.0);
        class7351.method22565(5.0f, 5.0f, 5.0f);
        class7351.method22566(Vector3f.ZP.rotationDegrees(180.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(20.0f));
        final float method22570 = MathHelper.method35700(n, this.field3144, this.field3143);
        class7351.method22564((1.0f - method22570) * 0.2f, (1.0f - method22570) * 0.1f, (1.0f - method22570) * 0.25f);
        class7351.method22566(Vector3f.YP.rotationDegrees(-(1.0f - method22570) * 90.0f - 90.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(180.0f));
        final float n7 = MathHelper.method35700(n, this.field3140, this.field3139) + 0.25f;
        final float n8 = MathHelper.method35700(n, this.field3140, this.field3139) + 0.75f;
        float n9 = (n7 - MathHelper.method35643(n7)) * 1.6f - 0.3f;
        float n10 = (n8 - MathHelper.method35643(n8)) * 1.6f - 0.3f;
        if (n9 < 0.0f) {
            n9 = 0.0f;
        }
        if (n10 < 0.0f) {
            n10 = 0.0f;
        }
        if (n9 > 1.0f) {
            n9 = 1.0f;
        }
        if (n10 > 1.0f) {
            n10 = 1.0f;
        }
        RenderSystem.enableRescaleNormal();
        Class526.field3136.method17788(0.0f, n9, n10, method22570);
        final IRenderTypeBuffer.Impl method22571 = IRenderTypeBuffer.getImpl(Tessellator.getInstance().getBuffer());
        Class526.field3136.method17564(class7351, method22571.method25214(Class526.field3136.method17647(Class526.field3135)), 15728880, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        method22571.finish();
        class7351.method22568();
        RenderSystem.method30057(5889);
        RenderSystem.method30048(0, 0, this.minecraft.method5332().method7692(), this.minecraft.method5332().method7693());
        RenderSystem.popMatrix();
        RenderSystem.method30057(5888);
        Class8317.method27612();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8430.method28151().method28153(((Class3433)this.field3077).method10953());
        final int method22572 = ((Class3433)this.field3077).method10952();
        for (int i = 0; i < 3; ++i) {
            final int n11 = n4 + 60;
            final int n12 = n11 + 20;
            this.setBlitOffset(0);
            this.minecraft.method5290().method5849(Class526.field3134);
            final int j = ((Class3433)this.field3077).field16221[i];
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            if (j != 0) {
                final String string = "" + j;
                final int n13 = 86 - this.font.getStringWidth(string);
                final String method22573 = Class8430.method28151().method28152(this.font, n13);
                final FontRenderer method22574 = this.minecraft.method5323().method7376(Minecraft.field4625);
                int n14 = 6839882;
                int n15 = 0;
                Label_1122: {
                    if (method22572 < i + 1 || this.minecraft.player.field3026 < j) {
                        if (!this.minecraft.player.field3025.field27304) {
                            this.blit(n11, n5 + 14 + 19 * i, 0, 185, 108, 19);
                            this.blit(n11 + 1, n5 + 15 + 19 * i, 16 * i, 239, 16, 16);
                            method22574.method6622(method22573, n12, n5 + 16 + 19 * i, n13, (n14 & 0xFEFEFE) >> 1);
                            n15 = 4226832;
                            break Label_1122;
                        }
                    }
                    final int n16 = n2 - (n4 + 60);
                    final int n17 = n3 - (n5 + 14 + 19 * i);
                    Label_1062: {
                        if (n16 >= 0) {
                            if (n17 >= 0) {
                                if (n16 < 108) {
                                    if (n17 < 19) {
                                        this.blit(n11, n5 + 14 + 19 * i, 0, 204, 108, 19);
                                        n14 = 16777088;
                                        break Label_1062;
                                    }
                                }
                            }
                        }
                        this.blit(n11, n5 + 14 + 19 * i, 0, 166, 108, 19);
                    }
                    this.blit(n11 + 1, n5 + 15 + 19 * i, 16 * i, 223, 16, 16);
                    method22574.method6622(method22573, n12, n5 + 16 + 19 * i, n13, n14);
                    n15 = 8453920;
                }
                final FontRenderer field4643 = this.minecraft.fontRenderer;
                field4643.drawStringWithShadow(string, (float)(n12 + 86 - field4643.getStringWidth(string)), (float)(n5 + 16 + 19 * i + 7), n15);
            }
            else {
                this.blit(n11, n5 + 14 + 19 * i, 0, 185, 108, 19);
            }
        }
    }
    
    @Override
    public void render(final int n, final int n2, float method5314) {
        method5314 = this.minecraft.method5314();
        this.renderBackground();
        super.render(n, n2, method5314);
        this.method2977(n, n2);
        final boolean field27304 = this.minecraft.player.field3025.field27304;
        final int method5315 = ((Class3433)this.field3077).method10952();
        for (int i = 0; i < 3; ++i) {
            final int n3 = ((Class3433)this.field3077).field16221[i];
            final Class6257 method5316 = Class6257.method18590(((Class3433)this.field3077).field16222[i]);
            final int n4 = ((Class3433)this.field3077).field16223[i];
            final int n5 = i + 1;
            if (this.method2987(60, 14 + 19 * i, 108, 17, n, n2)) {
                if (n3 > 0) {
                    if (n4 >= 0) {
                        if (method5316 != null) {
                            final ArrayList arrayList = Lists.newArrayList();
                            arrayList.add("" + TextFormatting.WHITE + TextFormatting.ITALIC + Class8822.method30773("container.enchant.clue", method5316.method18599(n4).getFormattedText()));
                            if (!field27304) {
                                arrayList.add("");
                                if (this.minecraft.player.field3026 >= n3) {
                                    String str;
                                    if (n5 != 1) {
                                        str = Class8822.method30773("container.enchant.lapis.many", n5);
                                    }
                                    else {
                                        str = Class8822.method30773("container.enchant.lapis.one", new Object[0]);
                                    }
                                    arrayList.add(((method5315 < n5) ? TextFormatting.RED : TextFormatting.GRAY) + "" + str);
                                    String str2;
                                    if (n5 != 1) {
                                        str2 = Class8822.method30773("container.enchant.level.many", n5);
                                    }
                                    else {
                                        str2 = Class8822.method30773("container.enchant.level.one", new Object[0]);
                                    }
                                    arrayList.add(TextFormatting.GRAY + "" + str2);
                                }
                                else {
                                    arrayList.add(TextFormatting.RED + Class8822.method30773("container.enchant.level.requirement", ((Class3433)this.field3077).field16221[i]));
                                }
                            }
                            this.renderTooltip(arrayList, n, n2);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public void method3025() {
        final ItemStack method20053 = this.field3077.getSlot(0).method20053();
        if (!ItemStack.method27643(method20053, this.field3145)) {
            this.field3145 = method20053;
            do {
                this.field3141 += this.field3137.nextInt(4) - this.field3137.nextInt(4);
                if (this.field3139 > this.field3141 + 1.0f) {
                    break;
                }
            } while (this.field3139 >= this.field3141 - 1.0f);
        }
        ++this.field3138;
        this.field3140 = this.field3139;
        this.field3144 = this.field3143;
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (((Class3433)this.field3077).field16221[i] != 0) {
                n = 1;
            }
        }
        if (n == 0) {
            this.field3143 -= 0.2f;
        }
        else {
            this.field3143 += 0.2f;
        }
        this.field3143 = MathHelper.clamp(this.field3143, 0.0f, 1.0f);
        this.field3142 += (MathHelper.clamp((this.field3141 - this.field3139) * 0.4f, -0.2f, 0.2f) - this.field3142) * 0.9f;
        this.field3139 += this.field3142;
    }
    
    static {
        field3134 = new ResourceLocation("textures/gui/container/enchanting_table.png");
        field3135 = new ResourceLocation("textures/entity/enchanting_table_book.png");
        field3136 = new Class5917();
    }
}
