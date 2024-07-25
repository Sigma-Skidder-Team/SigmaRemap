package remapped;

public class class_6651 {
   private static String[] field_34415;
   private final class_7835 field_34418;
   private final float field_34416;
   private final int field_34417;

   public class_6651(BlockPos var1, float var2, int var3) {
      this(new class_2933(var1), var2, var3);
   }

   public class_6651(class_1343 var1, float var2, int var3) {
      this(new class_2933(new BlockPos(var1)), var2, var3);
   }

   public class_6651(class_7835 var1, float var2, int var3) {
      this.field_34418 = var1;
      this.field_34416 = var2;
      this.field_34417 = var3;
   }

   public class_7835 method_30562() {
      return this.field_34418;
   }

   public float method_30559() {
      return this.field_34416;
   }

   public int method_30560() {
      return this.field_34417;
   }
}
