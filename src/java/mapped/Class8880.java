package mapped;

import com.mentalfrostbyte.jello.viaversion.task.TaskScheduler;

import java.util.concurrent.TimeUnit;

public class Class8880 implements Class8881 {
   private static String[] field40192;
   private final Object field40193;
   private final Runnable field40194;
   private long field40195;
   private long field40196;
   public final TaskScheduler field40197;

   public Class8880(TaskScheduler var1, Object var2, Runnable var3) {
      this.field40197 = var1;
      this.field40193 = var2;
      this.field40194 = var3;
   }

   @Override
   public Class8881 setDelay(long var1, TimeUnit var3) {
      this.field40195 = var3.toMillis(var1);
      return this;
   }

   @Override
   public Class8881 method32316(long var1, TimeUnit var3) {
      this.field40196 = var3.toMillis(var1);
      return this;
   }

   @Override
   public Class8881 method32317() {
      this.field40195 = 0L;
      return this;
   }

   @Override
   public Class8881 method32318() {
      this.field40196 = 0L;
      return this;
   }

   @Override
   public Class763 start() {
      Class762 var3 = new Class762(this.field40197, this.field40193, this.field40194, this.field40195, this.field40196);
      TaskScheduler.method23047(this.field40197).put(this.field40193, var3);
      var3.method1898();
      return var3;
   }
}
