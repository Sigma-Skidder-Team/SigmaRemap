package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7352 extends class_1094 {
   private static final Logger field_37587 = LogManager.getLogger();
   private static final ITextComponent field_37582 = new TranslationTextComponent(field_37588[0]);
   private static final ITextComponent field_37580 = new TranslationTextComponent("mco.configure.world.players.error");
   private class_1863 field_37581;
   private final class_7675 field_37585;
   private final class_2866 field_37583;
   private final class_266 field_37586;
   private ITextComponent field_37584;

   public class_7352(class_2866 var1, class_266 var2, class_7675 var3) {
      this.field_37583 = var1;
      this.field_37586 = var2;
      this.field_37585 = var3;
   }

   @Override
   public void method_5312() {
      this.field_37581.method_8279();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_37581 = new class_1863(
         this.field_943.field_9668,
         this.field_941 / 2 - 100,
         method_4819(2),
         200,
         20,
         (class_1863)null,
         new TranslationTextComponent("mco.configure.world.invite.profile.name")
      );
      this.<class_1863>method_1159(this.field_37581);
      this.method_41178(this.field_37581);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, method_4819(10), 200, 20, new TranslationTextComponent("mco.configure.world.buttons.invite"), var1 -> this.method_33498()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, method_4819(12), 200, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_37586))
      );
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_33498() {
      class_176 var3 = class_176.method_777();
      if (this.field_37581.method_8246() != null && !this.field_37581.method_8246().isEmpty()) {
         try {
            class_7675 var4 = var3.method_805(this.field_37585.field_39016, this.field_37581.method_8246().trim());
            if (var4 != null) {
               this.field_37585.field_39019 = var4.field_39019;
               this.field_943.method_8609(new class_1980(this.field_37583, this.field_37585));
            } else {
               this.method_33499(field_37580);
            }
         } catch (Exception var5) {
            field_37587.error("Couldn't invite user");
            this.method_33499(field_37580);
         }
      } else {
         this.method_33499(field_37580);
      }
   }

   private void method_33499(ITextComponent var1) {
      this.field_37584 = var1;
      class_7567.method_34410(var1.getString());
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_37586);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_948.method_45378(var1, field_37582, (float)(this.field_941 / 2 - 100), (float)method_4819(1), 10526880);
      if (this.field_37584 != null) {
         method_9788(var1, this.field_948, this.field_37584, this.field_941 / 2, method_4819(5), 16711680);
      }

      this.field_37581.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }
}
