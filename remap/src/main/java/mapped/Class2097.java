// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.stream.Collectors;
import java.util.Arrays;
import javax.annotation.Nullable;
import java.util.Map;

public enum Class2097
{
    field12147("always", 0), 
    field12148("never", 1), 
    field12149("hideForOtherTeams", 2), 
    field12150("hideForOwnTeam", 3);
    
    private static final Map<String, Class2097> field12151;
    public final String field12152;
    public final int field12153;
    
    @Nullable
    public static Class2097 method8218(final String s) {
        return Class2097.field12151.get(s);
    }
    
    Class2097(final String field12152, final int field12153) {
        this.field12152 = field12152;
        this.field12153 = field12153;
    }
    
    public ITextComponent method8219() {
        return new Class2259("team.visibility." + this.field12152);
    }
    
    static {
        field12151 = Arrays.stream(values()).collect(Collectors.toMap(class2097 -> class2097.field12152, class2098 -> class2098));
    }
}
