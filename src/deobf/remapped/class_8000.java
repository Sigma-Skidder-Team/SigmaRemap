package remapped;

public class class_8000 extends class_1820 {
   private static String[] field_40988;
   private final boolean field_40987;
   private int field_40986;

   public class_8000(MobEntity var1, boolean var2) {
      super(var1);
      this.field_9241 = var1;
      this.field_40987 = var2;
   }

   @Override
   public boolean method_16799() {
      return this.field_40987 && this.field_40986 > 0 && super.method_16799();
   }

   @Override
   public void method_16796() {
      this.field_40986 = 20;
      this.method_8058(true);
   }

   @Override
   public void method_16793() {
      this.method_8058(false);
   }

   @Override
   public void method_16794() {
      this.field_40986--;
      super.method_16794();
   }
}
