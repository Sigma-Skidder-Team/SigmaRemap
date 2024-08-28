package mapped;

public class Class5453 extends Class5444<Class4735> {
   private static String[] field24212;

   public Class5453(Class2961<Class4735> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(Class8904 var1, Class5646 var2, Class8761 var3, int var4, int var5, Class8907 var6, Class4735 var7) {
      Class4189 var10 = new Class4189(0, this.field24201, (var4 << 4) + 2, (var5 << 4) + 2, var7.field22427);
      this.field24196.add(var10);
      var10.method12894(var10, this.field24196, this.field24201);
      this.method17113();
      if (var7.field22427 != Class102.field308) {
         this.method17115(var2.method17807(), this.field24201, 10);
      } else {
         byte var11 = -5;
         int var12 = var2.method17807() - this.field24197.field45682 + this.field24197.method38399() / 2 - -5;
         this.field24197.method38393(0, var12, 0);

         for (Class4178 var14 : this.field24196) {
            var14.method12937(0, var12, 0);
         }
      }
   }
}
