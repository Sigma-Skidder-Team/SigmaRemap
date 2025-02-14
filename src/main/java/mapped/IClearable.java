package mapped;

public interface IClearable {
   void method3625();

   static void method3802(Object var0) {
      if (var0 instanceof IClearable) {
         ((IClearable)var0).method3625();
      }
   }
}
