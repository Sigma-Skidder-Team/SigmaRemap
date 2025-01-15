// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.nbt.INBT;
import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DataFixer;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

import com.mojang.authlib.properties.Property;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import org.apache.logging.log4j.Logger;

public final class Class9346
{
    private static final Logger field40120;
    
    @Nullable
    public static GameProfile method34640(final Class51 class51) {
        String method323 = null;
        String method324 = null;
        if (class51.method316("Name", 8)) {
            method323 = class51.method323("Name");
        }
        Label_0042: {
            if (!class51.method316("Id", 8)) {
                break Label_0042;
            }
            method324 = class51.method323("Id");
            try {
                UUID fromString;
                try {
                    fromString = UUID.fromString(method324);
                }
                catch (final Throwable t) {
                    fromString = null;
                }
                final GameProfile gameProfile = new GameProfile(fromString, method323);
                if (class51.method316("Properties", 10)) {
                    final Class51 method325 = class51.method327("Properties");
                    for (final String s : method325.method293()) {
                        final Class52 method326 = method325.method328(s, 10);
                        for (int i = 0; i < method326.size(); ++i) {
                            final Class51 method327 = method326.method346(i);
                            final String method328 = method327.method323("Value");
                            if (method327.method316("Signature", 8)) {
                                gameProfile.getProperties().put((Object)s, (Object)new Property(s, method328, method327.method323("Signature")));
                            }
                            else {
                                gameProfile.getProperties().put((Object)s, (Object)new Property(s, method328));
                            }
                        }
                    }
                }
                return gameProfile;
            }
            catch (final Throwable t2) {
                return null;
            }
        }
    }
    
    public static Class51 method34641(final Class51 class51, final GameProfile gameProfile) {
        if (!Class8272.method27500(gameProfile.getName())) {
            class51.method306("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            class51.method306("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            final Class51 class52 = new Class51();
            for (final String s : gameProfile.getProperties().keySet()) {
                final Class52 class53 = new Class52();
                for (final Property property : gameProfile.getProperties().get((Object)s)) {
                    final Class51 e = new Class51();
                    e.method306("Value", property.getValue());
                    if (property.hasSignature()) {
                        e.method306("Signature", property.getSignature());
                    }
                    ((AbstractList<Class51>)class53).add(e);
                }
                class52.method295(s, class53);
            }
            class51.method295("Properties", class52);
        }
        return class51;
    }
    
    @VisibleForTesting
    public static boolean method34642(final INBT class41, final INBT obj, final boolean b) {
        if (class41 == obj) {
            return true;
        }
        if (class41 == null) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!class41.getClass().equals(obj.getClass())) {
            return false;
        }
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            final Class51 class43 = (Class51)obj;
            for (final String s : class42.method293()) {
                if (method34642(class42.method313(s), class43.method313(s), b)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        if (!(class41 instanceof Class52) || !b) {
            return class41.equals(obj);
        }
        final Class52 class44 = (Class52)class41;
        final Class52 class45 = (Class52)obj;
        if (!class44.isEmpty()) {
            for (int i = 0; i < class44.size(); ++i) {
                final INBT value = class44.get(i);
                int n = 0;
                for (int j = 0; j < class45.size(); ++j) {
                    if (method34642(value, class45.get(j), b)) {
                        n = 1;
                        break;
                    }
                }
                if (n == 0) {
                    return false;
                }
            }
            return true;
        }
        return class45.isEmpty();
    }
    
    public static Class51 method34643(final UUID uuid) {
        final Class51 class51 = new Class51();
        class51.method299("M", uuid.getMostSignificantBits());
        class51.method299("L", uuid.getLeastSignificantBits());
        return class51;
    }
    
    public static UUID method34644(final Class51 class51) {
        return new UUID(class51.method320("M"), class51.method320("L"));
    }
    
    public static BlockPos method34645(final Class51 class51) {
        return new BlockPos(class51.method319("X"), class51.method319("Y"), class51.method319("Z"));
    }
    
    public static Class51 method34646(final BlockPos class354) {
        final Class51 class355 = new Class51();
        class355.method298("X", class354.getX());
        class355.method298("Y", class354.getY());
        class355.method298("Z", class354.getZ());
        return class355;
    }
    
    public static BlockState method34647(final Class51 class51) {
        if (class51.method316("Name", 8)) {
            final Class3833 class52 = Class90.field208.method505(new Class1932(class51.method323("Name")));
            BlockState method11878 = class52.method11878();
            if (class51.method316("Properties", 10)) {
                final Class51 method11879 = class51.method327("Properties");
                final Class9104<Class3833, BlockState> method11880 = class52.method11876();
                for (final String s : method11879.method293()) {
                    final Class7111 method11881 = method11880.method32906(s);
                    if (method11881 == null) {
                        continue;
                    }
                    method11878 = method34648(method11878, method11881, s, method11879, class51);
                }
            }
            return method11878;
        }
        return Class7521.field29147.method11878();
    }
    
    private static <S extends Class7098<S>, T extends Comparable<T>> S method34648(final S n, final Class7111<T> class7111, final String s, final Class51 class7112, final Class51 class7113) {
        final Optional<T> method21830 = class7111.method21830(class7112.method323(s));
        if (!method21830.isPresent()) {
            Class9346.field40120.warn("Unable to read property: {} with value: {} for blockstate: {}", (Object)s, (Object)class7112.method323(s), (Object)class7113.toString());
            return n;
        }
        return (S)((Class7098<Object>)n).method21773(class7111, (Comparable)method21830.get());
    }
    
    public static Class51 method34649(final BlockState class7096) {
        final Class51 class7097 = new Class51();
        class7097.method306("Name", Class90.field208.method503(class7096.method21696()).toString());
        final ImmutableMap<Class7111<?>, Comparable<?>> method21776 = class7096.method21776();
        if (!method21776.isEmpty()) {
            final Class51 class7098 = new Class51();
            for (final Map.Entry<Class7111, V> entry : method21776.entrySet()) {
                final Class7111 class7099 = entry.getKey();
                class7098.method306(class7099.method21826(), method34650((Class7111<Comparable>)class7099, (Comparable<?>)entry.getValue()));
            }
            class7097.method295("Properties", class7098);
        }
        return class7097;
    }
    
    private static <T extends Comparable<T>> String method34650(final Class7111<T> class7111, final Comparable<?> comparable) {
        return class7111.method21831((T)comparable);
    }
    
    public static Class51 method34651(final DataFixer dataFixer, final Class1959 class1959, final Class51 class1960, final int n) {
        return method34652(dataFixer, class1959, class1960, n, Class9528.method35579().getWorldVersion());
    }
    
    public static Class51 method34652(final DataFixer dataFixer, final Class1959 class1959, final Class51 class1960, final int n, final int n2) {
        return (Class51)dataFixer.update(class1959.method7946(), new Dynamic((DynamicOps)Class8453.field34721, (Object)class1960), n, n2).getValue();
    }
    
    static {
        field40120 = LogManager.getLogger();
    }
}
