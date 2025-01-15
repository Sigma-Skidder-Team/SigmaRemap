// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Class8256
{
    private static String[] field33902;
    private final int field33903;
    private final int field33904;
    private final Class9043 field33905;
    
    public Class8256(final int field33903, final int field33904, final Class9043 field33905) {
        this.field33903 = field33903;
        this.field33904 = field33904;
        this.field33905 = field33905;
    }
    
    public int method27398() {
        return this.field33903;
    }
    
    public int method27399() {
        return this.field33904;
    }
    
    @Nullable
    public Class2250 method27400(final Class7492 class7492) throws CommandSyntaxException {
        return Class9043.method32517(this.field33905.method32511(class7492));
    }
}
