// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicates;
import net.minecraft.util.math.MathHelper;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Class576 extends Class573 implements Class563, Class574
{
    private final Class1844 field3438;
    private String field3439;
    private int field3440;
    private int field3441;
    private boolean field3442;
    private boolean field3443;
    private boolean field3444;
    private boolean field3445;
    private int field3446;
    private int field3447;
    private int field3448;
    private int field3449;
    private int field3450;
    private String field3451;
    private Consumer<String> field3452;
    private Predicate<String> field3453;
    private BiFunction<String, Integer, String> field3454;
    
    public Class576(final Class1844 class1844, final int n, final int n2, final int n3, final int n4, final String s) {
        this(class1844, n, n2, n3, n4, null, s);
    }
    
    public Class576(final Class1844 field3438, final int n, final int n2, final int n3, final int n4, final Class576 class576, final String s) {
        super(n, n2, n3, n4, s);
        this.field3439 = "";
        this.field3440 = 32;
        this.field3442 = true;
        this.field3443 = true;
        this.field3444 = true;
        this.field3449 = 14737632;
        this.field3450 = 7368816;
        this.field3453 = (Predicate<String>)Predicates.alwaysTrue();
        this.field3454 = (BiFunction<String, Integer, String>)((s2, p1) -> s2);
        this.field3438 = field3438;
        if (class576 != null) {
            this.method3377(class576.method3378());
        }
    }
    
    public void method3374(final Consumer<String> field3452) {
        this.field3452 = field3452;
    }
    
    public void method3375(final BiFunction<String, Integer, String> field3454) {
        this.field3454 = field3454;
    }
    
    public void method3376() {
        ++this.field3441;
    }
    
    @Override
    public String method3352() {
        final String method3369 = this.method3369();
        return method3369.isEmpty() ? "" : Class8822.method30773("gui.narrate.editBox", method3369, this.field3439);
    }
    
    public void method3377(final String field3439) {
        if (this.field3453.test(field3439)) {
            if (field3439.length() <= this.field3440) {
                this.field3439 = field3439;
            }
            else {
                this.field3439 = field3439.substring(0, this.field3440);
            }
            this.method3393();
            this.method3407(this.field3447);
            this.method3382(field3439);
        }
    }
    
    public String method3378() {
        return this.field3439;
    }
    
    public String method3379() {
        return this.field3439.substring((this.field3447 >= this.field3448) ? this.field3448 : this.field3447, (this.field3447 >= this.field3448) ? this.field3447 : this.field3448);
    }
    
    public void method3380(final Predicate<String> field3453) {
        this.field3453 = field3453;
    }
    
    public void method3381(final String s) {
        String string = "";
        final String method35577 = Class9528.method35577(s);
        final int endIndex = (this.field3447 >= this.field3448) ? this.field3448 : this.field3447;
        final int beginIndex = (this.field3447 >= this.field3448) ? this.field3447 : this.field3448;
        final int endIndex2 = this.field3440 - this.field3439.length() - (endIndex - beginIndex);
        if (!this.field3439.isEmpty()) {
            string += this.field3439.substring(0, endIndex);
        }
        String s2;
        int length;
        if (endIndex2 >= method35577.length()) {
            s2 = string + method35577;
            length = method35577.length();
        }
        else {
            s2 = string + method35577.substring(0, endIndex2);
            length = endIndex2;
        }
        if (!this.field3439.isEmpty()) {
            if (beginIndex < this.field3439.length()) {
                s2 += this.field3439.substring(beginIndex);
            }
        }
        if (this.field3453.test(s2)) {
            this.field3439 = s2;
            this.method3391(endIndex + length);
            this.method3407(this.field3447);
            this.method3382(this.field3439);
        }
    }
    
    private void method3382(final String s) {
        if (this.field3452 != null) {
            this.field3452.accept(s);
        }
        this.field3434 = Class8349.method27837() + 500L;
    }
    
    private void method3383(final int n) {
        if (!Class527.method3046()) {
            this.method3385(n);
        }
        else {
            this.method3384(n);
        }
    }
    
    public void method3384(final int n) {
        if (!this.field3439.isEmpty()) {
            if (this.field3448 == this.field3447) {
                this.method3385(this.method3386(n) - this.field3447);
            }
            else {
                this.method3381("");
            }
        }
    }
    
    public void method3385(final int n) {
        if (!this.field3439.isEmpty()) {
            if (this.field3448 == this.field3447) {
                final boolean b = n < 0;
                final int endIndex = b ? (this.field3447 + n) : this.field3447;
                final int beginIndex = b ? this.field3447 : (this.field3447 + n);
                String s = "";
                if (endIndex >= 0) {
                    s = this.field3439.substring(0, endIndex);
                }
                if (beginIndex < this.field3439.length()) {
                    s += this.field3439.substring(beginIndex);
                }
                if (this.field3453.test(s)) {
                    this.field3439 = s;
                    if (b) {
                        this.method3389(n);
                    }
                    this.method3382(this.field3439);
                }
            }
            else {
                this.method3381("");
            }
        }
    }
    
    public int method3386(final int n) {
        return this.method3387(n, this.method3399());
    }
    
    private int method3387(final int n, final int n2) {
        return this.method3388(n, n2, true);
    }
    
    private int method3388(final int a, final int n, final boolean b) {
        int i = n;
        final boolean b2 = a < 0;
        for (int abs = Math.abs(a), j = 0; j < abs; ++j) {
            if (b2) {
                while (b) {
                    if (i <= 0) {
                        break;
                    }
                    if (this.field3439.charAt(i - 1) != ' ') {
                        break;
                    }
                    --i;
                }
                while (i > 0) {
                    if (this.field3439.charAt(i - 1) == ' ') {
                        break;
                    }
                    --i;
                }
            }
            else {
                final int length = this.field3439.length();
                i = this.field3439.indexOf(32, i);
                if (i != -1) {
                    while (b) {
                        if (i >= length) {
                            break;
                        }
                        if (this.field3439.charAt(i) != ' ') {
                            break;
                        }
                        ++i;
                    }
                }
                else {
                    i = length;
                }
            }
        }
        return i;
    }
    
    public void method3389(final int n) {
        this.method3390(this.field3447 + n);
    }
    
    public void method3390(final int n) {
        this.method3391(n);
        if (!this.field3445) {
            this.method3407(this.field3447);
        }
        this.method3382(this.field3439);
    }
    
    public void method3391(final int n) {
        this.field3447 = MathHelper.method35651(n, 0, this.field3439.length());
    }
    
    public void method3392() {
        this.method3390(0);
    }
    
    public void method3393() {
        this.method3390(this.field3439.length());
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (!this.method3394()) {
            return false;
        }
        this.field3445 = Class527.method3047();
        if (Class527.method3052(n)) {
            this.method3393();
            this.method3407(0);
            return true;
        }
        if (Class527.method3051(n)) {
            Class869.method5277().field4651.method22508(this.method3379());
            return true;
        }
        if (Class527.method3050(n)) {
            if (this.field3444) {
                this.method3381(Class869.method5277().field4651.method22507());
            }
            return true;
        }
        if (Class527.method3049(n)) {
            Class869.method5277().field4651.method22508(this.method3379());
            if (this.field3444) {
                this.method3381("");
            }
            return true;
        }
        switch (n) {
            case 259: {
                if (this.field3444) {
                    this.field3445 = false;
                    this.method3383(-1);
                    this.field3445 = Class527.method3047();
                }
                return true;
            }
            default: {
                return false;
            }
            case 261: {
                if (this.field3444) {
                    this.field3445 = false;
                    this.method3383(1);
                    this.field3445 = Class527.method3047();
                }
                return true;
            }
            case 262: {
                if (Class527.method3046()) {
                    this.method3390(this.method3386(1));
                }
                else {
                    this.method3389(1);
                }
                return true;
            }
            case 263: {
                if (Class527.method3046()) {
                    this.method3390(this.method3386(-1));
                }
                else {
                    this.method3389(-1);
                }
                return true;
            }
            case 268: {
                this.method3392();
                return true;
            }
            case 269: {
                this.method3393();
                return true;
            }
        }
    }
    
    public boolean method3394() {
        if (this.method3409()) {
            if (this.method3370()) {
                if (this.method3404()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method3004(final char c, final int n) {
        if (!this.method3394()) {
            return false;
        }
        if (!Class9528.method35576(c)) {
            return false;
        }
        if (this.field3444) {
            this.method3381(Character.toString(c));
        }
        return true;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (this.method3409()) {
            boolean b = false;
            Label_0078: {
                if (n >= this.field3426) {
                    if (n < this.field3426 + this.field3424) {
                        if (n2 >= this.field3427) {
                            if (n2 < this.field3427 + this.field3425) {
                                b = true;
                                break Label_0078;
                            }
                        }
                    }
                }
                b = false;
            }
            final boolean b2 = b;
            if (this.field3443) {
                this.method3395(b2);
            }
            if (this.method3370()) {
                if (b2) {
                    if (n3 == 0) {
                        int n4 = MathHelper.floor(n) - this.field3426;
                        if (this.field3442) {
                            n4 -= 4;
                        }
                        this.method3390(this.field3438.method6619(this.field3438.method6619(this.field3439.substring(this.field3446), this.method3406()), n4).length() + this.field3446);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public void method3395(final boolean b) {
        super.method3371(b);
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        if (this.method3409()) {
            if (this.method3400()) {
                Class565.method3293(this.field3426 - 1, this.field3427 - 1, this.field3426 + this.field3424 + 1, this.field3427 + this.field3425 + 1, -6250336);
                Class565.method3293(this.field3426, this.field3427, this.field3426 + this.field3424, this.field3427 + this.field3425, -16777216);
            }
            final int n4 = this.field3444 ? this.field3449 : this.field3450;
            final int n5 = this.field3447 - this.field3446;
            int length = this.field3448 - this.field3446;
            final String method6619 = this.field3438.method6619(this.field3439.substring(this.field3446), this.method3406());
            final boolean b = n5 >= 0 && n5 <= method6619.length();
            boolean b2 = false;
            Label_0224: {
                if (this.method3370()) {
                    if (this.field3441 / 6 % 2 == 0) {
                        if (b) {
                            b2 = true;
                            break Label_0224;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = b2;
            final int n6 = this.field3442 ? (this.field3426 + 4) : this.field3426;
            final int n7 = this.field3442 ? (this.field3427 + (this.field3425 - 8) / 2) : this.field3427;
            int method6620 = n6;
            if (length > method6619.length()) {
                length = method6619.length();
            }
            if (!method6619.isEmpty()) {
                method6620 = this.field3438.method6609(this.field3454.apply(b ? method6619.substring(0, n5) : method6619, this.field3446), (float)n6, (float)n7, n4);
            }
            final boolean b4 = this.field3447 < this.field3439.length() || this.field3439.length() >= this.method3398();
            int n8 = method6620;
            if (b) {
                if (b4) {
                    n8 = method6620 - 1;
                    --method6620;
                }
            }
            else {
                n8 = ((n5 <= 0) ? n6 : (n6 + this.field3424));
            }
            if (!method6619.isEmpty()) {
                if (b) {
                    if (n5 < method6619.length()) {
                        this.field3438.method6609(this.field3454.apply(method6619.substring(n5), this.field3447), (float)method6620, (float)n7, n4);
                    }
                }
            }
            if (!b4) {
                if (this.field3451 != null) {
                    this.field3438.method6609(this.field3451, (float)(n8 - 1), (float)n7, -8355712);
                }
            }
            if (b3) {
                if (!b4) {
                    this.field3438.method6609("_", (float)n8, (float)n7, n4);
                }
                else {
                    Class565.method3293(n8, n7 - 1, n8 + 1, n7 + 1 + 9, -3092272);
                }
            }
            if (length != n5) {
                this.method3396(n8, n7 - 1, n6 + this.field3438.method6617(method6619.substring(0, length)) - 1, n7 + 1 + 9);
            }
        }
    }
    
    private void method3396(int n, int n2, int n3, int n4) {
        if (n < n3) {
            final int n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            final int n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        if (n3 > this.field3426 + this.field3424) {
            n3 = this.field3426 + this.field3424;
        }
        if (n > this.field3426 + this.field3424) {
            n = this.field3426 + this.field3424;
        }
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        Class8726.method30068(0.0f, 0.0f, 255.0f, 255.0f);
        Class8726.method30041();
        Class8726.method30036();
        Class8726.method30038(Class2188.field12992);
        method22695.method12390(7, Class9237.field39614);
        method22695.method12432(n, n4, 0.0).method12397();
        method22695.method12432(n3, n4, 0.0).method12397();
        method22695.method12432(n3, n2, 0.0).method12397();
        method22695.method12432(n, n2, 0.0).method12397();
        method22694.method22695();
        Class8726.method30037();
        Class8726.method30040();
    }
    
    public void method3397(final int n) {
        this.field3440 = n;
        if (this.field3439.length() > n) {
            this.method3382(this.field3439 = this.field3439.substring(0, n));
        }
    }
    
    private int method3398() {
        return this.field3440;
    }
    
    public int method3399() {
        return this.field3447;
    }
    
    private boolean method3400() {
        return this.field3442;
    }
    
    public void method3401(final boolean field3442) {
        this.field3442 = field3442;
    }
    
    public void method3402(final int field3449) {
        this.field3449 = field3449;
    }
    
    public void method3403(final int field3450) {
        this.field3450 = field3450;
    }
    
    @Override
    public boolean method3281(final boolean b) {
        return this.field3432 && this.field3444 && super.method3281(b);
    }
    
    @Override
    public boolean method3055(final double n, final double n2) {
        if (this.field3432) {
            if (n >= this.field3426) {
                if (n < this.field3426 + this.field3424) {
                    if (n2 >= this.field3427) {
                        if (n2 < this.field3427 + this.field3425) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method3361(final boolean b) {
        if (b) {
            this.field3441 = 0;
        }
    }
    
    private boolean method3404() {
        return this.field3444;
    }
    
    public void method3405(final boolean field3444) {
        this.field3444 = field3444;
    }
    
    public int method3406() {
        return this.method3400() ? (this.field3424 - 8) : this.field3424;
    }
    
    public void method3407(final int n) {
        final int length = this.field3439.length();
        this.field3448 = MathHelper.method35651(n, 0, length);
        if (this.field3438 != null) {
            if (this.field3446 > length) {
                this.field3446 = length;
            }
            final int method3406 = this.method3406();
            final int n2 = this.field3438.method6619(this.field3439.substring(this.field3446), method3406).length() + this.field3446;
            if (this.field3448 == this.field3446) {
                this.field3446 -= this.field3438.method6620(this.field3439, method3406, true).length();
            }
            if (this.field3448 <= n2) {
                if (this.field3448 <= this.field3446) {
                    this.field3446 -= this.field3446 - this.field3448;
                }
            }
            else {
                this.field3446 += this.field3448 - n2;
            }
            this.field3446 = MathHelper.method35651(this.field3446, 0, length);
        }
    }
    
    public void method3408(final boolean field3443) {
        this.field3443 = field3443;
    }
    
    public boolean method3409() {
        return this.field3432;
    }
    
    public void method3410(final boolean field3432) {
        this.field3432 = field3432;
    }
    
    public void method3411(final String field3451) {
        this.field3451 = field3451;
    }
    
    public int method3412(final int endIndex) {
        return (endIndex <= this.field3439.length()) ? (this.field3426 + this.field3438.method6617(this.field3439.substring(0, endIndex))) : this.field3426;
    }
    
    public void method3413(final int field3426) {
        this.field3426 = field3426;
    }
}
