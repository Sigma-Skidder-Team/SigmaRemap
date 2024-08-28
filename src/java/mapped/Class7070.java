package mapped;

import com.mentalfrostbyte.jello.Client;

import java.util.Optional;
import java.util.stream.Collectors;

public class Class7070 {
   private static String[] field30447;
   public int field30448;
   public float field30449;
   public float field30450;
   public int field30451;
   public int field30452;
   public ItemStack field30453;
   public ItemStack field30454;
   public ItemStack field30455;

   public Class7070(int var1) {
      this.field30448 = var1;
   }

   public void method21984() {
      this.method21987();
      boolean var3 = this.field30454 != null && this.field30454.field39976 > 0;
      boolean var4 = this.field30453 != null && this.field30453.field39976 > 0;
      boolean var5 = this.method21986() != null
         && this.method21986().equals(this.field30455.method32107())
         && this.field30455 != null
         && this.field30455.field39976 < 64;
      if (this.field30450 < this.field30449 && var4 && var5 && this.field30452 > 0) {
         this.field30450 = this.field30450 + Client.getInstance().method19939().method31327();
      }

      if (this.field30452 > 0) {
         this.field30452--;
      }

      if (this.field30452 == 0) {
         if (var3 && var4) {
            this.field30454.field39976--;
            this.field30452 = this.field30451;
         } else {
            this.field30450 = 0.0F;
         }
      }

      if (this.field30450 >= this.field30449 && this.field30449 != 0.0F) {
         if (var4) {
            this.field30453.field39976--;
         }

         this.field30450 = 0.0F;
         if (this.field30455 != null) {
            ItemStack var6 = this.method21985();
            this.field30455.field39976 = this.field30455.field39976 + var6.field39976;
         }
      }

      if (this.field30453 != null && this.field30453.field39976 == 0) {
         this.field30453 = null;
      }
   }

   public ItemStack method21985() {
      if (this.field30453 == null) {
         return null;
      } else {
         if (!Class5377.method16937()
            .<Class920, Class4849>method1030(Class7207.field30936, new Class927(new ItemStack(Class8514.field37236)), Class5377.method16936().world)
            .isPresent()) {
            Class193 var3 = new Class193(Class1946.field12611);

            for (Class303 var6 : Class5377.method16938().resourcePackRepository.method1270().stream().<Class303>map(Class1810::method7950).collect(Collectors.toList())) {
               var3.method588(var6);
            }

            Class7120 var9 = new Class7120(this);
            Class5377.method16937().method777(var9, var3, Class7167.field30819, Class7167.field30819, Util.method38492(), Class5377.method16939());
         }

         Optional var7 = Class5377.method16937()
            .<Class920, Class4849>method1030(Class7207.field30936, new Class927(this.field30453), Class5377.method16940().world);
         if (var7.isPresent()) {
            ItemStack var8 = ((Class4849)var7.get()).method14966();
            if (!var8.method32105()) {
               return var8.copy();
            }
         }

         return null;
      }
   }

   public Class3257 method21986() {
      ItemStack var3 = this.method21985();
      return var3 == null ? null : var3.method32107();
   }

   public ItemStack method21987() {
      if (this.field30455 != null && this.field30455.method32107() instanceof Class3280) {
         this.field30455 = null;
      }

      if (this.field30453 != null && this.field30453.method32107() instanceof Class3280) {
         this.field30453 = null;
      }

      if (this.field30454 != null && this.field30454.method32107() instanceof Class3280) {
         this.field30454 = null;
      }

      if (this.field30455 == null) {
         if (this.field30453 != null) {
            ItemStack var3 = this.method21985();
            if (var3 != null) {
               var3.field39976 = 0;
            }

            return this.field30455 = var3;
         } else {
            return null;
         }
      } else {
         return this.field30455;
      }
   }
}
