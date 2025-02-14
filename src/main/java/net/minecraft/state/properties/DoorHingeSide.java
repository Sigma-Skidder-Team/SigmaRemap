package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum DoorHingeSide implements IStringSerializable {
   field664,
   field665;

   private static final DoorHingeSide[] field666 = new DoorHingeSide[]{field664, field665};

   @Override
   public String toString() {
      return this.getString();
   }

   @Override
   public String getString() {
      return this != field664 ? "right" : "left";
   }
}
