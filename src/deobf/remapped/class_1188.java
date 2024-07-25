package remapped;

public class class_1188 extends class_5932 {
   private static String[] field_6655;
   private class_6843 field_6656 = null;

   public class_1188(int var1, int var2, int var3, int var4, int var5, class_6843 var6, String var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.field_6656 = var6;
   }

   @Override
   public boolean method_32702(int var1) {
      return !(this.field_6656 instanceof class_2838) ? true : var1 == 0;
   }

   public class_6843 method_5243() {
      return this.field_6656;
   }

   public void method_5245() {
   }

   public boolean method_5244() {
      return true;
   }
}
