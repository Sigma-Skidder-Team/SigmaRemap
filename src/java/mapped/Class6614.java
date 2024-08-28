package mapped;

public class Class6614 {
   public static final int field29095 = 0;
   public static final int field29096 = 1;
   public static final int field29097 = 2;
   public static final int field29098 = 3;
   public static final Class6614 field29099 = new Class6614(1);
   public static final Class6614 field29100 = new Class6614(2);
   public static final Class6614 field29101 = new Class6614(0);
   public static final Class6614 field29102 = new Class6614(3);
   private int field29103;

   public static Class6614 method20110(int var0) {
      switch (var0) {
         case 0:
            return field29101;
         case 1:
            return field29099;
         case 2:
            return field29100;
         case 3:
            return field29102;
         default:
            throw new IllegalArgumentException("Invalid channel code: " + var0);
      }
   }

   private Class6614(int var1) {
      this.field29103 = var1;
      if (var1 < 0 || var1 > 3) {
         throw new IllegalArgumentException("channels");
      }
   }

   public int method20111() {
      return this.field29103;
   }

   public int method20112() {
      return this.field29103 != 0 ? 1 : 2;
   }

   @Override
   public boolean equals(Object var1) {
      boolean var4 = false;
      if (var1 instanceof Class6614) {
         Class6614 var5 = (Class6614)var1;
         var4 = var5.field29103 == this.field29103;
      }

      return var4;
   }

   @Override
   public int hashCode() {
      return this.field29103;
   }
}
