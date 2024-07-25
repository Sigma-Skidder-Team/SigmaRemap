package remapped;

import java.util.UUID;

public interface class_7203 extends class_1137 {
   String method_25716();

   void method_32978(boolean var1);

   int method_32975();

   void method_32971(int var1);

   void method_32980(int var1);

   int method_32972();

   @Override
   default void method_8656(class_6544 var1) {
      class_1137.super.method_8656(var1);
      var1.method_29851("Level name", this::method_25716);
      var1.method_29851(
         "Level game mode",
         () -> String.format(
               "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b",
               this.method_25709().getName(),
               this.method_25709().getID(),
               this.method_8659(),
               this.method_25714()
            )
      );
      var1.method_29851(
         "Level weather",
         () -> String.format(
               "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.method_32975(), this.method_8664(), this.method_32972(), this.method_8663()
            )
      );
   }

   int method_32984();

   void method_32977(int var1);

   int method_32968();

   void method_32976(int var1);

   int method_32982();

   void method_32970(int var1);

   void method_32967(UUID var1);

   GameType method_25709();

   void method_32981(class_1572 var1);

   class_1572 method_32974();

   boolean method_32973();

   void method_32985(boolean var1);

   boolean method_25714();

   void method_25711(GameType var1);

   class_5026<class_341> method_32969();

   void method_32979(long var1);

   void method_32983(long var1);
}
