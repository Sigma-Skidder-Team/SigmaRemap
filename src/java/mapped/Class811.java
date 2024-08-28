package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Class811 extends Class798 {
   private static final Logger field4339 = LogManager.getLogger();
   private static final ITextComponent field4340 = new TranslationTextComponent("selectWorld.world");
   private static final ITextComponent field4341 = new TranslationTextComponent("selectWorld.conversion");
   private static final ITextComponent field4342 = new TranslationTextComponent("mco.upload.hardcore").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field4343 = new TranslationTextComponent("selectWorld.cheats");
   private static final DateFormat field4344 = new SimpleDateFormat();
   private final Class814 field4345;
   private final long field4346;
   private final int field4347;
   private Class1206 field4348;
   private List<Class2024> field4349 = Lists.newArrayList();
   private int field4350 = -1;
   private Class1288 field4351;
   private Class1153 field4352;
   private Class1153 field4353;
   private Class1153 field4354;
   private final Runnable field4355;

   public Class811(long var1, int var3, Class814 var4, Runnable var5) {
      this.field4345 = var4;
      this.field4346 = var1;
      this.field4347 = var3;
      this.field4355 = var5;
   }

   private void method2211() throws Exception {
      this.field4349 = this.field4562.getSaveLoader().method38458().stream().sorted((var0, var1) -> {
         if (var0.method8647() >= var1.method8647()) {
            return var0.method8647() <= var1.method8647() ? var0.method8643().compareTo(var1.method8643()) : -1;
         } else {
            return 1;
         }
      }).collect(Collectors.<Class2024>toList());

      for (Class2024 var4 : this.field4349) {
         this.field4351.method6113(var4);
      }
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4351 = new Class1288(this);

      try {
         this.method2211();
      } catch (Exception var4) {
         field4339.error("Couldn't load level list", var4);
         this.field4562
            .displayGuiScreen(new Class821(new StringTextComponent("Unable to load worlds"), ITextComponent.func_244388_a(var4.getMessage()), this.field4345));
         return;
      }

      this.<Class1288>method2456(this.field4351);
      this.field4348 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 154, this.field4565 - 32, 153, 20, new TranslationTextComponent("mco.upload.button.name"), var1 -> this.method2212()
         )
      );
      this.field4348.field6482 = this.field4350 >= 0 && this.field4350 < this.field4349.size();
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 6, this.field4565 - 32, 153, 20, Class7127.field30663, var1 -> this.field4562.displayGuiScreen(this.field4345))
      );
      this.field4352 = this.<Class1153>method2456(
         new Class1153(new TranslationTextComponent("mco.upload.select.world.title"), this.field4564 / 2, 13, 16777215)
      );
      this.field4353 = this.<Class1153>method2456(
         new Class1153(new TranslationTextComponent("mco.upload.select.world.subtitle"), this.field4564 / 2, method1929(-1), 10526880)
      );
      if (this.field4349.isEmpty()) {
         this.field4354 = this.<Class1153>method2456(
            new Class1153(new TranslationTextComponent("mco.upload.select.world.none"), this.field4564 / 2, this.field4565 / 2 - 20, 16777215)
         );
      } else {
         this.field4354 = null;
      }

      this.method1930();
   }

   @Override
   public void onClose() {
      this.field4562.field1302.method36347(false);
   }

   private void method2212() {
      if (this.field4350 != -1 && !this.field4349.get(this.field4350).method8649()) {
         Class2024 var3 = this.field4349.get(this.field4350);
         this.field4562.displayGuiScreen(new Class822(this.field4346, this.field4347, this.field4345, var3, this.field4355));
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4351.method1923(var1, var2, var3, var4);
      this.field4352.method5542(this, var1);
      this.field4353.method5542(this, var1);
      if (this.field4354 != null) {
         this.field4354.method5542(this, var1);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4345);
         return true;
      }
   }

   private static ITextComponent method2213(Class2024 var0) {
      return var0.method8648().method8154();
   }

   private static String method2214(Class2024 var0) {
      return field4344.format(new Date(var0.method8647()));
   }

   // $VF: synthetic method
   public static String method2218(Class2024 var0) {
      return method2214(var0);
   }

   // $VF: synthetic method
   public static ITextComponent method2219() {
      return field4341;
   }

   // $VF: synthetic method
   public static ITextComponent method2220() {
      return field4342;
   }

   // $VF: synthetic method
   public static ITextComponent method2221(Class2024 var0) {
      return method2213(var0);
   }

   // $VF: synthetic method
   public static ITextComponent method2222() {
      return field4343;
   }

   // $VF: synthetic method
   public static List method2223(Class811 var0) {
      return var0.field4349;
   }

   // $VF: synthetic method
   public static Class1288 method2224(Class811 var0) {
      return var0.field4351;
   }

   // $VF: synthetic method
   public static ITextComponent method2225() {
      return field4340;
   }

   // $VF: synthetic method
   public static Class9834 method2226(Class811 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method2227(Class811 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method2228(Class811 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static int method2229(int var0) {
      return method1929(var0);
   }

   // $VF: synthetic method
   public static int method2230(Class811 var0, int var1) {
      return var0.field4350 = var1;
   }

   // $VF: synthetic method
   public static Class1206 method2231(Class811 var0) {
      return var0.field4348;
   }

   // $VF: synthetic method
   public static int method2232(Class811 var0) {
      return var0.field4350;
   }
}
