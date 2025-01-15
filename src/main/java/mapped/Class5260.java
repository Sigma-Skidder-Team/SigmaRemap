// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public abstract class Class5260<T> implements Class5304<T>, Class5277<T>
{
    public static final Class5260<Byte> field22289;
    public static final Class5260<Byte[]> field22290;
    public static final Class5260<byte[]> field22291;
    public static final Class5260<Short> field22292;
    public static final Class5260<Short[]> field22293;
    public static final Class5260<Boolean> field22294;
    public static final Class5260<Boolean[]> field22295;
    public static final Class5260<Integer> field22296;
    public static final Class5260<Integer[]> field22297;
    public static final Class5260<Double> field22298;
    public static final Class5260<Double[]> field22299;
    public static final Class5260<Long> field22300;
    public static final Class5260<Long[]> field22301;
    public static final Class5260<Float> field22302;
    public static final Class5260<Float[]> field22303;
    public static final Class5260<Short> field22304;
    public static final Class5260<Short[]> field22305;
    public static final Class5260<Integer> field22306;
    public static final Class5260<Integer[]> field22307;
    public static final Class5260<String> field22308;
    public static final Class5260<String[]> field22309;
    public static final Class5260<UUID> field22310;
    public static final Class5260<UUID[]> field22311;
    public static final Class5260<Integer> field22312;
    public static final Class5260<Integer[]> field22313;
    public static final Class5260<Integer> field22314;
    public static final Class5260<Long> field22315;
    public static final Class5260<Long[]> field22316;
    public static final Class5260<Void> field22317;
    public static final Class5260<Class8322> field22318;
    public static final Class5260<Class8322> field22319;
    public static final Class5260<Class8844> field22320;
    public static final Class5260<Class7277> field22321;
    public static final Class5260<Class74> field22322;
    public static final Class5260<Class74[]> field22323;
    public static final Class5260<UUID> field22324;
    public static final Class5260<String> field22325;
    public static final Class5260<Class8322> field22326;
    public static final Class5260<Class8322> field22327;
    public static final Class5260<Class7562> field22328;
    public static final Class5260<Class7562[]> field22329;
    public static final Class5260<Class9119> field22330;
    public static final Class5260<Class9119[]> field22331;
    public static final Class5260<Class6768> field22332;
    public static final Class5260<Class7562> field22333;
    public static final Class5260<Class7562> field22334;
    public static final Class5260<Class7562[]> field22335;
    public static final Class5260<Class7562[]> field22336;
    public static final Class5260<Class7562[]> field22337;
    public static final Class5260<Class7562[]> field22338;
    private final Class<? super T> field22339;
    private final String field22340;
    
    public Class5260(final Class<? super T> clazz) {
        this(clazz.getSimpleName(), clazz);
    }
    
    public Class5260(final String field22340, final Class<? super T> field22341) {
        this.field22339 = field22341;
        this.field22340 = field22340;
    }
    
    public Class<? extends Class5260> method16380() {
        return this.getClass();
    }
    
    @Override
    public String toString() {
        return "Type|" + this.method16382();
    }
    
    public Class<? super T> method16381() {
        return this.field22339;
    }
    
    public String method16382() {
        return this.field22340;
    }
    
    static {
        field22289 = new Class5268();
        field22290 = new Class5302((Class5260<Object>)Class5260.field22289);
        field22291 = new Class5262();
        field22292 = new Class5273();
        field22293 = new Class5302((Class5260<Object>)Class5260.field22292);
        field22294 = new Class5271();
        field22295 = new Class5302((Class5260<Object>)Class5260.field22294);
        field22296 = new Class5265();
        field22297 = new Class5302((Class5260<Object>)Class5260.field22296);
        field22298 = new Class5272();
        field22299 = new Class5302((Class5260<Object>)Class5260.field22298);
        field22300 = new Class5263();
        field22301 = new Class5302((Class5260<Object>)Class5260.field22300);
        field22302 = new Class5269();
        field22303 = new Class5302((Class5260<Object>)Class5260.field22302);
        field22304 = new Class5266();
        field22305 = new Class5302((Class5260<Object>)Class5260.field22304);
        field22306 = new Class5274();
        field22307 = new Class5302((Class5260<Object>)Class5260.field22306);
        field22308 = new Class5301();
        field22309 = new Class5302((Class5260<Object>)Class5260.field22308);
        field22310 = new Class5311();
        field22311 = new Class5302((Class5260<Object>)Class5260.field22310);
        field22312 = new Class5275();
        field22313 = new Class5302((Class5260<Object>)Class5260.field22312);
        field22314 = new Class5315();
        field22315 = new Class5270();
        field22316 = new Class5302((Class5260<Object>)Class5260.field22315);
        field22317 = new Class5267();
        field22318 = new Class5300();
        field22319 = new Class5312();
        field22320 = new Class5286();
        field22321 = new Class5261();
        field22322 = new Class5303();
        field22323 = new Class5302((Class5260<Object>)Class5260.field22322);
        field22324 = new Class5305();
        field22325 = new Class5309();
        field22326 = new Class5313();
        field22327 = new Class5276();
        field22328 = new Class5288();
        field22329 = new Class5319();
        field22330 = new Class5306();
        field22331 = new Class5302((Class5260<Object>)Class5260.field22330);
        field22332 = new Class5308();
        field22333 = new Class5290();
        field22334 = new Class5289();
        field22335 = new Class5320();
        field22336 = new Class5321();
        field22337 = new Class5302((Class5260<Object>)Class5260.field22333);
        field22338 = new Class5302((Class5260<Object>)Class5260.field22334);
    }
}
