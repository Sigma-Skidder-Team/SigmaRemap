package remapped;

import com.google.common.collect.AbstractIterator;
import java.util.Random;

public final class class_3436 extends AbstractIterator<BlockPos> {
   private static String[] field_16894;
   public final class_2921 field_16890;
   public int field_16898;

   public class_3436(int var1, int var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      this.field_16899 = var1;
      this.field_16895 = var2;
      this.field_16897 = var3;
      this.field_16900 = var4;
      this.field_16893 = var5;
      this.field_16891 = var6;
      this.field_16892 = var7;
      this.field_16896 = var8;
      this.field_16890 = new class_2921();
      this.field_16898 = this.field_16899;
   }

   public BlockPos computeNext() {
      if (this.field_16898 > 0) {
         class_2921 var3 = this.field_16890
            .method_13362(
               this.field_16895 + this.field_16897.nextInt(this.field_16900),
               this.field_16893 + this.field_16897.nextInt(this.field_16891),
               this.field_16892 + this.field_16897.nextInt(this.field_16896)
            );
         this.field_16898--;
         return var3;
      } else {
         return (BlockPos)this.endOfData();
      }
   }
}
