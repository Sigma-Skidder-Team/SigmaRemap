// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.io.InputStream;
import java.util.Properties;
import java.util.Optional;
import java.util.function.Consumer;

public class Class567 extends Class566
{
    private static final ResourceLocation field3365;
    private final Minecraft field3366;
    private final Class8207 field3367;
    private final Consumer<Optional<Throwable>> field3368;
    private final boolean field3369;
    private float field3370;
    private long field3371;
    private long field3372;
    private int field3373;
    private int field3374;
    private int field3375;
    private int field3376;
    private boolean field3377;
    
    public Class567(final Minecraft field3366, final Class8207 field3367, final Consumer<Optional<Throwable>> field3368, final boolean b) {
        this.field3371 = -1L;
        this.field3372 = -1L;
        this.field3373 = 16777215;
        this.field3374 = 16777215;
        this.field3375 = 0;
        this.field3376 = 14821431;
        this.field3377 = false;
        this.field3366 = field3366;
        this.field3367 = field3367;
        this.field3368 = field3368;
        this.field3369 = false;
    }
    
    public static void method3306(final Minecraft class869) {
        class869.method5290().method5851(Class567.field3365, new Class1769());
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        final int method7696 = this.field3366.method5332().method7696();
        final int method7697 = this.field3366.method5332().method7697();
        final long method7698 = Util.method27837();
        if (this.field3369 && (this.field3367.method27190() || this.field3366.currentScreen != null) && this.field3372 == -1L) {
            this.field3372 = method7698;
        }
        final float n4 = (this.field3371 > -1L) ? ((method7698 - this.field3371) / 1000.0f) : -1.0f;
        final float n5 = (this.field3372 > -1L) ? ((method7698 - this.field3372) / 500.0f) : -1.0f;
        float method7699;
        if (n4 >= 1.0f) {
            this.field3377 = true;
            if (this.field3366.currentScreen != null) {
                this.field3366.currentScreen.render(0, 0, n3);
            }
            AbstractGui.fill(0, 0, method7696, method7697, this.field3373 | MathHelper.ceil((1.0f - MathHelper.clamp(n4 - 1.0f, 0.0f, 1.0f)) * 255.0f) << 24);
            method7699 = 1.0f - MathHelper.clamp(n4 - 1.0f, 0.0f, 1.0f);
        }
        else if (this.field3369) {
            if (this.field3366.currentScreen != null && n5 < 1.0f) {
                this.field3366.currentScreen.render(n, n2, n3);
            }
            AbstractGui.fill(0, 0, method7696, method7697, this.field3373 | MathHelper.ceil(MathHelper.clamp(n5, 0.15, 1.0) * 255.0) << 24);
            method7699 = MathHelper.clamp(n5, 0.0f, 1.0f);
        }
        else {
            AbstractGui.fill(0, 0, method7696, method7697, this.field3373 | 0xFF000000);
            method7699 = 1.0f;
        }
        final int n6 = (this.field3366.method5332().method7696() - 256) / 2;
        final int n7 = (this.field3366.method5332().method7697() - 256) / 2;
        this.field3366.method5290().method5849(Class567.field3365);
        RenderSystem.enableBlend();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, method7699);
        this.blit(n6, n7, 0, 0, 256, 256);
        this.field3370 = MathHelper.clamp(this.field3370 * 0.95f + this.field3367.method27189() * 0.050000012f, 0.0f, 1.0f);
        Class9570.field41188.method22608();
        if (n4 < 1.0f) {
            this.method3307(method7696 / 2 - 150, method7697 / 4 * 3, method7696 / 2 + 150, method7697 / 4 * 3 + 10, 1.0f - MathHelper.clamp(n4, 0.0f, 1.0f));
        }
        if (n4 >= 2.0f) {
            this.field3366.method5245(null);
        }
        if (this.field3371 == -1L && this.field3367.method27191()) {
            if (this.field3369) {
                if (n5 < 2.0f) {
                    return;
                }
            }
            try {
                this.field3367.method27192();
                this.field3368.accept(Optional.empty());
            }
            catch (final Throwable value) {
                this.field3368.accept(Optional.of(value));
            }
            this.field3371 = Util.method27837();
            if (this.field3366.currentScreen != null) {
                this.field3366.currentScreen.init(this.field3366, this.field3366.method5332().method7696(), this.field3366.method5332().method7697());
            }
        }
    }
    
    private void method3307(final int n, final int n2, final int n3, final int n4, final float n5) {
        final int method35649 = MathHelper.ceil((n3 - n - 1) * this.field3370);
        final float n6 = (float)(this.field3373 >> 16 & 0xFF);
        final float n7 = (float)(this.field3373 >> 8 & 0xFF);
        final float n8 = (float)(this.field3373 & 0xFF);
        AbstractGui.fill(n - 1, n2 - 1, n3 + 1, n4 + 1, 0xFF000000 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3375 >> 16 & 0xFF), n6) << 16 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3375 >> 8 & 0xFF), n7) << 8 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3375 & 0xFF), n8));
        AbstractGui.fill(n, n2, n3, n4, this.field3374 | 0xFF000000);
        AbstractGui.fill(n + 1, n2 + 1, n + method35649, n4 - 1, 0xFF000000 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3376 >> 16 & 0xFF), n6) << 16 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3376 >> 8 & 0xFF), n7) << 8 | (int) MathHelper.method35700(1.0f - n5, (float)(this.field3376 & 0xFF), n8));
    }
    
    @Override
    public boolean method3305() {
        return true;
    }
    
    public void method3308() {
        this.field3373 = 16777215;
        this.field3374 = 16777215;
        this.field3376 = 14821431;
        if (Config.method28945()) {
            try {
                final String str = "optifine/color.properties";
                final ResourceLocation class1932 = new ResourceLocation(str);
                if (!Config.method28900(class1932)) {
                    return;
                }
                final InputStream method28897 = Config.method28897(class1932);
                Config.method28847("Loading " + str);
                final Class27 class1933 = new Class27();
                class1933.load(method28897);
                method28897.close();
                this.field3373 = method3309(class1933, "screen.loading", this.field3373);
                this.field3375 = method3309(class1933, "screen.loading.outline", this.field3375);
                this.field3374 = method3309(class1933, "screen.loading.bar", this.field3374);
                this.field3376 = method3309(class1933, "screen.loading.progress", this.field3376);
            }
            catch (final Exception ex) {
                Config.warn(ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
    }
    
    private static int method3309(final Properties properties, final String str, final int n) {
        final String property = properties.getProperty(str);
        if (property == null) {
            return n;
        }
        final String trim = property.trim();
        final int method3310 = method3310(trim, n);
        if (method3310 >= 0) {
            Config.method28847(str + " = " + trim);
            return method3310;
        }
        Config.warn("Invalid color: " + str + " = " + trim);
        return method3310;
    }
    
    private static int method3310(String trim, final int n) {
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
    
    public boolean method3311() {
        return this.field3377;
    }
    
    static {
        field3365 = new ResourceLocation("textures/gui/title/mojang.png");
    }
}
