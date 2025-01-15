package net.minecraft.entity;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum EntityClassification
{
    MONSTER("monster", 70, false, false),
    CREATURE("creature", 10, true, true),
    AMBIENT("ambient", 15, true, false),
    WATER_CREATURE("water_creature", 15, true, false),
    MISC("misc", 15, true, false);

    private static final Map<String, EntityClassification> VALUES_MAP = Arrays.stream(values()).collect(Collectors.toMap(EntityClassification::getName, (p_220362_0_) -> {
        return p_220362_0_;
    }));
    private final int maxNumberOfCreature;
    private final boolean isPeacefulCreature;
    private final boolean isAnimal;
    private final String name;

    private EntityClassification(String p_i2825_3_, int p_i2825_4_, boolean p_i2825_5_, boolean p_i2825_6_)
    {
        this.name = p_i2825_3_;
        this.maxNumberOfCreature = p_i2825_4_;
        this.isPeacefulCreature = p_i2825_5_;
        this.isAnimal = p_i2825_6_;
    }

    public String getName()
    {
        return this.name;
    }

    public int getMaxNumberOfCreature()
    {
        return this.maxNumberOfCreature;
    }

    public boolean getPeacefulCreature()
    {
        return this.isPeacefulCreature;
    }

    public boolean getAnimal()
    {
        return this.isAnimal;
    }
}
