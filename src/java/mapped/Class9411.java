package mapped;

import java.util.Comparator;
import javax.annotation.Nullable;

public class Class9411 {
   public static final Comparator<Class9411> field43668 = (var0, var1) -> {
      if (var0.method36050() <= var1.method36050()) {
         return var0.method36050() >= var1.method36050() ? var1.method36054().compareToIgnoreCase(var0.method36054()) : -1;
      } else {
         return 1;
      }
   };
   private final Class6886 field43669;
   private final Class8375 field43670;
   private final String field43671;
   private int field43672;
   private boolean field43673;
   private boolean field43674;

   public Class9411(Class6886 var1, Class8375 var2, String var3) {
      this.field43669 = var1;
      this.field43670 = var2;
      this.field43671 = var3;
      this.field43673 = true;
      this.field43674 = true;
   }

   public void method36048(int var1) {
      if (!this.field43670.method29337().method33281()) {
         this.method36052(this.method36050() + var1);
      } else {
         throw new IllegalStateException("Cannot modify read-only score");
      }
   }

   public void method36049() {
      this.method36048(1);
   }

   public int method36050() {
      return this.field43672;
   }

   public void method36051() {
      this.method36052(0);
   }

   public void method36052(int var1) {
      int var4 = this.field43672;
      this.field43672 = var1;
      if (var4 != var1 || this.field43674) {
         this.field43674 = false;
         this.method36055().method21002(this);
      }
   }

   @Nullable
   public Class8375 method36053() {
      return this.field43670;
   }

   public String method36054() {
      return this.field43671;
   }

   public Class6886 method36055() {
      return this.field43669;
   }

   public boolean method36056() {
      return this.field43673;
   }

   public void method36057(boolean var1) {
      this.field43673 = var1;
   }
}
