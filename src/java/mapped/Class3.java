// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;
import java.util.List;
import java.lang.reflect.InvocationHandler;

public class Class3 implements InvocationHandler
{
    private final List<String> field3;
    public boolean field4;
    public String field5;
    
    public Class3(final List<String> field3) {
        this.field3 = field3;
    }
    
    @Override
    public Object invoke(final Object o, final Method method, Object[] field30541) throws Throwable {
        final String name = method.getName();
        final Class<?> returnType = method.getReturnType();
        if (field30541 == null) {
            field30541 = Class7690.field30541;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.field4 = true;
            return null;
        }
        if (name.equals("protocols") && field30541.length == 0) {
            return this.field3;
        }
        if (name.equals("selectProtocol") || name.equals("select")) {
            if (String.class == returnType) {
                if (field30541.length == 1) {
                    if (field30541[0] instanceof List) {
                        final List list = (List)field30541[0];
                        for (int i = 0; i < list.size(); ++i) {
                            if (this.field3.contains(list.get(i))) {
                                return this.field5 = (String)list.get(i);
                            }
                        }
                        return this.field5 = this.field3.get(0);
                    }
                }
            }
        }
        if (name.equals("protocolSelected") || name.equals("selected")) {
            if (field30541.length == 1) {
                this.field5 = (String)field30541[0];
                return null;
            }
        }
        return method.invoke(this, field30541);
    }
}
