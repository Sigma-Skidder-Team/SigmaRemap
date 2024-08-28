package mapped;

public class Class9840 {
   public float[] field45939;
   public final int field45940;

   public Class9840(float[] var1, int var2) {
      this.field45939 = var1;
      this.field45940 = var2;
   }

   public float method38890(int var1) {
      if (this.field45939 == null) {
         throw new NullPointerException("uvs");
      } else {
         int var4 = this.method38892(var1);
         return this.field45939[var4 != 0 && var4 != 1 ? 2 : 0];
      }
   }

   public float method38891(int var1) {
      if (this.field45939 == null) {
         throw new NullPointerException("uvs");
      } else {
         int var4 = this.method38892(var1);
         return this.field45939[var4 != 0 && var4 != 3 ? 3 : 1];
      }
   }

   private int method38892(int var1) {
      return (var1 + this.field45940 / 90) % 4;
   }

   public int method38893(int var1) {
      return (var1 + 4 - this.field45940 / 90) % 4;
   }

   public void method38894(float[] var1) {
      if (this.field45939 == null) {
         this.field45939 = var1;
      }
   }
}
