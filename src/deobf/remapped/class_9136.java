package remapped;

import java.util.Random;

public class class_9136 extends class_1279 {
   private static String[] field_46732;
   private int field_46731;

   public class_9136(class_240 var1, class_7914 var2, Random var3) {
      super(class_2746.field_13411, 1, var1, var2, 1, 1, 1);
      this.field_46731 = var3.nextInt(3);
   }

   public class_9136(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13411, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(this.field_7031)[class_240.field_802.method_1050()]);
      }

      if (class_7914.method_35807(this.field_7031)[class_240.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 4, 1, 6, 4, 6, field_7037);
      }

      boolean var10 = this.field_46731 != 0
         && var4.nextBoolean()
         && !class_7914.method_35806(this.field_7031)[class_240.field_802.method_1050()]
         && !class_7914.method_35806(this.field_7031)[class_240.field_817.method_1050()]
         && this.field_7031.method_35815() > 1;
      if (this.field_46731 != 0) {
         if (this.field_46731 != 1) {
            if (this.field_46731 == 2) {
               this.method_32500(var1, var5, 0, 1, 0, 0, 1, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 7, 1, 0, 7, 1, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 1, 0, 6, 1, 0, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 1, 7, 6, 1, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 0, 2, 0, 0, 2, 7, field_7040, field_7040, false);
               this.method_32500(var1, var5, 7, 2, 0, 7, 2, 7, field_7040, field_7040, false);
               this.method_32500(var1, var5, 1, 2, 0, 6, 2, 0, field_7040, field_7040, false);
               this.method_32500(var1, var5, 1, 2, 7, 6, 2, 7, field_7040, field_7040, false);
               this.method_32500(var1, var5, 0, 3, 0, 0, 3, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 7, 3, 0, 7, 3, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 3, 0, 6, 3, 0, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 3, 7, 6, 3, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 0, 1, 3, 0, 2, 4, field_7040, field_7040, false);
               this.method_32500(var1, var5, 7, 1, 3, 7, 2, 4, field_7040, field_7040, false);
               this.method_32500(var1, var5, 3, 1, 0, 4, 2, 0, field_7040, field_7040, false);
               this.method_32500(var1, var5, 3, 1, 7, 4, 2, 7, field_7040, field_7040, false);
               if (class_7914.method_35806(this.field_7031)[class_240.field_800.method_1050()]) {
                  this.method_5718(var1, var5, 3, 1, 0, 4, 2, 0);
               }

               if (class_7914.method_35806(this.field_7031)[class_240.field_818.method_1050()]) {
                  this.method_5718(var1, var5, 3, 1, 7, 4, 2, 7);
               }

               if (class_7914.method_35806(this.field_7031)[class_240.field_809.method_1050()]) {
                  this.method_5718(var1, var5, 0, 1, 3, 0, 2, 4);
               }

               if (class_7914.method_35806(this.field_7031)[class_240.field_804.method_1050()]) {
                  this.method_5718(var1, var5, 7, 1, 3, 7, 2, 4);
               }
            }
         } else {
            this.method_32500(var1, var5, 2, 1, 2, 2, 3, 2, field_7039, field_7039, false);
            this.method_32500(var1, var5, 2, 1, 5, 2, 3, 5, field_7039, field_7039, false);
            this.method_32500(var1, var5, 5, 1, 5, 5, 3, 5, field_7039, field_7039, false);
            this.method_32500(var1, var5, 5, 1, 2, 5, 3, 2, field_7039, field_7039, false);
            this.method_32529(var1, field_7032, 2, 2, 2, var5);
            this.method_32529(var1, field_7032, 2, 2, 5, var5);
            this.method_32529(var1, field_7032, 5, 2, 5, var5);
            this.method_32529(var1, field_7032, 5, 2, 2, var5);
            this.method_32500(var1, var5, 0, 1, 0, 1, 3, 0, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, 1, 1, 0, 3, 1, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, 1, 7, 1, 3, 7, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, 1, 6, 0, 3, 6, field_7039, field_7039, false);
            this.method_32500(var1, var5, 6, 1, 7, 7, 3, 7, field_7039, field_7039, false);
            this.method_32500(var1, var5, 7, 1, 6, 7, 3, 6, field_7039, field_7039, false);
            this.method_32500(var1, var5, 6, 1, 0, 7, 3, 0, field_7039, field_7039, false);
            this.method_32500(var1, var5, 7, 1, 1, 7, 3, 1, field_7039, field_7039, false);
            this.method_32529(var1, field_7037, 1, 2, 0, var5);
            this.method_32529(var1, field_7037, 0, 2, 1, var5);
            this.method_32529(var1, field_7037, 1, 2, 7, var5);
            this.method_32529(var1, field_7037, 0, 2, 6, var5);
            this.method_32529(var1, field_7037, 6, 2, 7, var5);
            this.method_32529(var1, field_7037, 7, 2, 6, var5);
            this.method_32529(var1, field_7037, 6, 2, 0, var5);
            this.method_32529(var1, field_7037, 7, 2, 1, var5);
            if (!class_7914.method_35806(this.field_7031)[class_240.field_800.method_1050()]) {
               this.method_32500(var1, var5, 1, 3, 0, 6, 3, 0, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 2, 0, 6, 2, 0, field_7037, field_7037, false);
               this.method_32500(var1, var5, 1, 1, 0, 6, 1, 0, field_7039, field_7039, false);
            }

            if (!class_7914.method_35806(this.field_7031)[class_240.field_818.method_1050()]) {
               this.method_32500(var1, var5, 1, 3, 7, 6, 3, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, 1, 2, 7, 6, 2, 7, field_7037, field_7037, false);
               this.method_32500(var1, var5, 1, 1, 7, 6, 1, 7, field_7039, field_7039, false);
            }

            if (!class_7914.method_35806(this.field_7031)[class_240.field_809.method_1050()]) {
               this.method_32500(var1, var5, 0, 3, 1, 0, 3, 6, field_7039, field_7039, false);
               this.method_32500(var1, var5, 0, 2, 1, 0, 2, 6, field_7037, field_7037, false);
               this.method_32500(var1, var5, 0, 1, 1, 0, 1, 6, field_7039, field_7039, false);
            }

            if (!class_7914.method_35806(this.field_7031)[class_240.field_804.method_1050()]) {
               this.method_32500(var1, var5, 7, 3, 1, 7, 3, 6, field_7039, field_7039, false);
               this.method_32500(var1, var5, 7, 2, 1, 7, 2, 6, field_7037, field_7037, false);
               this.method_32500(var1, var5, 7, 1, 1, 7, 1, 6, field_7039, field_7039, false);
            }
         }
      } else {
         this.method_32500(var1, var5, 0, 1, 0, 2, 1, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 0, 3, 0, 2, 3, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 0, 2, 0, 0, 2, 2, field_7037, field_7037, false);
         this.method_32500(var1, var5, 1, 2, 0, 2, 2, 0, field_7037, field_7037, false);
         this.method_32529(var1, field_7032, 1, 2, 1, var5);
         this.method_32500(var1, var5, 5, 1, 0, 7, 1, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 5, 3, 0, 7, 3, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 7, 2, 0, 7, 2, 2, field_7037, field_7037, false);
         this.method_32500(var1, var5, 5, 2, 0, 6, 2, 0, field_7037, field_7037, false);
         this.method_32529(var1, field_7032, 6, 2, 1, var5);
         this.method_32500(var1, var5, 0, 1, 5, 2, 1, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 0, 3, 5, 2, 3, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 0, 2, 5, 0, 2, 7, field_7037, field_7037, false);
         this.method_32500(var1, var5, 1, 2, 7, 2, 2, 7, field_7037, field_7037, false);
         this.method_32529(var1, field_7032, 1, 2, 6, var5);
         this.method_32500(var1, var5, 5, 1, 5, 7, 1, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 5, 3, 5, 7, 3, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 7, 2, 5, 7, 2, 7, field_7037, field_7037, false);
         this.method_32500(var1, var5, 5, 2, 7, 6, 2, 7, field_7037, field_7037, false);
         this.method_32529(var1, field_7032, 6, 2, 6, var5);
         if (!class_7914.method_35806(this.field_7031)[class_240.field_800.method_1050()]) {
            this.method_32500(var1, var5, 3, 3, 0, 4, 3, 1, field_7039, field_7039, false);
            this.method_32500(var1, var5, 3, 2, 0, 4, 2, 0, field_7037, field_7037, false);
            this.method_32500(var1, var5, 3, 1, 0, 4, 1, 1, field_7039, field_7039, false);
         } else {
            this.method_32500(var1, var5, 3, 3, 0, 4, 3, 0, field_7039, field_7039, false);
         }

         if (!class_7914.method_35806(this.field_7031)[class_240.field_818.method_1050()]) {
            this.method_32500(var1, var5, 3, 3, 6, 4, 3, 7, field_7039, field_7039, false);
            this.method_32500(var1, var5, 3, 2, 7, 4, 2, 7, field_7037, field_7037, false);
            this.method_32500(var1, var5, 3, 1, 6, 4, 1, 7, field_7039, field_7039, false);
         } else {
            this.method_32500(var1, var5, 3, 3, 7, 4, 3, 7, field_7039, field_7039, false);
         }

         if (!class_7914.method_35806(this.field_7031)[class_240.field_809.method_1050()]) {
            this.method_32500(var1, var5, 0, 3, 3, 1, 3, 4, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, 2, 3, 0, 2, 4, field_7037, field_7037, false);
            this.method_32500(var1, var5, 0, 1, 3, 1, 1, 4, field_7039, field_7039, false);
         } else {
            this.method_32500(var1, var5, 0, 3, 3, 0, 3, 4, field_7039, field_7039, false);
         }

         if (!class_7914.method_35806(this.field_7031)[class_240.field_804.method_1050()]) {
            this.method_32500(var1, var5, 6, 3, 3, 7, 3, 4, field_7039, field_7039, false);
            this.method_32500(var1, var5, 7, 2, 3, 7, 2, 4, field_7037, field_7037, false);
            this.method_32500(var1, var5, 6, 1, 3, 7, 1, 4, field_7039, field_7039, false);
         } else {
            this.method_32500(var1, var5, 7, 3, 3, 7, 3, 4, field_7039, field_7039, false);
         }
      }

      if (var10) {
         this.method_32500(var1, var5, 3, 1, 3, 4, 1, 4, field_7039, field_7039, false);
         this.method_32500(var1, var5, 3, 2, 3, 4, 2, 4, field_7037, field_7037, false);
         this.method_32500(var1, var5, 3, 3, 3, 4, 3, 4, field_7039, field_7039, false);
      }

      return true;
   }
}
