package remapped;

public class class_1478 extends class_5851 {
   private static String[] field_7924;
   private float field_7923 = Float.MAX_VALUE;
   private class_5851 field_7921;
   private boolean field_7922;

   public class_1478(class_5851 var1) {
      super(var1.field_29731, var1.field_29735, var1.field_29736);
   }

   public class_1478(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public void method_6816(float var1, class_5851 var2) {
      if (var1 < this.field_7923) {
         this.field_7923 = var1;
         this.field_7921 = var2;
      }
   }

   public class_5851 method_6814() {
      return this.field_7921;
   }

   public void method_6817() {
      this.field_7922 = true;
   }

   public static class_1478 method_6815(class_8248 var0) {
      class_1478 var3 = new class_1478(var0.readInt(), var0.readInt(), var0.readInt());
      var3.field_29728 = var0.readFloat();
      var3.field_29729 = var0.readFloat();
      var3.field_29726 = var0.readBoolean();
      var3.field_29730 = class_1108.values()[var0.readInt()];
      var3.field_29732 = var0.readFloat();
      return var3;
   }
}
