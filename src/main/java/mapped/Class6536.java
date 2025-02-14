package mapped;

import java.util.logging.Level;


public class Class6536 implements Class6515 {
   private Class6516 field28824;
   private boolean field28825;
   private boolean field28826;
   private int field28827;
   private final Class6525 field28828;
   private final Class6522[] field28829;
   private final Class6521[] field28830;
   private final Class6524[] field28831;
   private final Class6526[] field28832;
   private int field28833;
   private int field28834;
   private int field28835;
   private int field28836;
   private float[][] field28837;

   public Class6536(Class6516 var1) {
      this.field28824 = var1;
      this.field28828 = new Class6525();
      this.field28829 = new Class6522[64];
      this.field28830 = new Class6521[16];
      this.field28831 = new Class6524[16];
      this.field28832 = new Class6526[16];
      this.method19844();
   }

   public final void method19844() {
      this.field28833 = 0;
      this.field28834 = 0;
      this.field28835 = 0;
      this.field28836 = 0;
      this.field28825 = false;
      this.field28826 = false;
      this.field28827 = 0;
   }

   public void method19845(Class9189 var1) throws Class2460 {
      int var4 = var1.method34394();
      Class6522 var5 = null;
      boolean var6 = true;
      if (this.field28824.method19744().method8218()) {
         switch (Class7102.field30548[this.field28824.method19733().ordinal()]) {
            case 1:
               this.method19846(var1);
               break;
            case 2:
               this.method19847(var1);
               break;
            case 3:
               this.method19846(var1);
               this.method19847(var1);
               break;
            case 4:
               this.method19846(var1);
               this.method19847(var1);
               this.method19846(var1);
               break;
            case 5:
               this.method19846(var1);
               this.method19847(var1);
               this.method19847(var1);
               break;
            case 6:
               this.method19846(var1);
               this.method19847(var1);
               this.method19847(var1);
               this.method19846(var1);
               break;
            case 7:
               this.method19846(var1);
               this.method19847(var1);
               this.method19847(var1);
               this.method19847(var1);
               this.method19846(var1);
               break;
            default:
               throw new Class2460("unsupported channel configuration for error resilience: " + this.field28824.method19733());
         }
      } else {
         int var7;
         while (var6 && (var7 = var1.method34397(3)) != 7) {
            switch (var7) {
               case 0:
               case 3:
                  field28529.finest("SCE");
                  var5 = this.method19846(var1);
                  break;
               case 1:
                  field28529.finest("CPE");
                  var5 = this.method19847(var1);
                  break;
               case 2:
                  field28529.finest("CCE");
                  this.method19848(var1);
                  var5 = null;
                  break;
               case 4:
                  field28529.finest("DSE");
                  this.method19849(var1);
                  var5 = null;
                  break;
               case 5:
                  field28529.finest("PCE");
                  this.method19850(var1);
                  var5 = null;
                  break;
               case 6:
                  field28529.finest("FIL");
                  this.method19851(var1, var5);
                  var5 = null;
            }
         }

         field28529.finest("END");
         var6 = false;
         var5 = null;
      }

      var1.method34392();
      this.field28827 = var1.method34394() - var4;
   }

   private Class6522 method19846(Class9189 var1) throws Class2460 {
      if (this.field28829[this.field28833] == null) {
         this.field28829[this.field28833] = new Class6523(this.field28824.method19741());
      }

      ((Class6523)this.field28829[this.field28833]).method19779(var1, this.field28824);
      this.field28833++;
      return this.field28829[this.field28833 - 1];
   }

   private Class6522 method19847(Class9189 var1) throws Class2460 {
      if (this.field28829[this.field28833] == null) {
         this.field28829[this.field28833] = new Class6527(this.field28824.method19741());
      }

      ((Class6527)this.field28829[this.field28833]).method19791(var1, this.field28824);
      this.field28833++;
      return this.field28829[this.field28833 - 1];
   }

   private void method19848(Class9189 var1) throws Class2460 {
      if (this.field28834 != 16) {
         if (this.field28830[this.field28834] == null) {
            this.field28830[this.field28834] = new Class6521(this.field28824.method19741());
         }

         this.field28830[this.field28834].method19770(var1, this.field28824);
         this.field28834++;
      } else {
         throw new Class2460("too much CCE elements");
      }
   }

   private void method19849(Class9189 var1) throws Class2460 {
      if (this.field28835 != 16) {
         if (this.field28831[this.field28835] == null) {
            this.field28831[this.field28835] = new Class6524();
         }

         this.field28831[this.field28835].method19781(var1);
         this.field28835++;
      } else {
         throw new Class2460("too much CCE elements");
      }
   }

   private void method19850(Class9189 var1) throws Class2460 {
      this.field28828.method19782(var1);
      this.field28824.method19745(this.field28828.method19784());
      this.field28824.method19747(this.field28828.method19785());
      this.field28824.method19734(Class188.method574(this.field28828.method19786()));
   }

   private void method19851(Class9189 var1, Class6522 var2) throws Class2460 {
      if (this.field28836 != 16) {
         if (this.field28832[this.field28836] == null) {
            this.field28832[this.field28836] = new Class6526(this.field28824.method19749());
         }

         this.field28832[this.field28836].method19787(var1, var2, this.field28824.method19746(), this.field28824.method19750(), this.field28824.method19742());
         this.field28836++;
         if (var2 != null && var2.method19777()) {
            this.field28825 = true;
            if (!this.field28826 && var2.method19778().method19821()) {
               this.field28826 = true;
            }
         }
      } else {
         throw new Class2460("too much FIL elements");
      }
   }

   public void method19852(Class6518 var1) throws Class2460 {
      Class1955 var4 = this.field28824.method19744();
      Class2288 var5 = this.field28824.method19746();
      int var6 = this.field28824.method19733().method575();
      if (var6 == 1 && this.field28826) {
         var6++;
      }

      int var7 = !this.field28825 ? 1 : 2;
      if (this.field28837 == null || var6 != this.field28837.length || var7 * this.field28824.method19741() != this.field28837[0].length) {
         this.field28837 = new float[var6][var7 * this.field28824.method19741()];
      }

      int var8 = 0;

      for (int var9 = 0; var9 < this.field28829.length && var8 < var6; var9++) {
         Class6522 var10 = this.field28829[var9];
         if (var10 != null) {
            if (!(var10 instanceof Class6523)) {
               if (!(var10 instanceof Class6527)) {
                  if (var10 instanceof Class6521) {
                     ((Class6521)var10).method19771();
                     var8++;
                  }
               } else {
                  Class6527 var12 = (Class6527)var10;
                  this.method19854(var12, var1, var8, var4, var5);
                  var8 += 2;
               }
            } else {
               Class6523 var11 = (Class6523)var10;
               var8 += this.method19853(var11, var1, var8, var4, var5);
            }
         }
      }
   }

   private int method19853(Class6523 var1, Class6518 var2, int var3, Class1955 var4, Class2288 var5) throws Class2460 {
      Class6512 var8 = var1.method19780();
      Class6538 var9 = var8.method19720();
      Class6537 var10 = var9.method19879();
      int var11 = var1.method19775();
      float[] var12 = var8.method19719();
      if (var4.equals(Class1955.field12729) && var9.method19876()) {
         var9.method19877().method38027(var8, var12, var5);
      }

      if (Class6537.method19862(var4) && var9.method19878()) {
         var10.method19860(var8, var12, var2, var5);
      }

      this.method19856(false, var11, 0, var12, null);
      if (var8.method19724()) {
         var8.method19725().method19885(var8, var12, var5, false);
      }

      this.method19856(false, var11, 1, var12, null);
      var2.method19762(var9.method19873(), var9.method19875(1), var9.method19875(0), var12, this.field28837[var3], var3);
      if (Class6537.method19862(var4)) {
         var10.method19861(this.field28837[var3], var2.method19764(var3), var4);
      }

      this.method19855(false, var11, this.field28837[var3], null);
      if (var8.method19730()) {
         var8.method19731().method28977(var12, var9.method19875(1), var9.method19875(0), var9.method19873());
      }

      byte var13 = 1;
      if (this.field28825 && this.field28824.method19750()) {
         if (this.field28837[var3].length == this.field28824.method19741()) {
            field28529.log(Level.WARNING, "SBR data present, but buffer has normal size!");
         }

         Class6528 var14 = var1.method19778();
         if (!var14.method19821()) {
            var1.method19778().method19819(this.field28837[var3], false);
         } else {
            var13 = 2;
            var1.method19778().method19818(this.field28837[var3], this.field28837[var3 + 1], false);
         }
      }

      return var13;
   }

   private void method19854(Class6527 var1, Class6518 var2, int var3, Class1955 var4, Class2288 var5) throws Class2460 {
      Class6512 var8 = var1.method19792();
      Class6512 var9 = var1.method19793();
      Class6538 var10 = var8.method19720();
      Class6538 var11 = var9.method19720();
      Class6537 var12 = var10.method19879();
      Class6537 var13 = !var1.method19797() ? var11.method19879() : var10.method19881();
      int var14 = var1.method19775();
      float[] var15 = var8.method19719();
      float[] var16 = var9.method19719();
      if (var1.method19797() && var1.method19796()) {
         Class6543.method19890(var1, var15, var16);
      }

      if (var4.equals(Class1955.field12729)) {
         if (var10.method19876()) {
            var10.method19877().method38027(var8, var15, var5);
         }

         if (var11.method19876()) {
            var11.method19877().method38027(var9, var16, var5);
         }
      }

      Class6514.method19732(var1, var15, var16);
      if (Class6537.method19862(var4)) {
         if (var10.method19878()) {
            var12.method19860(var8, var15, var2, var5);
         }

         if (var1.method19797() && var10.method19880()) {
            var13.method19860(var9, var16, var2, var5);
         } else if (var11.method19878()) {
            var13.method19860(var9, var16, var2, var5);
         }
      }

      this.method19856(true, var14, 0, var15, var16);
      if (var8.method19724()) {
         var8.method19725().method19885(var8, var15, var5, false);
      }

      if (var9.method19724()) {
         var9.method19725().method19885(var9, var16, var5, false);
      }

      this.method19856(true, var14, 1, var15, var16);
      var2.method19762(var10.method19873(), var10.method19875(1), var10.method19875(0), var15, this.field28837[var3], var3);
      var2.method19762(var11.method19873(), var11.method19875(1), var11.method19875(0), var16, this.field28837[var3 + 1], var3 + 1);
      if (Class6537.method19862(var4)) {
         var12.method19861(this.field28837[var3], var2.method19764(var3), var4);
         var13.method19861(this.field28837[var3 + 1], var2.method19764(var3 + 1), var4);
      }

      this.method19855(true, var14, this.field28837[var3], this.field28837[var3 + 1]);
      if (var8.method19730()) {
         var8.method19731().method28977(var15, var10.method19875(1), var10.method19875(0), var10.method19873());
      }

      if (var9.method19730()) {
         var9.method19731().method28977(var16, var11.method19875(1), var11.method19875(0), var11.method19873());
      }

      if (this.field28825 && this.field28824.method19750()) {
         if (this.field28837[var3].length == this.field28824.method19741()) {
            field28529.log(Level.WARNING, "SBR data present, but buffer has normal size!");
         }

         var1.method19778().method19818(this.field28837[var3], this.field28837[var3 + 1], false);
      }
   }

   private void method19855(boolean var1, int var2, float[] var3, float[] var4) {
      for (int var7 = 0; var7 < this.field28830.length; var7++) {
         Class6521 var8 = this.field28830[var7];
         int var9 = 0;
         if (var8 != null && var8.method19765() == 2) {
            for (int var10 = 0; var10 <= var8.method19766(); var10++) {
               int var11 = var8.method19769(var10);
               if (var8.method19767(var10) == var1 && var8.method19768(var10) == var2) {
                  if (var11 != 1) {
                     var8.method19772(var9, var3);
                     if (var11 != 0) {
                        var9++;
                     }
                  }

                  if (var11 != 2) {
                     var8.method19772(var9, var4);
                     var9++;
                  }
               } else {
                  var9 += 1 + (var11 != 3 ? 0 : 1);
               }
            }
         }
      }
   }

   private void method19856(boolean var1, int var2, int var3, float[] var4, float[] var5) {
      for (int var8 = 0; var8 < this.field28830.length; var8++) {
         Class6521 var9 = this.field28830[var8];
         int var10 = 0;
         if (var9 != null && var9.method19765() == var3) {
            for (int var11 = 0; var11 <= var9.method19766(); var11++) {
               int var12 = var9.method19769(var11);
               if (var9.method19767(var11) == var1 && var9.method19768(var11) == var2) {
                  if (var12 != 1) {
                     var9.method19773(var10, var4);
                     if (var12 != 0) {
                        var10++;
                     }
                  }

                  if (var12 != 2) {
                     var9.method19773(var10, var5);
                     var10++;
                  }
               } else {
                  var10 += 1 + (var12 != 3 ? 0 : 1);
               }
            }
         }
      }
   }

   public void method19857(SampleBuffer var1) {
      boolean var4 = var1.method28530();
      int var5 = this.field28837.length;
      int var6 = this.field28825 && this.field28824.method19750() ? 2 : 1;
      int var7 = var6 * this.field28824.method19741();
      int var8 = var6 * this.field28824.method19746().method9033();
      byte[] var9 = var1.getData();
      if (var9.length != var5 * var7 * 2) {
         var9 = new byte[var5 * var7 * 2];
      }

      for (int var10 = 0; var10 < var5; var10++) {
         float[] var11 = this.field28837[var10];

         for (int var12 = 0; var12 < var7; var12++) {
            short var13 = (short)Math.max(Math.min(Math.round(var11[var12]), 32767), -32768);
            int var14 = (var12 * var5 + var10) * 2;
            if (!var4) {
               var9[var14 + 1] = (byte)(var13 >> 8 & 0xFF);
               var9[var14] = (byte)(var13 & 255);
            } else {
               var9[var14] = (byte)(var13 >> 8 & 0xFF);
               var9[var14 + 1] = (byte)(var13 & 255);
            }
         }
      }

      var1.method28532(var9, var8, var5, 16, this.field28827);
   }
}
