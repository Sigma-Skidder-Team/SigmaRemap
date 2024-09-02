package net.minecraft.nbt;

import mapped.*;

public class NBTTypes {
   private static String[] field19509;
   private static final Class7052<?>[] field19510 = new Class7052[]{
      EndNBT.field77,
      Class33.field63,
      Class37.field75,
      Class36.field73,
      Class35.field70,
      Class32.field61,
      Class34.field68,
      ByteArrayNBT.field54,
      StringNBT.field84,
      ListNBT.field87,
      CompoundNBT.field82,
      IntArrayNBT.field52,
      LongArrayNBT.field91
   };

   public static Class7052<?> getGetTypeByID(int var0) {
      return var0 >= 0 && var0 < field19510.length ? field19510[var0] : Class7052.method21979(var0);
   }
}
