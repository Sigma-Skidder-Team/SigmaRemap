// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.IDN;
import java.util.function.Predicate;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class Class538 extends Class527
{
    private Class654 field3197;
    private final BooleanConsumer field3198;
    private final Class9575 field3199;
    private Class576 field3200;
    private Class576 field3201;
    private Class654 field3202;
    private final Class527 field3203;
    private final Predicate<String> field3204;
    
    public Class538(final Class527 field3203, final BooleanConsumer field3204, final Class9575 field3205) {
        super(new Class2259("addServer.title", new Object[0]));
        this.field3204 = (s -> {
            if (Class8272.method27500(s)) {
                return true;
            }
            else {
                s.split(":");
                final String[] array;
                if (array.length == 0) {
                    return true;
                }
                else {
                    try {
                        IDN.toASCII(array[0]);
                        return true;
                    }
                    catch (final IllegalArgumentException ex) {
                        return false;
                    }
                }
            }
        });
        this.field3203 = field3203;
        this.field3198 = field3204;
        this.field3199 = field3205;
    }
    
    @Override
    public void method2992() {
        this.field3201.method3376();
        this.field3200.method3376();
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        (this.field3201 = new Class576(this.field3156, this.field3152 / 2 - 100, 66, 200, 20, Class8822.method30773("addServer.enterName", new Object[0]))).method3395(true);
        this.field3201.method3377(this.field3199.field41612);
        this.field3201.method3374(this::method3096);
        this.field3149.add(this.field3201);
        (this.field3200 = new Class576(this.field3156, this.field3152 / 2 - 100, 106, 200, 20, Class8822.method30773("addServer.enterIp", new Object[0]))).method3397(128);
        this.field3200.method3377(this.field3199.field41613);
        this.field3200.method3380(this.field3204);
        this.field3200.method3374(this::method3096);
        this.field3149.add(this.field3200);
        this.field3202 = this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 72, 200, 20, Class8822.method30773("addServer.resourcePack", new Object[0]) + ": " + this.field3199.method35866().method8380().method8461(), class654 -> {
            this.field3199.method35867(Class2203.values()[(this.field3199.method35866().ordinal() + 1) % Class2203.values().length]);
            this.field3202.method3367(Class8822.method30773("addServer.resourcePack", new Object[0]) + ": " + this.field3199.method35866().method8380().method8461());
        }));
        this.field3197 = this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 96 + 18, 200, 20, Class8822.method30773("addServer.add", new Object[0]), class654 -> this.method3097()));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 120 + 18, 200, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3198.accept(false)));
        this.method3098();
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3200.method3378();
        final String method3379 = this.field3201.method3378();
        this.method3038(class869, n, n2);
        this.field3200.method3377(method3378);
        this.field3201.method3377(method3379);
    }
    
    private void method3096(final String s) {
        this.method3098();
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    private void method3097() {
        this.field3199.field41612 = this.field3201.method3378();
        this.field3199.field41613 = this.field3200.method3378();
        this.field3198.accept(true);
    }
    
    @Override
    public void method3028() {
        this.method3098();
        this.field3150.method5244(this.field3203);
    }
    
    private void method3098() {
        final String method3378 = this.field3200.method3378();
        boolean b = false;
        Label_0050: {
            if (!method3378.isEmpty()) {
                if (method3378.split(":").length > 0) {
                    if (method3378.indexOf(32) == -1) {
                        b = true;
                        break Label_0050;
                    }
                }
            }
            b = false;
        }
        this.field3197.field3431 = (b && !this.field3201.method3378().isEmpty());
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 17, 16777215);
        this.method3297(this.field3156, Class8822.method30773("addServer.enterName", new Object[0]), this.field3152 / 2 - 100, 53, 10526880);
        this.method3297(this.field3156, Class8822.method30773("addServer.enterIp", new Object[0]), this.field3152 / 2 - 100, 94, 10526880);
        this.field3201.method2975(n, n2, n3);
        this.field3200.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
