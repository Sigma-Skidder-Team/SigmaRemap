package remapped;

public enum class_4536 {
   field_22134(class_240.field_802),
   field_22124(class_240.field_817),
   field_22133(class_240.field_818),
   field_22120(class_240.field_800),
   field_22117(class_240.field_809),
   field_22131(class_240.field_804),
   field_22136(class_240.field_818, class_240.field_809),
   field_22132(class_240.field_818, class_240.field_804),
   field_22130(class_240.field_800, class_240.field_809),
   field_22118(class_240.field_800, class_240.field_804),
   field_22122(class_240.field_802, class_240.field_818),
   field_22116(class_240.field_802, class_240.field_800),
   field_22128(class_240.field_817, class_240.field_818),
   field_22135(class_240.field_817, class_240.field_800),
   field_22123(class_240.field_802, class_240.field_809),
   field_22129(class_240.field_802, class_240.field_804),
   field_22126(class_240.field_817, class_240.field_809),
   field_22125(class_240.field_817, class_240.field_804);

   private class_240 field_22121;
   private class_240 field_22137;

   private class_4536(class_240 var3) {
      this.field_22121 = var3;
   }

   private class_4536(class_240 var3, class_240 var4) {
      this.field_22121 = var3;
      this.field_22137 = var4;
   }

   public class_240 method_21063() {
      return this.field_22121;
   }

   public class_240 method_21058() {
      return this.field_22137;
   }

   public class_1331 method_21056(class_1331 var1) {
      var1 = var1.method_6099(this.field_22121, 1);
      if (this.field_22137 != null) {
         var1 = var1.method_6099(this.field_22137, 1);
      }

      return var1;
   }

   public int method_21057() {
      int var3 = this.field_22121.method_1041();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1041();
      }

      return var3;
   }

   public int method_21059() {
      int var3 = this.field_22121.method_1054();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1054();
      }

      return var3;
   }

   public int method_21061() {
      int var3 = this.field_22121.method_1034();
      if (this.field_22137 != null) {
         var3 += this.field_22137.method_1034();
      }

      return var3;
   }

   public boolean method_21062() {
      return this.field_22137 != null;
   }
}
