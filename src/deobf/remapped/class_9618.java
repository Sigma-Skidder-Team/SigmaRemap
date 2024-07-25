package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_9618 extends class_1859 {
   public class_7038 field_49006;
   public String field_49005;
   public class_8343 field_49007;
   private class_2440 field_49001 = new class_2440(285, 100);
   public boolean field_48999;
   public int field_49003 = 240;
   public int field_49004 = 0;
   private Map<String, String> field_49008;
   private final List<class_8428> field_49002 = new ArrayList<class_8428>();

   public class_9618(class_7038 var1, String var2, boolean var3, String var4, class_8888... var5) {
      super(var1, var2, 0, 0, MinecraftClient.method_8510().field_9602.method_43166(), MinecraftClient.method_8510().field_9602.method_43163(), false);
      this.field_48999 = var3;
      this.field_49005 = var4;
      this.method_32119(false);
      this.method_32187(false);
      this.method_32141();
      class_3004 var8 = null;
      class_3004 var9 = null;

      for (class_8888 var13 : var5) {
         this.field_49004 = this.field_49004 + var13.field_45598 + 10;
      }

      this.field_49004 -= 10;
      this.method_32148(
         this.field_49006 = new class_7038(
            this, "modalContent", (this.field_36278 - this.field_49003) / 2, (this.field_36257 - this.field_49004) / 2, this.field_49003, this.field_49004
         )
      );
      int var17 = 0;
      int var18 = 0;

      for (class_8888 var15 : var5) {
         var17++;
         if (var15.field_45597 != class_2880.field_14098) {
            if (var15.field_45597 != class_2880.field_14102) {
               if (var15.field_45597 != class_2880.field_14103) {
                  if (var15.field_45597 == class_2880.field_14100) {
                     this.field_49006
                        .method_32148(
                           new class_1552(
                              this.field_49006,
                              "Item" + var17,
                              0,
                              var18,
                              this.field_49003,
                              var15.field_45598,
                              new class_590(
                                 class_1255.field_6929.field_6917,
                                 class_1255.field_6929.field_6917,
                                 class_1255.field_6929.field_6917,
                                 class_1255.field_6929.field_6917
                              ),
                              var15.field_45595,
                              class_5320.field_27140
                           )
                        );
                  }
               } else {
                  class_6220 var16;
                  this.field_49006
                     .method_32148(
                        var16 = new class_6220(
                           this.field_49006, "Item" + var17, 0, var18, this.field_49003, var15.field_45598, class_590.field_3421, var15.field_45595
                        )
                     );
                  var16.field_31777 = 4;
                  var16.method_32100((var1x, var2x) -> this.method_44405());
               }
            } else {
               class_3004 var22;
               this.field_49006
                  .method_32148(
                     var22 = new class_3004(
                        this.field_49006, "Item" + var17, 0, var18, this.field_49003, var15.field_45598, class_3004.field_14738, "", var15.field_45595
                     )
                  );
               if (!var15.field_45595.contains("Password")) {
                  if (var15.field_45595.contains("Email")) {
                     var8 = var22;
                  }
               } else {
                  var9 = var22;
                  var22.method_13726(true);
               }
            }
         } else {
            this.field_49006
               .method_32148(
                  new class_1552(
                     this.field_49006,
                     "Item" + var17,
                     0,
                     var18,
                     this.field_49003,
                     var15.field_45598,
                     new class_590(
                        class_1255.field_6920.field_6917, class_1255.field_6920.field_6917, class_1255.field_6920.field_6917, class_1255.field_6920.field_6917
                     ),
                     var15.field_45595,
                     class_5320.field_27152
                  )
               );
         }

         var18 += var15.field_45598 + 10;
      }

      if (var8 != null && var9 != null) {
         class_3004 var20 = var9;
         var8.method_13721(var2x -> {
            String var5x = var2x.method_32165();
            if (var5x != null && var5x.contains(":")) {
               String[] var6 = var5x.split(":");
               if (var6.length <= 2) {
                  if (var6.length > 0) {
                     var2x.method_32186(var6[0].replace("\n", ""));
                     if (var6.length == 2) {
                        var20.method_32186(var6[1].replace("\n", ""));
                     }
                  }
               } else {
                  this.method_44405();
               }
            }
         });
      }
   }

   @Override
   public void method_32119(boolean var1) {
      if (var1) {
         for (class_7038 var5 : this.field_49006.method_32134()) {
            if (var5 instanceof class_3004) {
               ((class_3004)var5).method_32186("");
               ((class_3004)var5).method_13725();
            }
         }
      }

      this.field_49001.method_11119(!var1 ? class_4043.field_19618 : class_4043.field_19620);
      super.method_32119(var1);
   }

   public class_7038 method_44408() {
      return this.field_49006;
   }

   private Map<String, String> method_44410() {
      HashMap var3 = new HashMap();

      for (class_7038 var5 : this.field_49006.method_32134()) {
         class_446 var6 = (class_446)var5;
         if (var6 instanceof class_3004) {
            class_3004 var7 = (class_3004)var6;
            var3.put(var7.method_13728(), var7.method_32165());
         }
      }

      return var3;
   }

   public Map<String, String> method_44412() {
      return this.field_49008;
   }

   public void method_44405() {
      this.field_49008 = this.method_44410();
      this.method_44406(false);
      this.method_8235();
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      super.method_29506(var1, var2, var3);
   }

   public float method_44407(float var1, float var2) {
      return this.field_49001.method_11128() != class_4043.field_19618
         ? (float)(Math.pow(2.0, (double)(-10.0F * var1)) * Math.sin((double)(var1 - var2 / 4.0F) * (Math.PI * 2) / (double)var2) + 1.0)
         : 0.5F + class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F) * 0.5F;
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_49001.method_11123() != 0.0F) {
         int var4 = this.field_49003 + 60;
         int var5 = this.field_49004 + 60;
         byte var6 = 30;
         float var7 = !this.method_32140() ? this.field_49001.method_11123() : Math.min(this.field_49001.method_11123() / 0.25F, 1.0F);
         float var8 = this.method_44407(this.field_49001.method_11123(), 1.0F);
         var4 = (int)((float)var4 * var8);
         var5 = (int)((float)var5 * var8);
         class_73.method_153(
            -5.0F,
            -5.0F,
            (float)(this.method_32109() + 10),
            (float)(this.method_32137() + 10),
            this.field_49007,
            class_314.method_1444(class_1255.field_6918.field_6917, var7)
         );
         class_73.method_94(
            0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6929.field_6917, 0.1F * var7)
         );
         if (var4 > 0) {
            class_73.method_115(
               (this.field_36278 - var4) / 2, (this.field_36257 - var5) / 2, var4, var5, class_314.method_1444(class_1255.field_6918.field_6917, var7)
            );
         }

         super.method_32111(var8, var8);
         super.method_32190();
         super.method_32178(var7);
      } else {
         if (this.method_32098()) {
            this.method_32177(false);
            this.method_32104(false);
            this.method_32141();
         }
      }
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(var1, var2, var3)) {
         int var6 = this.field_49003 + 60;
         int var7 = this.field_49004 + 60;
         if (var1 > (this.field_36278 - var6) / 2
            && var1 < (this.field_36278 - var6) / 2 + var6
            && var2 > (this.field_36257 - var7) / 2
            && var2 < (this.field_36257 - var7) / 2 + var7) {
            return false;
         } else {
            this.method_44406(false);
            return false;
         }
      } else {
         return true;
      }
   }

   public void method_44406(boolean var1) {
      if (var1 && !this.method_32140()) {
         try {
            if (this.field_49007 != null) {
               this.field_49007.method_38413();
            }

            this.field_49007 = class_6568.method_30015(
               "blur", class_7849.method_35508(0, 0, this.method_32109(), this.method_32137(), 5, 10, class_1255.field_6918.field_6917, true)
            );
         } catch (IOException var5) {
            SigmaMainClass.method_3328().method_3326().method_12864(var5.getMessage());
         }
      }

      if (this.method_32140() != var1 && !var1) {
         this.method_44411();
      }

      this.method_32119(var1);
      if (var1) {
         this.method_32104(true);
      }

      this.method_32187(var1);
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_49007 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_49007);
         }
      } finally {
         super.finalize();
      }
   }

   public final void method_44409(class_8428 var1) {
      this.field_49002.add(var1);
   }

   public final void method_44411() {
      for (class_8428 var4 : this.field_49002) {
         var4.method_38790(this);
      }
   }
}
