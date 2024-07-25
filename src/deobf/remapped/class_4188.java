package remapped;

public enum class_4188 {
   field_20387(
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34357, null),
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34357, null)
   ),
   field_20390(
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34354, null),
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34354, null)
   ),
   field_20385(
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34354, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34354, null)
   ),
   field_20392(
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34357, null),
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34357, null)
   ),
   field_20384(
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34354, null),
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34355, class_6636.field_34356, class_6636.field_34357, null),
      new class_9829(class_6636.field_34355, class_6636.field_34360, class_6636.field_34357, null)
   ),
   field_20386(
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34357, null),
      new class_9829(class_6636.field_34359, class_6636.field_34356, class_6636.field_34354, null),
      new class_9829(class_6636.field_34359, class_6636.field_34360, class_6636.field_34354, null)
   );

   private static final class_4188[] field_20388 = class_9665.<class_4188[]>method_44659(new class_4188[6], var0 -> {
      var0[class_6636.field_34356] = field_20387;
      var0[class_6636.field_34360] = field_20390;
      var0[class_6636.field_34354] = field_20385;
      var0[class_6636.field_34357] = field_20392;
      var0[class_6636.field_34355] = field_20384;
      var0[class_6636.field_34359] = field_20386;
   });
   private final class_9829[] field_20389;

   public static class_4188 method_19472(class_240 var0) {
      return field_20388[var0.method_1050()];
   }

   private class_4188(class_9829... var3) {
      this.field_20389 = var3;
   }

   public class_9829 method_19474(int var1) {
      return this.field_20389[var1];
   }
}
