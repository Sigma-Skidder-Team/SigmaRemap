package mapped;

public class Class9710 {
   private Class8395 field45374;
   private int[] field45375;

   public Class9710(Class8395 var1) {
      this(var1, (int[])null);
   }

   public Class9710(Class8395 var1, int var2) {
      this(var1, new int[]{var2});
   }

   public Class9710(Class8395 var1, int[] var2) {
      this.field45374 = var1;
      this.field45375 = var2;
   }

   public boolean method38041(Class8395 var1, int var2) {
      return this.field45374 != var1 ? false : this.field45375 == null || Class7944.method26944(var2, this.field45375);
   }

   private boolean method38042(int var1) {
      return this.field45375 != null ? Class7944.method26944(var1, this.field45375) : false;
   }

   public boolean method38043(int var1) {
      if (this.field45375 != null) {
         if (!this.method38042(var1)) {
            this.field45375 = Class7944.method26965(this.field45375, var1);
            return true;
         } else {
            return false;
         }
      } else {
         this.field45375 = new int[]{var1};
         return true;
      }
   }

   public Class8395 method38044() {
      return this.field45374;
   }

   public int[] method38045() {
      return this.field45375;
   }

   public static boolean method38046(Class8395 var0, int var1, Class9710[] var2) {
      if (var2 == null) {
         return false;
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            Class9710 var6 = var2[var5];
            if (var6.method38041(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public String toString() {
      return this.field45375 != null ? "" + this.field45374 + ":" + Class7944.method26856(this.field45375) : "" + this.field45374;
   }
}
