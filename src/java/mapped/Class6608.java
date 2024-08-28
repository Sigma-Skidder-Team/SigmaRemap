package mapped;

import java.util.UUID;

public interface Class6608 extends Class6607 {
   String method20054();

   void method20055(boolean var1);

   int method20056();

   void method20057(int var1);

   void method20058(int var1);

   int method20059();

   @Override
   default void method20049(Class8965 var1) {
      Class6607.super.method20049(var1);
      var1.method32806("Level name", this::method20054);
      var1.method32806(
         "Level game mode",
         () -> String.format(
               "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b",
               this.method20067().method8153(),
               this.method20067().method8152(),
               this.isHardcore(),
               this.method20072()
            )
      );
      var1.method32806(
         "Level weather",
         () -> String.format(
               "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.method20056(), this.method20043(), this.method20059(), this.method20042()
            )
      );
   }

   int method20060();

   void method20061(int var1);

   int method20062();

   void method20063(int var1);

   int method20064();

   void method20065(int var1);

   void method20066(UUID var1);

   Class1894 method20067();

   void method20068(Class7235 var1);

   Class7235 method20069();

   boolean method20070();

   void method20071(boolean var1);

   boolean method20072();

   void method20073(Class1894 var1);

   Class8559<MinecraftServer> method20074();

   void method20075(long var1);

   void method20076(long var1);
}
