package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6198 implements Class6196 {
   private static final ITextComponent field27651 = new TranslationTextComponent(
      "tutorial.move.title", Class9557.method37037("forward"), Class9557.method37037("left"), Class9557.method37037("back"), Class9557.method37037("right")
   );
   private static final ITextComponent field27652 = new TranslationTextComponent("tutorial.move.description", Class9557.method37037("jump"));
   private static final ITextComponent field27653 = new TranslationTextComponent("tutorial.look.title");
   private static final ITextComponent field27654 = new TranslationTextComponent("tutorial.look.description");
   private final Class9557 field27655;
   private Class7600 field27656;
   private Class7600 field27657;
   private int field27658;
   private int field27659;
   private int field27660;
   private boolean field27661;
   private boolean field27662;
   private int field27663 = -1;
   private int field27664 = -1;

   public Class6198(Class9557 var1) {
      this.field27655 = var1;
   }

   @Override
   public void method19097() {
      this.field27658++;
      if (this.field27661) {
         this.field27659++;
         this.field27661 = false;
      }

      if (this.field27662) {
         this.field27660++;
         this.field27662 = false;
      }

      if (this.field27663 == -1 && this.field27659 > 40) {
         if (this.field27656 != null) {
            this.field27656.method24895();
            this.field27656 = null;
         }

         this.field27663 = this.field27658;
      }

      if (this.field27664 == -1 && this.field27660 > 40) {
         if (this.field27657 != null) {
            this.field27657.method24895();
            this.field27657 = null;
         }

         this.field27664 = this.field27658;
      }

      if (this.field27663 != -1 && this.field27664 != -1) {
         if (this.field27655.method37036() != Class1894.field11102) {
            this.field27655.method37034(Class2200.field14381);
         } else {
            this.field27655.method37034(Class2200.field14377);
         }
      }

      if (this.field27656 != null) {
         this.field27656.method24896((float)this.field27659 / 40.0F);
      }

      if (this.field27657 != null) {
         this.field27657.method24896((float)this.field27660 / 40.0F);
      }

      if (this.field27658 >= 100) {
         if (this.field27663 == -1 && this.field27656 == null) {
            this.field27656 = new Class7600(Class2130.field13895, field27651, field27652, true);
            this.field27655.method37035().method1566().method5914(this.field27656);
         } else if (this.field27663 != -1 && this.field27658 - this.field27663 >= 20 && this.field27664 == -1 && this.field27657 == null) {
            this.field27657 = new Class7600(Class2130.field13896, field27653, field27654, true);
            this.field27655.method37035().method1566().method5914(this.field27657);
         }
      }
   }

   @Override
   public void method19098() {
      if (this.field27656 != null) {
         this.field27656.method24895();
         this.field27656 = null;
      }

      if (this.field27657 != null) {
         this.field27657.method24895();
         this.field27657 = null;
      }
   }

   @Override
   public void method19100(MovementInput var1) {
      if (var1.field43909 || var1.field43910 || var1.field43911 || var1.field43912 || var1.field43913) {
         this.field27661 = true;
      }
   }

   @Override
   public void method19101(double var1, double var3) {
      if (Math.abs(var1) > 0.01 || Math.abs(var3) > 0.01) {
         this.field27662 = true;
      }
   }
}
