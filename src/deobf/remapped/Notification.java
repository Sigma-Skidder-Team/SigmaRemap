package remapped;

import java.awt.Color;

public class Notification {
   private static String[] field_42294;
   public static final int field_42298 = 3;
   public static final int field_42300 = 4000;
   public String field_42295;
   public String field_42299;
   public class_8343 field_42301;
   public int field_42296;
   public Timer field_42297 = new Timer();
   public Color[] field_42293 = new Color[3];
   public Color[] field_42292 = new Color[3];
   public int field_42291 = 0;

   public Notification(String var1, String var2, int var3, class_8343 var4) {
      this.field_42295 = var1;
      this.field_42299 = var2;
      this.field_42301 = var4;
      this.field_42296 = var3;
      this.field_42297.method_14776();
   }

   public Notification(String var1, String var2, class_8343 var3) {
      this(var1, var2, 4000, var3);
   }

   public Notification(String var1, String var2, int var3) {
      this(var1, var2, var3, NotificationIcons.field_11050);
   }

   public Notification(String var1, String var2) {
      this(var1, var2, 4000);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Notification && ((Notification)var1).field_42295.equals(this.field_42295);
   }
}
