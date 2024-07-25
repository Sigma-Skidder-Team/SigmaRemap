package remapped;

public class class_6573 extends class_6718 {
   private static String[] field_33513;

   public class_6573(class_9263 var1) {
      super(class_916.field_4710 + 2, 16, 256);
      this.field_33514 = var1;
   }

   @Override
   public int method_30840(long var1) {
      class_1548 var5 = (class_1548)class_9263.method_42694(this.field_33514).get(var1);
      if (var5 != null) {
         return !var5.isEmpty() ? ((class_2837)var5.method_7024()).method_12895() : Integer.MAX_VALUE;
      } else {
         return Integer.MAX_VALUE;
      }
   }

   @Override
   public int method_27698(long var1) {
      if (!this.field_33514.method_42695(var1)) {
         class_5344 var5 = this.field_33514.method_42678(var1);
         if (var5 != null) {
            return var5.method_24367();
         }
      }

      return class_916.field_4710 + 1;
   }

   @Override
   public void method_27689(long var1, int var3) {
      class_5344 var6 = this.field_33514.method_42678(var1);
      int var7 = var6 != null ? var6.method_24367() : class_916.field_4710 + 1;
      if (var7 != var3) {
         var6 = this.field_33514.method_42682(var1, var3, var6, var7);
         if (var6 != null) {
            class_9263.method_42703(this.field_33514).add(var6);
         }
      }
   }

   public int method_30024(int var1) {
      return this.method_27693(var1);
   }
}
