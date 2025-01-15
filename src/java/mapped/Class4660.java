// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4660 implements Class4659
{
    public final /* synthetic */ Class9198 field20166;
    
    public Class4660(final Class9198 field20166) {
        this.field20166 = field20166;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Class4405 class4405 = (Class4405)array[0];
        if (class4405.method13269("messageId")) {
            final Class4405 class4406 = new Class4405();
            class4406.method13301("messageId", class4405.method13268("messageId"));
            Class9198.method33666(this.field20166).method14942("message-received", class4406);
            this.field20166.field38990.method33644(class4405.method13268("senderId"), class4405.method13268("message"), class4405.method13265("timestamp"));
        }
    }
}
