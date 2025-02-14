package net.minecraft.inventory;

public enum EquipmentSlotType {
   MAINHAND(Group.HAND, 0, 0, "mainhand"),
   OFFHAND(Group.HAND, 1, 5, "offhand"),
   FEET(Group.ARMOR, 0, 1, "feet"),
   LEGS(Group.ARMOR, 1, 2, "legs"),
   CHEST(Group.ARMOR, 2, 3, "chest"),
   HEAD(Group.ARMOR, 3, 4, "head");

   private final Group slotType;
   private final int index;
   private final int slotIndex;
   private final String name;

   private EquipmentSlotType(Group var3, int var4, int var5, String var6) {
      this.slotType = var3;
      this.index = var4;
      this.slotIndex = var5;
      this.name = var6;
   }

   public Group getSlotType() {
      return this.slotType;
   }

   public int getIndex() {
      return this.index;
   }

   public int getSlotIndex() {
      return this.slotIndex;
   }

   public String getName() {
      return this.name;
   }

   public static EquipmentSlotType fromString(String var0) {
      for (EquipmentSlotType var6 : values()) {
         if (var6.getName().equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
   }

   public static EquipmentSlotType fromSlotTypeAndIndex(Group var0, int var1) {
      for (EquipmentSlotType var7 : values()) {
         if (var7.getSlotType() == var0 && var7.getIndex() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "': " + var1);
   }

   public enum Group {
      HAND,
      ARMOR;
   }
}
