package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import net.minecraft.util.text.event.HoverEvent$class_49;
import net.minecraft.util.text.event.HoverEvent$class_50;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_266 extends class_2198 implements class_1200, class_1463 {
   private static final Logger field_944 = LogManager.getLogger();
   private static final Set<String> field_946 = Sets.newHashSet(new String[]{"http", "https"});
   public final ITextComponent field_947;
   public final List<class_5888> field_942 = Lists.newArrayList();
   public MinecraftClient field_943;
   public class_8765 field_945;
   public int field_941;
   public int field_940;
   public final List<class_7114> field_950 = Lists.newArrayList();
   public boolean field_951;
   public class_9854 field_948;
   private URI field_949;

   public class_266(ITextComponent var1) {
      this.field_947 = var1;
   }

   public ITextComponent method_1168() {
      return this.field_947;
   }

   public String method_1165() {
      return this.method_1168().getString();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      for (int var7 = 0; var7 < this.field_950.size(); var7++) {
         this.field_950.get(var7).method_6767(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 == 256 && this.method_1178()) {
         this.method_1156();
         return true;
      } else if (var1 != 258) {
         return super.method_26946(var1, var2, var3);
      } else {
         boolean var6 = !method_1190();
         if (!this.method_26942(var6)) {
            this.method_26942(var6);
         }

         return false;
      }
   }

   public boolean method_1178() {
      return true;
   }

   public void method_1156() {
      this.field_943.method_8609((class_266)null);
   }

   public <T extends class_7114> T method_1186(T var1) {
      this.field_950.add(var1);
      return this.<T>method_1159((T)var1);
   }

   public <T extends class_5888> T method_1159(T var1) {
      this.field_942.add(var1);
      return (T)var1;
   }

   public void method_1177(class_7966 var1, class_6098 var2, int var3, int var4) {
      this.method_1160(var1, this.method_1179(var2), var3, var4);
   }

   public List<ITextComponent> method_1179(class_6098 var1) {
      return var1.method_28012(this.field_943.field_9632, !this.field_943.field_9577.field_45482 ? class_2575.field_12746 : class_2575.field_12747);
   }

   public void method_1176(class_7966 var1, ITextComponent var2, int var3, int var4) {
      this.method_1175(var1, Arrays.asList(var2.func_241878_f()), var3, var4);
   }

   public void method_1160(class_7966 var1, List<ITextComponent> var2, int var3, int var4) {
      this.method_1175(var1, Lists.transform(var2, ITextComponent::func_241878_f), var3, var4);
   }

   public void method_1175(class_7966 var1, List<? extends class_7107> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         int var7 = 0;

         for (class_7107 var9 : var2) {
            int var10 = this.field_948.method_45400(var9);
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

         if (var21 + var7 > this.field_941) {
            var21 -= 28 + var7;
         }

         if (var22 + var23 + 6 > this.field_940) {
            var22 = this.field_940 - var23 - 6;
         }

         var1.method_36063();
         short var14 = 400;
         class_8042 var15 = class_8042.method_36499();
         class_9633 var16 = var15.method_36501();
         var16.method_44471(7, class_7985.field_40903);
         class_8107 var17 = var1.method_36058().method_28620();
         method_9773(var17, var16, var21 - 3, var22 - 4, var21 + var7 + 3, var22 - 3, 400, -267386864, -267386864);
         method_9773(var17, var16, var21 - 3, var22 + var23 + 3, var21 + var7 + 3, var22 + var23 + 4, 400, -267386864, -267386864);
         method_9773(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method_9773(var17, var16, var21 - 4, var22 - 3, var21 - 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method_9773(var17, var16, var21 + var7 + 3, var22 - 3, var21 + var7 + 4, var22 + var23 + 3, 400, -267386864, -267386864);
         method_9773(var17, var16, var21 - 3, var22 - 3 + 1, var21 - 3 + 1, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method_9773(var17, var16, var21 + var7 + 2, var22 - 3 + 1, var21 + var7 + 3, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method_9773(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 - 3 + 1, 400, 1347420415, 1347420415);
         method_9773(var17, var16, var21 - 3, var22 + var23 + 2, var21 + var7 + 3, var22 + var23 + 3, 400, 1344798847, 1344798847);
         class_3542.method_16428();
         class_3542.method_16354();
         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16486(7425);
         var16.method_44487();
         class_138.method_554(var16);
         class_3542.method_16486(7424);
         class_3542.method_16448();
         class_3542.method_16432();
         class_3758 var18 = class_2565.method_11648(class_8042.method_36499().method_36501());
         var1.method_36065(0.0, 0.0, 400.0);

         for (int var19 = 0; var19 < var2.size(); var19++) {
            class_7107 var20 = (class_7107)var2.get(var19);
            if (var20 != null) {
               this.field_948.method_45376(var20, (float)var21, (float)var22, -1, true, var17, var18, false, 0, 15728880);
            }

            if (var19 == 0) {
               var22 += 2;
            }

            var22 += 10;
         }

         var18.method_17415();
         var1.method_36064();
      }
   }

   public void method_1180(class_7966 var1, Style var2, int var3, int var4) {
      if (var2 != null && var2.getHoverEvent() != null) {
         HoverEvent var7 = var2.getHoverEvent();
         HoverEvent$class_50 var8 = var7.<HoverEvent$class_50>getParameter(HoverEvent$class_48.SHOW_ITEM);
         if (var8 == null) {
            HoverEvent$class_49 var9 = var7.<HoverEvent$class_49>getParameter(HoverEvent$class_48.SHOW_ENTITY);
            if (var9 == null) {
               ITextComponent var10 = var7.<ITextComponent>getParameter(HoverEvent$class_48.SHOW_TEXT);
               if (var10 != null) {
                  this.method_1175(var1, this.field_943.field_9668.method_45391(var10, Math.max(this.field_941 / 2, 200)), var3, var4);
               }
            } else if (this.field_943.field_9577.field_45482) {
               this.method_1160(var1, var9.getTooltip(), var3, var4);
            }
         } else {
            this.method_1177(var1, var8.createStack(), var3, var4);
         }
      }
   }

   public void method_1157(String var1, boolean var2) {
   }

   public boolean method_1187(Style var1) {
      if (var1 == null) {
         return false;
      } else {
         ClickEvent var4 = var1.getClickEvent();
         if (method_1190()) {
            if (var1.getInsertion() != null) {
               this.method_1157(var1.getInsertion(), false);
            }
         } else if (var4 != null) {
            if (var4.getAction() == ClickEvent$class_47.OPEN_URL) {
               if (!this.field_943.field_9577.field_45442) {
                  return false;
               }

               try {
                  URI var5 = new URI(var4.getValue());
                  String var6 = var5.getScheme();
                  if (var6 == null) {
                     throw new URISyntaxException(var4.getValue(), "Missing protocol");
                  }

                  if (!field_946.contains(var6.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException(var4.getValue(), "Unsupported protocol: " + var6.toLowerCase(Locale.ROOT));
                  }

                  if (this.field_943.field_9577.field_45458) {
                     this.field_949 = var5;
                     this.field_943.method_8609(new class_260(this::method_1158, var4.getValue(), false));
                  } else {
                     this.method_1167(var5);
                  }
               } catch (URISyntaxException var7) {
                  field_944.error("Can't open url for {}", var4, var7);
               }
            } else if (var4.getAction() == ClickEvent$class_47.OPEN_FILE) {
               URI var8 = new File(var4.getValue()).toURI();
               this.method_1167(var8);
            } else if (var4.getAction() == ClickEvent$class_47.SUGGEST_COMMAND) {
               this.method_1157(var4.getValue(), true);
            } else if (var4.getAction() == ClickEvent$class_47.RUN_COMMAND) {
               this.method_1172(var4.getValue(), false);
            } else if (var4.getAction() == ClickEvent$class_47.COPY_TO_CLIPBOARD) {
               this.field_943.field_9600.method_38891(var4.getValue());
            } else {
               field_944.error("Don't know how to handle {}", var4);
            }

            return true;
         }

         return false;
      }
   }

   public void method_1171(String var1) {
      this.method_1172(var1, true);
   }

   public void method_1172(String var1, boolean var2) {
      if (var2) {
         this.field_943.field_9614.method_13991().method_18697(var1);
      }

      this.field_943.field_9632.method_27307(var1);
   }

   public void method_1164(MinecraftClient var1, int var2, int var3) {
      this.field_943 = var1;
      this.field_945 = var1.method_8511();
      this.field_948 = var1.field_9668;
      this.field_941 = var2;
      this.field_940 = var3;
      this.field_950.clear();
      this.field_942.clear();
      this.method_41180((class_5888)null);
      this.method_1163();
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return this.field_942;
   }

   public void method_1163() {
   }

   @Override
   public void method_5312() {
   }

   public void method_1162() {
   }

   public void method_1183(class_7966 var1) {
      this.method_1184(var1, 0);
   }

   public void method_1184(class_7966 var1, int var2) {
      if (this.field_943.field_9601 == null) {
         this.method_1170(var2);
      } else {
         this.method_9772(var1, 0, 0, this.field_941, this.field_940, -1072689136, -804253680);
      }
   }

   public void method_1170(int var1) {
      class_8042 var4 = class_8042.method_36499();
      class_9633 var5 = var4.method_36501();
      this.field_943.method_8577().method_35674(field_10505);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.method_44471(7, class_7985.field_40905);
      var5.method_35761(0.0, (double)this.field_940, 0.0)
         .method_35745(0.0F, (float)this.field_940 / 32.0F + (float)var1)
         .method_35743(64, 64, 64, 255)
         .method_35735();
      var5.method_35761((double)this.field_941, (double)this.field_940, 0.0)
         .method_35745((float)this.field_941 / 32.0F, (float)this.field_940 / 32.0F + (float)var1)
         .method_35743(64, 64, 64, 255)
         .method_35735();
      var5.method_35761((double)this.field_941, 0.0, 0.0).method_35745((float)this.field_941 / 32.0F, (float)var1).method_35743(64, 64, 64, 255).method_35735();
      var5.method_35761(0.0, 0.0, 0.0).method_35745(0.0F, (float)var1).method_35743(64, 64, 64, 255).method_35735();
      var4.method_36500();
   }

   public boolean method_1161() {
      return true;
   }

   private void method_1158(boolean var1) {
      if (var1) {
         this.method_1167(this.field_949);
      }

      this.field_949 = null;
      this.field_943.method_8609(this);
   }

   private void method_1167(URI var1) {
      class_9665.method_44667().method_37582(var1);
   }

   public static boolean method_1185() {
      return !MinecraftClient.field_9574
         ? class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 341)
            || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 345)
         : class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 343)
            || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 347);
   }

   public static boolean method_1190() {
      return class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 340)
         || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 344);
   }

   public static boolean method_1169() {
      return class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 342)
         || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 346);
   }

   public static boolean method_1166(int var0) {
      return var0 == 88 && method_1185() && !method_1190() && !method_1169();
   }

   public static boolean method_1173(int var0) {
      return var0 == 86 && method_1185() && !method_1190() && !method_1169();
   }

   public static boolean method_1182(int var0) {
      return var0 == 67 && method_1185() && !method_1190() && !method_1169();
   }

   public static boolean method_1174(int var0) {
      return var0 == 65 && method_1185() && !method_1190() && !method_1169();
   }

   public void method_1191(MinecraftClient var1, int var2, int var3) {
      this.method_1164(var1, var2, var3);
   }

   public static void method_1181(Runnable var0, String var1, String var2) {
      try {
         var0.run();
      } catch (Throwable var8) {
         class_159 var6 = class_159.method_643(var8, var1);
         class_6544 var7 = var6.method_639("Affected screen");
         var7.method_29851("Screen name", () -> var2);
         throw new class_3297(var6);
      }
   }

   public boolean method_1188(String var1, char var2, int var3) {
      int var6 = var1.indexOf(58);
      int var7 = var1.indexOf(47);
      if (var2 != ':') {
         return var2 == '/' ? var3 > var6 : var2 == '_' || var2 == '-' || var2 >= 'a' && var2 <= 'z' || var2 >= '0' && var2 <= '9' || var2 == '.';
      } else {
         return (var7 == -1 || var3 <= var7) && var6 == -1;
      }
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return true;
   }

   public void method_1189(List<Path> var1) {
   }
}
