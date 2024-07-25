package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_6616 implements class_3471 {
   private class_8296 field_34176 = class_8296.field_42513;
   private class_8296 field_34180 = class_8296.field_42518;
   private class_8965 field_34183 = class_8965.field_45918;
   private class_6871 field_34178 = class_6871.field_35386;
   private boolean field_34182 = false;
   private boolean field_34181;
   private int field_34175;
   private boolean field_34172;
   private boolean field_34173 = false;
   private boolean field_34170 = false;
   private boolean field_34177 = true;
   private boolean field_34179 = false;
   private boolean field_34174 = false;
   private boolean field_34171 = false;

   private class_6616() {
   }

   public class_6871 method_30410() {
      return this.field_34178;
   }

   public void method_30427(class_6871 var1) {
      this.field_34178 = var1;
   }

   public int method_30422() {
      return this.field_34175;
   }

   public void method_30411(int var1) {
      this.field_34175 = var1;
   }

   public boolean method_30417() {
      return this.field_34181;
   }

   public void method_30405(boolean var1) {
      this.field_34181 = var1;
   }

   public class_8296 method_30425() {
      return this.field_34180;
   }

   public void method_30416(class_8296 var1) {
      this.field_34180 = var1;
   }

   public int method_30421() {
      return !this.field_34182 ? 1024 : 960;
   }

   public boolean method_30429() {
      return this.field_34182;
   }

   public void method_30428(boolean var1) {
      this.field_34182 = var1;
   }

   public class_8296 method_30415() {
      return this.field_34176;
   }

   public void method_30408(class_8296 var1) {
      this.field_34176 = var1;
   }

   public class_8965 method_30420() {
      return this.field_34183;
   }

   public void method_30426(class_8965 var1) {
      this.field_34183 = var1;
   }

   public boolean method_30419() {
      return this.field_34173;
   }

   public boolean method_30430() {
      return this.field_34170;
   }

   public boolean method_30412() {
      return this.field_34177;
   }

   public void method_30418(boolean var1) {
      this.field_34177 = var1;
   }

   public boolean method_30406() {
      return this.field_34174;
   }

   public boolean method_30407() {
      return this.field_34179;
   }

   public boolean method_30413() {
      return this.field_34171;
   }

   public static class_6616 method_30409(byte[] var0) throws AACException {
      class_7390 var3 = new class_7390(var0);
      class_6616 var4 = new class_6616();

      class_6616 var11;
      try {
         var4.field_34176 = method_30414(var3);
         int var5 = var3.method_33662(4);
         if (var5 == 15) {
            var4.field_34183 = class_8965.method_41131(var3.method_33662(24));
         } else {
            var4.field_34183 = class_8965.method_41128(var5);
         }

         var4.field_34178 = class_6871.method_31523(var3.method_33662(4));
         switch (var4.field_34176) {
            case field_42515:
               var4.field_34180 = var4.field_34176;
               var4.field_34173 = true;
               var5 = var3.method_33662(4);
               var4.field_34170 = var4.field_34183.method_41129() == var5;
               var4.field_34183 = class_8965.method_41128(var5);
               var4.field_34176 = method_30414(var3);
               break;
            case field_42513:
            case field_42521:
            case field_42524:
            case field_42522:
            case field_42519:
            case field_42503:
            case field_42507:
               var4.field_34182 = var3.method_33660();
               if (var4.field_34182) {
                  throw new class_5060("config uses 960-sample frames, not yet supported");
               }

               var4.field_34181 = var3.method_33660();
               if (var4.field_34181) {
                  var4.field_34175 = var3.method_33662(14);
               } else {
                  var4.field_34175 = 0;
               }

               var4.field_34172 = var3.method_33660();
               if (var4.field_34172) {
                  if (var4.field_34176.method_38276()) {
                     var4.field_34179 = var3.method_33660();
                     var4.field_34174 = var3.method_33660();
                     var4.field_34171 = var3.method_33660();
                  }

                  var3.method_33663();
               }

               if (var4.field_34178 == class_6871.field_35394) {
                  var3.method_33652(3);
                  class_6828 var6 = new class_6828();
                  var6.method_31315(var3);
                  var4.field_34176 = var6.method_31318();
                  var4.field_34183 = var6.method_31316();
                  var4.field_34178 = class_6871.method_31523(var6.method_31317());
               }

               if (var3.method_33659() > 10) {
                  method_30423(var3, var4);
               }
               break;
            default:
               throw new class_5060("profile not supported: " + var4.field_34176.method_38274());
         }

         var11 = var4;
      } finally {
         var3.method_33661();
      }

      return var11;
   }

   private static class_8296 method_30414(class_7390 var0) throws AACException {
      int var3 = var0.method_33662(5);
      if (var3 == 31) {
         var3 = 32 + var0.method_33662(6);
      }

      return class_8296.method_38275(var3);
   }

   private static void method_30423(class_7390 var0, class_6616 var1) throws AACException {
      int var4 = var0.method_33662(11);
      switch (var4) {
         case 695:
            class_8296 var5 = class_8296.method_38275(var0.method_33662(5));
            if (var5.equals(class_8296.field_42515)) {
               var1.field_34173 = var0.method_33660();
               if (var1.field_34173) {
                  var1.field_34176 = var5;
                  int var6 = var0.method_33662(4);
                  if (var6 == var1.field_34183.method_41129()) {
                     var1.field_34170 = true;
                  }

                  if (var6 == 15) {
                     throw new class_5060("sample rate specified explicitly, not supported yet!");
                  }
               }
            }
      }
   }
}
