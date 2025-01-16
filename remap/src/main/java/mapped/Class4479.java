// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class4479 extends Class4473
{
    public Class1964 field19869;
    
    public Class4479(final Class9520 class9520, final int n, final Class1964 field19869) {
        super(class9520, n);
        this.field19869 = field19869;
    }
    
    public Class4479(final Class9520 class9520, final Class51 class9521) {
        super(class9520, class9521);
        this.field19869 = Class1964.method7956(class9521.method319("MST"));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        class51.method298("MST", this.field19869.ordinal());
    }
    
    public BlockState method13462() {
        switch (Class8427.field34588[this.field19869.ordinal()]) {
            default: {
                return Class7521.field29160.getDefaultState();
            }
            case 2: {
                return Class7521.field29165.getDefaultState();
            }
        }
    }
    
    public BlockState method13463() {
        switch (Class8427.field34588[this.field19869.ordinal()]) {
            default: {
                return Class7521.field29336.getDefaultState();
            }
            case 2: {
                return Class7521.field29623.getDefaultState();
            }
        }
    }
    
    public boolean method13464(final Class1855 class1855, final MutableBoundingBox class1856, final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i <= n2; ++i) {
            if (this.method13441(class1855, i, n3 + 1, n4, class1856).method21706()) {
                return false;
            }
        }
        return true;
    }
}
