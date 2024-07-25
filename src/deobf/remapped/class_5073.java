package remapped;

public class class_5073 implements Runnable {
   private static String[] field_26210;

   public class_5073(MusicPlayer var1, Channel var2, class_590 var3, MusicPlayer var4) {
      this.field_26214 = var1;
      this.field_26212 = var2;
      this.field_26211 = var3;
      this.field_26213 = var4;
   }

   @Override
   public void run() {
      if (!MusicPlayer.method_24915(this.field_26214).method_32115(this.field_26212.field_45629)) {
         class_6220 var3;
         MusicPlayer.method_24915(this.field_26214)
            .method_32148(
               var3 = new class_6220(
                  MusicPlayer.method_24915(this.field_26214),
                  this.field_26212.field_45629,
                  0,
                  MusicPlayer.method_24915(this.field_26214).method_11850().method_32134().size() * MusicPlayer.method_24923(this.field_26214),
                  MusicPlayer.method_24925(this.field_26214),
                  MusicPlayer.method_24923(this.field_26214),
                  this.field_26211,
                  this.field_26212.field_45631,
                  class_5320.field_27138
               )
            );
         class_2612 var4;
         this.field_26213
            .method_32148(
               var4 = new class_2612(
                  this.field_26213,
                  this.field_26212.field_45629,
                  MusicPlayer.method_24925(this.field_26214),
                  0,
                  this.field_26213.method_32109() - MusicPlayer.method_24925(this.field_26214),
                  this.field_26213.method_32137() - MusicPlayer.method_24922(this.field_26214),
                  class_590.field_3421,
                  this.field_26212.field_45631
               )
            );
         var4.method_11849(true);
         var4.method_32104(false);
         var4.method_32105(false);
         if (this.field_26212.field_45627 != null) {
            for (int var5 = 0; var5 < this.field_26212.field_45627.size(); var5++) {
               class_7144 var6 = this.field_26212.field_45627.get(var5);
               class_5673 var7 = null;
               byte var8 = 65;
               byte var9 = 10;
               if (!var4.method_32115(this.field_26212.field_45629)) {
                  var4.method_32148(
                     var7 = new class_5673(
                        var4,
                        var9 + var5 % 3 * 183 - (var5 % 3 <= 0 ? 0 : var9) - (var5 % 3 <= 1 ? 0 : var9),
                        var8 + var9 + (var5 - var5 % 3) / 3 * 210,
                        183,
                        220,
                        var6
                     )
                  );
                  var7.method_32100((var3x, var4x) -> MusicPlayer.method_24916(this.field_26214, var1, var6));
               }
            }
         }

         var3.method_32100((var2, var3x) -> MusicPlayer.method_24917(this.field_26214, var4));
      }
   }
}
