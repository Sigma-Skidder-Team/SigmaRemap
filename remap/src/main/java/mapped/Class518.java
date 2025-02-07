// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;

public class Class518 extends Class517<Class3427> implements Class519
{
    private static final ResourceLocation field3104;
    private float field3105;
    private float field3106;
    private final Class581 field3107;
    private boolean field3108;
    private boolean field3109;
    private boolean field3110;
    
    public Class518(final PlayerEntity playerEntity) {
        super(playerEntity.container, playerEntity.inventory, new Class2259("container.crafting", new Object[0]));
        this.field3107 = new Class581();
        this.passEvents = true;
    }
    
    @Override
    public void tick() {
        if (!this.minecraft.playerController.method27332()) {
            this.field3107.method3426();
        }
        else {
            this.minecraft.displayGuiScreen(new Class525(this.minecraft.player));
        }
    }
    
    @Override
    public void init() {
        if (!this.minecraft.playerController.method27332()) {
            super.init();
            this.field3109 = (this.width < 379);
            this.field3107.method3415(this.width, this.height, this.minecraft, this.field3109, (Class3426<?>)this.field3077);
            this.field3108 = true;
            this.field3079 = this.field3107.method3419(this.field3109, this.width, this.field3075);
            this.children.add(this.field3107);
            this.setFocusedDefault(this.field3107);
            this.addButton(new Class679(this.field3079 + 104, this.height / 2 - 22, 20, 18, 0, 0, 19, Class518.field3104, class654 -> {
                this.field3107.method3416(this.field3109);
                this.field3107.method3420();
                this.field3079 = this.field3107.method3419(this.field3109, this.width, this.field3075);
                ((Class679)class654).method3742(this.field3079 + 104, this.height / 2 - 22);
                this.field3110 = true;
            }));
        }
        else {
            this.minecraft.displayGuiScreen(new Class525(this.minecraft.player));
        }
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.title.getFormattedText(), 97.0f, 8.0f, 4210752);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.field3103 = !this.field3107.method3421();
        if (this.field3107.method3421() && this.field3109) {
            this.method2976(n3, n, n2);
            this.field3107.render(n, n2, n3);
        }
        else {
            this.field3107.render(n, n2, n3);
            super.render(n, n2, n3);
            this.field3107.method3431(this.field3079, this.field3080, false, n3);
        }
        this.method2977(n, n2);
        this.field3107.method3428(this.field3079, this.field3080, n, n2);
        this.field3105 = (float)n;
        this.field3106 = (float)n2;
        this.func_212932_b(this.field3107);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class518.field3074);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.blit(field3079, field3080, 0, 0, this.field3075, this.field3076);
        method2999(field3079 + 51, field3080 + 75, 30, field3079 + 51 - this.field3105, field3080 + 75 - 50 - this.field3106, this.minecraft.player);
    }
    
    public static void method2999(final int n, final int n2, final int n3, final float n4, final float n5, final LivingEntity class511) {
        final float n6 = (float)Math.atan(n4 / 40.0f);
        final float n7 = (float)Math.atan(n5 / 40.0f);
        RenderSystem.pushMatrix();
        RenderSystem.translatef((float)n, (float)n2, 1050.0f);
        RenderSystem.method30063(1.0f, 1.0f, -1.0f);
        final MatrixStack class512 = new MatrixStack();
        class512.method22564(0.0, 0.0, 1000.0);
        class512.method22565((float)n3, (float)n3, (float)n3);
        final Quaternion method33328 = Vector3f.ZP.rotationDegrees(180.0f);
        final Quaternion method33329 = Vector3f.XP.rotationDegrees(n7 * 20.0f);
        method33328.multiply(method33329);
        class512.method22566(method33328);
        final float field2951 = class511.field2951;
        final float field2952 = class511.rotationYaw;
        final float field2953 = class511.rotationPitch;
        final float field2954 = class511.field2954;
        final float field2955 = class511.field2953;
        class511.field2951 = 180.0f + n6 * 20.0f;
        class511.rotationYaw = 180.0f + n6 * 40.0f;
        class511.rotationPitch = -n7 * 20.0f;
        class511.field2953 = class511.rotationYaw;
        class511.field2954 = class511.rotationYaw;
        final Class8551 method33330 = Minecraft.method5277().method5306();
        method33329.conjugate();
        method33330.method28701(method33329);
        method33330.method28702(false);
        final IRenderTypeBuffer.Impl method33331 = Minecraft.method5277().method5333().method11006();
        method33330.method28706(class511, 0.0, 0.0, 0.0, 0.0f, 1.0f, class512, method33331, 15728880);
        method33331.finish();
        method33330.method28702(true);
        class511.field2951 = field2951;
        class511.rotationYaw = field2952;
        class511.rotationPitch = field2953;
        class511.field2954 = field2954;
        class511.field2953 = field2955;
        RenderSystem.popMatrix();
    }
    
    @Override
    public boolean method2987(final int n, final int n2, final int n3, final int n4, final double n5, final double n6) {
        if (!this.field3109 || !this.field3107.method3421()) {
            if (super.method2987(n, n2, n3, n4, n5, n6)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3107.mouseClicked(n, n2, n3) || ((!this.field3109 || !this.field3107.method3421()) && super.mouseClicked(n, n2, n3));
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        if (!this.field3110) {
            return super.mouseReleased(n, n2, n3);
        }
        this.field3110 = false;
        return true;
    }
    
    @Override
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        boolean b = false;
        Label_0064: {
            if (n >= n3) {
                if (n2 >= n4) {
                    if (n < n3 + this.field3075) {
                        if (n2 < n4 + this.field3076) {
                            b = false;
                            break Label_0064;
                        }
                    }
                }
            }
            b = true;
        }
        final boolean b2 = b;
        return this.field3107.method3433(n, n2, this.field3079, this.field3080, this.field3075, this.field3076, n5) && b2;
    }
    
    @Override
    public void method2988(final Class6601 class6601, final int n, final int n2, final Class2133 class6602) {
        super.method2988(class6601, n, n2, class6602);
        this.field3107.method3423(class6601);
    }
    
    @Override
    public void method3000() {
        this.field3107.method3437();
    }
    
    @Override
    public void removed() {
        if (this.field3108) {
            this.field3107.method3418();
        }
        super.removed();
    }
    
    @Override
    public Class581 method3001() {
        return this.field3107;
    }
    
    static {
        field3104 = new ResourceLocation("textures/gui/recipe_button.png");
    }
}
