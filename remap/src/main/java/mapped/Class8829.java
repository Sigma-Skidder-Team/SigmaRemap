// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import com.mojang.datafixers.util.Pair;
import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

public class Class8829
{
    private static String[] field37118;
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30811(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5466(0.4f, 0.8f)), Pair.of((Object)0, (Object)new Class5425()), Pair.of((Object)0, (Object)new Class5426(45, 90)), Pair.of((Object)0, (Object)new Class5429()), Pair.of((Object)0, (Object)new Class5451()), Pair.of((Object)0, (Object)new Class5440()), Pair.of((Object)0, (Object)new Class5462()), Pair.of((Object)1, (Object)new Class5444(200)), Pair.of((Object)2, (Object)new Class5424(n)), Pair.of((Object)5, (Object)new Class5427()), Pair.of((Object)10, (Object)new Class5420(class9334.method34575(), Class8233.field33801, true)), Pair.of((Object)10, (Object)new Class5420(Class8912.field37476, Class8233.field33800, false)), (Object[])new Pair[] { Pair.of((Object)10, (Object)new Class5420(Class8912.field37477, Class8233.field33802, true)), Pair.of((Object)10, (Object)new Class5441()), Pair.of((Object)10, (Object)new Class5439()) });
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30812(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(method30822(), Pair.of((Object)5, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5438(), (Object)7), Pair.of((Object)new Class5428(Class8233.field33801, 4), (Object)2), Pair.of((Object)new Class5432(Class8233.field33801, 1, 10), (Object)5), Pair.of((Object)new Class5459(Class8233.field33803, 0.4f, 1, 6, Class8233.field33801), (Object)5), (Object)Pair.of((Object)new Class5445(), (Object)((class9334 != Class9334.field40065) ? 5 : 2))))), Pair.of((Object)10, (Object)new Class5460(400, 1600)), Pair.of((Object)10, (Object)new Class5464(EntityType.field29058, 4)), Pair.of((Object)2, (Object)new Class5436(Class8233.field33801, n, 9, 100, 1200)), Pair.of((Object)3, (Object)new Class5457(100)), Pair.of((Object)3, (Object)new Class5458(class9334.method34575(), Class8233.field33801)), (Object)Pair.of((Object)99, (Object)new Class5430()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30813(final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5444(100)), method30821(), Pair.of((Object)5, (Object)new Class5454()), Pair.of((Object)5, (Object)new Class5456(ImmutableMap.of((Object)Class8233.field33806, (Object)Class1952.field10629), ImmutableList.of(Pair.of((Object)Class5442.method16615(EntityType.field29042, 8, Class8233.field33811, n, 2), (Object)2), Pair.of((Object)Class5442.method16615(EntityType.field28964, 8, Class8233.field33811, n, 2), (Object)1), Pair.of((Object)new Class5448(n), (Object)1), Pair.of((Object)new Class5421(n, 2), (Object)1), Pair.of((Object)new Class5434(n), (Object)2), (Object)Pair.of((Object)new Class5447(20, 40), (Object)2)))), (Object)Pair.of((Object)99, (Object)new Class5430()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30814(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)2, (Object)new Class5436(Class8233.field33800, n, 1, 150, 1200)), Pair.of((Object)3, (Object)new Class5458(Class8912.field37476, Class8233.field33800)), Pair.of((Object)3, (Object)new Class5461()), Pair.of((Object)5, (Object)new Class5456(ImmutableMap.of((Object)Class8233.field33800, (Object)Class1952.field10629), ImmutableList.of(Pair.of((Object)new Class5452(n), (Object)1), Pair.of((Object)new Class5423(n), (Object)4), Pair.of((Object)new Class5463(n, 4), (Object)2), (Object)Pair.of((Object)new Class5447(20, 40), (Object)2)))), method30822(), (Object)Pair.of((Object)99, (Object)new Class5430()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30815(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)2, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5428(Class8233.field33802, 40), (Object)2), (Object)Pair.of((Object)new Class5437(), (Object)2)))), Pair.of((Object)10, (Object)new Class5460(400, 1600)), Pair.of((Object)10, (Object)new Class5464(EntityType.field29058, 4)), Pair.of((Object)2, (Object)new Class5436(Class8233.field33802, n, 6, 100, 200)), Pair.of((Object)3, (Object)new Class5457(100)), Pair.of((Object)3, (Object)new Class5458(Class8912.field37477, Class8233.field33802)), Pair.of((Object)3, (Object)new Class5455(ImmutableMap.of(), ImmutableSet.of((Object)Class8233.field33811), Class321.field1903, Class1986.field10996, ImmutableList.of((Object)Pair.of((Object)new Class5422(), (Object)1)))), method30821(), (Object)Pair.of((Object)99, (Object)new Class5430()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30816(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)2, (Object)new Class5456(ImmutableList.of(Pair.of((Object)Class5442.method16615(EntityType.field29042, 8, Class8233.field33811, n, 2), (Object)2), Pair.of((Object)new Class5442(EntityType.field29042, 8, Class824::method4873, Class824::method4873, (Class8233<LivingEntity>)Class8233.field33812, n, 2), (Object)1), Pair.of((Object)Class5442.method16615(EntityType.field28964, 8, Class8233.field33811, n, 2), (Object)1), Pair.of((Object)new Class5448(n), (Object)1), Pair.of((Object)new Class5421(n, 2), (Object)1), Pair.of((Object)new Class5434(n), (Object)1), (Object)Pair.of((Object)new Class5447(30, 60), (Object)1)))), Pair.of((Object)3, (Object)new Class5457(100)), Pair.of((Object)3, (Object)new Class5464(EntityType.field29058, 4)), Pair.of((Object)3, (Object)new Class5460(400, 1600)), Pair.of((Object)3, (Object)new Class5455(ImmutableMap.of(), ImmutableSet.of((Object)Class8233.field33811), Class321.field1903, Class1986.field10996, ImmutableList.of((Object)Pair.of((Object)new Class5422(), (Object)1)))), Pair.of((Object)3, (Object)new Class5455(ImmutableMap.of(), ImmutableSet.of((Object)Class8233.field33812), Class321.field1903, Class1986.field10996, ImmutableList.of((Object)Pair.of((Object)new Class5465(), (Object)1)))), method30821(), (Object)Pair.of((Object)99, (Object)new Class5430()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30817(final Class9334 class9334, final float n) {
        final float n2 = n * 1.5f;
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5453()), Pair.of((Object)1, (Object)new Class5431(Class8233.field33819, n2)), Pair.of((Object)1, (Object)new Class5431(Class8233.field33818, n2)), Pair.of((Object)3, (Object)new Class5448(n2, 2, 2)), (Object)method30822());
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30818(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5435()), Pair.of((Object)0, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5436(Class8233.field33802, n * 1.5f, 2, 150, 200), (Object)6), (Object)Pair.of((Object)new Class5448(n * 1.5f), (Object)2)))), method30822(), (Object)Pair.of((Object)99, (Object)new Class5433()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30819(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5417(n), (Object)5), (Object)Pair.of((Object)new Class5449(n * 1.1f), (Object)2)))), Pair.of((Object)0, (Object)new Class5446(600, 600)), Pair.of((Object)2, (Object)new Class5468(24, n * 1.4f)), method30822(), (Object)Pair.of((Object)99, (Object)new Class5433()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>> method30820(final Class9334 class9334, final float n) {
        return (ImmutableList<Pair<Integer, ? extends Class5419<? super Class824>>>)ImmutableList.of(Pair.of((Object)0, (Object)new Class5450(15, 2)), Pair.of((Object)1, (Object)new Class5467(32, n * 1.25f, 2)), (Object)method30822());
    }
    
    private static Pair<Integer, Class5419<LivingEntity>> method30821() {
        return (Pair<Integer, Class5419<LivingEntity>>)Pair.of((Object)5, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5443(EntityType.field28964, 8.0f), (Object)8), Pair.of((Object)new Class5443(EntityType.field29042, 8.0f), (Object)2), Pair.of((Object)new Class5443(EntityType.field29058, 8.0f), (Object)2), Pair.of((Object)new Class5443(Class1976.field10949, 8.0f), (Object)1), Pair.of((Object)new Class5443(Class1976.field10951, 8.0f), (Object)1), Pair.of((Object)new Class5443(Class1976.field10948, 8.0f), (Object)1), (Object)Pair.of((Object)new Class5447(30, 60), (Object)2))));
    }
    
    private static Pair<Integer, Class5419<LivingEntity>> method30822() {
        return (Pair<Integer, Class5419<LivingEntity>>)Pair.of((Object)5, (Object)new Class5456(ImmutableList.of(Pair.of((Object)new Class5443(EntityType.field29042, 8.0f), (Object)2), Pair.of((Object)new Class5443(EntityType.field29058, 8.0f), (Object)2), (Object)Pair.of((Object)new Class5447(30, 60), (Object)8))));
    }
}
