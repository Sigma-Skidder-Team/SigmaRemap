package mapped;

import java.util.UUID;

public class Class7460 implements Class7458 {
   private static String[] field32081;
   private Entity field32082;

   @Override
   public int method24123() {
      UUID var3 = this.field32082.method3375();
      long var4 = var3.getLeastSignificantBits();
      return (int)(var4 & 2147483647L);
   }

   @Override
   public BlockPos method24124() {
      return this.field32082.method3210().field43438;
   }

   @Override
   public Class8907 method24125() {
      return this.field32082.method3210().field43437;
   }

   @Override
   public String method24126() {
      return !this.field32082.method3381() ? null : this.field32082.method3380().getString();
   }

   @Override
   public int method24127() {
      if (this.field32082 instanceof Class880) {
         Class880 var3 = (Class880)this.field32082;
         return (int)var3.method3042();
      } else {
         return 0;
      }
   }

   @Override
   public int method24128() {
      if (this.field32082 instanceof Class880) {
         Class880 var3 = (Class880)this.field32082;
         return (int)var3.method3075();
      } else {
         return 0;
      }
   }

   public Entity method24131() {
      return this.field32082;
   }

   public void method24132(Entity var1) {
      this.field32082 = var1;
   }
}
