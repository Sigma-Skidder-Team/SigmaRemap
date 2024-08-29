package mapped;

import java.util.ArrayList;
import java.util.Properties;

public class Class7978 {
   public String field34294 = null;
   public String field34295 = null;
   public ResourceLocation[] field34296 = null;
   public Class6810[] field34297 = null;

   public Class7978(String var1, ResourceLocation[] var2) {
      Class8896 var5 = new Class8896("RandomEntities");
      this.field34294 = var5.method32382(var1);
      this.field34295 = var5.method32383(var1);
      this.field34296 = var2;
   }

   public Class7978(Properties var1, String var2, ResourceLocation var3) {
      Class8896 var6 = new Class8896("RandomEntities");
      this.field34294 = var6.method32382(var2);
      this.field34295 = var6.method32383(var2);
      this.field34297 = this.method27114(var1, var2, var3, var6);
   }

   public ResourceLocation method27113(ResourceLocation var1, Class7458 var2) {
      if (this.field34297 != null) {
         for (int var5 = 0; var5 < this.field34297.length; var5++) {
            Class6810 var6 = this.field34297[var5];
            if (var6.method20750(var2)) {
               return var6.method20751(var1, var2.method24123());
            }
         }
      }

      if (this.field34296 == null) {
         return var1;
      } else {
         int var7 = var2.method24123();
         int var8 = var7 % this.field34296.length;
         return this.field34296[var8];
      }
   }

   private Class6810[] method27114(Properties var1, String var2, ResourceLocation var3, Class8896 var4) {
      ArrayList<Class6810> var7 = new ArrayList();
      int var8 = var1.size();

      for (int var9 = 0; var9 < var8; var9++) {
         int var10 = var9 + 1;
         String var11 = var1.getProperty("textures." + var10);
         if (var11 == null) {
            var11 = var1.getProperty("skins." + var10);
         }

         if (var11 != null) {
            Class6810 var12 = new Class6810(var1, var2, var3, var10, var11, var4);
            if (var12.method20749(var2)) {
               var7.add(var12);
            }
         }
      }

      return var7.toArray(new Class6810[var7.size()]);
   }

   public boolean method27115(String var1) {
      if (this.field34296 == null && this.field34297 == null) {
         Class7944.method26811("No skins specified: " + var1);
         return false;
      } else {
         if (this.field34297 != null) {
            for (int var4 = 0; var4 < this.field34297.length; var4++) {
               Class6810 var5 = this.field34297[var4];
               if (!var5.method20749(var1)) {
                  return false;
               }
            }
         }

         if (this.field34296 != null) {
            for (int var6 = 0; var6 < this.field34296.length; var6++) {
               ResourceLocation var7 = this.field34296[var6];
               if (!Class7944.method26866(var7)) {
                  Class7944.method26811("Texture not found: " + var7.getPath());
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method27116() {
      return this.field34297 == null ? this.field34296 == null : false;
   }
}
