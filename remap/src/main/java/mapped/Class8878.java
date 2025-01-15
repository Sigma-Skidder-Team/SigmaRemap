// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.function.Function;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8878
{
    private static final Logger field37313;
    private static final Map<Class9424<?>, Class8455<?>> field37314;
    public static final Class9424<Class8119> field37315;
    public static final Class9424<Class8119> field37316;
    public static final Class9424<Class8119> field37317;
    public static final Class9424<Class8119> field37318;
    public static final Class9424<Class8119> field37319;
    public static final Class9424<Class8119> field37320;
    public static final Class9424<Class8119> field37321;
    public static final Class9424<Class8119> field37322;
    public static final Class9424<Class8119> field37323;
    public static final Class9424<Class8119> field37324;
    public static final Class9424<Class8119> field37325;
    public static final Class9424<Class8119> field37326;
    public static final Class9424<Class8118> field37327;
    public static final Class9424<Class8119> field37328;
    public static final Class9424<Class8119> field37329;
    public static final Class9424<Class8119> field37330;
    public static final Class9424<Class8118> field37331;
    public static final Class9424<Class8119> field37332;
    public static final Class9424<Class8118> field37333;
    public static final Class9424<Class8119> field37334;
    public static final Class9424<Class8119> field37335;
    public static final Class9424<Class8118> field37336;
    public static final Class9424<Class8119> field37337;
    public static final Class9424<Class8119> field37338;
    public static final Class9424<Class8119> field37339;
    public static final Class9424<Class8119> field37340;
    public static final Class9424<Class8119> field37341;
    public static final Class9424<Class8119> field37342;
    public static final Class9424<Class8119> field37343;
    public static final Class9424<Class8119> field37344;
    public static final Class9424<Class8119> field37345;
    private final Map<Class9424<?>, Class8117<?>> field37346;
    
    public Class8878() {
        this.field37346 = Class8878.field37314.entrySet().stream().collect((Collector<? super Object, Object, Map<Class9424<?>, Class8117<?>>>)ImmutableMap.toImmutableMap((Function)Map.Entry::getKey, entry -> entry.getValue().method28220()));
    }
    
    private static <T extends Class8117<T>> Class9424<T> method31210(final String str, final Class8455<T> class8455) {
        final Class9424 class8456 = new Class9424(str);
        if (Class8878.field37314.put(class8456, class8455) == null) {
            return class8456;
        }
        throw new IllegalStateException("Duplicate game rule registration for " + str);
    }
    
    public <T extends Class8117<T>> T method31211(final Class9424<T> class9424) {
        return (T)this.field37346.get(class9424);
    }
    
    public Class51 method31212() {
        final Class51 class51 = new Class51();
        this.field37346.forEach((class53, class54) -> class52.method306(Class9424.method35023(class53), class54.method26710()));
        return class51;
    }
    
    public void method31213(final Class51 class51) {
        this.field37346.forEach((class53, class54) -> {
            if (!(!class52.method315(Class9424.method35023(class53)))) {
                class54.method26709(class52.method323(Class9424.method35023(class53)));
            }
        });
    }
    
    public static void method31214(final Class8301 class8301) {
        Class8878.field37314.forEach((class8303, class8304) -> method31215(class8302, class8303, class8304));
    }
    
    private static <T extends Class8117<T>> void method31215(final Class8301 class8301, final Class9424<?> class8302, final Class8455<?> class8303) {
        class8301.method27590(class8302, class8303);
    }
    
    public boolean method31216(final Class9424<Class8119> class9424) {
        return this.method31211(class9424).method26723();
    }
    
    public int method31217(final Class9424<Class8118> class9424) {
        return this.method31211(class9424).method26715();
    }
    
    static {
        field37313 = LogManager.getLogger();
        field37314 = Maps.newTreeMap((Comparator)Comparator.comparing(class9424 -> Class9424.method35023(class9424)));
        field37315 = method31210("doFireTick", (Class8455<Class8119>)Class8119.method26728(true));
        field37316 = method31210("mobGriefing", (Class8455<Class8119>)Class8119.method26728(true));
        field37317 = method31210("keepInventory", (Class8455<Class8119>)Class8119.method26728(false));
        field37318 = method31210("doMobSpawning", (Class8455<Class8119>)Class8119.method26728(true));
        field37319 = method31210("doMobLoot", (Class8455<Class8119>)Class8119.method26728(true));
        field37320 = method31210("doTileDrops", (Class8455<Class8119>)Class8119.method26728(true));
        field37321 = method31210("doEntityDrops", (Class8455<Class8119>)Class8119.method26728(true));
        field37322 = method31210("commandBlockOutput", (Class8455<Class8119>)Class8119.method26728(true));
        field37323 = method31210("naturalRegeneration", (Class8455<Class8119>)Class8119.method26728(true));
        field37324 = method31210("doDaylightCycle", (Class8455<Class8119>)Class8119.method26728(true));
        field37325 = method31210("logAdminCommands", (Class8455<Class8119>)Class8119.method26728(true));
        field37326 = method31210("showDeathMessages", (Class8455<Class8119>)Class8119.method26728(true));
        field37327 = method31210("randomTickSpeed", (Class8455<Class8118>)Class8118.method26720(3));
        field37328 = method31210("sendCommandFeedback", (Class8455<Class8119>)Class8119.method26728(true));
        field37329 = method31210("reducedDebugInfo", (Class8455<Class8119>)Class8119.method26729(false, (class9425, class9426) -> {
            final byte b = (byte)(class9426.method26723() ? 22 : 23);
            class9425.method1537().method20623().iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Class513 class9427 = iterator.next();
                class9427.field3039.method17469(new Class4264(class9427, b));
            }
            return;
        }));
        field37330 = method31210("spectatorsGenerateChunks", (Class8455<Class8119>)Class8119.method26728(true));
        field37331 = method31210("spawnRadius", (Class8455<Class8118>)Class8118.method26720(10));
        field37332 = method31210("disableElytraMovementCheck", (Class8455<Class8119>)Class8119.method26728(false));
        field37333 = method31210("maxEntityCramming", (Class8455<Class8118>)Class8118.method26720(24));
        field37334 = method31210("doWeatherCycle", (Class8455<Class8119>)Class8119.method26728(true));
        field37335 = method31210("doLimitedCrafting", (Class8455<Class8119>)Class8119.method26728(false));
        field37336 = method31210("maxCommandChainLength", (Class8455<Class8118>)Class8118.method26720(65536));
        field37337 = method31210("announceAdvancements", (Class8455<Class8119>)Class8119.method26728(true));
        field37338 = method31210("disableRaids", (Class8455<Class8119>)Class8119.method26728(false));
        field37339 = method31210("doInsomnia", (Class8455<Class8119>)Class8119.method26728(true));
        field37340 = method31210("doImmediateRespawn", (Class8455<Class8119>)Class8119.method26729(false, (class9428, class9429) -> {
            class9428.method1537().method20623().iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final Class5814 field37346 = iterator2.next().field3039;
                new Class4306(11, class9429.method26723() ? 1.0f : 0.0f);
                final Class4306 class9430;
                field37346.method17469(class9430);
            }
            return;
        }));
        field37341 = method31210("drowningDamage", (Class8455<Class8119>)Class8119.method26728(true));
        field37342 = method31210("fallDamage", (Class8455<Class8119>)Class8119.method26728(true));
        field37343 = method31210("fireDamage", (Class8455<Class8119>)Class8119.method26728(true));
        field37344 = method31210("doPatrolSpawning", (Class8455<Class8119>)Class8119.method26728(true));
        field37345 = method31210("doTraderSpawning", (Class8455<Class8119>)Class8119.method26728(true));
    }
}
