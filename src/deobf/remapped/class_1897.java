package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class class_1897 implements Packet<class_392> {
   private static String[] field_9688;
   public double field_9691;
   public double field_9689;
   public double field_9685;
   public float field_9686;
   public List<class_1331> field_9690;
   public float field_9687;
   public float field_9692;
   public float field_9693;

   public class_1897() {
   }

   public class_1897(double var1, double var3, double var5, float var7, List<class_1331> var8, class_1343 var9) {
      this.field_9691 = var1;
      this.field_9689 = var3;
      this.field_9685 = var5;
      this.field_9686 = var7;
      this.field_9690 = Lists.newArrayList(var8);
      if (var9 != null) {
         this.field_9687 = (float)var9.field_7336;
         this.field_9692 = (float)var9.field_7333;
         this.field_9693 = (float)var9.field_7334;
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_9691 = (double)var1.readFloat();
      this.field_9689 = (double)var1.readFloat();
      this.field_9685 = (double)var1.readFloat();
      this.field_9686 = var1.readFloat();
      int var4 = var1.readInt();
      this.field_9690 = Lists.newArrayListWithCapacity(var4);
      int var5 = class_9299.method_42847(this.field_9691);
      int var6 = class_9299.method_42847(this.field_9689);
      int var7 = class_9299.method_42847(this.field_9685);

      for (int var8 = 0; var8 < var4; var8++) {
         int var9 = var1.readByte() + var5;
         int var10 = var1.readByte() + var6;
         int var11 = var1.readByte() + var7;
         this.field_9690.add(new class_1331(var9, var10, var11));
      }

      this.field_9687 = var1.readFloat();
      this.field_9692 = var1.readFloat();
      this.field_9693 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeFloat((float)this.field_9691);
      var1.writeFloat((float)this.field_9689);
      var1.writeFloat((float)this.field_9685);
      var1.writeFloat(this.field_9686);
      var1.writeInt(this.field_9690.size());
      int var4 = class_9299.method_42847(this.field_9691);
      int var5 = class_9299.method_42847(this.field_9689);
      int var6 = class_9299.method_42847(this.field_9685);

      for (class_1331 var8 : this.field_9690) {
         int var9 = var8.method_12173() - var4;
         int var10 = var8.method_12165() - var5;
         int var11 = var8.method_12185() - var6;
         var1.writeByte(var9);
         var1.writeByte(var10);
         var1.writeByte(var11);
      }

      var1.writeFloat(this.field_9687);
      var1.writeFloat(this.field_9692);
      var1.writeFloat(this.field_9693);
   }

   public void method_8631(class_392 var1) {
      var1.method_1931(this);
   }

   public float method_8628() {
      return this.field_9687;
   }

   public float method_8627() {
      return this.field_9692;
   }

   public float method_8626() {
      return this.field_9693;
   }

   public double method_8624() {
      return this.field_9691;
   }

   public double method_8622() {
      return this.field_9689;
   }

   public double method_8623() {
      return this.field_9685;
   }

   public float method_8630() {
      return this.field_9686;
   }

   public List<class_1331> method_8629() {
      return this.field_9690;
   }
}
