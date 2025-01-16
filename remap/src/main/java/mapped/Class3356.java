// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.lwjgl.opengl.GL11;

public class Class3356 extends Class3355
{
    public Class9572 field15985;
    public static Class6153 field15986;
    private static final String field15987 = "Show in GUI";
    private static final String field15988 = "Smart Visibility";
    private static final String field15989 = "Size";
    public int field15990;
    
    public Class3356() {
        super("RearView", "See behind you", Class8013.field32991);
        this.field15990 = 0;
        this.field15985 = new Class9572(230, 200, Class2186.field12965);
        this.method9881(new Class4999("Show in GUI", "Makes the Rear View visible in guis", false));
        this.method9881(new Class4999("Smart Visibility", "Only pops up when a player is behind you", false));
        this.method9881(new Class4996("Size", "The rear view width", 400.0f, Integer.class, 120.0f, 1000.0f, 1.0f));
        this.method9915(false);
    }
    
    @Class6753
    public void method10622(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Config.method28955()) {
            Class9463.method35173().method35197().method25776(new Class6224("RearView", "Not compatible with Shaders"));
            this.method9909(false);
        }
        if (Class3356.field15986 != null) {
            if (Class3356.field15986.field24886 != Class3356.field15514.field4632.method7692() || Class3356.field15986.field24887 != Class3356.field15514.field4632.method7693()) {
                this.method9879();
            }
        }
        if (this.method9883("Smart Visibility")) {
            if (Class3356.field15514.world.method6739((Class<? extends Entity>) PlayerEntity.class, Class3356.field15514.player.getBoundingBox().intersect(14.0), class5744 -> {
                final boolean b;
                if (class5744.method1732(Class3356.field15514.player) < 12.0f) {
                    if (!this.method10623(class5744)) {
                        if (Class3356.field15514.player != class5744) {
                            if (!Class9463.method35173().method35191().method31751(class5744)) {
                                return b;
                            }
                        }
                    }
                }
                return b;
            }).isEmpty()) {
                if (this.field15990 > 0) {
                    --this.field15990;
                }
            }
            else {
                this.field15990 = 5;
            }
        }
    }
    
    public boolean method10623(final LivingEntity class511) {
        return this.method10624(Class3356.field15514.player.rotationYaw, Class8845.method30913(class511, Class3356.field15514.player.posX, Class3356.field15514.player.posY, Class3356.field15514.player.posZ)[0]) <= 90.0f;
    }
    
    public float method10624(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 <= 180.0f) ? n3 : (360.0f - n3);
    }
    
    @Class6753
    public void method10625(final Class5740 class5740) {
        if (Class3356.field15986 == null) {
            return;
        }
        if (!this.method9906()) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            if (!this.method9883("Smart Visibility")) {
                this.field15985.method35855((Class3356.field15514.field4700 != null && !this.method9883("Show in GUI")) ? Class2186.field12965 : Class2186.field12964);
            }
            else {
                this.field15985.method35855((this.field15990 <= 0) ? Class2186.field12965 : Class2186.field12964);
            }
            final float n = Class3356.field15514.field4632.method7694() / (float)Class3356.field15514.field4632.method7695();
            final int n2 = (int)this.method9886("Size");
            final int n3 = (int)(n2 / n);
            final int n4 = 10;
            int n5 = -n4 - n3;
            if (this.field15985.method35858() == 0.0f && this.field15985.method35858() == 1.0f) {
                if (this.field15985.method35858() == 0.0f) {
                    return;
                }
            }
            else if (this.field15985.method35857() != Class2186.field12964) {
                n5 *= (int)Class8862.method31033(this.field15985.method35858(), 0.49, 0.59, 0.16, 1.04);
            }
            else {
                n5 *= (int)Class8862.method31033(this.field15985.method35858(), 0.3, 0.88, 0.47, 1.0);
            }
            Class8154.method26913((float)(Class3356.field15514.field4632.method7694() - n4 - n2), (float)(Class3356.field15514.field4632.method7695() + n5), (float)n2, (float)(n3 - 1), 14.0f, this.field15985.method35858());
            final int n6 = (int)(n2 * Class9000.field37993);
            final int n7 = (int)(n3 * Class9000.field37993);
            final int n8 = (int)(n4 * Class9000.field37993);
            final int n9 = (int)(n5 * Class9000.field37993);
            RenderSystem.method30059();
            this.method10626(Class3356.field15986, n6, n7, Class3356.field15514.field4632.method7692() - n8 - n6, Class3356.field15514.field4632.method7693() + n9);
            RenderSystem.method30060();
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, Class3356.field15514.field4632.method7692() / Class3356.field15514.field4632.method7700(), Class3356.field15514.field4632.method7693() / Class3356.field15514.field4632.method7700(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.method30065(0.0f, 0.0f, -2000.0f);
            GL11.glScaled(1.0 / Class3356.field15514.field4632.method7700() * Class9000.field37993, 1.0 / Class3356.field15514.field4632.method7700() * Class9000.field37993, 1.0);
            Class3356.field15986.method18397();
            Class3356.field15514.method5234().method18395(true);
        }
    }
    
    public void method10626(final Class6153 class6153, final int n, final int n2, final double n3, double n4) {
        n4 = n4 - Class3356.field15514.field4632.method7693() + n2;
        RenderSystem.method30049(true, true, true, false);
        RenderSystem.disableDepthTest();
        RenderSystem.method30010(false);
        RenderSystem.method30057(5889);
        RenderSystem.method30058();
        RenderSystem.method30061(0.0, n + n3, n2, 0.0, 1000.0, 3000.0);
        RenderSystem.method30057(5888);
        RenderSystem.method30058();
        RenderSystem.method30065(0.0f, 0.0f, -2000.0f);
        RenderSystem.method30048(0, 0, n + (int)n3, n2 - (int)n4);
        RenderSystem.enableTexture();
        RenderSystem.method30002();
        RenderSystem.disableAlphaTest();
        RenderSystem.disableBlend();
        RenderSystem.method30003();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        class6153.method18393();
        final float n5 = (float)n;
        final float n6 = (float)n2;
        final float n7 = class6153.field24886 / (float)class6153.field24884;
        final float n8 = class6153.field24887 / (float)class6153.field24885;
        final Tessellator method30116 = RenderSystem.method30116();
        final BufferBuilder method30117 = method30116.getBuffer();
        method30117.begin(7, DefaultVertexFormats.field39619);
        method30117.pos(n3, n6 + n4, 0.0).tex(0.0f, 0.0f).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(n5 + n3, n6 + n4, 0.0).tex(n7, 0.0f).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(n5 + n3, n4, 0.0).tex(n7, n8).method12399(255, 255, 255, 255).endVertex();
        method30117.pos(n3, n4, 0.0).tex(0.0f, n8).method12399(255, 255, 255, 255).endVertex();
        method30116.draw();
        class6153.method18394();
        RenderSystem.method30010(true);
        RenderSystem.method30049(true, true, true, true);
    }
    
    @Class6753
    public void method10627(final Class5741 class5741) {
        if (!this.method9906()) {
            return;
        }
        if (Class3356.field15986 != null) {
            if (Class3356.field15514.field4700 != null) {
                if (!this.method9883("Show in GUI")) {
                    if (this.field15990 == 0) {
                        return;
                    }
                }
            }
            Class8154.method26918();
            RenderSystem.method30059();
            RenderSystem.method30056(16640, false);
            Class3356.field15986.method18395(true);
            RenderSystem.enableTexture();
            RenderSystem.method30003();
            Math.max(Math.min(Minecraft.method5338(), Class3356.field15514.gameSettings.field23383), 60);
            final long n = Util.method27838() - class5741.field23313;
            final float field2399 = Class3356.field15514.player.rotationYaw;
            final Class756 field2400 = Class3356.field15514.player;
            field2400.rotationYaw += 180.0f;
            RenderSystem.enableDepthTest();
            GL11.glAlphaFunc(519, 0.0f);
            final double field2401 = Class3356.field15514.gameSettings.field23471;
            Class3356.field15514.gameSettings.field23471 = 114.0;
            Class3356.field15514.field4644.field9392 = false;
            Class9463.field40711 = true;
            final Class6153 field2402 = Class3356.field15514.field4636.field9308;
            Class3356.field15514.field4636.field9308 = null;
            Class3356.field15514.field4644.method5820(class5741.field23312, Util.method27838(), new MatrixStack());
            Class3356.field15514.field4636.field9308 = field2402;
            Class9463.field40711 = false;
            Class3356.field15514.field4644.field9392 = true;
            Class3356.field15514.gameSettings.field23471 = field2401;
            Class3356.field15514.player.rotationYaw = field2399;
            RenderSystem.method30060();
            Class3356.field15514.method5234().method18395(true);
            return;
        }
        this.method9879();
    }
    
    @Override
    public void method9879() {
        Class8154.method26919(Class3356.field15514.method5234());
        final int method7692 = Class3356.field15514.field4632.method7692();
        final int method7693 = Class3356.field15514.field4632.method7693();
        final boolean b = true;
        final Minecraft field15514 = Class3356.field15514;
        (Class3356.field15986 = new Class6153(method7692, method7693, b, Minecraft.field4623)).method18398(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void method9897() {
        this.field15985.method35855(Class2186.field12965);
    }
}
