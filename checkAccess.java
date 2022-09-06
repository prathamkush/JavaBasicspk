import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class checkAccess {
    public static void main(String[] args) {
        AccessSpecifiers obj = new AccessSpecifiers();
        obj.add();
        System.out.println(obj.a);
    }
}

// default -> only valid and can be called inside the same package
// public -> can be called across differnet packages
// private -> in t