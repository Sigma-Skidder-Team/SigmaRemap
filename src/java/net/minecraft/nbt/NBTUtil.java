package net.minecraft.nbt;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import mapped.Class2108;
import mapped.NBTDynamicOps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.StateHolder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.StringUtils;
import net.minecraft.util.UUIDCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.UUID;

public final class NBTUtil {
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Reads and returns a GameProfile that has been saved to the passed in NBTTagCompound
     */
    @Nullable
    public static GameProfile readGameProfile(CompoundNBT compoundNBT) {
        String s = null;
        UUID uuid = null;

        if (compoundNBT.contains("Name", 8)) {
            s = compoundNBT.getString("Name");
        }

        if (compoundNBT.hasUniqueID("Id")) {
            uuid = compoundNBT.getUniqueID("Id");
        }

        try {
            GameProfile gameProfile = new GameProfile(uuid, s);

            if (compoundNBT.contains("Properties", 10)) {
                CompoundNBT compoundNBT1 = compoundNBT.getCompound("Properties");

                for (String s1 : compoundNBT1.keySet()) {
                    ListNBT listNBT = compoundNBT1.getList(s1, 10);

                    for (int i = 0; i < listNBT.size(); i++) {
                        CompoundNBT compoundNBT2 = listNBT.getCompound(i);
                        String s2 = compoundNBT2.getString("Value");
                        if (compoundNBT2.contains("Signature", 8)) {
                            gameProfile.getProperties().put(s1, new com.mojang.authlib.properties.Property(s1, s2, compoundNBT2.getString("Signature")));
                        } else {
                            gameProfile.getProperties().put(s1, new com.mojang.authlib.properties.Property(s1, s2));
                        }
                    }
                }
            }
            return gameProfile;
        } catch (Throwable throwable) {
            return null;
        }
    }

    /**
     * Writes a GameProfile to an NBTTagCompound.
     */
    public static CompoundNBT writeGameProfile(CompoundNBT tagCompound, GameProfile profile) {
        if (!StringUtils.isNullOrEmpty(profile.getName())) {
            tagCompound.putString("Name", profile.getName());
        }

        if (profile.getId() != null) {
            tagCompound.putUniqueID("Id", profile.getId());
        }

        if (!profile.getProperties().isEmpty()) {
            CompoundNBT compoundnbt = new CompoundNBT();

            for (String s : profile.getProperties().keySet()) {
                ListNBT listnbt = new ListNBT();

                for (com.mojang.authlib.properties.Property property : profile.getProperties().get(s)) {
                    CompoundNBT compoundnbt1 = new CompoundNBT();
                    compoundnbt1.putString("Value", property.getValue());

                    if (property.hasSignature()) {
                        compoundnbt1.putString("Signature", property.getSignature());
                    }

                    listnbt.add(compoundnbt1);
                }

                compoundnbt.put(s, listnbt);
            }

            tagCompound.put("Properties", compoundnbt);
        }

        return tagCompound;
    }


    @VisibleForTesting
    public static boolean areNBTEquals(@Nullable INBT nbt1, @Nullable INBT nbt2, boolean compareTagList)
    {
        if (nbt1 == nbt2)
        {
            return true;
        }
        else if (nbt1 == null)
        {
            return true;
        }
        else if (nbt2 == null)
        {
            return false;
        }
        else if (!nbt1.getClass().equals(nbt2.getClass()))
        {
            return false;
        }
        else if (nbt1 instanceof CompoundNBT)
        {
            CompoundNBT compoundnbt = (CompoundNBT)nbt1;
            CompoundNBT compoundnbt1 = (CompoundNBT)nbt2;

            for (String s : compoundnbt.keySet())
            {
                INBT inbt1 = compoundnbt.get(s);

                if (!areNBTEquals(inbt1, compoundnbt1.get(s), compareTagList))
                {
                    return false;
                }
            }

            return true;
        }
        else if (nbt1 instanceof ListNBT && compareTagList)
        {
            ListNBT listnbt = (ListNBT)nbt1;
            ListNBT listnbt1 = (ListNBT)nbt2;

            if (listnbt.isEmpty())
            {
                return listnbt1.isEmpty();
            }
            else
            {
                for (int i = 0; i < listnbt.size(); ++i)
                {
                    INBT inbt = listnbt.get(i);
                    boolean flag = false;

                    for (int j = 0; j < listnbt1.size(); ++j)
                    {
                        if (areNBTEquals(inbt, listnbt1.get(j), compareTagList))
                        {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag)
                    {
                        return false;
                    }
                }

                return true;
            }
        }
        else
        {
            return nbt1.equals(nbt2);
        }
    }

    public static IntArrayNBT valueOf(UUID var0) {
        return new IntArrayNBT(UUIDCodec.encodeUUID(var0));
    }

    public static UUID readUniqueID(INBT var0) {
        if (var0.getType() == IntArrayNBT.TYPE) {
            int[] var3 = ((IntArrayNBT) var0).getIntArray();
            if (var3.length == 4) {
                return UUIDCodec.decodeUUID(var3);
            } else {
                throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var3.length + ".");
            }
        } else {
            throw new IllegalArgumentException(
                    "Expected UUID-Tag to be of type " + IntArrayNBT.TYPE.getName() + ", but found " + var0.getType().getName() + "."
            );
        }
    }

    public static BlockPos method29283(CompoundNBT var0) {
        return new BlockPos(var0.getInt("X"), var0.getInt("Y"), var0.getInt("Z"));
    }

    public static CompoundNBT method29284(BlockPos var0) {
        CompoundNBT var3 = new CompoundNBT();
        var3.putInt("X", var0.getX());
        var3.putInt("Y", var0.getY());
        var3.putInt("Z", var0.getZ());
        return var3;
    }

    public static BlockState method29285(CompoundNBT var0) {
        if (!var0.contains("Name", 8)) {
            return Blocks.AIR.getDefaultState();
        } else {
            Block var3 = Registry.BLOCK.getOrDefault(new ResourceLocation(var0.getString("Name")));
            BlockState var4 = var3.getDefaultState();
            if (var0.contains("Properties", 10)) {
                CompoundNBT var5 = var0.getCompound("Properties");
                StateContainer var6 = var3.getStateContainer();

                for (String var8 : var5.keySet()) {
                    Property var9 = var6.method35396(var8);
                    if (var9 != null) {
                        var4 = method29286(var4, var9, var8, var5, var0);
                    }
                }
            }

            return var4;
        }
    }

    private static <S extends StateHolder<?, S>, T extends Comparable<T>> S method29286(S var0, Property<T> var1, String var2, CompoundNBT var3, CompoundNBT var4) {
        Optional<T> var7 = var1.method30476(var3.getString(var2));
        if (!var7.isPresent()) {
            LOGGER.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.getString(var2), var4.toString());
            return var0;
        } else {
            return var0.with(var1, var7.get());
        }
    }

    public static CompoundNBT method29287(BlockState var0) {
        CompoundNBT var3 = new CompoundNBT();
        var3.putString("Name", Registry.BLOCK.getKey(var0.getBlock()).toString());
        ImmutableMap var4 = var0.method23468();
        if (!var4.isEmpty()) {
            CompoundNBT var5 = new CompoundNBT();
            UnmodifiableIterator var6 = var4.entrySet().iterator();

            while (var6.hasNext()) {
                Entry var7 = (Entry) var6.next();
                Property var8 = (Property) var7.getKey();
                var5.putString(var8.method30472(), method29288(var8, (Comparable<?>) var7.getValue()));
            }

            var3.put("Properties", var5);
        }

        return var3;
    }

    private static <T extends Comparable<T>> String method29288(Property<T> var0, Comparable<?> var1) {
        return var0.getName((T) var1);
    }

    public static CompoundNBT method29289(DataFixer var0, Class2108 var1, CompoundNBT var2, int var3) {
        return method29290(var0, var1, var2, var3, SharedConstants.getVersion().getWorldVersion());
    }

    public static CompoundNBT method29290(DataFixer var0, Class2108 var1, CompoundNBT var2, int var3, int var4) {
        return (CompoundNBT) var0.update(var1.method8778(), new Dynamic(NBTDynamicOps.INSTANCE, var2), var3, var4).getValue();
    }
}
