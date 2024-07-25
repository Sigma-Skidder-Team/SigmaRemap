package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2977 extends class_1094 {
   public static final ITextComponent[] field_14645 = new ITextComponent[]{
      new TranslationTextComponent("options.difficulty.peaceful"),
      new TranslationTextComponent("options.difficulty.easy"),
      new TranslationTextComponent("options.difficulty.normal"),
      new TranslationTextComponent("options.difficulty.hard")
   };
   public static final ITextComponent[] field_14651 = new ITextComponent[]{
      new TranslationTextComponent("selectWorld.gameMode.survival"),
      new TranslationTextComponent("selectWorld.gameMode.creative"),
      new TranslationTextComponent("selectWorld.gameMode.adventure")
   };
   private static final ITextComponent field_14643 = new TranslationTextComponent("mco.configure.world.on");
   private static final ITextComponent field_14640 = new TranslationTextComponent(field_14661[12]);
   private static final ITextComponent field_14665 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field_14635 = new TranslationTextComponent(field_14661[3]);
   private class_1863 field_14663;
   public final class_2866 field_14639;
   private int field_14652;
   private int field_14648;
   private int field_14634;
   private final class_6768 field_14662;
   private final class_8840 field_14659;
   private final int field_14641;
   private int field_14654;
   private int field_14657;
   private Boolean field_14644;
   private Boolean field_14638;
   private Boolean field_14637;
   private Boolean field_14650;
   private Integer field_14642;
   private Boolean field_14656;
   private Boolean field_14633;
   private class_9521 field_14660;
   private class_9521 field_14658;
   private class_9521 field_14664;
   private class_9521 field_14649;
   private class_606 field_14655;
   private class_9521 field_14646;
   private class_9521 field_14636;
   private class_8949 field_14653;
   private class_8949 field_14647;

   public class_2977(class_2866 var1, class_6768 var2, class_8840 var3, int var4) {
      this.field_14639 = var1;
      this.field_14662 = var2;
      this.field_14659 = var3;
      this.field_14641 = var4;
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public void method_5312() {
      this.field_14663.method_8279();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_14639);
         return true;
      }
   }

   @Override
   public void method_1163() {
      this.field_14648 = 170;
      this.field_14652 = this.field_941 / 2 - this.field_14648;
      this.field_14634 = this.field_941 / 2 + 10;
      this.field_14654 = this.field_14662.field_34934;
      this.field_14657 = this.field_14662.field_34935;
      if (this.field_14659 != class_8840.field_45205) {
         TranslationTextComponent var3;
         if (this.field_14659 != class_8840.field_45210) {
            if (this.field_14659 != class_8840.field_45208) {
               var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.experience");
            } else {
               var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.inspiration");
            }
         } else {
            var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.adventuremap");
         }

         this.field_14647 = new class_8949(var3, this.field_941 / 2, 26, 16711680);
         this.field_14644 = true;
         this.field_14642 = 0;
         this.field_14633 = false;
         this.field_14637 = true;
         this.field_14650 = true;
         this.field_14638 = true;
         this.field_14656 = true;
      } else {
         this.field_14644 = this.field_14662.field_34927;
         this.field_14642 = this.field_14662.field_34937;
         this.field_14633 = this.field_14662.field_34940;
         this.field_14637 = this.field_14662.field_34939;
         this.field_14650 = this.field_14662.field_34936;
         this.field_14638 = this.field_14662.field_34931;
         this.field_14656 = this.field_14662.field_34938;
      }

      this.field_14663 = new class_1863(
         this.field_943.textRenderer,
         this.field_14652 + 2,
         method_4819(1),
         this.field_14648 - 4,
         20,
         (class_1863)null,
         new TranslationTextComponent("mco.configure.world.edit.slot.name")
      );
      this.field_14663.method_8255(10);
      this.field_14663.method_8281(this.field_14662.method_31027(this.field_14641));
      this.method_41184(this.field_14663);
      this.field_14660 = this.<class_9521>method_1186(new class_9521(this.field_14634, method_4819(1), this.field_14648, 20, this.method_13635(), var1 -> {
         this.field_14644 = !this.field_14644;
         var1.method_32687(this.method_13635());
      }));
      this.<class_9521>method_1186(new class_9521(this.field_14652, method_4819(3), this.field_14648, 20, this.method_13644(), var1 -> {
         this.field_14657 = (this.field_14657 + 1) % field_14651.length;
         var1.method_32687(this.method_13644());
      }));
      this.field_14658 = this.<class_9521>method_1186(new class_9521(this.field_14634, method_4819(3), this.field_14648, 20, this.method_13641(), var1 -> {
         this.field_14637 = !this.field_14637;
         var1.method_32687(this.method_13641());
      }));
      this.<class_9521>method_1186(new class_9521(this.field_14652, method_4819(5), this.field_14648, 20, this.method_13636(), var1 -> {
         this.field_14654 = (this.field_14654 + 1) % field_14645.length;
         var1.method_32687(this.method_13636());
         if (this.field_14659 == class_8840.field_45205) {
            this.field_14664.field_36675 = this.field_14654 != 0;
            this.field_14664.method_32687(this.method_13631());
         }
      }));
      this.field_14664 = this.<class_9521>method_1186(new class_9521(this.field_14634, method_4819(5), this.field_14648, 20, this.method_13631(), var1 -> {
         this.field_14650 = !this.field_14650;
         var1.method_32687(this.method_13631());
      }));
      this.field_14655 = this.<class_606>method_1186(new class_606(this, this.field_14652, method_4819(7), this.field_14648, this.field_14642, 0.0F, 16.0F));
      this.field_14649 = this.<class_9521>method_1186(new class_9521(this.field_14634, method_4819(7), this.field_14648, 20, this.method_13643(), var1 -> {
         this.field_14638 = !this.field_14638;
         var1.method_32687(this.method_13643());
      }));
      this.field_14636 = this.<class_9521>method_1186(new class_9521(this.field_14652, method_4819(9), this.field_14648, 20, this.method_13637(), var1 -> {
         this.field_14633 = !this.field_14633;
         var1.method_32687(this.method_13637());
      }));
      this.field_14646 = this.<class_9521>method_1186(new class_9521(this.field_14634, method_4819(9), this.field_14648, 20, this.method_13642(), var1 -> {
         this.field_14656 = !this.field_14656;
         var1.method_32687(this.method_13642());
      }));
      if (this.field_14659 != class_8840.field_45205) {
         this.field_14660.field_36675 = false;
         this.field_14658.field_36675 = false;
         this.field_14649.field_36675 = false;
         this.field_14664.field_36675 = false;
         this.field_14655.field_36675 = false;
         this.field_14646.field_36675 = false;
         this.field_14636.field_36675 = false;
      }

      if (this.field_14654 == 0) {
         this.field_14664.field_36675 = false;
      }

      this.<class_9521>method_1186(
         new class_9521(
            this.field_14652,
            method_4819(13),
            this.field_14648,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.done"),
            var1 -> this.method_13639()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_14634, method_4819(13), this.field_14648, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_14639))
      );
      this.<class_1863>method_1159(this.field_14663);
      this.field_14653 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.configure.world.buttons.options"), this.field_941 / 2, 17, 16777215)
      );
      if (this.field_14647 != null) {
         this.<class_8949>method_1159(this.field_14647);
      }

      this.method_4820();
   }

   private ITextComponent method_13636() {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(field_14645[this.field_14654]);
   }

   private ITextComponent method_13644() {
      return new TranslationTextComponent("options.generic_value", field_14665, field_14651[this.field_14657]);
   }

   private ITextComponent method_13635() {
      return new TranslationTextComponent("mco.configure.world.pvp").appendString(": ").append(method_13640(this.field_14644));
   }

   private ITextComponent method_13641() {
      return new TranslationTextComponent("mco.configure.world.spawnAnimals").appendString(": ").append(method_13640(this.field_14637));
   }

   private ITextComponent method_13631() {
      return this.field_14654 != 0
         ? new TranslationTextComponent("mco.configure.world.spawnMonsters").appendString(": ").append(method_13640(this.field_14650))
         : new TranslationTextComponent("mco.configure.world.spawnMonsters").appendString(": ").append(new TranslationTextComponent("mco.configure.world.off"));
   }

   private ITextComponent method_13643() {
      return new TranslationTextComponent("mco.configure.world.spawnNPCs").appendString(": ").append(method_13640(this.field_14638));
   }

   private ITextComponent method_13642() {
      return new TranslationTextComponent("mco.configure.world.commandBlocks").appendString(": ").append(method_13640(this.field_14656));
   }

   private ITextComponent method_13637() {
      return new TranslationTextComponent("mco.configure.world.forceGameMode").appendString(": ").append(method_13640(this.field_14633));
   }

   private static ITextComponent method_13640(boolean var0) {
      return !var0 ? field_14640 : field_14643;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_948
         .method_45378(
            var1,
            field_14635,
            (float)(this.field_14652 + this.field_14648 / 2 - this.field_948.method_45379(field_14635) / 2),
            (float)(method_4819(0) - 5),
            16777215
         );
      this.field_14653.method_41093(this, var1);
      if (this.field_14647 != null) {
         this.field_14647.method_41093(this, var1);
      }

      this.field_14663.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }

   private String method_13632() {
      return !this.field_14663.method_8246().equals(this.field_14662.method_31023(this.field_14641)) ? this.field_14663.method_8246() : "";
   }

   private void method_13639() {
      if (this.field_14659 != class_8840.field_45210 && this.field_14659 != class_8840.field_45211 && this.field_14659 != class_8840.field_45208) {
         this.field_14639
            .method_13157(
               new class_6768(
                  this.field_14644,
                  this.field_14637,
                  this.field_14650,
                  this.field_14638,
                  this.field_14642,
                  this.field_14656,
                  this.field_14654,
                  this.field_14657,
                  this.field_14633,
                  this.method_13632()
               )
            );
      } else {
         this.field_14639
            .method_13157(
               new class_6768(
                  this.field_14662.field_34927,
                  this.field_14662.field_34939,
                  this.field_14662.field_34936,
                  this.field_14662.field_34931,
                  this.field_14662.field_34937,
                  this.field_14662.field_34938,
                  this.field_14654,
                  this.field_14657,
                  this.field_14662.field_34940,
                  this.method_13632()
               )
            );
      }
   }
}
