// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.OptionalDouble;

public abstract class Class6322
{
    public final String field25274;
    private final Runnable field25275;
    private final Runnable field25276;
    public static final Class6331 field25277;
    public static final Class6331 field25278;
    public static final Class6331 field25279;
    public static final Class6331 field25280;
    public static final Class6331 field25281;
    public static final Class6331 field25282;
    public static final Class6321 field25283;
    public static final Class6321 field25284;
    public static final Class6321 field25285;
    public static final Class6321 field25286;
    public static final Class6339 field25287;
    public static final Class6339 field25288;
    public static final Class6340 field25289;
    public static final Class6340 field25290;
    public static final Class6340 field25291;
    public static final Class6323 field25292;
    public static final Class6323 field25293;
    public static final Class6323 field25294;
    public static final Class6323 field25295;
    public static final Class6337 field25296;
    public static final Class6337 field25297;
    public static final Class6336 field25298;
    public static final Class6336 field25299;
    public static final Class6335 field25300;
    public static final Class6335 field25301;
    public static final Class6338 field25302;
    public static final Class6338 field25303;
    public static final Class6328 field25304;
    public static final Class6328 field25305;
    public static final Class6328 field25306;
    public static final Class6326 field25307;
    public static final Class6326 field25308;
    public static final Class6326 field25309;
    public static final Class6330 field25310;
    public static final Class6330 field25311;
    public static final Class6330 field25312;
    public static final Class6329 field25313;
    public static final Class6329 field25314;
    public static final Class6329 field25315;
    public static final Class6341 field25316;
    public static final Class6341 field25317;
    public static final Class6327 field25318;
    
    public Class6322(final String field25274, final Runnable field25275, final Runnable field25276) {
        this.field25274 = field25274;
        this.field25275 = field25275;
        this.field25276 = field25276;
    }
    
    public void method18709() {
        this.field25275.run();
    }
    
    public void method18710() {
        this.field25276.run();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field25274.equals(((Class6322)o).field25274));
    }
    
    @Override
    public int hashCode() {
        return this.field25274.hashCode();
    }
    
    private static void method18711(final float n) {
        RenderSystem.method30057(5890);
        RenderSystem.pushMatrix();
        RenderSystem.method30058();
        final long n2 = Util.method27837() * 8L;
        RenderSystem.translatef(-(n2 % 110000L / 110000.0f), n2 % 30000L / 30000.0f, 0.0f);
        RenderSystem.method30062(10.0f, 0.0f, 0.0f, 1.0f);
        RenderSystem.method30063(n, n, n);
        RenderSystem.method30057(5888);
    }
    
    public String method18712() {
        return this.field25274;
    }
    
    static {
        field25277 = new Class6331("no_transparency", () -> RenderSystem.disableBlend(), () -> {});
        field25278 = new Class6331("additive_transparency", () -> {
            RenderSystem.enableBlend();
            RenderSystem.method30013(Class2050.field11686, Class2135.field12455);
            return;
        }, () -> {
            RenderSystem.disableBlend();
            RenderSystem.defaultBlendFunc();
            return;
        });
        field25279 = new Class6331("lightning_transparency", () -> {
            RenderSystem.enableBlend();
            RenderSystem.method30013(Class2050.field11693, Class2135.field12455);
            return;
        }, () -> {
            RenderSystem.disableBlend();
            RenderSystem.defaultBlendFunc();
            return;
        });
        field25280 = new Class6331("glint_transparency", () -> {
            RenderSystem.enableBlend();
            RenderSystem.method30013(Class2050.field11695, Class2135.field12455);
            return;
        }, () -> {
            RenderSystem.disableBlend();
            RenderSystem.defaultBlendFunc();
            return;
        });
        field25281 = new Class6331("crumbling_transparency", () -> {
            RenderSystem.enableBlend();
            RenderSystem.method30015(Class2050.field11685, Class2135.field12463, Class2050.field11686, Class2135.field12464);
            return;
        }, () -> {
            RenderSystem.disableBlend();
            RenderSystem.defaultBlendFunc();
            return;
        });
        field25282 = new Class6331("translucent_transparency", () -> {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            return;
        }, () -> RenderSystem.disableBlend());
        field25283 = new Class6321(0.0f);
        field25284 = new Class6321(0.003921569f);
        field25285 = new Class6321(0.5f);
        field25286 = new Class6321(0.1f);
        field25287 = new Class6339(false);
        field25288 = new Class6339(true);
        field25289 = new Class6340(Class1774.field9853, false, true);
        field25290 = new Class6340(Class1774.field9853, false, false);
        field25291 = new Class6340();
        field25292 = new Class6323("default_texturing", () -> {}, () -> {});
        field25293 = new Class6323("outline_texturing", () -> RenderSystem.method30103(), () -> RenderSystem.method30104());
        field25294 = new Class6323("glint_texturing", () -> method18711(8.0f), () -> {
            RenderSystem.method30057(5890);
            RenderSystem.popMatrix();
            RenderSystem.method30057(5888);
            return;
        });
        field25295 = new Class6323("entity_glint_texturing", () -> method18711(0.16f), () -> {
            RenderSystem.method30057(5890);
            RenderSystem.popMatrix();
            RenderSystem.method30057(5888);
            return;
        });
        field25296 = new Class6337(true);
        field25297 = new Class6337(false);
        field25298 = new Class6336(true);
        field25299 = new Class6336(false);
        field25300 = new Class6335(true);
        field25301 = new Class6335(false);
        field25302 = new Class6338(true);
        field25303 = new Class6338(false);
        field25304 = new Class6328(519);
        field25305 = new Class6328(514);
        field25306 = new Class6328(515);
        field25307 = new Class6326(true, true);
        field25308 = new Class6326(true, false);
        field25309 = new Class6326(false, true);
        field25310 = new Class6330("no_layering", () -> {}, () -> {});
        field25311 = new Class6330("polygon_offset_layering", () -> {
            RenderSystem.method30035(-1.0f, -10.0f);
            RenderSystem.method30031();
            return;
        }, () -> {
            RenderSystem.method30035(0.0f, 0.0f);
            RenderSystem.method30032();
            return;
        });
        field25312 = new Class6330("projection_layering", () -> {
            RenderSystem.method30057(5889);
            RenderSystem.pushMatrix();
            RenderSystem.method30063(1.0f, 1.0f, 0.999f);
            RenderSystem.method30057(5888);
            return;
        }, () -> {
            RenderSystem.method30057(5889);
            RenderSystem.popMatrix();
            RenderSystem.method30057(5888);
            return;
        });
        field25313 = new Class6329("no_fog", () -> {}, () -> {});
        field25314 = new Class6329("fog", () -> {
            Class9111.method32956();
            RenderSystem.method30019();
            return;
        }, () -> RenderSystem.method30020());
        field25315 = new Class6329("black_fog", () -> {
            RenderSystem.method30026(2918, 0.0f, 0.0f, 0.0f, 1.0f);
            RenderSystem.method30019();
            return;
        }, () -> {
            Class9111.method32956();
            RenderSystem.method30020();
            return;
        });
        field25316 = new Class6341("main_target", () -> {}, () -> {});
        field25317 = new Class6341("outline_target", () -> Minecraft.method5277().worldRenderer.method5778().method18395(false), () -> Minecraft.method5277().method5234().method18395(false));
        field25318 = new Class6327(OptionalDouble.of(1.0));
    }
}
