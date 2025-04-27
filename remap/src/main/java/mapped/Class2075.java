// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2075
{
    field11971("open_url", true), 
    field11972("open_file", false), 
    field11973("run_command", true), 
    field11974("suggest_command", true), 
    field11975("change_page", true), 
    field11976("copy_to_clipboard", true);
    
    private static final Map<String, Class2075> field11977;
    private final boolean field11978;
    private final String field11979;
    
    Class2075(final String field11979, final boolean field11980) {
        this.field11979 = field11979;
        this.field11978 = field11980;
    }
    
    public boolean method8176() {
        return this.field11978;
    }
    
    public String method8177() {
        return this.field11979;
    }
    
    public static Class2075 method8178(final String s) {
        return Class2075.field11977.get(s);
    }
    
    static {
        field11977 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2075, ? extends String>)Class2075::method8177, class2075 -> class2075));
    }
}
