// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class1976
{
    field10948("monster", 70, false, false), 
    field10949("creature", 10, true, true), 
    field10950("ambient", 15, true, false), 
    field10951("water_creature", 15, true, false), 
    field10952("misc", 15, true, false);
    
    private static final Map<String, Class1976> field10953;
    private final int field10954;
    private final boolean field10955;
    private final boolean field10956;
    private final String field10957;
    
    Class1976(final String field10957, final int field10958, final boolean field10959, final boolean field10960) {
        this.field10957 = field10957;
        this.field10954 = field10958;
        this.field10955 = field10959;
        this.field10956 = field10960;
    }
    
    public String method7986() {
        return this.field10957;
    }
    
    public int method7987() {
        return this.field10954;
    }
    
    public boolean method7988() {
        return this.field10955;
    }
    
    public boolean method7989() {
        return this.field10956;
    }
    
    static {
        field10953 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class1976, ? extends String>)Class1976::method7986, class1976 -> class1976));
    }
}
