// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;

import com.mojang.authlib.GameProfile;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.List;
import org.apache.logging.log4j.Logger;

public abstract class Class4710<T extends LivingEntity, M extends Class5845<T>> extends Class4703<T> implements Class4778<T, M>
{
    private static final Logger field20300;
    public M field20301;
    public final List<Class1799<T, M>> field20302;
    public LivingEntity field20303;
    public float field20304;
    public float field20305;
    public float field20306;
    public float field20307;
    public float field20308;
    public float field20309;
    private boolean field20310;
    private boolean field20311;
    public static final boolean field20312;
    public UUID field20313;
    
    public Class4710(final Class8551 class8551, final M field20301, final float field20302) {
        super(class8551);
        this.field20302 = Lists.newArrayList();
        this.field20313 = UUID.randomUUID();
        this.field20301 = field20301;
        this.field20284 = field20302;
        this.field20310 = (this.field20301 instanceof Class5880);
    }
    
    public final boolean method13978(final Class1799<T, M> class1799) {
        return this.field20302.add(class1799);
    }
    
    @Override
    public M method13979() {
        return this.field20301;
    }
    
    public void method13980(final T field20303, final float n, final float f, final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n2) {
        if (!Class9570.field41413.method22619() || !Class9570.method35840(Class9570.field41413, field20303, this, f, class7351, class7352, n2)) {
            if (Class4710.field20312) {
                field20303.field2946 = 1.0f;
            }
            class7351.method22567();
            this.field20301.field23955 = this.method13986(field20303, f);
            this.field20301.field23956 = field20303.isPassenger();
            if (Class9570.field41255.method22605()) {
                final Class5845<T> field20304 = this.field20301;
                boolean field20305 = false;
                Label_0425: {
                    if (field20303.isPassenger()) {
                        if (field20303.method1920() != null) {
                            if (Class9570.method35820(field20303.method1920(), Class9570.field41255, new Object[0])) {
                                field20305 = true;
                                break Label_0425;
                            }
                        }
                    }
                    field20305 = false;
                }
                field20304.field23956 = field20305;
            }
            this.field20301.field23957 = field20303.method2625();
            float method35706 = MathHelper.method35706(f, field20303.field2952, field20303.field2951);
            final float method35707 = MathHelper.method35706(f, field20303.field2954, field20303.field2953);
            float n3 = method35707 - method35706;
            if (this.field20301.field23956) {
                if (field20303.method1920() instanceof LivingEntity) {
                    final LivingEntity class7353 = (LivingEntity)field20303.method1920();
                    float method35708 = MathHelper.method35668(method35707 - MathHelper.method35706(f, class7353.field2952, class7353.field2951));
                    if (method35708 < -85.0f) {
                        method35708 = -85.0f;
                    }
                    if (method35708 >= 85.0f) {
                        method35708 = 85.0f;
                    }
                    method35706 = method35707 - method35708;
                    if (method35708 * method35708 > 2500.0f) {
                        method35706 += method35708 * 0.2f;
                    }
                    n3 = method35707 - method35706;
                }
            }
            final Class5729 class7354 = new Class5729(method35706, method35707, n3, MathHelper.method35700(f, field20303.prevRotationPitch, field20303.rotationPitch), f, field20303);
            Client.getInstance().getEventBus().method21097(class7354);
            if (class7354.isCancelled()) {
                class7351.method22568();
                return;
            }
            final float method35709 = class7354.method17007();
            class7354.method17008();
            final float method35710 = class7354.method17009();
            final float method35711 = class7354.method17010();
            if (field20303.method1654() == Pose.field1665) {
                final Direction method35712 = field20303.method2788();
                if (method35712 != null) {
                    final float n4 = field20303.method1891(Pose.field1663) - 0.1f;
                    class7351.method22564(-method35712.getXOffset() * n4, 0.0, -method35712.getZOffset() * n4);
                }
            }
            final float method35713 = this.method13987(field20303, f);
            this.method13985(field20303, class7351, method35713, method35709, f);
            class7351.method22565(-1.0f, -1.0f, 1.0f);
            this.method13990(field20303, class7351, f);
            class7351.method22564(0.0, -1.5010000467300415, 0.0);
            float method35714 = 0.0f;
            float field20306 = 0.0f;
            if (!field20303.isPassenger()) {
                if (field20303.method1768()) {
                    method35714 = MathHelper.method35700(f, field20303.field2945, field20303.field2946);
                    field20306 = field20303.field2947 - field20303.field2946 * (1.0f - f);
                    if (field20303.method2625()) {
                        field20306 *= 3.0f;
                    }
                    if (method35714 > 1.0f) {
                        method35714 = 1.0f;
                    }
                }
            }
            this.field20301.method17558(field20303, field20306, method35714, f);
            this.field20301.method17557(field20303, field20306, method35714, method35713, method35710, method35711);
            if (Class8906.method31391()) {
                this.field20303 = field20303;
                this.field20304 = field20306;
                this.field20305 = method35714;
                this.field20306 = method35713;
                this.field20307 = method35710;
                this.field20308 = method35711;
                this.field20309 = f;
            }
            final boolean method35715 = this.method13983(field20303);
            final boolean b = !method35715 && !field20303.method1824(Minecraft.getInstance().player);
            class7354.method17005(Class1953.field10633);
            Client.getInstance().getEventBus().method21097(class7354);
            Class6332 class7355;
            if (!class7354.method17019() && field20303 instanceof Class755) {
                class7355 = this.method13981((T)new Class755(Minecraft.getInstance().world, new GameProfile(this.field20313, "Steve")), method35715, b);
            }
            else {
                class7355 = this.method13981(field20303, method35715, b);
            }
            if (class7355 != null) {
                final Class4150 method35716 = class7352.method25214(class7355);
                final int method35717 = method13982(field20303, this.method13989(field20303, f));
                if (Class8880.method31235()) {
                    Class8880.method31237();
                }
                if (this.field20310) {
                    RenderSystem.pushMatrix();
                }
                this.field20301.method17564(class7351, method35716, n2, method35717, 1.0f, 1.0f, 1.0f, b ? 0.15f : 1.0f);
                if (this.field20310) {
                    RenderSystem.popMatrix();
                }
                if (Class8880.method31235()) {
                    if (Class8880.method31239()) {
                        this.field20310 = true;
                        Class8880.method31240();
                        RenderSystem.pushMatrix();
                        this.field20301.method17564(class7351, method35716, n2, method35717, 1.0f, 1.0f, 1.0f, b ? 0.15f : 1.0f);
                        RenderSystem.popMatrix();
                        Class8880.method31241();
                    }
                    Class8880.method31242();
                }
            }
            if (!field20303.isSpectator()) {
                if (class7354.method17017()) {
                    for (final Class1799 class7356 : this.field20302) {
                        if (Class8880.method31235()) {
                            Class8880.method31237();
                        }
                        if (this.field20311) {
                            RenderSystem.pushMatrix();
                        }
                        class7356.method6554(class7351, class7352, n2, field20303, field20306, method35714, f, method35713, method35710, method35711);
                        if (this.field20311) {
                            RenderSystem.popMatrix();
                        }
                        if (!Class8880.method31235()) {
                            continue;
                        }
                        if (Class8880.method31239()) {
                            this.field20311 = true;
                            Class8880.method31240();
                            RenderSystem.pushMatrix();
                            class7356.method6554(class7351, class7352, n2, field20303, field20306, method35714, f, method35713, method35710, method35711);
                            RenderSystem.popMatrix();
                            Class8880.method31241();
                        }
                        Class8880.method31242();
                    }
                }
            }
            if (Class8906.method31391()) {
                this.field20303 = null;
            }
            class7354.method17005(Class1953.field10634);
            Client.getInstance().getEventBus().method21097(class7354);
            class7351.method22568();
            super.method13951(field20303, n, f, class7351, class7352, n2);
            if (Class9570.field41415.method22619()) {
                Class9570.method35840(Class9570.field41415, field20303, this, f, class7351, class7352, n2);
            }
        }
    }
    
    @Nullable
    public Class6332 method13981(final T t, final boolean b, final boolean b2) {
        final ResourceLocation method13950 = this.method13950(t);
        if (b2) {
            return Class6332.method18773(method13950);
        }
        if (!b) {
            return t.method1821() ? Class6332.method18783(method13950) : null;
        }
        return this.field20301.method17647(method13950);
    }
    
    public static int method13982(final LivingEntity class511, final float n) {
        return Class1904.method7387(Class1904.method7385(n), Class1904.method7386(class511.field2938 > 0 || class511.field2941 > 0));
    }
    
    public boolean method13983(final T t) {
        return !t.method1823();
    }
    
    private static float method13984(final Direction class179) {
        switch (Class9538.field41054[class179.ordinal()]) {
            case 1: {
                return 90.0f;
            }
            case 2: {
                return 0.0f;
            }
            case 3: {
                return 270.0f;
            }
            case 4: {
                return 180.0f;
            }
            default: {
                return 0.0f;
            }
        }
    }
    
    public void method13985(final T t, final MatrixStack class7351, final float n, final float n2, final float n3) {
        final Pose method1654 = t.method1654();
        if (method1654 != Pose.field1665) {
            class7351.method22566(Vector3f.YP.rotationDegrees(180.0f - n2));
        }
        if (t.field2941 <= 0) {
            if (!t.method2744()) {
                if (method1654 != Pose.field1665) {
                    if (t.hasCustomName() || t instanceof PlayerEntity) {
                        final String method1655 = TextFormatting.getTextWithoutFormattingCodes(t.getName().getString());
                        if ("Dinnerbone".equals(method1655) || "Grumm".equals(method1655)) {
                            if (!(t instanceof PlayerEntity) || ((PlayerEntity)t).method2895(Class189.field610)) {
                                class7351.method22564(0.0, t.method1931() + 0.1f, 0.0);
                                class7351.method22566(Vector3f.ZP.rotationDegrees(180.0f));
                            }
                        }
                    }
                }
                else {
                    final Direction method1656 = t.method2788();
                    class7351.method22566(Vector3f.YP.rotationDegrees((method1656 == null) ? n2 : method13984(method1656)));
                    class7351.method22566(Vector3f.ZP.rotationDegrees(this.method13988(t)));
                    class7351.method22566(Vector3f.YP.rotationDegrees(270.0f));
                }
            }
            else {
                class7351.method22566(Vector3f.XP.rotationDegrees(-90.0f - t.rotationPitch));
                class7351.method22566(Vector3f.YP.rotationDegrees((t.ticksExisted + n3) * -75.0f));
            }
        }
        else {
            float method1657 = MathHelper.method35640((t.field2941 + n3 - 1.0f) / 20.0f * 1.6f);
            if (method1657 > 1.0f) {
                method1657 = 1.0f;
            }
            class7351.method22566(Vector3f.ZP.rotationDegrees(method1657 * this.method13988(t)));
        }
    }
    
    public float method13986(final T t, final float n) {
        return t.method2748(n);
    }
    
    public float method13987(final T t, final float n) {
        return t.ticksExisted + n;
    }
    
    public float method13988(final T t) {
        return 90.0f;
    }
    
    public float method13989(final T t, final float n) {
        return 0.0f;
    }
    
    public void method13990(final T t, final MatrixStack class7351, final float n) {
    }
    
    public boolean method13991(final T t) {
        final Class5749 class5749 = new Class5749(t);
        Client.getInstance().getEventBus().method21097(class5749);
        if (class5749.isCancelled()) {
            return false;
        }
        final double method28715 = this.field20283.method28715(t);
        final float n = t.method1812() ? 32.0f : 64.0f;
        if (method28715 >= n * n) {
            return false;
        }
        final Minecraft method28716 = Minecraft.getInstance();
        final ClientPlayerEntity field4684 = method28716.player;
        final boolean b = !t.method1824(field4684);
        if (t != field4684) {
            final Team method28717 = t.getTeam();
            final Team method28718 = field4684.getTeam();
            if (method28717 != null) {
                switch (Class9538.field41055[method28717.method20554().ordinal()]) {
                    case 1: {
                        return b;
                    }
                    case 2: {
                        return false;
                    }
                    case 3: {
                        return (method28718 == null) ? b : (method28717.method20565(method28718) && (method28717.method20552() || b));
                    }
                    case 4: {
                        return (method28718 == null) ? b : (!method28717.method20565(method28718) && b);
                    }
                    default: {
                        return true;
                    }
                }
            }
        }
        return Minecraft.method5270() && t != method28716.method5303() && b && !t.isBeingRidden();
    }
    
    public List<Class1799<T, M>> method13992() {
        return this.field20302;
    }
    
    static {
        field20300 = LogManager.getLogger();
        field20312 = Boolean.getBoolean("animate.model.living");
    }
}
