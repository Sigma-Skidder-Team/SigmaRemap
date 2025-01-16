// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.nbt.INBT;
import net.minecraft.util.math.BlockPos;
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
    public static GameProfile method34640(final CompoundNBT class51) {
        String method323 = null;
        String method324 = null;
        if (class51.contains("Name", 8)) {
            method323 = class51.getString("Name");
        }
        Label_0042: {
            if (!class51.contains("Id", 8)) {
                break Label_0042;
            }
            method324 = class51.getString("Id");
            try {
                UUID fromString;
                try {
                    fromString = UUID.fromString(method324);
                }
                catch (final Throwable t) {
                    fromString = null;
                }
                final GameProfile gameProfile = new GameProfile(fromString, method323);
                if (class51.contains("Properties", 10)) {
                    final CompoundNBT method325 = class51.getCompound("Properties");
                    for (final String s : method325.keySet()) {
                        final ListNBT method326 = method325.getList(s, 10);
                        for (int i = 0; i < method326.size(); ++i) {
                            final CompoundNBT method327 = method326.method346(i);
                            final String method328 = method327.getString("Value");
                            if (method327.contains("Signature", 8)) {
                                gameProfile.getProperties().put((Object)s, (Object)new Property(s, method328, method327.getString("Signature")));
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
    
    public static CompoundNBT method34641(final CompoundNBT class51, final GameProfile gameProfile) {
        if (!Class8272.method27500(gameProfile.getName())) {
            class51.putString("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            class51.putString("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            final CompoundNBT class52 = new CompoundNBT();
            for (final String s : gameProfile.getProperties().keySet()) {
                final ListNBT class53 = new ListNBT();
                for (final Property property : gameProfile.getProperties().get((Object)s)) {
                    final CompoundNBT e = new CompoundNBT();
                    e.putString("Value", property.getValue());
                    if (property.hasSignature()) {
                        e.putString("Signature", property.getSignature());
                    }
                    ((AbstractList<CompoundNBT>)class53).add(e);
                }
                class52.put(s, class53);
            }
            class51.put("Properties", class52);
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
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            final CompoundNBT class43 = (CompoundNBT)obj;
            for (final String s : class42.keySet()) {
                if (method34642(class42.get(s), class43.get(s), b)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        if (!(class41 instanceof ListNBT) || !b) {
            return class41.equals(obj);
        }
        final ListNBT class44 = (ListNBT)class41;
        final ListNBT class45 = (ListNBT)obj;
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
    
    public static CompoundNBT method34643(final UUID uuid) {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putLong("M", uuid.getMostSignificantBits());
        class51.putLong("L", uuid.getLeastSignificantBits());
        return class51;
    }
    
    public static UUID method34644(final CompoundNBT class51) {
        return new UUID(class51.getLong("M"), class51.getLong("L"));
    }
    
    public static BlockPos method34645(final CompoundNBT class51) {
        return new BlockPos(class51.getInt("X"), class51.getInt("Y"), class51.getInt("Z"));
    }
    
    public static CompoundNBT method34646(final BlockPos class354) {
        final CompoundNBT class355 = new CompoundNBT();
        class355.putInt("X", class354.getX());
        class355.putInt("Y", class354.getY());
        class355.putInt("Z", class354.getZ());
        return class355;
    }
    
    public static BlockState method34647(final CompoundNBT class51) {
        if (class51.contains("Name", 8)) {
            final Block class52 = Registry.BLOCK.getOrDefault(new ResourceLocation(class51.getString("Name")));
            BlockState method11878 = class52.getDefaultState();
            if (class51.contains("Properties", 10)) {
                final CompoundNBT method11879 = class51.getCompound("Properties");
                final StateContainer<Block, BlockState> method11880 = class52.getStateContainer();
                for (final String s : method11879.keySet()) {
                    final IProperty method11881 = method11880.getProperty(s);
                    if (method11881 == null) {
                        continue;
                    }
                    method11878 = method34648(method11878, method11881, s, method11879, class51);
                }
            }
            return method11878;
        }
        return Blocks.AIR.getDefaultState();
    }
    
    private static <S extends IStateHolder<S>, T extends Comparable<T>> S method34648(final S n, final IProperty<T> class7111, final String s, final CompoundNBT class7112, final CompoundNBT class7113) {
        final Optional<T> method21830 = class7111.parseValue(class7112.getString(s));
        if (!method21830.isPresent()) {
            Class9346.field40120.warn("Unable to read property: {} with value: {} for blockstate: {}", (Object)s, (Object)class7112.getString(s), (Object)class7113.toString());
            return n;
        }
        return (S)((IStateHolder<Object>)n).with(class7111, (Comparable)method21830.get());
    }
    
    public static CompoundNBT method34649(final BlockState class7096) {
        final CompoundNBT class7097 = new CompoundNBT();
        class7097.putString("Name", Registry.BLOCK.getKey(class7096.getBlock()).toString());
        final ImmutableMap<IProperty<?>, Comparable<?>> method21776 = class7096.getValues();
        if (!method21776.isEmpty()) {
            final CompoundNBT class7098 = new CompoundNBT();
            for (final Map.Entry<IProperty, V> entry : method21776.entrySet()) {
                final IProperty class7099 = entry.getKey();
                class7098.putString(class7099.getName(), method34650((IProperty<Comparable>)class7099, (Comparable<?>)entry.getValue()));
            }
            class7097.put("Properties", class7098);
        }
        return class7097;
    }
    
    private static <T extends Comparable<T>> String method34650(final IProperty<T> class7111, final Comparable<?> comparable) {
        return class7111.getName((T)comparable);
    }
    
    public static CompoundNBT method34651(final DataFixer dataFixer, final Class1959 class1959, final CompoundNBT class1960, final int n) {
        return method34652(dataFixer, class1959, class1960, n, Class9528.method35579().getWorldVersion());
    }
    
    public static CompoundNBT method34652(final DataFixer dataFixer, final Class1959 class1959, final CompoundNBT class1960, final int n, final int n2) {
        return (CompoundNBT)dataFixer.update(class1959.method7946(), new Dynamic((DynamicOps)Class8453.field34721, (Object)class1960), n, n2).getValue();
    }
    
    static {
        field40120 = LogManager.getLogger();
    }
}
