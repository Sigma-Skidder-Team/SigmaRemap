package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class Class4377 extends Class4235 {
   private String[] field21384;
   private int field21385;

   public Class4377(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, Class6387 var9, String var10, ClientResource var11) {
      super(var1, var2, var3, var4, var5, var6, ResourcesDecrypter.skinPNG, var9, var10, var11);
      this.field21384 = var7;
      this.field21385 = var8;
      this.method13719();
   }

   public Class4377(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, Class6387 var9, String var10) {
      super(var1, var2, var3, var4, var5, var6, ResourcesDecrypter.skinPNG, var9, var10);
      this.field21384 = var7;
      this.field21385 = var8;
      this.method13719();
   }

   public Class4377(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, Class6387 var9) {
      super(var1, var2, var3, var4, var5, var6, ResourcesDecrypter.skinPNG, var9);
      this.field21384 = var7;
      this.field21385 = var8;
      this.method13719();
   }

   public Class4377(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, ResourcesDecrypter.skinPNG);
      this.field21384 = var7;
      this.field21385 = var8;
      this.method13719();
   }

   private void method13719() {
      if (this.field21385 >= 0 && this.field21385 < this.field21384.length) {
         this.method13306(ResourceRegistry.JelloLightFont20);
         this.method13304(this.field21384[this.field21385]);
      } else {
         throw new RuntimeException("Invalid index for TypeButton");
      }
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      this.method13721(this.method13720() + 1);
      super.method13089(var1, var2, var3);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      super.method13027(var1);
   }

   public int method13720() {
      return this.field21385;
   }

   public void method13721(int var1) {
      this.method13722(var1, true);
   }

   public void method13722(int var1, boolean var2) {
      var1 %= this.field21384.length;
      if (var1 != this.field21385) {
         this.field21385 = var1;
         this.method13304(this.field21384[var1]);
         if (var2) {
            this.method13037();
         }
      }
   }

   public String[] method13723() {
      return this.field21384;
   }
}
