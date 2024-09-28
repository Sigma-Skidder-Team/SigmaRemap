package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum RailShape implements IStringSerializable {
   field247("north_south"),
   field248("east_west"),
   field249("ascending_east"),
   field250("ascending_west"),
   field251("ascending_north"),
   field252("ascending_south"),
   field253("south_east"),
   field254("south_west"),
   field255("north_west"),
   field256("north_east");

   private final String field257;
   private static final RailShape[] field258 = new RailShape[]{field247, field248, field249, field250, field251, field252, field253, field254, field255, field256};

   private RailShape(String var3) {
      this.field257 = var3;
   }

   @Override
   public String toString() {
      return this.field257;
   }

   public boolean method275() {
      return this == field251 || this == field249 || this == field252 || this == field250;
   }

   @Override
   public String getString() {
      return this.field257;
   }
}
