// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.util.Optional;

public class Class858 extends Entity
{
    private static final Class8810<Optional<BlockPos>> field4590;
    private static final Class8810<Boolean> field4591;
    public int field4592;
    
    public Class858(final Class7499<? extends Class858> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2386 = true;
        this.field4592 = this.field2423.nextInt(100000);
    }
    
    public Class858(final Class1847 class1847, final double n, final double n2, final double n3) {
        this(Class7499.field28975, class1847);
        this.method1656(n, n2, n3);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class858.field4590, Optional.empty());
        this.method1650().method33565(Class858.field4591, true);
    }
    
    @Override
    public void method1659() {
        ++this.field4592;
        if (!this.field2391.field10067) {
            final BlockPos class354 = new BlockPos(this);
            if (this.field2391.field10063 instanceof Class6738) {
                if (this.field2391.method6701(class354).method21706()) {
                    this.field2391.method6692(class354, Class7521.field29289.method11878());
                }
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        if (this.method5183() != null) {
            class51.method295("BeamTarget", Class9346.method34646(this.method5183()));
        }
        class51.method312("ShowBottom", this.method5185());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        if (class51.method316("BeamTarget", 10)) {
            this.method5182(Class9346.method34645(class51.method327("BeamTarget")));
        }
        if (class51.method316("ShowBottom", 1)) {
            this.method5184(class51.method329("ShowBottom"));
        }
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (!(class7929.method25714() instanceof Class852)) {
            if (!this.field2410) {
                if (!this.field2391.field10067) {
                    this.method1652();
                    if (!class7929.method25707()) {
                        this.field2391.method6722(null, this.method1938(), this.method1941(), this.method1945(), 6.0f, Class2196.field13367);
                    }
                    this.method5181(class7929);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1648() {
        this.method5181(Class7929.field32575);
        super.method1648();
    }
    
    private void method5181(final Class7929 class7929) {
        if (this.field2391.field10063 instanceof Class6738) {
            final Class8619 method20509 = ((Class6738)this.field2391.field10063).method20509();
            if (method20509 != null) {
                method20509.method29251(this, class7929);
            }
        }
    }
    
    public void method5182(final BlockPos value) {
        this.method1650().method33569(Class858.field4590, Optional.ofNullable(value));
    }
    
    @Nullable
    public BlockPos method5183() {
        return this.method1650().method33568(Class858.field4590).orElse(null);
    }
    
    public void method5184(final boolean b) {
        this.method1650().method33569(Class858.field4591, b);
    }
    
    public boolean method5185() {
        return this.method1650().method33568(Class858.field4591);
    }
    
    @Override
    public boolean method1753(final double n) {
        return super.method1753(n) || this.method5183() != null;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field4590 = Class9184.method33564(Class858.class, Class7709.field30665);
        field4591 = Class9184.method33564(Class858.class, Class7709.field30661);
    }
}
