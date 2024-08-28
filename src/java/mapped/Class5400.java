package mapped;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Class5400 implements Class5391 {
   private static String[] field24076;
   private final Class8848 field24077;
   private final int field24078;
   private final int field24079;
   private final int field24080;
   private final int field24081;
   private final Class3257 field24082;
   private final int field24083;
   private final float field24084;

   public Class5400(Class3257 var1, int var2, Class3257 var3, int var4, int var5, int var6, int var7) {
      this.field24077 = new Class8848(var3);
      this.field24079 = var5;
      this.field24080 = var6;
      this.field24081 = var7;
      this.field24082 = var1;
      this.field24083 = var2;
      this.field24078 = var4;
      this.field24084 = 0.05F;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      Class8848 var5 = new Class8848(Class8514.field38049, this.field24079);
      List var6 = Class2348.field16076.method9192().filter(var0 -> !var0.method31816().isEmpty() && Class7105.method22135(var0)).collect(Collectors.toList());
      Class8812 var7 = (Class8812)var6.get(var2.nextInt(var6.size()));
      Class8848 var8 = Class9741.method38187(new Class8848(this.field24077.method32107(), this.field24078), var7);
      return new Class9346(var5, new Class8848(this.field24082, this.field24083), var8, this.field24080, this.field24081, this.field24084);
   }
}
