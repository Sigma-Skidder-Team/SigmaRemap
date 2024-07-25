package remapped;

public interface class_6437 {
   class_6437 field_32865 = method_29388(
      class_9349.<class_6414>method_43146(),
      class_9349.<class_2451>method_43146(),
      class_9349.<class_2340>method_43146(),
      class_9349.<class_6629<?>>method_43146()
   );

   class_9349<class_6414> method_29392();

   class_9349<class_2451> method_29393();

   class_9349<class_2340> method_29391();

   class_9349<class_6629<?>> method_29389();

   default void method_29395() {
      class_4438.method_20598(this);
      class_4783.method_22068();
   }

   default void method_29394(class_8248 var1) {
      this.method_29392().method_43139(var1, class_8669.field_44462);
      this.method_29393().method_43139(var1, class_8669.field_44382);
      this.method_29391().method_43139(var1, class_8669.field_44447);
      this.method_29389().method_43139(var1, class_8669.field_44400);
   }

   static class_6437 method_29390(class_8248 var0) {
      class_9349 var3 = class_9349.<class_6414>method_43142(var0, class_8669.field_44462);
      class_9349 var4 = class_9349.<class_2451>method_43142(var0, class_8669.field_44382);
      class_9349 var5 = class_9349.<class_2340>method_43142(var0, class_8669.field_44447);
      class_9349 var6 = class_9349.<class_6629<?>>method_43142(var0, class_8669.field_44400);
      return method_29388(var3, var4, var5, var6);
   }

   static class_6437 method_29388(class_9349<class_6414> var0, class_9349<class_2451> var1, class_9349<class_2340> var2, class_9349<class_6629<?>> var3) {
      return new class_7497(var0, var1, var2, var3);
   }
}
