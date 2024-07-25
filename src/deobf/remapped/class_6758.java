package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6758 extends class_1094 {
   private static final ITextComponent field_34878 = new TranslationTextComponent(field_34871[1]);
   private static final ITextComponent[] field_34877 = new ITextComponent[]{
      new TranslationTextComponent("generator.default"),
      new TranslationTextComponent("generator.flat"),
      new TranslationTextComponent("generator.large_biomes"),
      new TranslationTextComponent("generator.amplified")
   };
   private final class_5824 field_34876;
   private class_8949 field_34873;
   private class_1863 field_34875;
   private Boolean field_34872 = true;
   private Integer field_34874 = 0;
   private ITextComponent field_34879;

   public class_6758(class_5824 var1, ITextComponent var2) {
      this.field_34876 = var1;
      this.field_34879 = var2;
   }

   @Override
   public void method_5312() {
      this.field_34875.method_8279();
      super.method_5312();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_34873 = new class_8949(new TranslationTextComponent("mco.reset.world.generate"), this.field_941 / 2, 17, 16777215);
      this.<class_8949>method_1159(this.field_34873);
      this.field_34875 = new class_1863(
         this.field_943.textRenderer, this.field_941 / 2 - 100, method_4819(2), 200, 20, (class_1863)null, new TranslationTextComponent("mco.reset.world.seed")
      );
      this.field_34875.method_8255(32);
      this.<class_1863>method_1159(this.field_34875);
      this.method_41178(this.field_34875);
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 102, method_4819(4), 205, 20, this.method_30975(), var1 -> {
         this.field_34874 = (this.field_34874 + 1) % field_34877.length;
         var1.method_32687(this.method_30975());
      }));
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 102, method_4819(6) - 2, 205, 20, this.method_30974(), var1 -> {
         this.field_34872 = !this.field_34872;
         var1.method_32687(this.method_30974());
      }));
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 102,
            method_4819(12),
            97,
            20,
            this.field_34879,
            var1 -> this.field_34876.method_26355(new class_1317(this.field_34875.method_8246(), this.field_34874, this.field_34872))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 8, method_4819(12), 97, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_34876))
      );
      this.method_4820();
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
         this.field_943.method_8609(this.field_34876);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_34873.method_41093(this, var1);
      this.field_948.method_45378(var1, field_34878, (float)(this.field_941 / 2 - 100), (float)method_4819(1), 10526880);
      this.field_34875.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }

   private ITextComponent method_30975() {
      return new TranslationTextComponent("selectWorld.mapType").appendString(" ").append(field_34877[this.field_34874]);
   }

   private ITextComponent method_30974() {
      return class_1402.method_6480(new TranslationTextComponent("selectWorld.mapFeatures"), this.field_34872);
   }
}
