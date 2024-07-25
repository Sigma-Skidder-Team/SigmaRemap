package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_7897 implements class_2995 {
   private static String[] field_40386;
   private final List<class_1331> field_40382 = Lists.newArrayList();
   private final List<Float> field_40385 = Lists.newArrayList();
   private final List<Float> field_40381 = Lists.newArrayList();
   private final List<Float> field_40384 = Lists.newArrayList();
   private final List<Float> field_40383 = Lists.newArrayList();
   private final List<Float> field_40380 = Lists.newArrayList();

   public void method_35695(class_1331 var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_40382.add(var1);
      this.field_40385.add(var2);
      this.field_40381.add(var6);
      this.field_40384.add(var3);
      this.field_40383.add(var4);
      this.field_40380.add(var5);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_3542.method_16438();
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16354();
      class_8042 var11 = class_8042.method_36499();
      class_9633 var12 = var11.method_36501();
      var12.method_44471(5, class_7985.field_40903);

      for (int var13 = 0; var13 < this.field_40382.size(); var13++) {
         class_1331 var14 = this.field_40382.get(var13);
         Float var15 = this.field_40385.get(var13);
         float var16 = var15 / 2.0F;
         WorldRenderer.method_20064(
            var12,
            (double)((float)var14.method_12173() + 0.5F - var16) - var3,
            (double)((float)var14.method_12165() + 0.5F - var16) - var5,
            (double)((float)var14.method_12185() + 0.5F - var16) - var7,
            (double)((float)var14.method_12173() + 0.5F + var16) - var3,
            (double)((float)var14.method_12165() + 0.5F + var16) - var5,
            (double)((float)var14.method_12185() + 0.5F + var16) - var7,
            this.field_40384.get(var13),
            this.field_40383.get(var13),
            this.field_40380.get(var13),
            this.field_40381.get(var13)
         );
      }

      var11.method_36500();
      class_3542.method_16432();
      class_3542.method_16489();
   }
}
