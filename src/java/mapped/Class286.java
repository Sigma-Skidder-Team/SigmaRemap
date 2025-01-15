// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;
import java.util.Map;

public enum Class286
{
    field1578("master"), 
    field1579("music"), 
    field1580("record"), 
    field1581("weather"), 
    field1582("block"), 
    field1583("hostile"), 
    field1584("neutral"), 
    field1585("player"), 
    field1586("ambient"), 
    field1587("voice");
    
    private static final Map<String, Class286> field1588;
    private final String field1589;
    
    private Class286(final String field1589) {
        this.field1589 = field1589;
    }
    
    public String method935() {
        return this.field1589;
    }
    
    static {
        field1588 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class286, ? extends String>)Class286::method935, (Function<? super Class286, ? extends Class286>)Function.identity()));
    }
}
