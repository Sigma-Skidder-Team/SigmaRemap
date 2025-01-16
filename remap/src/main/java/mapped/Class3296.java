// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class Class3296 extends Class3167
{
    public static boolean field15857;
    private boolean field15858;
    
    public Class3296() {
        super(Class8013.field32985, "OldHitting", "Reverts to 1.7/1.8 hitting");
        this.method9881(new Class5001("Animation", "Animation mode", 0, new String[] { "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down" }));
        this.method9915(true);
    }
    
    @Class6753
    @Class6757
    private void method10435(final Class5744 class5744) {
        if (!this.method9906() && Class9367.field40167 != Class7906.field32452) {
            return;
        }
        if (class5744.method17046()) {
            final boolean b = Class3296.field15514.field4684.getHeldItemMainhand() != null && Class3296.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077;
            final boolean method9898 = Class9463.method35173().method35189().method21551(Class3376.class).method9898();
            boolean b2 = true;
            Label_0104: {
                if (!Class3296.field15514.field4684.method1809()) {
                    if (Class3296.field15514.field4691.method21449() == Class2165.field12881) {
                        if (!Class9463.method35173().method35189().method21551(Class3376.class).method9898()) {
                            final Block method9899 = Class3296.field15514.field4683.getBlockState(((BlockRayTraceResult)Class3296.field15514.field4691).method21447()).method21696();
                            if (!new ArrayList(Arrays.asList(Class7521.field29292, Class7521.field29409, Class7521.field29468, Class7521.field29296, Class7521.field29417, Class7521.field29299, Class7521.field29809, Class7521.field29398, Class7521.field29465, Class7521.field29466, Class7521.field29467, Class7521.field29216, Class7521.field29220, Class7521.field29316, Class7521.field29475, Class7521.field29481, Class7521.field29345, Class7521.field29471)).contains(method9899)) {
                                if (!(method9899 instanceof Class3907)) {
                                    if (!(method9899 instanceof Class3906)) {
                                        if (!(method9899 instanceof Class3898)) {
                                            if (!(method9899 instanceof Class3969)) {
                                                break Label_0104;
                                            }
                                            if (method9899 == Class7521.field29318) {
                                                break Label_0104;
                                            }
                                        }
                                    }
                                }
                            }
                            b2 = false;
                        }
                    }
                }
            }
            boolean field15857 = false;
            Label_0459: {
                Label_0446: {
                    if (Class3296.field15514.field4648.field23445.method1056()) {
                        if (b) {
                            if (b2) {
                                if (b2) {
                                    break Label_0446;
                                }
                            }
                        }
                    }
                    if (!method9898) {
                        field15857 = false;
                        break Label_0459;
                    }
                }
                field15857 = true;
            }
            if (!(Class3296.field15857 = field15857)) {
                if (Class8491.field34858.contains(Class3296.field15514.field4684)) {
                    Class8491.field34858.remove(Class3296.field15514.field4684);
                }
            }
            else if (!Class8491.field34858.contains(Class3296.field15514.field4684)) {
                Class8491.field34858.add(Class3296.field15514.field4684);
            }
            if (Class3296.field15857 && !this.field15858) {
                this.field15858 = !this.field15858;
                if (!method9898) {
                    Class6430.method19163();
                }
            }
            else if (!Class3296.field15857) {
                if (this.field15858) {
                    this.field15858 = !this.field15858;
                }
            }
        }
    }
    
    @Class6753
    @Class6759
    private void method10436(final Class5723 class5723) {
        if (!this.method9906() && Class9367.field40167 != Class7906.field32452) {
            return;
        }
        if (Class3296.field15514.field4684 != null) {
            if (class5723.method16998() instanceof Class4402) {
                final Class4402 class5724 = (Class4402)class5723.method16998();
                if (class5724.method13247() != null) {
                    if (class5724.method13248() == Class3296.field15514.field4684.getEntityId()) {
                        if (class5724.method13247().getItem() instanceof Class4100) {
                            class5723.method16961(true);
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    @Class6759
    private void method10437(final Class5716 class5716) {
        if (!this.method9906() && Class9367.field40167 != Class7906.field32452) {
            return;
        }
        final float method16964 = class5716.method16964();
        if (class5716.method16966() && class5716.method16967() == Class2226.field13697 && class5716.method16968().getItem() instanceof Class4100) {
            class5716.method16971(false);
            return;
        }
        if (class5716.method16967() == Class2226.field13697 && Class3296.field15857) {
            return;
        }
        if (Class3296.field15857 && class5716.method16966()) {
            class5716.method16961(true);
            final String method16965 = this.method9887("Animation");
            switch (method16965) {
                case "Vanilla": {
                    this.method10441(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tap": {
                    this.method10442(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tap2": {
                    this.method10443(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Slide": {
                    this.method10444(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Slide2": {
                    this.method10445(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Scale": {
                    this.method10446(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Leaked": {
                    this.method10447(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Ninja": {
                    this.method10440(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tomy": {
                    this.method10439(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Down": {
                    this.method10448(0.0f, method16964, class5716.method16969());
                    break;
                }
            }
        }
    }
    
    private void method10438(final float n, final float n2, final float n3, final float n4, final Class7351 class7351) {
        class7351.method22566(new Vector3f(n2, n3, n4).rotationDegrees(n));
    }
    
    private void method10439(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10440(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.47999998927116394, -0.38999998569488525, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(100.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-50.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(n2 * 3.1415927f);
        this.method10438(method35638 * -10.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -30.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * 109.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-90.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10441(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10442(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.0, -3.5, 0.0);
        class7351.method22564(0.5600000023841858, -0.5199999809265137, -0.7200000286102295);
        class7351.method22564(0.5600000023841858, -0.2199999988079071, -0.7199999690055847);
        this.method10438(45.0f, 0.0f, 1.0f, 0.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(0.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35638 * -9.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-9.0f, 0.0f, 0.0f, 1.0f, class7351);
        class7351.method22564(0.0, 3.200000047683716, 0.0);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        class7351.method22565(2.7f, 2.7f, 2.7f);
    }
    
    private void method10443(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.6480000019073486, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-method35638 * 10.0f, 1.0f, -2.0f, 3.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10444(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.6480000019073486, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-method35638 * 20.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10445(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10446(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.2f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f - method35638 * 0.3f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10447(final float n, final float n2, final Class7351 class7351) {
        class7351.method22564(0.56, -0.52, -0.72);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(method35638 * 10.0f, -4.0f, -2.0f, 5.0f, class7351);
        this.method10438(method35638 * 30.0f, 1.0f, -0.0f, -1.0f, class7351);
    }
    
    private void method10448(final float n, final float n2, final Class7351 class7351) {
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, method35638 * -0.2f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    static {
        Class3296.field15857 = false;
    }
}
