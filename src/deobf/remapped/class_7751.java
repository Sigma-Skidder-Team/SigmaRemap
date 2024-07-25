package remapped;

public enum class_7751 {
   field_39304,
   field_39305,
   field_39306,
   field_39308,
   field_39307,
   field_39302;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_6045 method_35170(String var1) {
      switch (this) {
         case field_39304:
            return new class_8800(var1);
         case field_39305:
            return new class_8800(var1);
         case field_39306:
            return new class_2296(var1);
         case field_39308:
            return new class_6894(var1);
         case field_39307:
            return new class_6777(var1);
         case field_39302:
            return new class_85(var1);
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_35169(class_3999 var1, class_6045 var2) {
      switch (this) {
         case field_39304:
            this.method_35178((class_1342)var1, (class_8800)var2);
            return;
         case field_39305:
            this.method_35171((class_6839)var1, (class_8800)var2);
            return;
         case field_39306:
            this.method_35174((class_6839)var1, (class_2296)var2);
            return;
         case field_39308:
            this.method_35173((class_8350)var1, (class_6894)var2);
            return;
         case field_39307:
            this.method_35177((class_8350)var1, (class_6777)var2);
            return;
         case field_39302:
            this.method_35168((class_8350)var1, (class_85)var2);
            return;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   private void method_35178(class_1342 var1, class_8800 var2) {
      boolean var5 = var1.method_6191();
      int var6 = !var5 ? 0 : 1;
      var2.method_40456(var6);
   }

   private void method_35171(class_6839 var1, class_8800 var2) {
      int var5 = (int)var1.method_31353();
      var2.method_40456(var5);
   }

   private void method_35174(class_6839 var1, class_2296 var2) {
      float var5 = var1.method_31353();
      var2.method_10563(var5);
   }

   private void method_35173(class_8350 var1, class_6894 var2) {
      float[] var5 = var1.method_38444();
      if (var5.length == 2) {
         var2.method_31585(var5[0], var5[1]);
      } else {
         throw new RuntimeException("Value length is not 2, length: " + var5.length);
      }
   }

   private void method_35177(class_8350 var1, class_6777 var2) {
      float[] var5 = var1.method_38444();
      if (var5.length == 3) {
         var2.method_31090(var5[0], var5[1], var5[2]);
      } else {
         throw new RuntimeException("Value length is not 3, length: " + var5.length);
      }
   }

   private void method_35168(class_8350 var1, class_85 var2) {
      float[] var5 = var1.method_38444();
      if (var5.length == 4) {
         var2.method_207(var5[0], var5[1], var5[2], var5[3]);
      } else {
         throw new RuntimeException("Value length is not 4, length: " + var5.length);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean method_35172(class_8848 var1) {
      switch (this) {
         case field_39304:
            return var1 == class_8848.field_45252;
         case field_39305:
            return var1 == class_8848.field_45248;
         case field_39306:
            return var1 == class_8848.field_45248;
         case field_39308:
         case field_39307:
         case field_39302:
            return var1 == class_8848.field_45249;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   public static class_7751 method_35175(String var0) {
      class_7751[] var3 = values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_7751 var5 = var3[var4];
         if (var5.name().toLowerCase().equals(var0)) {
            return var5;
         }
      }

      return null;
   }
}
