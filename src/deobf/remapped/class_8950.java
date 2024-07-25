package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_8950 extends class_5875 {
   private final String field_45876;
   private final String field_45879;
   private final long field_45878;
   private final class_266 field_45877;

   public class_8950(long var1, String var3, String var4, class_266 var5) {
      this.field_45878 = var1;
      this.field_45876 = var3;
      this.field_45879 = var4;
      this.field_45877 = var5;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.create.world.wait"));
      class_176 var3 = class_176.method_777();

      try {
         var3.method_771(this.field_45878, this.field_45876, this.field_45879);
         method_26755(this.field_45877);
      } catch (class_3900 var5) {
         field_29831.error("Couldn't create world");
         this.method_38114(var5.toString());
      } catch (Exception var6) {
         field_29831.error("Could not create world");
         this.method_38114(var6.getLocalizedMessage());
      }
   }
}
