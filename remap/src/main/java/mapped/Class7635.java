// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7635
{
    public static final Class7635 field30226;
    public static final Class7635 field30227;
    public static final Class7635 field30228;
    public static final Class7635 field30229;
    public static final Class7635 field30230;
    public static final Class7635 field30231;
    public static final Class7635 field30232;
    public static final Class7635 field30233;
    public static final Class7635 field30234;
    public static final Class7635 field30235;
    private final String field30236;
    
    private Class7635(final String field30236) {
        this.field30236 = field30236;
    }
    
    public String method24007() {
        return this.field30236;
    }
    
    private static Class7635 method24008(final String s) {
        return Registry.method511(Registry.field245, s, new Class7635(s));
    }
    
    @Override
    public String toString() {
        return this.method24007();
    }
    
    static {
        field30226 = method24008("core");
        field30227 = method24008("idle");
        field30228 = method24008("work");
        field30229 = method24008("play");
        field30230 = method24008("rest");
        field30231 = method24008("meet");
        field30232 = method24008("panic");
        field30233 = method24008("raid");
        field30234 = method24008("pre_raid");
        field30235 = method24008("hide");
    }
}
