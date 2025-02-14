package mapped;

public final class Class644 implements Runnable {
   public final Class2178 field3220;
   public final long field3221;
   public final long field3222;
   public final Class2373 field3223;
   public final Class2373 field3224;

   public Class644(Class2178 var1, long var2, long var4, Class2373 var6, Class2373 var7) {
      this.field3220 = var1;
      this.field3221 = var2;
      this.field3222 = var4;
      this.field3223 = var6;
      this.field3224 = var7;
   }

   @Override
   public void run() {
      switch (Class8569.field38527[this.field3220.ordinal()]) {
         case 2:
            for (long var16 = this.field3221; var16 < this.field3222; var16++) {
               this.field3223.method9675(var16, this.field3224.method9641(var16));
            }
            break;
         case 3:
            for (long var15 = this.field3221; var15 < this.field3222; var15++) {
               this.field3223.method9679(var15, this.field3224.method9645(var15));
            }
            break;
         case 4:
            for (long var14 = this.field3221; var14 < this.field3222; var14++) {
               this.field3223.method9681(var14, this.field3224.method9647(var14));
            }
            break;
         case 5:
            for (long var13 = this.field3221; var13 < this.field3222; var13++) {
               this.field3223.method9683(var13, this.field3224.method9649(var13));
            }
            break;
         case 6:
            for (long var12 = this.field3221; var12 < this.field3222; var12++) {
               this.field3223.method9685(var12, this.field3224.method9651(var12));
            }
            break;
         case 7:
            for (long var11 = this.field3221; var11 < this.field3222; var11++) {
               this.field3223.method9687(var11, this.field3224.method9653(var11));
            }
            break;
         case 8:
            if (this.field3224.method9635() == Class2178.field14304) {
               for (long var9 = this.field3221; var9 < this.field3222; var9++) {
                  ((Class2380)this.field3223).method9715(var9, ((Class2377)this.field3224).method9700(var9));
               }
            } else {
               for (long var10 = this.field3221; var10 < this.field3222; var10++) {
                  this.field3223.method9685(var10, this.field3224.method9651(var10));
               }
            }
            break;
         case 9:
            if (this.field3224.method9635() == Class2178.field14303) {
               for (long var7 = this.field3221; var7 < this.field3222; var7++) {
                  ((Class2377)this.field3223).method9703(var7, ((Class2380)this.field3224).method9710(var7));
               }
            } else {
               for (long var8 = this.field3221; var8 < this.field3222; var8++) {
                  this.field3223.method9687(var8, this.field3224.method9653(var8));
               }
            }
            break;
         case 10:
            for (long var6 = this.field3221; var6 < this.field3222; var6++) {
               this.field3223.method9670(var6, this.field3224.method9636(var6).toString());
            }
            break;
         case 11:
            for (long var5 = this.field3221; var5 < this.field3222; var5++) {
               this.field3223.method9670(var5, this.field3224.method9636(var5));
            }
            break;
         case 12:
            for (long var3 = this.field3221; var3 < this.field3222; var3++) {
               this.field3223.method9677(var3, this.field3224.method9643(var3));
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }
}
