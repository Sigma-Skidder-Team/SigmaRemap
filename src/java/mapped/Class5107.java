package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class5107 implements Class5105 {
   private static String[] field23208;
   private final Class314 field23209;
   private final Class8586 field23210;

   public Class5107(Class314 var1, Class8586 var2) {
      this.field23209 = var1;
      this.field23210 = var2;
   }

   @Override
   public void method15595(Class5575 var1) {
      this.field23210.method30690(var1.method17508());
      this.field23210.method30692(new Class5109(this.field23209, this.field23210));
   }

   @Override
   public void method15588(ITextComponent var1) {
   }

   @Override
   public Class8586 method15589() {
      return this.field23210;
   }
}
