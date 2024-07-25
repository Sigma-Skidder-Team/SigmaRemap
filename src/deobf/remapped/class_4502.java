package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4502 extends class_1094 {
   private static final Logger field_22016 = LogManager.getLogger();
   private static final Identifier field_22017 = new Identifier("realms", "textures/gui/realms/accept_icon.png");
   private static final Identifier field_22022 = new Identifier("realms", "textures/gui/realms/reject_icon.png");
   private static final ITextComponent field_22020 = new TranslationTextComponent("mco.invites.nopending");
   private static final ITextComponent field_22024 = new TranslationTextComponent(field_22023[1]);
   private static final ITextComponent field_22021 = new TranslationTextComponent(field_22023[2]);
   private final class_266 field_22015;
   private ITextComponent field_22013;
   private boolean field_22027;
   private class_2707 field_22019;
   private class_8949 field_22014;
   private int field_22025 = -1;
   private class_9521 field_22018;
   private class_9521 field_22026;

   public class_4502(class_266 var1) {
      this.field_22015 = var1;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_22019 = new class_2707(this);
      new class_8010(this, "Realms-pending-invitations-fetcher").start();
      this.<class_2707>method_1159(this.field_22019);
      this.field_22018 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 174, this.field_940 - 32, 100, 20, new TranslationTextComponent("mco.invites.button.accept"), var1 -> {
            this.method_20925(this.field_22025);
            this.field_22025 = -1;
            this.method_20914();
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 50, this.field_940 - 32, 100, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(new class_7039(this.field_22015))
         )
      );
      this.field_22026 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 74, this.field_940 - 32, 100, 20, new TranslationTextComponent("mco.invites.button.reject"), var1 -> {
            this.method_20928(this.field_22025);
            this.field_22025 = -1;
            this.method_20914();
         })
      );
      this.field_22014 = new class_8949(new TranslationTextComponent("mco.invites.title"), this.field_941 / 2, 12, 16777215);
      this.<class_8949>method_1159(this.field_22014);
      this.method_4820();
      this.method_20914();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(new class_7039(this.field_22015));
         return true;
      }
   }

   private void method_20927(int var1) {
      this.field_22019.method_12201(var1);
   }

   private void method_20928(int var1) {
      if (var1 < this.field_22019.method_36218()) {
         new class_2814(this, "Realms-reject-invitation", var1).start();
      }
   }

   private void method_20925(int var1) {
      if (var1 < this.field_22019.method_36218()) {
         new class_1846(this, "Realms-accept-invitation", var1).start();
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_22013 = null;
      this.method_1183(var1);
      this.field_22019.method_6767(var1, var2, var3, var4);
      this.field_22014.method_41093(this, var1);
      if (this.field_22013 != null) {
         this.method_20932(var1, this.field_22013, var2, var3);
      }

      if (this.field_22019.method_36218() == 0 && this.field_22027) {
         method_9788(var1, this.field_948, field_22020, this.field_941 / 2, this.field_940 / 2 - 20, 16777215);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   public void method_20932(class_7966 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field_948.method_45379(var2);
         this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field_948.method_45392(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   private void method_20914() {
      this.field_22018.field_36677 = this.method_20937(this.field_22025);
      this.field_22026.field_36677 = this.method_20937(this.field_22025);
   }

   private boolean method_20937(int var1) {
      return var1 != -1;
   }
}
