package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
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

public class Class811 extends RealmsScreen {
   private static final Logger field4339 = LogManager.getLogger();
   private static final ITextComponent field4340 = new TranslationTextComponent("selectWorld.world");
   private static final ITextComponent field4341 = new TranslationTextComponent("selectWorld.conversion");
   private static final ITextComponent field4342 = new TranslationTextComponent("mco.upload.hardcore").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field4343 = new TranslationTextComponent("selectWorld.cheats");
   private static final DateFormat field4344 = new SimpleDateFormat();
   private final RealmsResetWorldScreen field4345;
   private final long field4346;
   private final int field4347;
   private Button field4348;
   private List<Class2024> field4349 = Lists.newArrayList();
   private int field4350 = -1;
   private Class1288 field4351;
   private RealmsLabel field4352;
   private RealmsLabel field4353;
   private RealmsLabel field4354;
   private final Runnable field4355;

   public Class811(long var1, int var3, RealmsResetWorldScreen var4, Runnable var5) {
      this.field4345 = var4;
      this.field4346 = var1;
      this.field4347 = var3;
      this.field4355 = var5;
   }

   private void method2211() throws Exception {
      this.field4349 = this.mc.getSaveLoader().method38458().stream().sorted((var0, var1) -> {
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
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4351 = new Class1288(this);

      try {
         this.method2211();
      } catch (Exception var4) {
         field4339.error("Couldn't load level list", var4);
         this.mc
            .displayGuiScreen(new Class821(new StringTextComponent("Unable to load worlds"), ITextComponent.func_244388_a(var4.getMessage()), this.field4345));
         return;
      }

      this.<Class1288>addListener(this.field4351);
      this.field4348 = this.<Button>addButton(
         new Button(
            this.width / 2 - 154, this.height - 32, 153, 20, new TranslationTextComponent("mco.upload.button.name"), var1 -> this.method2212()
         )
      );
      this.field4348.active = this.field4350 >= 0 && this.field4350 < this.field4349.size();
      this.<Button>addButton(
         new Button(this.width / 2 + 6, this.height - 32, 153, 20, DialogTexts.field30663, var1 -> this.mc.displayGuiScreen(this.field4345))
      );
      this.field4352 = this.<RealmsLabel>addListener(
         new RealmsLabel(new TranslationTextComponent("mco.upload.select.world.title"), this.width / 2, 13, 16777215)
      );
      this.field4353 = this.<RealmsLabel>addListener(
         new RealmsLabel(new TranslationTextComponent("mco.upload.select.world.subtitle"), this.width / 2, method1929(-1), 10526880)
      );
      if (this.field4349.isEmpty()) {
         this.field4354 = this.<RealmsLabel>addListener(
            new RealmsLabel(new TranslationTextComponent("mco.upload.select.world.none"), this.width / 2, this.height / 2 - 20, 16777215)
         );
      } else {
         this.field4354 = null;
      }

      this.func_231411_u_();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method2212() {
      if (this.field4350 != -1 && !this.field4349.get(this.field4350).method8649()) {
         Class2024 var3 = this.field4349.get(this.field4350);
         this.mc.displayGuiScreen(new Class822(this.field4346, this.field4347, this.field4345, var3, this.field4355));
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field4351.render(var1, var2, var3, var4);
      this.field4352.func_239560_a_(this, var1);
      this.field4353.func_239560_a_(this, var1);
      if (this.field4354 != null) {
         this.field4354.func_239560_a_(this, var1);
      }

      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4345);
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
   public static FontRenderer method2226(Class811 var0) {
      return var0.fontRenderer;
   }

   // $VF: synthetic method
   public static FontRenderer method2227(Class811 var0) {
      return var0.fontRenderer;
   }

   // $VF: synthetic method
   public static FontRenderer method2228(Class811 var0) {
      return var0.fontRenderer;
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
   public static Button method2231(Class811 var0) {
      return var0.field4348;
   }

   // $VF: synthetic method
   public static int method2232(Class811 var0) {
      return var0.field4350;
   }
}
