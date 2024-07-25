package remapped;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GL11;

public class class_6763 {
   private static final Map<Class<? extends Screen>, Class<? extends class_2596>> field_34895 = new HashMap<Class<? extends Screen>, Class<? extends class_2596>>();
   public static final Map<Class<? extends Screen>, String> field_34911 = new HashMap<Class<? extends Screen>, String>();
   private List<Integer> field_34909 = new ArrayList<Integer>();
   private List<Integer> field_34910 = new ArrayList<Integer>();
   private List<Integer> field_34908 = new ArrayList<Integer>();
   private List<Integer> field_34901 = new ArrayList<Integer>();
   private List<Integer> field_34897 = new ArrayList<Integer>();
   public static long field_34907;
   public static long field_34905;
   public static long field_34903;
   public double field_34896;
   public static float field_34898 = 1.0F;
   private boolean field_34912 = true;
   private boolean field_34906 = true;
   private static boolean field_34914 = true;
   private class_2596 field_34904;
   private GLFWKeyCallback field_34902;
   public int[] field_34894 = new int[2];
   private long field_34915;
   private long field_34900;
   public boolean field_34913;

   public class_6763() {
      this.field_34915 = field_34907;
      this.field_34900 = field_34907;
      field_34907 = GLFW.glfwCreateStandardCursor(221185);
      field_34905 = GLFW.glfwCreateStandardCursor(221188);
      field_34903 = GLFW.glfwCreateStandardCursor(221186);
      GLFW.glfwSetCursor(MinecraftClient.getInstance().window.method_43181(), field_34907);
      field_34898 = (float)(MinecraftClient.getInstance().window.method_43198() / MinecraftClient.getInstance().window.method_43163());
   }

   public void method_31006() {
      field_34895.clear();
      field_34895.put(class_1876.class, class_9289.class);
      field_34895.put(class_1046.class, class_4647.class);
   }

   public void method_30992(int var1, int var2) {
      if (var2 == 1 || var2 == 2) {
         this.field_34909.add(var1);
      } else if (var2 == 0) {
         this.field_34910.add(var1);
      }
   }

   public void method_30986(int var1, int var2) {
      this.field_34897.add(var1);
   }

   public void method_31011(double var1, double var3) {
      this.field_34896 += var3;
   }

   public void method_30982(int var1, int var2) {
      if (var2 != 1) {
         if (var2 == 0) {
            this.field_34901.add(var1);
         }
      } else {
         this.field_34908.add(var1);
      }
   }

   public static boolean method_30997(Screen var0) {
      if (var0 instanceof class_4145 && !(var0 instanceof class_9888)) {
         MinecraftClient.getInstance().field_9623 = null;
         MinecraftClient.getInstance().method_8609(new class_9888(((class_4145)var0).field_20176));
         return true;
      } else if (var0 instanceof class_2794 && !(var0 instanceof class_9140)) {
         MinecraftClient.getInstance().field_9623 = null;
         MinecraftClient.getInstance().method_8609(new class_9140());
         return true;
      } else if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30642 && var0 instanceof class_1876 && !(var0 instanceof class_6186)) {
         MinecraftClient.getInstance().field_9623 = null;
         MinecraftClient.getInstance().method_8609(new class_6186());
         return true;
      } else {
         return false;
      }
   }

   public static class_2596 method_30995(Screen var0) {
      if (var0 == null) {
         return null;
      } else if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30640) {
         return new class_3778();
      } else if (method_30997(var0)) {
         return null;
      } else if (!field_34895.containsKey(var0.getClass())) {
         return null;
      } else {
         try {
            return field_34895.get(var0.getClass()).newInstance();
         } catch (InstantiationException var4) {
            var4.printStackTrace();
         } catch (IllegalAccessException var5) {
            var5.printStackTrace();
         }

         return null;
      }
   }

   public void method_30984(long var1) {
      this.field_34915 = var1;
   }

   public void method_31009() {
      if (this.field_34904 != null) {
         this.field_34894[0] = Math.max(
            0, Math.min(MinecraftClient.getInstance().window.method_43166(), (int) MinecraftClient.getInstance().field_9625.method_39835())
         );
         this.field_34894[1] = Math.max(
            0, Math.min(MinecraftClient.getInstance().window.method_43163(), (int) MinecraftClient.getInstance().field_9625.method_39832())
         );

         for (Integer var4 : this.field_34909) {
            this.method_30999(var4);
         }

         for (Integer var9 : this.field_34910) {
            this.method_30985(var9);
         }

         for (Integer var10 : this.field_34908) {
            this.method_31002(this.field_34894[0], this.field_34894[1], var10);
         }

         for (Integer var11 : this.field_34901) {
            this.method_31005(this.field_34894[0], this.field_34894[1], var11);
         }

         for (Integer var12 : this.field_34897) {
            this.method_31003((char)var12.intValue());
         }

         this.field_34909.clear();
         this.field_34910.clear();
         this.field_34908.clear();
         this.field_34901.clear();
         this.field_34897.clear();
         if (this.field_34896 == 0.0) {
            this.field_34913 = false;
         } else {
            this.method_30998((float)this.field_34896);
            this.field_34896 = 0.0;
            this.field_34913 = true;
         }

         if (this.field_34904 != null) {
            this.field_34915 = field_34907;
            this.field_34904.method_32145(this.field_34894[0], this.field_34894[1]);
         }
      }
   }

   public void method_30985(int var1) {
      if (this.field_34904 != null) {
         this.field_34904.method_32110(var1);
      }
   }

   public void method_31003(char var1) {
      if (this.field_34904 != null) {
         this.field_34904.method_29507(var1);
      }
   }

   public void method_30999(int var1) {
      if (this.field_34904 != null) {
         this.field_34904.method_29509(var1);
      }
   }

   public void method_30983() {
      class_2209.field_11030.method_38419();
      if (MinecraftClient.getInstance().field_9601 != null) {
         GL11.glDisable(2896);
         int var3 = 0;
         byte var4 = 0;
         short var5 = 170;
         byte var6 = 95;
         if (MinecraftClient.getInstance().field_9577.field_45470) {
            var3 = MinecraftClient.getInstance().window.method_43166() / 2 - var5 / 2;
         }

         if (SigmaMainClass.method_3328().method_3312() != class_6015.field_30645) {
            float var7 = 0.5F + class_268.field_955.method_11123() * 0.5F;
            GL11.glAlphaFunc(516, 0.1F);
            class_73.method_103(4.0F, 2.0F, 106.0F, 28.0F, class_314.method_1444(class_1255.field_6929.field_6917, 0.6F * var7));
            class_73.method_87(class_3054.field_14991, 9.0F, 2.0F, "Sigma", class_314.method_1444(class_1255.field_6929.field_6917, 0.5F * var7));
            class_73.method_87(
               class_3054.field_14991, 8.0F, 1.0F, "Sigma", class_314.method_1444(class_1255.field_6918.field_6917, Math.min(1.0F, var7 * 1.2F))
            );
            int var8 = Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, 1.0F, 1.0F).getRGB();
            class_73.method_87(class_3054.field_15002, 73.0F, 2.0F, "5.0.0", class_314.method_1444(class_1255.field_6929.field_6917, 0.5F));
            class_73.method_87(class_3054.field_15002, 72.0F, 1.0F, "5.0.0", class_314.method_1444(var8, Math.min(1.0F, var7 * 1.4F)));
         } else {
            GL11.glAlphaFunc(519, 0.0F);
            class_73.method_96((float)var3, (float)var4, 170.0F, 104.0F, !(field_34898 > 1.0F) ? class_2209.field_10995 : class_2209.field_11024);
         }

         SigmaMainClass.method_3328().method_3302().method_7914(new class_3278());
      }

      if (this.field_34904 != null && MinecraftClient.getInstance().field_9610 == null) {
         this.field_34904.method_32178(1.0F);
      }
   }

   public void method_30998(float var1) {
      if (this.field_34904 != null && MinecraftClient.getInstance().field_9610 == null) {
         this.field_34904.method_29510(var1);
      }
   }

   public void method_31002(int var1, int var2, int var3) {
      if (this.field_34904 != null && MinecraftClient.getInstance().field_9610 == null) {
         this.field_34904.method_29508(var1, var2, var3);
      }
   }

   public void method_31005(int var1, int var2, int var3) {
      if (this.field_34904 != null && MinecraftClient.getInstance().field_9610 == null) {
         this.field_34904.method_29505(var1, var2, var3);
      }
   }

   public class_1293 method_31013(class_1293 var1) {
      if (this.field_34904 != null) {
         class_1293 var4 = this.field_34904.method_32180(new class_1293());
         if (var4.method_5806() != 0) {
            var1.method_5820(this.field_34904.method_32176(), var4);
         }
      }

      var1.method_5823("guiBlur", this.field_34912);
      var1.method_5823("hqIngameBlur", this.field_34906);
      var1.method_5823("hidpicocoa", field_34914);
      return var1;
   }

   public void method_30996(boolean var1) {
      this.field_34912 = var1;
   }

   public boolean method_31000() {
      return this.field_34912;
   }

   public void method_30981(boolean var1) {
      this.field_34906 = var1;
   }

   public boolean method_30987() {
      return this.field_34906;
   }

   public void method_30980(boolean var1) {
      field_34914 = var1;
   }

   public boolean method_31004() {
      return field_34914;
   }

   public static void method_30993() {
      MinecraftClient.getInstance();
      if (MinecraftClient.IS_SYSTEM_MAC) {
         try {
            class_1293 var2 = class_357.method_1789(new File(SigmaMainClass.method_3328().method_3334() + "/config.json"));
            if (var2.method_5850("hidpicocoa")) {
               field_34914 = var2.method_5826("hidpicocoa");
            }

            GLFW.glfwWindowHint(143361, field_34914 ? 1 : 0);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   public void method_30994(class_1293 var1) {
      if (this.field_34904 != null) {
         class_1293 var4 = null;

         try {
            var4 = SigmaMainClass.method_3328().method_3304().method_5848(this.field_34904.method_32176());
         } catch (Exception var9) {
            var4 = new class_1293();
         } finally {
            this.field_34904.method_32159(var4);
         }
      }

      if (var1.method_5850("guiBlur")) {
         this.field_34912 = var1.method_5826("guiBlur");
      }

      if (var1.method_5850("hqIngameBlur")) {
         this.field_34906 = var1.method_5826("hqIngameBlur");
      }
   }

   public Class<? extends Screen> method_31007(String var1) {
      for (Entry var5 : field_34911.entrySet()) {
         if (var1.equals(var5.getValue())) {
            return (Class<? extends Screen>)var5.getKey();
         }
      }

      return null;
   }

   public String method_31010(Class<? extends Screen> var1) {
      if (var1 == null) {
         return "";
      } else {
         for (Entry var5 : field_34911.entrySet()) {
            if (var1 == var5.getKey()) {
               return (String)var5.getValue();
            }
         }

         return "";
      }
   }

   public void method_30991() {
      if (this.field_34904 != null) {
         this.method_31013(SigmaMainClass.method_3328().method_3304());

         try {
            this.field_34904 = (class_2596)this.field_34904.getClass().newInstance();
         } catch (IllegalAccessException | InstantiationException var4) {
            var4.printStackTrace();
         }

         this.method_30994(SigmaMainClass.method_3328().method_3304());
      }

      if (MinecraftClient.getInstance().window.method_43166() != 0 && MinecraftClient.getInstance().window.method_43163() != 0) {
         field_34898 = (float)Math.max(
            MinecraftClient.getInstance().window.method_43178() / MinecraftClient.getInstance().window.method_43166(),
            MinecraftClient.getInstance().window.method_43198() / MinecraftClient.getInstance().window.method_43163()
         );
      }

      class_73.method_104(MinecraftClient.getInstance().window.method_43166(), MinecraftClient.getInstance().window.method_43163());
   }

   public class_2596 method_31001() {
      return this.field_34904;
   }

   public void method_30988() {
      this.method_30990(method_30995(MinecraftClient.getInstance().field_9623));
   }

   public void method_30990(class_2596 var1) {
      if (this.field_34904 != null) {
         this.method_31013(SigmaMainClass.method_3328().method_3304());
      }

      this.field_34904 = var1;
      this.field_34900 = field_34907;
      this.method_30994(SigmaMainClass.method_3328().method_3304());
      if (this.field_34904 != null) {
         this.field_34904.method_32145(this.field_34894[0], this.field_34894[1]);
      }

      if (SigmaMainClass.method_3328().method_3298() != null) {
         SigmaMainClass.method_3328().method_3298().method_835().method_384(null);
      }
   }

   public void method_30989(Screen var1) {
      if (var1 != null) {
         MinecraftClient.getInstance().field_9623 = null;
         MinecraftClient.getInstance().method_8609(var1);
      }
   }

   public boolean method_31008(Screen var1) {
      return field_34895.containsKey(var1.getClass());
   }

   static {
      field_34895.put(class_1876.class, ExitScreenMenu.class);
      field_34895.put(class_1046.class, class_734.class);
      field_34895.put(class_9743.class, class_8441.class);
      field_34895.put(class_1786.class, class_2315.class);
      field_34895.put(class_5658.class, class_9047.class);
      field_34895.put(class_6633.class, class_6432.class);
      field_34895.put(class_4710.class, class_1643.class);
      field_34895.put(class_786.class, class_6196.class);
      field_34911.put(class_1046.class, "Click GUI");
      field_34911.put(class_9743.class, "Keybind Manager");
      field_34911.put(class_1786.class, "Jello Maps");
      field_34911.put(class_5658.class, "Snake");
      field_34911.put(class_6633.class, "Spotlight");
   }
}
