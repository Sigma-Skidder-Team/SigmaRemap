// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public final class Class9258
{
    private static String[] field39710;
    public static final int field39711 = 8192;
    public static final int field39712 = 1024;
    public final byte[] field39713;
    public int field39714;
    public int field39715;
    public boolean field39716;
    public boolean field39717;
    public Class9258 field39718;
    public Class9258 field39719;
    
    public Class9258() {
        this.field39713 = new byte[8192];
        this.field39717 = true;
        this.field39716 = false;
    }
    
    public Class9258(final Class9258 class9258) {
        this(class9258.field39713, class9258.field39714, class9258.field39715);
        class9258.field39716 = true;
    }
    
    public Class9258(final byte[] field39713, final int field39714, final int field39715) {
        this.field39713 = field39713;
        this.field39714 = field39714;
        this.field39715 = field39715;
        this.field39717 = false;
        this.field39716 = true;
    }
    
    @Nullable
    public Class9258 method34162() {
        final Class9258 class9258 = (this.field39718 == this) ? null : this.field39718;
        this.field39719.field39718 = this.field39718;
        this.field39718.field39719 = this.field39719;
        this.field39718 = null;
        this.field39719 = null;
        return class9258;
    }
    
    public Class9258 method34163(final Class9258 class9258) {
        class9258.field39719 = this;
        class9258.field39718 = this.field39718;
        this.field39718.field39719 = class9258;
        return this.field39718 = class9258;
    }
    
    public Class9258 method34164(final int n) {
        if (n > 0 && n <= this.field39715 - this.field39714) {
            Class9258 method33334;
            if (n < 1024) {
                method33334 = Class9141.method33334();
                System.arraycopy(this.field39713, this.field39714, method33334.field39713, 0, n);
            }
            else {
                method33334 = new Class9258(this);
            }
            method33334.field39715 = method33334.field39714 + n;
            this.field39714 += n;
            this.field39719.method34163(method33334);
            return method33334;
        }
        throw new IllegalArgumentException();
    }
    
    public void method34165() {
        if (this.field39719 == this) {
            throw new IllegalStateException();
        }
        if (!this.field39719.field39717) {
            return;
        }
        final int n = this.field39715 - this.field39714;
        if (n <= 8192 - this.field39719.field39715 + (this.field39719.field39716 ? 0 : this.field39719.field39714)) {
            this.method34166(this.field39719, n);
            this.method34162();
            Class9141.method33335(this);
        }
    }
    
    public void method34166(final Class9258 class9258, final int n) {
        if (class9258.field39717) {
            if (class9258.field39715 + n > 8192) {
                if (class9258.field39716) {
                    throw new IllegalArgumentException();
                }
                if (class9258.field39715 + n - class9258.field39714 > 8192) {
                    throw new IllegalArgumentException();
                }
                System.arraycopy(class9258.field39713, class9258.field39714, class9258.field39713, 0, class9258.field39715 - class9258.field39714);
                class9258.field39715 -= class9258.field39714;
                class9258.field39714 = 0;
            }
            System.arraycopy(this.field39713, this.field39714, class9258.field39713, class9258.field39715, n);
            class9258.field39715 += n;
            this.field39714 += n;
            return;
        }
        throw new IllegalArgumentException();
    }
}
