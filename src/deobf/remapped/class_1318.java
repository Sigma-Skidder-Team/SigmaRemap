package remapped;

public final class class_1318 {
   private static String[] field_7271;
   public final class_1318[] field_7272;
   public final int field_7274;
   public final int field_7273;

   public class_1318() {
      this.field_7272 = new class_1318[256];
      this.field_7274 = 0;
      this.field_7273 = 0;
   }

   public class_1318(int var1, int var2) {
      this.field_7272 = null;
      this.field_7274 = var1;
      int var5 = var2 & 7;
      this.field_7273 = var5 != 0 ? var5 : 8;
   }
}
