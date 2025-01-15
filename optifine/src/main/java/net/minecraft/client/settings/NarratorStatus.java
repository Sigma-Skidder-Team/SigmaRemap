package net.minecraft.client.settings;

import java.util.Arrays;
import java.util.Comparator;
import net.minecraft.util.math.MathHelper;

public enum NarratorStatus
{
    OFF(0, "options.narrator.off"),
    ALL(1, "options.narrator.all"),
    CHAT(2, "options.narrator.chat"),
    SYSTEM(3, "options.narrator.system");

    private static final NarratorStatus[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(NarratorStatus::getId)).toArray((p_216826_0_) -> {
        return new NarratorStatus[p_216826_0_];
    });
    private final int id;
    private final String resourceKey;

    private NarratorStatus(int p_i1593_3_, String p_i1593_4_)
    {
        this.id = p_i1593_3_;
        this.resourceKey = p_i1593_4_;
    }

    public int getId()
    {
        return this.id;
    }

    public String getResourceKey()
    {
        return this.resourceKey;
    }

    public static NarratorStatus byId(int id)
    {
        return BY_ID[MathHelper.normalizeAngle(id, BY_ID.length)];
    }
}
