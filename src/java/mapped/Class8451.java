package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Class8451 {
   public static final List<String> field36258 = Lists.newArrayList("layer0", "layer1", "layer2", "layer3", "layer4");

   public Class7496 method29717(Function<Class7826, TextureAtlasSprite> var1, Class7496 var2) {
      HashMap var5 = Maps.newHashMap();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < field36258.size(); var7++) {
         String var8 = field36258.get(var7);
         if (!var2.method24435(var8)) {
            break;
         }

         Class7826 var9 = var2.method24436(var8);
         var5.put(var8, Either.left(var9));
         TextureAtlasSprite var10 = (TextureAtlasSprite)var1.apply(var9);
         var6.addAll(this.method29718(var7, var8, var10));
      }

      var5.put("particle", !var2.method24435("particle") ? (Either)var5.get("layer0") : Either.left(var2.method24436("particle")));
      Class7496 var11 = new Class7496((ResourceLocation)null, var6, var5, false, var2.method24430(), var2.method24440(), var2.method24431());
      var11.field32207 = var2.field32207;
      return var11;
   }

   private List<Class9726> method29718(int var1, String var2, TextureAtlasSprite var3) {
      HashMap var6 = Maps.newHashMap();
      var6.put(Direction.SOUTH, new Class9163((Direction)null, var1, var2, new Class9840(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var6.put(Direction.NORTH, new Class9163((Direction)null, var1, var2, new Class9840(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      ArrayList var7 = Lists.newArrayList();
      var7.add(new Class9726(new Class7680(0.0F, 0.0F, 7.5F), new Class7680(16.0F, 16.0F, 8.5F), var6, (Class7360)null, true));
      var7.addAll(this.method29719(var3, var2, var1));
      return var7;
   }

   private List<Class9726> method29719(TextureAtlasSprite var1, String var2, int var3) {
      float var6 = (float)var1.method7457();
      float var7 = (float)var1.method7458();
      ArrayList var8 = Lists.newArrayList();

      for (Class3635 var10 : this.method29720(var1)) {
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
         float var21 = (float)var10.method12342();
         float var22 = (float)var10.method12343();
         float var23 = (float)var10.method12344();
         Class2032 var24 = var10.method12341();
         switch (Class9649.field45116[var24.ordinal()]) {
            case 1:
               var15 = var21;
               var11 = var21;
               var13 = var16 = var22 + 1.0F;
               var17 = var23;
               var12 = var23;
               var14 = var23;
               var18 = var23 + 1.0F;
               break;
            case 2:
               var17 = var23;
               var18 = var23 + 1.0F;
               var15 = var21;
               var11 = var21;
               var13 = var16 = var22 + 1.0F;
               var12 = var23 + 1.0F;
               var14 = var23 + 1.0F;
               break;
            case 3:
               var15 = var23;
               var11 = var23;
               var13 = var23;
               var16 = var23 + 1.0F;
               var18 = var21;
               var12 = var21;
               var14 = var17 = var22 + 1.0F;
               break;
            case 4:
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
         var25.put(var24.method8667(), new Class9163((Direction)null, var3, var2, new Class9840(new float[]{var15, var17, var16, var18}, 0)));
         switch (Class9649.field45116[var24.ordinal()]) {
            case 1:
               var8.add(new Class9726(new Class7680(var11, var12, 7.5F), new Class7680(var13, var12, 8.5F), var25, (Class7360)null, true));
               break;
            case 2:
               var8.add(new Class9726(new Class7680(var11, var14, 7.5F), new Class7680(var13, var14, 8.5F), var25, (Class7360)null, true));
               break;
            case 3:
               var8.add(new Class9726(new Class7680(var11, var12, 7.5F), new Class7680(var11, var14, 8.5F), var25, (Class7360)null, true));
               break;
            case 4:
               var8.add(new Class9726(new Class7680(var13, var12, 7.5F), new Class7680(var13, var14, 8.5F), var25, (Class7360)null, true));
         }
      }

      return var8;
   }

   private List<Class3635> method29720(TextureAtlasSprite var1) {
      int var4 = var1.method7457();
      int var5 = var1.method7458();
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.method7467(); var7++) {
         for (int var8 = 0; var8 < var5; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               boolean var10 = !this.method29723(var1, var7, var9, var8, var4, var5);
               this.method29721(Class2032.field13190, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method29721(Class2032.field13191, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method29721(Class2032.field13192, var6, var1, var7, var9, var8, var4, var5, var10);
               this.method29721(Class2032.field13193, var6, var1, var7, var9, var8, var4, var5, var10);
            }
         }
      }

      return var6;
   }

   private void method29721(Class2032 var1, List<Class3635> var2, TextureAtlasSprite var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      boolean var12 = this.method29723(var3, var4, var5 + var1.method8668(), var6 + var1.method8669(), var7, var8) && var9;
      if (var12) {
         this.method29722(var2, var1, var5, var6);
      }
   }

   private void method29722(List<Class3635> var1, Class2032 var2, int var3, int var4) {
      Class3635 var7 = null;

      for (Class3635 var9 : var1) {
         if (var9.method12341() == var2) {
            int var10 = !Class2032.method8671(var2) ? var3 : var4;
            if (var9.method12344() == var10) {
               var7 = var9;
               break;
            }
         }
      }

      int var11 = !Class2032.method8671(var2) ? var3 : var4;
      int var12 = !Class2032.method8671(var2) ? var4 : var3;
      if (var7 != null) {
         var7.method12340(var12);
      } else {
         var1.add(new Class3635(var2, var12, var11));
      }
   }

   private boolean method29723(TextureAtlasSprite var1, int var2, int var3, int var4, int var5, int var6) {
      return var3 >= 0 && var4 >= 0 && var3 < var5 && var4 < var6 ? var1.method7468(var2, var3, var4) : true;
   }
}
