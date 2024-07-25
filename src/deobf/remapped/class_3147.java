package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3147 implements class_963 {
   private static final ITextComponent field_15656 = new StringTextComponent("Ignoring status request");
   private final class_341 field_15654;
   private final class_5121 field_15655;

   public class_3147(class_341 var1, class_5121 var2) {
      this.field_15654 = var1;
      this.field_15655 = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_4227(class_8135 var1) {
      switch (var1.method_37006()) {
         case field_29174:
            this.field_15655.method_23501(class_5776.field_29174);
            if (var1.method_37005() != class_7665.method_34674().getProtocolVersion()) {
               TranslationTextComponent var4;
               if (var1.method_37005() < 754) {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.outdated_client", class_7665.method_34674().getName());
               } else {
                  var4 = new TranslationTextComponent("multiplayer.disconnect.incompatible", class_7665.method_34674().getName());
               }

               this.field_15655.method_23485(new class_2261(var4));
               this.field_15655.method_23482(var4);
            } else {
               this.field_15655.method_23495(new class_3194(this.field_15654, this.field_15655));
            }
            break;
         case field_29173:
            if (this.field_15654.method_1654()) {
               this.field_15655.method_23501(class_5776.field_29173);
               this.field_15655.method_23495(new class_2777(this.field_15654, this.field_15655));
            } else {
               this.field_15655.method_23482(field_15656);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.method_37006());
      }
   }

   @Override
   public void method_9090(ITextComponent var1) {
   }

   @Override
   public class_5121 method_9091() {
      return this.field_15655;
   }
}
