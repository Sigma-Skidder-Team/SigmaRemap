package remapped;

import java.util.ArrayList;

public class class_1461 extends class_446 {
   public class_2612 field_7868;
   public class_3004 field_7871;
   private ArrayList<class_7144> field_7869;
   private MusicManager field_7870 = SigmaMainClass.getInstance().method_3300();

   public class_1461(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, var7, false);
      this.method_32148(this.field_7868 = new class_2612(this, "albumView", 0, 0, var5, var6, class_590.field_3421, "View"));
      this.method_32148(this.field_7871 = new class_3004(this, "searchInput", 30, 14, var5 - 60, 70, class_3004.field_14753, "", "Search..."));
      this.field_7871.method_32187(true);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
   }

   @Override
   public void method_29509(int var1) {
      if (var1 == 257 && this.field_7871.method_32098()) {
         this.field_7871.method_32177(false);
         new Thread(
               () -> {
                  this.field_7869 = new ArrayList<class_7144>();
                  class_2939[] var3 = class_1199.method_5304(this.field_7871.method_32165());

                  for (class_2939 var7 : var3) {
                     this.field_7869.add(new class_7144(var7.field_14295, var7.field_14296, var7.field_14294));
                  }

                  this.method_32102(
                     () -> {
                        this.method_32179(this.field_7868);
                        this.method_32148(
                           this.field_7868 = new class_2612(this, "albumView", 0, 0, this.field_36278, this.field_36257, class_590.field_3421, "View")
                        );
                        if (this.field_7869 != null) {
                           for (int var3x = 0; var3x < this.field_7869.size(); var3x++) {
                              class_7144 var4 = this.field_7869.get(var3x);
                              byte var5 = 80;
                              byte var6 = 10;
                              class_5673 var7x;
                              this.field_7868
                                 .method_32148(
                                    var7x = new class_5673(
                                       this.field_7868,
                                       var6 + var3x % 3 * 183 - (var3x % 3 <= 0 ? 0 : var6) - (var3x % 3 <= 1 ? 0 : var6),
                                       var5 + var6 + (var3x - var3x % 3) / 3 * 210,
                                       183,
                                       220,
                                       var4
                                    )
                                 );
                              var7x.method_32100((var2, var3xx) -> this.field_7870.method_9489(null, var4));
                           }
                        }
                     }
                  );
               }
            )
            .start();
      }

      super.method_29509(var1);
   }
}
