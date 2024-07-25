package remapped;

public interface class_3988<R> {
   R method_18391(class_3010<?> var1);

   default R method_18386(int var1) {
      return this.method_18391(class_5788.field_29252.method_26183(new class_3966(var1)));
   }

   default R method_18388(class_3461 var1) {
      return this.method_18391(class_5788.field_29253.method_26183(new class_611(var1)));
   }

   default R method_18389(int var1) {
      return this.method_18388(class_3461.method_15935(var1));
   }

   default R method_18387(int var1) {
      return this.method_18388(class_3461.method_15934(0, var1));
   }

   default R method_18390(int var1) {
      return this.method_18391(class_5788.field_29257.method_26183(new class_8458(0, 0, var1)));
   }

   default R method_18385() {
      return this.method_18391(class_5788.field_29234.method_26183(class_9504.field_48399));
   }
}
