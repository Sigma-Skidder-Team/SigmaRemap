package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.optifine.util.BiomeUtils;

import java.util.HashMap;
import java.util.Map;

public class Class6268 implements Class6267 {
   private Map<String, Class1878> field27748 = new HashMap<String, Class1878>();

   public Class6268(Map<String, Class1878> var1) {
      this.method19235();

      for (String var5 : var1.keySet()) {
         Class1878 var6 = (Class1878)var1.get(var5);
         this.method19237(var5, var6);
      }
   }

   private void method19235() {
      Class1910[] var3 = Class1910.values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Class1910 var5 = var3[var4];
         this.method19236(this.field27748, var5);
      }

      Class1875[] var11 = Class1875.values();

      for (int var12 = 0; var12 < var11.length; var12++) {
         Class1875 var6 = var11[var12];
         this.field27748.put(var6.method8136(), var6);
      }

      for (ResourceLocation var15 : BiomeUtils.getLocations()) {
         String var7 = var15.getPath().trim();
         var7 = "BIOME_" + var7.toUpperCase().replace(' ', '_');
         int var8 = BiomeUtils.getId(var15);
         Class1888 var9 = new Class1888((float)var8);
         this.method19237(var7, var9);
      }

      Biome.Category[] var14 = Biome.Category.values();

      for (int var16 = 0; var16 < var14.length; var16++) {
         Biome.Category var19 = var14[var16];
         String var21 = "CAT_" + var19.getString().toUpperCase();
         Class1888 var23 = new Class1888((float)var16);
         this.method19237(var21, var23);
      }

      Biome.RainType[] var17 = Biome.RainType.values();

      for (int var20 = 0; var20 < var17.length; var20++) {
         Biome.RainType var22 = var17[var20];
         String var24 = "PPT_" + var22.getString().toUpperCase();
         Class1888 var10 = new Class1888((float)var20);
         this.method19237(var24, var10);
      }
   }

   private void method19236(Map<String, Class1878> var1, Class1910 var2) {
      String[] var5 = var2.method8185();
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            String[] var8 = var2.method8186();
            if (var8 != null) {
               for (int var9 = 0; var9 < var8.length; var9++) {
                  String var10 = var8[var9];
                  var1.put(var2.method8183() + "." + var7 + "." + var10, new Class1885(var2, var6, var9));
               }
            } else {
               var1.put(var2.method8183() + "." + var7, new Class1885(var2, var6));
            }
         }
      } else {
         var1.put(var2.method8183(), new Class1885(var2));
      }
   }

   public boolean method19237(String var1, Class1878 var2) {
      if (!this.field27748.containsKey(var1)) {
         this.field27748.put(var1, var2);
         return true;
      } else {
         Class7399.method23633("Expression already defined: " + var1);
         return false;
      }
   }

   @Override
   public Class1878 method19230(String var1) {
      return this.field27748.get(var1);
   }

   public boolean method19238(String var1) {
      return this.field27748.containsKey(var1);
   }
}
