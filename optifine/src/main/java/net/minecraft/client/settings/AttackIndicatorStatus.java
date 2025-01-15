package net.minecraft.client.settings;

import java.util.Arrays;
import java.util.Comparator;
import net.minecraft.util.math.MathHelper;

public enum AttackIndicatorStatus
{
    OFF(0, "options.off"),
    CROSSHAIR(1, "options.attack.crosshair"),
    HOTBAR(2, "options.attack.hotbar");

    private static final AttackIndicatorStatus[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(AttackIndicatorStatus::getId)).toArray((p_216750_0_) -> {
        return new AttackIndicatorStatus[p_216750_0_];
    });
    private final int id;
    private final String resourceKey;

    private AttackIndicatorStatus(int p_i2892_3_, String p_i2892_4_)
    {
        this.id = p_i2892_3_;
        this.resourceKey = p_i2892_4_;
    }

    public int getId()
    {
        return this.id;
    }

    public String getResourceKey()
    {
        return this.resourceKey;
    }

    public static AttackIndicatorStatus byId(int id)
    {
        return BY_ID[MathHelper.normalizeAngle(id, BY_ID.length)];
    }
}
