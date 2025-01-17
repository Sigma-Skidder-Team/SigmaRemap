// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.util.Optional;
import java.util.function.Consumer;

public class Class568 extends Class566
{
    private static final ResourceLocation field3378;
    private final Minecraft field3379;
    private final Class8207 field3380;
    private final Consumer<Optional<Throwable>> field3381;
    private final boolean field3382;
    private float field3383;
    private long field3384;
    private long field3385;
    private int field3386;
    private int field3387;
    private int field3388;
    private boolean field3389;
    public static Texture field3390;
    public static Texture field3391;
    public static Texture field3392;
    private float field3393;
    
    public Class568(final Minecraft field3379, final Class8207 field3380, final Consumer<Optional<Throwable>> field3381, final boolean field3382) {
        this.field3384 = -1L;
        this.field3385 = -1L;
        this.field3386 = 0;
        this.field3387 = 16777215;
        this.field3388 = 14821431;
        this.field3389 = false;
        this.field3379 = field3379;
        this.field3380 = field3380;
        this.field3381 = field3381;
        this.field3382 = field3382;
    }
    
    public static void method3313() {
        Class568.field3390 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/sigma/logo.png");
        Class568.field3391 = ClientAssets.getTexture("com/mentalfrostbyte/gui/resources/loading/back.png");
        Class568.field3392 = ClientAssets.method25396("com/mentalfrostbyte/gui/resources/loading/back.png", 0.25f, 25);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.field3379.field4632.method7696();
        this.field3379.field4632.method7697();
        final long method27837 = Util.method27837();
        if (this.field3382 && (this.field3380.method27190() || this.field3379.field4700 != null) && this.field3385 == -1L) {
            this.field3385 = method27837;
        }
        final float n4 = (this.field3384 > -1L) ? ((method27837 - this.field3384) / 200.0f) : -1.0f;
        final float n5 = (this.field3385 > -1L) ? ((method27837 - this.field3385) / 100.0f) : -1.0f;
        final float n6 = 1.0f;
        final int n7 = (this.field3379.field4632.method7696() - 256) / 2;
        final int n8 = (this.field3379.field4632.method7697() - 256) / 2;
        this.field3383 = this.field3383 * 0.95f + this.field3380.method27189() * 0.050000012f;
        GL11.glPushMatrix();
        float n9 = 1111.0f;
        if (this.field3379.field4632.method7694() != 0) {
            n9 = (float)(this.field3379.field4632.method7692() / this.field3379.field4632.method7694());
        }
        final float n10 = this.field3379.field4632.method7687(this.field3379.gameSettings.field23473, this.field3379.method5240()) * n9;
        GL11.glScalef(1.0f / n10, 1.0f / n10, 0.0f);
        method3314(n6, this.field3383);
        GL11.glPopMatrix();
        if (n4 >= 2.0f) {
            this.field3379.method5245(null);
        }
        if (this.field3384 == -1L && this.field3380.method27191()) {
            if (this.field3382) {
                if (n5 < 2.0f) {
                    return;
                }
            }
            try {
                this.field3380.method27192();
                this.field3381.accept(Optional.empty());
            }
            catch (final Throwable value) {
                this.field3381.accept(Optional.of(value));
            }
            this.field3384 = Util.method27837();
            if (this.field3379.field4700 != null) {
                this.field3379.field4700.init(this.field3379, this.field3379.method5332().method7696(), this.field3379.method5332().method7697());
            }
        }
    }
    
    public static void method3314(final float n, final float n2) {
        if (Class568.field3390 == null) {
            method3313();
        }
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        Class8154.method26904(0.0f, 0.0f, (float) Minecraft.method5277().field4632.method7694(), (float) Minecraft.method5277().field4632.method7695(), Class568.field3392, n);
        Class8154.method26874(0.0f, 0.0f, (float) Minecraft.method5277().field4632.method7694(), (float) Minecraft.method5277().field4632.method7695(), Class6430.method19118(0, 0.75f));
        final int n3 = 455;
        final int n4 = 78;
        final int n5 = (Minecraft.method5277().field4632.method7694() - n3) / 2;
        final int round = Math.round((Minecraft.method5277().field4632.method7695() - n4) / 2 - 14.0f * n);
        final float n6 = 0.75f + n * n * n * n * 0.25f;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(Minecraft.method5277().field4632.method7694() / 2), (float)(Minecraft.method5277().field4632.method7695() / 2), 0.0f);
        GL11.glScalef(n6, n6, 0.0f);
        GL11.glTranslatef((float)(-Minecraft.method5277().field4632.method7694() / 2), (float)(-Minecraft.method5277().field4632.method7695() / 2), 0.0f);
        Class8154.method26899((float)n5, (float)round, (float)n3, (float)n4, Class568.field3390, Class6430.method19118(Class265.field1278.field1292, n));
        final float min = Math.min(1.0f, n2 * 1.02f);
        final int n7 = 80;
        if (n == 1.0f) {
            Class8154.method26925((float)n5, (float)(round + n4 + n7), (float)n3, 20.0f, 10.0f, Class6430.method19118(Class265.field1278.field1292, 0.3f * n));
            Class8154.method26925((float)(n5 + 1), (float)(round + n4 + n7 + 1), (float)(n3 - 2), 18.0f, 9.0f, Class6430.method19118(Class265.field1273.field1292, 1.0f * n));
        }
        Class8154.method26925((float)(n5 + 2), (float)(round + n4 + n7 + 2), (float)(int)((n3 - 4) * min), 16.0f, 8.0f, Class6430.method19118(Class265.field1278.field1292, 0.9f * n));
        GL11.glPopMatrix();
    }
    
    private void method3315(final int n, final int n2, final int n3, final int n4, final float n5, final float n6) {
        final int method35649 = MathHelper.ceil((n3 - n - 2) * n5);
        final float n7 = (float)(this.field3386 >> 16 & 0xFF);
        final float n8 = (float)(this.field3386 >> 8 & 0xFF);
        final float n9 = (float)(this.field3386 & 0xFF);
        AbstractGui.fill(n - 1, n2 - 1, n3 + 1, n4 + 1, 0xFF000000 | Math.round((1.0f - n6) * n7) << 16 | Math.round((1.0f - n6) * n8) << 8 | Math.round((1.0f - n6) * n9));
        AbstractGui.fill(n, n2, n3, n4, this.field3387 | 0xFF000000);
        AbstractGui.fill(n + 1, n2 + 1, n + method35649, n4 - 1, 0xFF000000 | (int) MathHelper.method35700(1.0f - n6, (float)(this.field3388 >> 16 & 0xFF), n7) << 16 | (int) MathHelper.method35700(1.0f - n6, (float)(this.field3388 >> 8 & 0xFF), n8) << 8 | (int) MathHelper.method35700(1.0f - n6, (float)(this.field3388 & 0xFF), n9));
    }
    
    @Override
    public boolean method3305() {
        return true;
    }
    
    public void method3316() {
        this.field3386 = 16777215;
        this.field3387 = 16777215;
        this.field3388 = 14821431;
    }
    
    private static int method3317(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        try {
            return Integer.parseInt(trim, 16) & 0xFFFFFF;
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public boolean method3318() {
        return this.field3389;
    }
    
    static {
        field3378 = new ResourceLocation("textures/gui/title/mojang.png");
    }
}
