package net.minecraft.inventory;

public enum EquipmentSlotType
{
    MAINHAND(EquipmentSlotType.Group.HAND, 0, 0, "mainhand"),
    OFFHAND(EquipmentSlotType.Group.HAND, 1, 5, "offhand"),
    FEET(EquipmentSlotType.Group.ARMOR, 0, 1, "feet"),
    LEGS(EquipmentSlotType.Group.ARMOR, 1, 2, "legs"),
    CHEST(EquipmentSlotType.Group.ARMOR, 2, 3, "chest"),
    HEAD(EquipmentSlotType.Group.ARMOR, 3, 4, "head");

    private final EquipmentSlotType.Group slotType;
    private final int index;
    private final int slotIndex;
    private final String name;

    private EquipmentSlotType(EquipmentSlotType.Group p_i1319_3_, int p_i1319_4_, int p_i1319_5_, String p_i1319_6_)
    {
        this.slotType = p_i1319_3_;
        this.index = p_i1319_4_;
        this.slotIndex = p_i1319_5_;
        this.name = p_i1319_6_;
    }

    public EquipmentSlotType.Group getSlotType()
    {
        return this.slotType;
    }

    public int getIndex()
    {
        return this.index;
    }

    public int getSlotIndex()
    {
        return this.slotIndex;
    }

    public String getName()
    {
        return this.name;
    }

    public static EquipmentSlotType fromString(String targetName)
    {
        for (EquipmentSlotType equipmentslottype : values())
        {
            if (equipmentslottype.getName().equals(targetName))
            {
                return equipmentslottype;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + targetName + "'");
    }

    public static EquipmentSlotType fromSlotTypeAndIndex(EquipmentSlotType.Group slotTypeIn, int slotIndexIn)
    {
        for (EquipmentSlotType equipmentslottype : values())
        {
            if (equipmentslottype.getSlotType() == slotTypeIn && equipmentslottype.getIndex() == slotIndexIn)
            {
                return equipmentslottype;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + slotTypeIn + "': " + slotIndexIn);
    }

    public static enum Group {
        HAND,
        ARMOR;
    }
}
