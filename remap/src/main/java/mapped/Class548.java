// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.Runnables;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.Random;

public class Class548 extends Class527
{
    public static final Class8065 field3300;
    private static final Class1932 field3301;
    private static final Class1932 field3302;
    private final boolean field3303;
    private String field3304;
    private Class654 field3305;
    private static final Class1932 field3306;
    private static final Class1932 field3307;
    private boolean field3308;
    private Class527 field3309;
    private int field3310;
    private int field3311;
    private final Class9472 field3312;
    private final boolean field3313;
    private long field3314;
    private Class527 field3315;
    
    public Class548() {
        this(false);
    }
    
    public Class548(final boolean field3313) {
        super(new Class2259("narrator.screen.title", new Object[0]));
        this.field3312 = new Class9472(Class548.field3300);
        this.field3313 = field3313;
        this.field3303 = (new Random().nextFloat() < 1.0E-4);
    }
    
    private boolean method3214() {
        return this.field3150.field4648.field23424 && this.field3309 != null;
    }
    
    @Override
    public void method2992() {
        if (this.method3214()) {
            this.field3309.method2992();
        }
    }
    
    public static CompletableFuture<Void> method3215(final Class1663 class1663, final Executor executor) {
        return CompletableFuture.allOf(class1663.method5855(Class548.field3306, executor), class1663.method5855(Class548.field3307, executor), class1663.method5855(Class548.field3301, executor), Class548.field3300.method26462(class1663, executor));
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public void method2969() {
        if (this.field3304 == null) {
            this.field3304 = this.field3150.method5329().method6461();
        }
        this.field3310 = this.field3156.method6617("Copyright Mojang AB. Do not distribute!");
        this.field3311 = this.field3152 - this.field3310 - 2;
        final int n = this.field3153 / 4 + 48;
        Class654 method24312 = null;
        if (!this.field3150.method5268()) {
            this.method3216(n, 24);
            if (Class9570.field41399.method22619()) {
                method24312 = Class7667.method24312(this, n, 24);
                this.method3029(method24312);
            }
        }
        else {
            this.method3217(n, 24);
        }
        this.method3029(new Class679(this.field3152 / 2 - 124, n + 72 + 12, 20, 20, 0, 106, 20, Class654.field3421, 256, 256, class654 -> this.field3150.method5244(new Class704(this, this.field3150.field4648, this.field3150.method5295())), Class8822.method30773("narrator.button.language", new Object[0])));
        this.method3029(new Class654(this.field3152 / 2 - 100, n + 72 + 12, 98, 20, Class8822.method30773("menu.options", new Object[0]), class654 -> this.field3150.method5244(new Class550(this, this.field3150.field4648))));
        this.method3029(new Class654(this.field3152 / 2 + 2, n + 72 + 12, 98, 20, Class8822.method30773("menu.quit", new Object[0]), class654 -> this.field3150.method5253()));
        this.method3029(new Class679(this.field3152 / 2 + 104, n + 72 + 12, 20, 20, 0, 0, 20, Class548.field3302, 32, 64, class654 -> this.field3150.method5244(new Class710(this, this.field3150.field4648)), Class8822.method30773("narrator.button.accessibility", new Object[0])));
        this.field3150.method5312(false);
        if (this.field3150.field4648.field23424) {
            if (!this.field3308) {
                this.field3309 = new Class5052().method15491(this);
                this.field3308 = true;
            }
        }
        if (this.method3214()) {
            this.field3309.method3038(this.field3150, this.field3152, this.field3153);
        }
        if (Class9570.field41401.method22605()) {
            this.field3315 = (Class527)Class9570.method35818(Class9570.field41401, this, method24312);
        }
    }
    
    private void method3216(final int n, final int n2) {
        this.method3029(new Class654(this.field3152 / 2 - 100, n, 200, 20, Class8822.method30773("menu.singleplayer", new Object[0]), class654 -> this.field3150.method5244(new Class544(this))));
        this.method3029(new Class654(this.field3152 / 2 - 100, n + n2 * 1, 200, 20, Class8822.method30773("menu.multiplayer", new Object[0]), class654 -> {
            if (!this.field3150.field4648.field23434) {
                this.field3150.method5244(new Class530(this));
            }
            else {
                this.field3150.method5244(new Class720(this));
            }
        }));
        this.method3029(new Class654(this.field3152 / 2 - 100, n + n2 * 2, 200, 20, Class8822.method30773("menu.online", new Object[0]), class654 -> this.method3218()));
        if (Class9570.field41399.method22619()) {
            if (this.field3154.size() > 0) {
                final Class573 class573 = this.field3154.get(this.field3154.size() - 1);
                class573.field3426 = this.field3152 / 2 + 2;
                class573.method3365(98);
            }
        }
    }
    
    private void method3217(final int n, final int n2) {
        this.method3029(new Class654(this.field3152 / 2 - 100, n, 200, 20, Class8822.method30773("menu.playdemo", new Object[0]), class654 -> this.field3150.method5262("Demo_World", "Demo_World", Class394.field2295)));
        this.field3305 = this.method3029(new Class654(this.field3152 / 2 - 100, n + n2 * 1, 200, 20, Class8822.method30773("menu.resetdemo", new Object[0]), class654 -> {
            final Class8660 method25791 = this.field3150.method5243().method25791("Demo_World");
            if (method25791 != null) {
                this.field3150.method5244(new Class546(this::method3219, new Class2259("selectWorld.deleteQuestion", new Object[0]), new Class2259("selectWorld.deleteWarning", new Object[] { method25791.method29549() }), Class8822.method30773("selectWorld.deleteButton", new Object[0]), Class8822.method30773("gui.cancel", new Object[0])));
            }
        }));
        if (this.field3150.method5243().method25791("Demo_World") == null) {
            this.field3305.field3431 = false;
        }
    }
    
    private void method3218() {
        new Class5052().method15490(this);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (this.field3314 == 0L) {
            if (this.field3313) {
                this.field3314 = Class8349.method27837();
            }
        }
        final float n4 = this.field3313 ? ((Class8349.method27837() - this.field3314) / 1000.0f) : 1.0f;
        Class8933.method31514();
        Class565.method3293(0, 0, this.field3152, this.field3153, -1);
        this.field3312.method35257(n3, Class9546.method35653(n4, 0.0f, 1.0f));
        final int n5 = this.field3152 / 2 - 137;
        this.field3150.method5290().method5849(Class548.field3301);
        Class8726.method30011();
        Class8726.method30013(Class2050.field11693, Class2135.field12460);
        Class8726.method30068(1.0f, 1.0f, 1.0f, this.field3313 ? ((float)Class9546.method35649(Class9546.method35653(n4, 0.0f, 1.0f))) : 1.0f);
        Class565.method3300(0, 0, this.field3152, this.field3153, 0.0f, 0.0f, 16, 128, 16, 128);
        final float n6 = this.field3313 ? Class9546.method35653(n4 - 1.0f, 0.0f, 1.0f) : 1.0f;
        final int n7 = Class9546.method35649(n6 * 255.0f) << 24;
        if ((n7 & 0xFC000000) != 0x0) {
            this.field3150.method5290().method5849(Class548.field3306);
            Class8726.method30068(1.0f, 1.0f, 1.0f, n6);
            if (!this.field3303) {
                this.method3186(n5 + 0, 30, 0, 0, 155, 44);
                this.method3186(n5 + 155, 30, 0, 45, 155, 44);
            }
            else {
                this.method3186(n5 + 0, 30, 0, 0, 99, 44);
                this.method3186(n5 + 99, 30, 129, 0, 27, 44);
                this.method3186(n5 + 99 + 26, 30, 126, 0, 3, 44);
                this.method3186(n5 + 99 + 26 + 3, 30, 99, 0, 26, 44);
                this.method3186(n5 + 155, 30, 0, 45, 155, 44);
            }
            this.field3150.method5290().method5849(Class548.field3307);
            Class565.method3188(n5 + 88, 67, 0.0f, 0.0f, 98, 14, 128, 16);
            if (Class9570.field41309.method22605()) {
                this.field3304 = Class9570.method35817(Class9570.field41309, this, this.field3150.field4643, this.field3152, this.field3153);
            }
            if (this.field3304 != null) {
                Class8726.method30059();
                Class8726.method30065((float)(this.field3152 / 2 + 90), 70.0f, 0.0f);
                Class8726.method30062(-20.0f, 0.0f, 0.0f, 1.0f);
                final float n8 = (1.8f - Class9546.method35647(Class9546.method35638(Class8349.method27837() % 1000L / 1000.0f * 6.2831855f) * 0.1f)) * 100.0f / (this.field3156.method6617(this.field3304) + 32);
                Class8726.method30063(n8, n8, n8);
                this.method3295(this.field3156, this.field3304, 0, -8, 0xFFFF00 | n7);
                Class8726.method30060();
            }
            final String string = "Minecraft " + Class9528.method35579().getName();
            String str;
            if (!this.field3150.method5268()) {
                str = string + ("release".equalsIgnoreCase(this.field3150.method5236()) ? "" : ("/" + this.field3150.method5236()));
            }
            else {
                str = string + " Demo";
            }
            if (this.field3150.method5229()) {
                str += Class8822.method30773("menu.modded", new Object[0]);
            }
            if (!Class9570.field41179.method22623()) {
                this.method3297(this.field3156, str, 2, this.field3153 - 10, 0xFFFFFF | n7);
            }
            else {
                if (Class9570.field41181.method22605()) {
                    Class9570.method35818(Class9570.field41181, true, true, (n10, s) -> this.method3297(this.field3156, s, 2, this.field3153 - (10 + n10 * 10), 0xFFFFFF | n9));
                }
                if (Class9570.field41182.method22605()) {
                    Class9570.method35818(Class9570.field41182, (n12, s2) -> this.method3297(this.field3156, s2, this.field3152 - this.field3156.method6617(s2), this.field3153 - (10 + (n12 + 1) * 10), 0xFFFFFF | n11));
                }
            }
            this.method3297(this.field3156, "Copyright Mojang AB. Do not distribute!", this.field3311, this.field3153 - 10, 0xFFFFFF | n7);
            if (n > this.field3311) {
                if (n < this.field3311 + this.field3310) {
                    if (n2 > this.field3153 - 10) {
                        if (n2 < this.field3153) {
                            Class565.method3293(this.field3311, this.field3153 - 1, this.field3311 + this.field3310, this.field3153, 0xFFFFFF | n7);
                        }
                    }
                }
            }
            final Iterator<Class573> iterator = this.field3154.iterator();
            while (iterator.hasNext()) {
                iterator.next().method3366(n6);
            }
            super.method2975(n, n2, n3);
            if (this.method3214()) {
                if (n6 >= 1.0f) {
                    this.field3309.method2975(n, n2, n3);
                }
            }
        }
        if (this.field3315 != null) {
            this.field3315.method2975(n, n2, n3);
        }
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (super.method2982(n, n2, n3)) {
            return true;
        }
        if (this.method3214() && this.field3309.method2982(n, n2, n3)) {
            return true;
        }
        if (n > this.field3311) {
            if (n < this.field3311 + this.field3310) {
                if (n2 > this.field3153 - 10) {
                    if (n2 < this.field3153) {
                        this.field3150.method5244(new Class697(false, Runnables.doNothing()));
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method2971() {
        if (this.field3309 != null) {
            this.field3309.method2971();
        }
    }
    
    private void method3219(final boolean b) {
        if (b) {
            this.field3150.method5243().method25796("Demo_World");
        }
        this.field3150.method5244(this);
    }
    
    static {
        field3300 = new Class8065(new Class1932("textures/gui/title/background/panorama"));
        field3301 = new Class1932("textures/gui/title/background/panorama_overlay.png");
        field3302 = new Class1932("textures/gui/accessibility.png");
        field3306 = new Class1932("textures/gui/title/minecraft.png");
        field3307 = new Class1932("textures/gui/title/edition.png");
    }
}
