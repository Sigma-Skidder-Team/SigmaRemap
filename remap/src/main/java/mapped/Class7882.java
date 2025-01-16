// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7882
{
    private static final Class2215[] field32346;
    public static final Class6257 field32347;
    public static final Class6257 field32348;
    public static final Class6257 field32349;
    public static final Class6257 field32350;
    public static final Class6257 field32351;
    public static final Class6257 field32352;
    public static final Class6257 field32353;
    public static final Class6257 field32354;
    public static final Class6257 field32355;
    public static final Class6257 field32356;
    public static final Class6257 field32357;
    public static final Class6257 field32358;
    public static final Class6257 field32359;
    public static final Class6257 field32360;
    public static final Class6257 field32361;
    public static final Class6257 field32362;
    public static final Class6257 field32363;
    public static final Class6257 field32364;
    public static final Class6257 field32365;
    public static final Class6257 field32366;
    public static final Class6257 field32367;
    public static final Class6257 field32368;
    public static final Class6257 field32369;
    public static final Class6257 field32370;
    public static final Class6257 field32371;
    public static final Class6257 field32372;
    public static final Class6257 field32373;
    public static final Class6257 field32374;
    public static final Class6257 field32375;
    public static final Class6257 field32376;
    public static final Class6257 field32377;
    public static final Class6257 field32378;
    public static final Class6257 field32379;
    public static final Class6257 field32380;
    public static final Class6257 field32381;
    public static final Class6257 field32382;
    public static final Class6257 field32383;
    
    private static Class6257 method25537(final String s, final Class6257 class6257) {
        return Registry.register(Registry.field209, s, class6257);
    }
    
    static {
        field32346 = new Class2215[] { Class2215.field13605, Class2215.field13604, Class2215.field13603, Class2215.field13602 };
        field32347 = method25537("protection", new Class6269(Class2233.field13714, Class2119.field12350, Class7882.field32346));
        field32348 = method25537("fire_protection", new Class6269(Class2233.field13715, Class2119.field12351, Class7882.field32346));
        field32349 = method25537("feather_falling", new Class6269(Class2233.field13715, Class2119.field12352, Class7882.field32346));
        field32350 = method25537("blast_protection", new Class6269(Class2233.field13716, Class2119.field12353, Class7882.field32346));
        field32351 = method25537("projectile_protection", new Class6269(Class2233.field13715, Class2119.field12354, Class7882.field32346));
        field32352 = method25537("respiration", new Class6280(Class2233.field13716, Class7882.field32346));
        field32353 = method25537("aqua_affinity", new Class6264(Class2233.field13716, Class7882.field32346));
        field32354 = method25537("thorns", new Class6275(Class2233.field13717, Class7882.field32346));
        field32355 = method25537("depth_strider", new Class6281(Class2233.field13716, Class7882.field32346));
        field32356 = method25537("frost_walker", new Class6258(Class2233.field13716, new Class2215[] { Class2215.field13602 }));
        field32357 = method25537("binding_curse", new Class6278(Class2233.field13717, Class7882.field32346));
        field32358 = method25537("sharpness", new Class6274(Class2233.field13714, 0, new Class2215[] { Class2215.field13600 }));
        field32359 = method25537("smite", new Class6274(Class2233.field13715, 1, new Class2215[] { Class2215.field13600 }));
        field32360 = method25537("bane_of_arthropods", new Class6274(Class2233.field13715, 2, new Class2215[] { Class2215.field13600 }));
        field32361 = method25537("knockback", new Class6273(Class2233.field13715, new Class2215[] { Class2215.field13600 }));
        field32362 = method25537("fire_aspect", new Class6276(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32363 = method25537("looting", new Class6266(Class2233.field13716, Class242.field1196, new Class2215[] { Class2215.field13600 }));
        field32364 = method25537("sweeping", new Class6267(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32365 = method25537("efficiency", new Class6283(Class2233.field13714, new Class2215[] { Class2215.field13600 }));
        field32366 = method25537("silk_touch", new Class6284(Class2233.field13717, new Class2215[] { Class2215.field13600 }));
        field32367 = method25537("unbreaking", new Class6272(Class2233.field13715, new Class2215[] { Class2215.field13600 }));
        field32368 = method25537("fortune", new Class6266(Class2233.field13716, Class242.field1197, new Class2215[] { Class2215.field13600 }));
        field32369 = method25537("power", new Class6279(Class2233.field13714, new Class2215[] { Class2215.field13600 }));
        field32370 = method25537("punch", new Class6259(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32371 = method25537("flame", new Class6271(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32372 = method25537("infinity", new Class6277(Class2233.field13717, new Class2215[] { Class2215.field13600 }));
        field32373 = method25537("luck_of_the_sea", new Class6266(Class2233.field13716, Class242.field1198, new Class2215[] { Class2215.field13600 }));
        field32374 = method25537("lure", new Class6261(Class2233.field13716, Class242.field1198, new Class2215[] { Class2215.field13600 }));
        field32375 = method25537("loyalty", new Class6262(Class2233.field13715, new Class2215[] { Class2215.field13600 }));
        field32376 = method25537("impaling", new Class6282(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32377 = method25537("riptide", new Class6270(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32378 = method25537("channeling", new Class6285(Class2233.field13717, new Class2215[] { Class2215.field13600 }));
        field32379 = method25537("multishot", new Class6256(Class2233.field13716, new Class2215[] { Class2215.field13600 }));
        field32380 = method25537("quick_charge", new Class6263(Class2233.field13715, new Class2215[] { Class2215.field13600 }));
        field32381 = method25537("piercing", new Class6265(Class2233.field13714, new Class2215[] { Class2215.field13600 }));
        field32382 = method25537("mending", new Class6268(Class2233.field13716, Class2215.values()));
        field32383 = method25537("vanishing_curse", new Class6260(Class2233.field13717, Class2215.values()));
    }
}
