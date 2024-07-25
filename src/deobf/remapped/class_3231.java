package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3231 extends class_266 implements class_2092 {
   private static final ITextComponent field_16083 = new TranslationTextComponent("multiplayer.downloadingStats");
   public final class_266 field_16078;
   private class_8512 field_16080;
   private class_2605 field_16082;
   private class_7904 field_16085;
   private final class_4156 field_16077;
   private class_8374<?> field_16084;
   private boolean field_16081 = true;

   public class_3231(class_266 var1, class_4156 var2) {
      super(new TranslationTextComponent("gui.stats"));
      this.field_16078 = var1;
      this.field_16077 = var2;
   }

   @Override
   public void method_1163() {
      this.field_16081 = true;
      this.field_943.method_8614().method_4813(new class_8559(class_2105.field_10550));
   }

   public void method_14807() {
      this.field_16080 = new class_8512(this, this.field_943);
      this.field_16082 = new class_2605(this, this.field_943);
      this.field_16085 = new class_7904(this, this.field_943);
   }

   public void method_14809() {
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 120,
            this.field_940 - 52,
            80,
            20,
            new TranslationTextComponent("stat.generalButton"),
            var1 -> this.method_14812(this.field_16080)
         )
      );
      class_9521 var3 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 40, this.field_940 - 52, 80, 20, new TranslationTextComponent("stat.itemsButton"), var1 -> this.method_14812(this.field_16082)
         )
      );
      class_9521 var4 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 40, this.field_940 - 52, 80, 20, new TranslationTextComponent("stat.mobsButton"), var1 -> this.method_14812(this.field_16085)
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 - 28, 200, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_16078))
      );
      if (this.field_16082.method_41183().isEmpty()) {
         var3.field_36675 = false;
      }

      if (this.field_16085.method_41183().isEmpty()) {
         var4.field_36675 = false;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (!this.field_16081) {
         this.method_14800().method_6767(var1, var2, var3, var4);
         method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
         super.method_6767(var1, var2, var3, var4);
      } else {
         this.method_1183(var1);
         method_9788(var1, this.field_948, field_16083, this.field_941 / 2, this.field_940 / 2, 16777215);
         method_9787(
            var1,
            this.field_948,
            field_10512[(int)(Util.getMeasuringTimeMs() / 150L % (long)field_10512.length)],
            this.field_941 / 2,
            this.field_940 / 2 + 18,
            16777215
         );
      }
   }

   @Override
   public void method_9793() {
      if (this.field_16081) {
         this.method_14807();
         this.method_14809();
         this.method_14812(this.field_16080);
         this.field_16081 = false;
      }
   }

   @Override
   public boolean method_1161() {
      return !this.field_16081;
   }

   @Nullable
   public class_8374<?> method_14800() {
      return this.field_16084;
   }

   public void method_14812(class_8374<?> var1) {
      this.field_942.remove(this.field_16080);
      this.field_942.remove(this.field_16082);
      this.field_942.remove(this.field_16085);
      if (var1 != null) {
         this.field_942.add(0, var1);
         this.field_16084 = var1;
      }
   }

   private static String method_14802(class_6676<class_4639> var0) {
      return "stat." + ((class_4639)var0.method_30630()).toString().replace(':', '.');
   }

   private int method_14810(int var1) {
      return 115 + 40 * var1;
   }

   private void method_14801(class_7966 var1, int var2, int var3, class_2451 var4) {
      this.method_14808(var1, var2 + 1, var3 + 1, 0, 0);
      class_3542.method_16381();
      this.field_945.method_40264(var4.method_11207(), var2 + 2, var3 + 2);
      class_3542.method_16443();
   }

   private void method_14808(class_7966 var1, int var2, int var3, int var4, int var5) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_10506);
      method_9779(var1, var2, var3, this.method_9777(), (float)var4, (float)var5, 18, 18, 128, 128);
   }
}
