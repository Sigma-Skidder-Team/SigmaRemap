// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.net.URI;
import java.math.BigInteger;
import java.util.Random;

public class Class702 extends Class698
{
    private final Class527 field3862;
    private String field3863;
    private long field3864;
    private String field3865;
    private Class673 field3866;
    
    public Class702(final Class527 field3862) {
        super(new StringTextComponent(Class8822.method30773("of.options.capeOF.title", new Object[0])));
        this.field3862 = field3862;
    }
    
    @Override
    public void method2969() {
        final int n = 0 + 2;
        this.method3029(new Class673(210, this.field3152 / 2 - 155, this.field3153 / 6 + 24 * (n >> 1), 150, 20, Class8822.method30773("of.options.capeOF.openEditor", new Object[0])));
        this.method3029(new Class673(220, this.field3152 / 2 - 155 + 160, this.field3153 / 6 + 24 * (n >> 1), 150, 20, Class8822.method30773("of.options.capeOF.reloadCape", new Object[0])));
        final int n2 = n + 6;
        this.field3866 = new Class673(230, this.field3152 / 2 - 100, this.field3153 / 6 + 24 * (n2 >> 1), 200, 20, Class8822.method30773("of.options.capeOF.copyEditorLink", new Object[0]));
        this.field3866.field3432 = (this.field3865 != null);
        this.method3029(this.field3866);
        this.method3029(new Class673(200, this.field3152 / 2 - 100, this.field3153 / 6 + 24 * (n2 + 4 >> 1), Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.field3150.method5244(this.field3862);
                }
                if (class574.field3708 == 210) {
                    try {
                        final String name = this.field3150.method5287().method33694().getName();
                        final String replace = this.field3150.method5287().method33694().getId().toString().replace("-", "");
                        final String method33693 = this.field3150.method5287().method33693();
                        final String string = new BigInteger(128, new Random()).xor(new BigInteger(128, new Random(System.identityHashCode(new Object())))).toString(16);
                        this.field3150.method5301().joinServer(this.field3150.method5287().method33694(), method33693, string);
                        final String string2 = "https://optifine.net/capeChange?u=" + replace + "&n=" + name + "&s=" + string;
                        if (Class8571.method29012(new URI(string2))) {
                            this.method3903(Class4647.method13876("of.message.capeOF.openEditor"), 10000L);
                        }
                        else {
                            this.method3903(Class4647.method13876("of.message.capeOF.openEditorError"), 10000L);
                            this.method3904(string2);
                        }
                    }
                    catch (final InvalidCredentialsException ex) {
                        Class8571.method28996(Class8822.method30773("of.message.capeOF.error1", new Object[0]), Class8822.method30773("of.message.capeOF.error2", ex.getMessage()));
                        Class8571.method28848("Mojang authentication failed");
                        Class8571.method28848(ex.getClass().getName() + ": " + ex.getMessage());
                    }
                    catch (final Exception ex2) {
                        Class8571.method28848("Error opening OptiFine cape link");
                        Class8571.method28848(ex2.getClass().getName() + ": " + ex2.getMessage());
                    }
                }
                if (class574.field3708 == 220) {
                    this.method3903(Class4647.method13876("of.message.capeOF.reloadCape"), 15000L);
                    if (this.field3150.field4684 != null) {
                        this.field3150.field4684.method4112(System.currentTimeMillis() + 15000L);
                    }
                }
                if (class574.field3708 == 230 && this.field3865 != null) {
                    this.field3150.field4651.method22508(this.field3865);
                }
            }
        }
    }
    
    private void method3903(final String field3863, final long n) {
        this.field3863 = field3863;
        this.field3864 = System.currentTimeMillis() + n;
        this.method3904(null);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3843, this.field3148.getFormattedText(), this.field3152 / 2, 20, 16777215);
        if (this.field3863 != null) {
            this.method3295(this.field3843, this.field3863, this.field3152 / 2, this.field3153 / 6 + 60, 16777215);
            if (System.currentTimeMillis() > this.field3864) {
                this.field3863 = null;
                this.method3904(null);
            }
        }
        super.method2975(n, n2, n3);
    }
    
    public void method3904(final String field3865) {
        this.field3865 = field3865;
        this.field3866.field3432 = (field3865 != null);
    }
}
