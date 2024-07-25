package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6107 extends Screen {
   private static final Logger field_31237 = LogManager.getLogger();
   private static final List<class_382> field_31244 = Lists.newArrayList();
   private final class_9675 field_31240;
   private ITextComponent field_31242;
   private ITextComponent field_31245;
   private class_7367 field_31239;
   private class_9521 field_31243;
   private class_1863 field_31236;
   private class_9512 field_31238;

   public class_6107(class_9675 var1) {
      super(new TranslationTextComponent("createWorld.customize.presets.title"));
      this.field_31240 = var1;
   }

   @Nullable
   private static class_8764 method_28055(String var0, int var1) {
      String[] var4 = var0.split("\\*", 2);
      int var5;
      if (var4.length == 2) {
         try {
            var5 = Math.max(Integer.parseInt(var4[0]), 0);
         } catch (NumberFormatException var12) {
            field_31237.error("Error while parsing flat world string => {}", var12.getMessage());
            return null;
         }
      } else {
         var5 = 1;
      }

      int var6 = Math.min(var1 + var5, 256);
      int var7 = var6 - var1;
      String var8 = var4[var4.length - 1];

      class_6414 var9;
      try {
         var9 = class_8669.field_44462.method_39794(new Identifier(var8)).orElse((class_6414)null);
      } catch (Exception var11) {
         field_31237.error("Error while parsing flat world string => {}", var11.getMessage());
         return null;
      }

      if (var9 == null) {
         field_31237.error("Error while parsing flat world string => Unknown block, {}", var8);
         return null;
      } else {
         class_8764 var10 = new class_8764(var7, var9);
         var10.method_40253(var1);
         return var10;
      }
   }

   private static List<class_8764> method_28063(String var0) {
      ArrayList var3 = Lists.newArrayList();
      String[] var4 = var0.split(",");
      int var5 = 0;

      for (String var9 : var4) {
         class_8764 var10 = method_28055(var9, var5);
         if (var10 == null) {
            return Collections.<class_8764>emptyList();
         }

         var3.add(var10);
         var5 += var10.method_40252();
      }

      return var3;
   }

   public static class_9512 method_28062(class_8669<class_6325> var0, String var1, class_9512 var2) {
      Iterator var5 = Splitter.on(';').split(var1).iterator();
      if (!var5.hasNext()) {
         return class_9512.method_43900(var0);
      } else {
         List var6 = method_28063((String)var5.next());
         if (var6.isEmpty()) {
            return class_9512.method_43900(var0);
         } else {
            class_9512 var7 = var2.method_43895(var6, var2.method_43898());
            class_5621 var8 = class_8606.field_44136;
            if (var5.hasNext()) {
               try {
                  Identifier var9 = new Identifier((String)var5.next());
                  var8 = class_5621.<class_6325>method_25497(class_8669.field_44359, var9);
                  var0.method_39802(var8).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + var9));
               } catch (Exception var10) {
                  field_31237.error("Error while parsing flat world string => {}", var10.getMessage());
               }
            }

            class_5621 var11 = var8;
            var7.method_43899(() -> (class_6325)var0.method_39807(var11));
            return var7;
         }
      }
   }

   private static String method_28057(class_8669<class_6325> var0, class_9512 var1) {
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1.method_43905().size(); var5++) {
         if (var5 > 0) {
            var4.append(",");
         }

         var4.append(var1.method_43905().get(var5));
      }

      var4.append(";");
      var4.append(var0.method_39797(var1.method_43893()));
      return var4.toString();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_31242 = new TranslationTextComponent("createWorld.customize.presets.share");
      this.field_31245 = new TranslationTextComponent("createWorld.customize.presets.list");
      this.field_31236 = new class_1863(this.field_948, 50, 40, this.field_941 - 100, 20, this.field_31242);
      this.field_31236.method_8255(1230);
      class_6433 var3 = this.field_31240.field_49281.field_33523.method_3062().<class_6325>method_28813(class_8669.field_44359);
      this.field_31236.method_8281(method_28057(var3, this.field_31240.method_44746()));
      this.field_31238 = this.field_31240.method_44746();
      this.field_942.add(this.field_31236);
      this.field_31239 = new class_7367(this);
      this.field_942.add(this.field_31239);
      this.field_31243 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155, this.field_940 - 28, 150, 20, new TranslationTextComponent("createWorld.customize.presets.select"), var2 -> {
            class_9512 var5 = method_28062(var3, this.field_31236.method_8246(), this.field_31238);
            this.field_31240.method_44748(var5);
            this.field_943.method_8609(this.field_31240);
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, this.field_940 - 28, 150, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_31240))
      );
      this.method_28054(this.field_31239.method_36226() != null);
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      return this.field_31239.method_26945(var1, var3, var5);
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_31236.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_31236.method_8281(var6);
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_31240);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_31239.method_6767(var1, var2, var3, var4);
      RenderSystem.method_16438();
      RenderSystem.translatef(0.0F, 0.0F, 400.0F);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      method_9771(var1, this.field_948, this.field_31242, 50, 30, 10526880);
      method_9771(var1, this.field_948, this.field_31245, 50, 70, 10526880);
      RenderSystem.method_16489();
      this.field_31236.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public void method_5312() {
      this.field_31236.method_8279();
      super.method_5312();
   }

   public void method_28054(boolean var1) {
      this.field_31243.field_36675 = var1 || this.field_31236.method_8246().length() > 1;
   }

   private static void method_28061(
      ITextComponent var0, class_8525 var1, class_5621<class_6325> var2, List<class_5390<?>> var3, boolean var4, boolean var5, boolean var6, class_8764... var7
   ) {
      field_31244.add(new class_382(var1.method_10803(), var0, var6x -> {
         HashMap var9 = Maps.newHashMap();

         for (class_5390 var11 : var3) {
            var9.put(var11, class_9610.field_48975.get(var11));
         }

         class_9610 var13 = new class_9610(!var4 ? Optional.<class_7655>empty() : Optional.<class_7655>of(class_9610.field_48972), var9);
         class_9512 var14 = new class_9512(var13, var6x);
         if (var5) {
            var14.method_43894();
         }

         if (var6) {
            var14.method_43904();
         }

         for (int var12 = var7.length - 1; var12 >= 0; var12--) {
            var14.method_43905().add(var7[var12]);
         }

         var14.method_43899(() -> (class_6325)var6x.method_39807(var2));
         var14.method_43901();
         return var14.method_43897(var13);
      }));
   }

   static {
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.classic_flat"),
         class_4783.field_23259,
         class_8606.field_44136,
         Arrays.<class_5390<?>>asList(class_5390.field_27516),
         false,
         false,
         false,
         new class_8764(1, class_4783.field_23259),
         new class_8764(2, class_4783.field_23592),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.tunnelers_dream"),
         class_4783.field_23644,
         class_8606.field_44074,
         Arrays.<class_5390<?>>asList(class_5390.field_27498),
         true,
         true,
         false,
         new class_8764(1, class_4783.field_23259),
         new class_8764(5, class_4783.field_23592),
         new class_8764(230, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.water_world"),
         class_4897.field_24999,
         class_8606.field_44084,
         Arrays.<class_5390<?>>asList(class_5390.field_27495, class_5390.field_27508, class_5390.field_27509),
         false,
         false,
         false,
         new class_8764(90, class_4783.field_23900),
         new class_8764(5, class_4783.field_23216),
         new class_8764(5, class_4783.field_23592),
         new class_8764(5, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.overworld"),
         class_4783.field_23868,
         class_8606.field_44136,
         Arrays.<class_5390<?>>asList(class_5390.field_27516, class_5390.field_27498, class_5390.field_27518, class_5390.field_27512),
         true,
         true,
         true,
         new class_8764(1, class_4783.field_23259),
         new class_8764(3, class_4783.field_23592),
         new class_8764(59, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.snowy_kingdom"),
         class_4783.field_23552,
         class_8606.field_44142,
         Arrays.<class_5390<?>>asList(class_5390.field_27516, class_5390.field_27519),
         false,
         false,
         false,
         new class_8764(1, class_4783.field_23552),
         new class_8764(1, class_4783.field_23259),
         new class_8764(3, class_4783.field_23592),
         new class_8764(59, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.bottomless_pit"),
         class_4897.field_24922,
         class_8606.field_44136,
         Arrays.<class_5390<?>>asList(class_5390.field_27516),
         false,
         false,
         false,
         new class_8764(1, class_4783.field_23259),
         new class_8764(3, class_4783.field_23592),
         new class_8764(2, class_4783.field_23808)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.desert"),
         class_4783.field_23216,
         class_8606.field_44094,
         Arrays.<class_5390<?>>asList(class_5390.field_27516, class_5390.field_27506, class_5390.field_27498),
         true,
         true,
         false,
         new class_8764(8, class_4783.field_23216),
         new class_8764(52, class_4783.field_23459),
         new class_8764(3, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.redstone_ready"),
         class_4897.field_24791,
         class_8606.field_44094,
         Collections.<class_5390<?>>emptyList(),
         false,
         false,
         false,
         new class_8764(52, class_4783.field_23459),
         new class_8764(3, class_4783.field_23644),
         new class_8764(1, class_4783.field_23433)
      );
      method_28061(
         new TranslationTextComponent("createWorld.customize.preset.the_void"),
         class_4783.field_23207,
         class_8606.field_44126,
         Collections.<class_5390<?>>emptyList(),
         false,
         true,
         false,
         new class_8764(1, class_4783.field_23184)
      );
   }
}
