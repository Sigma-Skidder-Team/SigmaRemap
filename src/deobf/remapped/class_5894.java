package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_5894 extends class_5875 {
   private final class_7675 field_29937;
   private final class_266 field_29938;
   private final boolean field_29934;
   private final class_7039 field_29936;

   public class_5894(class_7675 var1, class_266 var2, class_7039 var3, boolean var4) {
      this.field_29937 = var1;
      this.field_29938 = var2;
      this.field_29934 = var4;
      this.field_29936 = var3;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.configure.world.opening"));
      class_176 var3 = class_176.method_777();

      for (int var4 = 0; var4 < 25; var4++) {
         if (this.method_26759()) {
            return;
         }

         try {
            boolean var5 = var3.method_795(this.field_29937.field_39016);
            if (var5) {
               if (this.field_29938 instanceof class_2866) {
                  ((class_2866)this.field_29938).method_13151();
               }

               this.field_29937.field_39004 = class_6804.field_35061;
               if (this.field_29934) {
                  this.field_29936.method_32260(this.field_29937, this.field_29938);
               } else {
                  method_26755(this.field_29938);
               }
               break;
            }
         } catch (class_5954 var6) {
            if (this.method_26759()) {
               return;
            }

            method_26757(var6.field_30351);
         } catch (Exception var7) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Failed to open server", var7);
            this.method_38114("Failed to open the server");
         }
      }
   }
}
