// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3314 extends Class3167
{
    public Class3314() {
        super(Class8013.field32988, "ChatFilter", "Bypasse chat filters");
    }
    
    @Class6753
    private void method10485(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4317) {
                final Class4317 class5722 = (Class4317)class5721.method16990();
                final String[] split = class5722.field19346.split(" ");
                if (class5722.field19346.length() + split.length <= 100) {
                    final StringBuilder sb = new StringBuilder();
                    int n = 0;
                    for (int i = 0; i < split.length; ++i) {
                        if (!split[i].startsWith("/")) {
                            if (split.length != 0) {
                                sb.append(" ");
                            }
                            sb.append(split[i].substring(0, 1) + "\uf8ff" + split[i].substring(1));
                        }
                        else {
                            sb.append(split[i]);
                            n = ((!split[i].equals("/r") && !split[i].equals("/msg")) ? 1 : 0);
                        }
                    }
                    if (n == 0) {
                        class5722.field19346 = sb.toString();
                    }
                }
            }
        }
    }
}
