package remapped;

import net.sourceforge.jaad.aac.AACException;

public abstract class class_7958 implements class_3471 {
   private int field_40772;
   private class_8470 field_40773;

   public void method_36003(class_7390 var1) throws AACException {
      this.field_40772 = var1.method_33662(4);
   }

   public int method_36007() {
      return this.field_40772;
   }

   public void method_36005(class_7390 var1, class_8965 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) throws AACException {
      if (this.field_40773 == null) {
         this.field_40773 = new class_8470(var7, this.field_40772 == 1, var2, var6);
      }

      this.field_40773.method_38964(var1, var3);
   }

   public boolean method_36004() {
      return this.field_40773 != null;
   }

   public class_8470 method_36006() {
      return this.field_40773;
   }
}
