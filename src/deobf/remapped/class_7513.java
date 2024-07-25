package remapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class class_7513 {
   private static final Object2ObjectMap<class_4639, class_7513> field_38367 = Util.<Object2ObjectMap<class_4639, class_7513>>method_44659(
      new Object2ObjectArrayMap(), var0 -> {
         class_570 var3 = new class_570();
         var0.defaultReturnValue(var3);
         var0.put(class_8760.field_44835, var3);
         var0.put(class_8760.field_44849, new class_6134());
         var0.put(class_8760.field_44825, new class_5109());
      }
   );
   private final float[] field_38369 = new float[4];
   private final float field_38371;
   private final boolean field_38368;
   private final class_9571 field_38372;
   private final boolean field_38373;
   private final boolean field_38370;

   public class_7513(float var1, boolean var2, class_9571 var3, boolean var4, boolean var5) {
      this.field_38371 = var1;
      this.field_38368 = var2;
      this.field_38372 = var3;
      this.field_38373 = var4;
      this.field_38370 = var5;
   }

   public static class_7513 method_34250(class_8760 var0) {
      return (class_7513)field_38367.get(var0.method_40226());
   }

   @Nullable
   public float[] method_34248(float var1, float var2) {
      float var5 = 0.4F;
      float var6 = class_9299.method_42840(var1 * (float) (Math.PI * 2)) - 0.0F;
      float var7 = -0.0F;
      if (var6 >= -0.4F && var6 <= 0.4F) {
         float var8 = (var6 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var9 = 1.0F - (1.0F - class_9299.method_42818(var8 * (float) Math.PI)) * 0.99F;
         var9 *= var9;
         this.field_38369[0] = var8 * 0.3F + 0.7F;
         this.field_38369[1] = var8 * var8 * 0.7F + 0.2F;
         this.field_38369[2] = var8 * var8 * 0.0F + 0.2F;
         this.field_38369[3] = var9;
         return this.field_38369;
      } else {
         return null;
      }
   }

   public float method_34243() {
      return this.field_38371;
   }

   public boolean method_34249() {
      return this.field_38368;
   }

   public abstract class_1343 method_34246(class_1343 var1, float var2);

   public abstract boolean method_34252(int var1, int var2);

   public class_9571 method_34244() {
      return this.field_38372;
   }

   public boolean method_34251() {
      return this.field_38373;
   }

   public boolean method_34245() {
      return this.field_38370;
   }
}
