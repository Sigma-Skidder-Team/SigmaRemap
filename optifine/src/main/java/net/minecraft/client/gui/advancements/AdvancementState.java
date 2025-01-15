package net.minecraft.client.gui.advancements;

public enum AdvancementState
{
    OBTAINED(0),
    UNOBTAINED(1);

    private final int id;

    private AdvancementState(int p_i1730_3_)
    {
        this.id = p_i1730_3_;
    }

    public int getId()
    {
        return this.id;
    }
}
