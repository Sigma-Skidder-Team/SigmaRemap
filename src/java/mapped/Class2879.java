package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class Class2879<T extends Entity> extends Class2803<T> {
   private static String[] field17851;
   private final Class7219 field17852;
   private final Class7219[] field17853 = new Class7219[8];
   private final ImmutableList<Class7219> field17854;

   public Class2879() {
      byte var3 = -16;
      this.field17852 = new Class7219(this, 0, 0);
      this.field17852.method22673(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
      this.field17852.field31033 += 8.0F;

      for (int var4 = 0; var4 < this.field17853.length; var4++) {
         this.field17853[var4] = new Class7219(this, 48, 0);
         double var5 = (double)var4 * Math.PI * 2.0 / (double)this.field17853.length;
         float var7 = (float)Math.cos(var5) * 5.0F;
         float var8 = (float)Math.sin(var5) * 5.0F;
         this.field17853[var4].method22673(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
         this.field17853[var4].field31032 = var7;
         this.field17853[var4].field31034 = var8;
         this.field17853[var4].field31033 = 15.0F;
         var5 = (double)var4 * Math.PI * -2.0 / (double)this.field17853.length + (Math.PI / 2);
         this.field17853[var4].field31036 = (float)var5;
      }

      Builder var9 = ImmutableList.builder();
      var9.add(this.field17852);
      var9.addAll(Arrays.<Class7219>asList(this.field17853));
      this.field17854 = var9.build();
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (Class7219 var12 : this.field17853) {
         var12.field31035 = var4;
      }
   }

   @Override
   public Iterable<Class7219> method11015() {
      return this.field17854;
   }
}
