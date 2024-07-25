package remapped;

import java.io.IOException;

public class class_8516 extends class_6926 {
   private int[] field_43597;
   private int[] field_43600;
   private int[] field_43599;

   public class_8516() {
      super("Sample Dependency Type Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      long var4 = -1L;
      if (this.field_19001.method_34608(1937011578L)) {
         var4 = (long)((class_2416)this.field_19001.method_34607(1937011578L)).method_11023();
      }

      this.field_43599 = new int[(int)var4];
      this.field_43600 = new int[(int)var4];
      this.field_43597 = new int[(int)var4];

      for (int var6 = 0; (long)var6 < var4; var6++) {
         byte var7 = (byte)var1.method_27531();
         this.field_43599[var6] = var7 & 3;
         this.field_43600[var6] = var7 >> 2 & 3;
         this.field_43597[var6] = var7 >> 4 & 3;
      }
   }

   public int[] method_39225() {
      return this.field_43597;
   }

   public int[] method_39223() {
      return this.field_43600;
   }

   public int[] method_39224() {
      return this.field_43599;
   }
}
