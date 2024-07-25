package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_5572 extends class_446 {
   private static String[] field_28318;
   private List<class_6128> field_28317 = new ArrayList<class_6128>();
   private class_9450 field_28316 = new class_9450();
   public class_5794 field_28319 = new class_5794();

   public class_5572(class_7038 var1, String var2) {
      super(var1, var2, 0, 0, MinecraftClient.method_8510().field_9602.method_43166(), MinecraftClient.method_8510().field_9602.method_43163(), false);
      this.method_32177(false);
      this.method_32119(false);
      this.method_32187(false);
      this.method_32091(true);
      this.method_32105(false);
   }

   @Override
   public void method_32177(boolean var1) {
      super.method_32177(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      int var4 = MinecraftClient.method_8510().field_9602.method_43165();
      int var5 = MinecraftClient.method_8510().field_9602.method_43177();
      int var6 = var4 / 2;

      boolean var7;
      for (var7 = false; this.field_28317.size() < var6; var7 = true) {
         this.field_28317.add(new class_6128((float)this.field_28319.nextInt(var4), (float)this.field_28319.nextInt(var5)));
      }

      while (this.field_28317.size() > var6) {
         this.field_28317.remove(0);
         var7 = true;
      }

      if (var7) {
         for (int var8 = 0; var8 < this.field_28317.size(); var8++) {
            this.field_28317.get(var8).field_31461 = (float)this.field_28319.nextInt(var4);
            this.field_28317.get(var8).field_31466 = (float)this.field_28319.nextInt(var5);
         }
      }

      this.field_28316.method_43704();

      for (class_6128 var9 : this.field_28317) {
         var9.method_28155(this.field_28316);
         if (!(var9.field_31461 < 0.0F)) {
            if (var9.field_31461 > (float)var4) {
               var9.field_31461 = 0.0F;
            }
         } else {
            var9.field_31461 = (float)var4;
         }

         if (!(var9.field_31466 < 0.0F)) {
            if (var9.field_31466 > (float)var5) {
               var9.field_31466 = 0.0F;
            }
         } else {
            var9.field_31466 = (float)var5;
         }

         var9.method_28157(var1);
      }

      super.method_32178(var1);
   }
}
