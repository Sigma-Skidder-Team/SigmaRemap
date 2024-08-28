package mapped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Deprecated
public @interface Class5640 {
   String method17771() default "";

   double method17772() default 0.0;

   double method17773() default Double.MAX_VALUE;
}
