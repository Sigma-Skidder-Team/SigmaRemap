package net.minecraft.nbt;

import mapped.Class7051;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class EndNBT implements INBT {
   public static final INBTType<EndNBT> field77 = new Class7051();
   public static final EndNBT INSTANCE = new EndNBT();

   private EndNBT() {
   }

   @Override
   public void write(DataOutput var1) throws IOException {
   }

   @Override
   public byte getID() {
      return 0;
   }

   @Override
   public INBTType<EndNBT> getType() {
      return field77;
   }

   @Override
   public String toString() {
      return "END";
   }

   public EndNBT copy() {
      return this;
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      return StringTextComponent.EMPTY;
   }
}
