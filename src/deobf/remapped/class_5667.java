package remapped;

import java.util.function.Supplier;

public enum class_5667 implements class_4814 {
   field_28740("leather", 5, new int[]{1, 2, 3, 1}, 15, class_463.field_2417, 0.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_24808)),
   field_28730("chainmail", 15, new int[]{1, 4, 5, 2}, 12, class_463.field_2166, 0.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_25021)),
   field_28733("iron", 15, new int[]{2, 5, 6, 2}, 9, class_463.field_2047, 0.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_25021)),
   field_28729("gold", 7, new int[]{1, 3, 5, 2}, 25, class_463.field_2785, 0.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_25108)),
   field_28735("diamond", 33, new int[]{3, 6, 8, 3}, 10, class_463.field_2653, 2.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_24481)),
   field_28727("turtle", 25, new int[]{2, 5, 6, 2}, 9, class_463.field_2380, 0.0F, 0.0F, () -> class_8137.method_37019(class_4897.field_24631)),
   field_28732("netherite", 37, new int[]{3, 6, 8, 3}, 15, class_463.field_2485, 3.0F, 0.1F, () -> class_8137.method_37019(class_4897.field_25231));

   private static final int[] field_28731 = new int[]{13, 15, 16, 11};
   private final String field_28737;
   private final int field_28725;
   private final int[] field_28734;
   private final int field_28738;
   private final class_8461 field_28728;
   private final float field_28739;
   private final float field_28726;
   private final class_3642<class_8137> field_28723;

   private class_5667(String var3, int var4, int[] var5, int var6, class_8461 var7, float var8, float var9, Supplier<class_8137> var10) {
      this.field_28737 = var3;
      this.field_28725 = var4;
      this.field_28734 = var5;
      this.field_28738 = var6;
      this.field_28728 = var7;
      this.field_28739 = var8;
      this.field_28726 = var9;
      this.field_28723 = new class_3642<class_8137>(var10);
   }

   public int 㢸웨䡸䕦綋햖(class_6943 var1) {
      return field_28731[var1.method_31767()] * this.field_28725;
   }

   public int 놣錌ꁈ属婯쥦(class_6943 var1) {
      return this.field_28734[var1.method_31767()];
   }

   public int 瀧䈔셴䂷붛粤() {
      return this.field_28738;
   }

   public class_8461 쥅낛햠鷏쥅펊() {
      return this.field_28728;
   }

   public class_8137 聛酭픓杭䢿欫() {
      return this.field_28723.method_16960();
   }

   public String 嶗펊浣卫汌ࡅ() {
      return this.field_28737;
   }

   public float 䄟䎰藸轐늦ศ() {
      return this.field_28739;
   }

   public float 醧佉杭펊펊頉() {
      return this.field_28726;
   }
}
