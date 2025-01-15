// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Comparator;
import java.util.Arrays;
import javax.annotation.Nullable;

public enum Class2113
{
    field12290(0, "peaceful"), 
    field12291(1, "easy"), 
    field12292(2, "normal"), 
    field12293(3, "hard");
    
    private static final Class2113[] field12294;
    private final int field12295;
    private final String field12296;
    
    private Class2113(final int field12295, final String field12296) {
        this.field12295 = field12295;
        this.field12296 = field12296;
    }
    
    public int method8235() {
        return this.field12295;
    }
    
    public ITextComponent method8236() {
        return new Class2259("options.difficulty." + this.field12296, new Object[0]);
    }
    
    public static Class2113 method8237(final int n) {
        return Class2113.field12294[n % Class2113.field12294.length];
    }
    
    @Nullable
    public static Class2113 method8238(final String anObject) {
        for (final Class2113 class2113 : values()) {
            if (class2113.field12296.equals(anObject)) {
                return class2113;
            }
        }
        return null;
    }
    
    public String method8239() {
        return this.field12296;
    }
    
    static {
        field12294 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2113::method8235)).toArray(Class2113[]::new);
    }
}
