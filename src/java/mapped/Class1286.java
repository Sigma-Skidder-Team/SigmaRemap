package mapped;

import java.util.Collection;

public abstract class Class1286<E extends Class1155<E>> extends Class1274<E> {
   public Class1286(int var1, int var2, int var3, int var4, int var5) {
      super(Minecraft.getInstance(), var1, var2, var3, var4, var5);
   }

   public void method6108(int var1) {
      if (var1 != -1) {
         if (super.method6031() != 0) {
            this.method6024(this.method6029(var1));
         }
      } else {
         this.method6024(null);
      }
   }

   public void method6109(int var1) {
      this.method6108(var1);
   }

   public void method6110(int var1, int var2, double var3, double var5, int var7) {
   }

   @Override
   public int method6036() {
      return 0;
   }

   @Override
   public int method6048() {
      return this.method6053() + this.method6022();
   }

   @Override
   public int method6022() {
      return (int)((double)this.field6785 * 0.6);
   }

   @Override
   public void method6028(Collection<E> var1) {
      super.method6028(var1);
   }

   @Override
   public int method6031() {
      return super.method6031();
   }

   @Override
   public int method6055(int var1) {
      return super.method6055(var1);
   }

   @Override
   public int method6053() {
      return super.method6053();
   }

   public int method6030(E var1) {
      return super.method6030((E)var1);
   }

   public void method6111() {
      this.method6027();
   }
}
