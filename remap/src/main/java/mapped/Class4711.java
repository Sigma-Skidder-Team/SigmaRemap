// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class4711 extends Class4710<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>
{
    public Class4711(final Class8551 class8551) {
        this(class8551, false);
    }
    
    public Class4711(final Class8551 class8551, final boolean b) {
        super(class8551, new Class5860(0.0f, b), 0.5f);
        this.method13978((Class1799<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>)new Class1835(this, new Class5853(0.5f), new Class5853(1.0f)));
        this.method13978(new Class1823<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>(this));
        this.method13978(new Class1821<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>(this));
        this.method13978(new Class1842(this));
        this.method13978(new Class1819(this));
        this.method13978(new Class1831<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>(this));
        this.method13978(new Class1801<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>(this));
        this.method13978((Class1799<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>)new Class1817(this));
        this.method13978((Class1799<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>)new Class1815(this));
        this.method13978(new Class1822<AbstractClientPlayerEntity, Class5860<AbstractClientPlayerEntity>>(this));
    }
    
    public void method13993(final AbstractClientPlayerEntity abstractClientPlayerEntity, final float n, final float n2, final MatrixStack class755, final IRenderTypeBuffer class756, final int n3) {
        this.method13995(abstractClientPlayerEntity);
        super.method13980(abstractClientPlayerEntity, n, n2, class755, class756, n3);
    }
    
    public Vec3d method13994(final AbstractClientPlayerEntity abstractClientPlayerEntity, final float n) {
        return abstractClientPlayerEntity.method1814() ? new Vec3d(0.0, -0.125, 0.0) : super.method13955(abstractClientPlayerEntity, n);
    }
    
    private void method13995(final AbstractClientPlayerEntity abstractClientPlayerEntity) {
        final Class5860 class755 = ((Class4710<T, Class5860>)this).method13979();
        if (!abstractClientPlayerEntity.isSpectator()) {
            final ItemStack method2713 = abstractClientPlayerEntity.getHeldItemMainhand();
            final ItemStack method2714 = abstractClientPlayerEntity.method2714();
            class755.method17584(true);
            class755.field23994.field25187 = abstractClientPlayerEntity.method2895(Class189.field616);
            class755.field24026.field25187 = abstractClientPlayerEntity.method2895(Class189.field611);
            class755.field24024.field25187 = abstractClientPlayerEntity.method2895(Class189.field614);
            class755.field24025.field25187 = abstractClientPlayerEntity.method2895(Class189.field615);
            class755.field24022.field25187 = abstractClientPlayerEntity.method2895(Class189.field612);
            class755.field24023.field25187 = abstractClientPlayerEntity.method2895(Class189.field613);
            class755.field24002 = abstractClientPlayerEntity.method1814();
            final Class2036 method2715 = this.method13996(abstractClientPlayerEntity, method2713, method2714, Class316.field1877);
            final Class2036 method2716 = this.method13996(abstractClientPlayerEntity, method2713, method2714, Class316.field1878);
            if (abstractClientPlayerEntity.method2755() != Class2226.field13698) {
                class755.field24001 = method2716;
                class755.field24000 = method2715;
            }
            else {
                class755.field24001 = method2715;
                class755.field24000 = method2716;
            }
        }
        else {
            class755.method17584(false);
            class755.field23993.field25187 = true;
            class755.field23994.field25187 = true;
        }
    }
    
    private Class2036 method13996(final AbstractClientPlayerEntity abstractClientPlayerEntity, final ItemStack class755, final ItemStack class756, final Class316 class757) {
        Class2036 class758 = Class2036.field11607;
        final ItemStack class759 = (class757 != Class316.field1877) ? class756 : class755;
        if (!class759.method27620()) {
            class758 = Class2036.field11608;
            if (abstractClientPlayerEntity.method2767() <= 0) {
                final boolean b = class755.getItem() == Items.field31611;
                final boolean method12296 = Class4086.method12296(class755);
                final boolean b2 = class756.getItem() == Items.field31611;
                final boolean method12297 = Class4086.method12296(class756);
                if (b) {
                    if (method12296) {
                        class758 = Class2036.field11613;
                    }
                }
                if (b2) {
                    if (method12297) {
                        if (class755.getItem().method11725(class755) == Class1992.field11154) {
                            class758 = Class2036.field11613;
                        }
                    }
                }
            }
            else {
                final Class1992 method12298 = class759.method27653();
                if (method12298 != Class1992.field11157) {
                    if (method12298 != Class1992.field11158) {
                        if (method12298 != Class1992.field11159) {
                            if (method12298 == Class1992.field11160) {
                                if (class757 == abstractClientPlayerEntity.method2757()) {
                                    class758 = Class2036.field11612;
                                }
                            }
                        }
                        else {
                            class758 = Class2036.field11611;
                        }
                    }
                    else {
                        class758 = Class2036.field11610;
                    }
                }
                else {
                    class758 = Class2036.field11609;
                }
            }
        }
        return class758;
    }
    
    public ResourceLocation method13997(final AbstractClientPlayerEntity abstractClientPlayerEntity) {
        return abstractClientPlayerEntity.method4097();
    }
    
    public void method13998(final AbstractClientPlayerEntity abstractClientPlayerEntity, final MatrixStack class755, final float n) {
        class755.method22565(0.9375f, 0.9375f, 0.9375f);
    }
    
    public void method13999(final AbstractClientPlayerEntity abstractClientPlayerEntity, final String s, final MatrixStack class755, final IRenderTypeBuffer class756, final int n) {
        final double method28715 = this.field20283.method28715(abstractClientPlayerEntity);
        class755.method22567();
        if (method28715 < 100.0) {
            final Class6516 method28716 = abstractClientPlayerEntity.method2890();
            final Class9290 method28717 = method28716.method19644(2);
            if (method28717 != null) {
                super.method13958(abstractClientPlayerEntity, method28716.method19636(abstractClientPlayerEntity.method1867(), method28717).method23969() + " " + method28717.method34314().getFormattedText(), class755, class756, n);
                class755.method22564(0.0, 0.25874999165534973, 0.0);
            }
        }
        super.method13958(abstractClientPlayerEntity, s, class755, class756, n);
        class755.method22568();
    }
    
    public void method14000(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final AbstractClientPlayerEntity class7353) {
        this.method14002(class7351, class7352, n, class7353, this.field20301.field23996, this.field20301.field24023);
    }
    
    public void method14001(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final AbstractClientPlayerEntity class7353) {
        this.method14002(class7351, class7352, n, class7353, this.field20301.field23997, this.field20301.field24022);
    }
    
    private void method14002(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final AbstractClientPlayerEntity class7353, final Class6300 class7354, final Class6300 class7355) {
        final Class5860 class7356 = ((Class4710<T, Class5860>)this).method13979();
        this.method13995(class7353);
        class7356.field23955 = 0.0f;
        class7356.field24002 = false;
        class7356.method17580(class7353, class7356.field24003 = 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        class7354.field25183 = 0.0f;
        class7354.method18643(class7351, class7352.method25214(Class6332.method18767(class7353.method4097())), n, Class1904.field10335);
        class7355.field25183 = 0.0f;
        class7355.method18643(class7351, class7352.method25214(Class6332.method18773(class7353.method4097())), n, Class1904.field10335);
    }
    
    public void method14003(final AbstractClientPlayerEntity abstractClientPlayerEntity, final MatrixStack class755, final float n, final float n2, final float n3) {
        final float method2623 = abstractClientPlayerEntity.method2623(n3);
        if (!abstractClientPlayerEntity.method2773()) {
            if (method2623 <= 0.0f) {
                super.method13985(abstractClientPlayerEntity, class755, n, n2, n3);
            }
            else {
                super.method13985(abstractClientPlayerEntity, class755, n, n2, n3);
                class755.method22566(Vector3f.XP.rotationDegrees(MathHelper.method35700(method2623, 0.0f, abstractClientPlayerEntity.method1706() ? (-90.0f - abstractClientPlayerEntity.rotationPitch) : -90.0f)));
                if (abstractClientPlayerEntity.method1818()) {
                    class755.method22564(0.0, -1.0, 0.30000001192092896);
                }
            }
        }
        else {
            super.method13985(abstractClientPlayerEntity, class755, n, n2, n3);
            final float n4 = abstractClientPlayerEntity.method2774() + n3;
            final float method2624 = MathHelper.clamp(n4 * n4 / 100.0f, 0.0f, 1.0f);
            if (!abstractClientPlayerEntity.method2744()) {
                class755.method22566(Vector3f.XP.rotationDegrees(method2624 * (-90.0f - abstractClientPlayerEntity.rotationPitch)));
            }
            final Vec3d method2625 = abstractClientPlayerEntity.method1741(n3);
            final Vec3d method2626 = abstractClientPlayerEntity.getMotion();
            final double method2627 = Entity.horizontalMag(method2626);
            final double method2628 = Entity.horizontalMag(method2625);
            if (method2627 > 0.0) {
                if (method2628 > 0.0) {
                    class755.method22566(Vector3f.YP.rotation((float)(Math.signum(method2626.x * method2625.z - method2626.z * method2625.x) * Math.acos((method2626.x * method2625.x + method2626.z * method2625.z) / (Math.sqrt(method2627) * Math.sqrt(method2628))))));
                }
            }
        }
    }
}
