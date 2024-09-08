package mapped;

import net.minecraft.client.Minecraft;

public abstract class Class1274<E extends Class1154<E>> extends Class1273<E> {
   private boolean field6800;

   public Class1274(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean changeFocus(boolean var1) {
      if (!this.field6800 && this.method6031() == 0) {
         return false;
      } else {
         this.field6800 = !this.field6800;
         if (this.field6800 && this.method6023() == null && this.method6031() > 0) {
            this.method6049(Class2220.field14504);
         } else if (this.field6800 && this.method6023() != null) {
            this.method6050();
         }

         return this.field6800;
      }
   }
}
