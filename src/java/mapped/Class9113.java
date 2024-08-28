package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class9113 {
   private static String[] field41874;
   private final ITextComponent field41875;
   private long field41876;
   private Vector3d field41877;
   public final Class1269 field41878;

   public Class9113(Class1269 var1, ITextComponent var2, Vector3d var3) {
      this.field41878 = var1;
      this.field41875 = var2;
      this.field41877 = var3;
      this.field41876 = Util.milliTime();
   }

   public ITextComponent method33993() {
      return this.field41875;
   }

   public long method33994() {
      return this.field41876;
   }

   public Vector3d method33995() {
      return this.field41877;
   }

   public void method33996(Vector3d var1) {
      this.field41877 = var1;
      this.field41876 = Util.milliTime();
   }
}
