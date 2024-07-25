package remapped;

public final class class_4886 implements Runnable {
   public class_4886(class_4903 var1, long var2, long var4, class_7975 var6, class_7975 var7) {
      this.field_24295 = var1;
      this.field_24296 = var2;
      this.field_24293 = var4;
      this.field_24294 = var6;
      this.field_24298 = var7;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      switch (this.field_24295) {
         case field_25349:
            for (long var16 = this.field_24296; var16 < this.field_24293; var16++) {
               this.field_24294.method_36117(var16, this.field_24298.method_36121(var16));
            }
            break;
         case field_25343:
            for (long var15 = this.field_24296; var15 < this.field_24293; var15++) {
               this.field_24294.method_36129(var15, this.field_24298.method_36124(var15));
            }
            break;
         case field_25342:
            for (long var14 = this.field_24296; var14 < this.field_24293; var14++) {
               this.field_24294.method_36092(var14, this.field_24298.method_36079(var14));
            }
            break;
         case field_25350:
            for (long var13 = this.field_24296; var13 < this.field_24293; var13++) {
               this.field_24294.method_36131(var13, this.field_24298.method_36076(var13));
            }
            break;
         case field_25353:
            for (long var12 = this.field_24296; var12 < this.field_24293; var12++) {
               this.field_24294.method_36123(var12, this.field_24298.method_36133(var12));
            }
            break;
         case field_25351:
            for (long var11 = this.field_24296; var11 < this.field_24293; var11++) {
               this.field_24294.method_36114(var11, this.field_24298.method_36107(var11));
            }
            break;
         case field_25352:
            if (this.field_24298.method_36099() == class_4903.field_25354) {
               for (long var9 = this.field_24296; var9 < this.field_24293; var9++) {
                  ((class_2384)this.field_24294).method_10886(var9, ((class_9245)this.field_24298).method_42617(var9));
               }
            } else {
               for (long var10 = this.field_24296; var10 < this.field_24293; var10++) {
                  this.field_24294.method_36123(var10, this.field_24298.method_36133(var10));
               }
            }
            break;
         case field_25354:
            if (this.field_24298.method_36099() == class_4903.field_25352) {
               for (long var7 = this.field_24296; var7 < this.field_24293; var7++) {
                  ((class_9245)this.field_24294).method_42621(var7, ((class_2384)this.field_24298).method_10878(var7));
               }
            } else {
               for (long var8 = this.field_24296; var8 < this.field_24293; var8++) {
                  this.field_24294.method_36114(var8, this.field_24298.method_36107(var8));
               }
            }
            break;
         case field_25345:
            for (long var6 = this.field_24296; var6 < this.field_24293; var6++) {
               this.field_24294.method_36122(var6, this.field_24298.method_36098(var6).toString());
            }
            break;
         case field_25348:
            for (long var5 = this.field_24296; var5 < this.field_24293; var5++) {
               this.field_24294.method_36122(var5, this.field_24298.method_36098(var5));
            }
            break;
         case field_25346:
            for (long var3 = this.field_24296; var3 < this.field_24293; var3++) {
               this.field_24294.method_36086(var3, this.field_24298.method_36103(var3));
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }
}
