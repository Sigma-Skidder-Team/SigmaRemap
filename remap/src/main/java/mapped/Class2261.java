// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.TextComponent;

import java.util.function.Supplier;
import java.util.function.Function;

public class Class2261 extends TextComponent
{
    public static Function<String, Supplier<String>> field13818;
    private final String field13819;
    private Supplier<String> field13820;
    
    public Class2261(final String field13819) {
        this.field13819 = field13819;
    }
    
    @Override
    public String getUnformattedComponentText() {
        if (this.field13820 == null) {
            this.field13820 = Class2261.field13818.apply(this.field13819);
        }
        return this.field13820.get();
    }
    
    public Class2261 method8500() {
        return new Class2261(this.field13819);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class2261 && this.field13819.equals(((Class2261)o).field13819) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "KeybindComponent{keybind='" + this.field13819 + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
    
    public String method8501() {
        return this.field13819;
    }
    
    static {
        Class2261.field13818 = (p0 -> () -> s2);
    }
}
