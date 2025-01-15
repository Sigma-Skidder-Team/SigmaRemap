// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.Properties;

public class Class9277 extends Class9278<Class9277>
{
    public final boolean field39765;
    public final boolean field39766;
    public final String field39767;
    public final boolean field39768;
    public final boolean field39769;
    public final boolean field39770;
    public final boolean field39771;
    public final String field39772;
    public final String field39773;
    public final boolean field39774;
    public final boolean field39775;
    public final boolean field39776;
    public final Class2113 field39777;
    public final Class101 field39778;
    public final String field39779;
    public final String field39780;
    public final Class9505 field39781;
    public final String field39782;
    public final int field39783;
    public final int field39784;
    public final Boolean field39785;
    public final boolean field39786;
    public final int field39787;
    public final boolean field39788;
    public final int field39789;
    public final String field39790;
    public final String field39791;
    public final String field39792;
    public final boolean field39793;
    public final boolean field39794;
    public final boolean field39795;
    public final boolean field39796;
    public final boolean field39797;
    public final boolean field39798;
    public final int field39799;
    public final int field39800;
    public final int field39801;
    public final long field39802;
    public final int field39803;
    public final int field39804;
    public final int field39805;
    public final boolean field39806;
    public final boolean field39807;
    public final int field39808;
    public final Class9278$Property<Integer> field39809;
    public final Class9278$Property<Boolean> field39810;
    
    public Class9277(final Properties properties) {
        super(properties);
        this.field39765 = this.method34245("online-mode", true);
        this.field39766 = this.method34245("prevent-proxy-connections", false);
        this.field39767 = this.method34239("server-ip", "");
        this.field39768 = this.method34245("spawn-animals", true);
        this.field39769 = this.method34245("spawn-npcs", true);
        this.field39770 = this.method34245("pvp", true);
        this.field39771 = this.method34245("allow-flight", false);
        this.field39772 = this.method34239("resource-pack", "");
        this.field39773 = this.method34239("motd", "A Minecraft Server");
        this.field39774 = this.method34245("force-gamemode", false);
        this.field39775 = this.method34245("enforce-whitelist", false);
        this.field39776 = this.method34245("generate-structures", true);
        this.field39777 = this.method34234("difficulty", (Function<String, Class2113>)Class9278.method34231((IntFunction<V>)Class2113::method8237, (Function<String, V>)Class2113::method8238), Class2113::method8239, Class2113.field12291);
        this.field39778 = this.method34234("gamemode", (Function<String, Class101>)Class9278.method34231((IntFunction<V>)Class101::method592, (Function<String, V>)Class101::method594), Class101::method586, Class101.field298);
        this.field39779 = this.method34239("level-name", "world");
        this.field39780 = this.method34239("level-seed", "");
        this.field39781 = this.method34234("level-type", Class9505::method35410, Class9505::method35398, Class9505.field40892);
        this.field39782 = this.method34239("generator-settings", "");
        this.field39783 = this.method34241("server-port", 25565);
        this.field39784 = this.method34243("max-build-height", n -> Class9546.method35651((n + 8) / 16 * 16, 64, 256), 256);
        this.field39785 = this.method34247("announce-player-achievements");
        this.field39786 = this.method34245("enable-query", false);
        this.field39787 = this.method34241("query.port", 25565);
        this.field39788 = this.method34245("enable-rcon", false);
        this.field39789 = this.method34241("rcon.port", 25575);
        this.field39790 = this.method34239("rcon.password", "");
        this.field39791 = this.method34240("resource-pack-hash");
        this.field39792 = this.method34239("resource-pack-sha1", "");
        this.field39793 = this.method34245("hardcore", false);
        this.field39794 = this.method34245("allow-nether", true);
        this.field39795 = this.method34245("spawn-monsters", true);
        if (!this.method34245("snooper-enabled", true)) {}
        this.field39796 = false;
        this.field39797 = this.method34245("use-native-transport", true);
        this.field39798 = this.method34245("enable-command-block", false);
        this.field39799 = this.method34241("spawn-protection", 16);
        this.field39800 = this.method34241("op-permission-level", 4);
        this.field39801 = this.method34241("function-permission-level", 2);
        this.field39802 = this.method34244("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
        this.field39803 = this.method34241("view-distance", 10);
        this.field39804 = this.method34241("max-players", 20);
        this.field39805 = this.method34241("network-compression-threshold", 256);
        this.field39806 = this.method34245("broadcast-rcon-to-ops", true);
        this.field39807 = this.method34245("broadcast-console-to-ops", true);
        this.field39808 = this.method34243("max-world-size", n3 -> Class9546.method35651(n3, 1, 29999984), 29999984);
        this.field39809 = this.method34242("player-idle-timeout", 0);
        this.field39810 = this.method34246("white-list", false);
    }
    
    public static Class9277 method34223(final Path path) {
        return new Class9277(Class9278.method34228(path));
    }
    
    public Class9277 method34224(final Properties properties) {
        return new Class9277(properties);
    }
}
