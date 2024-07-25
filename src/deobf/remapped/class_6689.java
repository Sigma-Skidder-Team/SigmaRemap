package remapped;

public enum class_6689 {
   field_34561("tx"),
   field_34560("ty"),
   field_34570("tz"),
   field_34564("rx"),
   field_34562("ry"),
   field_34565("rz"),
   field_34558("sx"),
   field_34569("sy"),
   field_34559("sz");

   private String field_34568;
   public static class_6689[] field_34563 = values();

   private class_6689(String var3) {
      this.field_34568 = var3;
   }

   public String method_30673() {
      return this.field_34568;
   }

   public float method_30674(class_1549 var1) {
      switch (this) {
         case field_34561:
            return var1.field_8183;
         case field_34560:
            return var1.field_8181;
         case field_34570:
            return var1.field_8187;
         case field_34564:
            return var1.field_8191;
         case field_34562:
            return var1.field_8190;
         case field_34565:
            return var1.field_8185;
         case field_34558:
            return var1.field_8201;
         case field_34569:
            return var1.field_8182;
         case field_34559:
            return var1.field_8193;
         default:
            class_3111.method_14317("GetFloat not supported for: " + this);
            return 0.0F;
      }
   }

   public void method_30677(class_1549 var1, float var2) {
      switch (this) {
         case field_34561:
            var1.field_8183 = var2;
            return;
         case field_34560:
            var1.field_8181 = var2;
            return;
         case field_34570:
            var1.field_8187 = var2;
            return;
         case field_34564:
            var1.field_8191 = var2;
            return;
         case field_34562:
            var1.field_8190 = var2;
            return;
         case field_34565:
            var1.field_8185 = var2;
            return;
         case field_34558:
            var1.field_8201 = var2;
            return;
         case field_34569:
            var1.field_8182 = var2;
            return;
         case field_34559:
            var1.field_8193 = var2;
            return;
         default:
            class_3111.method_14317("SetFloat not supported for: " + this);
      }
   }

   public static class_6689 method_30676(String var0) {
      for (int var3 = 0; var3 < field_34563.length; var3++) {
         class_6689 var4 = field_34563[var3];
         if (var4.method_30673().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
