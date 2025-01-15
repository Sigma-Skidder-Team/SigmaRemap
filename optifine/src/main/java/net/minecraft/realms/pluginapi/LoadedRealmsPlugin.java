package net.minecraft.realms.pluginapi;

import net.minecraft.realms.RealmsScreen;

public interface LoadedRealmsPlugin
{
    RealmsScreen getMainScreen(RealmsScreen p_getMainScreen_1_);

    RealmsScreen getNotificationsScreen(RealmsScreen p_getNotificationsScreen_1_);
}
