// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;
import com.mojang.brigadier.ParseResults;

public class Class6781 implements Class6782
{
    private static String[] field26681;
    private final ParseResults<Class7492> field26682;
    
    public Class6781(final ParseResults<Class7492> field26682) {
        this.field26682 = field26682;
    }
    
    @Override
    public void method20737(final Class1794 class1794, final Class7492 class1795, final ArrayDeque<Class9234> arrayDeque, final int n) throws CommandSyntaxException {
        class1794.method6506().execute(new ParseResults(this.field26682.getContext().withSource(class1795), this.field26682.getReader(), this.field26682.getExceptions()));
    }
    
    @Override
    public String toString() {
        return this.field26682.getReader().getString();
    }
}
