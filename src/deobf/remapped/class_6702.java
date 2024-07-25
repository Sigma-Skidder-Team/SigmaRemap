package remapped;

public class class_6702 implements class_2443 {
   private static String[] field_34600;
   private int field_34599;

   public class_6702(int var1) {
      this.field_34599 = var1;
   }

   @Override
   public float method_11130(class_1574 var1, class_2205 var2, int var3, int var4, int var5, int var6) {
      return (float)(this.field_34599 * (Math.abs(var3 - var5) + Math.abs(var4 - var6)));
   }
}
