package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;

public enum AttachFace implements IStringSerializable {
   field313("floor"),
   field314("wall"),
   field315("ceiling");

   private final String field316;
   private static final AttachFace[] field317 = new AttachFace[]{field313, field314, field315};

   private AttachFace(String var3) {
      this.field316 = var3;
   }

   @Override
   public String getString() {
      return this.field316;
   }
}
