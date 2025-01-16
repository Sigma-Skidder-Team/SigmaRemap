package net.minecraft.client.settings;

import java.util.Arrays;
import java.util.Comparator;
import net.minecraft.util.math.MathHelper;

public enum AmbientOcclusionStatus
{
    OFF(0, "options.ao.off"),
    MIN(1, "options.ao.min"),
    MAX(2, "options.ao.max");

    private static final AmbientOcclusionStatus[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(AmbientOcclusionStatus::getId)).toArray((p_216571_0_) -> {
        return new AmbientOcclusionStatus[p_216571_0_];
    });
    private final int id;
    private final String resourceKey;

    private AmbientOcclusionStatus(int p_i3950_3_, String p_i3950_4_)
    {
        this.id = p_i3950_3_;
        this.resourceKey = p_i3950_4_;
    }

    public int getId()
    {
        return this.id;
    }

    public String getResourceKey()
    {
        return this.resourceKey;
    }

    public static AmbientOcclusionStatus getValue(int valueIn)
    {
        return VALUES[MathHelper.normalizeAngle(valueIn, VALUES.length)];
    }
}