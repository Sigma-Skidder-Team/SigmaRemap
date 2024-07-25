package remapped;

public class class_4799 implements class_6844 {
   private static String[] field_23988;
   private final int[] field_23987;

   public class_4799(int var1) {
      this.field_23987 = new int[var1];
   }

   @Override
   public int method_31408(int var1) {
      return this.field_23987[var1];
   }

   @Override
   public void method_31409(int var1, int var2) {
      this.field_23987[var1] = var2;
   }

   @Override
   public int method_31410() {
      return this.field_23987.length;
   }
}
