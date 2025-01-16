// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8644
{
    public static final Class8061 field36250;
    public static final Class8061 field36251;
    public static final Class8061 field36252;
    public static final Class8061 field36253;
    public static final Class8061 field36254;
    public static final Class8061 field36255;
    public static final Class8061 field36256;
    public static final Class8061 field36257;
    public static final Class8061 field36258;
    public static final Class8061 field36259;
    public static final Class8061 field36260;
    public static final Class8061 field36261;
    public static final Class8061 field36262;
    public static final Class8061 field36263;
    public static final Class8061 field36264;
    public static final Class8061 field36265;
    public static final Class8061 field36266;
    public static final Class8061 field36267;
    public static final Class8061 field36268;
    public static final Class8061 field36269;
    public static final Class8061 field36270;
    public static final Class8061 field36271;
    public static final Class8061 field36272;
    public static final Class8061 field36273;
    public static final Class8061 field36274;
    public static final Class8061 field36275;
    public static final Class8061 field36276;
    public static final Class8061 field36277;
    public static final Class8061 field36278;
    public static final Class8061 field36279;
    public static final Class8061 field36280;
    public static final Class8061 field36281;
    public static final Class8061 field36282;
    public static final Class8061 field36283;
    public static final Class8061 field36284;
    public static final Class8061 field36285;
    public static final Class8061 field36286;
    public static final Class8061 field36287;
    public static final Class8061 field36288;
    public static final Class8061 field36289;
    public static final Class8061 field36290;
    public static final Class8061 field36291;
    public static final Class8061 field36292;
    
    private static Class8061 method29401(final String s, final Class8061 class8061) {
        return Registry.register(Registry.field212, s, class8061);
    }
    
    static {
        field36250 = method29401("empty", new Class8061(new Class1948[0]));
        field36251 = method29401("water", new Class8061(new Class1948[0]));
        field36252 = method29401("mundane", new Class8061(new Class1948[0]));
        field36253 = method29401("thick", new Class8061(new Class1948[0]));
        field36254 = method29401("awkward", new Class8061(new Class1948[0]));
        field36255 = method29401("night_vision", new Class8061(new Class1948[] { new Class1948(Class9439.field40489, 3600) }));
        field36256 = method29401("long_night_vision", new Class8061("night_vision", new Class1948[] { new Class1948(Class9439.field40489, 9600) }));
        field36257 = method29401("invisibility", new Class8061(new Class1948[] { new Class1948(Class9439.field40487, 3600) }));
        field36258 = method29401("long_invisibility", new Class8061("invisibility", new Class1948[] { new Class1948(Class9439.field40487, 9600) }));
        field36259 = method29401("leaping", new Class8061(new Class1948[] { new Class1948(Class9439.field40481, 3600) }));
        field36260 = method29401("long_leaping", new Class8061("leaping", new Class1948[] { new Class1948(Class9439.field40481, 9600) }));
        field36261 = method29401("strong_leaping", new Class8061("leaping", new Class1948[] { new Class1948(Class9439.field40481, 1800, 1) }));
        field36262 = method29401("fire_resistance", new Class8061(new Class1948[] { new Class1948(Class9439.field40485, 3600) }));
        field36263 = method29401("long_fire_resistance", new Class8061("fire_resistance", new Class1948[] { new Class1948(Class9439.field40485, 9600) }));
        field36264 = method29401("swiftness", new Class8061(new Class1948[] { new Class1948(Class9439.field40474, 3600) }));
        field36265 = method29401("long_swiftness", new Class8061("swiftness", new Class1948[] { new Class1948(Class9439.field40474, 9600) }));
        field36266 = method29401("strong_swiftness", new Class8061("swiftness", new Class1948[] { new Class1948(Class9439.field40474, 1800, 1) }));
        field36267 = method29401("slowness", new Class8061(new Class1948[] { new Class1948(Class9439.field40475, 1800) }));
        field36268 = method29401("long_slowness", new Class8061("slowness", new Class1948[] { new Class1948(Class9439.field40475, 4800) }));
        field36269 = method29401("strong_slowness", new Class8061("slowness", new Class1948[] { new Class1948(Class9439.field40475, 400, 3) }));
        field36270 = method29401("turtle_master", new Class8061("turtle_master", new Class1948[] { new Class1948(Class9439.field40475, 400, 3), new Class1948(Class9439.field40484, 400, 2) }));
        field36271 = method29401("long_turtle_master", new Class8061("turtle_master", new Class1948[] { new Class1948(Class9439.field40475, 800, 3), new Class1948(Class9439.field40484, 800, 2) }));
        field36272 = method29401("strong_turtle_master", new Class8061("turtle_master", new Class1948[] { new Class1948(Class9439.field40475, 400, 5), new Class1948(Class9439.field40484, 400, 3) }));
        field36273 = method29401("water_breathing", new Class8061(new Class1948[] { new Class1948(Class9439.field40486, 3600) }));
        field36274 = method29401("long_water_breathing", new Class8061("water_breathing", new Class1948[] { new Class1948(Class9439.field40486, 9600) }));
        field36275 = method29401("healing", new Class8061(new Class1948[] { new Class1948(Class9439.field40479, 1) }));
        field36276 = method29401("strong_healing", new Class8061("healing", new Class1948[] { new Class1948(Class9439.field40479, 1, 1) }));
        field36277 = method29401("harming", new Class8061(new Class1948[] { new Class1948(Class9439.field40480, 1) }));
        field36278 = method29401("strong_harming", new Class8061("harming", new Class1948[] { new Class1948(Class9439.field40480, 1, 1) }));
        field36279 = method29401("poison", new Class8061(new Class1948[] { new Class1948(Class9439.field40492, 900) }));
        field36280 = method29401("long_poison", new Class8061("poison", new Class1948[] { new Class1948(Class9439.field40492, 1800) }));
        field36281 = method29401("strong_poison", new Class8061("poison", new Class1948[] { new Class1948(Class9439.field40492, 432, 1) }));
        field36282 = method29401("regeneration", new Class8061(new Class1948[] { new Class1948(Class9439.field40483, 900) }));
        field36283 = method29401("long_regeneration", new Class8061("regeneration", new Class1948[] { new Class1948(Class9439.field40483, 1800) }));
        field36284 = method29401("strong_regeneration", new Class8061("regeneration", new Class1948[] { new Class1948(Class9439.field40483, 450, 1) }));
        field36285 = method29401("strength", new Class8061(new Class1948[] { new Class1948(Class9439.field40478, 3600) }));
        field36286 = method29401("long_strength", new Class8061("strength", new Class1948[] { new Class1948(Class9439.field40478, 9600) }));
        field36287 = method29401("strong_strength", new Class8061("strength", new Class1948[] { new Class1948(Class9439.field40478, 1800, 1) }));
        field36288 = method29401("weakness", new Class8061(new Class1948[] { new Class1948(Class9439.field40491, 1800) }));
        field36289 = method29401("long_weakness", new Class8061("weakness", new Class1948[] { new Class1948(Class9439.field40491, 4800) }));
        field36290 = method29401("luck", new Class8061("luck", new Class1948[] { new Class1948(Class9439.field40499, 6000) }));
        field36291 = method29401("slow_falling", new Class8061(new Class1948[] { new Class1948(Class9439.field40501, 1800) }));
        field36292 = method29401("long_slow_falling", new Class8061("slow_falling", new Class1948[] { new Class1948(Class9439.field40501, 4800) }));
    }
}
