package net.minecraft.state.properties;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum StructureMode implements IStringSerializable {
   field318("save"),
   field319("load"),
   field320("corner"),
   field321("data");

   private final String field322;
   private final ITextComponent field323;
   private static final StructureMode[] field324 = new StructureMode[]{field318, field319, field320, field321};

   private StructureMode(String var3) {
      this.field322 = var3;
      this.field323 = new TranslationTextComponent("structure_block.mode_info." + var3);
   }

   @Override
   public String getString() {
      return this.field322;
   }

   public ITextComponent method295() {
      return this.field323;
   }
}
