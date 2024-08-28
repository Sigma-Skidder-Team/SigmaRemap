package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1346 extends Class789 {
   private final String field7169;
   private final Class6130 field7170;
   private final int field7171;
   private final boolean field7172;
   private final long field7173;
   private ITextComponent field7174 = new TranslationTextComponent("mco.reset.world.resetting.screen.title");
   private final Runnable field7175;

   public Class1346(String var1, Class6130 var2, int var3, boolean var4, long var5, ITextComponent var7, Runnable var8) {
      this.field7169 = var1;
      this.field7170 = var2;
      this.field7171 = var3;
      this.field7172 = var4;
      this.field7173 = var5;
      if (var7 != null) {
         this.field7174 = var7;
      }

      this.field7175 = var8;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();
      this.method1908(this.field7174);
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method1909()) {
               return;
            }

            if (this.field7170 != null) {
               var3.method14570(this.field7173, this.field7170.field27464);
            } else {
               var3.method14569(this.field7173, this.field7169, this.field7171, this.field7172);
            }

            if (this.method1909()) {
               return;
            }

            this.field7175.run();
            return;
         } catch (Class2436 var6) {
            if (this.method1909()) {
               return;
            }

            method1904(var6.field16476);
            var4++;
         } catch (Exception var7) {
            if (this.method1909()) {
               return;
            }

            field4133.error("Couldn't reset world");
            this.method1918(var7.toString());
            return;
         }
      }
   }
}
