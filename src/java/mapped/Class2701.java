package mapped;

import net.minecraft.entity.Entity;

import java.util.EnumSet;

public class Class2701 extends Class2699 {
   private static String[] field17165;
   private final Class1064 field17166;
   private Class880 field17167;
   private int field17168;
   public final Class1065 field17169;

   public Class2701(Class1065 var1, Class1064 var2) {
      super(var2, false);
      this.field17169 = var1;
      this.field17166 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      if (this.field17166.method4296()) {
         Entity var3 = this.field17166.method4297();
         if (!(var3 instanceof Class1044)) {
            return false;
         } else {
            Class1044 var4 = (Class1044)var3;
            this.field17167 = var4.method3014();
            int var5 = var4.method3015();
            return var5 != this.field17168 && this.method10915(this.field17167, Class8522.field38240);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17153.method4233(this.field17167);
      Entity var3 = this.field17166.method4297();
      if (var3 instanceof Class1044) {
         this.field17168 = ((Class1044)var3).method3015();
      }

      super.method10804();
   }
}
