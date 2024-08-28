package mapped;

import java.awt.Color;
import java.util.List;

public class Class7186 extends Class7185 {
   private float field30868 = 1.0F;
   private float field30869 = 1.0F;

   public Class7186() {
      this.method22548(new Class6620(this));
   }

   public float method22550() {
      return this.field30868;
   }

   public void method22551(float var1) {
      this.field30868 = var1;
   }

   public float method22552() {
      return this.field30869;
   }

   public void method22553(float var1) {
      this.field30869 = var1;
   }

   public Class7186(int var1, Color var2) {
      super(var1, var2);
   }

   @Override
   public String toString() {
      return "Outline (Wobble)";
   }

   @Override
   public List method22540() {
      List var3 = super.method22540();
      var3.remove(2);
      var3.add(
         Class9439.method36286(
            "Detail",
            this.field30868,
            1.0F,
            50.0F,
            "This setting controls how detailed the outline will be. Smaller numbers cause the outline to have more detail."
         )
      );
      var3.add(Class9439.method36286("Amplitude", this.field30869, 0.5F, 50.0F, "This setting controls the amplitude of the outline."));
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      super.method22541(var1);

      for (Class5438 var5 : var1) {
         if (!var5.method17103().equals("Detail")) {
            if (var5.method17103().equals("Amplitude")) {
               this.field30869 = (Float)var5.method17100();
            }
         } else {
            this.field30868 = (Float)var5.method17100();
         }
      }
   }

   // $VF: synthetic method
   public static float method22554(Class7186 var0) {
      return var0.field30868;
   }

   // $VF: synthetic method
   public static float method22555(Class7186 var0) {
      return var0.field30869;
   }
}
