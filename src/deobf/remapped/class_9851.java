package remapped;

public class class_9851 extends class_2833 {
   private static String[] field_49859;
   private final class_4206 field_49858;
   private int field_49860;

   public class_9851(class_4206 var1) {
      super(var1);
      this.field_49858 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_13878 == class_1737.field_8946 && this.field_49860-- <= 0) {
         this.field_49860 = this.field_49860 + this.field_49858.method_26594().nextInt(5) + 2;
         class_1343 var3 = new class_1343(
            this.field_13884 - this.field_49858.method_37302(),
            this.field_13886 - this.field_49858.method_37309(),
            this.field_13880 - this.field_49858.method_37156()
         );
         double var4 = var3.method_6217();
         var3 = var3.method_6213();
         if (!this.method_45361(var3, class_9299.method_42815(var4))) {
            this.field_13878 = class_1737.field_8945;
         } else {
            this.field_49858.method_37215(this.field_49858.method_37098().method_6215(var3.method_6209(0.1)));
         }
      }
   }

   private boolean method_45361(class_1343 var1, int var2) {
      class_4092 var5 = this.field_49858.method_37241();

      for (int var6 = 1; var6 < var2; var6++) {
         var5 = var5.method_18920(var1);
         if (!this.field_49858.world.method_6683(this.field_49858, var5)) {
            return false;
         }
      }

      return true;
   }
}
