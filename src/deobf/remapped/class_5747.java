package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5747 extends class_1094 {
   private static final Logger field_29095 = LogManager.getLogger();
   private final class_266 field_29099;
   private final class_7039 field_29100;
   private class_7675 field_29097;
   private final long field_29094;
   private final ITextComponent field_29093;
   private final ITextComponent[] field_29101 = new ITextComponent[]{
      new TranslationTextComponent("mco.brokenworld.message.line1"), new TranslationTextComponent("mco.brokenworld.message.line2")
   };
   private int field_29091;
   private int field_29098;
   private final List<Integer> field_29096 = Lists.newArrayList();
   private int field_29092;

   public class_5747(class_266 var1, class_7039 var2, long var3, boolean var5) {
      this.field_29099 = var1;
      this.field_29100 = var2;
      this.field_29094 = var3;
      this.field_29093 = !var5 ? new TranslationTextComponent("mco.brokenworld.title") : new TranslationTextComponent("mco.brokenworld.minigame.title");
   }

   @Override
   public void method_1163() {
      this.field_29091 = this.field_941 / 2 - 150;
      this.field_29098 = this.field_941 / 2 + 190;
      this.<class_9521>method_1186(new class_9521(this.field_29098 - 80 + 8, method_4819(13) - 5, 70, 20, class_1402.field_7632, var1 -> this.method_26014()));
      if (this.field_29097 != null) {
         this.method_26020();
      } else {
         this.method_26015(this.field_29094);
      }

      this.field_943.field_9600.method_38887(true);
      class_7567.method_34410(
         Stream.<ITextComponent>concat(Stream.of(this.field_29093), Stream.of(this.field_29101))
            .<CharSequence>map(ITextComponent::getString)
            .collect(Collectors.joining(" "))
      );
   }

   private void method_26020() {
      for (Entry var4 : this.field_29097.field_39013.entrySet()) {
         int var5 = (Integer)var4.getKey();
         boolean var6 = var5 != this.field_29097.field_39007 || this.field_29097.field_39015 == class_8840.field_45209;
         class_9521 var7;
         if (!var6) {
            var7 = new class_9521(this.method_26017(var5), method_4819(8), 80, 20, new TranslationTextComponent("mco.brokenworld.download"), var2 -> {
               TranslationTextComponent var5x = new TranslationTextComponent("mco.configure.world.restore.download.question.line1");
               TranslationTextComponent var6x = new TranslationTextComponent("mco.configure.world.restore.download.question.line2");
               this.field_943.method_8609(new class_2238(var2x -> {
                  if (!var2x) {
                     this.field_943.method_8609(this);
                  } else {
                     this.method_26019(var5);
                  }
               }, class_1542.field_8150, var5x, var6x, true));
            });
         } else {
            var7 = new class_9521(
               this.method_26017(var5),
               method_4819(8),
               80,
               20,
               new TranslationTextComponent("mco.brokenworld.play"),
               var2 -> {
                  if (!this.field_29097.field_39013.get(var5).field_34933) {
                     this.field_943.method_8609(new class_1065(this.field_29099, new class_9007(this.field_29097.field_39016, var5, this::method_26016)));
                  } else {
                     class_5824 var5x = new class_5824(
                        this,
                        this.field_29097,
                        new TranslationTextComponent("mco.configure.world.switch.slot"),
                        new TranslationTextComponent("mco.configure.world.switch.slot.subtitle"),
                        10526880,
                        class_1402.field_7633,
                        this::method_26016,
                        () -> {
                           this.field_943.method_8609(this);
                           this.method_26016();
                        }
                     );
                     var5x.method_26369(var5);
                     var5x.method_26362(new TranslationTextComponent("mco.create.world.reset.title"));
                     this.field_943.method_8609(var5x);
                  }
               }
            );
         }

         if (this.field_29096.contains(var5)) {
            var7.field_36675 = false;
            var7.method_32687(new TranslationTextComponent("mco.brokenworld.downloaded"));
         }

         this.<class_9521>method_1186(var7);
         this.<class_9521>method_1186(
            new class_9521(this.method_26017(var5), method_4819(10), 80, 20, new TranslationTextComponent("mco.brokenworld.reset"), var2 -> {
               class_5824 var5x = new class_5824(this, this.field_29097, this::method_26016, () -> {
                  this.field_943.method_8609(this);
                  this.method_26016();
               });
               if (var5 != this.field_29097.field_39007 || this.field_29097.field_39015 == class_8840.field_45209) {
                  var5x.method_26369(var5);
               }

               this.field_943.method_8609(var5x);
            })
         );
      }
   }

   @Override
   public void method_5312() {
      this.field_29092++;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_29093, this.field_941 / 2, 17, 16777215);

      for (int var7 = 0; var7 < this.field_29101.length; var7++) {
         method_9788(var1, this.field_948, this.field_29101[var7], this.field_941 / 2, method_4819(-1) + 3 + var7 * 12, 10526880);
      }

      if (this.field_29097 != null) {
         for (Entry var8 : this.field_29097.field_39013.entrySet()) {
            if (((class_6768)var8.getValue()).field_34926 != null && ((class_6768)var8.getValue()).field_34928 != -1L) {
               this.method_26021(
                  var1,
                  this.method_26017((Integer)var8.getKey()),
                  method_4819(1) + 5,
                  var2,
                  var3,
                  this.field_29097.field_39007 == (Integer)var8.getKey() && !this.method_26018(),
                  ((class_6768)var8.getValue()).method_31027((Integer)var8.getKey()),
                  (Integer)var8.getKey(),
                  ((class_6768)var8.getValue()).field_34928,
                  ((class_6768)var8.getValue()).field_34926,
                  ((class_6768)var8.getValue()).field_34933
               );
            } else {
               this.method_26021(
                  var1,
                  this.method_26017((Integer)var8.getKey()),
                  method_4819(1) + 5,
                  var2,
                  var3,
                  this.field_29097.field_39007 == (Integer)var8.getKey() && !this.method_26018(),
                  ((class_6768)var8.getValue()).method_31027((Integer)var8.getKey()),
                  (Integer)var8.getKey(),
                  -1L,
                  (String)null,
                  ((class_6768)var8.getValue()).field_34933
               );
            }
         }
      }
   }

   private int method_26017(int var1) {
      return this.field_29091 + (var1 - 1) * 110;
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.method_26014();
         return true;
      }
   }

   private void method_26014() {
      this.field_943.method_8609(this.field_29099);
   }

   private void method_26015(long var1) {
      new Thread(() -> {
         class_176 var5 = class_176.method_777();

         try {
            this.field_29097 = var5.method_770(var1);
            this.method_26020();
         } catch (class_3900 var7) {
            field_29095.error("Couldn't get own world");
            this.field_943.method_8609(new class_9306(ITextComponent.func_244388_a(var7.getMessage()), this.field_29099));
         }
      }).start();
   }

   public void method_26016() {
      new Thread(() -> {
         class_176 var3 = class_176.method_777();
         if (this.field_29097.field_39004 == class_6804.field_35064) {
            this.field_943.execute(() -> this.field_943.method_8609(new class_1065(this, new class_5894(this.field_29097, this, this.field_29100, true))));
         } else {
            try {
               this.field_29100.method_32264().method_32260(var3.method_770(this.field_29094), this);
            } catch (class_3900 var5) {
               field_29095.error("Couldn't get own world");
               this.field_943.execute(() -> this.field_943.method_8609(this.field_29099));
            }
         }
      }).start();
   }

   private void method_26019(int var1) {
      class_176 var4 = class_176.method_777();

      try {
         class_8105 var5 = var4.method_784(this.field_29097.field_39016, var1);
         class_9043 var6 = new class_9043(this, var5, this.field_29097.method_34781(var1), var2 -> {
            if (!var2) {
               this.field_943.method_8609(this);
            } else {
               this.field_29096.add(var1);
               this.field_942.clear();
               this.method_26020();
            }
         });
         this.field_943.method_8609(var6);
      } catch (class_3900 var7) {
         field_29095.error("Couldn't download world data");
         this.field_943.method_8609(new class_9306(var7, this));
      }
   }

   private boolean method_26018() {
      return this.field_29097 != null && this.field_29097.field_39015 == class_8840.field_45209;
   }

   private void method_26021(
      class_7966 var1, int var2, int var3, int var4, int var5, boolean var6, String var7, int var8, long var9, String var11, boolean var12
   ) {
      if (!var12) {
         if (var11 != null && var9 != -1L) {
            class_3570.method_16600(String.valueOf(var9), var11);
         } else if (var8 != 1) {
            if (var8 != 2) {
               if (var8 != 3) {
                  class_3570.method_16600(String.valueOf(this.field_29097.field_39017), this.field_29097.field_39003);
               } else {
                  this.field_943.method_8577().method_35674(class_7319.field_37422);
               }
            } else {
               this.field_943.method_8577().method_35674(class_7319.field_37417);
            }
         } else {
            this.field_943.method_8577().method_35674(class_7319.field_37425);
         }
      } else {
         this.field_943.method_8577().method_35674(class_7319.field_37418);
      }

      if (var6) {
         if (var6) {
            float var15 = 0.9F + 0.1F * class_9299.method_42840((float)this.field_29092 * 0.2F);
            class_3542.method_16480(var15, var15, var15, 1.0F);
         }
      } else {
         class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
      }

      class_2089.method_9778(var1, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      this.field_943.method_8577().method_35674(class_7319.field_37415);
      if (!var6) {
         class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
      } else {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      }

      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 80, 80, 80, 80);
      method_9787(var1, this.field_948, var7, var2 + 40, var3 + 66, 16777215);
   }
}
