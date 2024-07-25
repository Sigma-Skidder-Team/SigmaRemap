package remapped;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.util.text.StringTextComponent;

public class class_1789 extends class_4232 {
   public class_266 field_9150;
   private class_6809 field_9143 = new class_6809(this, new class_9657());
   private int field_9152 = -1;
   private class_6244 field_9142;
   private boolean field_9151 = false;
   private static float[] field_9144 = new float[]{0.5F, 0.6F, 0.6666667F, 0.75F, 0.8333333F, 0.9F, 1.0F, 1.1666666F, 1.3333334F, 1.5F, 1.6666666F, 1.8F, 2.0F};
   private static String[] field_9140 = new String[]{"0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x"};
   private static float field_9147 = 1.0F;
   private static float[] field_9141 = new float[]{0.0625F, 0.125F, 0.25F};
   private static String[] field_9139 = new String[]{"0.5x", "1x", "2x"};
   private static float field_9137 = 0.125F;
   public static final int field_9146 = 0;
   public static final int field_9153 = 1;
   public static final int field_9149 = 2;
   public static final int field_9145 = 3;
   public static final int field_9138 = 4;

   public class_1789(class_266 var1, GameOptions var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.shadersTitle")));
      this.field_9150 = var1;
   }

   @Override
   public void method_1163() {
      if (class_6588.field_33950 == null) {
         class_6588.method_30322();
      }

      byte var3 = 120;
      byte var4 = 20;
      int var5 = this.field_941 - var3 - 10;
      byte var6 = 30;
      byte var7 = 20;
      int var8 = this.field_941 - var3 - 20;
      this.field_9142 = new class_6244(this, var8, this.field_940, var6, this.field_940 - 50, 16);
      this.field_942.add(this.field_9142);
      this.<class_6213>method_1186(new class_6213(class_4368.field_21421, var5, 0 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21408, var5, 1 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21419, var5, 2 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21420, var5, 3 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21418, var5, 4 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21407, var5, 5 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21404, var5, 6 * var7 + var6, var3, var4));
      this.<class_6213>method_1186(new class_6213(class_4368.field_21411, var5, 7 * var7 + var6, var3, var4));
      int var9 = Math.min(150, var8 / 2 - 10);
      int var10 = var8 / 4 - var9 / 2;
      int var11 = this.field_940 - 25;
      this.<class_5932>method_1186(new class_5932(201, var10, var11, var9 - 22 + 1, var4, class_3458.method_15912("of.options.shaders.shadersFolder")));
      this.<class_112>method_1186(new class_112(210, var10 + var9 - 22 - 1, var11));
      this.<class_5932>method_1186(new class_5932(202, var8 / 4 * 3 - var9 / 2, this.field_940 - 25, var9, var4, class_6956.method_31803("gui.done")));
      this.<class_5932>method_1186(new class_5932(203, var5, this.field_940 - 25, var3, var4, class_3458.method_15912("of.options.shaders.shaderOptions")));
      this.method_41180(this.field_9142);
      this.method_7965();
   }

   public void method_7965() {
      boolean var3 = class_3111.method_14424();

      for (class_7114 var5 : this.field_20540) {
         if (var5 instanceof class_5932) {
            class_5932 var6 = (class_5932)var5;
            if (var6.field_30159 != 201 && var6.field_30159 != 202 && var6.field_30159 != 210 && var6.field_30159 != class_4368.field_21421.ordinal()) {
               var6.field_36675 = var3;
            }
         }
      }
   }

   @Override
   public void method_19728(class_7114 var1) {
      this.method_7968(var1, false);
   }

   @Override
   public void method_19729(class_7114 var1) {
      this.method_7968(var1, true);
   }

   private void method_7968(class_7114 var1, boolean var2) {
      if (var1.field_36675) {
         if (!(var1 instanceof class_6213)) {
            if (!var2 && var1 instanceof class_5932) {
               class_5932 var5 = (class_5932)var1;
               switch (var5.field_30159) {
                  case 201:
                     switch (method_7974()) {
                        case 1:
                           String var6 = String.format("cmd.exe /C start \"Open file\" \"%s\"", class_6588.field_33909.getAbsolutePath());

                           try {
                              Runtime.getRuntime().exec(var6);
                              return;
                           } catch (IOException var12) {
                              var12.printStackTrace();
                              break;
                           }
                        case 2:
                           try {
                              Runtime.getRuntime().exec(new String[]{"/usr/bin/open", class_6588.field_33909.getAbsolutePath()});
                              return;
                           } catch (IOException var11) {
                              var11.printStackTrace();
                           }
                     }

                     boolean var14 = false;

                     try {
                        URI var15 = new File(this.field_943.runDirectory, "shaderpacks").toURI();
                        Util.getOperatingSystem().method_37582(var15);
                     } catch (Throwable var10) {
                        var10.printStackTrace();
                        var14 = true;
                     }

                     if (var14) {
                        class_3111.method_14277("Opening via system class!");
                        Util.getOperatingSystem().method_37581("file://" + class_6588.field_33909.getAbsolutePath());
                     }
                     break;
                  case 202:
                     class_6588.method_30272();
                     this.field_9151 = true;
                     this.field_943.method_8609(this.field_9150);
                     break;
                  case 203:
                     class_708 var7 = new class_708(this, class_3111.method_14310());
                     class_3111.method_14327().method_8609(var7);
                  case 204:
                  case 205:
                  case 206:
                  case 207:
                  case 208:
                  case 209:
                  default:
                     break;
                  case 210:
                     try {
                        URI var8 = new URI("http://optifine.net/shaderPacks");
                        Util.getOperatingSystem().method_37582(var8);
                     } catch (Throwable var9) {
                        var9.printStackTrace();
                     }
               }
            }
         } else {
            class_6213 var13 = (class_6213)var1;
            switch (var13.method_28415()) {
               case field_21421:
                  class_6588.method_30267(!var2);
                  if (method_1190()) {
                     class_6588.field_33631 = 0;
                  }

                  class_6588.method_30259();
                  break;
               case field_21408:
                  class_6588.field_33603 = !class_6588.field_33603;
                  if (method_1190()) {
                     class_6588.field_33603 = true;
                  }

                  class_6588.method_30259();
                  this.field_943.reloadResourcesConcurrently();
                  break;
               case field_21419:
                  class_6588.field_33634 = !class_6588.field_33634;
                  if (method_1190()) {
                     class_6588.field_33634 = true;
                  }

                  class_6588.method_30259();
                  this.field_943.reloadResourcesConcurrently();
                  break;
               case field_21420:
                  class_6588.field_33825 = this.method_7975(class_6588.field_33825, field_9144, field_9147, !var2, method_1190());
                  class_6588.method_30259();
                  class_6588.method_30229();
                  break;
               case field_21418:
                  class_6588.field_33763 = this.method_7975(class_6588.field_33763, field_9144, field_9147, !var2, method_1190());
                  class_6588.method_30259();
                  class_6588.method_30285();
                  break;
               case field_21407:
                  class_6588.field_33751 = this.method_7975(class_6588.field_33751, field_9141, field_9137, !var2, method_1190());
                  class_6588.method_30259();
                  break;
               case field_21404:
                  class_6588.field_33652.method_28245(!var2);
                  if (method_1190()) {
                     class_6588.field_33652.method_28235();
                  }

                  class_6588.method_30259();
                  break;
               case field_21411:
                  class_6588.field_33723.method_28245(!var2);
                  if (method_1190()) {
                     class_6588.field_33723.method_28235();
                  }

                  class_6588.method_30268();
                  class_6588.method_30259();
                  this.field_943.reloadResourcesConcurrently();
                  break;
               case field_21425:
                  class_6588.field_33794 = !class_6588.field_33794;
                  break;
               case field_21413:
                  class_6588.field_33964 = !class_6588.field_33964;
                  break;
               case field_21416:
                  class_6588.field_33621 = (class_6588.field_33621 + 1) % 3;
                  class_6588.field_33785 = class_6588.field_33611 = class_6588.field_33621;
                  var13.method_27121("Tex Min: " + class_6588.field_33954[class_6588.field_33621]);
                  class_7977.method_36151();
                  break;
               case field_21417:
                  class_6588.field_33922 = (class_6588.field_33922 + 1) % 2;
                  var13.method_27121("Tex_n Mag: " + class_6588.field_33885[class_6588.field_33922]);
                  class_7977.method_36151();
                  break;
               case field_21405:
                  class_6588.field_33750 = (class_6588.field_33750 + 1) % 2;
                  var13.method_27121("Tex_s Mag: " + class_6588.field_33885[class_6588.field_33750]);
                  class_7977.method_36151();
                  break;
               case field_21410:
                  class_6588.field_33962 = !class_6588.field_33962;
                  var13.method_27121("ShadowClipFrustrum: " + method_7966(class_6588.field_33962));
                  class_7977.method_36151();
            }

            var13.method_28417();
         }
      }
   }

   @Override
   public void method_1162() {
      if (!this.field_9151) {
         class_6588.method_30272();
         this.field_9151 = true;
      }

      super.method_1162();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_9142.method_6767(var1, var2, var3, var4);
      if (this.field_9152 <= 0) {
         this.field_9142.method_28514();
         this.field_9152 += 20;
      }

      method_9788(var1, this.field_20538, this.field_947, this.field_941 / 2, 15, 16777215);
      String var7 = "OpenGL: " + class_6588.field_33589 + ", " + class_6588.field_33717 + ", " + class_6588.field_33661;
      int var8 = this.field_20538.method_45395(var7);
      if (var8 >= this.field_941 - 5) {
         method_9770(var1, this.field_20538, var7, 5, this.field_940 - 40, 8421504);
      } else {
         method_9787(var1, this.field_20538, var7, this.field_941 / 2, this.field_940 - 40, 8421504);
      }

      super.method_6767(var1, var2, var3, var4);
      this.field_9143.method_31255(var1, var2, var3, this.field_20540);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_9152--;
   }

   public MinecraftClient method_7969() {
      return this.field_943;
   }

   public void method_7973(class_7966 var1, String var2, int var3, int var4, int var5) {
      method_9787(var1, this.field_20538, var2, var3, var4, var5);
   }

   public static String method_7966(boolean var0) {
      String var3 = class_3458.method_15907();
      String var4 = class_3458.method_15902();
      return !var0 ? var4 : var3;
   }

   public static String method_7970(int var0) {
      if (var0 != 2) {
         return var0 != 4 ? class_3458.method_15902() : "FXAA 4x";
      } else {
         return "FXAA 2x";
      }
   }

   public static String method_7967(float var0, float[] var1, String[] var2) {
      int var5 = method_7972(var0, var1);
      return var2[var5];
   }

   private float method_7975(float var1, float[] var2, float var3, boolean var4, boolean var5) {
      if (!var5) {
         int var8 = method_7972(var1, var2);
         if (!var4) {
            if (--var8 < 0) {
               var8 = var2.length - 1;
            }
         } else if (++var8 >= var2.length) {
            var8 = 0;
         }

         return var2[var8];
      } else {
         return var3;
      }
   }

   public static int method_7972(float var0, float[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         float var5 = var1[var4];
         if (var5 >= var0) {
            return var4;
         }
      }

      return var1.length - 1;
   }

   public static String method_7964(float var0) {
      return method_7967(var0, field_9144, field_9140);
   }

   public static String method_7971(float var0) {
      return method_7967(var0, field_9141, field_9139);
   }

   public static int method_7974() {
      String var2 = System.getProperty("os.name").toLowerCase();
      if (!var2.contains("win")) {
         if (!var2.contains("mac")) {
            if (!var2.contains("solaris")) {
               if (!var2.contains("sunos")) {
                  if (!var2.contains("linux")) {
                     return !var2.contains("unix") ? 0 : 4;
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 3;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }
}
