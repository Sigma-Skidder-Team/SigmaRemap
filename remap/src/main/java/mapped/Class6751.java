// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Deprecated
public @interface Class6751 {
    String method20566() default "";
    
    double method20567() default 0.0;
    
    double method20568() default Double.MAX_VALUE;
}
