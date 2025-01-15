// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public abstract class Class7574<T> extends Class7576
{
    private Class227 field30044;
    
    public Class7574(final Class8542 class8542, final Class2314 class8543, final Class2314 class8544, final Class227 class8545) {
        super(class8542, class8543, class8544);
        this.method23838(class8545);
    }
    
    public abstract List<T> method23835();
    
    public Class227 method23837() {
        return this.field30044;
    }
    
    public void method23838(final Class227 field30044) {
        if (field30044 != null) {
            this.field30044 = field30044;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }
    
    public void method23839(final Class2314 field30049) {
        this.field30049 = field30049;
    }
}
