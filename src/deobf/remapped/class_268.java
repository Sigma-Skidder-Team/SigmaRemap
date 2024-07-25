package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_268 extends Module {
   public static final class_2440 field_955 = new class_2440(200, 200, class_4043.field_19618);
   public class_2440 field_957 = new class_2440(500, 0, class_4043.field_19618);
   private class_2440 field_956 = new class_2440(300, 300, class_4043.field_19618);
   private List<class_5664> field_958 = new ArrayList<class_5664>();
   private int field_959 = 0;
   private static List<class_3622> field_960 = new ArrayList<class_3622>();

   public class_268() {
      super(class_5664.field_28708, "TabGUI", "Manage mods without opening the ClickGUI");
   }

   @Override
   public void method_42012() {
      this.field_958.add(class_5664.field_28714);
      this.field_958.add(class_5664.field_28710);
      this.field_958.add(class_5664.field_28716);
      this.field_958.add(class_5664.field_28709);
      this.field_958.add(class_5664.field_28718);
      this.field_958.add(class_5664.field_28711);
      ArrayList var3 = new ArrayList();

      for (class_5664 var5 : this.field_958) {
         var3.add(var5.method_25628());
      }

      field_960.add(0, new class_2990(var3, 0));
   }

   @class_9148
   private void method_1204(class_6435 var1) {
      if (this.method_42015()) {
         class_8404 var4 = method_1209(var1.method_29384());
         if (var4 != null) {
            field_955.method_11119(class_4043.field_19620);
            this.field_959 = 80;
            int var5 = this.method_1199();
            class_3622 var6 = field_960.get(var5 - 1);
            if (var4 != class_8404.field_42997 && (!this.method_1201() && var4 != class_8404.field_42995 || var5 != 3)) {
               this.field_957 = new class_2440(500, 200, class_4043.field_19618);
            }

            switch (var4) {
               case field_42998:
                  if (var5 == 3 && this.method_1201()) {
                     this.method_1203(false);
                  } else if (var5 > 1) {
                     if (field_960.get(field_960.size() - 1).method_16868()) {
                        field_960.remove(field_960.size() - 1);
                     }

                     var6.method_16876();
                  }
                  break;
               case field_42994:
                  if (var5 == 3 && this.method_1201()) {
                     this.method_1198(true);
                  } else if (var6 instanceof class_2990) {
                     class_2990 var14 = (class_2990)var6;
                     var14.method_13686();
                  }
                  break;
               case field_42993:
                  if (var5 == 3 && this.method_1201()) {
                     this.method_1198(false);
                  } else if (var6 instanceof class_2990) {
                     class_2990 var13 = (class_2990)var6;
                     var13.method_13688();
                  }
                  break;
               case field_42995:
                  if (var5 == 1) {
                     class_2990 var11 = (class_2990)var6;
                     this.method_1200(this.field_958.get(var11.field_14700));
                  } else if (var5 == 2 && var6 instanceof class_2990) {
                     class_2990 var12 = (class_2990)field_960.get(0);
                     class_2990 var15 = (class_2990)var6;
                     class_5664 var16 = this.field_958.get(var12.field_14700);
                     Module var17 = SigmaMainClass.method_3328().method_3298().method_844(var16).get(var15.field_14700);
                     this.method_1205(var17);
                  } else if (var5 == 3) {
                     this.method_1203(true);
                  }
                  break;
               case field_42997:
                  if (var5 == 2 && var6 instanceof class_2990) {
                     class_2990 var7 = (class_2990)field_960.get(0);
                     class_2990 var8 = (class_2990)var6;
                     class_5664 var9 = this.field_958.get(var7.field_14700);
                     Module var10 = SigmaMainClass.method_3328().method_3298().method_844(var9).get(var8.field_14700);
                     var10.method_41991(!var10.method_42015());
                  }
            }
         }
      }
   }

   private void method_1198(boolean var1) {
      class_2990 var4 = (class_2990)field_960.get(0);
      class_2990 var5 = (class_2990)field_960.get(1);
      class_2990 var6 = (class_2990)field_960.get(2);
      class_5664 var7 = this.field_958.get(var4.field_14700);
      Module var8 = SigmaMainClass.method_3328().method_3298().method_844(var7).get(var5.field_14700);
      Setting var9 = this.method_1206(var8).get(var6.field_14700);
      if (!(var9 instanceof ModeSetting)) {
         if (!(var9 instanceof BooleanSetting)) {
            if (var9 instanceof FloatSetting) {
               FloatSetting var10 = (FloatSetting)var9;
               Object var11 = var10.method_23031();
               if (var11 instanceof Float) {
                  Float var12 = (Float)var10.method_23031();
                  if (var1) {
                     var12 = var12 - var10.method_12382();
                  } else {
                     var12 = var12 + var10.method_12382();
                  }

                  var12 = Math.min(Math.max(var12, var10.method_12385()), var10.method_12387());
                  var10.method_23037(var12);
               }
            }
         } else {
            BooleanSetting var13 = (BooleanSetting)var9;
            var13.method_23037(Boolean.valueOf(!var13.method_39398()));
         }
      } else {
         ModeSetting var14 = (ModeSetting)var9;
         int var15 = var14.method_12858();
         if (!var1) {
            var15--;
         } else {
            var15++;
         }

         if (var15 > var14.method_12860().size() - 1) {
            var15 = 0;
         }

         if (var15 < 0) {
            var15 = var14.method_12860().size() - 1;
         }

         var14.method_12859(var15);
      }

      var6.method_13684(this.method_1207(var8));
   }

   @class_9148
   private void method_1197(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_959 <= 0) {
            field_955.method_11119(class_4043.field_19618);
            this.field_957.method_11119(class_4043.field_19618);
         } else {
            this.field_959--;
         }
      }
   }

   @class_9148
   @class_5355
   private void method_1196(class_3278 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!MinecraftClient.getInstance().field_9577.field_45470) {
            if (!MinecraftClient.getInstance().field_9577.field_45567) {
               this.method_1208();

               for (class_3622 var5 : field_960) {
                  var5.method_16877((float)(0.5 + (double)field_955.method_11123() * 0.5));
               }

               this.method_1210((float)(0.5 + (double)field_955.method_11123() * 0.5));
               class_73.method_103(12.0F, 30.0F, 90.0F, 1.0F, class_1255.field_6918.field_6917);
            }
         }
      }
   }

   private void method_1208() {
      if (field_960.size() >= 2) {
         class_2990 var3 = (class_2990)field_960.get(1);
         class_2990 var4 = (class_2990)field_960.get(0);
         class_5664 var5 = this.field_958.get(var4.field_14700);
         int var6 = 0;

         for (Module var8 : SigmaMainClass.method_3328().method_3298().method_844(var5)) {
            var3.method_13685(var6++, (!var8.method_42015() ? "§7" : "") + var8.method_41987());
         }
      }
   }

   private void method_1210(float var1) {
      int var4 = this.method_1199();
      if (var4 == 2 || var4 == 3) {
         class_2990 var5 = (class_2990)field_960.get(0);
         class_2990 var6 = (class_2990)field_960.get(1);
         class_2990 var7 = var4 != 3 ? null : (class_2990)field_960.get(2);
         class_2990 var8 = var6;
         if (var7 != null) {
            var8 = var7;
         }

         if (var8.method_13683() && field_955.method_11128() == class_4043.field_19620) {
            if (this.method_1199() == field_960.size()) {
               this.field_957.method_11119(class_4043.field_19620);
            } else if (field_960.get(field_960.size() - 1).method_16869()) {
               this.field_957.method_11119(class_4043.field_19620);
            }
         }

         class_5664 var9 = this.field_958.get(var5.field_14700);
         Module var10 = SigmaMainClass.method_3328().method_3298().method_844(var9).get(var6.field_14700);
         String var11 = var10.method_42001();
         if (var4 == 3) {
            Setting var12 = this.method_1206(var10).get(var7.field_14700);
            var11 = var12.method_23033();
         }

         float var17 = class_3483.method_15985(this.field_956.method_11123(), 0.0F, 1.0F, 1.0F) * field_955.method_11123();
         if (this.field_956.method_11128() == class_4043.field_19618) {
            var17 = class_3483.method_15984(this.field_956.method_11123(), 0.0F, 1.0F, 1.0F);
         }

         class_73.method_152(
            (float)var8.method_16873() + (float)var8.method_16874() + 14.0F * var17,
            (float)var8.method_16871() + 16.0F + (float)(25 * var8.field_14700),
            24.0F * var17,
            class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.6F),
            class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.6F)
         );
         int var13 = var8.method_16873() + var8.method_16874() + 4 + Math.round(var17 * 28.0F);
         int var14 = var8.method_16871() + 25 * var8.field_14700 + 4;
         int var15 = var8.field_17671.method_18547(var11) + 8;
         float var16 = class_3483.method_15985(this.field_957.method_11123(), 0.0F, 1.0F, 1.0F);
         class_73.method_103((float)var13, (float)var14, (float)var15 * var16, 25.0F, class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.6F));
         class_73.method_135((float)var13, (float)var14, (float)var15 * var16, 25.0F);
         class_73.method_87(
            var8.field_17671,
            (float)(var13 + 4),
            (float)(var14 + 2),
            var11,
            class_314.method_1444(class_1255.field_6918.field_6917, Math.min(1.0F, var1 * 1.7F))
         );
         class_73.method_141();
      }
   }

   public static class_8404 method_1209(int var0) {
      switch (var0) {
         case 257:
            return class_8404.field_42997;
         case 258:
         case 259:
         case 260:
         case 261:
         default:
            return null;
         case 262:
            return class_8404.field_42995;
         case 263:
            return class_8404.field_42998;
         case 264:
            return class_8404.field_42994;
         case 265:
            return class_8404.field_42993;
      }
   }

   public static int method_1195(int var0) {
      int var3 = 0;

      for (int var4 = 0; var4 < var0; var4++) {
         var3 += field_960.get(var4).method_16874();
      }

      return 4 + var3 + 5 * var0;
   }

   public void method_1200(class_5664 var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : SigmaMainClass.method_3328().method_3298().method_844(var1)) {
         var4.add(var6.method_41987());
      }

      this.method_1202(1);
      field_960.add(1, new class_2990(var4, 1));
   }

   public void method_1205(Module var1) {
      List var4 = this.method_1207(var1);
      if (var4.size() != 0) {
         this.method_1202(2);
         field_960.add(2, new class_2990(var4, 2));
      }
   }

   public void method_1202(int var1) {
      Iterator var4 = field_960.iterator();

      while (var4.hasNext()) {
         if (((class_3622)var4.next()).field_17666 >= var1) {
            var4.remove();
         }
      }
   }

   @Override
   public void method_42020() {
      field_955.method_11119(class_4043.field_19618);
      this.field_959 = 0;
   }

   @Override
   public void method_42006() {
      field_955.method_11119(class_4043.field_19620);
      this.field_959 = 40;
   }

   public List<String> method_1207(Module var1) {
      ArrayList var4 = new ArrayList();

      for (Setting var6 : this.method_1206(var1)) {
         var4.add(var6.method_23032() + " " + var6.method_23031());
      }

      return var4;
   }

   public List<Setting> method_1206(Module var1) {
      ArrayList var4 = new ArrayList<Setting>(var1.method_41996().values());
      if (var1 instanceof class_3620) {
         class_3620 var5 = (class_3620)var1;
         var5.method_16866();
         if (var5.method_16864() != null) {
            var4.addAll(var5.method_16864().method_41996().values());
         }
      }

      Iterator var7 = var4.iterator();

      while (var7.hasNext()) {
         Setting var6 = (Setting)var7.next();
         if (var6.method_23032().equals("Keybind")) {
            var7.remove();
         }
      }

      return var4;
   }

   private int method_1199() {
      class_3622 var3 = field_960.get(field_960.size() - 1);
      int var4 = field_960.size();
      if (var3.method_16868()) {
         var4--;
      }

      return var4;
   }

   private void method_1203(boolean var1) {
      this.field_956.method_11119(!var1 ? class_4043.field_19618 : class_4043.field_19620);
   }

   private boolean method_1201() {
      return this.field_956.method_11128() == class_4043.field_19620;
   }
}
