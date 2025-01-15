package net.minecraft.entity.ai.brain.schedule;

import net.minecraft.util.registry.Registry;

public class Activity
{
    public static final Activity CORE = register("core");
    public static final Activity IDLE = register("idle");
    public static final Activity WORK = register("work");
    public static final Activity PLAY = register("play");
    public static final Activity REST = register("rest");
    public static final Activity MEET = register("meet");
    public static final Activity PANIC = register("panic");
    public static final Activity RAID = register("raid");
    public static final Activity PRE_RAID = register("pre_raid");
    public static final Activity HIDE = register("hide");
    private final String id;

    private Activity(String valueIn)
    {
        this.id = valueIn;
    }

    public String getKey()
    {
        return this.id;
    }

    private static Activity register(String key)
    {
        return Registry.register(Registry.ACTIVITY, key, new Activity(key));
    }

    public String toString()
    {
        return this.getKey();
    }
}
