package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7979 extends class_5875 {
   private final String field_40868;
   private final class_2496 field_40861;
   private final int field_40862;
   private final boolean field_40864;
   private final long field_40867;
   private ITextComponent field_40865 = new TranslationTextComponent("mco.reset.world.resetting.screen.title");
   private final Runnable field_40863;

   public class_7979(String var1, class_2496 var2, int var3, boolean var4, long var5, ITextComponent var7, Runnable var8) {
      this.field_40868 = var1;
      this.field_40861 = var2;
      this.field_40862 = var3;
      this.field_40864 = var4;
      this.field_40867 = var5;
      if (var7 != null) {
         this.field_40865 = var7;
      }

      this.field_40863 = var8;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();
      this.method_26756(this.field_40865);
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method_26759()) {
               return;
            }

            if (this.field_40861 != null) {
               var3.method_789(this.field_40867, this.field_40861.field_12412);
            } else {
               var3.method_783(this.field_40867, this.field_40868, this.field_40862, this.field_40864);
            }

            if (this.method_26759()) {
               return;
            }

            this.field_40863.run();
            return;
         } catch (class_5954 var6) {
            if (this.method_26759()) {
               return;
            }

            method_26757(var6.field_30351);
            var4++;
         } catch (Exception var7) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Couldn't reset world");
            this.method_38114(var7.toString());
            return;
         }
      }
   }
}
