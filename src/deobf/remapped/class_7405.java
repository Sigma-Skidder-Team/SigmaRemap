package remapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class class_7405 {
   private final class_7642<?> field_37797;
   private final class_5368 field_37794 = new class_5368();
   private final class_907 field_37799;
   private final class_7396 field_37793;
   private final class_9455 field_37798;
   private final Set<String> field_37800 = new HashSet<String>();
   private List<Runnable> field_37802 = new ArrayList<Runnable>();
   private class_6536 field_37795;
   private boolean field_37796;

   public class_7405(class_7642<?> var1, class_907 var2, class_7396 var3, class_9455 var4) {
      this.field_37797 = var1;
      this.field_37799 = var2;
      this.field_37793 = var3;
      this.field_37798 = var4;
   }

   public static class_9711 method_33723() {
      return new class_9711();
   }

   public void method_33735() {
      if (System.getProperty("ViaVersion") != null) {
         this.field_37797.method_34622();
      }

      if (this.field_37797.method_34626().method_25841()) {
         class_418.method_2083();
      }

      class_6710.method_30788();

      try {
         this.field_37799.method_3878();
      } catch (Exception var5) {
         this.field_37797.method_34617().severe("ViaVersion failed to inject:");
         var5.printStackTrace();
         return;
      }

      System.setProperty("ViaVersion", this.field_37797.method_34619());

      for (Runnable var4 : this.field_37802) {
         var4.run();
      }

      this.field_37802 = null;
      this.field_37797.method_34633(this::method_33740);
   }

   public void method_33740() {
      try {
         class_6710.field_34660 = class_412.method_2051(this.field_37799.method_3880()).method_2056();
      } catch (Exception var4) {
         this.field_37797.method_34617().severe("ViaVersion failed to get the server protocol!");
         var4.printStackTrace();
      }

      if (class_6710.field_34660 != -1) {
         this.field_37797.method_34617().info("ViaVersion detected server version: " + class_412.method_2051(class_6710.field_34660));
         if (!class_6710.method_30780() && !this.field_37797.method_34630()) {
            this.field_37797.method_34617().warning("ViaVersion does not have any compatible versions for this server version!");
            this.field_37797.method_34617().warning("Please remember that ViaVersion only adds support for versions newer than the server version.");
            this.field_37797.method_34617().warning("If you need support for older versions you may need to use one or more ViaVersion addons too.");
            this.field_37797.method_34617().warning("In that case please read the ViaVersion resource page carefully or use https://jo0001.github.io/ViaSetup");
            this.field_37797.method_34617().warning("and if you're still unsure, feel free to join our Discord-Server for further assistance.");
         } else if (class_6710.field_34660 == class_412.field_1747.method_2056() && !this.field_37797.method_34630()) {
            this.field_37797
               .method_34617()
               .warning(
                  "This version of Minecraft is over half a decade old and support for it will be fully dropped eventually. Please upgrade to a newer version to avoid encountering bugs and stability issues that have long been fixed."
               );
         }
      }

      class_6710.method_30784();
      this.field_37798.method_43724();
      this.field_37795 = class_3446.method_15886().method_34631(() -> {
         if (class_6710.method_30775()) {
            this.field_37797.method_34625(this.field_37795);
            this.field_37795 = null;
         }
      }, 10L);
      if (class_6710.field_34660 < class_412.field_1724.method_2056() && class_3446.method_15884().method_25817()) {
         class_3446.method_15886().method_34631(new class_3387(), 1L);
      }

      if (class_6710.field_34660 < class_412.field_1751.method_2056() && class_3446.method_15884().method_25851() > 0) {
         class_3446.method_15886().method_34631(new class_8708(), 1L);
      }

      class_6710.method_30774();
   }

   public void method_33734() {
      this.field_37797.method_34617().info("ViaVersion is disabling, if this is a reload and you experience issues consider rebooting.");

      try {
         this.field_37799.method_3879();
      } catch (Exception var4) {
         this.field_37797.method_34617().severe("ViaVersion failed to uninject:");
         var4.printStackTrace();
      }

      this.field_37798.method_43725();
   }

   public Set<class_1455> method_33726() {
      return this.field_37797.method_34636().method_35829();
   }

   @Deprecated
   public Map<UUID, class_1455> method_33733() {
      return this.method_33742();
   }

   public Map<UUID, class_1455> method_33742() {
      return this.field_37797.method_34636().method_35828();
   }

   public UUID method_33732(class_1455 var1) {
      return this.field_37797.method_34636().method_35831(var1);
   }

   public boolean method_33741(UUID var1) {
      return this.field_37797.method_34636().method_35830(var1);
   }

   public void method_33725(class_1455 var1) {
      this.field_37797.method_34636().method_35825(var1);
   }

   public class_7642<?> method_33737() {
      return this.field_37797;
   }

   public class_5368 method_33743() {
      return this.field_37794;
   }

   public boolean method_33731() {
      return this.field_37796;
   }

   public void method_33724(boolean var1) {
      this.field_37796 = var1;
   }

   public class_907 method_33738() {
      return this.field_37799;
   }

   public class_7396 method_33728() {
      return this.field_37793;
   }

   public class_9455 method_33727() {
      return this.field_37798;
   }

   public Set<String> method_33729() {
      return this.field_37800;
   }

   @Nullable
   public class_1455 method_33736(UUID var1) {
      return this.field_37797.method_34636().method_35826(var1);
   }

   public void method_33739(Runnable var1) {
      this.field_37802.add(var1);
   }
}
