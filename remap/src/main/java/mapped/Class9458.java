// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.google.common.base.MoreObjects;
import com.mentalfrostbyte.Client;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class Class9458
{
    private static final Class6332 field40656;
    private static final Class6332 field40657;
    private final Minecraft field40658;
    private ItemStack field40659;
    private ItemStack field40660;
    private float field40661;
    private float field40662;
    private float field40663;
    private float field40664;
    private final Class8551 field40665;
    private final ItemRenderer field40666;
    
    public Class9458(final Minecraft field40658) {
        this.field40659 = ItemStack.EMPTY;
        this.field40660 = ItemStack.EMPTY;
        this.field40658 = field40658;
        this.field40665 = field40658.method5306();
        this.field40666 = field40658.getItemRenderer();
    }
    
    public void method35143(final LivingEntity class511, final ItemStack class512, final Class2016 class513, final boolean b, final MatrixStack class514, final IRenderTypeBuffer class515, final int n) {
        if (!class512.method27620()) {
            this.field40666.method6537(class511, class512, class513, b, class514, class515, class511.world, n, Class1904.field10335);
        }
    }
    
    private float method35144(final float n) {
        return -MathHelper.cos(MathHelper.clamp(1.0f - n / 45.0f + 0.1f, 0.0f, 1.0f) * 3.1415927f) * 0.5f + 0.5f;
    }
    
    private void method35145(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class2226 class7353) {
        this.field40658.method5290().method5849(this.field40658.player.method4097());
        final Class4711 class7354 = (Class4711)this.field40665.method28699(this.field40658.player);
        class7351.method22567();
        final float n2 = (class7353 != Class2226.field13698) ? -1.0f : 1.0f;
        class7351.method22566(Vector3f.YP.rotationDegrees(92.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(45.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(n2 * -41.0f));
        class7351.method22564(n2 * 0.3f, -1.100000023841858, 0.44999998807907104);
        if (class7353 != Class2226.field13698) {
            class7354.method14001(class7351, class7352, n, this.field40658.player);
        }
        else {
            class7354.method14000(class7351, class7352, n, this.field40658.player);
        }
        class7351.method22568();
    }
    
    private void method35146(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final float n2, final Class2226 class7353, final float n3, final ItemStack class7354) {
        final float n4 = (class7353 != Class2226.field13698) ? -1.0f : 1.0f;
        class7351.method22564(n4 * 0.125f, -0.125, 0.0);
        if (!this.field40658.player.method1823()) {
            class7351.method22567();
            class7351.method22566(Vector3f.ZP.rotationDegrees(n4 * 10.0f));
            this.method35149(class7351, class7352, n, n2, n3, class7353);
            class7351.method22568();
        }
        class7351.method22567();
        class7351.method22564(n4 * 0.51f, -0.08f + n2 * -1.2f, -0.75);
        final float method35640 = MathHelper.method35640(n3);
        final float method35641 = MathHelper.sin(method35640 * 3.1415927f);
        class7351.method22564(n4 * (-0.5f * method35641), 0.4f * MathHelper.sin(method35640 * 6.2831855f) - 0.3f * method35641, -0.3f * MathHelper.sin(n3 * 3.1415927f));
        class7351.method22566(Vector3f.XP.rotationDegrees(method35641 * -45.0f));
        class7351.method22566(Vector3f.YP.rotationDegrees(n4 * method35641 * -30.0f));
        this.method35148(class7351, class7352, n, class7354);
        class7351.method22568();
    }
    
    private void method35147(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final float n2, final float n3, final float n4) {
        final float method35640 = MathHelper.method35640(n4);
        class7351.method22564(0.0, -(-0.2f * MathHelper.sin(n4 * 3.1415927f)) / 2.0f, -0.4f * MathHelper.sin(method35640 * 3.1415927f));
        final float method35641 = this.method35144(n2);
        class7351.method22564(0.0, 0.04f + n3 * -1.2f + method35641 * -0.5f, -0.7200000286102295);
        class7351.method22566(Vector3f.XP.rotationDegrees(method35641 * -85.0f));
        if (!this.field40658.player.method1823()) {
            class7351.method22567();
            class7351.method22566(Vector3f.YP.rotationDegrees(90.0f));
            this.method35145(class7351, class7352, n, Class2226.field13698);
            this.method35145(class7351, class7352, n, Class2226.field13697);
            class7351.method22568();
        }
        class7351.method22566(Vector3f.XP.rotationDegrees(MathHelper.sin(method35640 * 3.1415927f) * 20.0f));
        class7351.method22565(2.0f, 2.0f, 2.0f);
        this.method35148(class7351, class7352, n, this.field40659);
    }
    
    private void method35148(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final ItemStack class7353) {
        class7351.method22566(Vector3f.YP.rotationDegrees(180.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(180.0f));
        class7351.method22565(0.38f, 0.38f, 0.38f);
        class7351.method22564(-0.5, -0.5, 0.0);
        class7351.method22565(0.0078125f, 0.0078125f, 0.0078125f);
        final Class6356 method12328 = Class4094.method12328(class7353, this.field40658.world);
        final Class4150 method12329 = class7352.method25214((method12328 != null) ? Class9458.field40657 : Class9458.field40656);
        final Matrix4f method12330 = class7351.getLast().getMatrix();
        method12329.pos(method12330, -7.0f, 135.0f, 0.0f).method12399(255, 255, 255, 255).tex(0.0f, 1.0f).method12440(n).endVertex();
        method12329.pos(method12330, 135.0f, 135.0f, 0.0f).method12399(255, 255, 255, 255).tex(1.0f, 1.0f).method12440(n).endVertex();
        method12329.pos(method12330, 135.0f, -7.0f, 0.0f).method12399(255, 255, 255, 255).tex(1.0f, 0.0f).method12440(n).endVertex();
        method12329.pos(method12330, -7.0f, -7.0f, 0.0f).method12399(255, 255, 255, 255).tex(0.0f, 0.0f).method12440(n).endVertex();
        if (method12328 != null) {
            this.field40658.field4644.method5822().method7391(class7351, class7352, method12328, false, n);
        }
    }
    
    private void method35149(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final float n2, final float n3, final Class2226 class7353) {
        final boolean b = class7353 != Class2226.field13697;
        final float n4 = b ? 1.0f : -1.0f;
        final float method35640 = MathHelper.method35640(n3);
        class7351.method22564(n4 * (-0.3f * MathHelper.sin(method35640 * 3.1415927f) + 0.64000005f), 0.4f * MathHelper.sin(method35640 * 6.2831855f) - 0.6f + n2 * -0.6f, -0.4f * MathHelper.sin(n3 * 3.1415927f) - 0.71999997f);
        class7351.method22566(Vector3f.YP.rotationDegrees(n4 * 45.0f));
        final float method35641 = MathHelper.sin(n3 * n3 * 3.1415927f);
        class7351.method22566(Vector3f.YP.rotationDegrees(n4 * MathHelper.sin(method35640 * 3.1415927f) * 70.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(n4 * method35641 * -20.0f));
        final ClientPlayerEntity field4684 = this.field40658.player;
        this.field40658.method5290().method5849(field4684.method4097());
        class7351.method22564(n4 * -1.0f, 3.5999999046325684, 3.5);
        class7351.method22566(Vector3f.ZP.rotationDegrees(n4 * 120.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(200.0f));
        class7351.method22566(Vector3f.YP.rotationDegrees(n4 * -135.0f));
        class7351.method22564(n4 * 5.6f, 0.0, 0.0);
        final Class4711 class7354 = (Class4711)this.field40665.method28699(field4684);
        if (!b) {
            class7354.method14001(class7351, class7352, n, field4684);
        }
        else {
            class7354.method14000(class7351, class7352, n, field4684);
        }
    }
    
    private void method35150(final MatrixStack class7351, final float n, final Class2226 class7352, final ItemStack class7353) {
        final float n2 = this.field40658.player.method2767() - n + 1.0f;
        final float n3 = n2 / class7353.method27652();
        if (n3 < 0.8f) {
            class7351.method22564(0.0, MathHelper.method35647(MathHelper.cos(n2 / 4.0f * 3.1415927f) * 0.1f), 0.0);
        }
        final float n4 = 1.0f - (float)Math.pow(n3, 27.0);
        final int n5 = (class7352 != Class2226.field13698) ? -1 : 1;
        class7351.method22564(n4 * 0.6f * n5, n4 * -0.5f, n4 * 0.0f);
        class7351.method22566(Vector3f.YP.rotationDegrees(n5 * n4 * 90.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(n4 * 10.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(n5 * n4 * 30.0f));
    }
    
    private void method35151(final MatrixStack class7351, final Class2226 class7352, final float n) {
        final int n2 = (class7352 != Class2226.field13698) ? -1 : 1;
        class7351.method22566(Vector3f.YP.rotationDegrees(n2 * (45.0f + MathHelper.sin(n * n * 3.1415927f) * -20.0f)));
        final float method35638 = MathHelper.sin(MathHelper.method35640(n) * 3.1415927f);
        class7351.method22566(Vector3f.ZP.rotationDegrees(n2 * method35638 * -20.0f));
        class7351.method22566(Vector3f.XP.rotationDegrees(method35638 * -80.0f));
        class7351.method22566(Vector3f.YP.rotationDegrees(n2 * -45.0f));
    }
    
    private void method35152(final MatrixStack class7351, final Class2226 class7352, final float n) {
        class7351.method22564(((class7352 != Class2226.field13698) ? -1 : 1) * 0.56f, -0.52f + n * -0.6f, -0.7200000286102295);
    }
    
    public void method35153(final float n, final MatrixStack class7351, final IRenderTypeBuffer.Impl class7352, final ClientPlayerEntity class7353, final int n2) {
        final float method2748 = class7353.method2748(n);
        final Class316 class7354 = (Class316)MoreObjects.firstNonNull(class7353.field2934, (Object)Class316.field1877);
        final float method2749 = MathHelper.method35700(n, class7353.prevRotationPitch, class7353.rotationPitch);
        boolean b = true;
        int n3 = 1;
        if (!class7353.method2756()) {
            final ItemStack method2750 = class7353.getHeldItemMainhand();
            final ItemStack method2751 = class7353.method2714();
            if (method2750.getItem() instanceof Class4086) {
                if (Class4086.method12296(method2750)) {
                    n3 = (b ? 0 : 1);
                }
            }
            if (method2751.getItem() instanceof Class4086) {
                if (Class4086.method12296(method2751)) {
                    b = !method2750.method27620();
                    n3 = (b ? 0 : 1);
                }
            }
        }
        else {
            if (class7353.method2766().getItem() instanceof Class4085) {
                b = (class7353.method2757() == Class316.field1877);
                n3 = (b ? 0 : 1);
            }
            if (class7353.method2757() == Class316.field1877) {
                final ItemStack method2752 = class7353.method2714();
                if (method2752.getItem() instanceof Class4086) {
                    if (Class4086.method12296(method2752)) {
                        n3 = 0;
                    }
                }
            }
        }
        final float method2753 = MathHelper.method35700(n, class7353.field4092, class7353.field4090);
        final float method2754 = MathHelper.method35700(n, class7353.field4091, class7353.field4089);
        class7351.method22566(Vector3f.XP.rotationDegrees((class7353.getPitch(n) - method2753) * 0.1f));
        class7351.method22566(Vector3f.YP.rotationDegrees((class7353.getYaw(n) - method2754) * 0.1f));
        if (b) {
            final float f = (class7354 != Class316.field1877) ? 0.0f : method2748;
            final float f2 = 1.0f - MathHelper.method35700(n, this.field40662, this.field40661);
            if (!Class9570.field41310.method22605() || !Class9570.method35812(Class9570.field41310, Class316.field1877, class7351, class7352, n2, n, method2749, f, f2, this.field40659)) {
                this.method35154(class7353, n, method2749, Class316.field1877, f, this.field40659, f2, class7351, class7352, n2);
            }
        }
        if (n3 != 0) {
            final float f3 = (class7354 != Class316.field1878) ? 0.0f : method2748;
            final float f4 = 1.0f - MathHelper.method35700(n, this.field40664, this.field40663);
            if (!Class9570.field41310.method22605() || !Class9570.method35812(Class9570.field41310, Class316.field1878, class7351, class7352, n2, n, method2749, f3, f4, this.field40660)) {
                this.method35154(class7353, n, method2749, Class316.field1878, f3, this.field40660, f4, class7351, class7352, n2);
            }
        }
        class7352.finish();
    }
    
    private void method35154(final AbstractClientPlayerEntity abstractClientPlayerEntity, final float n, final float n2, final Class316 class755, final float n3, final ItemStack class756, final float n4, final MatrixStack class757, final IRenderTypeBuffer class758, final int n5) {
        if (!Config.method28955() || !Class9216.method33907(class755)) {
            final boolean b = class755 == Class316.field1877;
            final Class2226 class759 = b ? abstractClientPlayerEntity.method2755() : abstractClientPlayerEntity.method2755().method8419();
            class757.method22567();
            if (class756.method27620()) {
                if (b && !abstractClientPlayerEntity.method1823()) {
                    this.method35149(class757, class758, n5, n4, n3, class759);
                }
            }
            else if (class756.getItem() instanceof Class4094) {
                if (b && this.field40660.method27620()) {
                    this.method35147(class757, class758, n5, n2, n4, n3);
                }
                else {
                    this.method35146(class757, class758, n5, n4, class759, n3, class756);
                }
            }
            else if (class756.getItem() instanceof Class4086) {
                final boolean method12296 = Class4086.method12296(class756);
                final boolean b2 = class759 == Class2226.field13698;
                final int n6 = b2 ? 1 : -1;
                if (abstractClientPlayerEntity.method2756() && abstractClientPlayerEntity.method2767() > 0 && abstractClientPlayerEntity.method2757() == class755) {
                    this.method35152(class757, class759, n4);
                    class757.method22564(n6 * -0.4785682f, -0.0943870022892952, 0.05731530860066414);
                    class757.method22566(Vector3f.XP.rotationDegrees(-11.935f));
                    class757.method22566(Vector3f.YP.rotationDegrees(n6 * 65.3f));
                    class757.method22566(Vector3f.ZP.rotationDegrees(n6 * -9.785f));
                    final float n7 = class756.method27652() - (this.field40658.player.method2767() - n + 1.0f);
                    float n8 = n7 / Class4086.method12308(class756);
                    if (n8 > 1.0f) {
                        n8 = 1.0f;
                    }
                    if (n8 > 0.1f) {
                        final float n9 = MathHelper.sin((n7 - 0.1f) * 1.3f) * (n8 - 0.1f);
                        class757.method22564(n9 * 0.0f, n9 * 0.004f, n9 * 0.0f);
                    }
                    class757.method22564(n8 * 0.0f, n8 * 0.0f, n8 * 0.04f);
                    class757.method22565(1.0f, 1.0f, 1.0f + n8 * 0.2f);
                    class757.method22566(Vector3f.YN.rotationDegrees(n6 * 45.0f));
                }
                else {
                    class757.method22564(n6 * (-0.4f * MathHelper.sin(MathHelper.method35640(n3) * 3.1415927f)), 0.2f * MathHelper.sin(MathHelper.method35640(n3) * 6.2831855f), -0.2f * MathHelper.sin(n3 * 3.1415927f));
                    this.method35152(class757, class759, n4);
                    this.method35151(class757, class759, n3);
                    if (method12296 && n3 < 0.001f) {
                        class757.method22564(n6 * -0.641864f, 0.0, 0.0);
                        class757.method22566(Vector3f.YP.rotationDegrees(n6 * 10.0f));
                    }
                }
                this.method35143(abstractClientPlayerEntity, class756, b2 ? Class2016.field11490 : Class2016.field11489, !b2, class757, class758, n5);
            }
            else {
                final boolean b3 = class759 == Class2226.field13698;
                final Class5716 class760 = new Class5716(true, n3, n4, class759, class756, class757);
                Client.getInstance().getEventBus().post(class760);
                if (abstractClientPlayerEntity.method2756() && abstractClientPlayerEntity.method2767() > 0 && abstractClientPlayerEntity.method2757() == class755) {
                    final int n10 = b3 ? 1 : -1;
                    switch (Class8442.field34698[class756.method27653().ordinal()]) {
                        case 1: {
                            this.method35152(class757, class759, n4);
                            break;
                        }
                        case 2:
                        case 3: {
                            this.method35150(class757, n, class759, class756);
                            this.method35152(class757, class759, n4);
                            break;
                        }
                        case 4: {
                            this.method35152(class757, class759, n4);
                            break;
                        }
                        case 5: {
                            this.method35152(class757, class759, n4);
                            class757.method22564(n10 * -0.2785682f, 0.18344387412071228, 0.15731531381607056);
                            class757.method22566(Vector3f.XP.rotationDegrees(-13.935f));
                            class757.method22566(Vector3f.YP.rotationDegrees(n10 * 35.3f));
                            class757.method22566(Vector3f.ZP.rotationDegrees(n10 * -9.785f));
                            final float n11 = class756.method27652() - (this.field40658.player.method2767() - n + 1.0f);
                            final float n12 = n11 / 20.0f;
                            float n13 = (n12 * n12 + n12 * 2.0f) / 3.0f;
                            if (n13 > 1.0f) {
                                n13 = 1.0f;
                            }
                            if (n13 > 0.1f) {
                                final float n14 = MathHelper.sin((n11 - 0.1f) * 1.3f) * (n13 - 0.1f);
                                class757.method22564(n14 * 0.0f, n14 * 0.004f, n14 * 0.0f);
                            }
                            class757.method22564(n13 * 0.0f, n13 * 0.0f, n13 * 0.04f);
                            class757.method22565(1.0f, 1.0f, 1.0f + n13 * 0.2f);
                            class757.method22566(Vector3f.YN.rotationDegrees(n10 * 45.0f));
                            break;
                        }
                        case 6: {
                            this.method35152(class757, class759, n4);
                            class757.method22564(n10 * -0.5f, 0.699999988079071, 0.10000000149011612);
                            class757.method22566(Vector3f.XP.rotationDegrees(-55.0f));
                            class757.method22566(Vector3f.YP.rotationDegrees(n10 * 35.3f));
                            class757.method22566(Vector3f.ZP.rotationDegrees(n10 * -9.785f));
                            final float n15 = class756.method27652() - (this.field40658.player.method2767() - n + 1.0f);
                            float n16 = n15 / 10.0f;
                            if (n16 > 1.0f) {
                                n16 = 1.0f;
                            }
                            if (n16 > 0.1f) {
                                final float n17 = MathHelper.sin((n15 - 0.1f) * 1.3f) * (n16 - 0.1f);
                                class757.method22564(n17 * 0.0f, n17 * 0.004f, n17 * 0.0f);
                            }
                            class757.method22564(0.0, 0.0, n16 * 0.2f);
                            class757.method22565(1.0f, 1.0f, 1.0f + n16 * 0.2f);
                            class757.method22566(Vector3f.YN.rotationDegrees(n10 * 45.0f));
                            break;
                        }
                    }
                }
                else if (abstractClientPlayerEntity.method2744()) {
                    this.method35152(class757, class759, n4);
                    final int n18 = b3 ? 1 : -1;
                    class757.method22564(n18 * -0.4f, 0.800000011920929, 0.30000001192092896);
                    class757.method22566(Vector3f.YP.rotationDegrees(n18 * 65.0f));
                    class757.method22566(Vector3f.ZP.rotationDegrees(n18 * -85.0f));
                }
                else if (!class760.isCancelled()) {
                    class757.method22564((b3 ? 1 : -1) * (-0.4f * MathHelper.sin(MathHelper.method35640(n3) * 3.1415927f)), 0.2f * MathHelper.sin(MathHelper.method35640(n3) * 6.2831855f), -0.2f * MathHelper.sin(n3 * 3.1415927f));
                    this.method35152(class757, class759, n4);
                    this.method35151(class757, class759, n3);
                }
                if (class760 == null || class760.method16970()) {
                    this.method35143(abstractClientPlayerEntity, class756, b3 ? Class2016.field11490 : Class2016.field11489, !b3, class757, class758, n5);
                }
                Client.getInstance().getEventBus().post(new Class5716(false, n3, n4, class759, class756, class757));
            }
            class757.method22568();
        }
    }
    
    public void method35155() {
        this.field40662 = this.field40661;
        this.field40664 = this.field40663;
        final ClientPlayerEntity field4684 = this.field40658.player;
        final ItemStack method2713 = field4684.getHeldItemMainhand();
        final ItemStack method2714 = field4684.method2714();
        if (!field4684.method4134()) {
            final float method2715 = field4684.method2904(1.0f);
            if (Class9570.field41312.method22605()) {
                final boolean method2716 = Class9570.method35812(Class9570.field41312, this.field40659, method2713, field4684.inventory.field2743);
                final boolean method2717 = Class9570.method35812(Class9570.field41312, this.field40660, method2714, -1);
                if (!method2716) {
                    if (!Objects.equals(this.field40659, method2713)) {
                        this.field40659 = method2713;
                    }
                }
                if (!method2717) {
                    if (!Objects.equals(this.field40660, method2714)) {
                        this.field40660 = method2714;
                    }
                }
            }
            this.field40661 += MathHelper.clamp((Objects.equals(this.field40659, method2713) ? (method2715 * method2715 * method2715) : 0.0f) - this.field40661, -0.4f, 0.4f);
            this.field40663 += MathHelper.clamp((float)(Objects.equals(this.field40660, method2714) ? 1 : 0) - this.field40663, -0.4f, 0.4f);
        }
        else {
            this.field40661 = MathHelper.clamp(this.field40661 - 0.4f, 0.0f, 1.0f);
            this.field40663 = MathHelper.clamp(this.field40663 - 0.4f, 0.0f, 1.0f);
        }
        if (this.field40661 < 0.1f) {
            this.field40659 = method2713;
            if (Config.method28955()) {
                Class9216.method33901(this.field40659);
            }
        }
        if (this.field40663 < 0.1f) {
            this.field40660 = method2714;
            if (Config.method28955()) {
                Class9216.method33902(this.field40660);
            }
        }
    }
    
    public void method35156(final Class316 class316) {
        if (class316 != Class316.field1877) {
            this.field40663 = 0.0f;
        }
        else {
            this.field40661 = 0.0f;
        }
    }
    
    static {
        field40656 = Class6332.method18787(new ResourceLocation("textures/map/map_background.png"));
        field40657 = Class6332.method18787(new ResourceLocation("textures/map/map_background_checkerboard.png"));
    }
}
