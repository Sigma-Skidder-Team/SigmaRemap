package net.minecraft.world.server;

import java.util.Objects;

public final class Ticket<T> implements Comparable<Ticket<?>> {
   private final TicketType<T> type;
   private final int level;
   private final T value;
   private long timestamp;

   public Ticket(TicketType<T> var1, int var2, T var3) {
      this.type = var1;
      this.level = var2;
      this.value = (T)var3;
   }

   public int compareTo(Ticket<?> var1) {
      int var4 = Integer.compare(this.level, var1.level);
      if (var4 == 0) {
         int var5 = Integer.compare(System.identityHashCode(this.type), System.identityHashCode(var1.type));
         return var5 == 0 ? this.type.method30546().compare(this.value, (T) var1.value) : var5;
      } else {
         return var4;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Ticket)) {
            return false;
         } else {
            Ticket var4 = (Ticket)var1;
            return this.level == var4.level && Objects.equals(this.type, var4.type) && Objects.equals(this.value, var4.value);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.level, this.value);
   }

   @Override
   public String toString() {
      return "Ticket[" + this.type + " " + this.level + " (" + this.value + ")] at " + this.timestamp;
   }

   public TicketType<T> method8484() {
      return this.type;
   }

   public int getLevel() {
      return this.level;
   }

   public void setTimestamp(long var1) {
      this.timestamp = var1;
   }

   public boolean method8487(long var1) {
      long var5 = this.type.method30547();
      return var5 != 0L && var1 - this.timestamp > var5;
   }
}
