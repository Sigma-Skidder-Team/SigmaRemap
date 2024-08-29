package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.StringTextComponent;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Class842 extends Class838 {
   public Screen field4642;
   private Class9046 field4643 = new Class9046(this, new Class7550());
   private int field4644 = -1;
   private Class1299 field4645;
   private boolean field4646 = false;
   private static float[] field4647 = new float[]{0.5F, 0.6F, 0.6666667F, 0.75F, 0.8333333F, 0.9F, 1.0F, 1.1666666F, 1.3333334F, 1.5F, 1.6666666F, 1.8F, 2.0F};
   private static String[] field4648 = new String[]{"0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x"};
   private static float field4649 = 1.0F;
   private static float[] field4650 = new float[]{0.0625F, 0.125F, 0.25F};
   private static String[] field4651 = new String[]{"0.5x", "1x", "2x"};
   private static float field4652 = 0.125F;
   public static final int field4653 = 0;
   public static final int field4654 = 1;
   public static final int field4655 = 2;
   public static final int field4656 = 3;
   public static final int field4657 = 4;

   public Class842(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.shadersTitle")));
      this.field4642 = var1;
   }

   @Override
   public void method1921() {
      if (Shaders.field40855 == null) {
         Shaders.method32948();
      }

      byte var3 = 120;
      byte var4 = 20;
      int var5 = this.field4564 - var3 - 10;
      byte var6 = 30;
      byte var7 = 20;
      int var8 = this.field4564 - var3 - 20;
      this.field4645 = new Class1299(this, var8, this.field4565, var6, this.field4565 - 50, 16);
      this.field4561.add(this.field4645);
      this.<Class1215>method2455(new Class1215(Class2160.field14148, var5, 0 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14149, var5, 1 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14150, var5, 2 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14151, var5, 3 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14152, var5, 4 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14153, var5, 5 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14155, var5, 6 * var7 + var6, var3, var4));
      this.<Class1215>method2455(new Class1215(Class2160.field14156, var5, 7 * var7 + var6, var3, var4));
      int var9 = Math.min(150, var8 / 2 - 10);
      int var10 = var8 / 4 - var9 / 2;
      int var11 = this.field4565 - 25;
      this.<Class1210>method2455(new Class1210(201, var10, var11, var9 - 22 + 1, var4, Class8043.method27619("of.options.shaders.shadersFolder")));
      this.<Class1212>method2455(new Class1212(210, var10 + var9 - 22 - 1, var11));
      this.<Class1210>method2455(new Class1210(202, var8 / 4 * 3 - var9 / 2, this.field4565 - 25, var9, var4, I18n.format("gui.done")));
      this.<Class1210>method2455(new Class1210(203, var5, this.field4565 - 25, var3, var4, Class8043.method27619("of.options.shaders.shaderOptions")));
      this.method5534(this.field4645);
      this.method2569();
   }

   public void method2569() {
      boolean var3 = Class7944.method26921();

      for (Class1197 var5 : this.field4629) {
         if (var5 instanceof Class1210) {
            Class1210 var6 = (Class1210)var5;
            if (var6.field6523 != 201 && var6.field6523 != 202 && var6.field6523 != 210 && var6.field6523 != Class2160.field14148.ordinal()) {
               var6.field6482 = var3;
            }
         }
      }
   }

   @Override
   public void method2563(Class1197 var1) {
      this.method2570(var1, false);
   }

   @Override
   public void method2564(Class1197 var1) {
      this.method2570(var1, true);
   }

   private void method2570(Class1197 var1, boolean var2) {
      if (var1.field6482) {
         if (!(var1 instanceof Class1215)) {
            if (!var2 && var1 instanceof Class1210) {
               Class1210 var5 = (Class1210)var1;
               switch (var5.field6523) {
                  case 201:
                     switch (method2580()) {
                        case 1:
                           String var6 = String.format("cmd.exe /C start \"Open file\" \"%s\"", Shaders.field40892.getAbsolutePath());

                           try {
                              Runtime.getRuntime().exec(var6);
                              return;
                           } catch (IOException var12) {
                              var12.printStackTrace();
                              break;
                           }
                        case 2:
                           try {
                              Runtime.getRuntime().exec(new String[]{"/usr/bin/open", Shaders.field40892.getAbsolutePath()});
                              return;
                           } catch (IOException var11) {
                              var11.printStackTrace();
                           }
                     }

                     boolean var14 = false;

                     try {
                        URI var15 = new File(this.mc.gameDir, "shaderpacks").toURI();
                        Util.getOSType().openURI(var15);
                     } catch (Throwable var10) {
                        var10.printStackTrace();
                        var14 = true;
                     }

                     if (var14) {
                        Class7944.method26810("Opening via system class!");
                        Util.getOSType().method8181("file://" + Shaders.field40892.getAbsolutePath());
                     }
                     break;
                  case 202:
                     Shaders.method32950();
                     this.field4646 = true;
                     this.mc.displayGuiScreen(this.field4642);
                     break;
                  case 203:
                     Class848 var7 = new Class848(this, Class7944.method26928());
                     Class7944.method26860().displayGuiScreen(var7);
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
                        Util.getOSType().openURI(var8);
                     } catch (Throwable var9) {
                        var9.printStackTrace();
                     }
               }
            }
         } else {
            Class1215 var13 = (Class1215)var1;
            switch (Class8072.field34653[var13.method5772().ordinal()]) {
               case 1:
                  Shaders.method33139(!var2);
                  if (method2476()) {
                     Shaders.field40878 = 0;
                  }

                  Shaders.method33033();
                  break;
               case 2:
                  Shaders.field40874 = ! Shaders.field40874;
                  if (method2476()) {
                     Shaders.field40874 = true;
                  }

                  Shaders.method33033();
                  this.mc.scheduleResourcesRefresh();
                  break;
               case 3:
                  Shaders.field40875 = ! Shaders.field40875;
                  if (method2476()) {
                     Shaders.field40875 = true;
                  }

                  Shaders.method33033();
                  this.mc.scheduleResourcesRefresh();
                  break;
               case 4:
                  Shaders.field40865 = this.method2576(Shaders.field40865, field4647, field4649, !var2, method2476());
                  Shaders.method33033();
                  Shaders.method33034();
                  break;
               case 5:
                  Shaders.field40866 = this.method2576(Shaders.field40866, field4647, field4649, !var2, method2476());
                  Shaders.method33033();
                  Shaders.method33035();
                  break;
               case 6:
                  Shaders.field40864 = this.method2576(Shaders.field40864, field4650, field4652, !var2, method2476());
                  Shaders.method33033();
                  break;
               case 7:
                  Shaders.field40877.method27381(!var2);
                  if (method2476()) {
                     Shaders.field40877.method27387();
                  }

                  Shaders.method33033();
                  break;
               case 8:
                  Shaders.field40876.method27381(!var2);
                  if (method2476()) {
                     Shaders.field40876.method27387();
                  }

                  Shaders.method32992();
                  Shaders.method33033();
                  this.mc.scheduleResourcesRefresh();
                  break;
               case 9:
                  Shaders.field40862 = ! Shaders.field40862;
                  break;
               case 10:
                  Shaders.field40863 = ! Shaders.field40863;
                  break;
               case 11:
                  Shaders.field40867 = (Shaders.field40867 + 1) % 3;
                  Shaders.field40868 = Shaders.field40869 = Shaders.field40867;
                  var13.method5766("Tex Min: " + Shaders.field40881[Shaders.field40867]);
                  Class9336.method35339();
                  break;
               case 12:
                  Shaders.field40871 = (Shaders.field40871 + 1) % 2;
                  var13.method5766("Tex_n Mag: " + Shaders.field40882[Shaders.field40871]);
                  Class9336.method35339();
                  break;
               case 13:
                  Shaders.field40872 = (Shaders.field40872 + 1) % 2;
                  var13.method5766("Tex_s Mag: " + Shaders.field40882[Shaders.field40872]);
                  Class9336.method35339();
                  break;
               case 14:
                  Shaders.field40873 = ! Shaders.field40873;
                  var13.method5766("ShadowClipFrustrum: " + method2573(Shaders.field40873));
                  Class9336.method35339();
            }

            var13.method5774();
         }
      }
   }

   @Override
   public void onClose() {
      if (!this.field4646) {
         Shaders.method32950();
         this.field4646 = true;
      }

      super.onClose();
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4645.method1923(var1, var2, var3, var4);
      if (this.field4644 <= 0) {
         this.field4645.method6174();
         this.field4644 += 20;
      }

      method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 15, 16777215);
      String var7 = "OpenGL: " + Shaders.field40596 + ", " + Shaders.field40597 + ", " + Shaders.field40598;
      int var8 = this.field4630.getStringWidth(var7);
      if (var8 >= this.field4564 - 5) {
         drawString(var1, this.field4630, var7, 5, this.field4565 - 40, 8421504);
      } else {
         method5690(var1, this.field4630, var7, this.field4564 / 2, this.field4565 - 40, 8421504);
      }

      super.method1923(var1, var2, var3, var4);
      this.field4643.method33640(var1, var2, var3, this.field4629);
   }

   @Override
   public void tick() {
      super.tick();
      this.field4644--;
   }

   public Minecraft method2571() {
      return this.mc;
   }

   public void method2572(MatrixStack var1, String var2, int var3, int var4, int var5) {
      method5690(var1, this.field4630, var2, var3, var4, var5);
   }

   public static String method2573(boolean var0) {
      String var3 = Class8043.method27622();
      String var4 = Class8043.method27623();
      return !var0 ? var4 : var3;
   }

   public static String method2574(int var0) {
      if (var0 != 2) {
         return var0 != 4 ? Class8043.method27623() : "FXAA 4x";
      } else {
         return "FXAA 2x";
      }
   }

   public static String method2575(float var0, float[] var1, String[] var2) {
      int var5 = method2577(var0, var1);
      return var2[var5];
   }

   private float method2576(float var1, float[] var2, float var3, boolean var4, boolean var5) {
      if (!var5) {
         int var8 = method2577(var1, var2);
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

   public static int method2577(float var0, float[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         float var5 = var1[var4];
         if (var5 >= var0) {
            return var4;
         }
      }

      return var1.length - 1;
   }

   public static String method2578(float var0) {
      return method2575(var0, field4647, field4648);
   }

   public static String method2579(float var0) {
      return method2575(var0, field4650, field4651);
   }

   public static int method2580() {
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
