package net.minecraft.nbt;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class EndNBT implements INBT {
   public static final INBTType<EndNBT> TYPE = new INBTType<EndNBT>()
   {
      public EndNBT readNBT(DataInput input, int depth, NBTSizeTracker accounter)
      {
         accounter.read(64L);
         return EndNBT.INSTANCE;
      }
      public String getName()
      {
         return "END";
      }
      public String getTagName()
      {
         return "TAG_End";
      }
      public boolean isPrimitive()
      {
         return true;
      }
   };

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
      return TYPE;
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
