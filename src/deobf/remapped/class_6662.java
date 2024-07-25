package remapped;

public class class_6662 {
   private final class_95<class_1536> field_34450 = new class_95<class_1536>(32);

   public static class_6662 method_30588(class_4468 var0) {
      class_6662 var3 = new class_6662();
      var3.method_30589(
         (var0x, var1) -> var1 <= 0 ? ((class_9168)var0x.method_27960()).method_42261(var0x) : -1,
         class_4897.field_24600,
         class_4897.field_24671,
         class_4897.field_24878,
         class_4897.field_24683,
         class_4897.field_25035
      );
      var3.method_30589((var0x, var1) -> class_640.method_2941(0.5, 1.0), class_4783.field_23247, class_4783.field_23586);
      var3.method_30589((var0x, var1) -> {
         if (var1 != 1) {
            return -1;
         } else {
            CompoundNBT var4 = var0x.method_28021("Explosion");
            int[] var5x = var4 != null && var4.method_25939("Colors", 11) ? var4.method_25922("Colors") : null;
            if (var5x != null && var5x.length != 0) {
               if (var5x.length == 1) {
                  return var5x[0];
               } else {
                  int var6 = 0;
                  int var7 = 0;
                  int var8 = 0;

                  for (int var12 : var5x) {
                     var6 += (var12 & 0xFF0000) >> 16;
                     var7 += (var12 & 0xFF00) >> 8;
                     var8 += (var12 & 0xFF) >> 0;
                  }

                  var6 /= var5x.length;
                  var7 /= var5x.length;
                  var8 /= var5x.length;
                  return var6 << 16 | var7 << 8 | var8;
               }
            } else {
               return 9079434;
            }
         }
      }, class_4897.field_24554);
      var3.method_30589(
         (var0x, var1) -> var1 <= 0 ? class_9541.method_43987(var0x) : -1, class_4897.field_25157, class_4897.field_25226, class_4897.field_24444
      );

      for (class_3003 var5 : class_3003.method_13716()) {
         var3.method_30589((var1, var2) -> var5.method_13718(var2), var5);
      }

      var3.method_30589(
         (var1, var2) -> {
            class_2522 var5x = ((class_6201)var1.method_27960()).method_28392().method_29260();
            return var0.method_20749(var5x, (class_5561)null, (class_1331)null, var2);
         },
         class_4783.field_23259,
         class_4783.field_23868,
         class_4783.field_23616,
         class_4783.field_23323,
         class_4783.field_23539,
         class_4783.field_23493,
         class_4783.field_23467,
         class_4783.field_23386,
         class_4783.field_23756,
         class_4783.field_23268,
         class_4783.field_23860
      );
      var3.method_30589((var0x, var1) -> var1 != 0 ? -1 : class_9541.method_43987(var0x), class_4897.field_25013);
      var3.method_30589((var0x, var1) -> var1 != 0 ? class_2143.method_10017(var0x) : -1, class_4897.field_25262);
      return var3;
   }

   public int method_30590(ItemStack var1, int var2) {
      class_1536 var5 = this.field_34450.method_14040(class_8669.field_44382.method_14041(var1.method_27960()));
      return var5 != null ? var5.method_6975(var1, var2) : -1;
   }

   public void method_30589(class_1536 var1, class_8525... var2) {
      for (class_8525 var8 : var2) {
         this.field_34450.method_278(var1, class_2451.method_11244(var8.method_10803()));
      }
   }
}
