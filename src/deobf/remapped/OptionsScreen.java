package remapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class OptionsScreen extends Screen {
   private static final class_1013[] field_43685 = new class_1013[]{class_1013.field_5300};
   private final Screen field_43683;
   private final GameOptions field_43684;
   private class_9521 field_43679;
   private class_1180 field_43681;
   private class_423 field_43680;

   public OptionsScreen(Screen var1, GameOptions var2) {
      super(new TranslationTextComponent("options.title"));
      this.field_43683 = var1;
      this.field_43684 = var2;
   }

   @Override
   public void method_1163() {
      int var3 = 0;

      for (class_1013 var7 : field_43685) {
         int var8 = this.field_941 / 2 - 155 + var3 % 2 * 160;
         int var9 = this.field_940 / 6 - 12 + 24 * (var3 >> 1);
         this.<class_7114>method_1186(var7.method_4482(this.field_943.field_9577, var8, var9, 150));
         var3++;
      }

      if (this.field_943.field_9601 == null) {
         this.<class_2116>method_1186(
            new class_2116(
               this.field_941 / 2 - 155 + var3 % 2 * 160,
               this.field_940 / 6 - 12 + 24 * (var3 >> 1),
               150,
               20,
               class_1013.field_5309,
               class_1013.field_5309.method_22128(this.field_43684),
               var1 -> {
                  class_1013.field_5309.method_22127(this.field_43684);
                  this.field_43684.method_40873();
                  var1.method_32687(class_1013.field_5309.method_22128(this.field_43684));
               }
            )
         );
      } else {
         this.field_43680 = this.field_943.field_9601.method_43370();
         this.field_43679 = this.<class_9521>method_1186(
            new class_9521(
               this.field_941 / 2 - 155 + var3 % 2 * 160, this.field_940 / 6 - 12 + 24 * (var3 >> 1), 150, 20, this.method_39304(this.field_43680), var1 -> {
                  this.field_43680 = class_423.method_2100(this.field_43680.method_2097() + 1);
                  this.field_943.method_8614().method_4813(new class_3005(this.field_43680));
                  this.field_43679.method_32687(this.method_39304(this.field_43680));
               }
            )
         );
         if (this.field_943.method_8520() && !this.field_943.field_9601.method_749().method_8659()) {
            this.field_43679.method_32688(this.field_43679.method_32699() - 20);
            this.field_43681 = this.<class_1180>method_1186(
               new class_1180(
                  this.field_43679.field_36670 + this.field_43679.method_32699(),
                  this.field_43679.field_36674,
                  var1 -> this.field_943
                        .method_8609(
                           new class_9640(
                              this::method_39305,
                              new TranslationTextComponent("difficulty.lock.title"),
                              new TranslationTextComponent(
                                 "difficulty.lock.question",
                                 new TranslationTextComponent("options.difficulty." + this.field_943.field_9601.method_749().method_8661().method_2098())
                              )
                           )
                        )
               )
            );
            this.field_43681.method_5222(this.field_943.field_9601.method_749().method_8662());
            this.field_43681.field_36675 = !this.field_43681.method_5221();
            this.field_43679.field_36675 = !this.field_43681.method_5221();
         } else {
            this.field_43679.field_36675 = false;
         }
      }

      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.skinCustomisation"),
            var1 -> this.field_943.method_8609(new class_9802(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 5,
            this.field_940 / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.sounds"),
            var1 -> this.field_943.method_8609(new class_971(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.video"),
            var1 -> this.field_943.method_8609(new class_765(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 5,
            this.field_940 / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.controls"),
            var1 -> this.field_943.method_8609(new class_8590(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.language"),
            var1 -> this.field_943.method_8609(new class_1709(this, this.field_43684, this.field_943.method_8561()))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 5,
            this.field_940 / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.chat.title"),
            var1 -> this.field_943.method_8609(new class_6299(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.resourcepack"),
            var1 -> this.field_943
                  .method_8609(
                     new class_6707(
                        this,
                        this.field_943.method_8521(),
                        this::method_39306,
                        this.field_943.method_8536(),
                        new TranslationTextComponent("resourcePack.title")
                     )
                  )
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 5,
            this.field_940 / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.accessibility.title"),
            var1 -> this.field_943.method_8609(new class_9728(this, this.field_43684))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 6 + 168, 200, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_43683)
         )
      );
   }

   private void method_39306(class_6354 var1) {
      ImmutableList var4 = ImmutableList.copyOf(this.field_43684.field_45387);
      this.field_43684.field_45387.clear();
      this.field_43684.field_45401.clear();

      for (class_5522 var6 : var1.method_29125()) {
         if (!var6.method_25029()) {
            this.field_43684.field_45387.add(var6.method_25023());
            if (!var6.method_25022().method_9602()) {
               this.field_43684.field_45401.add(var6.method_25023());
            }
         }
      }

      this.field_43684.method_40873();
      ImmutableList var7 = ImmutableList.copyOf(this.field_43684.field_45387);
      if (!var7.equals(var4)) {
         this.field_943.method_8524();
      }
   }

   private ITextComponent method_39304(class_423 var1) {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(var1.method_2101());
   }

   private void method_39305(boolean var1) {
      this.field_943.method_8609(this);
      if (var1 && this.field_943.field_9601 != null) {
         this.field_943.method_8614().method_4813(new class_3196(true));
         this.field_43681.method_5222(true);
         this.field_43681.field_36675 = false;
         this.field_43679.field_36675 = false;
      }
   }

   @Override
   public void method_1162() {
      this.field_43684.method_40873();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
