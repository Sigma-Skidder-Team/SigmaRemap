package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class class_4644 {
   public static final List<String> field_22672 = Lists.newArrayList(new String[]{field_22671[1], "layer1", "layer2", "layer3", "layer4"});

   public class_9403 method_21483(Function<class_2843, class_5155> var1, class_9403 var2) {
      HashMap var5 = Maps.newHashMap();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < field_22672.size(); var7++) {
         String var8 = field_22672.get(var7);
         if (!var2.method_43562(var8)) {
            break;
         }

         class_2843 var9 = var2.method_43564(var8);
         var5.put(var8, Either.left(var9));
         class_5155 var10 = (class_5155)var1.apply(var9);
         var6.addAll(this.method_21485(var7, var8, var10));
      }

      var5.put("particle", !var2.method_43562("particle") ? (Either)var5.get("layer0") : Either.left(var2.method_43564("particle")));
      class_9403 var11 = new class_9403((Identifier)null, var6, var5, false, var2.method_43552(), var2.method_43563(), var2.method_43553());
      var11.field_48083 = var2.field_48083;
      return var11;
   }

   private List<class_9487> method_21485(int var1, String var2, class_5155 var3) {
      HashMap var6 = Maps.newHashMap();
      var6.put(class_240.field_800, new class_7300((class_240)null, var1, var2, new class_9874(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var6.put(class_240.field_818, new class_7300((class_240)null, var1, var2, new class_9874(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      ArrayList var7 = Lists.newArrayList();
      var7.add(new class_9487(new class_2426(0.0F, 0.0F, 7.5F), new class_2426(16.0F, 16.0F, 8.5F), var6, (class_1868)null, true));
      var7.addAll(this.method_21486(var3, var2, var1));
      return var7;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private List<class_9487> method_21486(class_5155 var1, String var2, int var3) {
      float var6 = (float)var1.method_23625();
      float var7 = (float)var1.method_23615();
      ArrayList var8 = Lists.newArrayList();

      for (class_93 var10 : this.method_21479(var1)) {
         float var11 = 0.0F;
         float var12 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = 16.0F / var6;
         float var20 = 16.0F / var7;
         float var21 = (float)var10.method_272();
         float var22 = (float)var10.method_270();
         float var23 = (float)var10.method_275();
         class_2762 var24 = var10.method_273();
         switch (var24) {
            case field_13500:
               var15 = var21;
               var11 = var21;
               var13 = var16 = var22 + 1.0F;
               var17 = var23;
               var12 = var23;
               var14 = var23;
               var18 = var23 + 1.0F;
               break;
            case field_13498:
               var17 = var23;
               var18 = var23 + 1.0F;
               var15 = var21;
               var11 = var21;
               var13 = var16 = var22 + 1.0F;
               var12 = var23 + 1.0F;
               var14 = var23 + 1.0F;
               break;
            case field_13501:
               var15 = var23;
               var11 = var23;
               var13 = var23;
               var16 = var23 + 1.0F;
               var18 = var21;
               var12 = var21;
               var14 = var17 = var22 + 1.0F;
               break;
            case field_13502:
               var15 = var23;
               var16 = var23 + 1.0F;
               var11 = var23 + 1.0F;
               var13 = var23 + 1.0F;
               var18 = var21;
               var12 = var21;
               var14 = var17 = var22 + 1.0F;
         }

         var11 *= var19;
         var13 *= var19;
         var12 *= var20;
         var14 *= var20;
         var12 = 16.0F - var12;
         var14 = 16.0F - var14;
         var15 *= var19;
         var16 *= var19;
         var17 *= var20;
         var18 *= var20;
         HashMap var25 = Maps.newHashMap();
         var25.put(var24.method_12568(), new class_7300((class_240)null, var3, var2, new class_9874(new float[]{var15, var17, var16, var18}, 0)));
         switch (var24) {
            case field_13500:
               var8.add(new class_9487(new class_2426(var11, var12, 7.5F), new class_2426(var13, var12, 8.5F), var25, (class_1868)null, true));
               break;
            case field_13498:
               var8.add(new class_9487(new class_2426(var11, var14, 7.5F), new class_2426(var13, var14, 8.5F), var25, (class_1868)null, true));
               break;
            case field_13501:
               var8.add(new class_9487(new class_2426(var11, var12, 7.5F), new class_2426(var11, var14, 8.5F), var25, (class_1868)null, true));
               break;
            case field_13502:
               var8.add(new class_9487(new class_2426(var13, var12, 7.5F), new class_2426(var13, var14, 8.5F), var25, (class_1868)null, true));
         }
      }

      return var8;
   }

   private List<class_93> method_21479(class_5155 var1) {
      int var4 = var1.method_23625();
      int var5 = var1.method_23615();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.method_23610(); var7++) {
         for (int var8 = 0; var8 < var5; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               boolean var10 = !this.method_21481(var1, var7, var9, var8, var4, var5);
               this.method_21480(class_2762.field_13500, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method_21480(class_2762.field_13498, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method_21480(class_2762.field_13501, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method_21480(class_2762.field_13502, var6, var1, var7, var9, var8, var4, var5, var10);
            }
         }
      }

      return var6;
   }

   private void method_21480(class_2762 var1, List<class_93> var2, class_5155 var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      boolean var12 = this.method_21481(var3, var4, var5 + var1.method_12566(), var6 + var1.method_12565(), var7, var8) && var9;
      if (var12) {
         this.method_21482(var2, var1, var5, var6);
      }
   }

   private void method_21482(List<class_93> var1, class_2762 var2, int var3, int var4) {
      class_93 var7 = null;

      for (class_93 var9 : var1) {
         if (var9.method_273() == var2) {
            int var10 = !class_2762.method_12564(var2) ? var3 : var4;
            if (var9.method_275() == var10) {
               var7 = var9;
               break;
            }
         }
      }

      int var11 = !class_2762.method_12564(var2) ? var3 : var4;
      int var12 = !class_2762.method_12564(var2) ? var4 : var3;
      if (var7 != null) {
         var7.method_271(var12);
      } else {
         var1.add(new class_93(var2, var12, var11));
      }
   }

   private boolean method_21481(class_5155 var1, int var2, int var3, int var4, int var5, int var6) {
      return var3 >= 0 && var4 >= 0 && var3 < var5 && var4 < var6 ? var1.method_23641(var2, var3, var4) : true;
   }
}
