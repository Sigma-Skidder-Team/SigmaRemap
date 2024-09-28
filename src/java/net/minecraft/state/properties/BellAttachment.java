package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum BellAttachment implements IStringSerializable {
   field212("floor"),
   field213("ceiling"),
   field214("single_wall"),
   field215("double_wall");

   private final String field216;
   private static final BellAttachment[] field217 = new BellAttachment[]{field212, field213, field214, field215};

   private BellAttachment(String var3) {
      this.field216 = var3;
   }

   @Override
   public String getString() {
      return this.field216;
   }
}
