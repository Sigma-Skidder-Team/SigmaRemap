// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.Style;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import javax.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public class Class1660 implements AutoCloseable, Class1657
{
    private static final Logger field9379;
    private final Class869 field9380;
    private final Class6582 field9381;
    private final Random field9382;
    private float field9383;
    public final Class9458 field9384;
    private final Class1905 field9385;
    private final Class3442 field9386;
    private int field9387;
    private float field9388;
    private float field9389;
    private float field9390;
    private float field9391;
    public boolean field9392;
    private boolean field9393;
    private long field9394;
    private long field9395;
    public final Class392 field9396;
    private final Class1904 field9397;
    private boolean field9398;
    private float field9399;
    private float field9400;
    private float field9401;
    private ItemStack field9402;
    private int field9403;
    private float field9404;
    private float field9405;
    public Class1884 field9406;
    public static final ResourceLocation[] field9407;
    public static final int field9408;
    public int field9409;
    private boolean field9410;
    private final Class6092 field9411;
    private boolean field9412;
    private World field9413;
    private float field9414;
    private long field9415;
    private int field9416;
    private int field9417;
    private int field9418;
    private float field9419;
    private float field9420;
    private Class1884[] field9421;
    private boolean field9422;
    
    public Class1660(final Class869 field9380, final Class6582 field9381, final Class3442 field9382) {
        this.field9382 = new Random();
        this.field9392 = true;
        this.field9393 = true;
        this.field9395 = Util.method27837();
        this.field9397 = new Class1904();
        this.field9399 = 1.0f;
        this.field9409 = Class1660.field9408;
        this.field9411 = new Class6092();
        this.field9412 = false;
        this.field9413 = null;
        this.field9414 = 128.0f;
        this.field9415 = 0L;
        this.field9416 = 0;
        this.field9417 = 0;
        this.field9418 = 0;
        this.field9419 = 0.0f;
        this.field9420 = 0.0f;
        this.field9421 = new Class1884[10];
        this.field9422 = false;
        this.field9380 = field9380;
        this.field9381 = field9381;
        this.field9384 = field9380.method5308();
        this.field9385 = new Class1905(field9380.method5290());
        this.field9396 = new Class392(this, field9380);
        this.field9386 = field9382;
        this.field9406 = null;
    }
    
    @Override
    public void close() {
        this.field9396.close();
        this.field9385.close();
        this.field9397.close();
        this.method5800();
    }
    
    public void method5800() {
        if (this.field9406 != null) {
            this.field9406.close();
        }
        this.field9406 = null;
        this.field9409 = Class1660.field9408;
    }
    
    public void method5801() {
        this.field9410 = !this.field9410;
    }
    
    public void method5802(final Entity class399) {
        if (this.field9406 != null) {
            this.field9406.close();
        }
        this.field9406 = null;
        if (!(class399 instanceof Class765)) {
            if (!(class399 instanceof Class846)) {
                if (!(class399 instanceof Class850)) {
                    if (Class9570.field41296.method22605()) {
                        Class9570.method35818(Class9570.field41296, class399, this);
                    }
                }
                else {
                    this.method5803(new ResourceLocation("shaders/post/invert.json"));
                }
            }
            else {
                this.method5803(new ResourceLocation("shaders/post/spider.json"));
            }
        }
        else {
            this.method5803(new ResourceLocation("shaders/post/creeper.json"));
        }
    }
    
    public void method5803(final ResourceLocation class1932) {
        if (Class8543.method28676()) {
            if (this.field9406 != null) {
                this.field9406.close();
            }
            try {
                (this.field9406 = new Class1884(this.field9380.method5290(), this.field9381, this.field9380.method5234(), class1932)).method7246(this.field9380.method5332().method7692(), this.field9380.method5332().method7693());
                this.field9410 = true;
            }
            catch (final IOException ex) {
                Class1660.field9379.warn("Failed to load shader: {}", (Object)class1932, (Object)ex);
                this.field9409 = Class1660.field9408;
                this.field9410 = false;
            }
            catch (final JsonSyntaxException ex2) {
                Class1660.field9379.warn("Failed to load shader: {}", (Object)class1932, (Object)ex2);
                this.field9409 = Class1660.field9408;
                this.field9410 = false;
            }
        }
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        if (this.field9406 != null) {
            this.field9406.close();
        }
        this.field9406 = null;
        if (this.field9409 != Class1660.field9408) {
            this.method5803(Class1660.field9407[this.field9409]);
        }
        else {
            this.method5802(this.field9380.method5303());
        }
    }
    
    public void method5804() {
        this.method5808();
        this.field9396.method1416();
        if (this.field9380.method5303() == null) {
            this.field9380.method5304(this.field9380.field4684);
        }
        this.field9411.method18155();
        ++this.field9387;
        this.field9384.method35155();
        this.field9380.field4636.method5690(this.field9411);
        this.field9391 = this.field9390;
        if (!this.field9380.field4647.method3813().method3335()) {
            if (this.field9390 > 0.0f) {
                this.field9390 -= 0.0125f;
            }
        }
        else {
            this.field9390 += 0.05f;
            if (this.field9390 > 1.0f) {
                this.field9390 = 1.0f;
            }
        }
        if (this.field9403 > 0) {
            --this.field9403;
            if (this.field9403 == 0) {
                this.field9402 = null;
            }
        }
    }
    
    @Nullable
    public Class1884 method5805() {
        return this.field9406;
    }
    
    public void method5806(final int n, final int n2) {
        if (this.field9406 != null) {
            this.field9406.method7246(n, n2);
        }
        this.field9380.field4636.method5703(n, n2);
    }
    
    public void method5807(final float n) {
        final Entity method5303 = this.field9380.method5303();
        if (method5303 != null) {
            if (this.field9380.field4683 != null) {
                this.field9380.method5327().startSection("pick");
                this.field9380.field4690 = null;
                final double n2 = this.field9380.field4682.method27315();
                this.field9380.field4691 = method5303.method1748(n2, n, false);
                final Vec3d method5304 = method5303.method1747(n);
                boolean b = false;
                double n3 = n2;
                double n4;
                if (!this.field9380.field4682.method27333()) {
                    if (n2 > 3.0) {
                        b = true;
                    }
                    n4 = n2;
                }
                else {
                    n3 = (n4 = 6.0);
                }
                double method5305 = n3 * n3;
                if (this.field9380.field4691 != null) {
                    method5305 = this.field9380.field4691.getHitVec().squareDistanceTo(method5304);
                }
                final Vec3d method5306 = method5303.method1741(1.0f);
                final Class7007 method5307 = Class7476.method23096(method5303, method5304, method5304.add(method5306.x * n4, method5306.y * n4, method5306.z * n4), method5303.getBoundingBox().expand(method5306.scale(n4)).grow(1.0, 1.0, 1.0), class399 -> !class399.isSpectator() && class399.method1749(), method5305);
                if (method5307 != null) {
                    final Entity method5308 = method5307.method21452();
                    final Vec3d method5309 = method5307.getHitVec();
                    final double method5310 = method5304.squareDistanceTo(method5309);
                    if (b && method5310 > 9.0) {
                        this.field9380.field4691 = BlockRayTraceResult.createMiss(method5309, Direction.getFacingFromVector(method5306.x, method5306.y, method5306.z), new BlockPos(method5309));
                    }
                    else if (method5310 < method5305 || this.field9380.field4691 == null) {
                        this.field9380.field4691 = method5307;
                        if (method5308 instanceof LivingEntity || method5308 instanceof Class862) {
                            this.field9380.field4690 = method5308;
                        }
                    }
                }
                this.field9380.method5327().endSection();
            }
        }
    }
    
    private void method5808() {
        float method4104 = 1.0f;
        if (this.field9380.method5303() instanceof Class754) {
            method4104 = ((Class754)this.field9380.method5303()).method4104();
        }
        this.field9389 = this.field9388;
        this.field9388 += (method4104 - this.field9388) * 0.5f;
        if (this.field9388 > 1.5f) {
            this.field9388 = 1.5f;
        }
        if (this.field9388 < 0.1f) {
            this.field9388 = 0.1f;
        }
    }
    
    private double method5809(final Class6092 class6092, final float f, final boolean b) {
        if (!this.field9398) {
            double field23471 = 70.0;
            if (b) {
                field23471 = this.field9380.field4648.field23471;
                if (Config.method28974()) {
                    field23471 *= MathHelper.method35700(f, this.field9389, this.field9388);
                }
            }
            boolean method1056 = false;
            if (this.field9380.field4700 == null) {
                method1056 = this.field9380.field4648.field23563.method1056();
            }
            if (!method1056) {
                if (Config.field36033) {
                    Config.field36033 = false;
                    this.field9380.field4648.field23470 = false;
                    this.field9380.field4636.method5755();
                }
            }
            else {
                if (!Config.field36033) {
                    Config.field36033 = true;
                    this.field9380.field4648.field23470 = true;
                    this.field9380.field4636.method5755();
                }
                if (Config.field36033) {
                    field23471 /= 4.0;
                }
            }
            if (class6092.method18166() instanceof LivingEntity) {
                if (((LivingEntity)class6092.method18166()).method2664() <= 0.0f) {
                    field23471 /= (1.0f - 500.0f / (Math.min(((LivingEntity)class6092.method18166()).field2941 + f, 20.0f) + 500.0f)) * 2.0f + 1.0f;
                }
            }
            if (!class6092.method18169().isEmpty()) {
                field23471 = field23471 * 60.0 / 70.0;
            }
            return Class9570.field41294.method22605() ? Class9570.method35816(Class9570.field41294, this, class6092, f, field23471) : field23471;
        }
        return 90.0;
    }
    
    private void method5810(final Class7351 class7351, final float n) {
        if (this.field9380.method5303() instanceof LivingEntity) {
            final LivingEntity class7352 = (LivingEntity)this.field9380.method5303();
            final float n2 = class7352.field2938 - n;
            if (class7352.method2664() <= 0.0f) {
                class7351.method22566(Vector3f.ZP.rotationDegrees(40.0f - 8000.0f / (Math.min(class7352.field2941 + n, 20.0f) + 200.0f)));
            }
            if (n2 < 0.0f) {
                return;
            }
            final float n3 = n2 / class7352.field2939;
            final float method35638 = MathHelper.sin(n3 * n3 * n3 * n3 * 3.1415927f);
            final float field2940 = class7352.field2940;
            class7351.method22566(Vector3f.YP.rotationDegrees(-field2940));
            class7351.method22566(Vector3f.ZP.rotationDegrees(-method35638 * 14.0f));
            class7351.method22566(Vector3f.YP.rotationDegrees(field2940));
        }
    }
    
    private void method5811(final Class7351 class7351, final float n) {
        if (this.field9380.method5303() instanceof PlayerEntity) {
            final PlayerEntity class7352 = (PlayerEntity)this.field9380.method5303();
            final float n2 = -(class7352.distanceWalkedModified + (class7352.distanceWalkedModified - class7352.prevDistanceWalkedModified) * n);
            final float method35700 = MathHelper.method35700(n, class7352.field3012, class7352.field3013);
            class7351.method22564(MathHelper.sin(n2 * 3.1415927f) * method35700 * 0.5f, -Math.abs(MathHelper.cos(n2 * 3.1415927f) * method35700), 0.0);
            class7351.method22566(Vector3f.ZP.rotationDegrees(MathHelper.sin(n2 * 3.1415927f) * method35700 * 3.0f));
            class7351.method22566(Vector3f.XP.rotationDegrees(Math.abs(MathHelper.cos(n2 * 3.1415927f - 0.2f) * method35700) * 5.0f));
        }
    }
    
    private void method5812(final Class7351 class7351, final Class6092 class7352, final float n) {
        this.method5813(class7351, class7352, n, true, true, false);
    }
    
    public void method5813(final Class7351 class7351, final Class6092 class7352, final float n, final boolean b, final boolean b2, final boolean b3) {
        if (!this.field9398) {
            Class9216.method33914(true);
            this.method5814(this.method5815(class7352, n, false));
            final Class8996 method22569 = class7351.method22569();
            method22569.method32111().method20748();
            method22569.method32112().setIdentity();
            boolean b4 = false;
            if (b) {
                class7351.method22567();
                this.method5810(class7351, n);
                if (this.field9380.field4648.field23431) {
                    this.method5811(class7351, n);
                }
                b4 = (this.field9380.method5303() instanceof LivingEntity && ((LivingEntity)this.field9380.method5303()).method2783());
                if (this.field9380.field4648.field23465 == 0) {
                    if (!b4) {
                        if (!this.field9380.field4648.field23464) {
                            if (this.field9380.field4682.method27336() != Class101.field301) {
                                this.field9396.method1418();
                                if (!Config.method28955()) {
                                    this.field9384.method35153(n, class7351, this.field9386.method11006(), this.field9380.field4684, this.field9380.method5306().method28695(this.field9380.field4684, n));
                                }
                                else {
                                    Class7778.method24952(this.field9384, n, class7351, this.field9386.method11006(), this.field9380.field4684, this.field9380.method5306().method28695(this.field9380.field4684, n), b3);
                                }
                                this.field9396.method1417();
                            }
                        }
                    }
                }
                class7351.method22568();
            }
            Class9216.method33914(false);
            if (!b2) {
                return;
            }
            this.field9396.method1417();
            final Class5746 class7353 = new Class5746();
            Class9463.method35173().method35188().method21097(class7353);
            if (this.field9380.field4648.field23465 == 0) {
                if (!b4) {
                    if (!class7353.method16962()) {
                        Class9316.method34477(this.field9380, class7351);
                        this.method5810(class7351, n);
                    }
                }
            }
            if (this.field9380.field4648.field23431) {
                this.method5811(class7351, n);
            }
        }
    }
    
    public void method5814(final Matrix4f class6789) {
        Class8726.method30057(5889);
        Class8726.method30058();
        Class8726.method30067(class6789);
        Class8726.method30057(5888);
    }
    
    public Matrix4f method5815(final Class6092 class6092, final float n, final boolean b) {
        final Class7351 class6093 = new Class7351();
        class6093.method22569().method32111().method20748();
        if (Config.method28955()) {
            if (Class9216.method33915()) {
                Class9216.method33860(class6093);
            }
        }
        this.field9414 = this.field9383 * 2.0f;
        if (this.field9414 < 173.0f) {
            this.field9414 = 173.0f;
        }
        if (this.field9399 != 1.0f) {
            class6093.method22564(this.field9400, -this.field9401, 0.0);
            class6093.method22565(this.field9399, this.field9399, 1.0f);
        }
        class6093.method22569().method32111().method20752(Matrix4f.method20755(this.method5809(class6092, n, b), this.field9380.method5332().method7692() / (float)this.field9380.method5332().method7693(), 0.05f, this.field9414));
        return class6093.method22569().method32111();
    }
    
    public static float method5816(final LivingEntity class511, final float n) {
        final int method7907 = class511.method2654(Class9439.field40489).method7907();
        return (method7907 <= 200) ? (0.7f + MathHelper.sin((method7907 - n) * 3.1415927f * 0.2f) * 0.3f) : 1.0f;
    }
    
    public void method5817(final float n, final long n2, final boolean b) {
        this.method5824();
        if (!this.field9380.method5320() && this.field9380.field4648.field23395 && (!this.field9380.field4648.field23429 || !this.field9380.field4650.method26958())) {
            if (Util.method27837() - this.field9395 > 500L) {
                this.field9380.method5255(false);
            }
        }
        else {
            this.field9395 = Util.method27837();
        }
        if (!this.field9380.field4699) {
            final int i = (int)(this.field9380.field4650.method26959() * this.field9380.method5332().method7696() / this.field9380.method5332().method7694());
            final int j = (int)(this.field9380.field4650.method26960() * this.field9380.method5332().method7697() / this.field9380.method5332().method7695());
            final Class7351 class7351 = new Class7351();
            if (b && this.field9380.field4683 != null && !Config.method29020()) {
                this.field9380.method5327().startSection("level");
                Class9463.method35173().method35188().method21097(new Class5741(n, n2));
                this.method5820(n, n2, class7351);
                if (this.field9380.method5284() && this.field9394 < Util.method27837() - 1000L) {
                    this.field9394 = Util.method27837();
                    if (!this.field9380.method5285().method1464()) {
                        this.method5818();
                    }
                }
                this.field9380.field4636.method5693();
                if (this.field9406 != null && this.field9410) {
                    Class8726.method30012();
                    Class8726.method30007();
                    Class8726.method29998();
                    Class8726.method30040();
                    Class8726.method30057(5890);
                    Class8726.method30059();
                    Class8726.method30058();
                    this.field9406.method7247(n);
                    Class8726.method30060();
                }
                this.field9380.method5234().method18395(true);
            }
            else {
                Class8726.method30048(0, 0, this.field9380.method5332().method7692(), this.field9380.method5332().method7693());
            }
            final Class1925 method5332 = this.field9380.method5332();
            Class8726.method30056(256, Class869.field4623);
            Class8726.method30057(5889);
            Class8726.method30058();
            Class8726.method30061(0.0, method5332.method7692() / method5332.method7700(), method5332.method7693() / method5332.method7700(), 0.0, 1000.0, 3000.0);
            Class8726.method30057(5888);
            Class8726.method30058();
            Class8726.method30065(0.0f, 0.0f, -2000.0f);
            Class8317.method27612();
            if (this.field9396.method1429()) {
                this.field9396.method1428(false);
            }
            if (b && this.field9380.field4683 != null) {
                this.field9380.method5327().method15300("gui");
                if (!this.field9380.field4648.field23464 || this.field9380.field4700 != null) {
                    Class8726.method30118();
                    this.method5830(this.field9380.method5332().method7696(), this.field9380.method5332().method7697(), n);
                    Class9463.method35173().method35181();
                    this.field9380.field4647.method3779(n);
                    if (this.field9380.field4648.field23498 && !this.field9380.field4648.field23466) {
                        Config.method28988();
                    }
                    if (this.field9380.field4648.field23466) {
                        Class9036.method32480((int)this.field9380.method5332().method7700());
                    }
                    Class8726.method30056(256, Class869.field4623);
                }
                this.field9380.method5327().endSection();
            }
            Class8726.method30059();
            Class9463.method35173().method35183();
            Class8726.method30060();
            if (this.field9422 != (this.field9380.field4701 != null)) {
                if (this.field9380.field4701 != null) {
                    this.field9380.method5290().method5858(Config.field36042);
                    if (this.field9380.field4701 instanceof Class567) {
                        ((Class567)this.field9380.field4701).method3308();
                    }
                }
                this.field9422 = (this.field9380.field4701 != null);
            }
            Label_1050: {
                if (this.field9380.field4701 != null) {
                    try {
                        this.field9380.field4701.method2975(i, j, this.field9380.method5315());
                        break Label_1050;
                    }
                    catch (final Throwable t) {
                        final Class7689 method5333 = Class7689.method24421(t, "Rendering overlay");
                        method5333.method24418("Overlay render details").method16296("Overlay name", () -> this.field9380.field4701.getClass().getCanonicalName());
                        throw new Class2365(method5333);
                    }
                }
                if (this.field9380.field4700 != null && Class9463.method35173().method35193().method32154() == null) {
                    try {
                        if (Class9570.field41284.method22605()) {
                            Class9570.method35811(Class9570.field41284, this.field9380.field4700, i, j, this.field9380.method5315());
                        }
                        else {
                            this.field9380.field4700.method2975(i, j, this.field9380.method5315());
                        }
                    }
                    catch (final Throwable t2) {
                        final Class7689 method5334 = Class7689.method24421(t2, "Rendering screen");
                        final Class5204 method5335 = method5334.method24418("Screen render details");
                        method5335.method16296("Screen name", () -> this.field9380.field4700.getClass().getCanonicalName());
                        method5335.method16296("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", k, l, this.field9380.field4650.method26959(), this.field9380.field4650.method26960()));
                        method5335.method16296("Screen size", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f", this.field9380.method5332().method7696(), this.field9380.method5332().method7697(), this.field9380.method5332().method7692(), this.field9380.method5332().method7693(), this.field9380.method5332().method7700()));
                        throw new Class2365(method5334);
                    }
                }
            }
            this.field9396.method1428(true);
        }
        this.method5825();
        this.method5823();
        Class7741.method24700();
        Class9036.method32479();
        if (this.field9380.field4648.field23497) {
            this.field9380.field4648.field23467 = true;
        }
    }
    
    private void method5818() {
        if (this.field9380.field4636.method5705() > 10) {
            if (this.field9380.field4636.method5754()) {
                if (!this.field9380.method5285().method1464()) {
                    Class1673.field9460.execute(() -> {
                        Class8283.method27527(this.field9380.method5332().method7692(), this.field9380.method5332().method7693(), this.field9380.method5234());
                        class1846.method6644();
                        class1846.method6645();
                        Label_0055_1: {
                            final int n;
                            final int n2;
                            if (n > n2) {
                                break Label_0055_1;
                            }
                            try {
                                final Class1846 class1847 = new Class1846(64, 64, false);
                                try {
                                    final int n3;
                                    final int n4;
                                    class1846.method6666(n3, n4, n, n2, class1847);
                                    class1847.method6657(this.field9380.method5285().method1465());
                                }
                                catch (final Throwable t) {
                                    throw t;
                                }
                                finally {
                                    if (class1847 != null) {
                                        final Throwable t2;
                                        if (t2 != null) {
                                            try {
                                                class1847.close();
                                            }
                                            catch (final Throwable exception) {
                                                t2.addSuppressed(exception);
                                            }
                                        }
                                        else {
                                            class1847.close();
                                        }
                                    }
                                }
                            }
                            catch (final IOException ex) {
                                Class1660.field9379.warn("Couldn't save auto screenshot", (Throwable)ex);
                            }
                            finally {
                                class1846.close();
                            }
                        }
                    });
                }
            }
        }
    }
    
    private boolean method5819() {
        if (this.field9393) {
            final Entity method5303 = this.field9380.method5303();
            boolean b = method5303 instanceof PlayerEntity && !this.field9380.field4648.field23464;
            if (b) {
                if (!((PlayerEntity)method5303).field3025.field27305) {
                    final ItemStack method5304 = ((LivingEntity)method5303).getHeldItemMainhand();
                    final RayTraceResult field4691 = this.field9380.field4691;
                    if (field4691 != null) {
                        if (field4691.getType() == RayTraceResult.Type.BLOCK) {
                            final BlockPos method5305 = ((BlockRayTraceResult)field4691).getPos();
                            final BlockState method5306 = this.field9380.field4683.getBlockState(method5305);
                            if (this.field9380.field4682.method27336() != Class101.field301) {
                                final Class7990 class7990 = new Class7990(this.field9380.field4683, method5305, false);
                                b = (!method5304.method27620() && (method5304.method27686(this.field9380.field4683.method6793(), class7990) || method5304.method27687(this.field9380.field4683.method6793(), class7990)));
                            }
                            else {
                                b = (method5306.method21754(this.field9380.field4683, method5305) != null);
                            }
                        }
                    }
                }
            }
            return b;
        }
        return false;
    }
    
    public void method5820(final float n, final long l, final Class7351 class7351) {
        this.field9396.method1419(n);
        if (this.field9380.method5303() == null) {
            this.field9380.method5304(this.field9380.field4684);
        }
        this.method5807(n);
        if (Config.method28955()) {
            Class9216.method33796(this.field9380, this.field9411, n, l);
        }
        this.field9380.method5327().startSection("center");
        final boolean method28955 = Config.method28955();
        if (method28955) {
            Class9216.method33800(n, l);
        }
        final boolean method28956 = this.method5819();
        this.field9380.method5327().method15300("camera");
        final Class6092 field9411 = this.field9411;
        this.field9383 = (float)(this.field9380.field4648.field23382 * 16);
        if (Config.method28841()) {
            this.field9383 *= 0.95f;
        }
        if (Config.method28842()) {
            this.field9383 *= 0.83f;
        }
        Class7351 class7352 = new Class7351();
        class7352.method22569().method32111().method20752(this.method5815(field9411, n, true));
        final Class7351 class7353 = class7352;
        if (Class9216.method33924()) {
            class7352 = class7351;
        }
        this.method5810(class7352, n);
        if (this.field9380.field4648.field23431) {
            this.method5811(class7352, n);
        }
        final float method28957 = MathHelper.method35700(n, this.field9380.field4684.field4096, this.field9380.field4684.field4095);
        if (method28957 > 0.0f) {
            int n2 = 20;
            if (this.field9380.field4684.method2653(Class9439.field40482)) {
                n2 = 7;
            }
            final float n3 = 5.0f / (method28957 * method28957 + 5.0f) - method28957 * 0.04f;
            final float n4 = n3 * n3;
            final Vector3f class7354 = new Vector3f(0.0f, MathHelper.field41094 / 2.0f, MathHelper.field41094 / 2.0f);
            class7352.method22566(class7354.rotationDegrees((this.field9387 + n) * n2));
            class7352.method22565(1.0f / n4, 1.0f, 1.0f);
            class7352.method22566(class7354.rotationDegrees(-(this.field9387 + n) * n2));
        }
        if (Class9216.method33924()) {
            class7352 = class7353;
        }
        final Matrix4f method28958 = class7352.method22569().method32111();
        this.method5814(method28958);
        field9411.method18154(this.field9380.field4683, (this.field9380.method5303() != null) ? this.field9380.method5303() : this.field9380.field4684, this.field9380.field4648.field23465 > 0, this.field9380.field4648.field23465 == 2, n);
        if (Class9570.field41297.method22605()) {
            final Object method28959 = Class9570.field41297.method22608(this, field9411, n);
            final float method28960 = Class9570.method35823(method28959, Class9570.field41212, new Object[0]);
            final float method28961 = Class9570.method35823(method28959, Class9570.field41213, new Object[0]);
            final float method28962 = Class9570.method35823(method28959, Class9570.field41214, new Object[0]);
            field9411.method18171(method28960, method28961);
            class7351.method22566(Vector3f.ZP.rotationDegrees(method28962));
        }
        class7351.method22566(Vector3f.XP.rotationDegrees(field9411.method18163()));
        class7351.method22566(Vector3f.YP.rotationDegrees(field9411.method18164() + 180.0f));
        this.field9380.field4636.method5711(class7351, n, l, method28956, field9411, this, this.field9396, method28958);
        if (Class9570.field41283.method22605()) {
            this.field9380.method5327().method15300("forge_render_last");
            Class9570.method35811(Class9570.field41283, this.field9380.field4636, class7351, n, method28958, l);
        }
        this.field9380.method5327().method15300("hand");
        if (this.field9392) {
            if (!Class9216.field39049) {
                if (method28955) {
                    Class7778.method24951(this, class7351, field9411, n);
                    Class9216.method33817();
                }
                Class8726.method30056(256, Class869.field4623);
                Class8726.method30059();
                Class8726.method30067(class7351.method22569().method32111());
                Class9463.method35173().method35184();
                Class8726.method30060();
                if (!method28955) {
                    this.method5812(class7351, field9411, n);
                }
                else {
                    Class7778.method24953(this, class7351, field9411, n);
                }
            }
        }
        if (method28955) {
            Class9216.method33823();
        }
        this.field9380.method5327().endSection();
    }
    
    public void method5821() {
        this.field9402 = null;
        this.field9385.method7394();
        this.field9411.method18175();
    }
    
    public Class1905 method5822() {
        return this.field9385;
    }
    
    private void method5823() {
        this.field9418 = 0;
        if (Config.method28972() && Config.method28971()) {
            if (this.field9380.method5283()) {
                final Class1655 method5285 = this.field9380.method5285();
                if (method5285 != null) {
                    if (!this.field9380.method5298() && !(this.field9380.field4700 instanceof Class556)) {
                        if (this.field9417 > 0) {
                            Class9036.field38226.method26344();
                            Config.method28919(this.field9417);
                            Class9036.field38226.method26345();
                            this.field9418 = this.field9417;
                        }
                        final long field9415 = System.nanoTime() / 1000000L;
                        if (this.field9415 != 0L && this.field9416 != 0) {
                            long n = field9415 - this.field9415;
                            if (n < 0L) {
                                this.field9415 = field9415;
                                n = 0L;
                            }
                            if (n >= 50L) {
                                this.field9415 = field9415;
                                final int method5286 = method5285.method1545();
                                int n2 = method5286 - this.field9416;
                                if (n2 < 0) {
                                    this.field9416 = method5286;
                                    n2 = 0;
                                }
                                if (n2 < 1) {
                                    if (this.field9417 < 100) {
                                        this.field9417 += 2;
                                    }
                                }
                                if (n2 > 1) {
                                    if (this.field9417 > 0) {
                                        --this.field9417;
                                    }
                                }
                                this.field9416 = method5286;
                            }
                        }
                        else {
                            this.field9415 = field9415;
                            this.field9416 = method5285.method1545();
                            this.field9420 = 1.0f;
                            this.field9419 = 50.0f;
                        }
                    }
                    else {
                        if (this.field9380.field4700 instanceof Class556) {
                            Config.method28919(20L);
                        }
                        this.field9415 = 0L;
                        this.field9416 = 0;
                    }
                }
            }
        }
        else {
            this.field9415 = 0L;
            this.field9416 = 0;
        }
    }
    
    private void method5824() {
        Class8492.method28377();
        if (!this.field9412) {
            Class7462.method22987();
            if (Config.method28991() == 64) {
                if (Config.method28992() == 32) {
                    Config.method28994(true);
                }
            }
            this.field9412 = true;
        }
        final Class1848 field4683 = this.field9380.field4683;
        if (field4683 != null) {
            if (Config.method28963() != null) {
                final StringTextComponent class2260 = new StringTextComponent(Class8822.method30773("of.message.newVersion", "§n" + ("HD_U".replace("HD_U", "HD Ultra").replace("L", "Light") + " " + Config.method28963()) + "§r"));
                class2260.setStyle(new Style().method30419(new Class9485(Class2075.field11971, "https://optifine.net/downloads")));
                this.field9380.field4647.method3807().method3761(class2260);
                Config.method28964(null);
            }
            if (Config.method28993()) {
                Config.method28994(false);
                this.field9380.field4647.method3807().method3761(new StringTextComponent(Class8822.method30773("of.message.java64Bit", new Object[0])));
            }
        }
        if (this.field9380.field4700 instanceof Class548) {
            this.method5826((Class548)this.field9380.field4700);
        }
        if (this.field9413 != field4683) {
            Class9066.method32642(this.field9413, field4683);
            Config.method28832();
            this.field9415 = 0L;
            this.field9416 = 0;
            this.field9413 = field4683;
        }
        if (!this.method5827(Class9216.field39317)) {
            Class9216.field39317 = 0;
        }
        if (this.field9380.field4700 != null) {
            if (this.field9380.field4700.getClass() == Class535.class) {
                this.field9380.method5244(new Class537((Class535)this.field9380.field4700));
            }
        }
    }
    
    private void method5825() {
        if (this.field9380.field4683 != null) {
            if (Config.method29013()) {
                if (Class9419.method35020("CheckGlErrorFrameFinish", 10000L)) {
                    final int method31662 = Class8933.method31662();
                    if (method31662 != 0) {
                        if (Class8492.method28378(method31662)) {
                            this.field9380.field4647.method3807().method3761(new StringTextComponent(Class8822.method30773("of.message.openglError", method31662, Config.method29017(method31662))));
                        }
                    }
                }
            }
        }
    }
    
    private void method5826(final Class548 class548) {
        try {
            Object o = null;
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            final int value = instance.get(5);
            final int n = instance.get(2) + 1;
            if (value == 8 && n == 4) {
                o = "Happy birthday, OptiFine!";
            }
            if (value == 14 && n == 8) {
                o = "Happy birthday, sp614x!";
            }
            if (o == null) {
                return;
            }
            Class9570.method35837(class548, Class9570.field41434, o);
        }
        catch (final Throwable t) {}
    }
    
    public boolean method5827(final int i) {
        if (!Class8543.method28676()) {
            return false;
        }
        if (this.field9406 != null) {
            if (this.field9406 != this.field9421[2]) {
                if (this.field9406 != this.field9421[4]) {
                    return true;
                }
            }
        }
        if (i != 2 && i != 4) {
            if (this.field9406 != null) {
                this.field9406.close();
                this.field9406 = null;
                return true;
            }
            return true;
        }
        else {
            if (this.field9406 != null && this.field9406 == this.field9421[i]) {
                return true;
            }
            if (this.field9380.field4683 != null) {
                this.method5803(new ResourceLocation("shaders/post/fxaa_of_" + i + "x.json"));
                this.field9421[i] = this.field9406;
                return this.field9410;
            }
            return true;
        }
    }
    
    public Class2014 method5828() {
        return Class2013.field11452;
    }
    
    public void method5829(final ItemStack field9402) {
        this.field9402 = field9402;
        this.field9403 = 40;
        this.field9404 = this.field9382.nextFloat() * 2.0f - 1.0f;
        this.field9405 = this.field9382.nextFloat() * 2.0f - 1.0f;
    }
    
    private void method5830(final int n, final int n2, final float n3) {
        if (this.field9402 != null) {
            if (this.field9403 > 0) {
                final float n4 = (40 - this.field9403 + n3) / 40.0f;
                final float n5 = n4 * n4;
                final float n6 = n4 * n5;
                final float n7 = (10.25f * n6 * n5 - 24.95f * n5 * n5 + 25.5f * n6 - 13.8f * n5 + 4.0f * n4) * 3.1415927f;
                final float n8 = this.field9404 * (n / 4);
                final float n9 = this.field9405 * (n2 / 4);
                Class8726.method29999();
                Class8726.method30059();
                Class8726.method29995();
                Class8726.method30008();
                Class8726.method30029();
                final Class7351 class7351 = new Class7351();
                class7351.method22567();
                class7351.method22564(n / 2 + n8 * MathHelper.method35647(MathHelper.sin(n7 * 2.0f)), n2 / 2 + n9 * MathHelper.method35647(MathHelper.sin(n7 * 2.0f)), -50.0);
                final float n10 = 50.0f + 175.0f * MathHelper.sin(n7);
                class7351.method22565(n10, -n10, n10);
                class7351.method22566(Vector3f.YP.rotationDegrees(900.0f * MathHelper.method35647(MathHelper.sin(n7))));
                class7351.method22566(Vector3f.XP.rotationDegrees(6.0f * MathHelper.cos(n4 * 8.0f)));
                class7351.method22566(Vector3f.ZP.rotationDegrees(6.0f * MathHelper.cos(n4 * 8.0f)));
                final Class7808 method11006 = this.field9386.method11006();
                this.field9380.method5307().method6536(this.field9402, Class2016.field11494, 15728880, Class1904.field10335, class7351, method11006);
                class7351.method22568();
                method11006.method25216();
                Class8726.method29997();
                Class8726.method30060();
                Class8726.method30028();
                Class8726.method30007();
            }
        }
    }
    
    public float method5831(final float n) {
        return MathHelper.method35700(n, this.field9391, this.field9390);
    }
    
    public float method5832() {
        return this.field9383;
    }
    
    public Class6092 method5833() {
        return this.field9411;
    }
    
    public Class392 method5834() {
        return this.field9396;
    }
    
    public Class1904 method5835() {
        return this.field9397;
    }
    
    static {
        field9379 = LogManager.getLogger();
        field9407 = new ResourceLocation[] { new ResourceLocation("shaders/post/notch.json"), new ResourceLocation("shaders/post/fxaa.json"), new ResourceLocation("shaders/post/art.json"), new ResourceLocation("shaders/post/bumpy.json"), new ResourceLocation("shaders/post/blobs2.json"), new ResourceLocation("shaders/post/pencil.json"), new ResourceLocation("shaders/post/color_convolve.json"), new ResourceLocation("shaders/post/deconverge.json"), new ResourceLocation("shaders/post/flip.json"), new ResourceLocation(Class1660.\u7a2c\u1320\u309d\u931e\ud02e\ucc02[2]), new ResourceLocation("shaders/post/ntsc.json"), new ResourceLocation("shaders/post/outline.json"), new ResourceLocation("shaders/post/phosphor.json"), new ResourceLocation("shaders/post/scan_pincushion.json"), new ResourceLocation("shaders/post/sobel.json"), new ResourceLocation("shaders/post/bits.json"), new ResourceLocation("shaders/post/desaturate.json"), new ResourceLocation("shaders/post/green.json"), new ResourceLocation("shaders/post/blur.json"), new ResourceLocation("shaders/post/wobble.json"), new ResourceLocation("shaders/post/blobs.json"), new ResourceLocation("shaders/post/antialias.json"), new ResourceLocation(Class1660.\u7a2c\u1320\u309d\u931e\ud02e\ucc02[0]), new ResourceLocation(Class1660.\u7a2c\u1320\u309d\u931e\ud02e\ucc02[1]) };
        field9408 = Class1660.field9407.length;
    }
}
