package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1344 extends Class789 {
   private final Class6122 field7164;
   private final long field7165;
   private final Class815 field7166;

   public Class1344(Class6122 var1, long var2, Class815 var4) {
      this.field7164 = var1;
      this.field7165 = var2;
      this.field7166 = var4;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.backup.restoring"));
      Class4624 var3 = Class4624.method14543();
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method1909()) {
               return;
            }

            var3.method14562(this.field7165, this.field7164.field27410);
            method1904(1);
            if (this.method1909()) {
               return;
            }

            method1905(this.field7166.method2298());
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

            field4133.error("Couldn't restore backup", var7);
            method1905(new Class821(var7, this.field7166));
            return;
         } catch (Exception var8) {
            if (this.method1909()) {
               return;
            }

            field4133.error("Couldn't restore backup", var8);
            this.method1918(var8.getLocalizedMessage());
            return;
         }
      }
   }
}
