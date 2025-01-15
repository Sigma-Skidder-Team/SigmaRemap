package net.minecraft.realms.pluginapi;

import com.mojang.datafixers.util.Either;

public interface RealmsPlugin
{
    Either<LoadedRealmsPlugin, String> tryLoad(String p_tryLoad_1_);
}
