package remapped;

import java.util.Random;

public class class_5956 extends class_7038 {
   public class_4636 field_30360;
   public class_4636 field_30363;
   public class_4636 field_30366;
   public class_4636 field_30365;
   public class_4636 field_30359;
   public class_4636 field_30364;
   public class_4636 field_30367;
   public class_4636 field_30368;
   public class_4636 field_30361;

   public class_5956(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 760, 87);
      this.method_32148(this.field_30360 = new class_4636(this, "reload", 0, 0, 120, 40, "Reload", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30363 = new class_4636(this, "back", 0, 48, 120, 40, "Back", class_1255.field_6929.field_6917));
      short var7 = 200;
      short var8 = 146;
      int var9 = this.method_32109() - 625;
      this.method_32148(this.field_30366 = new class_4636(this, "login", var9, 0, var7, 40, "Login", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30364 = new class_4636(this, "direct", var9 + var7 + 16, 0, var7, 40, "Direct Login", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30368 = new class_4636(this, "add", var9 + var7 * 2 + 32, 0, var7, 40, "Add", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30365 = new class_4636(this, "random", var9, 48, var8, 40, "Random", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30359 = new class_4636(this, "remove", var9 + var8 + 16, 48, var8, 40, "Remove", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30367 = new class_4636(this, "edit", var9 + var8 * 2 + 32, 48, var8, 40, "Edit", class_1255.field_6929.field_6917));
      this.method_32148(this.field_30361 = new class_4636(this, "alpha", var9 + var8 * 3 + 48, 48, var8, 40, "Alphalts", class_1255.field_6929.field_6917));
      class_2135 var10 = (class_2135)this.method_32167();
      this.field_30365
         .method_32100(
            (var1x, var2x) -> {
               class_7309 var5 = SigmaMainClass.method_3328()
                  .method_3303()
                  .method_39908()
                  .get(new Random().nextInt(SigmaMainClass.method_3328().method_3303().method_39908().size()));
               var10.method_9987(var5);
            }
         );
      this.field_30363.method_32100((var0, var1x) -> class_1893.method_8510().method_8609(new class_1876()));
      this.field_30366.method_32100((var1x, var2x) -> var10.method_9985());
      this.field_30359.method_32100((var1x, var2x) -> var10.method_9980());
      this.field_30367.method_32100((var1x, var2x) -> {
         class_9192 var5 = var10.method_9983();
         if (var5 != null) {
            SigmaMainClass.method_3328().method_3299().method_30990(new class_7007(var5.field_47028));
         }
      });
      this.field_30368.method_32100((var0, var1x) -> SigmaMainClass.method_3328().method_3299().method_30990(new class_5527()));
      this.field_30364.method_32100((var0, var1x) -> SigmaMainClass.method_3328().method_3299().method_30990(new class_965()));
   }

   @Override
   public void method_32119(boolean var1) {
      this.field_30359.method_32119(var1);
      this.field_30367.method_32119(var1);
      this.field_30366.method_32119(var1);
   }

   public boolean method_27215() {
      return this.field_30359.method_32140();
   }
}
