// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7577 extends Class7576
{
    private final Class2031 field30054;
    private final String field30055;
    
    public Class7577(final Class8542 class8542, final String s, final Class2314 class8543, final Class2314 class8544, final Class2031 class8545) {
        this(class8542, true, s, class8543, class8544, class8545);
    }
    
    public Class7577(final Class8542 class8542, final boolean field30052, final String field30053, final Class2314 class8543, final Class2314 class8544, final Class2031 field30054) {
        super(class8542, class8543, class8544);
        if (field30053 == null) {
            throw new NullPointerException("value in a Node is required.");
        }
        this.field30055 = field30053;
        if (field30054 != null) {
            this.field30054 = field30054;
            this.field30052 = field30052;
            return;
        }
        throw new NullPointerException("Scalar style must be provided.");
    }
    
    public Class2031 method23855() {
        return this.field30054;
    }
    
    @Override
    public Class2085 method23834() {
        return Class2085.field12055;
    }
    
    public String method23856() {
        return this.field30055;
    }
    
    @Override
    public String toString() {
        return "<" + this.getClass().getName() + " (tag=" + this.method23845() + ", value=" + this.method23856() + ")>";
    }
    
    public boolean method23857() {
        return this.field30054 == Class2031.field11579;
    }
}
