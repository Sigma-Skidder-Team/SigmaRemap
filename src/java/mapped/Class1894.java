package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class1894 {
   field11101(-1, ""),
   field11102(0, "survival"),
   field11103(1, "creative"),
   field11104(2, "adventure"),
   field11105(3, "spectator");

   private final int field11106;
   private final String field11107;
   private static final Class1894[] field11108 = new Class1894[]{field11101, field11102, field11103, field11104, field11105};

   private Class1894(int var3, String var4) {
      this.field11106 = var3;
      this.field11107 = var4;
   }

   public int method8152() {
      return this.field11106;
   }

   public String method8153() {
      return this.field11107;
   }

   public ITextComponent method8154() {
      return new TranslationTextComponent("gameMode." + this.field11107);
   }

   public void method8155(Class6799 var1) {
      if (this != field11103) {
         if (this != field11105) {
            var1.field29608 = false;
            var1.field29609 = false;
            var1.field29606 = false;
            var1.field29607 = false;
         } else {
            var1.field29608 = true;
            var1.field29609 = false;
            var1.field29606 = true;
            var1.field29607 = true;
         }
      } else {
         var1.field29608 = true;
         var1.field29609 = true;
         var1.field29606 = true;
      }

      var1.field29610 = !this.method8156();
   }

   public boolean method8156() {
      return this == field11104 || this == field11105;
   }

   public boolean method8157() {
      return this == field11103;
   }

   public boolean method8158() {
      return this == field11102 || this == field11104;
   }

   public static Class1894 method8159(int var0) {
      return method8160(var0, field11102);
   }

   public static Class1894 method8160(int var0, Class1894 var1) {
      for (Class1894 var7 : values()) {
         if (var7.field11106 == var0) {
            return var7;
         }
      }

      return var1;
   }

   public static Class1894 method8161(String var0) {
      return method8162(var0, field11102);
   }

   public static Class1894 method8162(String var0, Class1894 var1) {
      for (Class1894 var7 : values()) {
         if (var7.field11107.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }
}
