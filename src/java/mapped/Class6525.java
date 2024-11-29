package mapped;



public class Class6525 extends Class6522 {
   private static final int field28613 = 16;
   private static final int field28614 = 16;
   private static final int field28615 = 16;
   private static final int field28616 = 4;
   private static final int field28617 = 8;
   private static final int field28618 = 16;
   private Class1955 field28619;
   private Class2288 field28620;
   private int field28621;
   private int field28622;
   private int field28623;
   private int field28624;
   private int field28625;
   private int field28626;
   private boolean field28627;
   private boolean field28628;
   private boolean field28629;
   private int field28630;
   private int field28631;
   private int field28632;
   private boolean field28633;
   private final Class9043[] field28634 = new Class9043[16];
   private final Class9043[] field28635 = new Class9043[16];
   private final Class9043[] field28636 = new Class9043[16];
   private final int[] field28637 = new int[4];
   private final int[] field28638 = new int[8];
   private final Class8424[] field28639 = new Class8424[16];
   private byte[] field28640;

   public Class6525() {
      this.field28620 = Class2288.field15218;
   }

   public void method19782(Class9189 var1) throws Class2460 {
      this.method19774(var1);
      this.field28619 = Class1955.method8214(var1.method34397(2));
      this.field28620 = Class2288.method9030(var1.method34397(4));
      this.field28621 = var1.method34397(4);
      this.field28622 = var1.method34397(4);
      this.field28623 = var1.method34397(4);
      this.field28624 = var1.method34397(2);
      this.field28625 = var1.method34397(3);
      this.field28626 = var1.method34397(4);
      if (this.field28627 = var1.method34399()) {
         Class6515.field28529.warning("mono mixdown present, but not yet supported");
         this.field28630 = var1.method34397(4);
      }

      if (this.field28628 = var1.method34399()) {
         Class6515.field28529.warning("stereo mixdown present, but not yet supported");
         this.field28631 = var1.method34397(4);
      }

      if (this.field28629 = var1.method34399()) {
         Class6515.field28529.warning("matrix mixdown present, but not yet supported");
         this.field28632 = var1.method34397(2);
         this.field28633 = var1.method34399();
      }

      this.method19783(this.field28634, var1, this.field28621);
      this.method19783(this.field28635, var1, this.field28622);
      this.method19783(this.field28636, var1, this.field28623);

      for (int var4 = 0; var4 < this.field28624; var4++) {
         this.field28637[var4] = var1.method34397(4);
      }

      for (int var6 = 0; var6 < this.field28625; var6++) {
         this.field28638[var6] = var1.method34397(4);
      }

      for (int var7 = 0; var7 < this.field28626; var7++) {
         this.field28639[var7] = new Class8424(var1.method34399(), var1.method34397(4));
      }

      var1.method34392();
      int var5 = var1.method34397(8);
      this.field28640 = new byte[var5];

      for (int var8 = 0; var8 < var5; var8++) {
         this.field28640[var8] = (byte)var1.method34397(8);
      }
   }

   private void method19783(Class9043[] var1, Class9189 var2, int var3) throws Class2460 {
      for (int var6 = 0; var6 < var3; var6++) {
         var1[var6] = new Class9043(var2.method34399(), var2.method34397(4));
      }
   }

   public Class1955 method19784() {
      return this.field28619;
   }

   public Class2288 method19785() {
      return this.field28620;
   }

   public int method19786() {
      return this.field28621 + this.field28622 + this.field28623 + this.field28624 + this.field28625;
   }
}
