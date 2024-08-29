package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class819 extends Class798 {
   private static final Logger field4462 = LogManager.getLogger();
   private final Screen field4463;
   private final Class806 field4464;
   private Class6128 field4465;
   private final long field4466;
   private final ITextComponent field4467;
   private final ITextComponent[] field4468 = new ITextComponent[]{
      new TranslationTextComponent("mco.brokenworld.message.line1"), new TranslationTextComponent("mco.brokenworld.message.line2")
   };
   private int field4469;
   private int field4470;
   private final List<Integer> field4471 = Lists.newArrayList();
   private int field4472;

   public Class819(Screen var1, Class806 var2, long var3, boolean var5) {
      this.field4463 = var1;
      this.field4464 = var2;
      this.field4466 = var3;
      this.field4467 = !var5 ? new TranslationTextComponent("mco.brokenworld.title") : new TranslationTextComponent("mco.brokenworld.minigame.title");
   }

   @Override
   public void method1921() {
      this.field4469 = this.field4564 / 2 - 150;
      this.field4470 = this.field4564 / 2 + 190;
      this.<Class1206>method2455(new Class1206(this.field4470 - 80 + 8, method1929(13) - 5, 70, 20, DialogTexts.field30663, var1 -> this.method2336()));
      if (this.field4465 != null) {
         this.method2334();
      } else {
         this.method2337(this.field4466);
      }

      this.field4562.keyboardListener.method36347(true);
      Class9229.method34711(
         Stream.<ITextComponent>concat(Stream.of(this.field4467), Stream.of(this.field4468))
            .<CharSequence>map(ITextComponent::getString)
            .collect(Collectors.joining(" "))
      );
   }

   private void method2334() {
      for (Entry var4 : this.field4465.field27451.entrySet()) {
         int var5 = (Integer)var4.getKey();
         boolean var6 = var5 != this.field4465.field27456 || this.field4465.field27455 == Class2049.field13370;
         Class1206 var7;
         if (!var6) {
            var7 = new Class1206(this.method2335(var5), method1929(8), 80, 20, new TranslationTextComponent("mco.brokenworld.download"), var2 -> {
               TranslationTextComponent var5x = new TranslationTextComponent("mco.configure.world.restore.download.question.line1");
               TranslationTextComponent var6x = new TranslationTextComponent("mco.configure.world.restore.download.question.line2");
               this.field4562.displayGuiScreen(new Class808(var2x -> {
                  if (!var2x) {
                     this.field4562.displayGuiScreen(this);
                  } else {
                     this.method2339(var5);
                  }
               }, Class2134.field13980, var5x, var6x, true));
            });
         } else {
            var7 = new Class1206(
               this.method2335(var5),
               method1929(8),
               80,
               20,
               new TranslationTextComponent("mco.brokenworld.play"),
               var2 -> {
                  if (!this.field4465.field27451.get(var5).field27434) {
                     this.field4562.displayGuiScreen(new Class797(this.field4463, new Class790(this.field4465.field27443, var5, this::method2338)));
                  } else {
                     Class814 var5x = new Class814(
                        this,
                        this.field4465,
                        new TranslationTextComponent("mco.configure.world.switch.slot"),
                        new TranslationTextComponent("mco.configure.world.switch.slot.subtitle"),
                        10526880,
                        DialogTexts.GUI_CANCEL,
                        this::method2338,
                        () -> {
                           this.field4562.displayGuiScreen(this);
                           this.method2338();
                        }
                     );
                     var5x.method2246(var5);
                     var5x.method2247(new TranslationTextComponent("mco.create.world.reset.title"));
                     this.field4562.displayGuiScreen(var5x);
                  }
               }
            );
         }

         if (this.field4471.contains(var5)) {
            var7.field6482 = false;
            var7.method5743(new TranslationTextComponent("mco.brokenworld.downloaded"));
         }

         this.<Class1206>method2455(var7);
         this.<Class1206>method2455(
            new Class1206(this.method2335(var5), method1929(10), 80, 20, new TranslationTextComponent("mco.brokenworld.reset"), var2 -> {
               Class814 var5x = new Class814(this, this.field4465, this::method2338, () -> {
                  this.field4562.displayGuiScreen(this);
                  this.method2338();
               });
               if (var5 != this.field4465.field27456 || this.field4465.field27455 == Class2049.field13370) {
                  var5x.method2246(var5);
               }

               this.field4562.displayGuiScreen(var5x);
            })
         );
      }
   }

   @Override
   public void tick() {
      this.field4472++;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);
      method5691(var1, this.field4568, this.field4467, this.field4564 / 2, 17, 16777215);

      for (int var7 = 0; var7 < this.field4468.length; var7++) {
         method5691(var1, this.field4568, this.field4468[var7], this.field4564 / 2, method1929(-1) + 3 + var7 * 12, 10526880);
      }

      if (this.field4465 != null) {
         for (Entry var8 : this.field4465.field27451.entrySet()) {
            if (((Class6125)var8.getValue()).field27432 != null && ((Class6125)var8.getValue()).field27431 != -1L) {
               this.method2341(
                  var1,
                  this.method2335((Integer)var8.getKey()),
                  method1929(1) + 5,
                  var2,
                  var3,
                  this.field4465.field27456 == (Integer)var8.getKey() && !this.method2340(),
                  ((Class6125)var8.getValue()).method18901((Integer)var8.getKey()),
                  (Integer)var8.getKey(),
                  ((Class6125)var8.getValue()).field27431,
                  ((Class6125)var8.getValue()).field27432,
                  ((Class6125)var8.getValue()).field27434
               );
            } else {
               this.method2341(
                  var1,
                  this.method2335((Integer)var8.getKey()),
                  method1929(1) + 5,
                  var2,
                  var3,
                  this.field4465.field27456 == (Integer)var8.getKey() && !this.method2340(),
                  ((Class6125)var8.getValue()).method18901((Integer)var8.getKey()),
                  (Integer)var8.getKey(),
                  -1L,
                  (String)null,
                  ((Class6125)var8.getValue()).field27434
               );
            }
         }
      }
   }

   private int method2335(int var1) {
      return this.field4469 + (var1 - 1) * 110;
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.method2336();
         return true;
      }
   }

   private void method2336() {
      this.field4562.displayGuiScreen(this.field4463);
   }

   private void method2337(long var1) {
      new Thread(() -> {
         Class4624 var5 = Class4624.method14543();

         try {
            this.field4465 = var5.method14548(var1);
            this.method2334();
         } catch (Class2435 var7) {
            field4462.error("Couldn't get own world");
            this.field4562.displayGuiScreen(new Class821(ITextComponent.func_244388_a(var7.getMessage()), this.field4463));
         }
      }).start();
   }

   public void method2338() {
      new Thread(() -> {
         Class4624 var3 = Class4624.method14543();
         if (this.field4465.field27447 == Class2261.field14706) {
            this.field4562.execute(() -> this.field4562.displayGuiScreen(new Class797(this, new Class794(this.field4465, this, this.field4464, true))));
         } else {
            try {
               this.field4464.method2060().method2046(var3.method14548(this.field4466), this);
            } catch (Class2435 var5) {
               field4462.error("Couldn't get own world");
               this.field4562.execute(() -> this.field4562.displayGuiScreen(this.field4463));
            }
         }
      }).start();
   }

   private void method2339(int var1) {
      Class4624 var4 = Class4624.method14543();

      try {
         Class6120 var5 = var4.method14576(this.field4465.field27443, var1);
         Class812 var6 = new Class812(this, var5, this.field4465.method18921(var1), var2 -> {
            if (!var2) {
               this.field4562.displayGuiScreen(this);
            } else {
               this.field4471.add(var1);
               this.field4561.clear();
               this.method2334();
            }
         });
         this.field4562.displayGuiScreen(var6);
      } catch (Class2435 var7) {
         field4462.error("Couldn't download world data");
         this.field4562.displayGuiScreen(new Class821(var7, this));
      }
   }

   private boolean method2340() {
      return this.field4465 != null && this.field4465.field27455 == Class2049.field13370;
   }

   private void method2341(MatrixStack var1, int var2, int var3, int var4, int var5, boolean var6, String var7, int var8, long var9, String var11, boolean var12) {
      if (!var12) {
         if (var11 != null && var9 != -1L) {
            Class8087.method27972(String.valueOf(var9), var11);
         } else if (var8 != 1) {
            if (var8 != 2) {
               if (var8 != 3) {
                  Class8087.method27972(String.valueOf(this.field4465.field27458), this.field4465.field27459);
               } else {
                  this.field4562.getTextureManager().bindTexture(Class1218.field6539);
               }
            } else {
               this.field4562.getTextureManager().bindTexture(Class1218.field6538);
            }
         } else {
            this.field4562.getTextureManager().bindTexture(Class1218.field6537);
         }
      } else {
         this.field4562.getTextureManager().bindTexture(Class1218.field6536);
      }

      if (var6) {
         if (var6) {
            float var15 = 0.9F + 0.1F * MathHelper.cos((float)this.field4472 * 0.2F);
            RenderSystem.method27889(var15, var15, var15, 1.0F);
         }
      } else {
         RenderSystem.method27889(0.56F, 0.56F, 0.56F, 1.0F);
      }

      Class1193.method5699(var1, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      this.field4562.getTextureManager().bindTexture(Class1218.field6535);
      if (!var6) {
         RenderSystem.method27889(0.56F, 0.56F, 0.56F, 1.0F);
      } else {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      }

      Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 80, 80, 80, 80);
      method5690(var1, this.field4568, var7, var2 + 40, var3 + 66, 16777215);
   }
}
