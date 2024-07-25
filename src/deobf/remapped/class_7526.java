package remapped;

public class class_7526 implements class_6948 {
   private static String[] field_38436;
   private float field_38434;

   private class_7526(class_487 var1, float var2) {
      this.field_38435 = var1;
      this.field_38434 = var2;
   }

   @Override
   public float method_31784(float var1) {
      return (float)(Math.random() * (double)this.field_38434);
   }

   public void method_34294(float var1) {
      this.field_38434 = var1;
   }

   public float method_34296() {
      return this.field_38434;
   }
}
