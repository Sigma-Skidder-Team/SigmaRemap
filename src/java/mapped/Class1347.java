package mapped;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1347 extends Class789 {
   private final long field7176;
   private final int field7177;
   private final Screen field7178;
   private final String field7179;

   public Class1347(long var1, int var3, String var4, Screen var5) {
      this.field7176 = var1;
      this.field7177 = var3;
      this.field7178 = var5;
      this.field7179 = var4;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.download.preparing"));
      Class4624 var3 = Class4624.method14543();
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method1909()) {
               return;
            }

            Class6120 var5 = var3.method14576(this.field7176, this.field7177);
            method1904(1);
            if (this.method1909()) {
               return;
            }

            method1905(new Class812(this.field7178, var5, this.field7179, var0 -> {
            }));
            return;
         } catch (Class2436 var6) {
            if (this.method1909()) {
               return;
            }

            method1904(var6.field16476);
            var4++;
         } catch (Class2435 var7) {
            if (this.method1909()) {
               return;
            }

            field4133.error("Couldn't download world data");
            method1905(new Class821(var7, this.field7178));
            return;
         } catch (Exception var8) {
            if (this.method1909()) {
               return;
            }

            field4133.error("Couldn't download world data", var8);
            this.method1918(var8.getLocalizedMessage());
            return;
         }
      }
   }
}
