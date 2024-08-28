package mapped;

public class Class9170 {
   public static SGL field42091 = Renderer.get();
   public Class7710 field42092;
   public int field42093 = -1;

   public Class9170(Class7710 var1) {
      this.field42092 = var1;
   }

   public void method34257(Class9219 var1) {
      if (this.field42093 == -1) {
         this.field42093 = field42091.method18384(1);
         field42091.method18390(this.field42093, 4864);
         method34258(var1, this.field42092);
         field42091.method18383();
      }

      field42091.method18372(this.field42093);
      TextureImpl.bindNone();
   }

   public static void method34258(Class9219 var0, Class7710 var1) {
      for (int var4 = 0; var4 < var1.method25466(); var4++) {
         Class5967 var5 = var1.method25467(var4);
         if (var5.method18496().method20121()) {
            if (var5.method18496().method20115("fill")) {
               var0.method34607(var5.method18496().method20118("fill"));
               var0.method34613(var1.method25467(var4).method18495());
               var0.method34646(true);
               var0.method34612(var1.method25467(var4).method18495());
               var0.method34646(false);
            }

            String var6 = var5.method18496().method20119("fill");
            if (var1.method25472(var6) != null) {
               System.out.println("PATTERN");
            }

            if (var1.method25473(var6) != null) {
               Class7462 var7 = var1.method25473(var6);
               Class2520 var8 = var1.method25467(var4).method18495();
               Object var9 = null;
               if (!var7.method24133()) {
                  var9 = new Class6882(var8, var1.method25467(var4).method18493(), var7);
               } else {
                  var9 = new Class6881(var8, var1.method25467(var4).method18493(), var7);
               }

               Color.field16442.method10392();
               Class9247.method34786(var8, var7.method24139(), (Class6880)var9);
            }
         }

         if (var5.method18496().method20122() && var5.method18496().method20115("stroke")) {
            var0.method34607(var5.method18496().method20118("stroke"));
            var0.method34643(var5.method18496().method20120("stroke-width"));
            var0.method34646(true);
            var0.method34612(var1.method25467(var4).method18495());
            var0.method34646(false);
            var0.method34645();
         }
      }
   }
}
