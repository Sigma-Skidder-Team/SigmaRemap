package mapped;

public class Class2001 extends BlockPos {
   private int field13042;
   private int field13043;
   private int field13044;
   private int field13045;
   private Class2001[] field13046;
   private boolean field13047;

   public Class2001() {
      this(0, 0, 0, 0);
   }

   public Class2001(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public Class2001(double var1, double var3, double var5) {
      this(Class9679.method37769(var1), Class9679.method37769(var3), Class9679.method37769(var5));
   }

   public Class2001(int var1, int var2, int var3, int var4) {
      super(0, 0, 0);
      this.field13042 = var1;
      this.field13043 = var2;
      this.field13044 = var3;
      this.field13045 = var4;
   }

   @Override
   public int method8304() {
      return this.field13042;
   }

   @Override
   public int getY() {
      return this.field13043;
   }

   @Override
   public int method8306() {
      return this.field13044;
   }

   public void method8384(int var1, int var2, int var3) {
      this.field13042 = var1;
      this.field13043 = var2;
      this.field13044 = var3;
      this.field13047 = true;
   }

   public void method8385(double var1, double var3, double var5) {
      this.method8384(Class9679.method37769(var1), Class9679.method37769(var3), Class9679.method37769(var5));
   }

   @Override
   public BlockPos method8349(Direction var1) {
      if (this.field13045 > 0) {
         if (this.field13046 == null) {
            this.field13046 = new Class2001[Direction.field685.length];
         }

         if (this.field13047) {
            this.method8388();
         }

         int var4 = var1.method533();
         Class2001 var5 = this.field13046[var4];
         if (var5 == null) {
            int var6 = this.field13042 + var1.method539();
            int var7 = this.field13043 + var1.method540();
            int var8 = this.field13044 + var1.method541();
            var5 = new Class2001(var6, var7, var8, this.field13045 - 1);
            this.field13046[var4] = var5;
         }

         return var5;
      } else {
         return super.method8350(var1, 1).method8353();
      }
   }

   @Override
   public BlockPos method8350(Direction var1, int var2) {
      return var2 != 1 ? super.method8350(var1, var2).method8353() : this.method8349(var1);
   }

   public void method8386(BlockPos var1, Direction var2) {
      this.field13042 = var1.method8304() + var2.method539();
      this.field13043 = var1.getY() + var2.method540();
      this.field13044 = var1.method8306() + var2.method541();
   }

   public void method8387(BlockPos var1, Direction var2, Direction var3) {
      this.field13042 = var1.method8304() + var2.method539() + var3.method539();
      this.field13043 = var1.getY() + var2.method540() + var3.method540();
      this.field13044 = var1.method8306() + var2.method541() + var3.method541();
   }

   private void method8388() {
      for (int var3 = 0; var3 < 6; var3++) {
         Class2001 var4 = this.field13046[var3];
         if (var4 != null) {
            Direction var5 = Direction.field685[var3];
            int var6 = this.field13042 + var5.method539();
            int var7 = this.field13043 + var5.method540();
            int var8 = this.field13044 + var5.method541();
            var4.method8384(var6, var7, var8);
         }
      }

      this.field13047 = false;
   }

   @Override
   public BlockPos method8353() {
      return new BlockPos(this.field13042, this.field13043, this.field13044);
   }

   public static Iterable<BlockPos> method8359(BlockPos var0, BlockPos var1) {
      BlockPos var4 = new BlockPos(
         Math.min(var0.method8304(), var1.method8304()), Math.min(var0.getY(), var1.getY()), Math.min(var0.method8306(), var1.method8306())
      );
      BlockPos var5 = new BlockPos(
         Math.max(var0.method8304(), var1.method8304()), Math.max(var0.getY(), var1.getY()), Math.max(var0.method8306(), var1.method8306())
      );
      return new Class50(var4, var5);
   }
}
