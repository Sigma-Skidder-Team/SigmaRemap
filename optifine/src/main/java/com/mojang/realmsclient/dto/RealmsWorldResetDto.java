package com.mojang.realmsclient.dto;

public class RealmsWorldResetDto extends ValueObject
{
    private final String seed;
    private final long worldTemplateId;
    private final int levelType;
    private final boolean generateStructures;

    public RealmsWorldResetDto(String p_i3053_1_, long p_i3053_2_, int p_i3053_4_, boolean p_i3053_5_)
    {
        this.seed = p_i3053_1_;
        this.worldTemplateId = p_i3053_2_;
        this.levelType = p_i3053_4_;
        this.generateStructures = p_i3053_5_;
    }
}
