package remapped;

import java.util.ArrayList;
import java.util.Properties;

public class class_3207 {
   public String field_16008 = null;
   public String field_16007 = null;
   public Identifier[] field_16009 = null;
   public class_974[] field_16006 = null;

   public class_3207(String var1, Identifier[] var2) {
      class_6284 var5 = new class_6284("RandomEntities");
      this.field_16008 = var5.method_28678(var1);
      this.field_16007 = var5.method_28649(var1);
      this.field_16009 = var2;
   }

   public class_3207(Properties var1, String var2, Identifier var3) {
      class_6284 var6 = new class_6284("RandomEntities");
      this.field_16008 = var6.method_28678(var2);
      this.field_16007 = var6.method_28649(var2);
      this.field_16006 = this.method_14743(var1, var2, var3, var6);
   }

   public Identifier method_14746(Identifier var1, class_1979 var2) {
      if (this.field_16006 != null) {
         for (int var5 = 0; var5 < this.field_16006.length; var5++) {
            class_974 var6 = this.field_16006[var5];
            if (var6.method_4261(var2)) {
               return var6.method_4262(var1, var2.method_9095());
            }
         }
      }

      if (this.field_16009 == null) {
         return var1;
      } else {
         int var7 = var2.method_9095();
         int var8 = var7 % this.field_16009.length;
         return this.field_16009[var8];
      }
   }

   private class_974[] method_14743(Properties var1, String var2, Identifier var3, class_6284 var4) {
      ArrayList var7 = new ArrayList();
      int var8 = var1.size();

      for (int var9 = 0; var9 < var8; var9++) {
         int var10 = var9 + 1;
         String var11 = var1.getProperty("textures." + var10);
         if (var11 == null) {
            var11 = var1.getProperty("skins." + var10);
         }

         if (var11 != null) {
            class_974 var12 = new class_974(var1, var2, var3, var10, var11, var4);
            if (var12.method_4264(var2)) {
               var7.add(var12);
            }
         }
      }

      return var7.<class_974>toArray(new class_974[var7.size()]);
   }

   public boolean method_14745(String var1) {
      if (this.field_16009 == null && this.field_16006 == null) {
         class_3111.method_14317("No skins specified: " + var1);
         return false;
      } else {
         if (this.field_16006 != null) {
            for (int var4 = 0; var4 < this.field_16006.length; var4++) {
               class_974 var5 = this.field_16006[var4];
               if (!var5.method_4264(var1)) {
                  return false;
               }
            }
         }

         if (this.field_16009 != null) {
            for (int var6 = 0; var6 < this.field_16009.length; var6++) {
               Identifier var7 = this.field_16009[var6];
               if (!class_3111.method_14362(var7)) {
                  class_3111.method_14317("Texture not found: " + var7.method_21456());
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method_14747() {
      return this.field_16006 == null ? this.field_16009 == null : false;
   }
}
