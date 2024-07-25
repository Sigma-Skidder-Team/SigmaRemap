package remapped;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class class_7116 implements DynamicMBean {
   private static final Logger field_36692 = LogManager.getLogger();
   private final class_341 field_36691;
   private final MBeanInfo field_36695;
   private final Map<String, class_8250> field_36693 = Stream.<class_8250>of(
         new class_8250("tickTimes", this::method_32714, "Historical tick times (ms)", long[].class, null),
         new class_8250("averageTickTime", this::method_32715, "Current average tick time (ms)", long.class, null)
      )
      .collect(Collectors.toMap(var0 -> class_8250.method_37798(var0), Function.<class_8250>identity()));

   private class_7116(class_341 var1) {
      this.field_36691 = var1;
      MBeanAttributeInfo[] var4 = this.field_36693
         .values()
         .stream()
         .<MBeanAttributeInfo>map(var0 -> class_8250.method_37800(var0))
         .<MBeanAttributeInfo>toArray(MBeanAttributeInfo[]::new);
      this.field_36695 = new MBeanInfo(
         class_7116.class.getSimpleName(),
         "metrics for dedicated server",
         var4,
         (MBeanConstructorInfo[])null,
         (MBeanOperationInfo[])null,
         new MBeanNotificationInfo[0]
      );
   }

   public static void method_32712(class_341 var0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new class_7116(var0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException | InstanceAlreadyExistsException var4) {
         field_36692.warn("Failed to initialise server as JMX bean", var4);
      }
   }

   private float method_32715() {
      return this.field_36691.method_1733();
   }

   private long[] method_32714() {
      return this.field_36691.field_1286;
   }

   @Nullable
   @Override
   public Object getAttribute(String var1) {
      class_8250 var4 = this.field_36693.get(var1);
      return var4 != null ? class_8250.method_37799(var4).get() : null;
   }

   @Override
   public void setAttribute(Attribute var1) {
   }

   @Override
   public AttributeList getAttributes(String[] var1) {
      List var4 = Arrays.<String>stream(var1)
         .<class_8250>map(this.field_36693::get)
         .filter(Objects::nonNull)
         .<Attribute>map(var0 -> new Attribute(class_8250.method_37798(var0), class_8250.method_37799(var0).get()))
         .collect(Collectors.toList());
      return new AttributeList(var4);
   }

   @Override
   public AttributeList setAttributes(AttributeList var1) {
      return new AttributeList();
   }

   @Nullable
   @Override
   public Object invoke(String var1, Object[] var2, String[] var3) {
      return null;
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.field_36695;
   }
}
