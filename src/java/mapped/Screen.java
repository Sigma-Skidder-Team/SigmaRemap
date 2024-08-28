package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public abstract class Screen extends Class1150 implements Class1219, Class1190 {
   private static final Logger field4558 = LogManager.getLogger();
   private static final Set<String> field4559 = Sets.newHashSet(new String[]{"http", "https"});
   public final ITextComponent field4560;
   public final List<Class1152> field4561 = Lists.newArrayList();
   public Minecraft field4562;
   public Class216 field4563;
   public int field4564;
   public int field4565;
   public final List<Class1197> field4566 = Lists.newArrayList();
   public boolean field4567;
   public Class9834 field4568;
   private URI field4569;

   public Screen(ITextComponent var1) {
      this.field4560 = var1;
   }

   public ITextComponent method2453() {
      return this.field4560;
   }

   public String method2326() {
      return this.method2453().getString();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      for (int var7 = 0; var7 < this.field4566.size(); var7++) {
         this.field4566.get(var7).method1923(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 == 256 && this.method2454()) {
         this.method1945();
         return true;
      } else if (var1 != 258) {
         return super.method1920(var1, var2, var3);
      } else {
         boolean var6 = !method2476();
         if (!this.method5538(var6)) {
            this.method5538(var6);
         }

         return false;
      }
   }

   public boolean method2454() {
      return true;
   }

   public void method1945() {
      this.field4562.displayGuiScreen((Screen)null);
   }

   public <T extends Class1197> T method2455(T var1) {
      this.field4566.add(var1);
      return this.<T>method2456((T)var1);
   }

   public <T extends Class1152> T method2456(T var1) {
      this.field4561.add(var1);
      return (T)var1;
   }

   public void method2457(Class9332 var1, Class8848 var2, int var3, int var4) {
      this.method2460(var1, this.method2458(var2), var3, var4);
   }

   public List<ITextComponent> method2458(Class8848 var1) {
      return var1.method32153(this.field4562.field1339, !this.field4562.field1299.field44588 ? Class2215.field14480 : Class2215.field14481);
   }

   public void method2459(Class9332 var1, ITextComponent var2, int var3, int var4) {
      this.method2461(var1, Arrays.asList(var2.func_241878_f()), var3, var4);
   }

   public void method2460(Class9332 var1, List<ITextComponent> var2, int var3, int var4) {
      this.method2461(var1, Lists.transform(var2, ITextComponent::func_241878_f), var3, var4);
   }

   public void method2461(Class9332 var1, List<? extends Class9125> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         int var7 = 0;

         for (Class9125 var9 : var2) {
            int var10 = this.field4568.method38822(var9);
            if (var10 > var7) {
               var7 = var10;
            }
         }

         int var21 = var3 + 12;
         int var22 = var4 - 12;
         int var23 = 8;
         if (var2.size() > 1) {
            var23 += 2 + (var2.size() - 1) * 10;
         }

         if (var21 + var7 > this.field4564) {
            var21 -= 28 + var7;
         }

         if (var22 + var23 + 6 > this.field4565) {
            var22 = this.field4565 - var23 - 6;
         }

         var1.method35294();
         short var14 = 400;
         Class9352 var15 = Class9352.method35409();
         Class5425 var16 = var15.method35411();
         var16.method17063(7, Class9337.field43342);
         Class9367 var17 = var1.method35296().method32361();
         method5689(var17, var16, var21 - 3, var22 - 4, var21 + var7 + 3, var22 - 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 + var23 + 3, var21 + var7 + 3, var22 + var23 + 4, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 4, var22 - 3, var21 - 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 + var7 + 3, var22 - 3, var21 + var7 + 4, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 - 3 + 1, var21 - 3 + 1, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method5689(var17, var16, var21 + var7 + 2, var22 - 3 + 1, var21 + var7 + 3, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method5689(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 - 3 + 1, 400, 1347420415, 1347420415);
         method5689(var17, var16, var21 - 3, var22 + var23 + 2, var21 + var7 + 3, var22 + var23 + 3, 400, 1344798847, 1344798847);
         RenderSystem.enableDepthTest();
         RenderSystem.method27862();
         RenderSystem.enableBlend();
         RenderSystem.method27938();
         RenderSystem.method27866(7425);
         var16.method17065();
         Class4395.method13895(var16);
         RenderSystem.method27866(7424);
         RenderSystem.disableBlend();
         RenderSystem.method27861();
         Class7735 var18 = Class7733.method25595(Class9352.method35409().method35411());
         var1.method35291(0.0, 0.0, 400.0);

         for (int var19 = 0; var19 < var2.size(); var19++) {
            Class9125 var20 = (Class9125)var2.get(var19);
            if (var20 != null) {
               this.field4568.method38813(var20, (float)var21, (float)var22, -1, true, var17, var18, false, 0, 15728880);
            }

            if (var19 == 0) {
               var22 += 2;
            }

            var22 += 10;
         }

         var18.method25602();
         var1.method35295();
      }
   }

   public void method2462(Class9332 var1, Style var2, int var3, int var4) {
      if (var2 != null && var2.getHoverEvent() != null) {
         HoverEvent var7 = var2.getHoverEvent();
         HoverEvent$ItemHover var8 = var7.<HoverEvent$ItemHover>getParameter(HoverEvent$Action.SHOW_ITEM);
         if (var8 == null) {
            HoverEvent$EntityHover var9 = var7.<HoverEvent$EntityHover>getParameter(HoverEvent$Action.SHOW_ENTITY);
            if (var9 == null) {
               ITextComponent var10 = var7.<ITextComponent>getParameter(HoverEvent$Action.SHOW_TEXT);
               if (var10 != null) {
                  this.method2461(var1, this.field4562.field1294.method38828(var10, Math.max(this.field4564 / 2, 200)), var3, var4);
               }
            } else if (this.field4562.field1299.field44588) {
               this.method2460(var1, var9.getTooltip(), var3, var4);
            }
         } else {
            this.method2457(var1, var8.createStack(), var3, var4);
         }
      }
   }

   public void method2463(String var1, boolean var2) {
   }

   public boolean method2464(Style var1) {
      if (var1 == null) {
         return false;
      } else {
         ClickEvent var4 = var1.getClickEvent();
         if (method2476()) {
            if (var1.getInsertion() != null) {
               this.method2463(var1.getInsertion(), false);
            }
         } else if (var4 != null) {
            if (var4.getAction() == ClickEvent$Action.OPEN_URL) {
               if (!this.field4562.field1299.field44613) {
                  return false;
               }

               try {
                  URI var5 = new URI(var4.getValue());
                  String var6 = var5.getScheme();
                  if (var6 == null) {
                     throw new URISyntaxException(var4.getValue(), "Missing protocol");
                  }

                  if (!field4559.contains(var6.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException(var4.getValue(), "Unsupported protocol: " + var6.toLowerCase(Locale.ROOT));
                  }

                  if (this.field4562.field1299.field44614) {
                     this.field4569 = var5;
                     this.field4562.displayGuiScreen(new Class830(this::method2473, var4.getValue(), false));
                  } else {
                     this.method2474(var5);
                  }
               } catch (URISyntaxException var7) {
                  field4558.error("Can't open url for {}", var4, var7);
               }
            } else if (var4.getAction() == ClickEvent$Action.OPEN_FILE) {
               URI var8 = new File(var4.getValue()).toURI();
               this.method2474(var8);
            } else if (var4.getAction() == ClickEvent$Action.SUGGEST_COMMAND) {
               this.method2463(var4.getValue(), true);
            } else if (var4.getAction() == ClickEvent$Action.RUN_COMMAND) {
               this.method2466(var4.getValue(), false);
            } else if (var4.getAction() == ClickEvent$Action.COPY_TO_CLIPBOARD) {
               this.field4562.field1302.method36350(var4.getValue());
            } else {
               field4558.error("Don't know how to handle {}", var4);
            }

            return true;
         }

         return false;
      }
   }

   public void method2465(String var1) {
      this.method2466(var1, true);
   }

   public void method2466(String var1, boolean var2) {
      if (var2) {
         this.field4562.field1298.method5989().method5935(var1);
      }

      this.field4562.field1339.method5389(var1);
   }

   public void method2467(Minecraft var1, int var2, int var3) {
      this.field4562 = var1;
      this.field4563 = var1.method1555();
      this.field4568 = var1.field1294;
      this.field4564 = var2;
      this.field4565 = var3;
      this.field4566.clear();
      this.field4561.clear();
      this.method5534((Class1152)null);
      this.method1921();
   }

   @Override
   public List<? extends Class1152> method2468() {
      return this.field4561;
   }

   public void method1921() {
   }

   @Override
   public void method1919() {
   }

   public void method1931() {
   }

   public void method2469(Class9332 var1) {
      this.method2470(var1, 0);
   }

   public void method2470(Class9332 var1, int var2) {
      if (this.field4562.field1338 == null) {
         this.method2471(var2);
      } else {
         this.method5688(var1, 0, 0, this.field4564, this.field4565, -1072689136, -804253680);
      }
   }

   public void method2471(int var1) {
      Class9352 var4 = Class9352.method35409();
      Class5425 var5 = var4.method35411();
      this.field4562.getTextureManager().bindTexture(field6451);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.method17063(7, Class9337.field43346);
      var5.method17025(0.0, (double)this.field4565, 0.0)
         .method17027(0.0F, (float)this.field4565 / 32.0F + (float)var1)
         .method17026(64, 64, 64, 255)
         .method17031();
      var5.method17025((double)this.field4564, (double)this.field4565, 0.0)
         .method17027((float)this.field4564 / 32.0F, (float)this.field4565 / 32.0F + (float)var1)
         .method17026(64, 64, 64, 255)
         .method17031();
      var5.method17025((double)this.field4564, 0.0, 0.0).method17027((float)this.field4564 / 32.0F, (float)var1).method17026(64, 64, 64, 255).method17031();
      var5.method17025(0.0, 0.0, 0.0).method17027(0.0F, (float)var1).method17026(64, 64, 64, 255).method17031();
      var4.method35410();
   }

   public boolean method2472() {
      return true;
   }

   private void method2473(boolean var1) {
      if (var1) {
         this.method2474(this.field4569);
      }

      this.field4569 = null;
      this.field4562.displayGuiScreen(this);
   }

   private void method2474(URI var1) {
      Util.getOSType().method8178(var1);
   }

   public static boolean method2475() {
      return !Minecraft.field1272
         ? Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 341)
            || Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 345)
         : Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 343)
            || Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 347);
   }

   public static boolean method2476() {
      return Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 340)
         || Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 344);
   }

   public static boolean method2477() {
      return Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 342)
         || Class9798.method38639(Minecraft.getInstance().method1580().method8039(), 346);
   }

   public static boolean method2478(int var0) {
      return var0 == 88 && method2475() && !method2476() && !method2477();
   }

   public static boolean method2479(int var0) {
      return var0 == 86 && method2475() && !method2476() && !method2477();
   }

   public static boolean method2480(int var0) {
      return var0 == 67 && method2475() && !method2476() && !method2477();
   }

   public static boolean method2481(int var0) {
      return var0 == 65 && method2475() && !method2476() && !method2477();
   }

   public void method2482(Minecraft var1, int var2, int var3) {
      this.method2467(var1, var2, var3);
   }

   public static void method2483(Runnable var0, String var1, String var2) {
      try {
         var0.run();
      } catch (Throwable var8) {
         Class4526 var6 = Class4526.method14413(var8, var1);
         Class8965 var7 = var6.method14410("Affected screen");
         var7.method32806("Screen name", () -> var2);
         throw new Class2506(var6);
      }
   }

   public boolean method2484(String var1, char var2, int var3) {
      int var6 = var1.indexOf(58);
      int var7 = var1.indexOf(47);
      if (var2 != ':') {
         return var2 == '/' ? var3 > var6 : var2 == '_' || var2 == '-' || var2 >= 'a' && var2 <= 'z' || var2 >= '0' && var2 <= '9' || var2 == '.';
      } else {
         return (var7 == -1 || var3 <= var7) && var6 == -1;
      }
   }

   @Override
   public boolean method2485(double var1, double var3) {
      return true;
   }

   public void method2486(List<Path> var1) {
   }
}
