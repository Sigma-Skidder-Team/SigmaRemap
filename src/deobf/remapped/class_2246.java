package remapped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Deprecated
public @interface class_2246 {
   String method_10327() default "";

   double method_10325() default 0.0;

   double method_10326() default Double.MAX_VALUE;
}
