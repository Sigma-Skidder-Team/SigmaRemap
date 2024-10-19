package net.minecraft.nbt;

public class NBTTypes {
   private static String[] field19509;
   private static final INBTType<?>[] field19510 = new INBTType[]{
      EndNBT.field77,
      ByteNBT.field63,
      ShortNBT.field75,
      IntNBT.field73,
      LongNBT.field70,
      FloatNBT.field61,
      DoubleNBT.field68,
      ByteArrayNBT.TYPE,
      StringNBT.field84,
      ListNBT.TYPE,
      CompoundNBT.TYPE,
      IntArrayNBT.TYPE,
      LongArrayNBT.TYPE
   };

   public static INBTType<?> getGetTypeByID(int var0) {
      return var0 >= 0 && var0 < field19510.length ? field19510[var0] : INBTType.getEndNBT(var0);
   }
}
