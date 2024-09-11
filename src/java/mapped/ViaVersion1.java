package mapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.mentalfrostbyte.jello.viaversion.task.AbstractScheduledTask;
import org.jetbrains.annotations.Nullable;

public class ViaVersion1 {
   private final Class8006<?> field42213;
   private final ViaVersion6 field42214 = new ViaVersion6();
   private final Class6749 field42215;
   private final Class7778 field42216;
   private final Class9213 field42217;
   private final Set<String> field42218 = new HashSet<String>();
   private List<Runnable> field42219 = new ArrayList<Runnable>();
   private AbstractScheduledTask field42220;
   private boolean field42221;

   public ViaVersion1(Class8006<?> var1, Class6749 var2, Class7778 var3, Class9213 var4) {
      this.field42213 = var1;
      this.field42215 = var2;
      this.field42216 = var3;
      this.field42217 = var4;
   }

   public static ViaVersion5 getInstance() {
      return new ViaVersion5();
   }

   public void start() {
      if (System.getProperty("ViaVersion") != null) {
         this.field42213.cancelAllTasks();
      }

      if (this.field42213.getResourceManager().method21890()) {
         ViaVersion2.method18597();
      }

      Class9019.method33354();

      try {
         this.field42215.method20572();
      } catch (Exception var5) {
         this.field42213.getLogger().severe("ViaVersion failed to inject:");
         var5.printStackTrace();
         return;
      }

      System.setProperty("ViaVersion", this.field42213.getVersion());

      for (Runnable var4 : this.field42219) {
         var4.run();
      }

      this.field42219 = null;
      this.field42213.scheduleTaskWithDelay(this::method34415);
   }

   public void method34415() {
      try {
         Class9019.field41258 = ViaVerList.getVersionByNumber(this.field42215.method20574()).getVersionNumber();
      } catch (Exception var4) {
         this.field42213.getLogger().severe("ViaVersion failed to get the server protocol!");
         var4.printStackTrace();
      }

      if (Class9019.field41258 != -1) {
         this.field42213.getLogger().info("ViaVersion detected server version: " + ViaVerList.getVersionByNumber(Class9019.field41258));
         if (!Class9019.method33360() && !this.field42213.method27374()) {
            this.field42213.getLogger().warning("ViaVersion does not have any compatible versions for this server version!");
            this.field42213.getLogger().warning("Please remember that ViaVersion only adds support for versions newer than the server version.");
            this.field42213.getLogger().warning("If you need support for older versions you may need to use one or more ViaVersion addons too.");
            this.field42213.getLogger().warning("In that case please read the ViaVersion resource page carefully or use https://jo0001.github.io/ViaSetup");
            this.field42213.getLogger().warning("and if you're still unsure, feel free to join our Discord-Server for further assistance.");
         } else if (Class9019.field41258 == ViaVerList._1_8_x.getVersionNumber() && !this.field42213.method27374()) {
            this.field42213
               .getLogger()
               .warning(
                  "This version of Minecraft is over half a decade old and support for it will be fully dropped eventually. Please upgrade to a newer version to avoid encountering bugs and stability issues that have long been fixed."
               );
         }
      }

      Class9019.method33361();
      this.field42217.method34519();
      this.field42220 = ViaVersion3.method27613().scheduleTaskImmediately(() -> {
         if (Class9019.method33368()) {
            this.field42213.cancelTask(this.field42220);
            this.field42220 = null;
         }
      }, 10L);
      if (Class9019.field41258 < ViaVerList._1_9.getVersionNumber() && ViaVersion3.method27612().method21940()) {
         ViaVersion3.method27613().scheduleTaskImmediately(new Class697(), 1L);
      }

      if (Class9019.field41258 < ViaVerList._1_13.getVersionNumber() && ViaVersion3.method27612().method21930() > 0) {
         ViaVersion3.method27613().scheduleTaskImmediately(new Class1579(), 1L);
      }

      Class9019.method33358();
   }

   public void initialize() {
      this.field42213.getLogger().info("ViaVersion is disabling, if this is a reload and you experience issues consider rebooting.");

      try {
         this.field42215.method20573();
      } catch (Exception var4) {
         this.field42213.getLogger().severe("ViaVersion failed to uninject:");
         var4.printStackTrace();
      }

      this.field42217.method34520();
   }

   public Set<Class7161> method34417() {
      return this.field42213.getCustomCommandManager().method35203();
   }

   @Deprecated
   public Map<UUID, Class7161> method34418() {
      return this.method34419();
   }

   public Map<UUID, Class7161> method34419() {
      return this.field42213.getCustomCommandManager().method35200();
   }

   public UUID method34420(Class7161 var1) {
      return this.field42213.getCustomCommandManager().method35202(var1);
   }

   public boolean method34421(UUID var1) {
      return this.field42213.getCustomCommandManager().method35204(var1);
   }

   public void method34422(Class7161 var1) {
      this.field42213.getCustomCommandManager().method35197(var1);
   }

   public Class8006<?> method34423() {
      return this.field42213;
   }

   public ViaVersion6 method34424() {
      return this.field42214;
   }

   public boolean method34425() {
      return this.field42221;
   }

   public void method34426(boolean var1) {
      this.field42221 = var1;
   }

   public Class6749 method34427() {
      return this.field42215;
   }

   public Class7778 method34428() {
      return this.field42216;
   }

   public Class9213 method34429() {
      return this.field42217;
   }

   public Set<String> method34430() {
      return this.field42218;
   }

   @Nullable
   public Class7161 method34431(UUID var1) {
      return this.field42213.getCustomCommandManager().method35201(var1);
   }

   public void method34432(Runnable var1) {
      this.field42219.add(var1);
   }
}
