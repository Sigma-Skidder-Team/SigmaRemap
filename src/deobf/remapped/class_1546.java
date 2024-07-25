package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class class_1546 {
   public class_9525 field_8165;
   public class_5886 field_8166;
   public final Int2ObjectMap<class_5851> field_8161 = new Int2ObjectOpenHashMap();
   public int field_8164;
   public int field_8163;
   public int field_8167;
   public boolean field_8169;
   public boolean field_8168;
   public boolean field_8162;

   public void method_7014(class_9525 var1, class_5886 var2) {
      this.field_8165 = var1;
      this.field_8166 = var2;
      this.field_8161.clear();
      this.field_8164 = class_9299.method_42848(var2.method_37086() + 1.0F);
      this.field_8163 = class_9299.method_42848(var2.method_37074() + 1.0F);
      this.field_8167 = class_9299.method_42848(var2.method_37086() + 1.0F);
   }

   public void method_7005() {
      this.field_8165 = null;
      this.field_8166 = null;
   }

   public class_5851 method_7017(class_1331 var1) {
      return this.method_7016(var1.method_12173(), var1.method_12165(), var1.method_12185());
   }

   public class_5851 method_7016(int var1, int var2, int var3) {
      return (class_5851)this.field_8161.computeIfAbsent(class_5851.method_26694(var1, var2, var3), var3x -> new class_5851(var1, var2, var3));
   }

   public abstract class_5851 method_7003();

   public abstract class_1478 method_7013(double var1, double var3, double var5);

   public abstract int method_7002(class_5851[] var1, class_5851 var2);

   public abstract class_1108 method_7011(
      class_6163 var1, int var2, int var3, int var4, class_5886 var5, int var6, int var7, int var8, boolean var9, boolean var10
   );

   public abstract class_1108 method_7010(class_6163 var1, int var2, int var3, int var4);

   public void method_7007(boolean var1) {
      this.field_8169 = var1;
   }

   public void method_7008(boolean var1) {
      this.field_8168 = var1;
   }

   public void method_7012(boolean var1) {
      this.field_8162 = var1;
   }

   public boolean method_7004() {
      return this.field_8169;
   }

   public boolean method_7006() {
      return this.field_8168;
   }

   public boolean method_7015() {
      return this.field_8162;
   }
}
