package mapped;

import net.minecraft.util.math.BlockPos;

public class Mutable extends BlockPos {
   public Mutable() {
      this(0, 0, 0);
   }

   public Mutable(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public Mutable(double var1, double var3, double var5) {
      this(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
   }

   @Override
   public BlockPos method8335(double var1, double var3, double var5) {
      return super.method8335(var1, var3, var5).method8353();
   }

   @Override
   public BlockPos method8336(int var1, int var2, int var3) {
      return super.method8336(var1, var2, var3).method8353();
   }

   @Override
   public BlockPos method8350(Direction var1, int var2) {
      return super.method8350(var1, var2).method8353();
   }

   @Override
   public BlockPos method8351(Class113 var1, int var2) {
      return super.method8351(var1, var2).method8353();
   }

   @Override
   public BlockPos method8352(Class80 var1) {
      return super.method8352(var1).method8353();
   }

   public Mutable method8372(int var1, int var2, int var3) {
      this.method8307(var1);
      this.method8308(var2);
      this.method8309(var3);
      return this;
   }

   public Mutable method8373(double var1, double var3, double var5) {
      return this.method8372(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
   }

   public Mutable method8374(Class1998 var1) {
      return this.method8372(var1.getX(), var1.getY(), var1.getZ());
   }

   public Mutable method8375(long var1) {
      return this.method8372(method8328(var1), method8329(var1), method8330(var1));
   }

   public Mutable method8376(Class2321 var1, int var2, int var3, int var4) {
      return this.method8372(
         var1.method9098(var2, var3, var4, Class113.field413),
         var1.method9098(var2, var3, var4, Class113.field414),
         var1.method9098(var2, var3, var4, Class113.field415)
      );
   }

   public Mutable method8377(Class1998 var1, Direction var2) {
      return this.method8372(var1.getX() + var2.method539(), var1.getY() + var2.method540(), var1.getZ() + var2.method541());
   }

   public Mutable method8378(Class1998 var1, int var2, int var3, int var4) {
      return this.method8372(var1.getX() + var2, var1.getY() + var3, var1.getZ() + var4);
   }

   public Mutable method8379(Direction var1) {
      return this.method8380(var1, 1);
   }

   public Mutable method8380(Direction var1, int var2) {
      return this.method8372(
         this.getX() + var1.method539() * var2, this.getY() + var1.method540() * var2, this.getZ() + var1.method541() * var2
      );
   }

   public Mutable method8381(int var1, int var2, int var3) {
      return this.method8372(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
   }

   public Mutable method8382(Class1998 var1) {
      return this.method8372(this.getX() + var1.getX(), this.getY() + var1.getY(), this.getZ() + var1.getZ());
   }

   public Mutable method8383(Class113 var1, int var2, int var3) {
      switch (Class4503.field21731[var1.ordinal()]) {
         case 1:
            return this.method8372(MathHelper.method37775(this.getX(), var2, var3), this.getY(), this.getZ());
         case 2:
            return this.method8372(this.getX(), MathHelper.method37775(this.getY(), var2, var3), this.getZ());
         case 3:
            return this.method8372(this.getX(), this.getY(), MathHelper.method37775(this.getZ(), var2, var3));
         default:
            throw new IllegalStateException("Unable to clamp axis " + var1);
      }
   }

   @Override
   public void method8307(int var1) {
      super.method8307(var1);
   }

   @Override
   public void method8308(int var1) {
      super.method8308(var1);
   }

   @Override
   public void method8309(int var1) {
      super.method8309(var1);
   }

   @Override
   public BlockPos method8353() {
      return new BlockPos(this);
   }
}
