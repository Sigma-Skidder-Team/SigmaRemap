package remapped;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5445 extends Screen {
   private static final ITextComponent field_27734 = new TranslationTextComponent(field_27755[13]);
   private static final ITextComponent field_27751 = new TranslationTextComponent("structure_block.position");
   private static final ITextComponent field_27744 = new TranslationTextComponent("structure_block.size");
   private static final ITextComponent field_27736 = new TranslationTextComponent("structure_block.integrity");
   private static final ITextComponent field_27761 = new TranslationTextComponent(field_27755[22]);
   private static final ITextComponent field_27725 = new TranslationTextComponent("structure_block.include_entities");
   private static final ITextComponent field_27728 = new TranslationTextComponent("structure_block.detect_size");
   private static final ITextComponent field_27739 = new TranslationTextComponent("structure_block.show_air");
   private static final ITextComponent field_27743 = new TranslationTextComponent("structure_block.show_boundingbox");
   private final class_945 field_27753;
   private class_9022 field_27746 = class_9022.field_46145;
   private class_6631 field_27727 = class_6631.field_34340;
   private class_589 field_27745 = class_589.field_3411;
   private boolean field_27747;
   private boolean field_27757;
   private boolean field_27721;
   private class_1863 field_27732;
   private class_1863 field_27731;
   private class_1863 field_27762;
   private class_1863 field_27756;
   private class_1863 field_27741;
   private class_1863 field_27754;
   private class_1863 field_27759;
   private class_1863 field_27724;
   private class_1863 field_27748;
   private class_1863 field_27733;
   private class_9521 field_27760;
   private class_9521 field_27737;
   private class_9521 field_27750;
   private class_9521 field_27738;
   private class_9521 field_27735;
   private class_9521 field_27722;
   private class_9521 field_27752;
   private class_9521 field_27742;
   private class_9521 field_27730;
   private class_9521 field_27758;
   private class_9521 field_27723;
   private class_9521 field_27740;
   private class_9521 field_27749;
   private class_9521 field_27726;
   private final DecimalFormat field_27729 = new DecimalFormat("0.0###");

   public class_5445(class_945 var1) {
      super(new TranslationTextComponent(class_4783.field_23846.method_29271()));
      this.field_27753 = var1;
      this.field_27729.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   @Override
   public void method_5312() {
      this.field_27732.method_8279();
      this.field_27731.method_8279();
      this.field_27762.method_8279();
      this.field_27756.method_8279();
      this.field_27741.method_8279();
      this.field_27754.method_8279();
      this.field_27759.method_8279();
      this.field_27724.method_8279();
      this.field_27748.method_8279();
      this.field_27733.method_8279();
   }

   private void method_24822() {
      if (this.method_24821(class_6664.field_34457)) {
         this.field_943.method_8609((Screen)null);
      }
   }

   private void method_24817() {
      this.field_27753.method_4087(this.field_27746);
      this.field_27753.method_4092(this.field_27727);
      this.field_27753.method_4108(this.field_27745);
      this.field_27753.method_4110(this.field_27747);
      this.field_27753.method_4101(this.field_27757);
      this.field_27753.method_4123(this.field_27721);
      this.field_943.method_8609((Screen)null);
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_27760 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 4 - 150, 210, 150, 20, class_1402.field_7625, var1 -> this.method_24822())
      );
      this.field_27737 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4, 210, 150, 20, class_1402.field_7633, var1 -> this.method_24817()));
      this.field_27750 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.save"), var1 -> {
            if (this.field_27753.method_4085() == class_589.field_3417) {
               this.method_24821(class_6664.field_34460);
               this.field_943.method_8609((Screen)null);
            }
         })
      );
      this.field_27738 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.load"), var1 -> {
            if (this.field_27753.method_4085() == class_589.field_3414) {
               this.method_24821(class_6664.field_34462);
               this.field_943.method_8609((Screen)null);
            }
         })
      );
      this.field_27730 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 4 - 150, 185, 50, 20, new StringTextComponent("MODE"), var1 -> {
         this.field_27753.method_4118();
         this.method_24820();
      }));
      this.field_27758 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4 + 100, 120, 50, 20, new TranslationTextComponent("structure_block.button.detect_size"), var1 -> {
            if (this.field_27753.method_4085() == class_589.field_3417) {
               this.method_24821(class_6664.field_34459);
               this.field_943.method_8609((Screen)null);
            }
         })
      );
      this.field_27723 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4 + 100, 160, 50, 20, new StringTextComponent("ENTITIES"), var1 -> {
         this.field_27753.method_4110(!this.field_27753.method_4097());
         this.method_24819();
      }));
      this.field_27740 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 20, 185, 40, 20, new StringTextComponent("MIRROR"), var1 -> {
         switch (this.field_27753.method_4089()) {
            case field_46145:
               this.field_27753.method_4087(class_9022.field_46148);
               break;
            case field_46148:
               this.field_27753.method_4087(class_9022.field_46144);
               break;
            case field_46144:
               this.field_27753.method_4087(class_9022.field_46145);
         }

         this.method_24827();
      }));
      this.field_27749 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWAIR"), var1 -> {
         this.field_27753.method_4101(!this.field_27753.method_4111());
         this.method_24816();
      }));
      this.field_27726 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWBB"), var1 -> {
         this.field_27753.method_4123(!this.field_27753.method_4091());
         this.method_24823();
      }));
      this.field_27735 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("0"), var1 -> {
            this.field_27753.method_4092(class_6631.field_34340);
            this.method_24818();
         })
      );
      this.field_27722 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("90"), var1 -> {
         this.field_27753.method_4092(class_6631.field_34334);
         this.method_24818();
      }));
      this.field_27752 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 1 + 20, 185, 40, 20, new StringTextComponent("180"), var1 -> {
         this.field_27753.method_4092(class_6631.field_34338);
         this.method_24818();
      }));
      this.field_27742 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new StringTextComponent("270"), var1 -> {
            this.field_27753.method_4092(class_6631.field_34335);
            this.method_24818();
         })
      );
      this.field_27732 = new class_1734(
         this, this.field_948, this.field_941 / 2 - 152, 40, 300, 20, new TranslationTextComponent("structure_block.structure_name")
      );
      this.field_27732.method_8255(64);
      this.field_27732.method_8281(this.field_27753.method_4113());
      this.field_942.add(this.field_27732);
      BlockPos var3 = this.field_27753.method_4116();
      this.field_27731 = new class_1863(this.field_948, this.field_941 / 2 - 152, 80, 80, 20, new TranslationTextComponent("structure_block.position.x"));
      this.field_27731.method_8255(15);
      this.field_27731.method_8281(Integer.toString(var3.getX()));
      this.field_942.add(this.field_27731);
      this.field_27762 = new class_1863(this.field_948, this.field_941 / 2 - 72, 80, 80, 20, new TranslationTextComponent("structure_block.position.y"));
      this.field_27762.method_8255(15);
      this.field_27762.method_8281(Integer.toString(var3.method_12165()));
      this.field_942.add(this.field_27762);
      this.field_27756 = new class_1863(this.field_948, this.field_941 / 2 + 8, 80, 80, 20, new TranslationTextComponent("structure_block.position.z"));
      this.field_27756.method_8255(15);
      this.field_27756.method_8281(Integer.toString(var3.method_12185()));
      this.field_942.add(this.field_27756);
      BlockPos var4 = this.field_27753.method_4096();
      this.field_27741 = new class_1863(this.field_948, this.field_941 / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.size.x"));
      this.field_27741.method_8255(15);
      this.field_27741.method_8281(Integer.toString(var4.getX()));
      this.field_942.add(this.field_27741);
      this.field_27754 = new class_1863(this.field_948, this.field_941 / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.size.y"));
      this.field_27754.method_8255(15);
      this.field_27754.method_8281(Integer.toString(var4.method_12165()));
      this.field_942.add(this.field_27754);
      this.field_27759 = new class_1863(this.field_948, this.field_941 / 2 + 8, 120, 80, 20, new TranslationTextComponent("structure_block.size.z"));
      this.field_27759.method_8255(15);
      this.field_27759.method_8281(Integer.toString(var4.method_12185()));
      this.field_942.add(this.field_27759);
      this.field_27724 = new class_1863(
         this.field_948, this.field_941 / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.integrity")
      );
      this.field_27724.method_8255(15);
      this.field_27724.method_8281(this.field_27729.format((double)this.field_27753.method_4122()));
      this.field_942.add(this.field_27724);
      this.field_27748 = new class_1863(this.field_948, this.field_941 / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.seed"));
      this.field_27748.method_8255(31);
      this.field_27748.method_8281(Long.toString(this.field_27753.method_4127()));
      this.field_942.add(this.field_27748);
      this.field_27733 = new class_1863(this.field_948, this.field_941 / 2 - 152, 120, 240, 20, new TranslationTextComponent("structure_block.custom_data"));
      this.field_27733.method_8255(128);
      this.field_27733.method_8281(this.field_27753.method_4086());
      this.field_942.add(this.field_27733);
      this.field_27746 = this.field_27753.method_4089();
      this.method_24827();
      this.field_27727 = this.field_27753.method_4120();
      this.method_24818();
      this.field_27745 = this.field_27753.method_4085();
      this.method_24820();
      this.field_27747 = this.field_27753.method_4097();
      this.method_24819();
      this.field_27757 = this.field_27753.method_4111();
      this.method_24816();
      this.field_27721 = this.field_27753.method_4091();
      this.method_24823();
      this.method_41178(this.field_27732);
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_27732.method_8246();
      String var7 = this.field_27731.method_8246();
      String var8 = this.field_27762.method_8246();
      String var9 = this.field_27756.method_8246();
      String var10 = this.field_27741.method_8246();
      String var11 = this.field_27754.method_8246();
      String var12 = this.field_27759.method_8246();
      String var13 = this.field_27724.method_8246();
      String var14 = this.field_27748.method_8246();
      String var15 = this.field_27733.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_27732.method_8281(var6);
      this.field_27731.method_8281(var7);
      this.field_27762.method_8281(var8);
      this.field_27756.method_8281(var9);
      this.field_27741.method_8281(var10);
      this.field_27754.method_8281(var11);
      this.field_27759.method_8281(var12);
      this.field_27724.method_8281(var13);
      this.field_27748.method_8281(var14);
      this.field_27733.method_8281(var15);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_24819() {
      this.field_27723.method_32687(class_1402.method_6479(!this.field_27753.method_4097()));
   }

   private void method_24816() {
      this.field_27749.method_32687(class_1402.method_6479(this.field_27753.method_4111()));
   }

   private void method_24823() {
      this.field_27726.method_32687(class_1402.method_6479(this.field_27753.method_4091()));
   }

   private void method_24827() {
      class_9022 var3 = this.field_27753.method_4089();
      switch (var3) {
         case field_46145:
            this.field_27740.method_32687(new StringTextComponent("|"));
            break;
         case field_46148:
            this.field_27740.method_32687(new StringTextComponent("< >"));
            break;
         case field_46144:
            this.field_27740.method_32687(new StringTextComponent("^ v"));
      }
   }

   private void method_24818() {
      this.field_27735.field_36675 = true;
      this.field_27722.field_36675 = true;
      this.field_27752.field_36675 = true;
      this.field_27742.field_36675 = true;
      switch (this.field_27753.method_4120()) {
         case field_34340:
            this.field_27735.field_36675 = false;
            break;
         case field_34338:
            this.field_27752.field_36675 = false;
            break;
         case field_34335:
            this.field_27742.field_36675 = false;
            break;
         case field_34334:
            this.field_27722.field_36675 = false;
      }
   }

   private void method_24820() {
      this.field_27732.method_8270(false);
      this.field_27731.method_8270(false);
      this.field_27762.method_8270(false);
      this.field_27756.method_8270(false);
      this.field_27741.method_8270(false);
      this.field_27754.method_8270(false);
      this.field_27759.method_8270(false);
      this.field_27724.method_8270(false);
      this.field_27748.method_8270(false);
      this.field_27733.method_8270(false);
      this.field_27750.field_36677 = false;
      this.field_27738.field_36677 = false;
      this.field_27758.field_36677 = false;
      this.field_27723.field_36677 = false;
      this.field_27740.field_36677 = false;
      this.field_27735.field_36677 = false;
      this.field_27722.field_36677 = false;
      this.field_27752.field_36677 = false;
      this.field_27742.field_36677 = false;
      this.field_27749.field_36677 = false;
      this.field_27726.field_36677 = false;
      switch (this.field_27753.method_4085()) {
         case field_3417:
            this.field_27732.method_8270(true);
            this.field_27731.method_8270(true);
            this.field_27762.method_8270(true);
            this.field_27756.method_8270(true);
            this.field_27741.method_8270(true);
            this.field_27754.method_8270(true);
            this.field_27759.method_8270(true);
            this.field_27750.field_36677 = true;
            this.field_27758.field_36677 = true;
            this.field_27723.field_36677 = true;
            this.field_27749.field_36677 = true;
            break;
         case field_3414:
            this.field_27732.method_8270(true);
            this.field_27731.method_8270(true);
            this.field_27762.method_8270(true);
            this.field_27756.method_8270(true);
            this.field_27724.method_8270(true);
            this.field_27748.method_8270(true);
            this.field_27738.field_36677 = true;
            this.field_27723.field_36677 = true;
            this.field_27740.field_36677 = true;
            this.field_27735.field_36677 = true;
            this.field_27722.field_36677 = true;
            this.field_27752.field_36677 = true;
            this.field_27742.field_36677 = true;
            this.field_27726.field_36677 = true;
            this.method_24818();
            break;
         case field_3418:
            this.field_27732.method_8270(true);
            break;
         case field_3411:
            this.field_27733.method_8270(true);
      }

      this.field_27730.method_32687(new TranslationTextComponent("structure_block.mode." + this.field_27753.method_4085().method_21049()));
   }

   private boolean method_24821(class_6664 var1) {
      BlockPos var4 = new BlockPos(
         this.method_24824(this.field_27731.method_8246()),
         this.method_24824(this.field_27762.method_8246()),
         this.method_24824(this.field_27756.method_8246())
      );
      BlockPos var5 = new BlockPos(
         this.method_24824(this.field_27741.method_8246()),
         this.method_24824(this.field_27754.method_8246()),
         this.method_24824(this.field_27759.method_8246())
      );
      float var6 = this.method_24825(this.field_27724.method_8246());
      long var7 = this.method_24826(this.field_27748.method_8246());
      this.field_943
         .method_8614()
         .sendPacket(
            new class_6971(
               this.field_27753.method_17399(),
               var1,
               this.field_27753.method_4085(),
               this.field_27732.method_8246(),
               var4,
               var5,
               this.field_27753.method_4089(),
               this.field_27753.method_4120(),
               this.field_27733.method_8246(),
               this.field_27753.method_4097(),
               this.field_27753.method_4111(),
               this.field_27753.method_4091(),
               var6,
               var7
            )
         );
      return true;
   }

   private long method_24826(String var1) {
      try {
         return Long.valueOf(var1);
      } catch (NumberFormatException var5) {
         return 0L;
      }
   }

   private float method_24825(String var1) {
      try {
         return Float.valueOf(var1);
      } catch (NumberFormatException var5) {
         return 1.0F;
      }
   }

   private int method_24824(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var5) {
         return 0;
      }
   }

   @Override
   public void method_1156() {
      this.method_24817();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (var1 != 257 && var1 != 335) {
            return false;
         } else {
            this.method_24822();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      class_589 var7 = this.field_27753.method_4085();
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 10, 16777215);
      if (var7 != class_589.field_3411) {
         method_9771(var1, this.field_948, field_27734, this.field_941 / 2 - 153, 30, 10526880);
         this.field_27732.method_6767(var1, var2, var3, var4);
      }

      if (var7 == class_589.field_3414 || var7 == class_589.field_3417) {
         method_9771(var1, this.field_948, field_27751, this.field_941 / 2 - 153, 70, 10526880);
         this.field_27731.method_6767(var1, var2, var3, var4);
         this.field_27762.method_6767(var1, var2, var3, var4);
         this.field_27756.method_6767(var1, var2, var3, var4);
         method_9771(var1, this.field_948, field_27725, this.field_941 / 2 + 154 - this.field_948.method_45379(field_27725), 150, 10526880);
      }

      if (var7 == class_589.field_3417) {
         method_9771(var1, this.field_948, field_27744, this.field_941 / 2 - 153, 110, 10526880);
         this.field_27741.method_6767(var1, var2, var3, var4);
         this.field_27754.method_6767(var1, var2, var3, var4);
         this.field_27759.method_6767(var1, var2, var3, var4);
         method_9771(var1, this.field_948, field_27728, this.field_941 / 2 + 154 - this.field_948.method_45379(field_27728), 110, 10526880);
         method_9771(var1, this.field_948, field_27739, this.field_941 / 2 + 154 - this.field_948.method_45379(field_27739), 70, 10526880);
      }

      if (var7 == class_589.field_3414) {
         method_9771(var1, this.field_948, field_27736, this.field_941 / 2 - 153, 110, 10526880);
         this.field_27724.method_6767(var1, var2, var3, var4);
         this.field_27748.method_6767(var1, var2, var3, var4);
         method_9771(var1, this.field_948, field_27743, this.field_941 / 2 + 154 - this.field_948.method_45379(field_27743), 70, 10526880);
      }

      if (var7 == class_589.field_3411) {
         method_9771(var1, this.field_948, field_27761, this.field_941 / 2 - 153, 110, 10526880);
         this.field_27733.method_6767(var1, var2, var3, var4);
      }

      method_9771(var1, this.field_948, var7.method_2762(), this.field_941 / 2 - 153, 174, 10526880);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
