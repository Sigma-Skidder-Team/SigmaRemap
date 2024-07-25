package remapped;

public enum class_8965 {
   field_45933(0, 96000, new int[]{33, 512}, new int[]{31, 9}),
   field_45930(1, 88200, new int[]{33, 512}, new int[]{31, 9}),
   field_45925(2, 64000, new int[]{38, 664}, new int[]{34, 10}),
   field_45927(3, 48000, new int[]{40, 672}, new int[]{40, 14}),
   field_45935(4, 44100, new int[]{40, 672}, new int[]{42, 14}),
   field_45929(5, 32000, new int[]{40, 672}, new int[]{51, 14}),
   field_45932(6, 24000, new int[]{41, 652}, new int[]{46, 14}),
   field_45928(7, 22050, new int[]{41, 652}, new int[]{46, 14}),
   field_45919(8, 16000, new int[]{37, 664}, new int[]{42, 14}),
   field_45922(9, 12000, new int[]{37, 664}, new int[]{42, 14}),
   field_45934(10, 11025, new int[]{37, 664}, new int[]{42, 14}),
   field_45931(11, 8000, new int[]{34, 664}, new int[]{39, 14}),
   field_45918(-1, 0, new int[]{0, 0}, new int[]{0, 0});

   private final int field_45936;
   private final int field_45924;
   private final int[] field_45920;
   private final int[] field_45923;

   public static class_8965 method_41128(int var0) {
      class_8965 var3;
      if (var0 >= 0 && var0 < 12) {
         var3 = values()[var0];
      } else {
         var3 = field_45918;
      }

      return var3;
   }

   public static class_8965 method_41131(int var0) {
      class_8965[] var3 = values();
      class_8965 var4 = null;

      for (int var5 = 0; var4 == null && var5 < 12; var5++) {
         if (var0 == var3[var5].field_45924) {
            var4 = var3[var5];
         }
      }

      if (var4 == null) {
         var4 = field_45918;
      }

      return var4;
   }

   private class_8965(int var3, int var4, int[] var5, int[] var6) {
      this.field_45936 = var3;
      this.field_45924 = var4;
      this.field_45920 = var5;
      this.field_45923 = var6;
   }

   public int method_41129() {
      return this.field_45936;
   }

   public int method_41132() {
      return this.field_45924;
   }

   public int method_41133() {
      return this.field_45920[0];
   }

   public int method_41127() {
      return this.field_45920[1];
   }

   public int method_41126(boolean var1) {
      return this.field_45923[!var1 ? 0 : 1];
   }

   @Override
   public String toString() {
      return Integer.toString(this.field_45924);
   }
}
