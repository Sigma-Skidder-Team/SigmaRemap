// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class Class723 extends Class527
{
    public static final Class7735 field3946;
    public static final Class1932 field3947;
    private Class7735 field3948;
    private int field3949;
    private List<ITextComponent> field3950;
    private int field3951;
    private Class680 field3952;
    private Class680 field3953;
    private final boolean field3954;
    
    public Class723(final Class7735 class7735) {
        this(class7735, true);
    }
    
    public Class723() {
        this(Class723.field3946, false);
    }
    
    private Class723(final Class7735 field3948, final boolean field3949) {
        super(Class7895.field32402);
        this.field3950 = Collections.emptyList();
        this.field3951 = -1;
        this.field3948 = field3948;
        this.field3954 = field3949;
    }
    
    public void method3968(final Class7735 field3948) {
        this.field3948 = field3948;
        this.field3949 = MathHelper.method35651(this.field3949, 0, field3948.method24684());
        this.method3976();
        this.field3951 = -1;
    }
    
    public boolean method3969(final int n) {
        final int method35651 = MathHelper.method35651(n, 0, this.field3948.method24684() - 1);
        if (method35651 == this.field3949) {
            return false;
        }
        this.field3949 = method35651;
        this.method3976();
        this.field3951 = -1;
        return true;
    }
    
    public boolean method3970(final int n) {
        return this.method3969(n);
    }
    
    @Override
    public void method2969() {
        this.method3971();
        this.method3972();
    }
    
    public void method3971() {
        this.method3029(new Class654(this.field3152 / 2 - 100, 196, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(null)));
    }
    
    public void method3972() {
        final int n = (this.field3152 - 192) / 2;
        this.field3952 = this.method3029(new Class680(n + 116, 159, true, class654 -> this.method3975(), this.field3954));
        this.field3953 = this.method3029(new Class680(n + 43, 159, false, class654 -> this.method3974(), this.field3954));
        this.method3976();
    }
    
    private int method3973() {
        return this.field3948.method24684();
    }
    
    public void method3974() {
        if (this.field3949 > 0) {
            --this.field3949;
        }
        this.method3976();
    }
    
    public void method3975() {
        if (this.field3949 < this.method3973() - 1) {
            ++this.field3949;
        }
        this.method3976();
    }
    
    private void method3976() {
        this.field3952.field3432 = (this.field3949 < this.method3973() - 1);
        this.field3953.field3432 = (this.field3949 > 0);
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        switch (n) {
            case 266: {
                this.field3953.method3705();
                return true;
            }
            case 267: {
                this.field3952.method3705();
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class723.field3947);
        final int n4 = (this.field3152 - 192) / 2;
        this.method3186(n4, 2, 0, 0, 192, 192);
        final String method30773 = Class8822.method30773("book.pageIndicator", this.field3949 + 1, Math.max(this.method3973(), 1));
        if (this.field3951 != this.field3949) {
            this.field3950 = Class8936.method31697(this.field3948.method24686(this.field3949), 114, this.field3156, true, true);
        }
        this.field3951 = this.field3949;
        this.field3156.method6610(method30773, (float)(n4 - this.method3977(method30773) + 192 - 44), 18.0f, 0);
        for (int min = Math.min(14, this.field3950.size()), i = 0; i < min; ++i) {
            this.field3156.method6610(this.field3950.get(i).method8461(), (float)(n4 + 36), (float)(32 + i * 9), 0);
        }
        final ITextComponent method30774 = this.method3978(n, n2);
        if (method30774 != null) {
            this.method3033(method30774, n, n2);
        }
        super.method2975(n, n2, n3);
    }
    
    private int method3977(final String s) {
        return this.field3156.method6617(this.field3156.method6630() ? this.field3156.method6611(s) : s);
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            final ITextComponent method3978 = this.method3978(n, n2);
            if (method3978 != null) {
                if (this.method3035(method3978)) {
                    return true;
                }
            }
        }
        return super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method3035(final ITextComponent class2250) {
        final Class9485 method30410 = class2250.method8456().method30410();
        if (method30410 == null) {
            return false;
        }
        if (method30410.method35309() == Class2075.field11975) {
            final String method30411 = method30410.method35310();
            try {
                return this.method3970(Integer.parseInt(method30411) - 1);
            }
            catch (final Exception ex) {
                return false;
            }
        }
        final boolean method30412 = super.method3035(class2250);
        if (method30412 && method30410.method35309() == Class2075.field11973) {
            this.field3150.method5244(null);
        }
        return method30412;
    }
    
    @Nullable
    public ITextComponent method3978(final double n, final double n2) {
        if (this.field3950 == null) {
            return null;
        }
        final int method35644 = MathHelper.floor(n - (this.field3152 - 192) / 2 - 36.0);
        final int method35645 = MathHelper.floor(n2 - 2.0 - 30.0);
        if (method35644 < 0 || method35645 < 0) {
            return null;
        }
        final int min = Math.min(14, this.field3950.size());
        if (method35644 <= 114 && method35645 < 9 * min + min) {
            final int n3 = method35645 / 9;
            if (n3 >= 0) {
                if (n3 < this.field3950.size()) {
                    final ITextComponent class2250 = this.field3950.get(n3);
                    int n4 = 0;
                    for (final ITextComponent class2251 : class2250) {
                        if (!(class2251 instanceof Class2260)) {
                            continue;
                        }
                        n4 += this.field3150.field4643.method6617(class2251.method8461());
                        if (n4 <= method35644) {
                            continue;
                        }
                        return class2251;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    public static List<String> method3979(final Class51 class51) {
        final Class52 method355 = class51.method328("pages", 8).method355();
        final ImmutableList$Builder builder = ImmutableList.builder();
        for (int i = 0; i < method355.size(); ++i) {
            builder.add((Object)method355.method353(i));
        }
        return (List<String>)builder.build();
    }
    
    static {
        field3946 = new Class7737();
        field3947 = new Class1932("textures/gui/book.png");
    }
}
