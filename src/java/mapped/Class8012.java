package mapped;

public class Class8012 {
   private static String[] field34440;
   private Entity field34441;
   private Class9491 field34442;

   public Class8012(Entity var1) {
      this.field34441 = var1;
      this.field34442 = null;
   }

   public Class8012(Entity var1, Class9491 var2) {
      this.field34441 = var1;
      this.field34442 = var2;
   }

   public Entity method27397() {
      return this.field34441;
   }

   public boolean method27398() {
      return this.field34442 != null && this.field34442.method36664();
   }

   public Class9491 method27399() {
      return this.field34442;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         return var1 instanceof Class8012 ? ((Class8012)var1).method27397() == this.method27397() : false;
      } else {
         return true;
      }
   }
}
