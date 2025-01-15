package net.minecraft.world.storage;

import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;

public interface IPlayerFileData
{
    void writePlayerData(PlayerEntity player);

    @Nullable
    CompoundNBT readPlayerData(PlayerEntity player);
}
