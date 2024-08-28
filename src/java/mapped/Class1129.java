package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1129 extends Screen {
   private static final AbstractOption[] field6173 = new AbstractOption[]{AbstractOption.field25323};
   private final Screen field6174;
   private final Class9574 field6175;
   private Class1206 field6176;
   private Class1226 field6177;
   private Class2197 field6178;

   public Class1129(Screen var1, Class9574 var2) {
      super(new TranslationTextComponent("options.title"));
      this.field6174 = var1;
      this.field6175 = var2;
   }

   @Override
   public void method1921() {
      int var3 = 0;

      for (AbstractOption var7 : field6173) {
         int var8 = this.field4564 / 2 - 155 + var3 % 2 * 160;
         int var9 = this.field4565 / 6 - 12 + 24 * (var3 >> 1);
         this.<Class1197>method2455(var7.method17946(this.field4562.gameSettings, var8, var9, 150));
         var3++;
      }

      if (this.field4562.world == null) {
         this.<Class1228>method2455(
            new Class1228(
               this.field4564 / 2 - 155 + var3 % 2 * 160,
               this.field4565 / 6 - 12 + 24 * (var3 >> 1),
               150,
               20,
               AbstractOption.field25362,
               AbstractOption.field25362.method18081(this.field6175),
               var1 -> {
                  AbstractOption.field25362.method18078(this.field6175);
                  this.field6175.method37146();
                  var1.method5743(AbstractOption.field25362.method18081(this.field6175));
               }
            )
         );
      } else {
         this.field6178 = this.field4562.world.method6997();
         this.field6176 = this.<Class1206>method2455(
            new Class1206(
               this.field4564 / 2 - 155 + var3 % 2 * 160, this.field4565 / 6 - 12 + 24 * (var3 >> 1), 150, 20, this.method5431(this.field6178), var1 -> {
                  this.field6178 = Class2197.method8907(this.field6178.method8905() + 1);
                  this.field4562.getClientPlayNetHandler().sendPacket(new Class5517(this.field6178));
                  this.field6176.method5743(this.method5431(this.field6178));
               }
            )
         );
         if (this.field4562.method1530() && !this.field4562.world.getWorldInfo().isHardcore()) {
            this.field6176.method5741(this.field6176.method5740() - 20);
            this.field6177 = this.<Class1226>method2455(
               new Class1226(
                  this.field6176.field6477 + this.field6176.method5740(),
                  this.field6176.field6478,
                  var1 -> this.field4562
                        .displayGuiScreen(
                           new Class829(
                              this::method5432,
                              new TranslationTextComponent("difficulty.lock.title"),
                              new TranslationTextComponent(
                                 "difficulty.lock.question",
                                 new TranslationTextComponent("options.difficulty." + this.field4562.world.getWorldInfo().method20047().method8909())
                              )
                           )
                        )
               )
            );
            this.field6177.method5808(this.field4562.world.getWorldInfo().method20048());
            this.field6177.field6482 = !this.field6177.method5807();
            this.field6176.field6482 = !this.field6177.method5807();
         } else {
            this.field6176.field6482 = false;
         }
      }

      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.skinCustomisation"),
            var1 -> this.field4562.displayGuiScreen(new Class1139(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 5,
            this.field4565 / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.sounds"),
            var1 -> this.field4562.displayGuiScreen(new Class1137(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.video"),
            var1 -> this.field4562.displayGuiScreen(new Class843(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 5,
            this.field4565 / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.controls"),
            var1 -> this.field4562.displayGuiScreen(new Class1138(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.language"),
            var1 -> this.field4562.displayGuiScreen(new Class1136(this, this.field6175, this.field4562.method1541()))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 5,
            this.field4565 / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.chat.title"),
            var1 -> this.field4562.displayGuiScreen(new Class1141(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.resourcepack"),
            var1 -> this.field4562
                  .displayGuiScreen(
                     new Class1336(
                        this, this.field4562.method1538(), this::method5430, this.field4562.method1540(), new TranslationTextComponent("resourcePack.title")
                     )
                  )
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 5,
            this.field4565 / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.accessibility.title"),
            var1 -> this.field4562.displayGuiScreen(new Class1142(this, this.field6175))
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 / 6 + 168, 200, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(this.field6174))
      );
   }

   private void method5430(Class313 var1) {
      ImmutableList var4 = ImmutableList.copyOf(this.field6175.field44580);
      this.field6175.field44580.clear();
      this.field6175.field44581.clear();

      for (Class1810 var6 : var1.method1270()) {
         if (!var6.method7953()) {
            this.field6175.field44580.add(var6.method7951());
            if (!var6.method7949().method8720()) {
               this.field6175.field44581.add(var6.method7951());
            }
         }
      }

      this.field6175.method37146();
      ImmutableList var7 = ImmutableList.copyOf(this.field6175.field44580);
      if (!var7.equals(var4)) {
         this.field4562.reloadResources();
      }
   }

   private ITextComponent method5431(Class2197 var1) {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(var1.method8906());
   }

   private void method5432(boolean var1) {
      this.field4562.displayGuiScreen(this);
      if (var1 && this.field4562.world != null) {
         this.field4562.getClientPlayNetHandler().sendPacket(new Class5494(true));
         this.field6177.method5808(true);
         this.field6177.field6482 = false;
         this.field6176.field6482 = false;
      }
   }

   @Override
   public void onClose() {
      this.field6175.method37146();
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
