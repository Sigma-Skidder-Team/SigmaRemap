// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import org.apache.logging.log4j.Logger;

public class Class2252 extends Class2251 implements Class2253
{
    private static final Logger field13793;
    private final String field13794;
    private final Class9043 field13795;
    
    public Class2252(final String field13794) {
        this.field13794 = field13794;
        Class9043 method25070 = null;
        try {
            method25070 = new Class7793(new StringReader(field13794)).method25070();
        }
        catch (final CommandSyntaxException ex) {
            Class2252.field13793.warn("Invalid selector component: {}", (Object)field13794, (Object)ex.getMessage());
        }
        this.field13795 = method25070;
    }
    
    public String method8472() {
        return this.field13794;
    }
    
    @Override
    public ITextComponent method8473(final Class7492 class7492, final Entity class7493, final int n) throws CommandSyntaxException {
        return (class7492 != null && this.field13795 != null) ? Class9043.method32517(this.field13795.method32511(class7492)) : new Class2260("");
    }
    
    @Override
    public String method8459() {
        return this.field13794;
    }
    
    public Class2252 method8474() {
        return new Class2252(this.field13794);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class2252 && this.field13794.equals(((Class2252)o).field13794) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.field13794 + '\'' + ", siblings=" + this.field13791 + ", style=" + this.method8456() + '}';
    }
    
    static {
        field13793 = LogManager.getLogger();
    }
}
