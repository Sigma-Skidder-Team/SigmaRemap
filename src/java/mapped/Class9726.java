package mapped;

import java.util.Map;
import java.util.Map.Entry;

public class Class9726 {
   private static String[] field45422;
   public final Class7680 field45423;
   public final Class7680 field45424;
   public final Map<Direction, Class9163> field45425;
   public final Class7360 field45426;
   public final boolean field45427;

   public Class9726(Class7680 var1, Class7680 var2, Map<Direction, Class9163> var3, Class7360 var4, boolean var5) {
      this.field45423 = var1;
      this.field45424 = var2;
      this.field45425 = var3;
      this.field45426 = var4;
      this.field45427 = var5;
      this.method38101();
   }

   private void method38101() {
      for (Entry var4 : this.field45425.entrySet()) {
         float[] var5 = this.method38102((Direction)var4.getKey());
         ((Class9163)var4.getValue()).field42069.method38894(var5);
      }
   }

   private float[] method38102(Direction var1) {
      switch (Class6405.field28026[var1.ordinal()]) {
         case 1:
            return new float[]{
               this.field45423.method25269(), 16.0F - this.field45424.method25271(), this.field45424.method25269(), 16.0F - this.field45423.method25271()
            };
         case 2:
            return new float[]{this.field45423.method25269(), this.field45423.method25271(), this.field45424.method25269(), this.field45424.method25271()};
         case 3:
         default:
            return new float[]{
               16.0F - this.field45424.method25269(),
               16.0F - this.field45424.method25270(),
               16.0F - this.field45423.method25269(),
               16.0F - this.field45423.method25270()
            };
         case 4:
            return new float[]{
               this.field45423.method25269(), 16.0F - this.field45424.method25270(), this.field45424.method25269(), 16.0F - this.field45423.method25270()
            };
         case 5:
            return new float[]{
               this.field45423.method25271(), 16.0F - this.field45424.method25270(), this.field45424.method25271(), 16.0F - this.field45423.method25270()
            };
         case 6:
            return new float[]{
               16.0F - this.field45424.method25271(),
               16.0F - this.field45424.method25270(),
               16.0F - this.field45423.method25271(),
               16.0F - this.field45423.method25270()
            };
      }
   }
}
