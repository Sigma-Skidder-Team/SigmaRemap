package remapped;

public class class_9438 {
   private class_4466 field_48182;
   private int[] field_48183;

   public class_9438(class_4466 var1) {
      this(var1, (int[])null);
   }

   public class_9438(class_4466 var1, int var2) {
      this(var1, new int[]{var2});
   }

   public class_9438(class_4466 var1, int[] var2) {
      this.field_48182 = var1;
      this.field_48183 = var2;
   }

   public boolean method_43661(class_4466 var1, int var2) {
      return this.field_48182 != var1 ? false : this.field_48183 == null || Config.method_14253(var2, this.field_48183);
   }

   private boolean method_43666(int var1) {
      return this.field_48183 != null ? Config.method_14253(var1, this.field_48183) : false;
   }

   public boolean method_43665(int var1) {
      if (this.field_48183 != null) {
         if (!this.method_43666(var1)) {
            this.field_48183 = Config.method_14342(this.field_48183, var1);
            return true;
         } else {
            return false;
         }
      } else {
         this.field_48183 = new int[]{var1};
         return true;
      }
   }

   public class_4466 method_43663() {
      return this.field_48182;
   }

   public int[] method_43667() {
      return this.field_48183;
   }

   public static boolean method_43664(class_4466 var0, int var1, class_9438[] var2) {
      if (var2 == null) {
         return false;
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            class_9438 var6 = var2[var5];
            if (var6.method_43661(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public String toString() {
      return this.field_48183 != null ? "" + this.field_48182 + ":" + Config.method_14287(this.field_48183) : "" + this.field_48182;
   }
}
