package net.minecraft.nbt;

import mapped.Class7051;
import mapped.Class7052;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class EndNBT implements INBT {
   public static final Class7052<EndNBT> field77 = new Class7051();
   public static final EndNBT INSTANCE = new EndNBT();

   private EndNBT() {
   }

   @Override
   public void write(DataOutput var1) throws IOException {
   }

   @Override
   public byte getId() {
      return 0;
   }

   @Override
   public Class7052<EndNBT> method75() {
      return field77;
   }

   @Override
   public String toString() {
      return "END";
   }

   public EndNBT method79() {
      return this;
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      return StringTextComponent.EMPTY;
   }
}
